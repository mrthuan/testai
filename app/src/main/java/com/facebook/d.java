package com.facebook;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.a;
import com.facebook.internal.p;
import com.facebook.internal.q;
import com.facebook.n;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: FacebookSdk.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static Executor f9687d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile String f9688e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile String f9689f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile String f9690g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile Boolean f9691h;

    /* renamed from: j  reason: collision with root package name */
    public static Context f9693j;

    /* renamed from: m  reason: collision with root package name */
    public static final String f9696m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicBoolean f9697n;

    /* renamed from: o  reason: collision with root package name */
    public static volatile String f9698o;

    /* renamed from: p  reason: collision with root package name */
    public static final t5.i f9699p;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f9700q;

    /* renamed from: a  reason: collision with root package name */
    public static final d f9685a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final String f9686b = d.class.getCanonicalName();
    public static final HashSet<LoggingBehavior> c = ea.a.u(LoggingBehavior.DEVELOPER_ERRORS);

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLong f9692i = new AtomicLong(65536);

    /* renamed from: k  reason: collision with root package name */
    public static int f9694k = 64206;

    /* renamed from: l  reason: collision with root package name */
    public static final ReentrantLock f9695l = new ReentrantLock();

    static {
        int i10 = com.facebook.internal.m.f9811a;
        f9696m = "v16.0";
        f9697n = new AtomicBoolean(false);
        f9698o = "facebook.com";
        f9699p = new t5.i(0);
    }

    public static final Context a() {
        q.e();
        Context context = f9693j;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.g.i("applicationContext");
        throw null;
    }

    public static final String b() {
        q.e();
        String str = f9688e;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = f9695l;
        reentrantLock.lock();
        try {
            if (f9687d == null) {
                f9687d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            tf.d dVar = tf.d.f30009a;
            reentrantLock.unlock();
            Executor executor = f9687d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String d() {
        String str;
        Date date = a.f9420l;
        a b10 = a.b.b();
        if (b10 != null) {
            str = b10.f9432k;
        } else {
            str = null;
        }
        p pVar = p.f9815a;
        String str2 = f9698o;
        if (str != null) {
            if (kotlin.jvm.internal.g.a(str, "gaming")) {
                return kotlin.text.j.K(str2, "facebook.com", "fb.gg");
            }
            if (kotlin.jvm.internal.g.a(str, "instagram")) {
                return kotlin.text.j.K(str2, "facebook.com", "instagram.com");
            }
            return str2;
        }
        return str2;
    }

    public static final boolean e(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        q.e();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean f() {
        boolean z10;
        synchronized (d.class) {
            z10 = f9700q;
        }
        return z10;
    }

    public static final boolean g() {
        return f9697n.get();
    }

    public static final void h(LoggingBehavior behavior) {
        kotlin.jvm.internal.g.e(behavior, "behavior");
        synchronized (c) {
        }
    }

    public static final void i(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.g.d(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f9688e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.g.d(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (kotlin.text.j.M(lowerCase, "fb", false)) {
                        String substring = str.substring(2);
                        kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
                        f9688e = substring;
                    } else {
                        f9688e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f9689f == null) {
                f9689f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f9690g == null) {
                f9690g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f9694k == 64206) {
                f9694k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f9691h == null) {
                f9691h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x0170, TryCatch #5 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0016, B:11:0x001d, B:12:0x0020, B:14:0x0038, B:16:0x0040, B:22:0x004c, B:24:0x0050, B:30:0x005c, B:39:0x007f, B:40:0x0081, B:42:0x0085, B:44:0x0089, B:46:0x008f, B:48:0x0093, B:52:0x00a4, B:54:0x00ac, B:56:0x00b0, B:63:0x00c7, B:64:0x00cc, B:65:0x00cd, B:75:0x00f6, B:77:0x00fc, B:80:0x014e, B:81:0x0153, B:49:0x009b, B:50:0x00a0, B:51:0x00a1, B:82:0x0154, B:83:0x0159, B:84:0x015a, B:85:0x0161, B:86:0x0162, B:87:0x0169, B:88:0x016a, B:89:0x016f, B:68:0x00db, B:71:0x00e4, B:59:0x00b9, B:33:0x006c), top: B:94:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0016, B:11:0x001d, B:12:0x0020, B:14:0x0038, B:16:0x0040, B:22:0x004c, B:24:0x0050, B:30:0x005c, B:39:0x007f, B:40:0x0081, B:42:0x0085, B:44:0x0089, B:46:0x008f, B:48:0x0093, B:52:0x00a4, B:54:0x00ac, B:56:0x00b0, B:63:0x00c7, B:64:0x00cc, B:65:0x00cd, B:75:0x00f6, B:77:0x00fc, B:80:0x014e, B:81:0x0153, B:49:0x009b, B:50:0x00a0, B:51:0x00a1, B:82:0x0154, B:83:0x0159, B:84:0x015a, B:85:0x0161, B:86:0x0162, B:87:0x0169, B:88:0x016a, B:89:0x016f, B:68:0x00db, B:71:0x00e4, B:59:0x00b9, B:33:0x006c), top: B:94:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a A[Catch: all -> 0x0170, TryCatch #5 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0016, B:11:0x001d, B:12:0x0020, B:14:0x0038, B:16:0x0040, B:22:0x004c, B:24:0x0050, B:30:0x005c, B:39:0x007f, B:40:0x0081, B:42:0x0085, B:44:0x0089, B:46:0x008f, B:48:0x0093, B:52:0x00a4, B:54:0x00ac, B:56:0x00b0, B:63:0x00c7, B:64:0x00cc, B:65:0x00cd, B:75:0x00f6, B:77:0x00fc, B:80:0x014e, B:81:0x0153, B:49:0x009b, B:50:0x00a0, B:51:0x00a1, B:82:0x0154, B:83:0x0159, B:84:0x015a, B:85:0x0161, B:86:0x0162, B:87:0x0169, B:88:0x016a, B:89:0x016f, B:68:0x00db, B:71:0x00e4, B:59:0x00b9, B:33:0x006c), top: B:94:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162 A[Catch: all -> 0x0170, TryCatch #5 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0016, B:11:0x001d, B:12:0x0020, B:14:0x0038, B:16:0x0040, B:22:0x004c, B:24:0x0050, B:30:0x005c, B:39:0x007f, B:40:0x0081, B:42:0x0085, B:44:0x0089, B:46:0x008f, B:48:0x0093, B:52:0x00a4, B:54:0x00ac, B:56:0x00b0, B:63:0x00c7, B:64:0x00cc, B:65:0x00cd, B:75:0x00f6, B:77:0x00fc, B:80:0x014e, B:81:0x0153, B:49:0x009b, B:50:0x00a0, B:51:0x00a1, B:82:0x0154, B:83:0x0159, B:84:0x015a, B:85:0x0161, B:86:0x0162, B:87:0x0169, B:88:0x016a, B:89:0x016f, B:68:0x00db, B:71:0x00e4, B:59:0x00b9, B:33:0x006c), top: B:94:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void j(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.d.j(android.content.Context):void");
    }

    public static final void k() {
        n nVar = n.f9847a;
        if (!k6.a.b(n.class)) {
            try {
                n.a aVar = n.f9849d;
                aVar.c = Boolean.TRUE;
                aVar.f9857d = System.currentTimeMillis();
                boolean z10 = n.f9848b.get();
                n nVar2 = n.f9847a;
                if (z10) {
                    nVar2.l(aVar);
                } else {
                    nVar2.e();
                }
            } catch (Throwable th2) {
                k6.a.a(n.class, th2);
            }
        }
        f9700q = true;
    }
}
