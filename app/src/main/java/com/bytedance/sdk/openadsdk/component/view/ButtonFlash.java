package com.bytedance.sdk.openadsdk.component.view;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ButtonFlash extends TextView {
    private LinearGradient CJ;
    private int Qhi;
    private boolean ROR;
    private Matrix Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private Paint f8892ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private RectF f8893fl;

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.Tgh != null) {
            canvas.drawRoundRect(this.f8893fl, 100.0f, 100.0f, this.f8892ac);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.Qhi = i10;
        this.cJ = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.Qhi / 2.0f, this.cJ, new int[]{16777215, 1358954495, 16777215}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.CJ = linearGradient;
        this.f8892ac.setShader(linearGradient);
        this.f8892ac.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.Tgh = matrix;
        matrix.setTranslate(-this.Qhi, this.cJ);
        this.CJ.setLocalMatrix(this.Tgh);
        this.f8893fl.set(0.0f, 0.0f, this.Qhi, this.cJ);
    }

    public void setAutoRun(boolean z10) {
        this.ROR = z10;
    }
}
