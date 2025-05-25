package gj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.concurrent.CopyOnWriteArrayList;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: PageView.java */
/* loaded from: classes3.dex */
public final class k extends ai.a {

    /* renamed from: p  reason: collision with root package name */
    public final Paint f17857p;

    /* renamed from: q  reason: collision with root package name */
    public int f17858q;

    /* renamed from: r  reason: collision with root package name */
    public q f17859r;

    /* renamed from: s  reason: collision with root package name */
    public q f17860s;

    /* renamed from: t  reason: collision with root package name */
    public CopyOnWriteArrayList<f> f17861t;

    public k(zh.h hVar) {
        this.f479a = hVar;
        Paint paint = new Paint();
        this.f17857p = paint;
        paint.setStrokeWidth(2.0f);
        sg.d.b(paint);
    }

    public static boolean H(q qVar, int i10) {
        boolean z10;
        boolean z11;
        if (qVar == null) {
            return false;
        }
        boolean z12 = false;
        for (ai.e eVar = qVar.f490m; eVar != null; eVar = eVar.o()) {
            for (ai.e w7 = eVar.w(); w7 != null; w7 = w7.o()) {
                for (ai.e w10 = w7.w(); w10 != null; w10 = w10.o()) {
                    if (w10 instanceof f) {
                        f fVar = (f) w10;
                        ai.b bVar = fVar.f17828q;
                        if (bVar != null && bVar.f507p == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (bVar != null && bVar.f507p == 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                fVar.f17832u = i10;
                            }
                            z12 = true;
                        }
                    }
                }
            }
        }
        return z12;
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e u7 = u(j10, 5, z10);
        if (u7 != null) {
            u7.A(j10, rectangle, z10);
        }
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        int i12 = i10 - this.f480b;
        int i13 = i11 - this.c;
        ai.e eVar = this.f490m;
        if (eVar != null && i13 > eVar.getY()) {
            while (eVar != null) {
                if (i13 >= eVar.getY()) {
                    if (i13 < eVar.getHeight() + eVar.getY()) {
                        break;
                    }
                }
                eVar = eVar.o();
            }
        }
        if (eVar != null) {
            return eVar.C(i12, i13, z10);
        }
        return -1L;
    }

    public final void G(f fVar) {
        if (this.f17861t == null) {
            this.f17861t = new CopyOnWriteArrayList<>();
        }
        this.f17861t.add(fVar);
    }

    public final void I(float f10, int i10, int i11, Canvas canvas, boolean z10) {
        sg.d.b(this.f17857p);
        canvas.save();
        int i12 = ((int) (this.f480b * f10)) + i10;
        int i13 = ((int) (this.c * f10)) + i11;
        float f11 = i12;
        float f12 = i13;
        canvas.clipRect(f11, f12, (this.f481d * f10) + f11, (this.f482e * f10) + f12);
        J(canvas, i12, i13, f10);
        if (z10) {
            L(canvas, i12, i13, f10);
        }
        q qVar = this.f17859r;
        if (qVar != null) {
            qVar.f489l = this;
            qVar.g(canvas, i12, i13, f10);
        }
        q qVar2 = this.f17860s;
        if (qVar2 != null) {
            qVar2.f489l = this;
            qVar2.g(canvas, i12, i13, f10);
        }
        M(f10, i12, i13, canvas, true);
        super.g(canvas, i10, i11, f10);
        M(f10, i12, i13, canvas, false);
        canvas.restore();
    }

    public final void J(Canvas canvas, int i10, int i11, float f10) {
        int i12 = ((int) (this.f481d * f10)) + i10;
        int i13 = ((int) (this.f482e * f10)) + i11;
        Rect rect = new Rect(i10, i11, i12, i13);
        eh.b bVar = ((fj.e) getDocument()).f17305e;
        if (bVar != null) {
            sg.a.a(canvas, getControl(), this.f17858q, bVar, rect, f10);
            return;
        }
        Paint paint = this.f17857p;
        paint.setColor(aj.b.f573u);
        canvas.drawRect(i10, i11, i12 + 1, i13 + 1, paint);
    }

    public final void K(Canvas canvas, int i10, int i11, float f10) {
        Paint paint = this.f17857p;
        if (paint == null) {
            return;
        }
        sg.d.b(paint);
        int i12 = ((int) (this.f480b * f10)) + i10;
        int i13 = ((int) (this.c * f10)) + i11;
        J(canvas, i12, i13, f10);
        L(canvas, i12, i13, f10);
        q qVar = this.f17859r;
        if (qVar != null) {
            qVar.f489l = this;
            qVar.g(canvas, i12, i13, f10);
        }
        q qVar2 = this.f17860s;
        if (qVar2 != null) {
            qVar2.f489l = this;
            qVar2.g(canvas, i12, i13, f10);
        }
        M(f10, i12, i13, canvas, true);
        super.g(canvas, i10, i11, f10);
        M(f10, i12, i13, canvas, false);
    }

