package com.google.android.tools;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.activity.s;
import cg.l;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.lib.flutter.encrypt.EngineHelper;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.text.k;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: InstallReferrerUtil.kt */
/* loaded from: classes2.dex */
public final class InstallReferrerUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final tf.c f13468a = kotlin.a.a(new cg.a<c>() { // from class: com.google.android.tools.InstallReferrerUtil$attrsHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final c invoke() {
            return new c();
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static int f13469b = -1;
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f13470d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f13471e = "";

    /* renamed from: f  reason: collision with root package name */
    public static String f13472f = "";

    /* renamed from: g  reason: collision with root package name */
    public static Application f13473g;

    /* renamed from: h  reason: collision with root package name */
    public static SharedPreferences f13474h;

    /* renamed from: i  reason: collision with root package name */
    public static SharedPreferences.Editor f13475i;

    public static final void a(Context context, String str) {
        boolean z10;
        String str2;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str2 = "error";
        } else {
            str2 = str;
        }
        c = str2;
        e(context).putString("fl_referrer", str2).apply();
        LinkedHashMap linkedHashMap = f.f13487a;
        f.f(str, f13470d);
        int t4 = s.t(str);
        c.b((c) f13468a.getValue(), t4, str, 0, null, 8);
        if (f13469b != 3) {
            i(context, t4);
        }
    }

    public static final void b(Context context, Uri uri) {
        boolean z10;
        i(context, 3);
        String uri2 = uri.toString();
        kotlin.jvm.internal.g.d(uri2, "targetUri.toString()");
        c.b((c) f13468a.getValue(), 3, uri2, 2, null, 24);
        EngineHelper.f15726a.getClass();
        EngineHelper.c(null);
        EngineHelper.i(context, "cus_user_type", Constants.REFERRER_API_META);
        uri.toString();
        String queryParameter = uri.getQueryParameter("campaign");
        boolean z11 = false;
        if (queryParameter != null) {
            if (queryParameter.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            f13470d = queryParameter;
            e(context).putString("fl_meta_campaign", queryParameter).apply();
            EngineHelper.i(context, "campaign", queryParameter);
        }
    }

    public static String c() {
        try {
            h hVar = aj.b.f559g;
            String lowerCase = ((hVar == null || (r1 = hVar.c()) == null) ? "" : "").toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return lowerCase;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int d() {
        if (k.O(f13472f, "digital turbine", false) || k.O(c(), "digital turbine", false)) {
            return 2;
        }
        if (k.O(f13472f, "applovin", false) || k.O(c(), "applovin", false)) {
            return 4;
        }
        return f13469b;
    }

    public static SharedPreferences.Editor e(Context context) {
        if (f13475i == null) {
            f13475i = f(context).edit();
        }
        SharedPreferences.Editor editor = f13475i;
        kotlin.jvm.internal.g.b(editor);
        return editor;
    }

    public static SharedPreferences f(Context context) {
        if (f13474h == null) {
            f13474h = context.getSharedPreferences("app_sp_bu", 0);
        }
        SharedPreferences sharedPreferences = f13474h;
        kotlin.jvm.internal.g.b(sharedPreferences);
        return sharedPreferences;
    }

    public static void g(final Context context) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            LinkedHashMap linkedHashMap = f.f13487a;
            l<String, tf.d> lVar = new l<String, tf.d>() { // from class: com.google.android.tools.InstallReferrerUtil$preloadInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(String str) {
                    invoke2(str);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    f.f13487a.put("fb_id", it);
                }
            };
            try {
                Object obj = com.google.firebase.installations.a.f13588m;
                ((com.google.firebase.installations.a) z9.e.c().b(eb.e.class)).getId().b(new d(lVar, 0));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            LinkedHashMap linkedHashMap2 = f.f13487a;
            final InstallReferrerUtil$preloadInfo$2 callback = new l<String, tf.d>() { // from class: com.google.android.tools.InstallReferrerUtil$preloadInfo$2
                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(String str) {
                    invoke2(str);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    f.f13487a.put("instance_id", it);
                }
            };
            kotlin.jvm.internal.g.e(callback, "callback");
            try {
                FirebaseAnalytics.getInstance(context).a().b(new OnCompleteListener() { // from class: com.google.android.tools.e
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        l callback2 = l.this;
                        kotlin.jvm.internal.g.e(callback2, "$callback");
                        kotlin.jvm.internal.g.e(task, "task");
                        try {
                            if (task.o()) {
                                String str = (String) task.k();
                                if (str == null) {
                                    str = "";
                                }
                                callback2.invoke(str);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        t0.s0(false, new cg.a<tf.d>() { // from class: com.google.android.tools.InstallReferrerUtil$preloadInfo$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AdvertisingIdClient.Info info;
                cg.a<tf.d> aVar;
                LinkedHashMap linkedHashMap3 = f.f13487a;
                Context context2 = context;
                kotlin.jvm.internal.g.c(context2, "null cannot be cast to non-null type android.app.Application");
                Application application = (Application) context2;
                LinkedHashMap linkedHashMap4 = f.f13487a;
                try {
                    String string = Settings.System.getString(application.getContentResolver(), "android_id");
                    String str = "";
                    if (string == null) {
                        string = "";
                    }
                    linkedHashMap4.put("andId", string);
                    String str2 = Build.BRAND;
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap4.put("brand", str2);
                    String str3 = Build.MODEL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap4.put("model", str3);
                    linkedHashMap4.put("d_v", String.valueOf(Build.VERSION.SDK_INT));
                    String pkg = application.getPackageName();
                    kotlin.jvm.internal.g.d(pkg, "pkg");
                    linkedHashMap4.put("pkg", pkg);
                    boolean z10 = false;
                    try {
                        PackageInfo packageInfo = application.getPackageManager().getPackageInfo(pkg, 0);
                        kotlin.jvm.internal.g.d(packageInfo, "app.packageManager.getPackageInfo(pkg, 0)");
                        String str4 = packageInfo.versionName;
                        kotlin.jvm.internal.g.d(str4, "pi.versionName");
                        linkedHashMap4.put("v_name", str4);
                        linkedHashMap4.put("v_code", String.valueOf(packageInfo.versionCode));
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    Object systemService = application.getSystemService("connectivity");
                    kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        z10 = true;
                    }
                    linkedHashMap4.put("vpn", String.valueOf(z10));
                    String language = Locale.getDefault().getLanguage();
                    if (language != null) {
                        str = language;
                    }
                    linkedHashMap4.put("lan", str);
                    linkedHashMap4.put("resolution", f.c(application));
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
                LinkedHashMap linkedHashMap5 = f.f13487a;
                Context context3 = context;
                kotlin.jvm.internal.g.e(context3, "context");
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(context3.getApplicationContext());
                } catch (Exception e15) {
                    e15.printStackTrace();
                    info = null;
                }
                if (info != null) {
                    try {
                        String id2 = info.getId();
                        if (id2 == null) {
                            return;
                        }
                        boolean isLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                        EngineHelper.f15726a.getClass();
                        com.lib.flutter.encrypt.d dVar = EngineHelper.f15729e;
                        if (dVar != null) {
                            dVar.a();
                        }
                        LinkedHashMap linkedHashMap6 = f.f13487a;
                        linkedHashMap6.put("advertisingId", id2);
                        linkedHashMap6.put("trackEnable", isLimitAdTrackingEnabled ? "1" : PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                        if (!f.f13488b || (aVar = f.c) == null) {
                            return;
                        }
                        aVar.invoke();
                    } catch (Exception e16) {
                        e16.printStackTrace();
                    }
                }
            }
        }, 31);
    }

    public static void h(int i10, String str) {
        try {
            if (f13469b != i10) {
                f13469b = i10;
                Application application = f13473g;
                if (application != null) {
                    i(application, i10);
                }
                EngineHelper engineHelper = EngineHelper.f15726a;
                InstallReferrerUtil$setBuyFlagFromAttrPlatform$2 installReferrerUtil$setBuyFlagFromAttrPlatform$2 = new l<Boolean, tf.d>() { // from class: com.google.android.tools.InstallReferrerUtil$setBuyFlagFromAttrPlatform$2
                    public final void invoke(boolean z10) {
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return tf.d.f30009a;
                    }
                };
                engineHelper.getClass();
                EngineHelper.c(installReferrerUtil$setBuyFlagFromAttrPlatform$2);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        c.b((c) f13468a.getValue(), i10, str, 3, null, 16);
    }

    public static void i(Context context, int i10) {
        f13469b = i10;
        e(context).putInt("bu_flag", i10).apply();
    }

    public static void j(ReaderPdfApplication readerPdfApplication) {
        boolean z10;
        boolean z11;
        String str = "";
        try {
            final Context applicationContext = readerPdfApplication.getApplicationContext();
            kotlin.jvm.internal.g.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            f13473g = (Application) applicationContext;
            f13469b = f(applicationContext).getInt("bu_flag", -1);
            String string = f(applicationContext).getString("fl_referrer", "");
            if (string == null) {
                string = "";
            }
            c = string;
            String string2 = f(applicationContext).getString("fl_meta_referrer", "");
            if (string2 == null) {
                string2 = "";
            }
            f13470d = string2;
            LinkedHashMap linkedHashMap = f.f13487a;
            f.f(c, f13470d);
            g(applicationContext);
            boolean z12 = true;
            if (f13469b != -1) {
                if (c.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    final c cVar = (c) f13468a.getValue();
                    final String str2 = f13471e;
                    cVar.getClass();
                    final InstallReferrerClient build = InstallReferrerClient.newBuilder(applicationContext).build();
                    build.startConnection(new InstallReferrerStateListener() { // from class: com.google.android.tools.AttrsHandler$collectAttrsThenSend$1
                        @Override // com.android.installreferrer.api.InstallReferrerStateListener
                        public final void onInstallReferrerSetupFinished(int i10) {
                            t0.d0(x.b(), null, null, new AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1(i10, InstallReferrerClient.this, cVar, str2, applicationContext, null), 3);
                        }

                        @Override // com.android.installreferrer.api.InstallReferrerStateListener
                        public final void onInstallReferrerServiceDisconnected() {
                        }
                    });
                    return;
                }
            }
            if (f13471e.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                try {
                    String string3 = f(applicationContext).getString("fl_meta_campaign", "");
                    if (string3 != null) {
                        str = string3;
                    }
                    if (str.length() <= 0) {
                        z12 = false;
                    }
                    if (z12) {
                        EngineHelper.f15726a.getClass();
                        EngineHelper.i(applicationContext, "campaign", str);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                t0.s0(false, new cg.a<tf.d>() { // from class: com.google.android.tools.InstallReferrerUtil$setup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        tf.c cVar2 = InstallReferrerUtil.f13468a;
                        Context context = applicationContext;
                        kotlin.jvm.internal.g.d(context, "context");
                        tf.c cVar3 = InstallReferrerUtil.f13468a;
                        String y10 = b.b.y(context, InstallReferrerUtil.f13471e);
                        if (y10 == null) {
                            y10 = "";
                        }
                        InstallReferrerUtil.f13470d = y10;
                        Context context2 = applicationContext;
                        kotlin.jvm.internal.g.d(context2, "context");
                        String str3 = InstallReferrerUtil.f13470d;
                        InstallReferrerUtil.f13470d = str3;
                        InstallReferrerUtil.e(context2).putString("fl_meta_referrer", str3).apply();
                        if (s.k0(InstallReferrerUtil.f13470d)) {
                            c.b((c) InstallReferrerUtil.f13468a.getValue(), 3, InstallReferrerUtil.f13470d, 1, null, 24);
                            Context context3 = applicationContext;
                            kotlin.jvm.internal.g.d(context3, "context");
                            InstallReferrerUtil.i(context3, 3);
                        }
                        LinkedHashMap linkedHashMap2 = f.f13487a;
                        f.f(InstallReferrerUtil.c, InstallReferrerUtil.f13470d);
                    }
                }, 31);
                t0.d0(x.b(), null, null, new InstallReferrerUtil$fetchDeferredAppLinkData$1(applicationContext, null), 3);
            }
            final InstallReferrerClient build2 = InstallReferrerClient.newBuilder(applicationContext).build();
            build2.startConnection(new InstallReferrerStateListener() { // from class: com.google.android.tools.InstallReferrerUtil$setup$2
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerSetupFinished(int i10) {
                    t0.d0(x.b(), null, null, new InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1(i10, InstallReferrerClient.this, applicationContext, null), 3);
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerServiceDisconnected() {
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
