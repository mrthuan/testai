package com.bytedance.sdk.component.adexpress.widget;

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
import android.widget.ImageView;

/* loaded from: classes.dex */
public class TTRoundRectImageView extends ImageView {
    private Matrix CJ;
    private Paint Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f8323ac;
    private int cJ;

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
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap Qhi = Qhi(drawable);
            if (Qhi != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(Qhi, tileMode, tileMode);
                float f10 = 1.0f;
                if (Qhi.getWidth() != getWidth() || Qhi.getHeight() != getHeight()) {
                    f10 = Math.max((getWidth() * 1.0f) / Qhi.getWidth(), (getHeight() * 1.0f) / Qhi.getHeight());
                }
                this.CJ.setScale(f10, f10);
                bitmapShader.setLocalMatrix(this.CJ);
                this.Qhi.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.cJ, this.f8323ac, this.Qhi);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setXRound(int i10) {
        this.cJ = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f8323ac = i10;
        postInvalidate();
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.cJ = 25;
        this.f8323ac = 25;
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setAntiAlias(true);
        this.Qhi.setFilterBitmap(true);
        this.CJ = new Matrix();
    }
}
