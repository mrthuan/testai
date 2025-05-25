package v4;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;

/* compiled from: Pangle.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30540a = c.class.getName();

    /* renamed from: b  reason: collision with root package name */
    public static final String f30541b = q.class.getName();
    public static final String c = n.class.getName();

    /* renamed from: d  reason: collision with root package name */
    public static final String f30542d = h.class.getName();

    /* renamed from: e  reason: collision with root package name */
    public static final String f30543e = x.class.getName();

    /* renamed from: f  reason: collision with root package name */
    public static final String f30544f = t.class.getName();

    /* renamed from: g  reason: collision with root package name */
    public static boolean f30545g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f30546h;

    /* compiled from: Pangle.kt */
    /* loaded from: classes.dex */
    public static final class a implements PAGSdk.PAGInitCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f30547a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30548b;

        public a(g gVar, Activity activity) {
            this.f30547a = gVar;
            this.f30548b = activity;
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
        public final void fail(int i10, String str) {
            b.f30545g = false;
            this.f30547a.a(false);
            fe.a a10 = fe.a.a();
            this.f30548b.getApplicationContext();
            a10.b("Pangle Init failed:" + i10 + ' ' + str);
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
        public final void success() {
            b.f30545g = false;
            b.f30546h = true;
            this.f30547a.a(true);
            fe.a a10 = fe.a.a();
            this.f30548b.getApplicationContext();
            a10.b("Pangle Init Successful");
        }
    }

    public static void a(Activity activity, String appId, int i10, g gVar) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(appId, "appId");
        if (!f30545g) {
            f30545g = true;
            if (!f30546h) {
                if (i10 == 0) {
                    try {
                        PackageManager packageManager = activity.getApplicationContext().getPackageManager();
                        kotlin.jvm.internal.g.d(packageManager, "activity.applicationContext.packageManager");
                        i10 = packageManager.getPackageInfo(activity.getPackageName(), 0).applicationInfo.icon;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        f30545g = false;
                        gVar.a(false);
                        return;
                    }
                }
                activity.runOnUiThread(new v4.a(0, activity, new PAGConfig.Builder().appId(appId).appIcon(i10).debugLog(xd.a.f31647a).build(), gVar));
                return;
            }
            f30545g = false;
            gVar.a(true);
            return;
        }
        gVar.a(false);
    }
}
