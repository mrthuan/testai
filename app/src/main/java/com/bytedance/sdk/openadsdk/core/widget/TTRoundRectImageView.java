package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* loaded from: classes.dex */
public class TTRoundRectImageView extends PAGImageView {
    private final Matrix CJ;
    private final Paint Qhi;
    private BitmapShader Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f9286ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final RectF f9287fl;

    public TTRoundRectImageView(Context context) {
        this(context, null);
    }

    private Bitmap Qhi(Drawable drawable) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicWidth() <= 0) {
            intrinsicWidth = getWidth();
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() <= 0) {
            intrinsicHeight = getHeight();
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap Qhi;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.Tgh == null && (Qhi = Qhi(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.Tgh = new BitmapShader(Qhi, tileMode, tileMode);
            float f10 = 1.0f;
            if (Qhi.getWidth() != getWidth() || Qhi.getHeight() != getHeight()) {
                f10 = Math.max((getWidth() * 1.0f) / Qhi.getWidth(), (getHeight() * 1.0f) / Qhi.getHeight());
            }
            this.CJ.setScale(f10, f10);
            this.Tgh.setLocalMatrix(this.CJ);
        }
        BitmapShader bitmapShader = this.Tgh;
        if (bitmapShader != null) {
            this.Qhi.setShader(bitmapShader);
            canvas.drawRoundRect(this.f9287fl, this.cJ, this.f9286ac, this.Qhi);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9287fl.set(0.0f, 0.0f, i10, i11);
    }

    public void setXRound(int i10) {
        this.cJ = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f9286ac = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.Tgh = null;
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.cJ = 25;
        this.f9286ac = 25;
        this.f9287fl = new RectF();
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.CJ = new Matrix();
    }
}
