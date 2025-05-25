package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class BannerExpressView extends PAGFrameLayout {
    protected tP CJ;
    protected final Context Qhi;
    protected int ROR;
    protected boolean Sf;
    protected PAGBannerAdWrapperListener Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected NativeExpressView f8997ac;
    protected NativeExpressView cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected AdSlot f8998fl;

    /* renamed from: hm  reason: collision with root package name */
    protected String f8999hm;

    public BannerExpressView(Context context, tP tPVar, AdSlot adSlot) {
        super(context);
        this.f8999hm = "banner_ad";
        this.Qhi = context;
        this.CJ = tPVar;
        this.f8998fl = adSlot;
        Qhi();
        AdSlot adSlot2 = this.f8998fl;
        if (adSlot2 != null) {
            Qhi(adSlot2.getExpressViewAcceptedWidth(), this.f8998fl.getExpressViewAcceptedHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ROR() {
        NativeExpressView nativeExpressView = this.cJ;
        this.cJ = this.f8997ac;
        this.f8997ac = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.f8997ac.Gm();
            this.f8997ac = null;
        }
    }

    public void CJ() {
        NativeExpressView nativeExpressView = this.f8997ac;
        if (nativeExpressView != null) {
            nativeExpressView.hm();
        }
    }

    public boolean Tgh() {
        if (this.f8997ac != null) {
            return true;
        }
        return false;
    }

    public void ac() {
        if (this.cJ != null) {
            hm.cJ().Tgh(this.cJ.getClosedListenerKey());
            removeView(this.cJ);
            this.cJ.Gm();
            this.cJ = null;
        }
        if (this.f8997ac != null) {
            hm.cJ().Tgh(this.f8997ac.getClosedListenerKey());
            removeView(this.f8997ac);
            this.f8997ac.Gm();
            this.f8997ac = null;
        }
        hm.cJ().qMt();
    }

    public void cJ() {
        NativeExpressView nativeExpressView = this.cJ;
        if (nativeExpressView != null) {
            nativeExpressView.hm();
        }
    }

    public void fl() {
        try {
            if (!this.Sf && this.f8997ac != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(Qhi(this.cJ)).with(cJ(this.f8997ac));
                animatorSet.setDuration(this.ROR).start();
                zn.Qhi((View) this.f8997ac, 0);
                this.Sf = true;
            }
        } catch (Throwable th2) {
            ABk.Qhi("BannerExpressView", th2.getMessage());
        }
    }

    public NativeExpressView getCurView() {
        return this.cJ;
    }

    public NativeExpressView getNextView() {
        return this.f8997ac;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.cJ == null) {
            Qhi();
        }
        com.bytedance.sdk.openadsdk.utils.ac.Qhi(this, this.CJ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDuration(int i10) {
        this.ROR = i10;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.Tgh = pAGBannerAdWrapperListener;
        NativeExpressView nativeExpressView = this.cJ;
        if (nativeExpressView != null) {
            nativeExpressView.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ac() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.ac
                public void Qhi() {
                    BannerExpressView.this.Tgh.onAdClicked();
                }
            });
            this.cJ.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                    BannerExpressView bannerExpressView = BannerExpressView.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = bannerExpressView.Tgh;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(bannerExpressView, str, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    NativeExpressView nativeExpressView2 = BannerExpressView.this.cJ;
                    if (nativeExpressView2 != null) {
                        nativeExpressView2.setSoundMute(true);
                    }
                    BannerExpressView.this.Qhi(f10, f11);
                    BannerExpressView bannerExpressView = BannerExpressView.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = bannerExpressView.Tgh;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(bannerExpressView, f10, f11);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }
            });
        }
    }

    public void Qhi() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.Qhi, this.CJ, this.f8998fl, this.f8999hm);
        this.cJ = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.Tgh;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    private ObjectAnimator cJ(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", getWidth(), 0.0f);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BannerExpressView bannerExpressView = BannerExpressView.this;
                bannerExpressView.Sf = false;
                bannerExpressView.ROR();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return ofFloat;
    }

    public void Qhi(tP tPVar, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.Qhi, tPVar, adSlot, this.f8999hm);
        this.f8997ac = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                BannerExpressView.this.Qhi(f10, f11);
                NativeExpressView nativeExpressView2 = BannerExpressView.this.f8997ac;
                if (nativeExpressView2 != null) {
                    nativeExpressView2.setSoundMute(true);
                }
                BannerExpressView.this.fl();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
            }
        });
        zn.Qhi((View) this.f8997ac, 8);
        addView(this.f8997ac, new ViewGroup.LayoutParams(-1, -1));
    }

    public void Qhi(float f10, float f11) {
        int cJ = zn.cJ(this.Qhi, f10);
        int cJ2 = zn.cJ(this.Qhi, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(cJ, cJ2);
        }
        layoutParams.width = cJ;
        layoutParams.height = cJ2;
        setLayoutParams(layoutParams);
    }

    private ObjectAnimator Qhi(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", 0.0f, -getWidth());
    }
}
