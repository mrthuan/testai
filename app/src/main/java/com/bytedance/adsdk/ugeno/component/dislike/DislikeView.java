package com.bytedance.adsdk.ugeno.component.dislike;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.adsdk.ugeno.ac;
import com.bytedance.adsdk.ugeno.component.cJ;

/* loaded from: classes.dex */
public class DislikeView extends View {
    private RectF CJ;
    private ac Qhi;
    private float ROR;
    private Paint Sf;
    private Paint Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f7882ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Paint f7883fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f7884hm;

    public DislikeView(Context context) {
        super(context);
        Qhi();
    }

    private void Qhi() {
        Paint paint = new Paint();
        this.f7883fl = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.Sf = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.Tgh = paint3;
        paint3.setAntiAlias(true);
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.ROR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(0);
        RectF rectF = this.CJ;
        float f10 = this.ROR;
        canvas.drawRoundRect(rectF, f10, f10, this.Tgh);
        RectF rectF2 = this.CJ;
        float f11 = this.ROR;
        canvas.drawRoundRect(rectF2, f11, f11, this.f7883fl);
        int i10 = this.cJ;
        int i11 = this.f7882ac;
        canvas.drawLine(i10 * 0.3f, i11 * 0.3f, i10 * 0.7f, i11 * 0.7f, this.Sf);
        int i12 = this.cJ;
        int i13 = this.f7882ac;
        canvas.drawLine(i12 * 0.7f, i13 * 0.3f, i12 * 0.3f, i13 * 0.7f, this.Sf);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.cJ = i10;
        this.f7882ac = i11;
        int i14 = this.f7884hm;
        this.CJ = new RectF(i14, i14, this.cJ - i14, this.f7882ac - i14);
    }

    public void setBgColor(int i10) {
        this.Tgh.setStyle(Paint.Style.FILL);
        this.Tgh.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.Sf.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.Sf.setStrokeWidth(i10);
    }

    public void setRadius(float f10) {
        this.ROR = f10;
    }

    public void setStrokeColor(int i10) {
        this.f7883fl.setStyle(Paint.Style.STROKE);
        this.f7883fl.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.f7883fl.setStrokeWidth(i10);
        this.f7884hm = i10;
    }

    public void Qhi(cJ cJVar) {
        this.Qhi = cJVar;
    }
}
