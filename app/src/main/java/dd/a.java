package dd;

import androidx.activity.f;
import kotlin.random.XorWowRandom;
import o9.d;

/* compiled from: VerifyUtils63.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final XorWowRandom f16188a = d.c(System.currentTimeMillis());

    public static void a() {
        throw f.j(0, "System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[Catch: NameNotFoundException | Exception -> 0x0093, TryCatch #0 {NameNotFoundException | Exception -> 0x0093, blocks: (B:11:0x0036, B:26:0x0077, B:14:0x004b, B:16:0x0055, B:18:0x0061, B:21:0x006e, B:7:0x002f, B:3:0x0004), top: B:30:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r6) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            r2 = 0
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Exception -> L2e
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Exception -> L2e
            java.lang.String r4 = "mPM"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Exception -> L2e
            java.lang.String r4 = "context.packageManager.j…s.getDeclaredField(\"mPM\")"
            kotlin.jvm.internal.g.d(r3, r4)     // Catch: java.lang.Exception -> L2e
            r3.setAccessible(r1)     // Catch: java.lang.Exception -> L2e
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Exception -> L2e
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Exception -> L2e
            boolean r3 = java.lang.reflect.Proxy.isProxyClass(r3)     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L32
            r3 = r1
            goto L33
        L2e:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L93
        L32:
            r3 = r2
        L33:
            if (r3 == 0) goto L36
            return r0
        L36:
            android.content.Context r3 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L93
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "ReaderPdfApplication"
            boolean r4 = kotlin.jvm.internal.g.a(r4, r5)     // Catch: java.lang.Throwable -> L93
            if (r4 != 0) goto L4b
            goto L74
        L4b:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L93
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L93
        L53:
            if (r3 == 0) goto L73
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "android.app.Application"
            boolean r4 = kotlin.jvm.internal.g.a(r4, r5)     // Catch: java.lang.Throwable -> L93
            if (r4 != 0) goto L73
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "Killer"
            boolean r4 = kotlin.text.k.O(r4, r5, r2)     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L6e
            goto L74
        L6e:
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L93
            goto L53
        L73:
            r1 = r2
        L74:
            if (r1 == 0) goto L77
            return r0
        L77:
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L93
            r3 = 64
            android.content.pm.PackageInfo r6 = r1.getPackageInfo(r6, r3)     // Catch: java.lang.Throwable -> L93
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Throwable -> L93
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r6.toCharsString()     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "{\n            @SuppressL…toCharsString()\n        }"
            kotlin.jvm.internal.g.d(r6, r1)     // Catch: java.lang.Throwable -> L93
            r0 = r6
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.a.b(android.content.Context):java.lang.String");
    }
}
