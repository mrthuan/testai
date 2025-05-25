package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Ha {

    /* renamed from: b  reason: collision with root package name */
    public static Context f14325b = null;
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f14326d;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f14329g;

    /* renamed from: i  reason: collision with root package name */
    public static int f14331i;

    /* renamed from: a  reason: collision with root package name */
    public static final Ha f14324a = new Ha();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f14327e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public static final tf.c f14328f = kotlin.a.a(Ga.f14298a);

    /* renamed from: h  reason: collision with root package name */
    public static final ExecutorService f14330h = Executors.newSingleThreadExecutor(new I4("Ha"));

    public static final String b() {
        return f14326d;
    }

    public static /* synthetic */ void c() {
    }

    public static final Context d() {
        return f14325b;
    }

    public static final B6 f() {
        return (B6) f14328f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String k() {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = com.inmobi.media.Ha.c
            int r1 = r1.length()
            if (r1 != 0) goto L4f
            android.content.Context r1 = com.inmobi.media.Ha.f14325b
            if (r1 == 0) goto L15
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L13
            goto L16
        L13:
            r1 = move-exception
            goto L1f
        L15:
            r1 = 0
        L16:
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r1)     // Catch: java.lang.Exception -> L13
            kotlin.jvm.internal.g.b(r1)     // Catch: java.lang.Exception -> L13
        L1d:
            r0 = r1
            goto L4d
        L1f:
            com.inmobi.media.Sb r2 = new com.inmobi.media.Sb     // Catch: com.inmobi.media.Sb -> L29 java.lang.Exception -> L4d
            java.lang.String r1 = r1.getMessage()     // Catch: com.inmobi.media.Sb -> L29 java.lang.Exception -> L4d
            r2.<init>(r1)     // Catch: com.inmobi.media.Sb -> L29 java.lang.Exception -> L4d
            throw r2     // Catch: com.inmobi.media.Sb -> L29 java.lang.Exception -> L4d
        L29:
            r1 = move-exception
            com.inmobi.media.Q4 r2 = com.inmobi.media.Q4.f14590a
            com.inmobi.media.J1 r2 = new com.inmobi.media.J1
            r2.<init>(r1)
            com.inmobi.media.y5 r1 = com.inmobi.media.Q4.c
            r1.a(r2)
            java.lang.String r1 = "http.agent"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Exception -> L3f
            if (r1 != 0) goto L1d
            goto L4d
        L3f:
            r1 = move-exception
            com.inmobi.media.Q4 r2 = com.inmobi.media.Q4.f14590a
            java.lang.String r2 = "event"
            com.inmobi.media.J1 r1 = com.inmobi.media.AbstractC1863x4.a(r1, r2)
            com.inmobi.media.y5 r2 = com.inmobi.media.Q4.c
            r2.a(r1)
        L4d:
            com.inmobi.media.Ha.c = r0
        L4f:
            java.lang.String r0 = com.inmobi.media.Ha.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ha.k():java.lang.String");
    }

    public static final boolean m() {
        return f14327e.get();
    }

    public static final boolean o() {
        return f14329g;
    }

    public static final boolean q() {
        if (f14331i == 2) {
            return true;
        }
        return false;
    }

    public static final void u() {
        f14325b = null;
        f14326d = null;
        f14331i = 0;
    }

    public final void a(int i10) {
        f14331i = i10;
    }

    public final String h() {
        Context context = f14325b;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        return AbstractC1838v5.a(context, "coppa_store").f15579a.getString("im_accid", null);
    }

    public final int i() {
        return f14331i;
    }

    public final void s() {
        f14326d = null;
        f14325b = null;
        f14331i = 3;
    }

    public final void t() {
        f14331i = 2;
    }

    public static final void a(Runnable runnable) {
        kotlin.jvm.internal.g.e(runnable, "runnable");
        f14330h.submit(runnable);
    }

    public static final void b(boolean z10) {
        f14329g = z10;
    }

    public static final void c(Context context) {
        f14325b = context;
    }

    public static final void a(boolean z10) {
        f14327e.set(z10);
    }

    public static final boolean b(Context context, String accountId) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(accountId, "accountId");
        f14331i = 1;
        f14325b = context.getApplicationContext();
        f14327e.set(true);
        f14326d = accountId;
        return true;
    }

    public static final void c(String str) {
        f14326d = str;
    }

    public final void a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        try {
            L3.a(b(context));
        } catch (Exception unused) {
        }
    }

    public final void a() {
        Context context = f14325b;
        if (context != null) {
            File b10 = b(context);
            if (b10.mkdir()) {
                return;
            }
            b10.isDirectory();
        }
    }

    public final File b(Context context) {
        return new File(context != null ? context.getFilesDir() : null, "im_cached_content");
    }

    public final void b(String primaryAccountId) {
        kotlin.jvm.internal.g.e(primaryAccountId, "primaryAccountId");
        Context context = f14325b;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            AbstractC1838v5.a(context, "coppa_store").a("im_accid", primaryAccountId);
        }
    }

    public final boolean a(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        context.getPackageManager();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (kotlin.jvm.internal.g.a(str2, str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        kotlin.jvm.internal.g.e(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }

    public final void a(Context context, Intent intent) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(intent, "intent");
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final File a(String key) {
        kotlin.jvm.internal.g.e(key, "key");
        a();
        File b10 = b(f14325b);
        int length = key.length() / 2;
        String substring = key.substring(0, length);
        kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        StringBuilder k10 = a0.a.k(String.valueOf(substring.hashCode() & Api.BaseClientBuilder.API_PRIORITY_OTHER));
        String substring2 = key.substring(length);
        kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
        k10.append(substring2.hashCode() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return new File(b10, k10.toString());
    }
}
