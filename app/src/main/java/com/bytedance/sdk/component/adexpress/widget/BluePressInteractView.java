package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.MQ;
import lib.zj.office.fc.ss.util.CellUtil;

/* loaded from: classes.dex */
public class BluePressInteractView extends FrameLayout {
    private View CJ;
    private AnimatorSet Qhi;
    private ImageView ROR;
    private int Sf;
    private View Tgh;
    private Context WAv;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8263ac;
    private ObjectAnimator cJ;

    /* renamed from: fl  reason: collision with root package name */
    private View f8264fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8265hm;

    public BluePressInteractView(Context context, int i10, int i11) {
        super(context);
        this.f8263ac = false;
        this.Qhi = new AnimatorSet();
        this.Sf = i10;
        this.f8265hm = i11;
        this.WAv = context;
        ac();
        CJ();
    }

    private void CJ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.CJ, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.CJ, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f8264fl, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f8264fl, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Tgh, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.Tgh, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.ROR, CellUtil.ROTATION, 0.0f, -20.0f, 0.0f);
        this.cJ = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.Qhi.setDuration(1500L);
        this.Qhi.setInterpolator(new AccelerateDecelerateInterpolator());
        this.Qhi.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.Qhi.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.BluePressInteractView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                BluePressInteractView.this.f8263ac = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (BluePressInteractView.this.f8263ac) {
                    return;
                }
                BluePressInteractView.this.cJ.start();
                BluePressInteractView.this.Qhi.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void ac() {
        View view = new View(this.WAv);
        this.CJ = view;
        view.setBackground(Qhi("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.Sf * 0.45d), (int) (this.f8265hm * 0.45d));
        layoutParams.gravity = 17;
        this.CJ.setLayoutParams(layoutParams);
        addView(this.CJ);
        View view2 = new View(this.WAv);
        this.f8264fl = view2;
        view2.setBackground(Qhi("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.Sf * 0.25d), (int) (this.f8265hm * 0.25d));
        layoutParams2.gravity = 17;
        this.f8264fl.setLayoutParams(layoutParams2);
        addView(this.f8264fl);
        View view3 = new View(this.WAv);
        this.Tgh = view3;
        view3.setBackground(Qhi("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.Sf;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i10 * 0.25d), (int) (i10 * 0.25d));
        layoutParams3.gravity = 17;
        this.Tgh.setLayoutParams(layoutParams3);
        addView(this.Tgh);
        ImageView imageView = new ImageView(this.WAv);
        this.ROR = imageView;
        imageView.setImageResource(MQ.CJ(getContext(), "tt_blue_hand"));
        this.ROR.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.Sf * 0.62d), (int) (this.f8265hm * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.ROR.setLayoutParams(layoutParams4);
        addView(this.ROR);
    }

    public void cJ() {
        this.f8263ac = true;
        ObjectAnimator objectAnimator = this.cJ;
        if (objectAnimator == null || this.Qhi == null) {
            return;
        }
        objectAnimator.cancel();
        this.Qhi.cancel();
    }

    private GradientDrawable Qhi(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void Qhi() {
        this.f8263ac = false;
        ObjectAnimator objectAnimator = this.cJ;
        if (objectAnimator == null || this.Qhi == null) {
            return;
        }
        objectAnimator.start();
        this.Qhi.start();
    }
}
