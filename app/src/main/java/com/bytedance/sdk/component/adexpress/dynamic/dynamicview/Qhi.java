package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: BitmapCoverDrawable.java */
/* loaded from: classes.dex */
public class Qhi extends cJ {

    /* renamed from: ac  reason: collision with root package name */
    private final Bitmap f8215ac;
    private final Rect cJ = new Rect();
    private final Paint CJ = new Paint(1);

    public Qhi(Bitmap bitmap, cJ cJVar) {
        this.f8215ac = bitmap;
        if (cJVar != null) {
            this.Qhi = cJVar.Qhi;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cJ
    public void Qhi(Canvas canvas) {
        canvas.drawBitmap(this.f8215ac, this.cJ, getBounds(), this.CJ);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int width2 = this.f8215ac.getWidth();
        int height2 = this.f8215ac.getHeight();
        this.cJ.set(0, 0, width2, height2);
        if (height2 >= height && width2 >= width) {
            if (width2 > width) {
                Rect rect2 = this.cJ;
                int i10 = (width2 - width) / 2;
                rect2.left = i10;
                rect2.right = i10 + width;
            }
            if (height2 > height) {
                Rect rect3 = this.cJ;
                int i11 = (height2 - height) / 2;
                rect3.top = i11;
                rect3.bottom = i11 + height;
                return;
            }
            return;
        }
        float f10 = height;
        float f11 = f10 * 1.0f;
        float f12 = height2;
        float f13 = f11 / f12;
        float f14 = width;
        float f15 = 1.0f * f14;
        float f16 = width2;
        if (Math.max(f13, f15 / f16) > f13) {
            int i12 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.cJ;
            int i13 = (height2 - i12) / 2;
            rect4.top = i13;
            rect4.bottom = i13 + i12;
            return;
        }
        int i14 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.cJ;
        int i15 = (width2 - i14) / 2;
        rect5.left = i15;
        rect5.right = i15 + i14;
    }
}
