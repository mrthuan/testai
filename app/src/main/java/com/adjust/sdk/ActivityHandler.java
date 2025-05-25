package com.adjust.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.adjust.sdk.network.ActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ActivityHandler implements IActivityHandler {
    private static final String ACTIVITY_STATE_NAME = "Activity state";
    private static final String ATTRIBUTION_NAME = "Attribution";
    private static long BACKGROUND_TIMER_INTERVAL = 0;
    private static final String BACKGROUND_TIMER_NAME = "Background timer";
    private static final String DELAY_START_TIMER_NAME = "Delay Start timer";
    private static long FOREGROUND_TIMER_INTERVAL = 0;
    private static final String FOREGROUND_TIMER_NAME = "Foreground timer";
    private static long FOREGROUND_TIMER_START = 0;
    private static final String SESSION_CALLBACK_PARAMETERS_NAME = "Session Callback parameters";
    private static long SESSION_INTERVAL = 0;
    private static final String SESSION_PARAMETERS_NAME = "Session parameters";
    private static final String SESSION_PARTNER_PARAMETERS_NAME = "Session Partner parameters";
    private static long SUBSESSION_INTERVAL = 0;
    private static final String TIME_TRAVEL = "Time travel!";
    private ActivityState activityState;
    private AdjustConfig adjustConfig;
    private AdjustAttribution attribution;
    private IAttributionHandler attributionHandler;
    private TimerOnce backgroundTimer;
    private String basePath;
    private OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private TimerOnce delayStartTimer;
    private DeviceInfo deviceInfo;
    private ThreadExecutor executor;
    private TimerCycle foregroundTimer;
    private String gdprPath;
    private InstallReferrer installReferrer;
    private InstallReferrerHuawei installReferrerHuawei;
    private InstallReferrerMeta installReferrerMeta;
    private InternalState internalState;
    private ILogger logger;
    private IPackageHandler packageHandler;
    private IPurchaseVerificationHandler purchaseVerificationHandler;
    private ISdkClickHandler sdkClickHandler;
    private SessionParameters sessionParameters;
    private String subscriptionPath;

    /* loaded from: classes.dex */
    public class InternalState {
        boolean background;
        boolean delayStart;
        boolean enabled;
        boolean firstLaunch;
        boolean firstSdkStart;
        boolean offline;
        boolean preinstallHasBeenRead;
        boolean sessionResponseProcessed;
        boolean updatePackages;

        public InternalState() {
        }

        public boolean hasFirstSdkStartNotOcurred() {
            return !this.firstSdkStart;
        }

        public boolean hasFirstSdkStartOcurred() {
            return this.firstSdkStart;
        }

        public boolean hasPreinstallBeenRead() {
            return this.preinstallHasBeenRead;
        }

        public boolean hasSessionResponseNotBeenProcessed() {
            return !this.sessionResponseProcessed;
        }

        public boolean isDisabled() {
            return !this.enabled;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isFirstLaunch() {
            return this.firstLaunch;
        }

        public boolean isInBackground() {
            return this.background;
        }

        public boolean isInDelayedStart() {
            return this.delayStart;
        }

        public boolean isInForeground() {
            return !this.background;
        }

        public boolean isNotFirstLaunch() {
            return !this.firstLaunch;
        }

        public boolean isNotInDelayedStart() {
            return !this.delayStart;
        }

        public boolean isOffline() {
            return this.offline;
        }

        public boolean isOnline() {
            return !this.offline;
        }

        public boolean itHasToUpdatePackages() {
            return this.updatePackages;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendReftagReferrerI();
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements Runnable {
        public a0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.foregroundTimerFiredI();
        }
    }

    /* loaded from: classes.dex */
    public class a1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f5767a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f5768b;

        public a1(Uri uri, long j10) {
            this.f5767a = uri;
            this.f5768b = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.readOpenUrlI(this.f5767a, this.f5768b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendPreinstallReferrerI();
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements Runnable {
        public b0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.backgroundTimerFiredI();
        }
    }

    /* loaded from: classes.dex */
    public class b1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5771a;

        public b1(boolean z10) {
            this.f5771a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.setAskingAttributionI(this.f5771a);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ReferrerDetails f5773a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f5774b;

        public c(ReferrerDetails referrerDetails, String str) {
            this.f5773a = referrerDetails;
            this.f5774b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendInstallReferrerI(this.f5773a, this.f5774b);
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdjustPurchase f5775a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ OnPurchaseVerificationFinishedListener f5776b;

        public c0(AdjustPurchase adjustPurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
            this.f5775a = adjustPurchase;
            this.f5776b = onPurchaseVerificationFinishedListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.verifyPurchaseI(this.f5775a, this.f5776b);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EventResponseData f5777a;

        public d(EventResponseData eventResponseData) {
            this.f5777a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchEventResponseTasksI(this.f5777a);
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements IRunActivityHandler {
        public d0() {
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.setEnabledI(ActivityHandler.this.adjustConfig.startEnabled.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SdkClickResponseData f5780a;

        public e(SdkClickResponseData sdkClickResponseData) {
            this.f5780a = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchSdkClickResponseTasksI(this.f5780a);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements Runnable {
        public e0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.foregroundTimerFired();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SessionResponseData f5783a;

        public f(SessionResponseData sessionResponseData) {
            this.f5783a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchSessionResponseTasksI(this.f5783a);
        }
    }

    /* loaded from: classes.dex */
    public class f0 implements Runnable {
        public f0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.backgroundTimerFired();
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AttributionResponseData f5786a;

        public g(AttributionResponseData attributionResponseData) {
            this.f5786a = attributionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchAttributionResponseTasksI(this.f5786a);
        }
    }

    /* loaded from: classes.dex */
    public class g0 implements Runnable {
        public g0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.stopForegroundTimerI();
            ActivityHandler.this.startBackgroundTimerI();
            ActivityHandler.this.logger.verbose("Subsession end", new Object[0]);
            ActivityHandler.this.endI();
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PurchaseVerificationResponseData f5789a;

        public h(PurchaseVerificationResponseData purchaseVerificationResponseData) {
            this.f5789a = purchaseVerificationResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchPurchaseVerificationResponseTasksI(this.f5789a);
        }
    }

    /* loaded from: classes.dex */
    public class h0 implements Runnable {
        public h0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendFirstPackages();
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendFirstPackagesI();
        }
    }

    /* loaded from: classes.dex */
    public class i0 implements InstallReferrerReadListener {
        public i0() {
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
            ActivityHandler.this.sendInstallReferrer(referrerDetails, str);
        }
    }

    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5794a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f5795b;

        public j(String str, String str2) {
            this.f5794a = str;
            this.f5795b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.addSessionCallbackParameterI(this.f5794a, this.f5795b);
        }
    }

    /* loaded from: classes.dex */
    public class j0 implements InstallReferrerReadListener {
        public j0() {
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
            ActivityHandler.this.sendInstallReferrer(referrerDetails, str);
        }
    }

    /* loaded from: classes.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.initI();
        }
    }

    /* loaded from: classes.dex */
    public class k0 implements InstallReferrerReadListener {
        public k0() {
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
            ActivityHandler.this.sendInstallReferrer(referrerDetails, str);
        }
    }

    /* loaded from: classes.dex */
    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5799a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f5800b;

        public l(String str, String str2) {
            this.f5799a = str;
            this.f5800b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.addSessionPartnerParameterI(this.f5799a, this.f5800b);
        }
    }

    /* loaded from: classes.dex */
    public class l0 implements Runnable {
        public l0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (samsungReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
            }
        }
    }

    /* loaded from: classes.dex */
    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5802a;

        public m(String str) {
            this.f5802a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.removeSessionCallbackParameterI(this.f5802a);
        }
    }

    /* loaded from: classes.dex */
    public class m0 implements Runnable {
        public m0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (xiaomiReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
            }
        }
    }

    /* loaded from: classes.dex */
    public class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5805a;

        public n(String str) {
            this.f5805a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.removeSessionPartnerParameterI(this.f5805a);
        }
    }

    /* loaded from: classes.dex */
    public class n0 implements Runnable {
        public n0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (vivoReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.resetSessionCallbackParametersI();
        }
    }

    /* loaded from: classes.dex */
    public class o0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EventResponseData f5809a;

        public o0(EventResponseData eventResponseData) {
            this.f5809a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener.onFinishedEventTrackingSucceeded(this.f5809a.getSuccessResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.resetSessionPartnerParametersI();
        }
    }

    /* loaded from: classes.dex */
    public class p0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EventResponseData f5812a;

        public p0(EventResponseData eventResponseData) {
            this.f5812a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onEventTrackingFailedListener.onFinishedEventTrackingFailed(this.f5812a.getFailureResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5814a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f5815b;

        public q(boolean z10, String str) {
            this.f5814a = z10;
            this.f5815b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f5814a) {
                SharedPreferencesManager.getDefaultInstance(ActivityHandler.this.getContext()).savePushToken(this.f5815b);
            }
            if (!ActivityHandler.this.internalState.hasFirstSdkStartNotOcurred()) {
                ActivityHandler.this.setPushTokenI(this.f5815b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class q0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnDeeplinkResolvedListener f5816a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SdkClickResponseData f5817b;

        public q0(OnDeeplinkResolvedListener onDeeplinkResolvedListener, SdkClickResponseData sdkClickResponseData) {
            this.f5816a = onDeeplinkResolvedListener;
            this.f5817b = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5816a.onDeeplinkResolved(this.f5817b.resolvedDeeplink);
        }
    }

    /* loaded from: classes.dex */
    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.gdprForgetMeI();
        }
    }

    /* loaded from: classes.dex */
    public class r0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdjustEvent f5819a;

        public r0(AdjustEvent adjustEvent) {
            this.f5819a = adjustEvent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.internalState.hasFirstSdkStartNotOcurred()) {
                ActivityHandler.this.logger.warn("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
                ActivityHandler.this.startI();
            }
            ActivityHandler.this.trackEventI(this.f5819a);
        }
    }

    /* loaded from: classes.dex */
    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.disableThirdPartySharingI();
        }
    }

    /* loaded from: classes.dex */
    public class s0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SessionResponseData f5822a;

        public s0(SessionResponseData sessionResponseData) {
            this.f5822a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener.onFinishedSessionTrackingSucceeded(this.f5822a.getSuccessResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdjustThirdPartySharing f5824a;

        public t(AdjustThirdPartySharing adjustThirdPartySharing) {
            this.f5824a = adjustThirdPartySharing;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackThirdPartySharingI(this.f5824a);
        }
    }

    /* loaded from: classes.dex */
    public class t0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SessionResponseData f5826a;

        public t0(SessionResponseData sessionResponseData) {
            this.f5826a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener.onFinishedSessionTrackingFailed(this.f5826a.getFailureResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5828a;

        public u(boolean z10) {
            this.f5828a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackMeasurementConsentI(this.f5828a);
        }
    }

    /* loaded from: classes.dex */
    public class u0 implements Runnable {
        public u0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onAttributionChangedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onAttributionChangedListener.onAttributionChanged(ActivityHandler.this.attribution);
        }
    }

    /* loaded from: classes.dex */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.delayStartI();
            ActivityHandler.this.stopBackgroundTimerI();
            ActivityHandler.this.startForegroundTimerI();
            ActivityHandler.this.logger.verbose("Subsession start", new Object[0]);
            ActivityHandler.this.startI();
        }
    }

    /* loaded from: classes.dex */
    public class v0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PurchaseVerificationResponseData f5832a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdjustPurchaseVerificationResult f5833b;

        public v0(PurchaseVerificationResponseData purchaseVerificationResponseData, AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
            this.f5832a = purchaseVerificationResponseData;
            this.f5833b = adjustPurchaseVerificationResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5832a.activityPackage.getPurchaseVerificationCallback().onVerificationFinished(this.f5833b);
        }
    }

    /* loaded from: classes.dex */
    public class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5834a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ JSONObject f5835b;

        public w(String str, JSONObject jSONObject) {
            this.f5834a = str;
            this.f5835b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackAdRevenueI(this.f5834a, this.f5835b);
        }
    }

    /* loaded from: classes.dex */
    public class w0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f5836a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Intent f5837b;

        public w0(Intent intent, Uri uri) {
            this.f5836a = uri;
            this.f5837b = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            if (ActivityHandler.this.adjustConfig == null) {
                return;
            }
            if (ActivityHandler.this.adjustConfig.onDeeplinkResponseListener != null) {
                z10 = ActivityHandler.this.adjustConfig.onDeeplinkResponseListener.launchReceivedDeeplink(this.f5836a);
            } else {
                z10 = true;
            }
            if (z10) {
                ActivityHandler.this.launchDeeplinkMain(this.f5837b, this.f5836a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdjustAdRevenue f5838a;

        public x(AdjustAdRevenue adjustAdRevenue) {
            this.f5838a = adjustAdRevenue;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackAdRevenueI(this.f5838a);
        }
    }

    /* loaded from: classes.dex */
    public class x0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5840a;

        public x0(boolean z10) {
            this.f5840a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.setEnabledI(this.f5840a);
        }
    }

    /* loaded from: classes.dex */
    public class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdjustPlayStoreSubscription f5842a;

        public y(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
            this.f5842a = adjustPlayStoreSubscription;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackSubscriptionI(this.f5842a);
        }
    }

    /* loaded from: classes.dex */
    public class y0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5844a;

        public y0(boolean z10) {
            this.f5844a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.setOfflineModeI(this.f5844a);
        }
    }

    /* loaded from: classes.dex */
    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.gotOptOutResponseI();
        }
    }

    /* loaded from: classes.dex */
    public class z0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f5847a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f5848b;

        public z0(Uri uri, long j10) {
            this.f5847a = uri;
            this.f5848b = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.readOpenUrlI(this.f5847a, this.f5848b);
        }
    }

    private ActivityHandler(AdjustConfig adjustConfig) {
        boolean z10;
        init(adjustConfig);
        ILogger logger = AdjustFactory.getLogger();
        this.logger = logger;
        logger.lockLogLevel();
        this.executor = new SingleThreadCachedScheduler("ActivityHandler");
        InternalState internalState = new InternalState();
        this.internalState = internalState;
        Boolean bool = adjustConfig.startEnabled;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = true;
        }
        internalState.enabled = z10;
        InternalState internalState2 = this.internalState;
        internalState2.offline = adjustConfig.startOffline;
        internalState2.background = true;
        internalState2.delayStart = false;
        internalState2.updatePackages = false;
        internalState2.sessionResponseProcessed = false;
        internalState2.firstSdkStart = false;
        internalState2.preinstallHasBeenRead = false;
        this.executor.submit(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void backgroundTimerFiredI() {
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private boolean checkActivityStateI(ActivityState activityState) {
        if (this.internalState.hasFirstSdkStartNotOcurred()) {
            this.logger.error("Sdk did not yet start", new Object[0]);
            return false;
        }
        return true;
    }

    private boolean checkAdjustAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (adjustAdRevenue == null) {
            this.logger.error("Ad revenue object missing", new Object[0]);
            return false;
        } else if (!adjustAdRevenue.isValid()) {
            this.logger.error("Ad revenue object not initialized correctly", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    private void checkAfterNewStartI() {
        checkAfterNewStartI(SharedPreferencesManager.getDefaultInstance(getContext()));
    }

    private void checkAttributionStateI() {
        if (!checkActivityStateI(this.activityState)) {
            return;
        }
        if (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed()) {
            return;
        }
        if (this.attribution != null && !this.activityState.askingAttribution) {
            return;
        }
        this.attributionHandler.getAttribution();
    }

    private boolean checkEventI(AdjustEvent adjustEvent) {
        if (adjustEvent == null) {
            this.logger.error("Event missing", new Object[0]);
            return false;
        } else if (!adjustEvent.isValid()) {
            this.logger.error("Event not initialized correctly", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    private void checkForInstallReferrerInfo(SdkClickResponseData sdkClickResponseData) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!sdkClickResponseData.isInstallReferrer) {
            return;
        }
        String str = sdkClickResponseData.referrerApi;
        boolean z15 = true;
        if (str != null && str.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_ADS)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ActivityState activityState = this.activityState;
            activityState.clickTimeHuawei = sdkClickResponseData.clickTime;
            activityState.installBeginHuawei = sdkClickResponseData.installBegin;
            activityState.installReferrerHuawei = sdkClickResponseData.installReferrer;
        } else {
            String str2 = sdkClickResponseData.referrerApi;
            if (str2 != null && str2.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ActivityState activityState2 = this.activityState;
                activityState2.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState2.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState2.installReferrerHuaweiAppGallery = sdkClickResponseData.installReferrer;
            } else {
                String str3 = sdkClickResponseData.referrerApi;
                if (str3 != null && str3.equalsIgnoreCase(Constants.REFERRER_API_META)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    ActivityState activityState3 = this.activityState;
                    activityState3.clickTimeMeta = sdkClickResponseData.clickTime;
                    activityState3.installReferrerMeta = sdkClickResponseData.installReferrer;
                    activityState3.isClickMeta = sdkClickResponseData.isClick;
                } else {
                    String str4 = sdkClickResponseData.referrerApi;
                    if (str4 != null && str4.equalsIgnoreCase(Constants.REFERRER_API_SAMSUNG)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        ActivityState activityState4 = this.activityState;
                        activityState4.clickTimeSamsung = sdkClickResponseData.clickTime;
                        activityState4.installBeginSamsung = sdkClickResponseData.installBegin;
                        activityState4.installReferrerSamsung = sdkClickResponseData.installReferrer;
                    } else {
                        String str5 = sdkClickResponseData.referrerApi;
                        if (str5 != null && str5.equalsIgnoreCase(Constants.REFERRER_API_XIAOMI)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            ActivityState activityState5 = this.activityState;
                            activityState5.clickTimeXiaomi = sdkClickResponseData.clickTime;
                            activityState5.installBeginXiaomi = sdkClickResponseData.installBegin;
                            activityState5.installReferrerXiaomi = sdkClickResponseData.installReferrer;
                            activityState5.clickTimeServerXiaomi = sdkClickResponseData.clickTimeServer;
                            activityState5.installBeginServerXiaomi = sdkClickResponseData.installBeginServer;
                            activityState5.installVersionXiaomi = sdkClickResponseData.installVersion;
                        } else {
                            String str6 = sdkClickResponseData.referrerApi;
                            if (str6 == null || !str6.equalsIgnoreCase(Constants.REFERRER_API_VIVO)) {
                                z15 = false;
                            }
                            ActivityState activityState6 = this.activityState;
                            if (z15) {
                                activityState6.clickTimeVivo = sdkClickResponseData.clickTime;
                                activityState6.installBeginVivo = sdkClickResponseData.installBegin;
                                activityState6.installReferrerVivo = sdkClickResponseData.installReferrer;
                                activityState6.installVersionVivo = sdkClickResponseData.installVersion;
                            } else {
                                activityState6.clickTime = sdkClickResponseData.clickTime;
                                activityState6.installBegin = sdkClickResponseData.installBegin;
                                activityState6.installReferrer = sdkClickResponseData.installReferrer;
                                activityState6.clickTimeServer = sdkClickResponseData.clickTimeServer;
                                activityState6.installBeginServer = sdkClickResponseData.installBeginServer;
                                activityState6.installVersion = sdkClickResponseData.installVersion;
                                activityState6.googlePlayInstant = sdkClickResponseData.googlePlayInstant;
                            }
                        }
                    }
                }
            }
        }
        writeActivityStateI();
    }

    private void checkForPreinstallI() {
        ActivityState activityState = this.activityState;
        if (activityState == null || !activityState.enabled || activityState.isGdprForgotten) {
            return;
        }
        sendPreinstallReferrerI();
        if (!this.adjustConfig.preinstallTrackingEnabled || this.internalState.hasPreinstallBeenRead()) {
            return;
        }
        String str = this.deviceInfo.packageName;
        if (str != null && !str.isEmpty()) {
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            long preinstallPayloadReadStatus = defaultInstance.getPreinstallPayloadReadStatus();
            if (PreinstallUtil.hasAllLocationsBeenRead(preinstallPayloadReadStatus)) {
                this.internalState.preinstallHasBeenRead = true;
                return;
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus)) {
                String payloadFromSystemProperty = PreinstallUtil.getPayloadFromSystemProperty(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemProperty != null && !payloadFromSystemProperty.isEmpty()) {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemProperty, Constants.SYSTEM_PROPERTIES);
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyReflection = PreinstallUtil.getPayloadFromSystemPropertyReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyReflection != null && !payloadFromSystemPropertyReflection.isEmpty()) {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyReflection, Constants.SYSTEM_PROPERTIES_REFLECTION);
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePath = PreinstallUtil.getPayloadFromSystemPropertyFilePath(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePath != null && !payloadFromSystemPropertyFilePath.isEmpty()) {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePath, Constants.SYSTEM_PROPERTIES_PATH);
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePathReflection = PreinstallUtil.getPayloadFromSystemPropertyFilePathReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePathReflection != null && !payloadFromSystemPropertyFilePathReflection.isEmpty()) {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePathReflection, Constants.SYSTEM_PROPERTIES_PATH_REFLECTION);
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus)) {
                String payloadFromContentProviderDefault = PreinstallUtil.getPayloadFromContentProviderDefault(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadFromContentProviderDefault != null && !payloadFromContentProviderDefault.isEmpty()) {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromContentProviderDefault, Constants.CONTENT_PROVIDER);
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderIntentAction = PreinstallUtil.getPayloadsFromContentProviderIntentAction(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderIntentAction != null && !payloadsFromContentProviderIntentAction.isEmpty()) {
                    for (String str2 : payloadsFromContentProviderIntentAction) {
                        this.sdkClickHandler.sendPreinstallPayload(str2, Constants.CONTENT_PROVIDER_INTENT_ACTION);
                    }
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderNoPermission = PreinstallUtil.getPayloadsFromContentProviderNoPermission(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderNoPermission != null && !payloadsFromContentProviderNoPermission.isEmpty()) {
                    for (String str3 : payloadsFromContentProviderNoPermission) {
                        this.sdkClickHandler.sendPreinstallPayload(str3, Constants.CONTENT_PROVIDER_NO_PERMISSION);
                    }
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus)) {
                String payloadFromFileSystem = PreinstallUtil.getPayloadFromFileSystem(this.deviceInfo.packageName, this.adjustConfig.preinstallFilePath, this.logger);
                if (payloadFromFileSystem != null && !payloadFromFileSystem.isEmpty()) {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromFileSystem, Constants.FILE_SYSTEM);
                } else {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus);
                }
            }
            defaultInstance.setPreinstallPayloadReadStatus(preinstallPayloadReadStatus);
            this.internalState.preinstallHasBeenRead = true;
            return;
        }
        this.logger.debug("Can't read preinstall payload, invalid package name", new Object[0]);
    }

    private boolean checkOrderIdI(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.activityState.findOrderId(str)) {
                this.logger.info("Skipping duplicated order ID '%s'", str);
                return false;
            }
            this.activityState.addOrderId(str);
            this.logger.verbose("Added order ID '%s'", str);
        }
        return true;
    }

    private Intent createDeeplinkIntentI(Uri uri) {
        Intent intent;
        if (this.adjustConfig.deepLinkComponent == null) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            AdjustConfig adjustConfig = this.adjustConfig;
            intent = new Intent("android.intent.action.VIEW", uri, adjustConfig.context, adjustConfig.deepLinkComponent);
        }
        intent.setFlags(268435456);
        intent.setPackage(this.adjustConfig.context.getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayStartI() {
        double d10;
        if (this.internalState.isNotInDelayedStart() || isToUpdatePackagesI()) {
            return;
        }
        Double d11 = this.adjustConfig.delayStart;
        if (d11 != null) {
            d10 = d11.doubleValue();
        } else {
            d10 = 0.0d;
        }
        long maxDelayStart = AdjustFactory.getMaxDelayStart();
        long j10 = (long) (1000.0d * d10);
        if (j10 > maxDelayStart) {
            double d12 = maxDelayStart / 1000;
            DecimalFormat decimalFormat = Util.SecondsDisplayFormat;
            this.logger.warn("Delay start of %s seconds bigger than max allowed value of %s seconds", decimalFormat.format(d10), decimalFormat.format(d12));
            d10 = d12;
        } else {
            maxDelayStart = j10;
        }
        this.logger.info("Waiting %s seconds before starting first session", Util.SecondsDisplayFormat.format(d10));
        this.delayStartTimer.startIn(maxDelayStart);
        this.internalState.updatePackages = true;
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.updatePackages = true;
            writeActivityStateI();
        }
    }

    public static boolean deleteActivityState(Context context) {
        return context.deleteFile(Constants.ACTIVITY_STATE_FILENAME);
    }

    public static boolean deleteAttribution(Context context) {
        return context.deleteFile(Constants.ATTRIBUTION_FILENAME);
    }

    public static boolean deleteSessionCallbackParameters(Context context) {
        return context.deleteFile(Constants.SESSION_CALLBACK_PARAMETERS_FILENAME);
    }

    public static boolean deleteSessionPartnerParameters(Context context) {
        return context.deleteFile(Constants.SESSION_PARTNER_PARAMETERS_FILENAME);
    }

    public static void deleteState(Context context) {
        deleteActivityState(context);
        deleteAttribution(context);
        deleteSessionCallbackParameters(context);
        deleteSessionPartnerParameters(context);
        SharedPreferencesManager.getDefaultInstance(context).clear();
    }

    private void disableThirdPartySharingForCoppaEnabledI() {
        if (!shouldDisableThirdPartySharingWhenCoppaEnabled()) {
            return;
        }
        this.activityState.isThirdPartySharingDisabledForCoppa = true;
        writeActivityStateI();
        AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing(Boolean.FALSE);
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        ActivityPackage buildThirdPartySharingPackage = packageBuilder.buildThirdPartySharingPackage(adjustThirdPartySharing);
        this.packageHandler.addPackage(buildThirdPartySharingPackage);
        if (this.adjustConfig.eventBufferingEnabled) {
            this.logger.info("Buffered event %s", buildThirdPartySharingPackage.getSuffix());
        } else {
            this.packageHandler.sendFirstPackage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disableThirdPartySharingI() {
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
        defaultInstance.setDisableThirdPartySharing();
        if (!checkActivityStateI(this.activityState) || !isEnabledI()) {
            return;
        }
        ActivityState activityState = this.activityState;
        if (activityState.isGdprForgotten || activityState.isThirdPartySharingDisabled) {
            return;
        }
        if (this.adjustConfig.coppaCompliantEnabled) {
            this.logger.warn("Call to disable third party sharing API ignored, already done when COPPA enabled", new Object[0]);
            return;
        }
        activityState.isThirdPartySharingDisabled = true;
        writeActivityStateI();
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        ActivityPackage buildDisableThirdPartySharingPackage = packageBuilder.buildDisableThirdPartySharingPackage();
        this.packageHandler.addPackage(buildDisableThirdPartySharingPackage);
        defaultInstance.removeDisableThirdPartySharing();
        if (this.adjustConfig.eventBufferingEnabled) {
            this.logger.info("Buffered event %s", buildDisableThirdPartySharingPackage.getSuffix());
        } else {
            this.packageHandler.sendFirstPackage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endI() {
        if (!toSendI()) {
            pauseSendingI();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foregroundTimerFiredI() {
        if (!isEnabledI()) {
            stopForegroundTimerI();
            return;
        }
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gdprForgetMeI() {
        if (!checkActivityStateI(this.activityState) || !isEnabledI()) {
            return;
        }
        ActivityState activityState = this.activityState;
        if (activityState.isGdprForgotten) {
            return;
        }
        activityState.isGdprForgotten = true;
        writeActivityStateI();
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        ActivityPackage buildGdprPackage = packageBuilder.buildGdprPackage();
        this.packageHandler.addPackage(buildGdprPackage);
        SharedPreferencesManager.getDefaultInstance(getContext()).removeGdprForgetMe();
        if (this.adjustConfig.eventBufferingEnabled) {
            this.logger.info("Buffered event %s", buildGdprPackage.getSuffix());
        } else {
            this.packageHandler.sendFirstPackage();
        }
    }

    public static ActivityHandler getInstance(AdjustConfig adjustConfig) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
            return null;
        } else if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        } else {
            if (adjustConfig.processName != null) {
                int myPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) adjustConfig.context.getSystemService("activity");
                if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    return null;
                }
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (!next.processName.equalsIgnoreCase(adjustConfig.processName)) {
                            AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", next.processName);
                            return null;
                        }
                    }
                }
            }
            return new ActivityHandler(adjustConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotOptOutResponseI() {
        this.activityState.isGdprForgotten = true;
        writeActivityStateI();
        this.packageHandler.flush();
        setEnabledI(false);
    }

    private boolean hasChangedStateI(boolean z10, boolean z11, String str, String str2) {
        if (z10 != z11) {
            return true;
        }
        if (z10) {
            this.logger.debug(str, new Object[0]);
        } else {
            this.logger.debug(str2, new Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initI() {
        String pushToken;
        Double d10;
        SESSION_INTERVAL = AdjustFactory.getSessionInterval();
        SUBSESSION_INTERVAL = AdjustFactory.getSubsessionInterval();
        FOREGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        FOREGROUND_TIMER_START = AdjustFactory.getTimerStart();
        BACKGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        readAttributionI(this.adjustConfig.context);
        readActivityStateI(this.adjustConfig.context);
        this.sessionParameters = new SessionParameters();
        readSessionCallbackParametersI(this.adjustConfig.context);
        readSessionPartnerParametersI(this.adjustConfig.context);
        AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.startEnabled != null) {
            adjustConfig.preLaunchActions.preLaunchActionsArray.add(new d0());
        }
        if (this.internalState.hasFirstSdkStartOcurred()) {
            InternalState internalState = this.internalState;
            ActivityState activityState = this.activityState;
            internalState.enabled = activityState.enabled;
            internalState.updatePackages = activityState.updatePackages;
            internalState.firstLaunch = false;
        } else {
            this.internalState.firstLaunch = true;
        }
        readConfigFile(this.adjustConfig.context);
        this.deviceInfo = new DeviceInfo(this.adjustConfig);
        if (this.adjustConfig.eventBufferingEnabled) {
            this.logger.info("Event buffering is enabled", new Object[0]);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        if (this.deviceInfo.playAdId == null) {
            if (!Util.canReadPlayIds(this.adjustConfig)) {
                if (this.adjustConfig.coppaCompliantEnabled) {
                    this.logger.info("Cannot read Google Play Services Advertising ID with COPPA enabled", new Object[0]);
                }
                if (this.adjustConfig.playStoreKidsAppEnabled) {
                    this.logger.info("Cannot read Google Play Services Advertising ID with play store kids app enabled", new Object[0]);
                }
            } else {
                this.logger.warn("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            }
            if (this.deviceInfo.androidId == null) {
                if (!Util.canReadNonPlayIds(this.adjustConfig)) {
                    if (this.adjustConfig.coppaCompliantEnabled) {
                        this.logger.info("Cannot read non Play IDs with COPPA enabled", new Object[0]);
                    }
                    if (this.adjustConfig.playStoreKidsAppEnabled) {
                        this.logger.info("Cannot read non Play IDs with play store kids app enabled", new Object[0]);
                    }
                } else {
                    this.logger.error("Unable to get any Device IDs. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
                }
            }
        } else {
            this.logger.info("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        String str = this.adjustConfig.defaultTracker;
        if (str != null) {
            this.logger.info("Default tracker: '%s'", str);
        }
        String str2 = this.adjustConfig.pushToken;
        if (str2 != null) {
            this.logger.info("Push token: '%s'", str2);
            if (this.internalState.hasFirstSdkStartOcurred()) {
                setPushToken(this.adjustConfig.pushToken, false);
            } else {
                SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(this.adjustConfig.pushToken);
            }
        } else if (this.internalState.hasFirstSdkStartOcurred() && (pushToken = SharedPreferencesManager.getDefaultInstance(getContext()).getPushToken()) != null) {
            setPushToken(pushToken, true);
        }
        if (this.cachedDeeplinkResolutionCallback == null) {
            this.cachedDeeplinkResolutionCallback = this.adjustConfig.cachedDeeplinkResolutionCallback;
        }
        if (this.internalState.hasFirstSdkStartOcurred() && SharedPreferencesManager.getDefaultInstance(getContext()).getGdprForgetMe()) {
            gdprForgetMe();
        }
        this.foregroundTimer = new TimerCycle(new e0(), FOREGROUND_TIMER_START, FOREGROUND_TIMER_INTERVAL, FOREGROUND_TIMER_NAME);
        if (this.adjustConfig.sendInBackground) {
            this.logger.info("Send in background configured", new Object[0]);
            this.backgroundTimer = new TimerOnce(new f0(), BACKGROUND_TIMER_NAME);
        }
        if (this.internalState.hasFirstSdkStartNotOcurred() && (d10 = this.adjustConfig.delayStart) != null && d10.doubleValue() > 0.0d) {
            this.logger.info("Delay start configured", new Object[0]);
            this.internalState.delayStart = true;
            this.delayStartTimer = new TimerOnce(new h0(), DELAY_START_TIMER_NAME);
        }
        UtilNetworking.setUserAgent(this.adjustConfig.userAgent);
        AdjustConfig adjustConfig2 = this.adjustConfig;
        this.packageHandler = AdjustFactory.getPackageHandler(this, this.adjustConfig.context, toSendI(false), new ActivityPackageSender(adjustConfig2.urlStrategy, adjustConfig2.basePath, adjustConfig2.gdprPath, adjustConfig2.subscriptionPath, adjustConfig2.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig2.context));
        AdjustConfig adjustConfig3 = this.adjustConfig;
        this.attributionHandler = AdjustFactory.getAttributionHandler(this, toSendI(false), new ActivityPackageSender(adjustConfig3.urlStrategy, adjustConfig3.basePath, adjustConfig3.gdprPath, adjustConfig3.subscriptionPath, adjustConfig3.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig3.context));
        AdjustConfig adjustConfig4 = this.adjustConfig;
        this.sdkClickHandler = AdjustFactory.getSdkClickHandler(this, toSendI(true), new ActivityPackageSender(adjustConfig4.urlStrategy, adjustConfig4.basePath, adjustConfig4.gdprPath, adjustConfig4.subscriptionPath, adjustConfig4.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig4.context));
        AdjustConfig adjustConfig5 = this.adjustConfig;
        this.purchaseVerificationHandler = AdjustFactory.getPurchaseVerificationHandler(this, toSendI(true), new ActivityPackageSender(adjustConfig5.urlStrategy, adjustConfig5.basePath, adjustConfig5.gdprPath, adjustConfig5.subscriptionPath, adjustConfig5.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig5.context));
        if (isToUpdatePackagesI()) {
            updatePackagesI();
        }
        this.installReferrer = new InstallReferrer(this.adjustConfig.context, new i0());
        this.installReferrerHuawei = new InstallReferrerHuawei(this.adjustConfig.context, new j0());
        AdjustConfig adjustConfig6 = this.adjustConfig;
        this.installReferrerMeta = new InstallReferrerMeta(adjustConfig6.context, adjustConfig6.fbAppId, new k0());
        preLaunchActionsI(this.adjustConfig.preLaunchActions.preLaunchActionsArray);
        sendReftagReferrerI();
    }

    private boolean isEnabledI() {
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            return activityState.enabled;
        }
        return this.internalState.isEnabled();
    }

    private boolean isToUpdatePackagesI() {
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            return activityState.updatePackages;
        }
        return this.internalState.itHasToUpdatePackages();
    }

    private boolean isValidReferrerDetails(ReferrerDetails referrerDetails) {
        String str;
        if (referrerDetails == null || (str = referrerDetails.installReferrer) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    private void launchAttributionListenerI(Handler handler) {
        if (this.adjustConfig.onAttributionChangedListener == null) {
            return;
        }
        handler.post(new u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchAttributionResponseTasksI(AttributionResponseData attributionResponseData) {
        updateAdidI(attributionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(attributionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        prepareDeeplinkI(attributionResponseData.deeplink, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchDeeplinkMain(Intent intent, Uri uri) {
        boolean z10;
        if (this.adjustConfig.context.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.logger.error("Unable to open deferred deep link (%s)", uri);
            return;
        }
        this.logger.info("Open deferred deep link (%s)", uri);
        this.adjustConfig.context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchEventResponseTasksI(EventResponseData eventResponseData) {
        Runnable p0Var;
        updateAdidI(eventResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        boolean z10 = eventResponseData.success;
        if (z10 && this.adjustConfig.onEventTrackingSucceededListener != null) {
            this.logger.debug("Launching success event tracking listener", new Object[0]);
            p0Var = new o0(eventResponseData);
        } else if (!z10 && this.adjustConfig.onEventTrackingFailedListener != null) {
            this.logger.debug("Launching failed event tracking listener", new Object[0]);
            p0Var = new p0(eventResponseData);
        } else {
            return;
        }
        handler.post(p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchPurchaseVerificationResponseTasksI(PurchaseVerificationResponseData purchaseVerificationResponseData) {
        AdjustPurchaseVerificationResult adjustPurchaseVerificationResult;
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        JSONObject jSONObject = purchaseVerificationResponseData.jsonResponse;
        if (jSONObject == null) {
            adjustPurchaseVerificationResult = new AdjustPurchaseVerificationResult("not_verified", 101, purchaseVerificationResponseData.message);
        } else {
            adjustPurchaseVerificationResult = new AdjustPurchaseVerificationResult(UtilNetworking.extractJsonString(jSONObject, "verification_status"), UtilNetworking.extractJsonInt(jSONObject, "code"), UtilNetworking.extractJsonString(jSONObject, PglCryptUtils.KEY_MESSAGE));
        }
        handler.post(new v0(purchaseVerificationResponseData, adjustPurchaseVerificationResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSdkClickResponseTasksI(SdkClickResponseData sdkClickResponseData) {
        updateAdidI(sdkClickResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sdkClickResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (!TextUtils.isEmpty(sdkClickResponseData.resolvedDeeplink)) {
            OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
            this.cachedDeeplinkResolutionCallback = null;
            if (onDeeplinkResolvedListener != null) {
                handler.post(new q0(onDeeplinkResolvedListener, sdkClickResponseData));
            }
        }
    }

    private void launchSessionResponseListenerI(SessionResponseData sessionResponseData, Handler handler) {
        Runnable t0Var;
        boolean z10 = sessionResponseData.success;
        if (z10 && this.adjustConfig.onSessionTrackingSucceededListener != null) {
            this.logger.debug("Launching success session tracking listener", new Object[0]);
            t0Var = new s0(sessionResponseData);
        } else if (!z10 && this.adjustConfig.onSessionTrackingFailedListener != null) {
            this.logger.debug("Launching failed session tracking listener", new Object[0]);
            t0Var = new t0(sessionResponseData);
        } else {
            return;
        }
        handler.post(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSessionResponseTasksI(SessionResponseData sessionResponseData) {
        this.logger.debug("Launching SessionResponse tasks", new Object[0]);
        updateAdidI(sessionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sessionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (this.attribution == null && !this.activityState.askingAttribution) {
            this.attributionHandler.getAttribution();
        }
        if (sessionResponseData.success) {
            SharedPreferencesManager.getDefaultInstance(getContext()).setInstallTracked();
        }
        launchSessionResponseListenerI(sessionResponseData, handler);
        this.internalState.sessionResponseProcessed = true;
    }

    private void pauseSendingI() {
        this.attributionHandler.pauseSending();
        this.packageHandler.pauseSending();
        if (!toSendI(true)) {
            this.sdkClickHandler.pauseSending();
            this.purchaseVerificationHandler.pauseSending();
            return;
        }
        this.sdkClickHandler.resumeSending();
        this.purchaseVerificationHandler.resumeSending();
    }

    private boolean pausedI() {
        return pausedI(false);
    }

    private void preLaunchActionsI(List<IRunActivityHandler> list) {
        if (list == null) {
            return;
        }
        for (IRunActivityHandler iRunActivityHandler : list) {
            iRunActivityHandler.run(this);
        }
    }

    private void prepareDeeplinkI(Uri uri, Handler handler) {
        if (uri == null) {
            return;
        }
        this.logger.info("Deferred deeplink received (%s)", uri);
        handler.post(new w0(createDeeplinkIntentI(uri), uri));
    }

    private void processCachedDeeplinkI() {
        if (!checkActivityStateI(this.activityState)) {
            return;
        }
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
        String deeplinkUrl = defaultInstance.getDeeplinkUrl();
        long deeplinkClickTime = defaultInstance.getDeeplinkClickTime();
        if (deeplinkUrl == null || deeplinkClickTime == -1) {
            return;
        }
        readOpenUrl(Uri.parse(deeplinkUrl), deeplinkClickTime);
        defaultInstance.removeDeeplink();
    }

    private void processCoppaComplianceI() {
        if (!this.adjustConfig.coppaCompliantEnabled) {
            resetThirdPartySharingCoppaActivityStateI();
        } else {
            disableThirdPartySharingForCoppaEnabledI();
        }
    }

    private void processSessionI() {
        if (this.activityState.isGdprForgotten) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ActivityState activityState = this.activityState;
        long j10 = currentTimeMillis - activityState.lastActivity;
        if (j10 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            this.activityState.lastActivity = currentTimeMillis;
            writeActivityStateI();
        } else if (j10 > SESSION_INTERVAL) {
            trackNewSessionI(currentTimeMillis);
            checkAfterNewStartI();
        } else if (j10 > SUBSESSION_INTERVAL) {
            int i10 = activityState.subsessionCount + 1;
            activityState.subsessionCount = i10;
            activityState.sessionLength += j10;
            activityState.lastActivity = currentTimeMillis;
            this.logger.verbose("Started subsession %d of session %d", Integer.valueOf(i10), Integer.valueOf(this.activityState.sessionCount));
            writeActivityStateI();
            checkForPreinstallI();
            this.installReferrer.startConnection();
            this.installReferrerHuawei.readReferrer();
            this.installReferrerMeta.readReferrer();
            readInstallReferrerSamsung();
            readInstallReferrerXiaomi();
            readInstallReferrerVivo();
        } else {
            this.logger.verbose("Time span since last activity too short for a new subsession", new Object[0]);
        }
    }

    private void readActivityStateI(Context context) {
        try {
            this.activityState = (ActivityState) Util.readObject(context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME, ActivityState.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", ACTIVITY_STATE_NAME, e10.getMessage());
            this.activityState = null;
        }
        if (this.activityState != null) {
            this.internalState.firstSdkStart = true;
        }
    }

    private void readAttributionI(Context context) {
        try {
            this.attribution = (AdjustAttribution) Util.readObject(context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME, AdjustAttribution.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", ATTRIBUTION_NAME, e10.getMessage());
            this.attribution = null;
        }
    }

    private void readConfigFile(Context context) {
        try {
            InputStream open = context.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            this.logger.verbose("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.adjustConfig.defaultTracker = property;
            }
        } catch (Exception e10) {
            this.logger.debug("%s file not found in this app", e10.getMessage());
        }
    }

    private void readInstallReferrerSamsung() {
        this.executor.submit(new l0());
    }

    private void readInstallReferrerVivo() {
        this.executor.submit(new n0());
    }

    private void readInstallReferrerXiaomi() {
        this.executor.submit(new m0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readOpenUrlI(Uri uri, long j10) {
        if (!isEnabledI()) {
            return;
        }
        if (Util.isUrlFilteredOut(uri)) {
            ILogger iLogger = this.logger;
            iLogger.debug("Deeplink (" + uri.toString() + ") processing skipped", new Object[0]);
            return;
        }
        ActivityPackage buildDeeplinkSdkClickPackage = PackageFactory.buildDeeplinkSdkClickPackage(uri, j10, this.activityState, this.adjustConfig, this.deviceInfo, this.sessionParameters, this.internalState);
        if (buildDeeplinkSdkClickPackage == null) {
            return;
        }
        this.sdkClickHandler.sendSdkClick(buildDeeplinkSdkClickPackage);
    }

    private void readSessionCallbackParametersI(Context context) {
        try {
            this.sessionParameters.callbackParameters = (Map) Util.readObject(context, Constants.SESSION_CALLBACK_PARAMETERS_FILENAME, SESSION_CALLBACK_PARAMETERS_NAME, Map.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", SESSION_CALLBACK_PARAMETERS_NAME, e10.getMessage());
            this.sessionParameters.callbackParameters = null;
        }
    }

    private void readSessionPartnerParametersI(Context context) {
        try {
            this.sessionParameters.partnerParameters = (Map) Util.readObject(context, Constants.SESSION_PARTNER_PARAMETERS_FILENAME, SESSION_PARTNER_PARAMETERS_NAME, Map.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", SESSION_PARTNER_PARAMETERS_NAME, e10.getMessage());
            this.sessionParameters.partnerParameters = null;
        }
    }

    private void resetThirdPartySharingCoppaActivityStateI() {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.isThirdPartySharingDisabledForCoppa) {
            activityState.isThirdPartySharingDisabledForCoppa = false;
            writeActivityStateI();
        }
    }

    private void resumeSendingI() {
        this.attributionHandler.resumeSending();
        this.packageHandler.resumeSending();
        this.sdkClickHandler.resumeSending();
        this.purchaseVerificationHandler.resumeSending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFirstPackagesI() {
        if (this.internalState.isNotInDelayedStart()) {
            this.logger.info("Start delay expired or never configured", new Object[0]);
            return;
        }
        updatePackagesI();
        this.internalState.delayStart = false;
        this.delayStartTimer.cancel();
        this.delayStartTimer = null;
        updateHandlersStatusAndSendI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInstallReferrerI(ReferrerDetails referrerDetails, String str) {
        if (!isEnabledI() || !isValidReferrerDetails(referrerDetails) || Util.isEqualReferrerDetails(referrerDetails, str, this.activityState)) {
            return;
        }
        this.sdkClickHandler.sendSdkClick(PackageFactory.buildInstallReferrerSdkClickPackage(referrerDetails, str, this.activityState, this.adjustConfig, this.deviceInfo, this.sessionParameters, this.internalState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPreinstallReferrerI() {
        String preinstallReferrer;
        if (isEnabledI() && !this.internalState.hasFirstSdkStartNotOcurred() && (preinstallReferrer = SharedPreferencesManager.getDefaultInstance(getContext()).getPreinstallReferrer()) != null && !preinstallReferrer.isEmpty()) {
            this.sdkClickHandler.sendPreinstallPayload(preinstallReferrer, Constants.SYSTEM_INSTALLER_REFERRER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReftagReferrerI() {
        if (!isEnabledI() || this.internalState.hasFirstSdkStartNotOcurred()) {
            return;
        }
        this.sdkClickHandler.sendReftagReferrers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAskingAttributionI(boolean z10) {
        this.activityState.askingAttribution = z10;
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledI(boolean z10) {
        ActivityState activityState;
        if (!hasChangedStateI(isEnabledI(), z10, "Adjust already enabled", "Adjust already disabled")) {
            return;
        }
        if (z10 && (activityState = this.activityState) != null && activityState.isGdprForgotten) {
            this.logger.error("Re-enabling SDK not possible for forgotten user", new Object[0]);
            return;
        }
        InternalState internalState = this.internalState;
        internalState.enabled = z10;
        if (internalState.hasFirstSdkStartNotOcurred()) {
            updateStatusI(!z10, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
            return;
        }
        this.activityState.enabled = z10;
        writeActivityStateI();
        if (z10) {
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            if (defaultInstance.getGdprForgetMe()) {
                gdprForgetMeI();
            } else {
                processCoppaComplianceI();
                if (defaultInstance.getDisableThirdPartySharing()) {
                    disableThirdPartySharingI();
                }
                for (AdjustThirdPartySharing adjustThirdPartySharing : this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray) {
                    trackThirdPartySharingI(adjustThirdPartySharing);
                }
                Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
                if (bool != null) {
                    trackMeasurementConsentI(bool.booleanValue());
                }
                this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new ArrayList();
                this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
            }
            if (!defaultInstance.getInstallTracked()) {
                this.logger.debug("Detected that install was not tracked at enable time", new Object[0]);
                trackNewSessionI(System.currentTimeMillis());
            }
            checkAfterNewStartI(defaultInstance);
        }
        updateStatusI(!z10, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineModeI(boolean z10) {
        String str;
        String str2;
        String str3;
        if (!hasChangedStateI(this.internalState.isOffline(), z10, "Adjust already in offline mode", "Adjust already in online mode")) {
            return;
        }
        InternalState internalState = this.internalState;
        internalState.offline = z10;
        if (internalState.hasFirstSdkStartNotOcurred()) {
            str = "Handlers will still start as paused";
            str2 = "Handlers will start as active due to SDK being online";
            str3 = "Handlers will start paused due to SDK being offline";
        } else {
            str = "Handlers remain paused";
            str2 = "Resuming handlers to put SDK in online mode";
            str3 = "Pausing handlers to put SDK offline mode";
        }
        updateStatusI(z10, str3, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushTokenI(String str) {
        if (!checkActivityStateI(this.activityState) || !isEnabledI()) {
            return;
        }
        ActivityState activityState = this.activityState;
        if (activityState.isGdprForgotten || str == null || str.equals(activityState.pushToken)) {
            return;
        }
        this.activityState.pushToken = str;
        writeActivityStateI();
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        ActivityPackage buildInfoPackage = packageBuilder.buildInfoPackage(Constants.PUSH);
        this.packageHandler.addPackage(buildInfoPackage);
        SharedPreferencesManager.getDefaultInstance(getContext()).removePushToken();
        if (this.adjustConfig.eventBufferingEnabled) {
            this.logger.info("Buffered event %s", buildInfoPackage.getSuffix());
        } else {
            this.packageHandler.sendFirstPackage();
        }
    }

    private boolean shouldDisableThirdPartySharingWhenCoppaEnabled() {
        if (this.activityState == null || !isEnabledI()) {
            return false;
        }
        ActivityState activityState = this.activityState;
        if (activityState.isGdprForgotten) {
            return false;
        }
        return !activityState.isThirdPartySharingDisabledForCoppa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBackgroundTimerI() {
        if (this.backgroundTimer == null || !toSendI() || this.backgroundTimer.getFireIn() > 0) {
            return;
        }
        this.backgroundTimer.startIn(BACKGROUND_TIMER_INTERVAL);
    }

    private void startFirstSessionI() {
        this.activityState = new ActivityState();
        this.internalState.firstSdkStart = true;
        updateHandlersStatusAndSendI();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
        this.activityState.pushToken = defaultInstance.getPushToken();
        if (this.internalState.isEnabled()) {
            if (defaultInstance.getGdprForgetMe()) {
                gdprForgetMeI();
            } else {
                processCoppaComplianceI();
                if (defaultInstance.getDisableThirdPartySharing()) {
                    disableThirdPartySharingI();
                }
                for (AdjustThirdPartySharing adjustThirdPartySharing : this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray) {
                    trackThirdPartySharingI(adjustThirdPartySharing);
                }
                Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
                if (bool != null) {
                    trackMeasurementConsentI(bool.booleanValue());
                }
                this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new ArrayList();
                this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
                this.activityState.sessionCount = 1;
                transferSessionPackageI(currentTimeMillis);
                checkAfterNewStartI(defaultInstance);
            }
        }
        this.activityState.resetSessionAttributes(currentTimeMillis);
        this.activityState.enabled = this.internalState.isEnabled();
        this.activityState.updatePackages = this.internalState.itHasToUpdatePackages();
        writeActivityStateI();
        defaultInstance.removePushToken();
        defaultInstance.removeGdprForgetMe();
        defaultInstance.removeDisableThirdPartySharing();
        processCachedDeeplinkI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startForegroundTimerI() {
        if (!isEnabledI()) {
            return;
        }
        this.foregroundTimer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startI() {
        if (this.internalState.hasFirstSdkStartNotOcurred()) {
            AdjustSigner.onResume(this.adjustConfig.logger);
            startFirstSessionI();
            return;
        }
        if (SharedPreferencesManager.getDefaultInstance(getContext()).getDisableThirdPartySharing()) {
            disableThirdPartySharingI();
        }
        for (AdjustThirdPartySharing adjustThirdPartySharing : this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray) {
            trackThirdPartySharingI(adjustThirdPartySharing);
        }
        Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
        if (bool != null) {
            trackMeasurementConsentI(bool.booleanValue());
        }
        this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new ArrayList();
        AdjustConfig adjustConfig = this.adjustConfig;
        adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
        if (!this.activityState.enabled) {
            return;
        }
        AdjustSigner.onResume(adjustConfig.logger);
        updateHandlersStatusAndSendI();
        processCoppaComplianceI();
        processSessionI();
        checkAttributionStateI();
        processCachedDeeplinkI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBackgroundTimerI() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce == null) {
            return;
        }
        timerOnce.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopForegroundTimerI() {
        this.foregroundTimer.suspend();
    }

    private void teardownActivityStateS() {
        synchronized (ActivityState.class) {
            if (this.activityState == null) {
                return;
            }
            this.activityState = null;
        }
    }

    private void teardownAllSessionParametersS() {
        synchronized (SessionParameters.class) {
            if (this.sessionParameters == null) {
                return;
            }
            this.sessionParameters = null;
        }
    }

    private void teardownAttributionS() {
        synchronized (AdjustAttribution.class) {
            if (this.attribution == null) {
                return;
            }
            this.attribution = null;
        }
    }

    private boolean toSendI() {
        return toSendI(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackAdRevenueI(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkAdjustAdRevenue(adjustAdRevenue) && !this.activityState.isGdprForgotten) {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
            InternalState internalState = this.internalState;
            packageBuilder.internalState = internalState;
            this.packageHandler.addPackage(packageBuilder.buildAdRevenuePackage(adjustAdRevenue, internalState.isInDelayedStart()));
            this.packageHandler.sendFirstPackage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackEventI(AdjustEvent adjustEvent) {
        if (!checkActivityStateI(this.activityState) || !isEnabledI() || !checkEventI(adjustEvent) || !checkOrderIdI(adjustEvent.orderId) || this.activityState.isGdprForgotten) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.activityState.eventCount++;
        updateActivityStateI(currentTimeMillis);
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, currentTimeMillis);
        InternalState internalState = this.internalState;
        packageBuilder.internalState = internalState;
        ActivityPackage buildEventPackage = packageBuilder.buildEventPackage(adjustEvent, internalState.isInDelayedStart());
        this.packageHandler.addPackage(buildEventPackage);
        if (this.adjustConfig.eventBufferingEnabled) {
            this.logger.info("Buffered event %s", buildEventPackage.getSuffix());
        } else {
            this.packageHandler.sendFirstPackage();
        }
        if (this.adjustConfig.sendInBackground && this.internalState.isInBackground()) {
            startBackgroundTimerI();
        }
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackMeasurementConsentI(boolean z10) {
        if (!checkActivityStateI(this.activityState)) {
            this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = Boolean.valueOf(z10);
        } else if (!isEnabledI() || this.activityState.isGdprForgotten) {
        } else {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            ActivityPackage buildMeasurementConsentPackage = packageBuilder.buildMeasurementConsentPackage(z10);
            this.packageHandler.addPackage(buildMeasurementConsentPackage);
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildMeasurementConsentPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    private void trackNewSessionI(long j10) {
        ActivityState activityState = this.activityState;
        activityState.sessionCount++;
        activityState.lastInterval = j10 - activityState.lastActivity;
        transferSessionPackageI(j10);
        this.activityState.resetSessionAttributes(j10);
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackSubscriptionI(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (!checkActivityStateI(this.activityState) || !isEnabledI() || this.activityState.isGdprForgotten) {
            return;
        }
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
        InternalState internalState = this.internalState;
        packageBuilder.internalState = internalState;
        this.packageHandler.addPackage(packageBuilder.buildSubscriptionPackage(adjustPlayStoreSubscription, internalState.isInDelayedStart()));
        this.packageHandler.sendFirstPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackThirdPartySharingI(AdjustThirdPartySharing adjustThirdPartySharing) {
        if (!checkActivityStateI(this.activityState)) {
            this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
        } else if (!isEnabledI() || this.activityState.isGdprForgotten) {
        } else {
            if (this.adjustConfig.coppaCompliantEnabled) {
                this.logger.warn("Calling third party sharing API not allowed when COPPA enabled", new Object[0]);
                return;
            }
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            ActivityPackage buildThirdPartySharingPackage = packageBuilder.buildThirdPartySharingPackage(adjustThirdPartySharing);
            this.packageHandler.addPackage(buildThirdPartySharingPackage);
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildThirdPartySharingPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    private void transferSessionPackageI(long j10) {
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, j10);
        InternalState internalState = this.internalState;
        packageBuilder.internalState = internalState;
        this.packageHandler.addPackage(packageBuilder.buildSessionPackage(internalState.isInDelayedStart()));
        this.packageHandler.sendFirstPackage();
    }

    private boolean updateActivityStateI(long j10) {
        if (!checkActivityStateI(this.activityState)) {
            return false;
        }
        ActivityState activityState = this.activityState;
        long j11 = j10 - activityState.lastActivity;
        if (j11 > SESSION_INTERVAL) {
            return false;
        }
        activityState.lastActivity = j10;
        if (j11 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            return true;
        }
        activityState.sessionLength += j11;
        activityState.timeSpent += j11;
        return true;
    }

    private void updateAdidI(String str) {
        if (str == null || str.equals(this.activityState.adid)) {
            return;
        }
        this.activityState.adid = str;
        writeActivityStateI();
    }

    private void updateHandlersStatusAndSendI() {
        if (!toSendI()) {
            pauseSendingI();
            return;
        }
        resumeSendingI();
        if (!this.adjustConfig.eventBufferingEnabled || (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed())) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private void updatePackagesI() {
        this.packageHandler.updatePackages(this.sessionParameters);
        this.internalState.updatePackages = false;
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.updatePackages = false;
            writeActivityStateI();
        }
    }

    private void updateStatusI(boolean z10, String str, String str2, String str3) {
        if (z10) {
            this.logger.info(str, new Object[0]);
        } else if (pausedI(false)) {
            if (pausedI(true)) {
                this.logger.info(str2, new Object[0]);
            } else {
                this.logger.info(a6.h.c(str2, ", except the Sdk Click Handler"), new Object[0]);
            }
        } else {
            this.logger.info(str3, new Object[0]);
        }
        updateHandlersStatusAndSendI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyPurchaseI(AdjustPurchase adjustPurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new Object[0]);
            return;
        }
        String str = this.adjustConfig.urlStrategy;
        if (str != null && (str.equals(AdjustConfig.DATA_RESIDENCY_EU) || this.adjustConfig.urlStrategy.equals(AdjustConfig.DATA_RESIDENCY_US) || this.adjustConfig.urlStrategy.equals(AdjustConfig.DATA_RESIDENCY_TR))) {
            this.logger.warn("Purchase verification not available for data residency users right now", new Object[0]);
        } else if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 102, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new Object[0]);
        } else if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 103, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new Object[0]);
        } else if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 104, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new Object[0]);
        } else if (adjustPurchase == null) {
            this.logger.warn("Purchase verification aborted because purchase instance is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 105, "Purchase verification aborted because purchase instance is null"));
        } else {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            ActivityPackage buildVerificationPackage = packageBuilder.buildVerificationPackage(adjustPurchase, onPurchaseVerificationFinishedListener);
            if (buildVerificationPackage == null) {
                this.logger.warn("Purchase verification aborted because verification package is null", new Object[0]);
                onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because verification package is null"));
                return;
            }
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(buildVerificationPackage);
        }
    }

    private void writeActivityStateI() {
        synchronized (ActivityState.class) {
            ActivityState activityState = this.activityState;
            if (activityState == null) {
                return;
            }
            Util.writeObject(activityState, this.adjustConfig.context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME);
        }
    }

    private void writeAttributionI() {
        synchronized (AdjustAttribution.class) {
            AdjustAttribution adjustAttribution = this.attribution;
            if (adjustAttribution == null) {
                return;
            }
            Util.writeObject(adjustAttribution, this.adjustConfig.context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME);
        }
    }

    private void writeSessionCallbackParametersI() {
        synchronized (SessionParameters.class) {
            SessionParameters sessionParameters = this.sessionParameters;
            if (sessionParameters == null) {
                return;
            }
            Util.writeObject(sessionParameters.callbackParameters, this.adjustConfig.context, Constants.SESSION_CALLBACK_PARAMETERS_FILENAME, SESSION_CALLBACK_PARAMETERS_NAME);
        }
    }

    private void writeSessionPartnerParametersI() {
        synchronized (SessionParameters.class) {
            SessionParameters sessionParameters = this.sessionParameters;
            if (sessionParameters == null) {
                return;
            }
            Util.writeObject(sessionParameters.partnerParameters, this.adjustConfig.context, Constants.SESSION_PARTNER_PARAMETERS_FILENAME, SESSION_PARTNER_PARAMETERS_NAME);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addSessionCallbackParameter(String str, String str2) {
        this.executor.submit(new j(str, str2));
    }

    public void addSessionCallbackParameterI(String str, String str2) {
        if (!Util.isValidParameter(str, "key", "Session Callback") || !Util.isValidParameter(str2, "value", "Session Callback")) {
            return;
        }
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters.callbackParameters == null) {
            sessionParameters.callbackParameters = new LinkedHashMap();
        }
        String str3 = this.sessionParameters.callbackParameters.get(str);
        if (str2.equals(str3)) {
            this.logger.verbose("Key %s already present with the same value", str);
            return;
        }
        if (str3 != null) {
            this.logger.warn("Key %s will be overwritten", str);
        }
        this.sessionParameters.callbackParameters.put(str, str2);
        writeSessionCallbackParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addSessionPartnerParameter(String str, String str2) {
        this.executor.submit(new l(str, str2));
    }

    public void addSessionPartnerParameterI(String str, String str2) {
        if (!Util.isValidParameter(str, "key", "Session Partner") || !Util.isValidParameter(str2, "value", "Session Partner")) {
            return;
        }
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters.partnerParameters == null) {
            sessionParameters.partnerParameters = new LinkedHashMap();
        }
        String str3 = this.sessionParameters.partnerParameters.get(str);
        if (str2.equals(str3)) {
            this.logger.verbose("Key %s already present with the same value", str);
            return;
        }
        if (str3 != null) {
            this.logger.warn("Key %s will be overwritten", str);
        }
        this.sessionParameters.partnerParameters.put(str, str2);
        writeSessionPartnerParametersI();
    }

    public void backgroundTimerFired() {
        this.executor.submit(new b0());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void disableThirdPartySharing() {
        this.executor.submit(new s());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void finishedTrackingActivity(ResponseData responseData) {
        if (responseData instanceof SessionResponseData) {
            this.logger.debug("Finished tracking session", new Object[0]);
            this.attributionHandler.checkSessionResponse((SessionResponseData) responseData);
        } else if (responseData instanceof SdkClickResponseData) {
            SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) responseData;
            checkForInstallReferrerInfo(sdkClickResponseData);
            this.attributionHandler.checkSdkClickResponse(sdkClickResponseData);
        } else if (responseData instanceof EventResponseData) {
            launchEventResponseTasks((EventResponseData) responseData);
        } else if (responseData instanceof PurchaseVerificationResponseData) {
            launchPurchaseVerificationResponseTasks((PurchaseVerificationResponseData) responseData);
        }
    }

    public void foregroundTimerFired() {
        this.executor.submit(new a0());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gdprForgetMe() {
        this.executor.submit(new r());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public String getAdid() {
        ActivityState activityState = this.activityState;
        if (activityState == null) {
            return null;
        }
        return activityState.adid;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public AdjustConfig getAdjustConfig() {
        return this.adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public AdjustAttribution getAttribution() {
        return this.attribution;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public Context getContext() {
        return this.adjustConfig.context;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public InternalState getInternalState() {
        return this.internalState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public SessionParameters getSessionParameters() {
        return this.sessionParameters;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gotOptOutResponse() {
        this.executor.submit(new z());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void init(AdjustConfig adjustConfig) {
        this.adjustConfig = adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean isEnabled() {
        return isEnabledI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchAttributionResponseTasks(AttributionResponseData attributionResponseData) {
        this.executor.submit(new g(attributionResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchEventResponseTasks(EventResponseData eventResponseData) {
        this.executor.submit(new d(eventResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchPurchaseVerificationResponseTasks(PurchaseVerificationResponseData purchaseVerificationResponseData) {
        this.executor.submit(new h(purchaseVerificationResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSdkClickResponseTasks(SdkClickResponseData sdkClickResponseData) {
        this.executor.submit(new e(sdkClickResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSessionResponseTasks(SessionResponseData sessionResponseData) {
        this.executor.submit(new f(sessionResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onPause() {
        this.internalState.background = true;
        this.executor.submit(new g0());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onResume() {
        this.internalState.background = false;
        this.executor.submit(new v());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void readOpenUrl(Uri uri, long j10) {
        this.executor.submit(new z0(uri, j10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeSessionCallbackParameter(String str) {
        this.executor.submit(new m(str));
    }

    public void removeSessionCallbackParameterI(String str) {
        if (!Util.isValidParameter(str, "key", "Session Callback")) {
            return;
        }
        Map<String, String> map = this.sessionParameters.callbackParameters;
        if (map == null) {
            this.logger.warn("Session Callback parameters are not set", new Object[0]);
        } else if (map.remove(str) == null) {
            this.logger.warn("Key %s does not exist", str);
        } else {
            this.logger.debug("Key %s will be removed", str);
            writeSessionCallbackParametersI();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeSessionPartnerParameter(String str) {
        this.executor.submit(new n(str));
    }

    public void removeSessionPartnerParameterI(String str) {
        if (!Util.isValidParameter(str, "key", "Session Partner")) {
            return;
        }
        Map<String, String> map = this.sessionParameters.partnerParameters;
        if (map == null) {
            this.logger.warn("Session Partner parameters are not set", new Object[0]);
        } else if (map.remove(str) == null) {
            this.logger.warn("Key %s does not exist", str);
        } else {
            this.logger.debug("Key %s will be removed", str);
            writeSessionPartnerParametersI();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void resetSessionCallbackParameters() {
        this.executor.submit(new o());
    }

    public void resetSessionCallbackParametersI() {
        if (this.sessionParameters.callbackParameters == null) {
            this.logger.warn("Session Callback parameters are not set", new Object[0]);
        }
        this.sessionParameters.callbackParameters = null;
        writeSessionCallbackParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void resetSessionPartnerParameters() {
        this.executor.submit(new p());
    }

    public void resetSessionPartnerParametersI() {
        if (this.sessionParameters.partnerParameters == null) {
            this.logger.warn("Session Partner parameters are not set", new Object[0]);
        }
        this.sessionParameters.partnerParameters = null;
        writeSessionPartnerParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendFirstPackages() {
        this.executor.submit(new i());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendInstallReferrer(ReferrerDetails referrerDetails, String str) {
        this.executor.submit(new c(referrerDetails, str));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendPreinstallReferrer() {
        this.executor.submit(new b());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendReftagReferrer() {
        this.executor.submit(new a());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setAskingAttribution(boolean z10) {
        this.executor.submit(new b1(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setEnabled(boolean z10) {
        this.executor.submit(new x0(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setOfflineMode(boolean z10) {
        this.executor.submit(new y0(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPushToken(String str, boolean z10) {
        this.executor.submit(new q(z10, str));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void teardown() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        TimerCycle timerCycle = this.foregroundTimer;
        if (timerCycle != null) {
            timerCycle.teardown();
        }
        TimerOnce timerOnce2 = this.delayStartTimer;
        if (timerOnce2 != null) {
            timerOnce2.teardown();
        }
        ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        IPackageHandler iPackageHandler = this.packageHandler;
        if (iPackageHandler != null) {
            iPackageHandler.teardown();
        }
        IAttributionHandler iAttributionHandler = this.attributionHandler;
        if (iAttributionHandler != null) {
            iAttributionHandler.teardown();
        }
        ISdkClickHandler iSdkClickHandler = this.sdkClickHandler;
        if (iSdkClickHandler != null) {
            iSdkClickHandler.teardown();
        }
        IPurchaseVerificationHandler iPurchaseVerificationHandler = this.purchaseVerificationHandler;
        if (iPurchaseVerificationHandler != null) {
            iPurchaseVerificationHandler.teardown();
        }
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters != null) {
            Map<String, String> map = sessionParameters.callbackParameters;
            if (map != null) {
                map.clear();
            }
            Map<String, String> map2 = this.sessionParameters.partnerParameters;
            if (map2 != null) {
                map2.clear();
            }
        }
        teardownActivityStateS();
        teardownAttributionS();
        teardownAllSessionParametersS();
        this.packageHandler = null;
        this.logger = null;
        this.foregroundTimer = null;
        this.executor = null;
        this.backgroundTimer = null;
        this.delayStartTimer = null;
        this.internalState = null;
        this.deviceInfo = null;
        this.adjustConfig = null;
        this.attributionHandler = null;
        this.sdkClickHandler = null;
        this.purchaseVerificationHandler = null;
        this.sessionParameters = null;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        this.executor.submit(new x(adjustAdRevenue));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackEvent(AdjustEvent adjustEvent) {
        this.executor.submit(new r0(adjustEvent));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackMeasurementConsent(boolean z10) {
        this.executor.submit(new u(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.executor.submit(new y(adjustPlayStoreSubscription));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing) {
        this.executor.submit(new t(adjustThirdPartySharing));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean updateAttributionI(AdjustAttribution adjustAttribution) {
        if (adjustAttribution == null) {
            return false;
        }
        if (this.adjustConfig.finalAttributionEnabled && this.activityState.askingAttribution) {
            this.logger.info("Not updating intermediate attribution", new Object[0]);
            return false;
        } else if (adjustAttribution.equals(this.attribution)) {
            return false;
        } else {
            this.attribution = adjustAttribution;
            writeAttributionI();
            return true;
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyPurchase(AdjustPurchase adjustPurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new c0(adjustPurchase, onPurchaseVerificationFinishedListener));
    }

    private void checkAfterNewStartI(SharedPreferencesManager sharedPreferencesManager) {
        String pushToken = sharedPreferencesManager.getPushToken();
        if (pushToken != null && !pushToken.equals(this.activityState.pushToken)) {
            setPushToken(pushToken, true);
        }
        if (sharedPreferencesManager.getRawReferrerArray() != null) {
            sendReftagReferrer();
        }
        checkForPreinstallI();
        this.installReferrer.startConnection();
        this.installReferrerHuawei.readReferrer();
        this.installReferrerMeta.readReferrer();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
    }

    private boolean pausedI(boolean z10) {
        return z10 ? this.internalState.isOffline() || !isEnabledI() : this.internalState.isOffline() || !isEnabledI() || this.internalState.isInDelayedStart();
    }

    private boolean toSendI(boolean z10) {
        if (pausedI(z10)) {
            return false;
        }
        if (this.adjustConfig.sendInBackground) {
            return true;
        }
        return this.internalState.isInForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackAdRevenueI(String str, JSONObject jSONObject) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten) {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildAdRevenuePackage(str, jSONObject));
            this.packageHandler.sendFirstPackage();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void readOpenUrl(Uri uri, long j10, OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        this.executor.submit(new a1(uri, j10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(String str, JSONObject jSONObject) {
        this.executor.submit(new w(str, jSONObject));
    }
}
