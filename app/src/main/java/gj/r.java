package gj;

import java.util.ArrayList;

/* compiled from: WPLayouter.java */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final ai.c f17873a;

    /* renamed from: b  reason: collision with root package name */
    public final ai.f f17874b;
    public final ai.g c;

    /* renamed from: d  reason: collision with root package name */
    public final j f17875d;

    /* renamed from: e  reason: collision with root package name */
    public zh.g f17876e;

    /* renamed from: f  reason: collision with root package name */
    public zh.h f17877f;

    /* renamed from: h  reason: collision with root package name */
    public long f17879h;

    /* renamed from: i  reason: collision with root package name */
    public l f17880i;

    /* renamed from: j  reason: collision with root package name */
    public q f17881j;

    /* renamed from: k  reason: collision with root package name */
    public q f17882k;

    /* renamed from: l  reason: collision with root package name */
    public final o f17883l;

    /* renamed from: m  reason: collision with root package name */
    public final o f17884m;

    /* renamed from: p  reason: collision with root package name */
    public boolean f17887p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17888q;

    /* renamed from: g  reason: collision with root package name */
    public int f17878g = 1;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f17885n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public int f17886o = 0;

    public r(j jVar) {
        this.f17875d = jVar;
        ai.c cVar = new ai.c();
        this.f17873a = cVar;
        cVar.f508a = (byte) 0;
        this.f17874b = new ai.f();
        this.c = new ai.g();
        this.f17883l = new o(null);
        this.f17884m = new o(null);
    }

    public final void a() {
        boolean z10;
        zh.b bVar = zh.b.f32374b;
        ArrayList<zh.l> arrayList = bVar.f32375a;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        j jVar = this.f17875d;
        if (z10) {
            k kVar = (k) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), this.f17877f, null, 4);
            jVar.D(kVar);
            g(kVar);
            return;
        }
        zh.l b10 = bVar.b(Long.valueOf(this.f17879h + 1), this.f17874b);
        if (b10 == null) {
            return;
        }
        k kVar2 = (k) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), b10, null, 4);
        jVar.D(kVar2);
        g(kVar2);
    }

    public final void b(k kVar, l lVar, boolean z10) {
        if (lVar.getType() == 5) {
            c(kVar, lVar, z10);
        } else if (lVar.getType() == 9) {
            for (ai.e eVar = lVar.f490m; eVar != null; eVar = eVar.o()) {
                for (ai.e w7 = eVar.w(); w7 != null; w7 = w7.o()) {
                    for (ai.e w10 = w7.w(); w10 != null; w10 = w10.o()) {
                        c(kVar, lVar, z10);
                    }
                }
            }
        }
    }

    public final void c(k kVar, l lVar, boolean z10) {
        for (ai.e eVar = lVar.f490m; eVar != null; eVar = eVar.o()) {
            for (ai.e w7 = eVar.w(); w7 != null; w7 = w7.o()) {
                short type = w7.getType();
                ArrayList arrayList = this.f17885n;
                if (type == 13) {
                    n nVar = (n) w7;
                    if (!nVar.f17865z) {
                        kVar.G(nVar);
                        if (z10) {
                            arrayList.add(nVar);
                        }
                    }
                } else if (w7.getType() == 8) {
                    i iVar = (i) w7;
                    if (!iVar.f17850z) {
                        kVar.G(iVar);
                        if (z10) {
                            arrayList.add(iVar);
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        boolean z10;
        this.f17883l.a();
        j jVar = this.f17875d;
        this.f17876e = jVar.getDocument();
        zh.b bVar = zh.b.f32374b;
        ArrayList<zh.l> arrayList = bVar.f32375a;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ai.f fVar = this.f17874b;
        if (z10) {
            zh.h i10 = this.f17876e.i();
            this.f17877f = i10;
            zh.b.c(fVar, i10.d());
            k kVar = (k) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), this.f17877f, null, 4);
            jVar.D(kVar);
            g(kVar);
            b.b.K(jVar, 1.0f);
            return;
        }
        zh.l b10 = bVar.b(0L, fVar);
        if (b10 != null) {
            k kVar2 = (k) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), b10, null, 4);
            jVar.D(kVar2);
            g(kVar2);
            b.b.K(jVar, 1.0f);
        }
    }

    public final boolean e() {
        if (this.f17879h >= this.f17876e.d() && this.f17880i == null) {
            return true;
        }
        return false;
    }

    public final q f(k kVar, boolean z10) {
        long j10;
        l lVar;
        float f10;
        int i10;
        long j11;
        int i11;
        int i12;
        int L;
        boolean z11;
        if (z10) {
            j10 = 1152921504606846976L;
        } else {
            j10 = 2305843009213693952L;
        }
        zh.h a10 = this.f17876e.a(j10);
        if (a10 == null) {
            return null;
        }
        ai.f fVar = this.f17874b;
        float f11 = fVar.f519l;
        fVar.f519l = -1.0f;
        j jVar = this.f17875d;
        q qVar = (q) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), a10, null, 12);
        qVar.f17872p = jVar;
        int i13 = fVar.f512e;
        int i14 = fVar.f516i;
        qVar.f480b = i13;
        qVar.c = i14;
        long a11 = a10.a();
        int i15 = (fVar.f509a - fVar.f512e) - fVar.f513f;
        int i16 = (((fVar.f510b - fVar.c) - fVar.f511d) - 100) / 2;
        zh.h g10 = this.f17876e.g(j10);
        zh.b bVar = zh.b.f32374b;
        zh.f d10 = g10.d();
        bVar.getClass();
        if (zh.b.u(d10, (short) 4107)) {
            g10 = ((fj.e) this.f17876e).n(j10);
            lVar = (l) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), g10, null, 9);
        } else {
            lVar = (l) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), g10, null, 5);
        }
        qVar.D(lVar);
        lVar.f487j = j10;
        lVar.f488k = g10.a();
        int i17 = 1;
        int i18 = 0;
        long j12 = j10;
        int i19 = 1;
        boolean z12 = true;
        int i20 = 0;
        zh.h hVar = g10;
        l lVar2 = lVar;
        int i21 = 0;
        int i22 = 0;
        while (i16 > 0 && j12 < a11 && i21 != i17) {
            lVar2.f480b = i18;
            lVar2.c = i20;
            if (lVar2.getType() == 9) {
                o oVar = this.f17884m;
                lib.zj.office.system.f control = jVar.getControl();
                zh.g gVar = this.f17876e;
                j jVar2 = this.f17875d;
                ai.c cVar = this.f17873a;
                f10 = f11;
                ai.f fVar2 = this.f17874b;
                j11 = a11;
                ai.g gVar2 = this.c;
                p pVar = (p) lVar2;
                int i23 = i22;
                if (this.f17880i != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i11 = i23;
                i12 = i20;
                L = oVar.f(control, gVar, jVar2, cVar, fVar2, gVar2, pVar, j12, i15, i16, i19, z11);
            } else {
                f10 = f11;
                j11 = a11;
                i11 = i22;
                i12 = i20;
                this.f17884m.a();
                zh.b bVar2 = zh.b.f32374b;
                lib.zj.office.system.f control2 = jVar.getControl();
                zh.f d11 = hVar.d();
                bVar2.getClass();
                zh.b.d(control2, this.c, d11);
                L = b.b.L(jVar.getControl(), this.f17876e, this.f17873a, this.f17874b, this.c, lVar2, j12, i15, i16, i19);
            }
            i21 = L;
            int e10 = lVar2.e((byte) 1);
            if (!z12 && lVar2.f490m == null) {
                qVar.E(lVar2);
                i10 = i11;
                break;
            }
            i20 = i12 + e10;
            i22 = i11 + e10;
            long j13 = lVar2.f488k;
            i16 -= e10;
            b(kVar, lVar2, true);
            if (i16 > 0 && j13 < j11 && i21 != 1) {
                hVar = this.f17876e.g(j13);
                zh.b bVar3 = zh.b.f32374b;
                zh.f d12 = hVar.d();
                bVar3.getClass();
                if (zh.b.u(d12, (short) 4107)) {
                    hVar = ((fj.e) this.f17876e).n(j13);
                    lVar2 = (l) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), hVar, null, 9);
                } else {
                    lVar2 = (l) com.google.android.play.core.assetpacks.c.t(jVar.getControl(), hVar, null, 5);
                }
                lVar2.f487j = j13;
                qVar.D(lVar2);
            }
            int i24 = i19;
            i19 = i24 & (~((((~i24) >>> 0) | 1) << 0));
            j12 = j13;
            i18 = 0;
            z12 = false;
            i17 = 1;
            f11 = f10;
            a11 = j11;
        }
        f10 = f11;
        i10 = i22;
        qVar.f481d = i15;
        qVar.f482e = i10;
        if (!z10) {
            qVar.c = (fVar.f510b - i10) - fVar.f517j;
        }
        fVar.f519l = f10;
        return qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0564 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(gj.k r38) {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.r.g(gj.k):void");
    }
}
