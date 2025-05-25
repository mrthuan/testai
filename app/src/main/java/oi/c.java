package oi;

import android.graphics.Canvas;
import android.graphics.Rect;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ColumnHeader.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f23068a;
    public float c;

    /* renamed from: b  reason: collision with root package name */
    public int f23069b = 30;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f23070d = new Rect();

    public c(f fVar) {
        this.f23068a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.graphics.Canvas r37, int r38, float r39) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.c.a(android.graphics.Canvas, int, float):void");
    }

    public final int b(Canvas canvas, float f10) {
        int i10;
        canvas.save();
        Rect clipBounds = canvas.getClipBounds();
        sg.d.f29801b.a().setTextSize(t0.f28775h * f10);
        f fVar = this.f23068a;
        this.c = fVar.c.f23072b;
        Rect clipBounds2 = canvas.getClipBounds();
        ei.c cVar = fVar.f23076b;
        ki.e eVar = fVar.f23086m;
        int i11 = eVar.f19780b;
        if (i11 <= 0) {
            i11 = 0;
        }
        if (!eVar.f19783f) {
            i11++;
            this.c = (float) ((eVar.f19785h * f10) + this.c);
        }
        if (cVar.f16601a.f16633k) {
            i10 = 256;
        } else {
            i10 = 16384;
        }
        while (this.c <= clipBounds2.right && i11 < i10) {
            if (!cVar.l(i11)) {
                this.c += cVar.d(i11) * f10;
            }
            i11++;
        }
        canvas.restore();
        return Math.min((int) this.c, clipBounds.right);
    }
}
