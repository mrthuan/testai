package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.f;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ABk;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class TTRatingBar2 extends FrameLayout {
    private float CJ;
    LinearLayout Qhi;
    private double ROR;
    private float Sf;
    private Drawable Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private float f8321ac;
    LinearLayout cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Drawable f8322fl;

    /* renamed from: hm  reason: collision with root package name */
    private static final int f8320hm = (ABk.cJ("", 0.0f, true)[1] / 2) + 1;
    private static final int WAv = (ABk.cJ("", 0.0f, true)[1] / 2) + 3;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Qhi = new LinearLayout(getContext());
        this.cJ = new LinearLayout(getContext());
        this.Qhi.setOrientation(0);
        this.Qhi.setGravity(8388611);
        this.cJ.setOrientation(0);
        this.cJ.setGravity(8388611);
        this.f8322fl = MQ.ac(context, "tt_star_thick");
        this.Tgh = MQ.ac(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f8321ac, (int) this.CJ));
        imageView.setPadding(1, f8320hm, 1, WAv);
        return imageView;
    }

    public void Qhi(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.f8321ac = (int) CQU.ac(getContext(), f10);
        this.CJ = (int) CQU.ac(getContext(), f10);
        this.ROR = d10;
        this.Sf = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.cJ.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.Qhi.addView(starImageView2);
        }
        addView(this.Qhi);
        addView(this.cJ);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.f8322fl;
    }

    public Drawable getStarFillDrawable() {
        return this.Tgh;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        LinearLayout linearLayout;
        super.onMeasure(i10, i11);
        this.Qhi.measure(i10, i11);
        double d10 = this.ROR;
        float f10 = this.f8321ac;
        this.cJ.measure(View.MeasureSpec.makeMeasureSpec((int) f.e(d10, (int) d10, f10 - 2.0f, (((int) d10) * f10) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.Qhi.getMeasuredHeight(), 1073741824));
        if (this.Sf > 0.0f) {
            this.Qhi.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.Sf)) / 2, 0, 0);
            this.cJ.setPadding(0, ((int) (this.Qhi.getMeasuredHeight() - this.Sf)) / 2, 0, 0);
        }
    }
}
