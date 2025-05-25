package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: DynamicShadowDrawable.java */
/* loaded from: classes.dex */
public class ac extends Drawable {
    private RectF CJ;
    private Paint Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f8216ac;
    private int cJ;

    public ac(int i10, int i11) {
        this.f8216ac = i10;
        this.cJ = i11;
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setColor(0);
        this.Qhi.setAntiAlias(true);
        this.Qhi.setShadowLayer(i11, 0.0f, 0.0f, -16777216);
        this.Qhi.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.CJ;
        int i10 = this.f8216ac;
        canvas.drawRoundRect(rectF, i10, i10, this.Qhi);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.Qhi.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.cJ;
        this.CJ = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.Qhi.setColorFilter(colorFilter);
    }
}
