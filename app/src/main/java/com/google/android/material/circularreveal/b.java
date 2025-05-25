package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.c;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: CircularRevealHelper.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f12367a;

    /* renamed from: b  reason: collision with root package name */
    public final View f12368b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public c.d f12369d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f12370e;

    /* compiled from: CircularRevealHelper.java */
    /* loaded from: classes2.dex */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    public b(a aVar) {
        this.f12367a = aVar;
        View view = (View) aVar;
        this.f12368b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            com.google.android.material.circularreveal.c$d r0 = r9.f12369d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            float r0 = r0.c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            r0 = r0 ^ r2
            android.graphics.Paint r8 = r9.c
            com.google.android.material.circularreveal.b$a r3 = r9.f12367a
            android.view.View r4 = r9.f12368b
            if (r0 == 0) goto L45
            r3.c(r10)
            int r0 = r8.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L30
            r0 = r2
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 == 0) goto L68
            r0 = 0
            r5 = 0
            int r3 = r4.getWidth()
            float r6 = (float) r3
            int r3 = r4.getHeight()
            float r7 = (float) r3
            r3 = r10
            r4 = r0
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L68
        L45:
            r3.c(r10)
            int r0 = r8.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L54
            r0 = r2
            goto L55
        L54:
            r0 = r1
        L55:
            if (r0 == 0) goto L68
            r0 = 0
            r5 = 0
            int r3 = r4.getWidth()
            float r6 = (float) r3
            int r3 = r4.getHeight()
            float r7 = (float) r3
            r3 = r10
            r4 = r0
            r3.drawRect(r4, r5, r6, r7, r8)
        L68:
            android.graphics.drawable.Drawable r0 = r9.f12370e
            if (r0 == 0) goto L71
            com.google.android.material.circularreveal.c$d r3 = r9.f12369d
            if (r3 == 0) goto L71
            r1 = r2
        L71:
            if (r1 == 0) goto L9c
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.circularreveal.c$d r1 = r9.f12369d
            float r1 = r1.f12375a
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.c$d r2 = r9.f12369d
            float r2 = r2.f12376b
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r10.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r9.f12370e
            r0.draw(r10)
            float r0 = -r1
            float r1 = -r2
            r10.translate(r0, r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.a(android.graphics.Canvas):void");
    }

    public final int b() {
        return this.c.getColor();
    }

    public final c.d c() {
        boolean z10;
        c.d dVar = this.f12369d;
        if (dVar == null) {
            return null;
        }
        c.d dVar2 = new c.d(dVar);
        if (dVar2.c == Float.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = dVar2.f12375a;
            float f11 = dVar2.f12376b;
            View view = this.f12368b;
            dVar2.c = t0.A(f10, f11, view.getWidth(), view.getHeight());
        }
        return dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r4 = this;
            com.google.android.material.circularreveal.b$a r0 = r4.f12367a
            boolean r0 = r0.d()
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.material.circularreveal.c$d r0 = r4.f12369d
            r2 = 1
            if (r0 == 0) goto L1f
            float r0 = r0.c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            r0 = r0 ^ r2
            if (r0 != 0) goto L24
            r1 = r2
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.d():boolean");
    }

    public final void e(Drawable drawable) {
        this.f12370e = drawable;
        this.f12368b.invalidate();
    }

    public final void f(int i10) {
        this.c.setColor(i10);
        this.f12368b.invalidate();
    }

    public final void g(c.d dVar) {
        boolean z10;
        View view = this.f12368b;
        if (dVar == null) {
            this.f12369d = null;
        } else {
            c.d dVar2 = this.f12369d;
            if (dVar2 == null) {
                this.f12369d = new c.d(dVar);
            } else {
                float f10 = dVar.f12375a;
                float f11 = dVar.f12376b;
                float f12 = dVar.c;
                dVar2.f12375a = f10;
                dVar2.f12376b = f11;
                dVar2.c = f12;
            }
            if (dVar.c + 1.0E-4f >= t0.A(dVar.f12375a, dVar.f12376b, view.getWidth(), view.getHeight())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f12369d.c = Float.MAX_VALUE;
            }
        }
        view.invalidate();
    }
}
