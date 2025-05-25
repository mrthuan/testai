package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.CQU;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BrandBannerController.java */
/* loaded from: classes.dex */
public class cJ {
    private com.bytedance.sdk.component.adexpress.cJ.hpZ CJ;
    tP Qhi;
    private int ROR;
    private ScheduledFuture<?> Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private Qhi f9140ac;
    private final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private NativeExpressView f9141fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f9142hm;

    /* compiled from: BrandBannerController.java */
    /* loaded from: classes.dex */
    public static class Qhi implements com.bytedance.sdk.component.adexpress.cJ.fl<View>, DspHtmlWebView.cJ {
        private int ABk;
        private String CJ;
        private String Gm;
        AtomicBoolean Qhi = new AtomicBoolean(false);
        private final int ROR;
        private FrameLayout Sf;
        private final int Tgh;
        private final int WAv;

        /* renamed from: ac  reason: collision with root package name */
        private TTDislikeDialogAbstract f9143ac;
        private com.bytedance.sdk.openadsdk.dislike.cJ cJ;

        /* renamed from: fl  reason: collision with root package name */
        private final Context f9144fl;

        /* renamed from: hm  reason: collision with root package name */
        private tP f9145hm;
        private com.bytedance.sdk.component.adexpress.cJ.Sf iMK;
        private PAGExpressAdWrapperListener pA;

        /* renamed from: zc  reason: collision with root package name */
        private DspHtmlWebView f9146zc;

        public Qhi(Context context, tP tPVar, int i10, int i11, String str, int i12) {
            this.Gm = str;
            if (tPVar != null && tPVar.Ewb()) {
                this.Gm = "fullscreen_interstitial_ad";
            }
            this.f9144fl = context;
            this.Tgh = i10;
            this.ROR = i11;
            this.f9145hm = tPVar;
            this.WAv = zn.cJ(context, 3.0f);
            this.ABk = i12;
            Tgh();
        }

