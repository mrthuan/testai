package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.ac.Qhi;

/* loaded from: classes.dex */
public class ClickSlideUpView2 extends SlideUpView {
    private ImageView CJ;
    private TextView Qhi;
    private AnimatorSet Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private ImageView f8277ac;
    private ImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8278fl;

    public ClickSlideUpView2(Context context) {
        super(context);
        this.Tgh = new AnimatorSet();
        cJ(context);
    }

    private void CJ() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(2000L);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    private void cJ(Context context) {
        addView(Qhi.cJ(context));
        this.cJ = (ImageView) findViewById(2097610751);
        this.f8277ac = (ImageView) findViewById(2097610750);
        this.CJ = (ImageView) findViewById(2097610749);
        this.Qhi = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void Qhi(Context context) {
    }

    public float getAlphaColor() {
        return this.f8278fl;
    }

    public void setAlphaColor(int i10) {
        if (i10 >= 0 && i10 <= 60) {
            int i11 = i10 + 195;
            this.CJ.setColorFilter(Color.rgb(i11, i11, i11), PorterDuff.Mode.SRC_IN);
            int i12 = ((i10 + 20) % 60) + 195;
            this.f8277ac.setColorFilter(Color.rgb(i12, i12, i12), PorterDuff.Mode.SRC_IN);
            int i13 = ((i10 + 40) % 60) + 195;
            this.cJ.setColorFilter(Color.rgb(i13, i13, i13), PorterDuff.Mode.SRC_IN);
        }
    }

    public void setButtonText(String str) {
        if (this.Qhi != null && !TextUtils.isEmpty(str)) {
            this.Qhi.setText(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void Qhi() {
        CJ();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void cJ() {
        this.Tgh.cancel();
    }
}
