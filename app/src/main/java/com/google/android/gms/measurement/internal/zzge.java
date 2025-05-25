package com.google.android.gms.measurement.internal;

import a8.l0;
import a8.m0;
import a8.s;
import a8.v;
import a8.z0;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import b.b;
import com.android.billingclient.api.a0;
import com.android.billingclient.api.e0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzib;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzge implements m0 {
    public static volatile zzge H;
    public volatile Boolean A;
    @VisibleForTesting
    public final Boolean B;
    @VisibleForTesting
    public final Boolean C;
    public volatile boolean D;
    public int E;
    @VisibleForTesting
    public final long G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11773a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11774b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11775d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11776e;

    /* renamed from: f  reason: collision with root package name */
    public final zzab f11777f;

    /* renamed from: g  reason: collision with root package name */
    public final zzag f11778g;

    /* renamed from: h  reason: collision with root package name */
    public final v f11779h;

    /* renamed from: i  reason: collision with root package name */
    public final zzeu f11780i;

    /* renamed from: j  reason: collision with root package name */
    public final zzgb f11781j;

    /* renamed from: k  reason: collision with root package name */
    public final zzko f11782k;

    /* renamed from: l  reason: collision with root package name */
    public final zzlo f11783l;

    /* renamed from: m  reason: collision with root package name */
    public final zzep f11784m;

    /* renamed from: n  reason: collision with root package name */
    public final DefaultClock f11785n;

    /* renamed from: o  reason: collision with root package name */
    public final zziy f11786o;

    /* renamed from: p  reason: collision with root package name */
    public final zzij f11787p;

    /* renamed from: q  reason: collision with root package name */
    public final zzd f11788q;

    /* renamed from: r  reason: collision with root package name */
    public final zzin f11789r;

    /* renamed from: s  reason: collision with root package name */
    public final String f11790s;

    /* renamed from: t  reason: collision with root package name */
    public zzen f11791t;

    /* renamed from: u  reason: collision with root package name */
    public zzjy f11792u;

    /* renamed from: v  reason: collision with root package name */
    public zzaq f11793v;

    /* renamed from: w  reason: collision with root package name */
    public zzel f11794w;

    /* renamed from: y  reason: collision with root package name */
    public Boolean f11796y;

    /* renamed from: z  reason: collision with root package name */
    public long f11797z;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11795x = false;
    public final AtomicInteger F = new AtomicInteger(0);

    public zzge(zzhh zzhhVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z10 = false;
        Context context = zzhhVar.f11810a;
        zzab zzabVar = new zzab();
        this.f11777f = zzabVar;
        b.f5169a = zzabVar;
        this.f11773a = context;
        this.f11774b = zzhhVar.f11811b;
        this.c = zzhhVar.c;
        this.f11775d = zzhhVar.f11812d;
        this.f11776e = zzhhVar.f11816h;
        this.A = zzhhVar.f11813e;
        this.f11790s = zzhhVar.f11818j;
        this.D = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhhVar.f11815g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zzib.zzd(context);
        DefaultClock defaultClock = DefaultClock.f11371a;
        this.f11785n = defaultClock;
        Long l10 = zzhhVar.f11817i;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            defaultClock.getClass();
            currentTimeMillis = System.currentTimeMillis();
        }
        this.G = currentTimeMillis;
        this.f11778g = new zzag(this);
        v vVar = new v(this);
        vVar.p();
        this.f11779h = vVar;
        zzeu zzeuVar = new zzeu(this);
        zzeuVar.p();
        this.f11780i = zzeuVar;
        zzlo zzloVar = new zzlo(this);
        zzloVar.p();
        this.f11783l = zzloVar;
        this.f11784m = new zzep(new a0(this));
        this.f11788q = new zzd(this);
        zziy zziyVar = new zziy(this);
        zziyVar.o();
        this.f11786o = zziyVar;
        zzij zzijVar = new zzij(this);
        zzijVar.o();
        this.f11787p = zzijVar;
        zzko zzkoVar = new zzko(this);
        zzkoVar.o();
        this.f11782k = zzkoVar;
        zzin zzinVar = new zzin(this);
        zzinVar.p();
        this.f11789r = zzinVar;
        zzgb zzgbVar = new zzgb(this);
        zzgbVar.p();
        this.f11781j = zzgbVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhhVar.f11815g;
        z10 = (zzclVar2 == null || zzclVar2.zzb == 0) ? true : z10;
        if (context.getApplicationContext() instanceof Application) {
            e(zzijVar);
            if (((zzge) zzijVar.f3529a).f11773a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((zzge) zzijVar.f3529a).f11773a.getApplicationContext();
                if (zzijVar.c == null) {
                    zzijVar.c = new z0(zzijVar);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzijVar.c);
                    application.registerActivityLifecycleCallbacks(zzijVar.c);
                    zzeu zzeuVar2 = ((zzge) zzijVar.f3529a).f11780i;
                    f(zzeuVar2);
                    zzeuVar2.f11720n.a("Registered activity lifecycle callback");
                }
            }
        } else {
            f(zzeuVar);
            zzeuVar.f11715i.a("Application context is not an Application");
        }
        zzgbVar.u(new e0(this, zzhhVar, 1));
    }

    public static final void d(l0 l0Var) {
        if (l0Var != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void e(s sVar) {
        if (sVar != null) {
            if (sVar.f318b) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(sVar.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void f(l0 l0Var) {
        if (l0Var != null) {
            if (l0Var.f219b) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(l0Var.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzge n(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.j(context);
        Preconditions.j(context.getApplicationContext());
        if (H == null) {
            synchronized (zzge.class) {
                if (H == null) {
                    H = new zzge(new zzhh(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.j(H);
            H.A = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.j(H);
        return H;
    }

    public final void a() {
        this.F.incrementAndGet();
    }

    public final boolean b() {
        if (g() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f11797z) > 1000) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r6 = this;
            boolean r0 = r6.f11795x
            if (r0 == 0) goto Lb8
            com.google.android.gms.measurement.internal.zzgb r0 = r6.f11781j
            f(r0)
            r0.m()
            java.lang.Boolean r0 = r6.f11796y
            com.google.android.gms.common.util.DefaultClock r1 = r6.f11785n
            if (r0 == 0) goto L34
            long r2 = r6.f11797z
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb1
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f11797z
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lb1
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f11797z = r0
            com.google.android.gms.measurement.internal.zzlo r0 = r6.f11783l
            d(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.V(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.V(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f11773a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.a(r1)
            boolean r4 = r4.d()
            if (r4 != 0) goto L74
            com.google.android.gms.measurement.internal.zzag r4 = r6.f11778g
            boolean r4 = r4.z()
            if (r4 != 0) goto L74
            boolean r4 = com.google.android.gms.measurement.internal.zzlo.c0(r1)
            if (r4 == 0) goto L76
            boolean r1 = com.google.android.gms.measurement.internal.zzlo.d0(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6.f11796y = r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb1
            com.google.android.gms.measurement.internal.zzel r1 = r6.k()
            java.lang.String r1 = r1.s()
            com.google.android.gms.measurement.internal.zzel r4 = r6.k()
            r4.n()
            java.lang.String r4 = r4.f11699m
            boolean r0 = r0.N(r1, r4)
            if (r0 != 0) goto Lab
            com.google.android.gms.measurement.internal.zzel r0 = r6.k()
            r0.n()
            java.lang.String r0 = r0.f11699m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Laa
            goto Lab
        Laa:
            r2 = r3
        Lab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.f11796y = r0
        Lb1:
            java.lang.Boolean r0 = r6.f11796y
            boolean r0 = r0.booleanValue()
            return r0
        Lb8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzge.c():boolean");
    }

    public final int g() {
        zzgb zzgbVar = this.f11781j;
        f(zzgbVar);
        zzgbVar.m();
        if (this.f11778g.x()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzgb zzgbVar2 = this.f11781j;
        f(zzgbVar2);
        zzgbVar2.m();
        if (!this.D) {
            return 8;
        }
        v vVar = this.f11779h;
        d(vVar);
        Boolean t4 = vVar.t();
        if (t4 != null) {
            if (t4.booleanValue()) {
                return 0;
            }
            return 3;
        }
        zzag zzagVar = this.f11778g;
        zzab zzabVar = ((zzge) zzagVar.f3529a).f11777f;
        Boolean u7 = zzagVar.u("firebase_analytics_collection_enabled");
        if (u7 != null) {
            if (u7.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.A == null || this.A.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    public final zzd h() {
        zzd zzdVar = this.f11788q;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzag i() {
        return this.f11778g;
    }

    public final zzaq j() {
        f(this.f11793v);
        return this.f11793v;
    }

    public final zzel k() {
        e(this.f11794w);
        return this.f11794w;
    }

    public final zzen l() {
        e(this.f11791t);
        return this.f11791t;
    }

    public final zzep m() {
        return this.f11784m;
    }

    public final zzjy o() {
        e(this.f11792u);
        return this.f11792u;
    }

    @Override // a8.m0
    public final zzeu zzaA() {
        zzeu zzeuVar = this.f11780i;
        f(zzeuVar);
        return zzeuVar;
    }

    @Override // a8.m0
    public final zzgb zzaB() {
        zzgb zzgbVar = this.f11781j;
        f(zzgbVar);
        return zzgbVar;
    }

    @Override // a8.m0
    public final Context zzaw() {
        return this.f11773a;
    }

    @Override // a8.m0
    public final Clock zzax() {
        return this.f11785n;
    }

    @Override // a8.m0
    public final zzab zzay() {
        return this.f11777f;
    }
}
