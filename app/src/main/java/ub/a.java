package ub;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;

/* compiled from: ArrowDrawable.java */
/* loaded from: classes2.dex */
public final class a extends tb.a {

    /* renamed from: b  reason: collision with root package name */
    public int f30276b = 0;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Path f30277d = new Path();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int i10 = this.f30276b;
        Path path = this.f30277d;
        if (i10 != width || this.c != height) {
            path.reset();
            float f10 = (width * 30) / 225;
            float f11 = f10 * 0.70710677f;
            float f12 = f10 / 0.70710677f;
            float f13 = width;
            float f14 = f13 / 2.0f;
            float f15 = height;
            path.moveTo(f14, f15);
            float f16 = f15 / 2.0f;
            path.lineTo(0.0f, f16);
            float f17 = f16 - f11;
            path.lineTo(f11, f17);
            float f18 = f10 / 2.0f;
            float f19 = f14 - f18;
            float f20 = (f15 - f12) - f18;
            path.lineTo(f19, f20);
            path.lineTo(f19, 0.0f);
            float f21 = f14 + f18;
            path.lineTo(f21, 0.0f);
            path.lineTo(f21, f20);
            path.lineTo(f13 - f11, f17);
            path.lineTo(f13, f16);
            path.close();
            this.f30276b = width;
            this.c = height;
        }
        canvas.drawPath(path, this.f29994a);
    }
}
