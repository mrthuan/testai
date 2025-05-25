package a6;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.room.RoomDatabase;
import com.facebook.FacebookException;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.l;
import com.facebook.appevents.u;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.p;
import com.facebook.n;
import com.google.android.play.core.assetpacks.b1;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.Ac;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C9;
import com.inmobi.media.S5;
import f0.s;
import java.io.File;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import l.r;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f66a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f67b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f68d;

    public /* synthetic */ e(int i10, Object obj, Object obj2, Object obj3) {
        this.f66a = i10;
        this.c = obj;
        this.f68d = obj2;
        this.f67b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String p10;
        Object obj;
        FetchedAppSettingsManager.FetchAppSettingState fetchAppSettingState;
        JSONObject jSONObject;
        File file = null;
        r1 = null;
        com.facebook.internal.f fVar = null;
        switch (this.f66a) {
            case 0:
                Ref$ObjectRef billingClientWrapper = (Ref$ObjectRef) this.c;
                InAppPurchaseUtils.BillingClientVersion billingClientVersion = (InAppPurchaseUtils.BillingClientVersion) this.f68d;
                Context context = (Context) this.f67b;
                if (!k6.a.b(com.facebook.appevents.iap.b.class)) {
                    try {
                        kotlin.jvm.internal.g.e(billingClientWrapper, "$billingClientWrapper");
                        kotlin.jvm.internal.g.e(billingClientVersion, "$billingClientVersion");
                        kotlin.jvm.internal.g.e(context, "$context");
                        ((com.facebook.appevents.iap.c) billingClientWrapper.element).a(InAppPurchaseUtils.IAPProductType.SUBS, new r(3, billingClientVersion, context));
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(com.facebook.appevents.iap.b.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                Context context2 = (Context) this.f67b;
                String settingsKey = (String) this.c;
                String applicationId = (String) this.f68d;
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f9737a;
                kotlin.jvm.internal.g.e(context2, "$context");
                kotlin.jvm.internal.g.e(settingsKey, "$settingsKey");
                kotlin.jvm.internal.g.e(applicationId, "$applicationId");
                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                String string = sharedPreferences.getString(settingsKey, null);
                if (!p.v(string)) {
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            com.facebook.d dVar = com.facebook.d.f9685a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            FetchedAppSettingsManager.f9737a.getClass();
                            fVar = FetchedAppSettingsManager.e(applicationId, jSONObject);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                FetchedAppSettingsManager.f9737a.getClass();
                JSONObject a10 = FetchedAppSettingsManager.a();
                FetchedAppSettingsManager.e(applicationId, a10);
                sharedPreferences.edit().putString(settingsKey, a10.toString()).apply();
                if (fVar != null) {
                    String str = fVar.f9772h;
                    if (!FetchedAppSettingsManager.f9741f && str != null && str.length() > 0) {
                        FetchedAppSettingsManager.f9741f = true;
                    }
                }
                com.facebook.internal.e.f9761a.getClass();
                JSONObject a11 = com.facebook.internal.e.a();
                com.facebook.d.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(b.a.f(new Object[]{applicationId}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "format(format, *args)"), a11.toString()).apply();
                com.facebook.internal.e.d(applicationId, a11);
                c6.g gVar = c6.g.f5608a;
                Context a12 = com.facebook.d.a();
                String b10 = com.facebook.d.b();
                if (n.c() && (a12 instanceof Application)) {
                    Application application = (Application) a12;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = l.c;
                    if (com.facebook.d.g()) {
                        if (!com.facebook.appevents.b.f9472d) {
                            if (l.b() == null) {
                                l.a.e();
                            }
                            ScheduledThreadPoolExecutor b11 = l.b();
                            if (b11 != null) {
                                b11.execute(new com.facebook.appevents.a(0));
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        }
                        u uVar = u.f9666a;
                        if (!k6.a.b(u.class)) {
                            try {
                                if (!u.c.get()) {
                                    u.f9666a.b();
                                }
                            } catch (Throwable th3) {
                                k6.a.a(u.class, th3);
                            }
                        }
                        if (!k6.a.b(com.facebook.d.class)) {
                            try {
                                Context applicationContext = application.getApplicationContext();
                                if (applicationContext != null) {
                                    if (!com.facebook.internal.e.b("app_events_killswitch", com.facebook.d.b(), false)) {
                                        com.facebook.d.c().execute(new s(3, applicationContext, b10));
                                    }
                                    if (FeatureManager.c(FeatureManager.Feature.OnDeviceEventProcessing) && com.facebook.appevents.ondeviceprocessing.a.a() && !k6.a.b(com.facebook.appevents.ondeviceprocessing.a.class)) {
                                        com.facebook.d.c().execute(new androidx.fragment.app.f(2, com.facebook.d.a(), "com.facebook.sdk.attributionTracking", b10));
                                    }
                                }
                            } catch (Throwable th4) {
                                k6.a.a(com.facebook.d.class, th4);
                            }
                        }
                        c6.e.b(application, b10);
                    } else {
                        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                    }
                }
                AtomicReference<FetchedAppSettingsManager.FetchAppSettingState> atomicReference = FetchedAppSettingsManager.f9739d;
                if (FetchedAppSettingsManager.c.containsKey(applicationId)) {
                    fetchAppSettingState = FetchedAppSettingsManager.FetchAppSettingState.SUCCESS;
                } else {
                    fetchAppSettingState = FetchedAppSettingsManager.FetchAppSettingState.ERROR;
                }
                atomicReference.set(fetchAppSettingState);
                FetchedAppSettingsManager.f9737a.j();
                return;
            case 2:
                Ac.a((AdConfig.WebAssetCacheConfig) this.c, (Ac) this.f68d, (Context) this.f67b);
                return;
            case 3:
                C9.a((C9) this.c, (S5) this.f68d, (JSONObject) this.f67b);
                return;
            case 4:
                C1761p5.a((C1761p5) this.c, (String) this.f68d, (String) this.f67b);
                return;
            case 5:
                km.a aVar = (km.a) this.c;
                km.a aVar2 = (km.a) this.f68d;
                cg.l lVar = (cg.l) this.f67b;
                AIDataBase aIDataBase = km.e.f19907a;
                kotlin.jvm.internal.g.e(aVar2, ea.a.p("F2klZm8=", "PXNS01A2"));
                km.c cVar = (km.c) km.e.f19907a.k();
                RoomDatabase roomDatabase = cVar.f19897a;
                roomDatabase.c();
                try {
                    long a13 = androidx.activity.f.a(cVar, aVar, aVar2);
                    roomDatabase.j();
                    roomDatabase.g();
                    w0.a().f28791b.execute(new c6.a(a13, lVar));
                    return;
                } catch (Throwable th5) {
                    roomDatabase.g();
                    throw th5;
                }
            default:
                Activity activity = (Activity) this.c;
                Uri uri = (Uri) this.f68d;
                Intent intent = (Intent) this.f67b;
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                kotlin.jvm.internal.g.e(activity, ea.a.p("c2EOdCp2DHR5", "pHWmCeGE"));
                String s4 = v.s(activity, uri);
                t1.b("ThirdOpenParseManager---third step1 UriToFileEntityRunnable uri:" + uri + ", path=" + s4);
                boolean isEmpty = TextUtils.isEmpty(s4);
                ThirdOpenParseManager thirdOpenParseManager2 = ThirdOpenParseManager.f28760a;
                if (!isEmpty) {
                    ReaderSplashActivity.a aVar3 = ReaderSplashActivity.f23873s;
                    String p11 = ea.a.p("24785fyWhJb15I-2gbf55fqE1IjW5cmf", "Q5O3Beiw");
                    aVar3.getClass();
                    ReaderSplashActivity.a.a(p11);
                    file = new File(s4);
                    if (file.exists() && file.isFile()) {
                        boolean f10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.f(activity);
                        if (!f10 || !b1.P(file)) {
                            t1.b("ThirdOpenParseManager---third step1.1 noPermission or unSupport,hasPermission=" + f10);
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(activity)) {
                                thirdOpenParseManager2.getClass();
                                ThirdOpenParseManager.d(uri);
                                return;
                            }
                            File k10 = v.k(activity);
                            String q5 = v.q(activity, uri, intent);
                            kotlin.jvm.internal.g.d(q5, ea.a.p("R2gichdGC2wXTlVtZQ==", "G2yG0Xo1"));
                            if (kotlin.text.j.F(q5, ea.a.p("HWU5chxy", "E2aHCjab"), false)) {
                                thirdOpenParseManager2.getClass();
                                ThirdOpenParseManager.e(uri);
                                return;
                            } else if (f10 && !aj.b.H(q5)) {
                                thirdOpenParseManager2.getClass();
                                ThirdOpenParseManager.e(uri);
                                return;
                            } else {
                                ReaderSplashActivity.a.a(ea.a.p("1qTG5fu2hJb15I-2", "cDUQ8uSZ"));
                                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(activity)) {
                                    thirdOpenParseManager2.getClass();
                                    ThirdOpenParseManager.d(uri);
                                    return;
                                }
                                file = v.f(activity, uri, q5, k10);
                                if (file == null) {
                                    obj = ea.a.p("IXVdbA==", "IlmQEZoW");
                                } else {
                                    obj = file;
                                }
                                obj.toString();
                                if (file == null) {
                                    file = new File(s4);
                                }
                            }
                        }
                    } else {
                        thirdOpenParseManager2.getClass();
                        ThirdOpenParseManager.b(uri);
                        return;
                    }
                }
                if (file == null) {
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(activity)) {
                        thirdOpenParseManager2.getClass();
                        ThirdOpenParseManager.d(uri);
                        return;
                    }
                    file = v.m(activity, uri, intent, false);
                    if (file != null) {
                        p10 = file.getAbsolutePath();
                    } else {
                        p10 = ea.a.p("XXUnbA==", "1ToI7MSD");
                    }
                    t1.b("ThirdOpenParseManager---third step2 file==null step, path = " + p10);
                } else {
                    ReaderSplashActivity.a aVar4 = ReaderSplashActivity.f23873s;
                    String p12 = ea.a.p("1ZzC6MSvh77274iMjpvi5sql1InV5f-A", "T0LW594p");
                    aVar4.getClass();
                    ReaderSplashActivity.a.a(p12);
                }
                thirdOpenParseManager2.getClass();
                ThirdOpenParseManager.a(file, uri);
                return;
        }
    }

    public /* synthetic */ e(Context context, String str, String str2) {
        this.f66a = 1;
        this.f67b = context;
        this.c = str;
        this.f68d = str2;
    }
}
