package gj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import lh.t;
import lib.zj.office.java.awt.Rectangle;
import sg.e;

/* compiled from: ObjView.java */
/* loaded from: classes3.dex */
public final class i extends f {

    /* renamed from: x  reason: collision with root package name */
    public ai.f f17848x;

    /* renamed from: y  reason: collision with root package name */
    public final lh.p f17849y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f17850z;

    public i() {
    }

    @Override // gj.f, ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // gj.f, ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        return this.f487j;
    }

    @Override // gj.f
    public final int G(ai.c cVar, ai.f fVar, int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        short s4;
        this.f17848x = fVar;
        byte b10 = cVar.f508a;
        lh.p pVar = this.f17849y;
        if (b10 != 1 && ((s4 = pVar.A) == 3 || s4 == 6)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f17850z = z10;
        pVar.getClass();
        boolean z12 = pVar instanceof t;
        if (z12) {
            this.f17850z = false;
        } else {
            long j10 = (this.f487j + 1) & (-1152921504606846976L);
            if (j10 == 1152921504606846976L || j10 == 2305843009213693952L) {
                this.f17850z = true;
            }
        }
        Rectangle bounds = pVar.getBounds();
        if (this.f17850z) {
            i12 = bounds.width;
            int i13 = bounds.height;
            this.f481d = i12;
            this.f482e = i13;
        } else {
            if (!z12) {
                ge.a.M(this, pVar, fVar);
            }
            i12 = 0;
        }
        this.f488k = this.f487j + 1;
        if (((i11 >>> 0) & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || i12 <= i10) {
            return 0;
        }
        return 1;
    }

    @Override // gj.f
    public final int H() {
        lh.p pVar = this.f17849y;
        pVar.getClass();
        if ((pVar instanceof t) || !this.f17850z) {
            return 0;
        }
        return (int) ((lh.s) pVar).E.f20604e.getHeight();
    }

    @Override // gj.f
    public final float K() {
        lh.p pVar = this.f17849y;
        pVar.getClass();
        if (pVar instanceof t) {
            return pVar.getBounds().width;
        }
        if (this.f17850z) {
            return (int) ((lh.s) pVar).E.f20604e.getWidth();
        }
        return 0.0f;
    }

    @Override // gj.f
    public final void L(zh.h hVar, zh.h hVar2) {
        this.f479a = hVar;
        Paint paint = new Paint();
        this.f17829r = paint;
        paint.setFlags(1);
        this.f17829r.setTextSize(20.0f);
        sg.d.b(this.f17829r);
    }

    public final void M(Canvas canvas, int i10, int i11, float f10) {
        Rectangle bounds;
        lh.i iVar;
        jh.a j10;
        kh.b bVar;
        lh.p pVar = this.f17849y;
        if (pVar == null || (bounds = pVar.getBounds()) == null) {
            return;
        }
        lib.zj.office.system.f control = getControl();
        if ((control instanceof lib.zj.office.system.p) && ((lib.zj.office.system.p) control).f21049a) {
            return;
        }
        float f11 = i10;
        int round = Math.round((this.f480b * f10) + f11);
        float f12 = i11;
        int round2 = Math.round((this.c * f10) + f12);
        double d10 = f10;
        double width = bounds.getWidth() * d10;
        double height = bounds.getHeight() * d10;
        Rect e10 = e.a.f29807a.e("ObjView");
        e10.set(round, round2, (int) Math.round(width + (this.f480b * f10) + f11), (int) Math.round(height + (this.c * f10) + f12));
        if (pVar instanceof t) {
            ai.f fVar = this.f17848x;
            int i12 = fVar.f509a;
            int i13 = fVar.f512e;
            int i14 = (i12 - i13) - fVar.f513f;
            int i15 = fVar.f510b;
            int i16 = fVar.c;
            int round3 = Math.round(((((i14 / 2.0f) + i13) * f10) + f11) - ((bounds.width * f10) / 2.0f));
            int round4 = Math.round(((((((i15 - i16) - fVar.f511d) / 2.0f) + i16) * f10) + f12) - ((bounds.height * f10) / 2.0f));
            jh.c cVar = jh.c.f19238d;
            int J = J();
            t tVar = (t) pVar;
            int i17 = tVar.J;
            if (control == null) {
                j10 = null;
            } else {
                j10 = control.o().g().j(i17);
            }
            float f13 = round3;
            float f14 = round4;
            float round5 = (float) Math.round(bounds.getWidth() * d10);
            float round6 = (float) Math.round(bounds.getHeight() * d10);
            if (tVar.E == 1) {
                if (tVar.L == null) {
                    kh.b bVar2 = new kh.b();
                    tVar.L = bVar2;
                    bVar2.f19758g = Integer.valueOf(Math.round(tVar.M * 255.0f));
                    tVar.L.f19755d = Float.valueOf(Math.round(tVar.K * 255.0f));
                }
                bVar = tVar.L;
            } else {
                bVar = null;
            }
            cVar.f(canvas, control, J, j10, f13, f14, f10, round5, round6, bVar);
        } else if ((pVar instanceof lh.s) && (iVar = ((lh.s) pVar).E) != null) {
            sg.a.d(canvas, control, J(), iVar, e10, f10);
            iVar.q(getControl()).f19232d = iVar.f20607h;
            jh.c.f19238d.f(canvas, control, J(), iVar.q(getControl()), round, round2, f10, (float) Math.round(bounds.getWidth() * d10), (float) Math.round(bounds.getHeight() * d10), iVar.f20625o);
        }
    }

    @Override // gj.f, ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // gj.f, ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        if (this.f17850z) {
            lib.zj.office.system.f control = getControl();
            float f11 = i10;
            int round = Math.round((this.f480b * f10) + f11);
            float f12 = i11;
            int round2 = Math.round((this.c * f10) + f12);
            int round3 = Math.round((this.f481d * f10) + (this.f480b * f10) + f11);
            int round4 = Math.round((this.f482e * f10) + (this.c * f10) + f12);
            Rect e10 = e.a.f29807a.e("ObjView");
            e10.set(round, round2, round3, round4);
            lh.p pVar = this.f17849y;
            pVar.getClass();
            if (!(pVar instanceof t) && (pVar instanceof lh.s)) {
                lh.i iVar = ((lh.s) pVar).E;
                sg.a.d(canvas, control, J(), iVar, e10, f10);
                jh.a q5 = iVar.q(getControl());
                q5.f19232d = iVar.f20607h;
                jh.c.f19238d.f(canvas, control, J(), q5, round, round2, f10, this.f481d * f10, this.f482e * f10, iVar.f20625o);
            }
        }
    }

    @Override // gj.f, ai.e
    public final short getType() {
        return (short) 8;
    }

    public i(lib.zj.office.system.f fVar, zh.h hVar, zh.h hVar2, lh.p pVar) {
        super(fVar, hVar, hVar2);
        this.f17849y = pVar;
    }
}
