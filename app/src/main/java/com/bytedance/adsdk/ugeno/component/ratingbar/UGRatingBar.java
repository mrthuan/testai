package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ac;
import com.bytedance.adsdk.ugeno.cJ.fl;
import com.bytedance.adsdk.ugeno.cJ.hm;

/* loaded from: classes.dex */
public class UGRatingBar extends FrameLayout {
    private Drawable CJ;
    private float Qhi;
    private LinearLayout ROR;
    private LinearLayout Sf;
    private float Tgh;
    private ac WAv;

    /* renamed from: ac  reason: collision with root package name */
    private Drawable f7911ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private double f7912fl;

    /* renamed from: hm  reason: collision with root package name */
    private Context f7913hm;

    public UGRatingBar(Context context) {
        super(context);
        this.f7913hm = context;
        this.ROR = new LinearLayout(context);
        this.Sf = new LinearLayout(context);
        this.ROR.setOrientation(0);
        this.ROR.setGravity(8388611);
        this.Sf.setOrientation(0);
        this.Sf.setGravity(8388611);
        this.f7911ac = fl.Qhi(context, "tt_star_thick");
        this.CJ = fl.Qhi(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.Qhi, (int) this.cJ);
        layoutParams.leftMargin = 1;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 1;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void Qhi(double d10, int i10, int i11, int i12) {
        removeAllViews();
        this.ROR.removeAllViews();
        this.Sf.removeAllViews();
        float f10 = i11;
        this.Qhi = (int) hm.Qhi(this.f7913hm, f10);
        this.cJ = (int) hm.Qhi(this.f7913hm, f10);
        this.f7912fl = d10;
        this.Tgh = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.Sf.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.ROR.addView(starImageView2);
        }
        addView(this.ROR);
        addView(this.Sf);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.f7911ac;
    }

    public Drawable getStarFillDrawable() {
        return this.CJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac acVar = this.WAv;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac acVar = this.WAv;
        if (acVar != null) {
            acVar.ROR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ac acVar = this.WAv;
        if (acVar != null) {
            acVar.Qhi(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        ac acVar = this.WAv;
        if (acVar != null) {
            acVar.Qhi(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.ROR.measure(i10, i11);
        double floor = Math.floor(this.f7912fl);
        float f10 = this.Qhi;
        this.Sf.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.f7912fl - floor) * f10) + ((2.0f + f10) * floor) + 1.0d), 1073741824), View.MeasureSpec.makeMeasureSpec(this.ROR.getMeasuredHeight(), 1073741824));
    }

    public void Qhi(ac acVar) {
        this.WAv = acVar;
    }
}
