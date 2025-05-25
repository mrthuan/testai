package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RubInAnimation.java */
/* loaded from: classes.dex */
public class Gm extends fl {
    private Qhi CJ;
    private float Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private float f8198fl;

    /* compiled from: RubInAnimation.java */
    /* loaded from: classes.dex */
    public class Qhi {
        private View cJ;

        public Qhi(View view) {
            this.cJ = view;
        }

        public void Qhi(int i10) {
            if ("top".equals(Gm.this.cJ.Qhi())) {
                if (Gm.this.f8199ac instanceof ViewGroup) {
                    for (int i11 = 0; i11 < ((ViewGroup) Gm.this.f8199ac).getChildCount(); i11++) {
                        ((ViewGroup) Gm.this.f8199ac).getChildAt(i11).setTranslationY(i10 - Gm.this.f8198fl);
                    }
                }
                Gm gm2 = Gm.this;
                gm2.f8199ac.setTranslationY(gm2.f8198fl - i10);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.cJ.getLayoutParams();
            layoutParams.height = i10;
            this.cJ.setLayoutParams(layoutParams);
            this.cJ.requestLayout();
        }
    }

    public Gm(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        int i10;
        String str;
        View view = this.f8199ac;
        if ((view instanceof ImageView) && (view.getParent() instanceof DynamicBaseWidget)) {
            this.f8199ac = (View) this.f8199ac.getParent();
        }
        this.f8199ac.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "alpha", 0.0f, 1.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        this.CJ = new Qhi(this.f8199ac);
        final int i11 = this.f8199ac.getLayoutParams().height;
        this.f8198fl = i11;
        this.Tgh = this.f8199ac.getLayoutParams().width;
        if ("left".equals(this.cJ.Qhi()) || "right".equals(this.cJ.Qhi())) {
            i10 = (int) this.Tgh;
            str = InMobiNetworkValues.WIDTH;
        } else {
            str = InMobiNetworkValues.HEIGHT;
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.CJ, str, 0, i10).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        arrayList.add(Qhi(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.Gm.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Gm.this.CJ.Qhi(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        return arrayList;
    }
}