    public final void L(Canvas canvas, int i10, int i11, float f10) {
        float f11 = i10;
        float f12 = (this.f485h * f10) + f11;
        float f13 = i11;
        float f14 = (this.f483f * f10) + f13;
        Paint paint = this.f17857p;
        paint.setColor(-7829368);
        float f15 = f12 - 1.0f;
        float f16 = 30;
        float f17 = f14 - f16;
        canvas.drawRect(f15, f17, f12, f14, paint);
        float f18 = f12 - f16;
        float f19 = f14 - 1.0f;
        canvas.drawRect(f18, f19, f12, f14, paint);
        float f20 = f11 + ((this.f481d - this.f486i) * f10);
        float f21 = f20 + 1.0f;
        canvas.drawRect(f20, f17, f21, f14, paint);
        float f22 = f20 + f16;
        canvas.drawRect(f20, f19, f22, f14, paint);
        float f23 = f13 + ((this.f482e - this.f484g) * f10);
        float f24 = f23 + f16;
        canvas.drawRect(f15, f23, f12, f24, paint);
        float f25 = f23 + 1.0f;
        canvas.drawRect(f18, f23, f12, f25, paint);
        canvas.drawRect(f20, f23, f21, f24, paint);
        canvas.drawRect(f20, f23, f22, f25, paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(float r8, int r9, int r10, android.graphics.Canvas r11, boolean r12) {
        /*
            r7 = this;
            java.util.concurrent.CopyOnWriteArrayList<gj.f> r0 = r7.f17861t
            if (r0 == 0) goto L9f
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L9f
        Lc:
            r0 = 6
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L58
            java.util.concurrent.CopyOnWriteArrayList<gj.f> r12 = r7.f17861t
            java.util.Iterator r12 = r12.iterator()
        L17:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r12.next()
            gj.f r3 = (gj.f) r3
            boolean r4 = r3 instanceof gj.n
            if (r4 == 0) goto L43
            r4 = r3
            gj.n r4 = (gj.n) r4
            lh.p r5 = r4.f17864y
            lh.r r6 = r5.D
            if (r6 == 0) goto L38
            short r5 = r6.f20655p
            if (r5 != r0) goto L36
        L34:
            r5 = r2
            goto L3d
        L36:
            r5 = r1
            goto L3d
        L38:
            short r5 = r5.A
            if (r5 != r0) goto L36
            goto L34
        L3d:
            if (r5 == 0) goto L43
            r4.M(r11, r9, r10, r8)
            goto L17
        L43:
            boolean r4 = r3 instanceof gj.i
            if (r4 == 0) goto L17
            gj.i r3 = (gj.i) r3
            lh.p r4 = r3.f17849y
            short r4 = r4.A
            if (r4 != r0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r1
        L52:
            if (r4 == 0) goto L17
            r3.M(r11, r9, r10, r8)
            goto L17
        L58:
            java.util.concurrent.CopyOnWriteArrayList<gj.f> r12 = r7.f17861t
            java.util.Iterator r12 = r12.iterator()
        L5e:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r12.next()
            gj.f r3 = (gj.f) r3
            boolean r4 = r3 instanceof gj.n
            if (r4 == 0) goto L8a
            r4 = r3
            gj.n r4 = (gj.n) r4
            lh.p r5 = r4.f17864y
            lh.r r6 = r5.D
            if (r6 == 0) goto L7f
            short r5 = r6.f20655p
            if (r5 != r0) goto L7d
        L7b:
            r5 = r2
            goto L84
        L7d:
            r5 = r1
            goto L84
        L7f:
            short r5 = r5.A
            if (r5 != r0) goto L7d
            goto L7b
        L84:
            if (r5 != 0) goto L8a
            r4.M(r11, r9, r10, r8)
            goto L5e
        L8a:
            boolean r4 = r3 instanceof gj.i
            if (r4 == 0) goto L5e
            gj.i r3 = (gj.i) r3
            lh.p r4 = r3.f17849y
            short r4 = r4.A
            if (r4 != r0) goto L98
            r4 = r2
            goto L99
        L98:
            r4 = r1
        L99:
            if (r4 != 0) goto L5e
            r3.M(r11, r9, r10, r8)
            goto L5e
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.k.M(float, int, int, android.graphics.Canvas, boolean):void");
    }

    @Override // ai.a, ai.e
    public final void dispose() {
        super.dispose();
        q qVar = this.f17859r;
        if (qVar != null) {
            qVar.dispose();
        }
        q qVar2 = this.f17860s;
        if (qVar2 != null) {
            qVar2.dispose();
        }
        CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f17861t;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
    }

    @Override // ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        I(f10, i10, i11, canvas, true);
    }

    @Override // ai.e
    public final short getType() {
        return (short) 4;
    }

    @Override // ai.a, ai.e
    public final ai.e u(long j10, int i10, boolean z10) {
        ai.e eVar = this.f490m;
        while (eVar != null && !eVar.B(j10, z10)) {
            eVar = eVar.o();
        }
        if (eVar != null && eVar.getType() != i10 && eVar.getType() != 9) {
            return eVar.u(j10, i10, z10);
        }
        return eVar;
    }
}
