package com.inmobi.media;

import android.app.Application;
import android.content.Context;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class O0 {

    /* renamed from: a  reason: collision with root package name */
    public static final O0 f14537a = new O0();

    /* renamed from: b  reason: collision with root package name */
    public static LinkedHashSet f14538b;
    public static boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.importance != 100) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.inmobi.media.O0 r2, android.content.Context r3) {
        /*
            r2.getClass()
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r3.getSystemService(r2)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            kotlin.jvm.internal.g.c(r2, r0)     // Catch: java.lang.Exception -> L41
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L41
            java.util.List r2 = r2.getRunningAppProcesses()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L41
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L1d
            goto L41
        L1d:
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L41
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L41
        L25:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L41
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L41
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r0.processName     // Catch: java.lang.Exception -> L41
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L25
            int r2 = r0.importance     // Catch: java.lang.Exception -> L41
            r3 = 100
            if (r2 != r3) goto L41
            r2 = 1
            goto L42
        L41:
            r2 = 0
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.O0.a(com.inmobi.media.O0, android.content.Context):boolean");
    }

    public static final /* synthetic */ String b() {
        return "O0";
    }

    public final void c() {
        c = true;
    }

    public final void d() {
        c = false;
    }

    public static final void a(O0 o02, boolean z10) {
        LinkedHashSet<M0> linkedHashSet;
        o02.getClass();
        if (Ha.d() == null || (linkedHashSet = f14538b) == null) {
            return;
        }
        for (M0 m02 : linkedHashSet) {
            try {
                ((Qb) m02).a(z10);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Context context, M0 listener) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(listener, "listener");
        if (f14538b == null) {
            f14538b = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new N0(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f14538b;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }
}
