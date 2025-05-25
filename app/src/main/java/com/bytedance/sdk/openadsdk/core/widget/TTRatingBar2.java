package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTRatingBar2 extends View {
    private Drawable CJ;
    private final Path Qhi;
    private float Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f9284ac;
    private final boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Drawable f9285fl;

    public TTRatingBar2(Context context) {
        this(context, false);
    }

    private void Qhi() {
        Context context = getContext();
        this.CJ = MQ.ac(context, this.cJ ? "tt_star_thick_dark" : "tt_star_thick");
        this.f9285fl = MQ.ac(context, "tt_star");
    }

    private void cJ() {
        int width = getWidth();
        int height = getHeight();
        if (this.Tgh > 0.0f && width > 0 && height > 0) {
            this.Qhi.reset();
            this.Qhi.addRect(new RectF(0.0f, 0.0f, width * this.Tgh, height), Path.Direction.CCW);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9284ac <= 0) {
            return;
        }
        int save = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.CJ.draw(canvas);
            canvas.translate(this.f9284ac, 0.0f);
        }
        canvas.restoreToCount(save);
        canvas.clipPath(this.Qhi);
        for (int i11 = 0; i11 < 5; i11++) {
            this.f9285fl.draw(canvas);
            canvas.translate(this.f9284ac, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f9284ac * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9284ac, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cJ();
    }

    public TTRatingBar2(Context context, boolean z10) {
        super(context);
        this.Qhi = new Path();
        this.cJ = z10;
        Qhi();
    }

    public void Qhi(double d10, int i10) {
        int Qhi = (int) zn.Qhi(getContext(), i10, false);
        this.f9284ac = Qhi;
        this.CJ.setBounds(0, 0, Qhi, Qhi);
        Drawable drawable = this.f9285fl;
        int i11 = this.f9284ac;
        drawable.setBounds(0, 0, i11, i11);
        this.Tgh = ((float) d10) / 5.0f;
        cJ();
        requestLayout();
    }
}
