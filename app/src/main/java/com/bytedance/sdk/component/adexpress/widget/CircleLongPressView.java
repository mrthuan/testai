package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.utils.pM;

/* loaded from: classes.dex */
public class CircleLongPressView extends FrameLayout {
    private TextView CJ;
    private Context Qhi;
    private AnimatorSet Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private ImageView f8270ac;
    private ImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private RingProgressView f8271fl;

    public CircleLongPressView(Context context) {
        super(context);
        this.Tgh = new AnimatorSet();
        this.Qhi = context;
        fl();
        Tgh();
    }

    private void Tgh() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8270ac, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f8270ac, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.Tgh.setDuration(800L);
        this.Tgh.playTogether(ofFloat, ofFloat2);
    }

    private void fl() {
        FrameLayout frameLayout = new FrameLayout(this.Qhi);
        this.f8271fl = new RingProgressView(this.Qhi);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 95.0f), (int) CQU.Qhi(this.Qhi, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f8271fl, layoutParams);
        this.cJ = new ImageView(this.Qhi);
        int Qhi = pM.Qhi(this.Qhi, 60.0f);
        this.cJ.setImageDrawable(com.bytedance.sdk.component.adexpress.CJ.pM.Qhi(1, null, null, new int[]{Qhi, Qhi}, Integer.valueOf(pM.Qhi(this.Qhi, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 75.0f), (int) CQU.Qhi(this.Qhi, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.cJ, layoutParams2);
        this.f8270ac = new ImageView(this.Qhi);
        int Qhi2 = pM.Qhi(this.Qhi, 50.0f);
        this.f8270ac.setImageDrawable(com.bytedance.sdk.component.adexpress.CJ.pM.Qhi(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{Qhi2, Qhi2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 63.0f), (int) CQU.Qhi(this.Qhi, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f8270ac, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.Qhi);
        this.CJ = textView;
        textView.setTextColor(-1);
        this.CJ.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.CJ, layoutParams4);
    }

    public void CJ() {
        this.f8271fl.cJ();
        this.f8271fl.ac();
    }

    public void Qhi() {
        this.Tgh.start();
    }

    public void ac() {
        this.f8271fl.Qhi();
    }

    public void cJ() {
        this.Tgh.cancel();
    }

    public void setGuideText(String str) {
        this.CJ.setText(str);
    }
}
