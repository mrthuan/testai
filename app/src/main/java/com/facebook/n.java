package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.a;
import com.facebook.internal.p;
import com.facebook.n;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserSettingsManager.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f9847a = new n();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f9848b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final a f9849d = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e  reason: collision with root package name */
    public static final a f9850e = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f  reason: collision with root package name */
    public static final a f9851f = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g  reason: collision with root package name */
    public static final a f9852g = new a(false, "auto_event_setup_enabled");

    /* renamed from: h  reason: collision with root package name */
    public static final a f9853h = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i  reason: collision with root package name */
    public static SharedPreferences f9854i;

    /* compiled from: UserSettingsManager.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9855a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9856b;
        public Boolean c;

        /* renamed from: d  reason: collision with root package name */
        public long f9857d;

        public a(boolean z10, String str) {
            this.f9855a = z10;
            this.f9856b = str;
        }

        public final boolean a() {
            Boolean bool = this.c;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.f9855a;
        }
    }

    public static final boolean b() {
        if (k6.a.b(n.class)) {
            return false;
        }
        try {
            f9847a.e();
            return f9851f.a();
        } catch (Throwable th2) {
            k6.a.a(n.class, th2);
            return false;
        }
    }

    public static final boolean c() {
        if (k6.a.b(n.class)) {
            return false;
        }
        try {
            n nVar = f9847a;
            nVar.e();
            return nVar.a();
        } catch (Throwable th2) {
            k6.a.a(n.class, th2);
            return false;
        }
    }

    public static final Boolean i() {
        SharedPreferences sharedPreferences;
        boolean z10;
        String str = "";
        if (k6.a.b(n.class)) {
            return null;
        }
        try {
            f9847a.k();
            try {
                sharedPreferences = f9854i;
            } catch (JSONException unused) {
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            }
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(f9850e.f9856b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
                return null;
            }
            kotlin.jvm.internal.g.i("userSettingPref");
            throw null;
        } catch (Throwable th2) {
            k6.a.a(n.class, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b A[Catch: all -> 0x0072, TryCatch #2 {all -> 0x0072, blocks: (B:5:0x0008, B:7:0x000f, B:13:0x001b, B:15:0x0022, B:17:0x0034, B:19:0x0039, B:33:0x0065, B:36:0x006c, B:22:0x0040, B:24:0x0046, B:25:0x004f, B:27:0x0055), top: B:42:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x0072, TryCatch #2 {all -> 0x0072, blocks: (B:5:0x0008, B:7:0x000f, B:13:0x001b, B:15:0x0022, B:17:0x0034, B:19:0x0039, B:33:0x0065, B:36:0x006c, B:22:0x0040, B:24:0x0046, B:25:0x004f, B:27:0x0055), top: B:42:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065 A[Catch: all -> 0x0072, TryCatch #2 {all -> 0x0072, blocks: (B:5:0x0008, B:7:0x000f, B:13:0x001b, B:15:0x0022, B:17:0x0034, B:19:0x0039, B:33:0x0065, B:36:0x006c, B:22:0x0040, B:24:0x0046, B:25:0x004f, B:27:0x0055), top: B:42:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r5 = this;
            boolean r0 = k6.a.b(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap r0 = com.facebook.internal.FetchedAppSettingsManager.c()     // Catch: java.lang.Throwable -> L72
            r2 = 1
            if (r0 == 0) goto L18
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L16
            goto L18
        L16:
            r3 = r1
            goto L19
        L18:
            r3 = r2
        L19:
            if (r3 == 0) goto L22
            com.facebook.n$a r0 = com.facebook.n.f9850e     // Catch: java.lang.Throwable -> L72
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L72
            return r0
        L22:
            java.lang.String r3 = "auto_log_app_events_enabled"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "auto_log_app_events_default"
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L39
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L72
            return r0
        L39:
            boolean r3 = k6.a.b(r5)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L40
            goto L62
        L40:
            java.lang.Boolean r3 = i()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L4f
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L5e
            goto L63
        L4f:
            java.lang.Boolean r3 = r5.f()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L62
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L5e
            goto L63
        L5e:
            r3 = move-exception
            k6.a.a(r5, r3)     // Catch: java.lang.Throwable -> L72
        L62:
            r3 = 0
        L63:
            if (r3 == 0) goto L6a
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L72
            return r0
        L6a:
            if (r0 == 0) goto L71
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L72
            return r0
        L71:
            return r2
        L72:
            r0 = move-exception
            k6.a.a(r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.n.a():boolean");
    }

    public final void d() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            a aVar = f9852g;
            j(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.c != null && currentTimeMillis - aVar.f9857d < 604800000) {
                return;
            }
            aVar.c = null;
            aVar.f9857d = 0L;
            if (!c.compareAndSet(false, true)) {
                return;
            }
            d.c().execute(new Runnable() { // from class: t5.o
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.internal.f k10;
                    String str;
                    long j10 = currentTimeMillis;
                    if (!k6.a.b(com.facebook.n.class)) {
                        try {
                            if (com.facebook.n.f9851f.a() && (k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false)) != null && k10.f9770f) {
                                Context a10 = com.facebook.d.a();
                                com.facebook.internal.a aVar2 = com.facebook.internal.a.f9745f;
                                com.facebook.internal.a a11 = a.C0146a.a(a10);
                                if (a11 != null && a11.a() != null) {
                                    str = a11.a();
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("advertiser_id", str);
                                    bundle.putString("fields", "auto_event_setup_enabled");
                                    String str2 = com.facebook.e.f9701j;
                                    com.facebook.e g10 = e.c.g(null, "app", null);
                                    g10.f9706d = bundle;
                                    JSONObject jSONObject = g10.c().f9728b;
                                    if (jSONObject != null) {
                                        n.a aVar3 = com.facebook.n.f9852g;
                                        aVar3.c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                        aVar3.f9857d = j10;
                                        com.facebook.n.f9847a.l(aVar3);
                                    }
                                }
                            }
                            com.facebook.n.c.set(false);
                        } catch (Throwable th2) {
                            k6.a.a(com.facebook.n.class, th2);
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void e() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (!d.g()) {
                return;
            }
            if (!f9848b.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = d.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            kotlin.jvm.internal.g.d(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
            f9854i = sharedPreferences;
            a[] aVarArr = {f9850e, f9851f, f9849d};
            if (!k6.a.b(this)) {
                for (int i10 = 0; i10 < 3; i10++) {
                    a aVar = aVarArr[i10];
                    if (aVar == f9852g) {
                        d();
                    } else if (aVar.c == null) {
                        j(aVar);
                        if (aVar.c == null) {
                            g(aVar);
                        }
                    } else {
                        l(aVar);
                    }
                }
            }
            d();
            if (!k6.a.b(this)) {
                try {
                    Context a10 = d.a();
                    ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                    kotlin.jvm.internal.g.d(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                        b();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                } catch (Throwable th2) {
                    k6.a.a(this, th2);
                }
            }
            h();
        } catch (Throwable th3) {
            k6.a.a(this, th3);
        }
    }

    public final Boolean f() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            k();
            try {
                Context a10 = d.a();
                ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                kotlin.jvm.internal.g.d(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f9850e;
                    if (bundle.containsKey(aVar.f9856b)) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.f9856b));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            }
            return null;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final void g(a aVar) {
        String str = aVar.f9856b;
        if (k6.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                Context a10 = d.a();
                ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                kotlin.jvm.internal.g.d(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(str)) {
                    aVar.c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, aVar.f9855a));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1 A[Catch: all -> 0x0108, TryCatch #2 {all -> 0x0108, blocks: (B:5:0x000b, B:8:0x0014, B:11:0x001b, B:15:0x002c, B:19:0x0039, B:23:0x0046, B:27:0x0054, B:30:0x005e, B:32:0x0064, B:34:0x0068, B:35:0x0073, B:37:0x008a, B:40:0x00a7, B:44:0x00b4, B:47:0x00c9, B:52:0x00f1, B:54:0x00f9, B:55:0x00ff, B:56:0x0102, B:58:0x0104, B:59:0x0107), top: B:69:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.n.h():void");
    }

    public final void j(a aVar) {
        boolean z10;
        String str = "";
        if (k6.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                SharedPreferences sharedPreferences = f9854i;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(aVar.f9856b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        JSONObject jSONObject = new JSONObject(str);
                        aVar.c = Boolean.valueOf(jSONObject.getBoolean("value"));
                        aVar.f9857d = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i("userSettingPref");
                throw null;
            } catch (JSONException unused) {
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void k() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (f9848b.get()) {
                return;
            }
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void l(a aVar) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.c);
                jSONObject.put("last_timestamp", aVar.f9857d);
                SharedPreferences sharedPreferences = f9854i;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(aVar.f9856b, jSONObject.toString()).apply();
                    h();
                    return;
                }
                kotlin.jvm.internal.g.i("userSettingPref");
                throw null;
            } catch (Exception unused) {
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
