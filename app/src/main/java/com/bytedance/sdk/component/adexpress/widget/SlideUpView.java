package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.ac.Qhi;
import com.bytedance.sdk.component.adexpress.fl;
import com.bytedance.sdk.component.utils.ABk;

/* loaded from: classes.dex */
public class SlideUpView extends RelativeLayout {
    private TextView CJ;
    private int Gm;
    private ImageView Qhi;
    private AnimatorSet ROR;
    private AnimatorSet Sf;
    private AnimatorSet Tgh;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private ImageView f8316ac;
    private ImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private TextView f8317fl;

    /* renamed from: hm  reason: collision with root package name */
    private AnimatorSet f8318hm;

    public SlideUpView(Context context) {
        super(context);
        this.Tgh = new AnimatorSet();
        this.ROR = new AnimatorSet();
        this.Sf = new AnimatorSet();
        this.f8318hm = new AnimatorSet();
        this.Gm = 100;
        Qhi(context);
    }

    public void ac() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Qhi, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Qhi, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.Qhi, "translationY", 0.0f, CQU.Qhi(getContext(), -this.Gm));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) CQU.Qhi(getContext(), this.Gm));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (SlideUpView.this.f8316ac != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.f8316ac.getLayoutParams();
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    SlideUpView.this.f8316ac.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f8316ac, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f8316ac, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.cJ, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.cJ, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.cJ, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.cJ, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.cJ, "translationY", 0.0f, CQU.Qhi(getContext(), -this.Gm));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.ROR.setDuration(50L);
        this.f8318hm.setDuration(1500L);
        this.Sf.setDuration(50L);
        this.ROR.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.Sf.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.f8318hm.playTogether(ofFloat3, ofInt, ofFloat10);
        this.Tgh.playSequentially(this.Sf, this.f8318hm, this.ROR);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.Tgh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cJ();
    }

    public void setGuideText(String str) {
        TextView textView = this.CJ;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.f8317fl != null) {
            if (TextUtils.isEmpty(str)) {
                this.f8317fl.setText("");
            } else {
                this.f8317fl.setText(str);
            }
        }
    }

    public void Qhi(Context context) {
        if (context == null) {
            context = fl.Qhi();
        }
        if ("5".equals(this.WAv)) {
            addView(Qhi.ROR(context));
            this.Gm = (int) (this.Gm * 1.25d);
        } else {
            addView(Qhi.Tgh(context));
        }
        this.Qhi = (ImageView) findViewById(2097610734);
        this.cJ = (ImageView) findViewById(2097610735);
        this.CJ = (TextView) findViewById(2097610730);
        this.f8316ac = (ImageView) findViewById(2097610733);
        this.f8317fl = (TextView) findViewById(2097610731);
    }

    public void cJ() {
        try {
            AnimatorSet animatorSet = this.Tgh;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.Sf;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.ROR;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.f8318hm;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            ABk.cJ(e10.getMessage());
        }
    }

    public SlideUpView(Context context, String str) {
        super(context);
        this.Tgh = new AnimatorSet();
        this.ROR = new AnimatorSet();
        this.Sf = new AnimatorSet();
        this.f8318hm = new AnimatorSet();
        this.Gm = 100;
        setClipChildren(false);
        this.WAv = str;
        Qhi(context);
    }

    public void Qhi() {
        ac();
        this.Tgh.start();
        this.Tgh.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideUpView.this.Tgh.start();
                    }
                }, 200L);
            }
        });
    }
}
