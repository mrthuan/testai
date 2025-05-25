package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class PAGLoadingBar extends View {
    private static final int[] Qhi = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final ArrayList<Qhi> CJ;
    private int ROR;
    private int Sf;
    private final Paint Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final RectF f9254ac;
    private final RectF cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final Paint f9255fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f9256hm;

    /* loaded from: classes.dex */
    public static final class Qhi {
        float CJ;
        public Paint Qhi;

        /* renamed from: ac  reason: collision with root package name */
        float f9257ac;
        public float cJ;

        public Qhi(Paint paint, float f10, float f11, float f12) {
            this.Qhi = paint;
            this.cJ = f10;
            this.f9257ac = f11;
            this.CJ = f12;
        }
    }

    public PAGLoadingBar(Context context) {
        super(context);
        this.cJ = new RectF();
        this.f9254ac = new RectF();
        this.CJ = new ArrayList<>();
        this.Tgh = new Paint();
        Paint paint = new Paint();
        this.f9255fl = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void Qhi() {
        if (this.ROR <= 0) {
            return;
        }
        int width = (int) (((this.Sf * 1.0f) / 100.0f) * getWidth());
        this.f9254ac.right = Math.max(this.f9256hm, width);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.cJ;
        int i10 = this.ROR;
        canvas.drawRoundRect(rectF, i10, i10, this.f9255fl);
        RectF rectF2 = this.f9254ac;
        int i11 = this.ROR;
        canvas.drawRoundRect(rectF2, i11, i11, this.Tgh);
        int save = canvas.save();
        canvas.translate(this.f9254ac.right - this.f9256hm, 0.0f);
        Iterator<Qhi> it = this.CJ.iterator();
        while (it.hasNext()) {
            Qhi next = it.next();
            canvas.drawCircle(next.f9257ac, next.CJ, next.cJ, next.Qhi);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int[] iArr;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.ROR = i14;
        this.f9256hm = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.cJ.set(0.0f, 0.0f, f10, f11);
        this.f9254ac.set(0.0f, 0.0f, 0.0f, f11);
        this.Tgh.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.CJ.clear();
        float f12 = this.ROR / 4.0f;
        for (int i15 : Qhi) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.CJ.add(new Qhi(paint, this.ROR / 2.0f, f12, f11 / 2.0f));
            f12 += (this.ROR / 2.0f) * 3.0f;
        }
        Qhi();
    }

    public void setProgress(int i10) {
        int i11 = this.Sf;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.Sf = i10;
        Qhi();
    }
}
