package com.bytedance.adsdk.lottie.ac.ac;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.WAv;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public class ac extends Qhi {
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> Gm;
    private final Paint ROR;
    private final Rect Sf;
    private final WAv WAv;

    /* renamed from: hm  reason: collision with root package name */
    private final Rect f7791hm;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Bitmap, Bitmap> f7792zc;

    public ac(com.bytedance.adsdk.lottie.hm hmVar, fl flVar) {
        super(hmVar, flVar);
        this.ROR = new com.bytedance.adsdk.lottie.Qhi.Qhi(3);
        this.Sf = new Rect();
        this.f7791hm = new Rect();
        this.WAv = hmVar.Tgh(flVar.ROR());
    }

    private Bitmap Sf() {
        Bitmap ROR;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Bitmap, Bitmap> qhi = this.f7792zc;
        if (qhi != null && (ROR = qhi.ROR()) != null) {
            return ROR;
        }
        Bitmap fl2 = this.cJ.fl(this.f7785ac.ROR());
        if (fl2 != null) {
            return fl2;
        }
        WAv wAv = this.WAv;
        if (wAv != null) {
            return wAv.Tgh();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi, com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        super.Qhi(rectF, matrix, z10);
        if (this.WAv != null) {
            float Qhi = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi();
            rectF.set(0.0f, 0.0f, this.WAv.Qhi() * Qhi, this.WAv.cJ() * Qhi);
            this.Qhi.mapRect(rectF);
        }
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi
    public void cJ(Canvas canvas, Matrix matrix, int i10) {
        Bitmap Sf = Sf();
        if (Sf != null && !Sf.isRecycled() && this.WAv != null) {
            float Qhi = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi();
            this.ROR.setAlpha(i10);
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> qhi = this.Gm;
            if (qhi != null) {
                this.ROR.setColorFilter(qhi.ROR());
            }
            canvas.save();
            canvas.concat(matrix);
            this.Sf.set(0, 0, Sf.getWidth(), Sf.getHeight());
            if (this.cJ.CJ()) {
                this.f7791hm.set(0, 0, (int) (this.WAv.Qhi() * Qhi), (int) (this.WAv.cJ() * Qhi));
            } else {
                this.f7791hm.set(0, 0, (int) (Sf.getWidth() * Qhi), (int) (Sf.getHeight() * Qhi));
            }
            canvas.drawBitmap(Sf, this.Sf, this.f7791hm, this.ROR);
            canvas.restore();
        }
    }
}