        private View ROR() {
            PAGLogoView pAGLogoView = new PAGLogoView(this.f9144fl);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            tP tPVar = this.f9145hm;
            if (tPVar != null && tPVar.Ewb()) {
                layoutParams.leftMargin = zn.cJ(this.f9144fl, 20.0f);
                layoutParams.bottomMargin = zn.cJ(this.f9144fl, 20.0f);
                layoutParams.gravity = 8388691;
            } else {
                int i10 = this.WAv;
                layoutParams.topMargin = i10;
                layoutParams.leftMargin = i10;
            }
            pAGLogoView.setLayoutParams(layoutParams);
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.cJ.Qhi.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.Qhi(Qhi.this.f9144fl, Qhi.this.f9145hm, Qhi.this.Gm);
                }
            });
            return pAGLogoView;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private DspHtmlWebView Sf() {
            DspHtmlWebView cJ = com.bytedance.sdk.openadsdk.core.nativeexpress.ac.Qhi().cJ();
            this.f9146zc = cJ;
            if (cJ == null) {
                this.f9146zc = new DspHtmlWebView(this.f9144fl);
            }
            com.bytedance.sdk.openadsdk.core.nativeexpress.ac.Qhi().ac(this.f9146zc);
            this.f9146zc.Qhi(this.f9145hm, this, this.Gm);
            this.f9146zc.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f9146zc;
        }

        private void Tgh() {
            FrameLayout frameLayout = new FrameLayout(this.f9144fl);
            this.Sf = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.Tgh, this.ROR);
            }
            layoutParams.width = this.Tgh;
            layoutParams.height = this.ROR;
            layoutParams.gravity = 17;
            this.Sf.setLayoutParams(layoutParams);
            DspHtmlWebView Sf = Sf();
            this.Sf.addView(Sf);
            View ROR = ROR();
            this.Sf.addView(ROR);
            tP tPVar = this.f9145hm;
            if (tPVar != null && tPVar.Ewb()) {
                Sf.setBackgroundColor(-16777216);
                Sf.Qhi(((Activity) this.f9144fl).findViewById(com.bytedance.sdk.openadsdk.utils.iMK.cBj), FriendlyObstructionPurpose.OTHER);
            }
            Sf.Qhi(ROR, FriendlyObstructionPurpose.OTHER);
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
        public View Qhi() {
            return null;
        }

        @Override // com.bytedance.sdk.component.adexpress.cJ.fl
        public int ac() {
            return 5;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
        @SuppressLint({"ClickableViewAccessibility"})
        public void f_() {
            if (this.iMK != null) {
                com.bytedance.sdk.component.adexpress.cJ.pA pAVar = new com.bytedance.sdk.component.adexpress.cJ.pA();
                pAVar.Qhi(true);
                pAVar.Qhi(zn.ac(this.f9144fl, this.Tgh));
                pAVar.cJ(zn.ac(this.f9144fl, this.ROR));
                this.iMK.Qhi(this.Sf, pAVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.cJ.fl
        public View fl() {
            return this.Sf;
        }

        public void CJ() {
            this.Sf = null;
            this.cJ = null;
            this.f9143ac = null;
            this.iMK = null;
            this.f9145hm = null;
            DspHtmlWebView dspHtmlWebView = this.f9146zc;
            if (dspHtmlWebView != null) {
                dspHtmlWebView.zc();
                com.bytedance.sdk.openadsdk.core.nativeexpress.ac.Qhi().Qhi(this.f9146zc);
            }
            this.Qhi.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
        public View cJ() {
            FrameLayout frameLayout = this.Sf;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.component.adexpress.cJ.fl
        public void Qhi(com.bytedance.sdk.component.adexpress.cJ.Sf sf2) {
            tP tPVar;
            if (this.Qhi.get()) {
                return;
            }
            if (this.f9144fl != null && (tPVar = this.f9145hm) != null) {
                this.iMK = sf2;
                if (TextUtils.isEmpty(tPVar.bM())) {
                    sf2.Qhi(106, "dsp data is null");
                    return;
                } else {
                    this.f9146zc.hpZ();
                    return;
                }
            }
            sf2.Qhi(106, "material null");
        }

        public void Qhi(CQU cqu) {
            if (cqu instanceof com.bytedance.sdk.openadsdk.dislike.cJ) {
                this.cJ = (com.bytedance.sdk.openadsdk.dislike.cJ) cqu;
            }
        }

        public void Qhi(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            tP tPVar;
            if (tTDislikeDialogAbstract != null && (tPVar = this.f9145hm) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(tPVar.EGK(), this.f9145hm.VnT());
            }
            this.f9143ac = tTDislikeDialogAbstract;
        }

        public void Qhi(String str) {
            this.CJ = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
        public void Qhi(View view, int i10) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.pA;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
        public void Qhi(int i10, int i11) {
            com.bytedance.sdk.component.adexpress.cJ.Sf sf2 = this.iMK;
            if (sf2 != null) {
                sf2.Qhi(i10, "render fail");
            }
        }

        public void Qhi(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.pA = pAGExpressAdWrapperListener;
        }
    }

    /* compiled from: BrandBannerController.java */
    /* loaded from: classes.dex */
    public interface ac {
        void Qhi();

        void Qhi(int i10, int i11);

        void Qhi(String str);

        void cJ(String str);
    }

    /* compiled from: BrandBannerController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.cJ$cJ  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0123cJ implements Runnable {
        ac Qhi;

        public RunnableC0123cJ(ac acVar) {
            this.Qhi = acVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ac acVar = this.Qhi;
            if (acVar != null) {
                acVar.Qhi(107, 107);
            }
        }
    }

    public cJ(Context context, NativeExpressView nativeExpressView, tP tPVar, String str) {
        this.Qhi = tPVar;
        this.cJ = context;
        this.f9141fl = nativeExpressView;
        Qhi(nativeExpressView);
        this.f9140ac = new Qhi(context, tPVar, this.Tgh, this.ROR, str, this.f9142hm);
    }

    private void Qhi(NativeExpressView nativeExpressView) {
        tP tPVar = this.Qhi;
        if (tPVar != null && tPVar.Ewb()) {
            this.Tgh = -1;
            this.ROR = -1;
            return;
        }
        iMK Qhi2 = BannerExpressBackupView.Qhi(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        this.f9142hm = Qhi2.Qhi;
        if (nativeExpressView.getExpectExpressWidth() > 0 && nativeExpressView.getExpectExpressHeight() > 0) {
            this.Tgh = zn.cJ(this.cJ, nativeExpressView.getExpectExpressWidth());
            this.ROR = zn.cJ(this.cJ, nativeExpressView.getExpectExpressHeight());
        } else {
            int ac2 = zn.ac(this.cJ);
            this.Tgh = ac2;
            this.ROR = Float.valueOf(ac2 / Qhi2.cJ).intValue();
        }
        int i10 = this.Tgh;
        if (i10 <= 0 || i10 <= zn.ac(this.cJ)) {
            return;
        }
        float ac3 = zn.ac(this.cJ) / this.Tgh;
        this.Tgh = zn.ac(this.cJ);
        this.ROR = Float.valueOf(this.ROR * ac3).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        try {
            ScheduledFuture<?> scheduledFuture = this.Sf;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Sf.cancel(false);
            this.Sf = null;
        } catch (Throwable unused) {
        }
    }

    public void cJ() {
        Qhi qhi = this.f9140ac;
        if (qhi != null) {
            qhi.CJ();
            this.f9140ac = null;
        }
        ac();
        this.CJ = null;
        this.f9141fl = null;
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.hpZ hpz) {
        this.CJ = hpz;
    }

    public void Qhi() {
        tP tPVar = this.Qhi;
        if (tPVar != null && tPVar.Ewb()) {
            this.Sf = lG.Qhi().schedule(new RunnableC0123cJ(this.f9140ac.f9146zc), com.bytedance.sdk.openadsdk.core.HzH.CJ().aP(), TimeUnit.MILLISECONDS);
        }
        Qhi qhi = this.f9140ac;
        if (qhi != null) {
            qhi.Qhi(new com.bytedance.sdk.component.adexpress.cJ.Sf() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.cJ.1
                @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
                public void Qhi(View view, com.bytedance.sdk.component.adexpress.cJ.pA pAVar) {
                    if (cJ.this.f9141fl == null || view == null) {
                        if (cJ.this.CJ != null) {
                            cJ.this.CJ.a_(106);
                        }
                    } else if (cJ.this.CJ != null) {
                        cJ.this.CJ.Qhi(cJ.this.f9140ac, pAVar);
                    }
                    cJ.this.ac();
                }

                @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
                public void Qhi(int i10, String str) {
                    if (cJ.this.CJ != null) {
                        cJ.this.CJ.a_(106);
                    }
                    cJ.this.ac();
                }
            });
            View fl2 = this.f9140ac.fl();
            this.f9141fl.removeView(fl2);
            if (fl2.getParent() != null) {
                ((ViewGroup) fl2.getParent()).removeView(fl2);
            }
            this.f9141fl.addView(fl2, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.cJ.hpZ hpz = this.CJ;
        if (hpz != null) {
            hpz.a_(106);
        }
    }

    public void Qhi(CQU cqu) {
        Qhi qhi = this.f9140ac;
        if (qhi != null) {
            qhi.Qhi(cqu);
        }
    }

    public void Qhi(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        Qhi qhi = this.f9140ac;
        if (qhi != null) {
            qhi.Qhi(tTDislikeDialogAbstract);
        }
    }

    public void Qhi(String str) {
        Qhi qhi = this.f9140ac;
        if (qhi != null) {
            qhi.Qhi(str);
        }
    }

    public void Qhi(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        Qhi qhi = this.f9140ac;
        if (qhi != null) {
            qhi.Qhi(pAGExpressAdWrapperListener);
        }
    }
}
