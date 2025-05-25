package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.ac.Qhi;

/* loaded from: classes.dex */
public class ClickSlideUpView extends SlideUpView {
    private TextView Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private AnimatorSet f8276ac;
    private View cJ;

    public ClickSlideUpView(Context context) {
        super(context);
        this.f8276ac = new AnimatorSet();
        cJ(context);
    }

    private void CJ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.cJ, "translationY", 0.0f, CQU.Qhi(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.cJ, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.f8276ac.playTogether(ofFloat, ofFloat2);
        this.f8276ac.setDuration(1000L);
        this.f8276ac.start();
    }

    private void cJ(Context context) {
        View Qhi = Qhi.Qhi(context);
        this.cJ = Qhi;
        addView(Qhi);
        setClipChildren(false);
        this.Qhi = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void Qhi(Context context) {
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
        this.f8276ac.cancel();
    }
}
