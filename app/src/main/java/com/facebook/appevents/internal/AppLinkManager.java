package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.facebook.d;
import kotlin.jvm.internal.g;
import tf.c;

/* compiled from: AppLinkManager.kt */
/* loaded from: classes.dex */
public final class AppLinkManager {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9610b = new a();
    public static volatile AppLinkManager c;

    /* renamed from: a  reason: collision with root package name */
    public final c f9611a = kotlin.a.a(new cg.a<SharedPreferences>() { // from class: com.facebook.appevents.internal.AppLinkManager$preferences$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final SharedPreferences invoke() {
            return d.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
        }
    });

    /* compiled from: AppLinkManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.appevents.internal.AppLinkManager a() {
            /*
                r3 = this;
                java.lang.Class<com.facebook.appevents.internal.AppLinkManager> r0 = com.facebook.appevents.internal.AppLinkManager.class
                boolean r1 = k6.a.b(r0)
                r2 = 0
                if (r1 == 0) goto Lb
            L9:
                r0 = r2
                goto L13
            Lb:
                com.facebook.appevents.internal.AppLinkManager r0 = com.facebook.appevents.internal.AppLinkManager.c     // Catch: java.lang.Throwable -> Le
                goto L13
            Le:
                r1 = move-exception
                k6.a.a(r0, r1)
                goto L9
            L13:
                if (r0 != 0) goto L4c
                monitor-enter(r3)
                boolean r0 = com.facebook.d.g()     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L1e
                monitor-exit(r3)
                return r2
            L1e:
                java.lang.Class<com.facebook.appevents.internal.AppLinkManager> r0 = com.facebook.appevents.internal.AppLinkManager.class
                boolean r1 = k6.a.b(r0)     // Catch: java.lang.Throwable -> L49
                if (r1 == 0) goto L27
                goto L2e
            L27:
                com.facebook.appevents.internal.AppLinkManager r2 = com.facebook.appevents.internal.AppLinkManager.c     // Catch: java.lang.Throwable -> L2a
                goto L2e
            L2a:
                r1 = move-exception
                k6.a.a(r0, r1)     // Catch: java.lang.Throwable -> L49
            L2e:
                if (r2 != 0) goto L46
                com.facebook.appevents.internal.AppLinkManager r0 = new com.facebook.appevents.internal.AppLinkManager     // Catch: java.lang.Throwable -> L49
                r0.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.Class<com.facebook.appevents.internal.AppLinkManager> r1 = com.facebook.appevents.internal.AppLinkManager.class
                boolean r2 = k6.a.b(r1)     // Catch: java.lang.Throwable -> L49
                if (r2 == 0) goto L3e
                goto L47
            L3e:
                com.facebook.appevents.internal.AppLinkManager.c = r0     // Catch: java.lang.Throwable -> L41
                goto L47
            L41:
                r2 = move-exception
                k6.a.a(r1, r2)     // Catch: java.lang.Throwable -> L49
                goto L47
            L46:
                r0 = r2
            L47:
                monitor-exit(r3)
                goto L4c
            L49:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L4c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.AppLinkManager.a.a():com.facebook.appevents.internal.AppLinkManager");
        }
    }

    public final void a(Activity activity) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            g.e(activity, "activity");
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            g.d(intent, "activity.intent");
            b(intent, data);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #3 {all -> 0x006c, blocks: (B:5:0x0007, B:18:0x002b, B:30:0x0046, B:37:0x0060, B:9:0x0013, B:12:0x001a, B:33:0x004d, B:21:0x0032, B:24:0x0039), top: B:45:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #3 {all -> 0x006c, blocks: (B:5:0x0007, B:18:0x002b, B:30:0x0046, B:37:0x0060, B:9:0x0013, B:12:0x001a, B:33:0x004d, B:21:0x0032, B:24:0x0039), top: B:45:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Intent r5, android.net.Uri r6) {
        /*
            r4 = this;
            boolean r0 = k6.a.b(r4)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = k6.a.b(r4)     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            java.lang.String r2 = "al_applink_data"
            java.lang.String r3 = "campaign_ids"
            if (r0 == 0) goto L13
            goto L28
        L13:
            java.lang.String r6 = r6.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L24
            if (r6 != 0) goto L1a
            goto L28
        L1a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L28
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L28
            java.lang.String r6 = r0.getString(r3)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L28
            goto L29
        L24:
            r6 = move-exception
            k6.a.a(r4, r6)     // Catch: java.lang.Throwable -> L6c
        L28:
            r6 = r1
        L29:
            if (r6 != 0) goto L44
            boolean r6 = k6.a.b(r4)     // Catch: java.lang.Throwable -> L6c
            if (r6 == 0) goto L32
            goto L43
        L32:
            android.os.Bundle r5 = r5.getBundleExtra(r2)     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L39
            goto L43
        L39:
            java.lang.String r5 = r5.getString(r3)     // Catch: java.lang.Throwable -> L3f
            r6 = r5
            goto L44
        L3f:
            r5 = move-exception
            k6.a.a(r4, r5)     // Catch: java.lang.Throwable -> L6c
        L43:
            r6 = r1
        L44:
            if (r6 == 0) goto L6b
            boolean r5 = k6.a.b(r4)     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L4d
            goto L60
        L4d:
            tf.c r5 = r4.f9611a     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "<get-preferences>(...)"
            kotlin.jvm.internal.g.d(r5, r0)     // Catch: java.lang.Throwable -> L5c
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5     // Catch: java.lang.Throwable -> L5c
            r1 = r5
            goto L60
        L5c:
            r5 = move-exception
            k6.a.a(r4, r5)     // Catch: java.lang.Throwable -> L6c
        L60:
            android.content.SharedPreferences$Editor r5 = r1.edit()     // Catch: java.lang.Throwable -> L6c
            android.content.SharedPreferences$Editor r5 = r5.putString(r3, r6)     // Catch: java.lang.Throwable -> L6c
            r5.apply()     // Catch: java.lang.Throwable -> L6c
        L6b:
            return
        L6c:
            r5 = move-exception
            k6.a.a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.AppLinkManager.b(android.content.Intent, android.net.Uri):void");
    }
}
