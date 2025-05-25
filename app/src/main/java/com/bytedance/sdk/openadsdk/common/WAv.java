package com.bytedance.sdk.openadsdk.common;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTTitleNewStyleManager.java */
/* loaded from: classes.dex */
public class WAv {
    TTAdDislikeDialog Qhi;
    private final Context ROR;
    private ImageView Sf;
    private final tP Tgh;
    private PAGProgressBar WAv;
    TTAdDislikeToast cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final RelativeLayout f8732fl;

    /* renamed from: hm  reason: collision with root package name */
    private TextView f8733hm;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f8734zc;

    /* renamed from: ac  reason: collision with root package name */
    final AtomicBoolean f8731ac = new AtomicBoolean(false);
    final AtomicBoolean CJ = new AtomicBoolean(false);
    private final int Gm = zn.cJ(HzH.Qhi(), 44.0f);

    public WAv(Context context, RelativeLayout relativeLayout, tP tPVar) {
        this.ROR = context;
        this.f8732fl = relativeLayout;
        this.Tgh = tPVar;
        fl();
    }

    private void ROR() {
        this.cJ.Qhi(TTAdDislikeToast.getDislikeTip());
    }

    private void Tgh() {
        try {
            if (this.Qhi == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.ROR, this.Tgh);
                this.Qhi = tTAdDislikeDialog;
                tTAdDislikeDialog.setDislikeSource("landing_page");
                this.Qhi.setCallback(new TTAdDislikeDialog.Qhi() { // from class: com.bytedance.sdk.openadsdk.common.WAv.6
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                    public void Qhi(View view) {
                        WAv.this.f8731ac.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                    public void cJ(View view) {
                        WAv.this.f8731ac.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                    public void Qhi(int i10, FilterWord filterWord) {
                        if (WAv.this.CJ.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        WAv.this.CJ.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.f8732fl.getRootView().findViewById(16908290);
            frameLayout.addView(this.Qhi);
            if (this.cJ == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.ROR);
                this.cJ = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th2);
        }
    }

    private void fl() {
        String dVA;
        this.Sf = (ImageView) this.f8732fl.findViewById(iMK.ReL);
        this.f8733hm = (TextView) this.f8732fl.findViewById(iMK.EGK);
        ImageView imageView = (ImageView) this.f8732fl.findViewById(iMK.gga);
        this.WAv = (PAGProgressBar) this.f8732fl.findViewById(iMK.VnT);
        tP tPVar = this.Tgh;
        if (tPVar != null) {
            TextView textView = this.f8733hm;
            if (TextUtils.isEmpty(tPVar.dVA())) {
                dVA = MQ.Qhi(this.ROR, "tt_web_title_default");
            } else {
                dVA = this.Tgh.dVA();
            }
            textView.setText(dVA);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.WAv.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WAv.this.CJ();
            }
        });
    }

    public void CJ() {
        if (this.CJ.get()) {
            ROR();
            return;
        }
        if (this.Qhi == null) {
            Tgh();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.Qhi;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.Qhi();
        }
    }

    public ImageView ac() {
        return this.Sf;
    }

    public void cJ() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8732fl.getLayoutParams();
            if (!this.f8734zc && marginLayoutParams.topMargin == 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, -this.Gm);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.WAv.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        WAv.this.f8732fl.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.WAv.5
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        WAv.this.f8734zc = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        WAv.this.f8734zc = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void Qhi(int i10) {
        if (i10 == 100) {
            this.WAv.setVisibility(8);
            return;
        }
        this.WAv.setVisibility(0);
        this.WAv.setProgress(i10);
    }

    public void Qhi() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8732fl.getLayoutParams();
            if (this.f8734zc) {
                return;
            }
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.Gm;
            if (i10 == (-i11)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(-i11, 0);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.WAv.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        WAv.this.f8732fl.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.WAv.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        WAv.this.f8734zc = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        WAv.this.f8734zc = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }
}
