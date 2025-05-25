package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.kYc;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.pM;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class LandingPageLoadingLayout extends PAGFrameLayout {
    private Runnable CJ;
    protected Tgh Qhi;
    private int ROR;
    private PAGImageView Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private long f8717ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Runnable f8718fl;

    public LandingPageLoadingLayout(Context context) {
        super(context);
        this.f8717ac = 10L;
        this.ROR = 1;
        ac();
    }

    private void ac() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(int i10) {
        Tgh tgh = this.Qhi;
        if (tgh != null) {
            tgh.Qhi(i10);
        }
        if (i10 == 100) {
            cJ();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ac(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.CJ;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.CJ = null;
        }
    }

    private void ac(int i10) {
        if (this.ROR != i10) {
            this.ROR = i10;
            PAGImageView pAGImageView = this.Tgh;
            if (pAGImageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pAGImageView.getLayoutParams();
                if (this.ROR == 1) {
                    marginLayoutParams.width = zn.cJ(getContext(), 64.0f);
                    marginLayoutParams.height = zn.cJ(getContext(), 24.0f);
                    marginLayoutParams.bottomMargin = zn.cJ(getContext(), 60.0f);
                } else {
                    marginLayoutParams.width = zn.cJ(getContext(), 41.0f);
                    marginLayoutParams.height = zn.cJ(getContext(), 15.0f);
                    marginLayoutParams.bottomMargin = zn.cJ(getContext(), 24.0f);
                }
                this.Tgh.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void Qhi(final tP tPVar) {
        kYc hm2;
        if (tPVar != null && (hm2 = tPVar.hm()) != null) {
            this.f8717ac = hm2.Qhi();
        }
        Tgh tgh = new Tgh(getContext());
        this.Qhi = tgh;
        View Qhi = tgh.Qhi();
        if (Qhi.getParent() instanceof ViewGroup) {
            ((ViewGroup) Qhi.getParent()).removeView(Qhi);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Qhi.setLayoutParams(layoutParams);
        if (tPVar != null) {
            boolean jPH = tPVar.jPH();
            TTRoundRectImageView cJ = this.Qhi.cJ();
            if (cJ != null) {
                if (jPH) {
                    cJ.setVisibility(8);
                } else {
                    hpZ dIT = (tPVar.dIT() == null || TextUtils.isEmpty(tPVar.dIT().Qhi())) ? null : tPVar.dIT();
                    if (dIT != null && !TextUtils.isEmpty(dIT.Qhi())) {
                        try {
                            com.bytedance.sdk.openadsdk.ROR.fl.Qhi(dIT).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(tPVar, dIT.Qhi(), new pM(cJ)));
                        } catch (Throwable unused) {
                        }
                    }
                    cJ.setVisibility(8);
                }
            }
            PAGTextView ac2 = this.Qhi.ac();
            if (ac2 != null) {
                if (jPH) {
                    ac2.setText("Loading");
                } else if (!TextUtils.isEmpty(tPVar.dVA())) {
                    ac2.setText(tPVar.dVA());
                } else {
                    ac2.setVisibility(8);
                }
            }
        }
        addView(Qhi);
        PAGImageView pAGImageView = new PAGImageView(getContext());
        this.Tgh = pAGImageView;
        pAGImageView.setImageDrawable(MQ.ac(getContext(), "tt_ad_logo_big"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(zn.cJ(getContext(), 64.0f), zn.cJ(getContext(), 24.0f));
        layoutParams2.bottomMargin = zn.cJ(getContext(), 60.0f);
        layoutParams2.gravity = 81;
        this.Tgh.setLayoutParams(layoutParams2);
        addView(this.Tgh);
        this.Tgh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = LandingPageLoadingLayout.this.getContext();
                tP tPVar2 = tPVar;
                TTWebsiteActivity.Qhi(context, tPVar2, js.Qhi(tPVar2));
            }
        });
        ac(getResources().getConfiguration().orientation);
    }

    public void cJ() {
        this.cJ = 0;
        Tgh tgh = this.Qhi;
        if (tgh != null) {
            removeView(tgh.Qhi);
            this.Qhi.CJ();
        }
        setVisibility(8);
        this.Qhi = null;
        Runnable runnable = this.CJ;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f8718fl;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f8718fl = null;
        this.CJ = null;
    }

    public void Qhi() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.2
            @Override // java.lang.Runnable
            public void run() {
                LandingPageLoadingLayout landingPageLoadingLayout = LandingPageLoadingLayout.this;
                if (landingPageLoadingLayout.Qhi != null) {
                    landingPageLoadingLayout.setVisibility(0);
                }
            }
        });
        if (this.CJ == null) {
            this.CJ = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    LandingPageLoadingLayout.this.cJ();
                }
            };
        }
        postDelayed(this.CJ, this.f8717ac * 1000);
    }

    public void Qhi(int i10) {
        if (i10 == 100 || Math.abs(i10 - this.cJ) >= 7) {
            this.cJ = i10;
            if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
                cJ(this.cJ);
                return;
            }
            if (this.f8718fl == null) {
                this.f8718fl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        LandingPageLoadingLayout landingPageLoadingLayout = LandingPageLoadingLayout.this;
                        landingPageLoadingLayout.cJ(landingPageLoadingLayout.cJ);
                    }
                };
            }
            post(this.f8718fl);
        }
    }
}
