package oi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: RowHeader.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final f f23071a;

    /* renamed from: b  reason: collision with root package name */
    public int f23072b = 50;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f23073d;

    public d(f fVar) {
        this.f23071a = fVar;
    }

    public final void a(float f10) {
        Paint a10 = sg.d.f29801b.a();
        a10.setTextSize(t0.f28775h);
        int round = Math.round(a10.measureText(String.valueOf(this.f23071a.f23086m.f19779a))) + 10;
        this.f23072b = round;
        this.f23072b = Math.round(Math.max(round, 50) * f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
        if (r15.f16603d == r3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
        if (r1.c >= r3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r15.f16603d == r3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r1.f16603d == r13) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0225, code lost:
        if (r1.c >= r13) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x022a, code lost:
        if (r1.f16603d == r13) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r35, int r36, float r37) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.d.b(android.graphics.Canvas, int, float):void");
    }

    public final int c(Canvas canvas, float f10) {
        int i10;
        float f11;
        canvas.save();
        Rect clipBounds = canvas.getClipBounds();
        sg.d.f29801b.a().setTextSize(t0.f28775h * f10);
        this.c = 30.0f * f10;
        Rect clipBounds2 = canvas.getClipBounds();
        f fVar = this.f23071a;
        ei.c cVar = fVar.f23076b;
        ki.e eVar = fVar.f23086m;
        int i11 = eVar.f19779a;
        if (i11 <= 0) {
            i11 = 0;
        }
        if (!eVar.f19782e) {
            i11++;
            this.c = (float) ((eVar.f19784g * f10) + this.c);
        }
        if (cVar.f16601a.f16633k) {
            i10 = 65536;
        } else {
            i10 = 1048576;
        }
        while (this.c <= clipBounds2.bottom && i11 < i10) {
            ei.b g10 = cVar.g(i11);
            if (g10 == null || !g10.d()) {
                if (g10 == null) {
                    f11 = fVar.f23076b.f16618s;
                } else {
                    f11 = g10.f16598f;
                }
                this.c += f11 * f10;
            }
            i11++;
        }
        canvas.restore();
        return Math.min((int) this.c, clipBounds.bottom);
    }
}
