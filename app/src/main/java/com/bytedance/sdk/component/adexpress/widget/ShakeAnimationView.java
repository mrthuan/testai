package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.qMt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ShakeAnimationView extends LinearLayout {
    private qMt CJ;
    private int Gm;
    private TextView Qhi;
    private Qhi ROR;
    private LinearLayout Sf;
    private TextView Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private ImageView f8307ac;
    private TextView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private TextView f8308fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8309hm;

    /* renamed from: zc  reason: collision with root package name */
    private JSONObject f8310zc;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShakeAnimationView.this.f8307ac != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new cJ(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ShakeAnimationView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ShakeAnimationView.this.f8307ac.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                ShakeAnimationView.this.f8307ac.startAnimation(rotateAnimation);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface Qhi {
    }

    /* loaded from: classes.dex */
    public static class cJ implements Interpolator {
        private cJ() {
        }

        public /* synthetic */ cJ(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 <= 0.25f) {
                return (f10 * (-2.0f)) + 0.5f;
            }
            if (f10 <= 0.5f) {
                return (f10 * 4.0f) - 1.0f;
            }
            if (f10 <= 0.75f) {
                return (f10 * (-4.0f)) + 3.0f;
            }
            return (f10 * 2.0f) - 1.5f;
        }
    }

    public ShakeAnimationView(Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.f8309hm = i10;
        this.WAv = i11;
        this.Gm = i12;
        this.f8310zc = jSONObject;
        Qhi(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.Sf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.CJ == null) {
                this.CJ = new qMt(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.2
            };
            this.CJ.onResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        qMt qmt = this.CJ;
        if (qmt != null && z10) {
            qmt.onResume();
        }
    }

    public void setOnShakeViewListener(Qhi qhi) {
        this.ROR = qhi;
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f8308fl.setVisibility(8);
            this.Tgh.setVisibility(8);
            return;
        }
        this.f8308fl.setText(str);
    }

    public void Qhi(Context context, View view) {
        addView(view);
        this.Sf = (LinearLayout) findViewById(2097610727);
        this.f8307ac = (ImageView) findViewById(2097610725);
        this.Qhi = (TextView) findViewById(2097610724);
        this.cJ = (TextView) findViewById(2097610726);
        this.f8308fl = (TextView) findViewById(2097610723);
        this.Tgh = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.Sf.setBackground(gradientDrawable);
    }

    public void Qhi() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
