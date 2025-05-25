package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class NiceImageView extends PAGImageView {
    private int ABk;
    private int CJ;
    private Path Dww;
    private final Paint EBS;
    private int Gm;
    private float HzH;
    private RectF MQ;
    private final Context Qhi;
    private int ROR;
    private int Sf;
    private int Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8579ac;
    private final Path bxS;
    private boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8580fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8581hm;
    private int hpZ;
    private final Xfermode iMK;
    private final float[] kYc;
    private int pA;
    private final RectF qMt;
    private final float[] tP;

    /* renamed from: zc  reason: collision with root package name */
    private int f8582zc;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void CJ() {
        if (!this.cJ) {
            this.Tgh = 0;
        }
    }

    private void Qhi(Canvas canvas) {
        if (this.cJ) {
            int i10 = this.CJ;
            if (i10 > 0) {
                Qhi(canvas, i10, this.f8580fl, this.HzH - (i10 / 2.0f));
            }
            int i11 = this.Tgh;
            if (i11 > 0) {
                Qhi(canvas, i11, this.ROR, (this.HzH - this.CJ) - (i11 / 2.0f));
                return;
            }
            return;
        }
        int i12 = this.CJ;
        if (i12 > 0) {
            Qhi(canvas, i12, this.f8580fl, this.qMt, this.kYc);
        }
    }

    private void ac() {
        if (this.cJ) {
            return;
        }
        int i10 = 0;
        if (this.Sf <= 0) {
            float[] fArr = this.kYc;
            int i11 = this.f8581hm;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.WAv;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.f8582zc;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.Gm;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.tP;
            int i15 = this.CJ;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.kYc;
            if (i10 < fArr3.length) {
                int i16 = this.Sf;
                fArr3[i10] = i16;
                this.tP[i10] = i16 - (this.CJ / 2.0f);
                i10++;
            } else {
                return;
            }
        }
    }

    private void cJ() {
        if (this.cJ) {
            float min = Math.min(this.pA, this.hpZ) / 2.0f;
            this.HzH = min;
            RectF rectF = this.MQ;
            int i10 = this.pA;
            int i11 = this.hpZ;
            rectF.set((i10 / 2.0f) - min, (i11 / 2.0f) - min, (i10 / 2.0f) + min, (i11 / 2.0f) + min);
            return;
        }
        this.MQ.set(0.0f, 0.0f, this.pA, this.hpZ);
        if (this.f8579ac) {
            this.MQ = this.qMt;
        }
    }

    public void isCircle(boolean z10) {
        this.cJ = z10;
        CJ();
        cJ();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.f8579ac = z10;
        cJ();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.MQ, null, 31);
        if (!this.f8579ac) {
            int i10 = this.pA;
            int i11 = this.CJ;
            int i12 = this.Tgh;
            int i13 = this.hpZ;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.EBS.reset();
        this.bxS.reset();
        if (this.cJ) {
            this.bxS.addCircle(this.pA / 2.0f, this.hpZ / 2.0f, this.HzH, Path.Direction.CCW);
        } else {
            this.bxS.addRoundRect(this.MQ, this.tP, Path.Direction.CCW);
        }
        this.EBS.setAntiAlias(true);
        this.EBS.setStyle(Paint.Style.FILL);
        this.EBS.setXfermode(this.iMK);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.bxS, this.EBS);
        } else {
            this.Dww.addRect(this.MQ, Path.Direction.CCW);
            this.Dww.op(this.bxS, Path.Op.DIFFERENCE);
            canvas.drawPath(this.Dww, this.EBS);
        }
        this.EBS.setXfermode(null);
        int i14 = this.ABk;
        if (i14 != 0) {
            this.EBS.setColor(i14);
            canvas.drawPath(this.bxS, this.EBS);
        }
        canvas.restore();
        Qhi(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.pA = i10;
        this.hpZ = i11;
        Qhi();
        cJ();
    }

    public void setBorderColor(int i10) {
        this.f8580fl = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.CJ = zn.cJ(this.Qhi, i10);
        Qhi(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.Gm = zn.cJ(this.Qhi, i10);
        Qhi(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.f8582zc = zn.cJ(this.Qhi, i10);
        Qhi(true);
    }

    public void setCornerRadius(int i10) {
        this.Sf = zn.cJ(this.Qhi, i10);
        Qhi(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.f8581hm = zn.cJ(this.Qhi, i10);
        Qhi(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.WAv = zn.cJ(this.Qhi, i10);
        Qhi(true);
    }

    public void setInnerBorderColor(int i10) {
        this.ROR = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.Tgh = zn.cJ(this.Qhi, i10);
        CJ();
        invalidate();
    }

    public void setMaskColor(int i10) {
        this.ABk = i10;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8580fl = -1;
        this.ROR = -1;
        this.Qhi = context;
        this.Sf = zn.cJ(context, 10.0f);
        this.kYc = new float[8];
        this.tP = new float[8];
        this.qMt = new RectF();
        this.MQ = new RectF();
        this.EBS = new Paint();
        this.bxS = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.iMK = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.iMK = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.Dww = new Path();
        }
        ac();
        CJ();
    }

    private void Qhi(Canvas canvas, int i10, int i11, float f10) {
        Qhi(i10, i11);
        this.bxS.addCircle(this.pA / 2.0f, this.hpZ / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.bxS, this.EBS);
    }

    private void Qhi(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        Qhi(i10, i11);
        this.bxS.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.bxS, this.EBS);
    }

    private void Qhi(int i10, int i11) {
        this.bxS.reset();
        this.EBS.setStrokeWidth(i10);
        this.EBS.setColor(i11);
        this.EBS.setStyle(Paint.Style.STROKE);
    }

    private void Qhi() {
        if (this.cJ) {
            return;
        }
        RectF rectF = this.qMt;
        int i10 = this.CJ;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.pA - (i10 / 2.0f), this.hpZ - (i10 / 2.0f));
    }

    private void Qhi(boolean z10) {
        if (z10) {
            this.Sf = 0;
        }
        ac();
        Qhi();
        invalidate();
    }
}
