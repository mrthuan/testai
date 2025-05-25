package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.iMK;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.HzH;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: RewardFullVideoLayout.java */
/* loaded from: classes.dex */
public class Tgh {
    final tP CJ;
    private RFDownloadBarLayout EBS;
    RelativeLayout Gm;
    private int MQ;
    View ROR;
    View Sf;
    FrameLayout Tgh;
    ImageView WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi f8880ac;
    final Activity cJ;

    /* renamed from: fl  reason: collision with root package name */
    ImageView f8881fl;

    /* renamed from: hm  reason: collision with root package name */
    PAGLogoView f8882hm;
    PAGProgressBar hpZ;
    private final boolean kYc;
    public HzH pA;
    private boolean qMt;
    private final String tP;

    /* renamed from: zc  reason: collision with root package name */
    iMK f8883zc;
    int Qhi = 3;
    protected int ABk = 0;
    protected final AtomicBoolean iMK = new AtomicBoolean(false);
    Runnable HzH = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Tgh.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                tP tPVar = Tgh.this.CJ;
                if ((tPVar == null || !tPVar.Ewb()) && (imageView = Tgh.this.f8881fl) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    Tgh.this.f8880ac.js.Qhi(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public Tgh(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.f8880ac = qhi;
        this.cJ = qhi.FQ;
        this.CJ = qhi.cJ;
        this.tP = qhi.f8798fl;
        this.kYc = qhi.CJ;
    }

    private void kYc() {
        RelativeLayout relativeLayout;
        RFDownloadBarLayout rFDownloadBarLayout = (RFDownloadBarLayout) this.f8880ac.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.f9385zc);
        this.EBS = rFDownloadBarLayout;
        rFDownloadBarLayout.Qhi(this.f8880ac);
        this.f8882hm = (PAGLogoView) this.f8880ac.yN.findViewById(520093757);
        this.WAv = (ImageView) this.f8880ac.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.smJ);
        this.f8881fl = (ImageView) this.f8880ac.yN.findViewById(520093708);
        this.Tgh = (FrameLayout) this.f8880ac.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Gm);
        this.ROR = this.f8880ac.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.HzH);
        this.Sf = this.f8880ac.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.mZ);
        this.Gm = (RelativeLayout) this.f8880ac.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.nR);
        iMK imk = this.f8883zc;
        if (imk != null && imk.CJ() != null && (relativeLayout = this.Gm) != null) {
            relativeLayout.addView(this.f8883zc.CJ(), new LinearLayout.LayoutParams(-1, -1));
            this.f8883zc.cJ();
        }
    }

    public void ABk() {
        try {
            Activity activity = this.f8880ac.FQ;
            Animation loadAnimation = AnimationUtils.loadAnimation(activity, MQ.hm(activity, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Tgh.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        Tgh.this.f8880ac.es.zc();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.f8880ac.es.Qhi(loadAnimation);
                return;
            }
            this.f8880ac.es.zc();
        } catch (Throwable unused) {
            this.f8880ac.es.zc();
        }
    }

    public void CJ() {
        zn.Qhi((View) this.Tgh, 8);
        zn.Qhi(this.ROR, 8);
        zn.Qhi(this.Sf, 8);
        cJ(8);
        zn.Qhi((View) this.f8881fl, 8);
        zn.Qhi((View) this.f8882hm, 8);
        zn.Qhi((View) this.Gm, 8);
        zn.Qhi((View) this.WAv, 8);
    }

    public View Gm() {
        return this.EBS;
    }

    public void HzH() {
        com.bytedance.sdk.openadsdk.core.cJ.Tgh fl2 = this.f8880ac.aP.fl();
        View view = this.EBS;
        if (view == null) {
            view = this.f8880ac.yN;
        }
        fl2.onClick(view);
    }

    public boolean Qhi() {
        return true;
    }

    public void ROR() {
        if (this.WAv.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.WAv.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.WAv.setLayoutParams(marginLayoutParams);
        }
    }

    public void Sf() {
        RFDownloadBarLayout rFDownloadBarLayout = this.EBS;
        if (rFDownloadBarLayout == null) {
            return;
        }
        rFDownloadBarLayout.Qhi();
    }

    public FrameLayout Tgh() {
        return this.Tgh;
    }

    public View WAv() {
        return this.f8881fl;
    }

    public void ac() {
        this.Tgh.removeAllViews();
    }

    public void cJ() {
        if (this.qMt) {
            return;
        }
        this.qMt = true;
        this.MQ = this.f8880ac.Dq;
        if (Qhi()) {
            iMK imk = new iMK(this.f8880ac);
            this.f8883zc = imk;
            imk.Qhi();
        }
        kYc();
        Activity activity = this.cJ;
        tP tPVar = this.CJ;
        String str = this.tP;
        FrameLayout frameLayout = this.Tgh;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8880ac;
        HzH hzH = new HzH(activity, tPVar, str, frameLayout, qhi.PAe, qhi.yN);
        this.pA = hzH;
        hzH.Qhi();
    }

    public void fl() {
        int lG = this.CJ.lG();
        this.Qhi = lG;
        if (lG == -200) {
            this.Qhi = com.bytedance.sdk.openadsdk.core.HzH.CJ().pA(String.valueOf(this.CJ.Hy()));
        }
        if (this.Qhi != -1 || Qhi() || (this.f8880ac.ReL instanceof com.bytedance.sdk.openadsdk.component.reward.cJ.ac)) {
            return;
        }
        cJ(0);
    }

    public boolean hm() {
        ImageView imageView = this.f8881fl;
        if (imageView == null || imageView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void hpZ() {
        HzH hzH = this.pA;
        if (hzH != null) {
            hzH.ROR();
        }
    }

    public void iMK() {
        HzH hzH = this.pA;
        if (hzH != null) {
            hzH.fl();
        }
        ImageView imageView = this.f8881fl;
        if (imageView != null) {
            imageView.removeCallbacks(this.HzH);
        }
    }

    public void pA() {
        HzH hzH = this.pA;
        if (hzH != null) {
            hzH.Tgh();
        }
    }

    public void zc() {
        try {
            iMK imk = this.f8883zc;
            if (imk != null) {
                imk.ac();
            }
            RelativeLayout relativeLayout = this.Gm;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.Gm;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void ac(int i10) {
        zn.Qhi((View) this.f8882hm, i10);
    }

    public void Qhi(boolean z10) {
        int i10 = 8;
        zn.Qhi((View) this.f8882hm, bxS.Gm(this.CJ) ? 8 : 0);
        ImageView imageView = this.WAv;
        if (this.CJ.IC() && this.CJ.Sf()) {
            i10 = 0;
        }
        zn.Qhi((View) imageView, i10);
        cJ(z10);
        if (this.kYc) {
            fl();
        }
    }

    public void fl(int i10) {
        zn.Qhi((View) this.f8881fl, i10);
        if (i10 == 0 && !this.f8880ac.WAv.get() && bxS.cJ(this.f8880ac.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8880ac;
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(qhi.cJ, qhi.f8798fl, "show_close_button", (JSONObject) null, System.currentTimeMillis() - this.f8880ac.HLI);
        }
    }

    public void Qhi(int i10) {
        if (this.hpZ == null) {
            this.hpZ = new PAGProgressBar(this.f8880ac.FQ);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.hpZ.setLayoutParams(layoutParams);
            this.hpZ.setIndeterminateDrawable(hm.Qhi(this.f8880ac.FQ, "tt_video_loading_progress_bar"));
            this.f8880ac.es.Tgh().addView(this.hpZ);
        }
        this.hpZ.setVisibility(i10);
    }

    public void CJ(int i10) {
        int i11 = this.Qhi;
        if (i11 == -1 || i10 != i11 || this.iMK.get()) {
            return;
        }
        cJ(0);
        this.iMK.set(true);
        Sf();
    }

    public void cJ(boolean z10) {
        ImageView imageView;
        int Qhi;
        if (this.MQ != 1 && (imageView = this.f8881fl) != null && z10) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (Qhi = Qhi("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (Qhi > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = Qhi;
                }
            }
        }
        if (this.f8880ac.ReL instanceof com.bytedance.sdk.openadsdk.component.reward.cJ.ac) {
            return;
        }
        cJ(0);
    }

    public void Qhi(int i10, int i11) {
        FrameLayout frameLayout;
        if (this.CJ.NFd() == 1 && (frameLayout = this.Tgh) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int ac2 = zn.ac((Context) this.cJ);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Tgh.getLayoutParams();
            layoutParams.width = ac2;
            int i12 = (ac2 * 9) / 16;
            layoutParams.height = i12;
            this.Tgh.setLayoutParams(layoutParams);
            this.ABk = (zn.CJ((Context) this.cJ) - i12) / 2;
            ABk.Qhi("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.ABk);
        }
    }

    public void cJ(int i10) {
        tP tPVar = this.CJ;
        if (tPVar != null && tPVar.IC() && com.bytedance.sdk.openadsdk.core.model.iMK.Qhi(this.CJ)) {
            zn.Qhi((View) this.EBS, 8);
        } else {
            zn.Qhi((View) this.EBS, i10);
        }
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.cJ.ac acVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        tP tPVar;
        if (this.Tgh != null && (tPVar = this.CJ) != null && tPVar.sDy() != null) {
            if (this.CJ.sDy().Tgh && !HzH.cJ(this.CJ)) {
                Qhi((View.OnClickListener) acVar);
                Qhi(acVar);
            } else {
                Qhi(onClickListener);
            }
        }
        tP tPVar2 = this.CJ;
        if (tPVar2 != null && tPVar2.NFd() == 1) {
            if (this.CJ.sDy() != null && (view2 = this.ROR) != null) {
                zn.Qhi(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ROR.getLayoutParams();
                layoutParams.height = this.ABk;
                this.ROR.setLayoutParams(layoutParams);
                if (this.CJ.sDy().cJ) {
                    this.ROR.setOnClickListener(acVar);
                    this.ROR.setOnTouchListener(onTouchListener);
                } else {
                    this.ROR.setOnClickListener(onClickListener);
                }
            }
            if (this.CJ.sDy() != null && (view = this.Sf) != null) {
                zn.Qhi(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.Sf.getLayoutParams();
                layoutParams2.height = this.ABk;
                this.Sf.setLayoutParams(layoutParams2);
                if (this.CJ.sDy().CJ) {
                    this.Sf.setOnClickListener(acVar);
                    this.Sf.setOnTouchListener(onTouchListener);
                } else {
                    this.Sf.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.f8882hm;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Tgh.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        Tgh tgh = Tgh.this;
                        TTWebsiteActivity.Qhi(tgh.cJ, tgh.CJ, tgh.tP);
                    } catch (Throwable th2) {
                        ABk.Qhi("TTAD.RFullVideoLayout", th2.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.WAv;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi((int) zn.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), 14.0f, true), this.WAv, this.f8880ac.cJ);
        }
    }

    private int Qhi(String str) {
        Resources resources = this.cJ.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void Qhi(View.OnClickListener onClickListener) {
        zn.Qhi(this.Tgh, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void Qhi(com.bytedance.sdk.openadsdk.core.cJ.ac acVar) {
        zn.Qhi((View) this.Tgh, (View.OnTouchListener) acVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void Qhi(float f10) {
        zn.Qhi(this.f8881fl, f10);
    }

    public void Qhi(Animation animation) {
        RelativeLayout relativeLayout = this.Gm;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }
}
