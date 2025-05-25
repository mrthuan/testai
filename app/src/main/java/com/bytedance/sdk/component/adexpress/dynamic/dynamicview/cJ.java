package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.component.sdk.annotation.ColorInt;

/* compiled from: CoverDrawable.java */
/* loaded from: classes.dex */
public class cJ extends GradientDrawable {
    protected Path Qhi;
    private final Paint cJ;

    public cJ() {
        this.Qhi = new Path();
        Paint paint = new Paint(1);
        this.cJ = paint;
        paint.setColor(-1);
    }

    public void Qhi(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.Qhi;
        if (path != null && !path.isEmpty()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.cJ, 31);
            Qhi(canvas);
            this.cJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.Qhi, this.cJ);
            this.cJ.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            return;
        }
        Qhi(canvas);
    }

    public void Qhi(int i10, int i11, int i12, int i13) {
        this.Qhi.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public cJ(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.Qhi = new Path();
        Paint paint = new Paint(1);
        this.cJ = paint;
        paint.setColor(-1);
    }
}
