package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.CJ.qMt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: BaseAnimation.java */
/* loaded from: classes.dex */
public abstract class fl implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Tgh {
    private Set<ScheduledFuture<?>> CJ = new HashSet();
    public List<ObjectAnimator> Qhi = Qhi();

    /* renamed from: ac  reason: collision with root package name */
    public View f8199ac;
    com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi cJ;

    /* compiled from: BaseAnimation.java */
    /* loaded from: classes.dex */
    public class Qhi implements Runnable {
        ObjectAnimator Qhi;
        ScheduledFuture<?> cJ;

        public Qhi(ObjectAnimator objectAnimator) {
            this.Qhi = objectAnimator;
        }

        public void Qhi(ScheduledFuture<?> scheduledFuture) {
            this.cJ = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac() != null) {
                com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().ac().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Qhi.this.Qhi.resume();
                    }
                });
                if (this.cJ != null) {
                    fl.this.CJ.remove(this.cJ);
                }
            }
        }
    }

    public fl(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        this.f8199ac = view;
        this.cJ = qhi;
    }

    public abstract List<ObjectAnimator> Qhi();

    public void ac() {
        List<ObjectAnimator> list = this.Qhi;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.cJ.HzH() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        Qhi qhi = new Qhi(objectAnimator);
                        ScheduledFuture<?> Qhi2 = qMt.Qhi(qhi, (long) (fl.this.cJ.HzH() * 1000.0d), TimeUnit.MILLISECONDS);
                        qhi.Qhi(Qhi2);
                        fl.this.CJ.add(Qhi2);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Tgh
    public void cJ() {
        List<ObjectAnimator> list = this.Qhi;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        for (ScheduledFuture<?> scheduledFuture : this.CJ) {
            scheduledFuture.cancel(true);
        }
    }

    public ObjectAnimator Qhi(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.cJ.iMK() * 1000.0d));
        if (this.cJ.pA() > 0) {
            objectAnimator.setRepeatCount(this.cJ.pA() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.cJ.hpZ())) {
            if (!"alternate".equals(this.cJ.hpZ()) && !"alternate-reverse".equals(this.cJ.hpZ())) {
                objectAnimator.setRepeatMode(1);
            } else {
                objectAnimator.setRepeatMode(2);
            }
        }
        if ("ease-in-out".equals(this.cJ.ABk())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.cJ.hpZ())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.cJ.hpZ())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    fl.this.f8199ac.setVisibility(0);
                    if (fl.this.f8199ac.getParent() instanceof DynamicBaseWidgetImp) {
                        ((View) fl.this.f8199ac.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
