package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class ShadowImageView extends PAGImageView {
    private Paint Qhi;
    private RectF cJ;

    public ShadowImageView(Context context) {
        super(context);
        Qhi();
    }

    private void Qhi() {
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.Qhi.setColor(Color.parseColor("#99333333"));
        this.Qhi.setAntiAlias(true);
        this.Qhi.setStrokeWidth(0.0f);
        this.cJ = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.cJ;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.Qhi);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.cJ.right != getMeasuredWidth() || this.cJ.bottom != getMeasuredHeight()) {
            this.cJ.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
