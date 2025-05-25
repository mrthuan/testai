package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import java.util.ArrayList;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: STRoot.java */
/* loaded from: classes3.dex */
public final class h extends a implements d {

    /* renamed from: p  reason: collision with root package name */
    public boolean f532p;

    /* renamed from: q  reason: collision with root package name */
    public final zh.g f533q;

    /* renamed from: u  reason: collision with root package name */
    public final xh.e f537u;

    /* renamed from: t  reason: collision with root package name */
    public final c f536t = new c();

    /* renamed from: s  reason: collision with root package name */
    public final g f535s = new g();

    /* renamed from: r  reason: collision with root package name */
    public final f f534r = new f();

    public h(xh.e eVar, zh.k kVar) {
        this.f533q = kVar;
        this.f537u = eVar;
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        e u7 = u(j10, 5, z10);
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
        e eVar = this.f490m;
        while (eVar != null) {
            if (i13 >= eVar.getY()) {
                if (i13 < eVar.e((byte) 1) + eVar.getY()) {
                    break;
                }
            }
            eVar = eVar.o();
        }
        if (eVar != null) {
            return eVar.C(i12, i13, z10);
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
        r29 = r3;
        r6 = r8;
        r3 = r14;
        r31 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G() {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.h.G():void");
    }

    @Override // ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        Canvas canvas2 = canvas;
        new ArrayList(10);
        xh.e eVar = this.f537u;
        if (eVar != null) {
            int i12 = ((int) (this.f480b * f10)) + i10;
            int i13 = ((int) (this.c * f10)) + i11;
            Rect clipBounds = canvas.getClipBounds();
            int i14 = 0;
            for (e eVar2 = this.f490m; eVar2 != null; eVar2 = eVar2.o()) {
                if (eVar2.h(clipBounds, i12, i13, f10)) {
                    qh.d a10 = eVar.a(i14);
                    if (a10 != null) {
                        qh.e d10 = a10.d();
                        int i15 = d10.c;
                        int i16 = d10.f29347d;
                        if ((i15 == -2 && i16 == -2) || ((i15 == -1 && i16 == -1) || (i15 >= 0 && i16 >= 0 && i14 >= i15 && i14 <= i16))) {
                            Rect c = eVar2.c(f10, i12, i13);
                            int duration = (int) ((a10.getDuration() * a10.a()) / 1000.0f);
                            float f11 = a10.e().c;
                            byte b10 = d10.f29346b;
                            if (b10 == 0) {
                                double pow = ((c.bottom + 5) * 2) / Math.pow(duration, 2.0d);
                                int pow2 = (int) ((Math.pow(duration * f11, 2.0d) * pow * 0.5d) + (i13 - (c.bottom + 5)));
                                if (eVar2.h(clipBounds, i12, pow2, f10) && eVar2.h(clipBounds, i12, pow2, f10)) {
                                    canvas2 = canvas;
                                    eVar2.g(canvas2, i12, pow2, f10);
                                }
                                canvas2 = canvas;
                            } else if (b10 == 1) {
                                canvas.save();
                                canvas2.rotate(a10.e().f29344b, c.centerX(), c.centerY());
                                eVar2.g(canvas2, i12, i13, f10);
                                canvas.restore();
                            } else if (b10 == 2) {
                                double pow3 = (((clipBounds.bottom - c.top) + 5) * 2) / Math.pow(duration, 2.0d);
                                int pow4 = (int) ((((clipBounds.bottom - c.top) + 5) + i13) - (Math.pow((1.0f - f11) * duration, 2.0d) * (pow3 * 0.5d)));
                                if (eVar2.h(clipBounds, i12, pow4, f10)) {
                                    canvas2 = canvas;
                                    eVar2.g(canvas2, i12, pow4, f10);
                                }
                                canvas2 = canvas;
                            } else {
                                eVar2.g(canvas2, i12, i13, f10);
                            }
                        }
                    } else {
                        eVar2.g(canvas2, i12, i13, f10);
                    }
                }
                i14++;
            }
            return;
        }
        super.g(canvas, i10, i11, f10);
    }

    @Override // ai.a, ai.e
    public final lib.zj.office.system.f getControl() {
        return this.f537u.getControl();
    }

    @Override // ai.a, ai.e
    public final zh.g getDocument() {
        return this.f533q;
    }

    @Override // ai.e
    public final short getType() {
        return (short) 3;
    }

    @Override // ai.d
    public final k m() {
        return null;
    }

    @Override // ai.a, ai.e
    public final xh.e n() {
        return this.f537u;
    }

    @Override // ai.d
    public final boolean q() {
        return false;
    }

    @Override // ai.d
    public final void k() {
    }
}
