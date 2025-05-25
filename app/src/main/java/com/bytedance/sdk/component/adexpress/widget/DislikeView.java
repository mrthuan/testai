package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class DislikeView extends View {
    private Paint CJ;
    private int Qhi;
    private Paint ROR;
    private int Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final RectF f8279ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Paint f8280fl;

    public DislikeView(Context context) {
        super(context);
        this.f8279ac = new RectF();
        Qhi();
    }

    private void Qhi() {
        Paint paint = new Paint();
        this.CJ = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.ROR = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f8280fl = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f8279ac;
        int i10 = this.Tgh;
        canvas.drawRoundRect(rectF, i10, i10, this.f8280fl);
        RectF rectF2 = this.f8279ac;
        int i11 = this.Tgh;
        canvas.drawRoundRect(rectF2, i11, i11, this.CJ);
        int i12 = this.Qhi;
        int i13 = this.cJ;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.ROR);
        int i14 = this.Qhi;
        int i15 = this.cJ;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.ROR);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.Qhi = i10;
        this.cJ = i11;
        RectF rectF = this.f8279ac;
        int i14 = this.Sf;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.f8280fl.setStyle(Paint.Style.FILL);
        this.f8280fl.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.ROR.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.ROR.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.Tgh = i10;
    }

    public void setStrokeColor(int i10) {
        this.CJ.setStyle(Paint.Style.STROKE);
        this.CJ.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.CJ.setStrokeWidth(i10);
        this.Sf = i10;
    }
}
