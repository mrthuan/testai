package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.b1;
import com.google.firebase.concurrent.SequentialExecutor;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.c;
import d8.o;
import db.b;
import eb.e;
import eb.f;
import eb.g;
import eb.i;
import eb.j;
import eb.k;
import ga.m;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f13588m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final z9.e f13589a;

    /* renamed from: b  reason: collision with root package name */
    public final c f13590b;
    public final PersistedInstallation c;

    /* renamed from: d  reason: collision with root package name */
    public final k f13591d;

    /* renamed from: e  reason: collision with root package name */
    public final m<gb.a> f13592e;

    /* renamed from: f  reason: collision with root package name */
    public final i f13593f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f13594g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f13595h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f13596i;

    /* renamed from: j  reason: collision with root package name */
    public String f13597j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f13598k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f13599l;

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0175a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13600a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f13601b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f13601b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13601b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13601b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f13600a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13600a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public a() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public a(final z9.e eVar, b bVar, ExecutorService executorService, SequentialExecutor sequentialExecutor) {
        eVar.a();
        c cVar = new c(eVar.f32308a, bVar);
        PersistedInstallation persistedInstallation = new PersistedInstallation(eVar);
        if (b1.f13179b == null) {
            b1.f13179b = new b1();
        }
        b1 b1Var = b1.f13179b;
        if (k.f16549d == null) {
            k.f16549d = new k(b1Var);
        }
        k kVar = k.f16549d;
        m<gb.a> mVar = new m<>(new b() { // from class: eb.b
            @Override // db.b
            public final Object get() {
                return new gb.a(z9.e.this);
            }
        });
        i iVar = new i();
        this.f13594g = new Object();
        this.f13598k = new HashSet();
        this.f13599l = new ArrayList();
        this.f13589a = eVar;
        this.f13590b = cVar;
        this.c = persistedInstallation;
        this.f13591d = kVar;
        this.f13592e = mVar;
        this.f13593f = iVar;
        this.f13595h = executorService;
        this.f13596i = sequentialExecutor;
    }

    @Override // eb.e
    public final o a() {
        f();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b(new f(this.f13591d, taskCompletionSource));
        this.f13595h.execute(new Runnable() { // from class: eb.d

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ boolean f16542b = false;

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.a.this.c(this.f16542b);
            }
        });
        return taskCompletionSource.f11978a;
    }

    public final void b(j jVar) {
        synchronized (this.f13594g) {
            this.f13599l.add(jVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:15:0x0040, B:16:0x0043, B:5:0x000e, B:7:0x001b, B:13:0x0025), top: B:28:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:15:0x0040, B:16:0x0043, B:5:0x000e, B:7:0x001b, B:13:0x0025), top: B:28:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = com.google.firebase.installations.a.f13588m
            monitor-enter(r0)
            z9.e r1 = r7.f13589a     // Catch: java.lang.Throwable -> L67
            r1.a()     // Catch: java.lang.Throwable -> L67
            android.content.Context r1 = r1.f32308a     // Catch: java.lang.Throwable -> L67
            androidx.appcompat.widget.i r1 = androidx.appcompat.widget.i.b(r1)     // Catch: java.lang.Throwable -> L67
            com.google.firebase.installations.local.PersistedInstallation r2 = r7.c     // Catch: java.lang.Throwable -> L60
            com.google.firebase.installations.local.a r2 = r2.c()     // Catch: java.lang.Throwable -> L60
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED     // Catch: java.lang.Throwable -> L60
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = r2.c     // Catch: java.lang.Throwable -> L60
            r5 = 0
            if (r4 == r3) goto L22
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION     // Catch: java.lang.Throwable -> L60
            if (r4 != r3) goto L20
            goto L22
        L20:
            r3 = r5
            goto L23
        L22:
            r3 = 1
        L23:
            if (r3 == 0) goto L3e
            java.lang.String r3 = r7.g(r2)     // Catch: java.lang.Throwable -> L60
            com.google.firebase.installations.local.PersistedInstallation r4 = r7.c     // Catch: java.lang.Throwable -> L60
            com.google.firebase.installations.local.a$a r6 = new com.google.firebase.installations.local.a$a     // Catch: java.lang.Throwable -> L60
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r6.f13611a = r3     // Catch: java.lang.Throwable -> L60
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r2 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED     // Catch: java.lang.Throwable -> L60
            r6.b(r2)     // Catch: java.lang.Throwable -> L60
            com.google.firebase.installations.local.a r2 = r6.a()     // Catch: java.lang.Throwable -> L60
            r4.b(r2)     // Catch: java.lang.Throwable -> L60
        L3e:
            if (r1 == 0) goto L43
            r1.h()     // Catch: java.lang.Throwable -> L67
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto L52
            com.google.firebase.installations.local.a$a r0 = new com.google.firebase.installations.local.a$a
            r0.<init>(r2)
            r1 = 0
            r0.c = r1
            com.google.firebase.installations.local.a r2 = r0.a()
        L52:
            r7.j(r2)
            java.util.concurrent.Executor r0 = r7.f13596i
            eb.c r1 = new eb.c
            r1.<init>(r5, r7, r8)
            r0.execute(r1)
            return
        L60:
            r8 = move-exception
            if (r1 == 0) goto L66
            r1.h()     // Catch: java.lang.Throwable -> L67
        L66:
            throw r8     // Catch: java.lang.Throwable -> L67
        L67:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.c(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.firebase.installations.remote.b] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.google.firebase.installations.remote.b] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final com.google.firebase.installations.local.a d(com.google.firebase.installations.local.a aVar) {
        Object obj;
        String str;
        boolean z10;
        int i10;
        char c;
        int responseCode;
        boolean z11;
        String str2;
        com.google.firebase.installations.remote.b bVar;
        z9.e eVar = this.f13589a;
        eVar.a();
        String str3 = eVar.c.f32319a;
        eVar.a();
        String str4 = eVar.c.f32324g;
        String str5 = aVar.f13607e;
        c cVar = this.f13590b;
        hb.a aVar2 = cVar.c;
        if (aVar2.b()) {
            char c10 = 2;
            ?? r11 = 1;
            URL a10 = c.a(String.format("projects/%s/installations/%s/authTokens:generate", str4, aVar.f13605b));
            int i11 = 0;
            com.google.firebase.installations.remote.b bVar2 = str4;
            while (i11 <= r11) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c11 = cVar.c(a10, str3);
                try {
                    try {
                        c11.setRequestMethod("POST");
                        c11.addRequestProperty("Authorization", "FIS_v2 " + str5);
                        c11.setDoOutput(r11);
                        c.h(c11);
                        responseCode = c11.getResponseCode();
                        aVar2.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z11 = r11;
                        } else {
                            z11 = false;
                        }
                    } catch (IOException | AssertionError unused) {
                        obj = bVar2;
                        str = str3;
                        z10 = r11;
                        i10 = i11;
                        c = c10;
                    }
                    if (z11) {
                        bVar2 = c.f(c11);
                    } else {
                        c.b(c11, null, str3, bVar2);
                        String str6 = " tokenExpirationTimestamp";
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode >= 500 && responseCode < 600) {
                                    obj = bVar2;
                                    str = str3;
                                    z10 = r11;
                                    i10 = i11;
                                } else {
                                    try {
                                        Long l10 = 0L;
                                        try {
                                            TokenResult.ResponseCode responseCode2 = TokenResult.ResponseCode.BAD_CONFIG;
                                            if (l10 != null) {
                                                str6 = "";
                                            }
                                            if (str6.isEmpty()) {
                                                bVar = new com.google.firebase.installations.remote.b(null, l10.longValue(), responseCode2);
                                            } else {
                                                throw new IllegalStateException("Missing required properties:".concat(str6));
                                            }
                                        } catch (IOException | AssertionError unused2) {
                                            i10 = i11;
                                            obj = bVar2;
                                            str = str3;
                                            z10 = r11;
                                        }
                                    } catch (IOException | AssertionError unused3) {
                                        i10 = i11;
                                        obj = bVar2;
                                        str = str3;
                                        z10 = true;
                                        c = 2;
                                        c11.disconnect();
                                        TrafficStats.clearThreadStatsTag();
                                        i11 = i10 + 1;
                                        c10 = c;
                                        str3 = str;
                                        bVar2 = obj;
                                        r11 = z10;
                                    }
                                }
                                c = 2;
                                c11.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11 = i10 + 1;
                                c10 = c;
                                str3 = str;
                                bVar2 = obj;
                                r11 = z10;
                            } else {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                            }
                        } else {
                            try {
                                i10 = i11;
                                Long l11 = 0L;
                                TokenResult.ResponseCode responseCode3 = TokenResult.ResponseCode.AUTH_ERROR;
                                if (l11 == null) {
                                    str2 = " tokenExpirationTimestamp";
                                } else {
                                    str2 = "";
                                }
                                if (str2.isEmpty()) {
                                    obj = bVar2;
                                    str = str3;
                                    try {
                                        bVar = new com.google.firebase.installations.remote.b(null, l11.longValue(), responseCode3);
                                    } catch (IOException | AssertionError unused4) {
                                        z10 = true;
                                        c = 2;
                                        c11.disconnect();
                                        TrafficStats.clearThreadStatsTag();
                                        i11 = i10 + 1;
                                        c10 = c;
                                        str3 = str;
                                        bVar2 = obj;
                                        r11 = z10;
                                    }
                                } else {
                                    obj = bVar2;
                                    str = str3;
                                    z10 = true;
                                    c = 2;
                                    try {
                                        throw new IllegalStateException("Missing required properties:".concat(str2));
                                        break;
                                    } catch (IOException | AssertionError unused5) {
                                        continue;
                                    }
                                }
                            } catch (IOException | AssertionError unused6) {
                                obj = bVar2;
                                str = str3;
                                z10 = true;
                                c = 2;
                                c11.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11 = i10 + 1;
                                c10 = c;
                                str3 = str;
                                bVar2 = obj;
                                r11 = z10;
                            }
                        }
                        bVar2 = bVar;
                    }
                    c11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int i12 = C0175a.f13601b[bVar2.c.ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                k(null);
                                a.C0176a c0176a = new a.C0176a(aVar);
                                c0176a.b(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
                                return c0176a.a();
                            }
                            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                        }
                        a.C0176a h10 = aVar.h();
                        h10.f13616g = "BAD CONFIG";
                        h10.b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
                        return h10.a();
                    }
                    k kVar = this.f13591d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.f16550a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    a.C0176a c0176a2 = new a.C0176a(aVar);
                    c0176a2.c = bVar2.f13624a;
                    c0176a2.f13614e = Long.valueOf(bVar2.f13625b);
                    c0176a2.f13615f = Long.valueOf(seconds);
                    return c0176a2.a();
                } catch (Throwable th2) {
                    c11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final void e(com.google.firebase.installations.local.a aVar) {
        synchronized (f13588m) {
            z9.e eVar = this.f13589a;
            eVar.a();
            androidx.appcompat.widget.i b10 = androidx.appcompat.widget.i.b(eVar.f32308a);
            this.c.b(aVar);
            if (b10 != null) {
                b10.h();
            }
        }
    }

    public final void f() {
        z9.e eVar = this.f13589a;
        eVar.a();
        Preconditions.g("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", eVar.c.f32320b);
        eVar.a();
        Preconditions.g("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", eVar.c.f32324g);
        eVar.a();
        Preconditions.g("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", eVar.c.f32319a);
        eVar.a();
        String str = eVar.c.f32320b;
        Pattern pattern = k.c;
        Preconditions.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        eVar.a();
        Preconditions.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.c.matcher(eVar.c.f32319a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f32309b) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(com.google.firebase.installations.local.a r3) {
        /*
            r2 = this;
            z9.e r0 = r2.f13589a
            r0.a()
            java.lang.String r0 = r0.f32309b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            z9.e r0 = r2.f13589a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f32309b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
        L1e:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r3.c
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            if (r3 != r0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            if (r3 != 0) goto L33
        L29:
            eb.i r3 = r2.f13593f
            r3.getClass()
            java.lang.String r3 = eb.i.a()
            return r3
        L33:
            ga.m<gb.a> r3 = r2.f13592e
            java.lang.Object r3 = r3.get()
            gb.a r3 = (gb.a) r3
            android.content.SharedPreferences r0 = r3.f17747a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            goto L4b
        L46:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
        L4b:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L5a
            eb.i r3 = r2.f13593f
            r3.getClass()
            java.lang.String r1 = eb.i.a()
        L5a:
            return r1
        L5b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.g(com.google.firebase.installations.local.a):java.lang.String");
    }

    @Override // eb.e
    public final o getId() {
        String str;
        f();
        synchronized (this) {
            str = this.f13597j;
        }
        if (str != null) {
            return Tasks.e(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b(new g(taskCompletionSource));
        o oVar = taskCompletionSource.f11978a;
        this.f13595h.execute(new b1.e(this, 3));
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final com.google.firebase.installations.local.a h(com.google.firebase.installations.local.a aVar) {
        int responseCode;
        boolean z10;
        com.google.firebase.installations.remote.a e10;
        String str = aVar.f13605b;
        String str2 = null;
        if (str != null && str.length() == 11) {
            gb.a aVar2 = this.f13592e.get();
            synchronized (aVar2.f17747a) {
                String[] strArr = gb.a.c;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    String str3 = strArr[i10];
                    String string = aVar2.f17747a.getString("|T|" + aVar2.f17748b + "|" + str3, null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            try {
                                str2 = new JSONObject(string).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            str2 = string;
                        }
                    } else {
                        i10++;
                    }
                }
            }
        }
        c cVar = this.f13590b;
        z9.e eVar = this.f13589a;
        eVar.a();
        String str4 = eVar.c.f32319a;
        String str5 = aVar.f13605b;
        z9.e eVar2 = this.f13589a;
        eVar2.a();
        String str6 = eVar2.c.f32324g;
        z9.e eVar3 = this.f13589a;
        eVar3.a();
        String str7 = eVar3.c.f32320b;
        hb.a aVar3 = cVar.c;
        if (aVar3.b()) {
            URL a10 = c.a(String.format("projects/%s/installations", str6));
            int i11 = 0;
            for (?? r10 = 1; i11 <= r10; r10 = 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = cVar.c(a10, str4);
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(r10);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    c.g(c, str5, str7);
                    responseCode = c.getResponseCode();
                    aVar3.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z10 = r10;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th2) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z10) {
                    e10 = c.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    c.b(c, str7, str4, str6);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            com.google.firebase.installations.remote.a aVar4 = new com.google.firebase.installations.remote.a(null, null, null, null, InstallationResponse.ResponseCode.BAD_CONFIG);
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            e10 = aVar4;
                        } else {
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i11++;
                        }
                    } else {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                }
                int i12 = C0175a.f13600a[e10.f13623e.ordinal()];
                if (i12 != r10) {
                    if (i12 == 2) {
                        a.C0176a h10 = aVar.h();
                        h10.f13616g = "BAD CONFIG";
                        h10.b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
                        return h10.a();
                    }
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }
                String str8 = e10.f13621b;
                String str9 = e10.c;
                k kVar = this.f13591d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f16550a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                String b10 = e10.f13622d.b();
                long c10 = e10.f13622d.c();
                a.C0176a c0176a = new a.C0176a(aVar);
                c0176a.f13611a = str8;
                c0176a.b(PersistedInstallation.RegistrationStatus.REGISTERED);
                c0176a.c = b10;
                c0176a.f13613d = str9;
                c0176a.f13614e = Long.valueOf(c10);
                c0176a.f13615f = Long.valueOf(seconds);
                return c0176a.a();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final void i(Exception exc) {
        synchronized (this.f13594g) {
            Iterator it = this.f13599l.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).b(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void j(com.google.firebase.installations.local.a aVar) {
        synchronized (this.f13594g) {
            Iterator it = this.f13599l.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).a(aVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void k(String str) {
        this.f13597j = str;
    }

    public final synchronized void l(com.google.firebase.installations.local.a aVar, com.google.firebase.installations.local.a aVar2) {
        if (this.f13598k.size() != 0 && !TextUtils.equals(aVar.f13605b, aVar2.f13605b)) {
            Iterator it = this.f13598k.iterator();
            while (it.hasNext()) {
                ((fb.a) it.next()).a();
            }
        }
    }
}
}
