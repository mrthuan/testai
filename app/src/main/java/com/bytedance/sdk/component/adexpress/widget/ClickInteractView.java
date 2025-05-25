package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class ClickInteractView extends FrameLayout {
    private ImageView Qhi;
    private AnimatorSet cJ;

    public ClickInteractView(Context context) {
        super(context);
        ac();
        CJ();
    }

    private void CJ() {
        this.cJ = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Qhi, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Qhi, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.cJ.playTogether(ofFloat, ofFloat2);
    }

    private void ac() {
        ImageView imageView = new ImageView(getContext());
        this.Qhi = imageView;
        imageView.setImageResource(MQ.CJ(getContext(), "tt_white_hand"));
        int Qhi = (int) CQU.Qhi(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Qhi, Qhi);
        layoutParams.gravity = 17;
        addView(this.Qhi, layoutParams);
    }

    public void Qhi() {
        AnimatorSet animatorSet = this.cJ;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void cJ() {
        AnimatorSet animatorSet = this.cJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
