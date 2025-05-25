package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import com.inmobi.sdk.InMobiSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdjustInstance {
    private IActivityHandler activityHandler;
    private String basePath;
    private OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String pushToken;
    private String subscriptionPath;
    private Boolean startEnabled = null;
    private boolean startOffline = false;
    private PreLaunchActions preLaunchActions = new PreLaunchActions();

    /* loaded from: classes.dex */
    public static class PreLaunchActions {
        public List<IRunActivityHandler> preLaunchActionsArray = new ArrayList();
        public List<AdjustThirdPartySharing> preLaunchAdjustThirdPartySharingArray = new ArrayList();
        public Boolean lastMeasurementConsentTracked = null;
    }

    /* loaded from: classes.dex */
    public class a implements IRunActivityHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5850a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f5851b;

        public a(String str, String str2) {
            this.f5850a = str;
            this.f5851b = str2;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.addSessionCallbackParameterI(this.f5850a, this.f5851b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements IRunActivityHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5852a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f5853b;

        public b(String str, String str2) {
            this.f5852a = str;
            this.f5853b = str2;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.addSessionPartnerParameterI(this.f5852a, this.f5853b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements IRunActivityHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5854a;

        public c(String str) {
            this.f5854a = str;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.removeSessionCallbackParameterI(this.f5854a);
        }
    }

    /* loaded from: classes.dex */
    public class d implements IRunActivityHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5855a;

        public d(String str) {
            this.f5855a = str;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.removeSessionPartnerParameterI(this.f5855a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements IRunActivityHandler {
        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.resetSessionCallbackParametersI();
        }
    }

    /* loaded from: classes.dex */
    public class f implements IRunActivityHandler {
        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.resetSessionPartnerParametersI();
        }
    }

    private boolean checkActivityHandler(String str) {
        return checkActivityHandler(str, false);
    }

    private boolean isInstanceEnabled() {
        Boolean bool = this.startEnabled;
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    private void saveDeeplink(Uri uri, long j10, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).saveDeeplink(uri, j10);
    }

    private void saveDisableThirdPartySharing(Context context) {
        SharedPreferencesManager.getDefaultInstance(context).setDisableThirdPartySharing();
    }

    private void saveGdprForgetMe(Context context) {
        SharedPreferencesManager.getDefaultInstance(context).setGdprForgetMe();
    }

    private void savePreinstallReferrer(String str, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).savePreinstallReferrer(str);
    }

    private void savePushToken(String str, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).savePushToken(str);
    }

    private void saveRawReferrer(String str, long j10, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).saveRawReferrer(str, j10);
    }

    private void setSendingReferrersAsNotSent(Context context) {
        SharedPreferencesManager.getDefaultInstance(context).setSendingReferrersAsNotSent();
    }

    public void addSessionCallbackParameter(String str, String str2) {
        if (checkActivityHandler("adding session callback parameter", true)) {
            this.activityHandler.addSessionCallbackParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new a(str, str2));
        }
    }

    public void addSessionPartnerParameter(String str, String str2) {
        if (checkActivityHandler("adding session partner parameter", true)) {
            this.activityHandler.addSessionPartnerParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new b(str, str2));
        }
    }

    public void appWillOpenUrl(Uri uri) {
        if (checkActivityHandler("appWillOpenUrl")) {
            this.activityHandler.readOpenUrl(uri, System.currentTimeMillis());
        }
    }

    public void disableThirdPartySharing(Context context) {
        if (!checkActivityHandler("disable third party sharing", true)) {
            saveDisableThirdPartySharing(context);
        } else {
            this.activityHandler.disableThirdPartySharing();
        }
    }

    public void gdprForgetMe(Context context) {
        saveGdprForgetMe(context);
        if (checkActivityHandler(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true) && this.activityHandler.isEnabled()) {
            this.activityHandler.gdprForgetMe();
        }
    }

    public String getAdid() {
        if (!checkActivityHandler("getAdid")) {
            return null;
        }
        return this.activityHandler.getAdid();
    }

    public AdjustAttribution getAttribution() {
        if (!checkActivityHandler("getAttribution")) {
            return null;
        }
        return this.activityHandler.getAttribution();
    }

    public String getSdkVersion() {
        return Util.getSdkVersion();
    }

    public boolean isEnabled() {
        if (!checkActivityHandler("isEnabled")) {
            return isInstanceEnabled();
        }
        return this.activityHandler.isEnabled();
    }

    public void onCreate(AdjustConfig adjustConfig) {
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
        } else if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
        } else if (this.activityHandler != null) {
            AdjustFactory.getLogger().error("Adjust already initialized", new Object[0]);
        } else {
            adjustConfig.preLaunchActions = this.preLaunchActions;
            adjustConfig.pushToken = this.pushToken;
            adjustConfig.startEnabled = this.startEnabled;
            adjustConfig.startOffline = this.startOffline;
            adjustConfig.basePath = this.basePath;
            adjustConfig.gdprPath = this.gdprPath;
            adjustConfig.subscriptionPath = this.subscriptionPath;
            adjustConfig.purchaseVerificationPath = this.purchaseVerificationPath;
            adjustConfig.cachedDeeplinkResolutionCallback = this.cachedDeeplinkResolutionCallback;
            this.activityHandler = AdjustFactory.getActivityHandler(adjustConfig);
            setSendingReferrersAsNotSent(adjustConfig.context);
        }
    }

    public void onPause() {
        if (!checkActivityHandler("onPause")) {
            return;
        }
        this.activityHandler.onPause();
    }

    public void onResume() {
        if (!checkActivityHandler("onResume")) {
            return;
        }
        this.activityHandler.onResume();
    }

    public void processDeeplink(Uri uri, Context context, OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        if (onDeeplinkResolvedListener == null) {
            appWillOpenUrl(uri, context);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!checkActivityHandler("processDeeplink", true)) {
            saveDeeplink(uri, currentTimeMillis, context);
            this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
            return;
        }
        this.activityHandler.readOpenUrl(uri, currentTimeMillis, onDeeplinkResolvedListener);
    }

    public void removeSessionCallbackParameter(String str) {
        if (checkActivityHandler("removing session callback parameter", true)) {
            this.activityHandler.removeSessionCallbackParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new c(str));
        }
    }

    public void removeSessionPartnerParameter(String str) {
        if (checkActivityHandler("removing session partner parameter", true)) {
            this.activityHandler.removeSessionPartnerParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new d(str));
        }
    }

    public void resetSessionCallbackParameters() {
        if (checkActivityHandler("resetting session callback parameters", true)) {
            this.activityHandler.resetSessionCallbackParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new e());
        }
    }

    public void resetSessionPartnerParameters() {
        if (checkActivityHandler("resetting session partner parameters", true)) {
            this.activityHandler.resetSessionPartnerParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new f());
        }
    }

    public void sendFirstPackages() {
        if (!checkActivityHandler("sendFirstPackages")) {
            return;
        }
        this.activityHandler.sendFirstPackages();
    }

    public void sendPreinstallReferrer(String str, Context context) {
        if (str != null && str.length() != 0) {
            savePreinstallReferrer(str, context);
            if (checkActivityHandler("preinstall referrer", true) && this.activityHandler.isEnabled()) {
                this.activityHandler.sendPreinstallReferrer();
                return;
            }
            return;
        }
        AdjustFactory.getLogger().warn("Skipping SYSTEM_INSTALLER_REFERRER preinstall referrer processing (null or empty)", new Object[0]);
    }

    public void sendReferrer(String str, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            saveRawReferrer(str, currentTimeMillis, context);
            if (checkActivityHandler(Constants.REFERRER, true) && this.activityHandler.isEnabled()) {
                this.activityHandler.sendReftagReferrer();
                return;
            }
            return;
        }
        AdjustFactory.getLogger().warn("Skipping INSTALL_REFERRER intent referrer processing (null or empty)", new Object[0]);
    }

    public void setEnabled(boolean z10) {
        this.startEnabled = Boolean.valueOf(z10);
        if (checkActivityHandler(z10, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(z10);
        }
    }

    public void setOfflineMode(boolean z10) {
        if (!checkActivityHandler(z10, "offline mode", "online mode")) {
            this.startOffline = z10;
        } else {
            this.activityHandler.setOfflineMode(z10);
        }
    }

    public void setPushToken(String str) {
        if (checkActivityHandler("push token", true)) {
            this.activityHandler.setPushToken(str, false);
        } else {
            this.pushToken = str;
        }
    }

    public void setTestOptions(AdjustTestOptions adjustTestOptions) {
        String str = adjustTestOptions.basePath;
        if (str != null) {
            this.basePath = str;
        }
        String str2 = adjustTestOptions.gdprPath;
        if (str2 != null) {
            this.gdprPath = str2;
        }
        String str3 = adjustTestOptions.subscriptionPath;
        if (str3 != null) {
            this.subscriptionPath = str3;
        }
        String str4 = adjustTestOptions.purchaseVerificationPath;
        if (str4 != null) {
            this.purchaseVerificationPath = str4;
        }
        String str5 = adjustTestOptions.baseUrl;
        if (str5 != null) {
            AdjustFactory.setBaseUrl(str5);
        }
        String str6 = adjustTestOptions.gdprUrl;
        if (str6 != null) {
            AdjustFactory.setGdprUrl(str6);
        }
        String str7 = adjustTestOptions.subscriptionUrl;
        if (str7 != null) {
            AdjustFactory.setSubscriptionUrl(str7);
        }
        String str8 = adjustTestOptions.purchaseVerificationUrl;
        if (str8 != null) {
            AdjustFactory.setPurchaseVerificationUrl(str8);
        }
        Long l10 = adjustTestOptions.timerIntervalInMilliseconds;
        if (l10 != null) {
            AdjustFactory.setTimerInterval(l10.longValue());
        }
        if (adjustTestOptions.timerStartInMilliseconds != null) {
            AdjustFactory.setTimerStart(adjustTestOptions.timerIntervalInMilliseconds.longValue());
        }
        Long l11 = adjustTestOptions.sessionIntervalInMilliseconds;
        if (l11 != null) {
            AdjustFactory.setSessionInterval(l11.longValue());
        }
        Long l12 = adjustTestOptions.subsessionIntervalInMilliseconds;
        if (l12 != null) {
            AdjustFactory.setSubsessionInterval(l12.longValue());
        }
        Boolean bool = adjustTestOptions.tryInstallReferrer;
        if (bool != null) {
            AdjustFactory.setTryInstallReferrer(bool.booleanValue());
        }
        if (adjustTestOptions.noBackoffWait != null) {
            BackoffStrategy backoffStrategy = BackoffStrategy.NO_WAIT;
            AdjustFactory.setPackageHandlerBackoffStrategy(backoffStrategy);
            AdjustFactory.setSdkClickBackoffStrategy(backoffStrategy);
        }
        Boolean bool2 = adjustTestOptions.enableSigning;
        if (bool2 != null && bool2.booleanValue()) {
            AdjustFactory.enableSigning();
        }
        Boolean bool3 = adjustTestOptions.disableSigning;
        if (bool3 != null && bool3.booleanValue()) {
            AdjustFactory.disableSigning();
        }
    }

    public void teardown() {
        if (!checkActivityHandler("teardown")) {
            return;
        }
        this.activityHandler.teardown();
        this.activityHandler = null;
    }

    public void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityHandler("trackAdRevenue")) {
            this.activityHandler.trackAdRevenue(adjustAdRevenue);
        }
    }

    public void trackEvent(AdjustEvent adjustEvent) {
        if (!checkActivityHandler("trackEvent")) {
            return;
        }
        this.activityHandler.trackEvent(adjustEvent);
    }

    public void trackMeasurementConsent(boolean z10) {
        if (!checkActivityHandler("measurement consent", true)) {
            this.preLaunchActions.lastMeasurementConsentTracked = Boolean.valueOf(z10);
            return;
        }
        this.activityHandler.trackMeasurementConsent(z10);
    }

    public void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (!checkActivityHandler("trackPlayStoreSubscription")) {
            return;
        }
        this.activityHandler.trackPlayStoreSubscription(adjustPlayStoreSubscription);
    }

    public void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing) {
        if (!checkActivityHandler("third party sharing", true)) {
            this.preLaunchActions.preLaunchAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
        } else {
            this.activityHandler.trackThirdPartySharing(adjustThirdPartySharing);
        }
    }

    public void verifyPurchase(AdjustPurchase adjustPurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (!checkActivityHandler("verifyPurchase")) {
            if (onPurchaseVerificationFinishedListener != null) {
                onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 100, "SDK needs to be initialized before making purchase verification request"));
                return;
            }
            return;
        }
        this.activityHandler.verifyPurchase(adjustPurchase, onPurchaseVerificationFinishedListener);
    }

    private boolean checkActivityHandler(String str, boolean z10) {
        if (this.activityHandler != null) {
            return true;
        }
        if (str == null) {
            AdjustFactory.getLogger().error("Adjust not initialized correctly", new Object[0]);
            return false;
        }
        if (z10) {
            AdjustFactory.getLogger().warn("Adjust not initialized, but %s saved for launch", str);
        } else {
            AdjustFactory.getLogger().warn("Adjust not initialized, can't perform %s", str);
        }
        return false;
    }

    public void appWillOpenUrl(Uri uri, Context context) {
        if (uri == null || uri.toString().length() == 0) {
            AdjustFactory.getLogger().warn("Skipping deep link processing (null or empty)", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (checkActivityHandler("appWillOpenUrl", true)) {
            this.activityHandler.readOpenUrl(uri, currentTimeMillis);
        } else {
            saveDeeplink(uri, currentTimeMillis, context);
        }
    }

    public void setPushToken(String str, Context context) {
        savePushToken(str, context);
        if (checkActivityHandler("push token", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.setPushToken(str, true);
        }
    }

    public void trackAdRevenue(String str, JSONObject jSONObject) {
        if (checkActivityHandler("trackAdRevenue")) {
            this.activityHandler.trackAdRevenue(str, jSONObject);
        }
    }

    private boolean checkActivityHandler(boolean z10, String str, String str2) {
        return z10 ? checkActivityHandler(str, true) : checkActivityHandler(str2, true);
    }
}
