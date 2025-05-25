package ta;

import com.google.android.gms.tasks.SuccessContinuation;

/* compiled from: SettingsController.java */
/* loaded from: classes2.dex */
public final class d implements SuccessContinuation<Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.a f29985a;

    public d(com.google.firebase.crashlytics.internal.settings.a aVar) {
        this.f29985a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: IOException | Exception -> 0x0064, TRY_LEAVE, TryCatch #4 {IOException | Exception -> 0x0064, blocks: (B:3:0x0011, B:15:0x005c), top: B:34:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // com.google.android.gms.tasks.SuccessContinuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task<java.lang.Void> j(java.lang.Void r12) {
        /*
            r11 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.Void r12 = (java.lang.Void) r12
            com.google.firebase.crashlytics.internal.settings.a r12 = r11.f29985a
            ta.b r1 = r12.f13542f
            ta.g r2 = r12.f13539b
            r1.getClass()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 0
            java.util.HashMap r7 = ta.b.c(r2)     // Catch: java.lang.Throwable -> L64
            ge.a r8 = r1.f29976b     // Catch: java.lang.Throwable -> L64
            r8.getClass()     // Catch: java.lang.Throwable -> L64
            qa.a r8 = new qa.a     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.f29975a     // Catch: java.lang.Throwable -> L64
            r8.<init>(r1, r7)     // Catch: java.lang.Throwable -> L64
            java.util.HashMap r1 = r8.c     // Catch: java.lang.Throwable -> L64
            java.lang.String r9 = "User-Agent"
            java.lang.String r10 = "Crashlytics Android SDK/18.3.6"
            r1.put(r9, r10)     // Catch: java.lang.Throwable -> L64
            java.lang.String r9 = "X-CRASHLYTICS-DEVELOPER-TOKEN"
            java.lang.String r10 = "470fa2b4ae81cd56ecbcda9735803434cec591fa"
            r1.put(r9, r10)     // Catch: java.lang.Throwable -> L64
            ta.b.a(r8, r2)     // Catch: java.lang.Throwable -> L64
            android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L64
            r7.toString()     // Catch: java.lang.Throwable -> L64
            android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L64
            com.google.android.play.core.assetpacks.h1 r1 = r8.b()     // Catch: java.lang.Throwable -> L64
            int r7 = r1.f13248a     // Catch: java.lang.Throwable -> L64
            android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L64
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 == r8) goto L59
            r8 = 201(0xc9, float:2.82E-43)
            if (r7 == r8) goto L59
            r8 = 202(0xca, float:2.83E-43)
            if (r7 == r8) goto L59
            r8 = 203(0xcb, float:2.84E-43)
            if (r7 != r8) goto L57
            goto L59
        L57:
            r7 = r3
            goto L5a
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L64
            java.lang.String r1 = r1.f13249b     // Catch: java.lang.Throwable -> L64
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r1)
            goto L65
        L64:
            r7 = r6
        L65:
            if (r7 == 0) goto Lc8
            androidx.core.content.e r1 = r12.c
            ta.c r1 = r1.j(r7)
            long r8 = r1.c
            l.t r10 = r12.f13541e
            r10.getClass()
            android.util.Log.isLoggable(r0, r5)
            java.lang.String r5 = "expires_at"
            r7.put(r5, r8)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L98
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L98
            java.lang.Object r8 = r10.f20374a     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L98
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L98
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L98
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L99
            r5.write(r8)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L99
            r5.flush()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L99
            goto L99
        L90:
            r12 = move-exception
            r6 = r5
            goto L94
        L93:
            r12 = move-exception
        L94:
            com.google.firebase.crashlytics.internal.common.CommonUtils.a(r6)
            throw r12
        L98:
            r5 = r6
        L99:
            com.google.firebase.crashlytics.internal.common.CommonUtils.a(r5)
            r7.toString()
            android.util.Log.isLoggable(r0, r4)
            java.lang.String r0 = r2.f29990f
            java.lang.String r2 = "com.google.firebase.crashlytics"
            android.content.Context r4 = r12.f13538a
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "existing_instance_identifier"
            r2.putString(r3, r0)
            r2.apply()
            java.util.concurrent.atomic.AtomicReference<ta.c> r0 = r12.f13544h
            r0.set(r1)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<ta.c>> r12 = r12.f13545i
            java.lang.Object r12 = r12.get()
            com.google.android.gms.tasks.TaskCompletionSource r12 = (com.google.android.gms.tasks.TaskCompletionSource) r12
            r12.d(r1)
        Lc8:
            d8.o r12 = com.google.android.gms.tasks.Tasks.e(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.d.j(java.lang.Object):com.google.android.gms.tasks.Task");
    }
}
