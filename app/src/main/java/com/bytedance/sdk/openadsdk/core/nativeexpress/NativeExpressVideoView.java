package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class NativeExpressVideoView extends NativeExpressView implements fl.ac, fl.InterfaceC0061fl {
    int CJ;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.ac Jma;
    private ExpressVideoView NFd;
    int Qhi;
    int ROR;
    boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    boolean f9127ac;
    boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    boolean f9128fl;
    private long lB;
    private long lG;
    private com.bytedance.sdk.openadsdk.multipro.cJ.Qhi sDy;

    public NativeExpressVideoView(Context context, tP tPVar, AdSlot adSlot, String str) {
        super(context, tPVar, adSlot, str, false, true);
        this.Qhi = 1;
        this.cJ = false;
        this.f9127ac = true;
        this.f9128fl = true;
        this.Tgh = true;
        this.ROR = -1;
        ROR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(com.bytedance.sdk.component.adexpress.cJ.pA pAVar) {
        double Tgh = pAVar.Tgh();
        double ROR = pAVar.ROR();
        double Sf = pAVar.Sf();
        double hm2 = pAVar.hm();
        if ((Sf == 0.0d || hm2 == 0.0d) && this.ROR != 7) {
            return;
        }
        int cJ = zn.cJ(this.Sf, (float) Tgh);
        int cJ2 = zn.cJ(this.Sf, (float) ROR);
        int cJ3 = zn.cJ(this.Sf, (float) Sf);
        int cJ4 = zn.cJ(this.Sf, (float) hm2);
        float min = Math.min(Math.min(zn.cJ(this.Sf, pAVar.zc()), zn.cJ(this.Sf, pAVar.ABk())), Math.min(zn.cJ(this.Sf, pAVar.iMK()), zn.cJ(this.Sf, pAVar.pA())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9133zc.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(cJ3, cJ4);
        }
        layoutParams.width = cJ3;
        layoutParams.height = cJ4;
        layoutParams.topMargin = cJ2;
        layoutParams.leftMargin = cJ;
        layoutParams.setMarginStart(cJ);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.f9133zc.setLayoutParams(layoutParams);
        this.f9133zc.removeAllViews();
        if (this.NFd != null) {
            if (this.ROR == 7 && (pAVar instanceof com.bytedance.sdk.openadsdk.core.ugen.ac.cJ)) {
                FrameLayout hpZ = ((com.bytedance.sdk.openadsdk.core.ugen.ac.cJ) pAVar).hpZ();
                if (hpZ != null) {
                    hpZ.removeAllViews();
                    hpZ.addView(this.NFd, new FrameLayout.LayoutParams(-1, -1));
                }
            } else if (pAVar.Qhi() != null) {
                if (this.Tgh) {
                    pAVar.Qhi().setTag(com.bytedance.sdk.component.adexpress.dynamic.Qhi.Tgh, 1);
                    ((FrameLayout) pAVar.Qhi()).removeAllViews();
                    ((FrameLayout) pAVar.Qhi()).addView(this.NFd, new FrameLayout.LayoutParams(-1, -1));
                    this.Tgh = false;
                }
            } else {
                this.f9133zc.addView(this.NFd);
            }
            zn.cJ(this.f9133zc, min);
            this.NFd.Qhi(0L, true, false);
            CJ(this.CJ);
            if (!com.bytedance.sdk.component.utils.hpZ.CJ(this.Sf) && !this.f9127ac && this.f9128fl) {
                this.NFd.fl();
            }
            if (TextUtils.equals("embeded_ad", this.f9131hm)) {
                return;
            }
            setShowAdInteractionView(false);
        }
    }

    private void hpZ() {
        boolean z10;
        try {
            this.sDy = new com.bytedance.sdk.openadsdk.multipro.cJ.Qhi();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.Sf, this.Gm, this.f9131hm, this.CQU);
            this.NFd = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.NFd.setControllerStatusCallBack(new NativeVideoTsView.cJ() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.1
                @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.cJ
                public void Qhi(boolean z11, long j10, long j11, long j12, boolean z12) {
                    NativeExpressVideoView.this.sDy.Qhi = z11;
                    NativeExpressVideoView.this.sDy.f9349fl = j10;
                    NativeExpressVideoView.this.sDy.Tgh = j11;
                    NativeExpressVideoView.this.sDy.ROR = j12;
                    NativeExpressVideoView.this.sDy.CJ = z12;
                }
            });
            this.NFd.setVideoAdLoadListener(this);
            this.NFd.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f9131hm)) {
                ExpressVideoView expressVideoView2 = this.NFd;
                if (this.cJ) {
                    z10 = this.WAv.isAutoPlay();
                } else {
                    z10 = this.f9127ac;
                }
                expressVideoView2.setIsAutoPlay(z10);
            } else if ("open_ad".equals(this.f9131hm)) {
                this.NFd.setIsAutoPlay(true);
            } else {
                this.NFd.setIsAutoPlay(this.f9127ac);
            }
            if ("open_ad".equals(this.f9131hm)) {
                this.NFd.setIsQuiet(true);
            } else {
                boolean ac2 = com.bytedance.sdk.openadsdk.core.HzH.CJ().ac(String.valueOf(this.CJ));
                this.EBS = ac2;
                this.NFd.setIsQuiet(ac2);
            }
            this.NFd.CJ();
        } catch (Exception unused) {
            this.NFd = null;
        }
    }

    private void setShowAdInteractionView(boolean z10) {
        ExpressVideoView expressVideoView = this.NFd;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z10);
        }
    }

    public void CJ(int i10) {
        int cJ = com.bytedance.sdk.openadsdk.core.HzH.CJ().cJ(i10);
        if (3 == cJ) {
            this.cJ = false;
            this.f9127ac = false;
        } else if (4 == cJ) {
            this.cJ = true;
        } else {
            int ac2 = com.bytedance.sdk.component.utils.hpZ.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            if (1 == cJ) {
                this.cJ = false;
                this.f9127ac = js.CJ(ac2);
            } else if (2 == cJ) {
                if (js.fl(ac2) || js.CJ(ac2) || js.Tgh(ac2)) {
                    this.cJ = false;
                    this.f9127ac = true;
                }
            } else if (5 == cJ && (js.CJ(ac2) || js.Tgh(ac2))) {
                this.cJ = false;
                this.f9127ac = true;
            }
        }
        if (this.f9127ac) {
            return;
        }
        this.Qhi = 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi() {
    }

    public void ROR() {
        int i10;
        this.f9133zc = new FrameLayout(this.Sf);
        tP tPVar = this.Gm;
        if (tPVar != null) {
            i10 = tPVar.Hy();
        } else {
            i10 = 0;
        }
        this.CJ = i10;
        CJ(i10);
        hpZ();
        addView(this.f9133zc, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void cJ() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.ac
    public void e_() {
        this.f9128fl = false;
        this.Qhi = 2;
        com.bytedance.sdk.openadsdk.apiImpl.feed.ac acVar = this.Jma;
        if (acVar != null) {
            acVar.Qhi(null);
        }
    }

    public ExpressVideoView getExpressVideoView() {
        return this.NFd;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.feed.ac getVideoAdListener() {
        return this.Jma;
    }

    public com.bykv.vk.openvk.component.video.api.CJ.fl getVideoController() {
        ExpressVideoView expressVideoView = this.NFd;
        if (expressVideoView != null) {
            return expressVideoView.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.cJ.Qhi getVideoModel() {
        return this.sDy;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.ac
    public void h_() {
        this.f9128fl = false;
        this.ABk = true;
        this.Qhi = 3;
        com.bytedance.sdk.openadsdk.apiImpl.feed.ac acVar = this.Jma;
        if (acVar != null) {
            acVar.cJ(null);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.ac
    public void i_() {
        this.f9128fl = false;
        this.ABk = false;
        this.Qhi = 2;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.ac
    public void j_() {
        this.f9128fl = false;
        this.Qhi = 5;
        com.bytedance.sdk.component.adexpress.cJ.cJ cJVar = this.Eh;
        if (cJVar != null && cJVar.cJ() != null) {
            this.Eh.cJ().d_();
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.ac acVar = this.Jma;
        if (acVar != null) {
            acVar.ac(null);
        }
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar instanceof com.bytedance.sdk.openadsdk.core.ugen.ac.ac) {
            ((com.bytedance.sdk.openadsdk.core.ugen.ac.ac) flVar).d_();
        }
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.apiImpl.feed.ac acVar) {
        this.Jma = acVar;
    }

    private void cJ(final com.bytedance.sdk.component.adexpress.cJ.pA pAVar) {
        if (pAVar == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.2
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressVideoView.this.ac(pAVar);
            }
        });
    }

    private void cJ(long j10, long j11) {
        int abs = (int) Math.abs(this.kYc - j10);
        int i10 = this.kYc;
        if (i10 < 0 || abs > 500 || i10 > j11 || abs >= 500 || this.MQ.contains(this.tP)) {
            return;
        }
        if (this.kYc > j10) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.3
                @Override // java.lang.Runnable
                public void run() {
                    NativeExpressVideoView.this.NFd.setCanInterruptVideoPlay(true);
                    NativeExpressVideoView.this.NFd.performClick();
                    NativeExpressVideoView nativeExpressVideoView = NativeExpressVideoView.this;
                    nativeExpressVideoView.cJ(nativeExpressVideoView.kYc, nativeExpressVideoView.tP);
                }
            }, abs);
        } else {
            this.NFd.setCanInterruptVideoPlay(true);
            this.NFd.performClick();
            cJ(this.kYc, this.tP);
        }
        this.MQ.add(this.tP);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.cJ.hpZ
    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar, com.bytedance.sdk.component.adexpress.cJ.pA pAVar) {
        this.aP = flVar;
        this.ROR = flVar.ac();
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar2 = this.aP;
        if ((flVar2 instanceof kYc) && ((kYc) flVar2).hpZ() != null) {
            ((kYc) this.aP).hpZ().Qhi((ABk) this);
        }
        if (pAVar != null && pAVar.ac()) {
            cJ(pAVar);
        }
        super.Qhi(flVar, pAVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(boolean z10) {
        ExpressVideoView expressVideoView = this.NFd;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z10);
            setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(int i10) {
        ExpressVideoView expressVideoView = this.NFd;
        if (expressVideoView == null) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
        } else if (i10 == 1) {
            expressVideoView.Qhi(0L, true, false);
        } else if (i10 == 2 || i10 == 3) {
            expressVideoView.setCanInterruptVideoPlay(true);
            this.NFd.performClick();
        } else if (i10 == 4) {
            expressVideoView.getNativeVideoController().CJ();
        } else if (i10 != 5) {
        } else {
            expressVideoView.Qhi(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public int CJ() {
        ExpressVideoView expressVideoView;
        if (this.Qhi == 3 && (expressVideoView = this.NFd) != null) {
            expressVideoView.CJ();
        }
        ExpressVideoView expressVideoView2 = this.NFd;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().hpZ()) {
            return this.Qhi;
        }
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.cJ.hm
    public void Qhi(View view, int i10, com.bytedance.sdk.component.adexpress.ac acVar) {
        if (i10 == -1 || acVar == null) {
            return;
        }
        if (i10 == 11) {
            try {
                ExpressVideoView expressVideoView = this.NFd;
                if (expressVideoView != null) {
                    expressVideoView.setCanInterruptVideoPlay(true);
                    this.NFd.performClick();
                    if (this.ABk) {
                        this.NFd.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Ug).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.Qhi(view, i10, acVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void fl() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.ac
    public void Qhi(long j10, long j11) {
        this.f9128fl = false;
        int i10 = this.Qhi;
        if (i10 != 5 && i10 != 3 && j10 > this.lB) {
            this.Qhi = 2;
        }
        this.lB = j10;
        this.lG = j11;
        com.bytedance.sdk.component.adexpress.cJ.cJ cJVar = this.Eh;
        if (cJVar != null && cJVar.cJ() != null) {
            this.Eh.cJ().setTimeUpdate(((int) (j11 - j10)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar instanceof com.bytedance.sdk.openadsdk.core.ugen.ac.ac) {
            ((com.bytedance.sdk.openadsdk.core.ugen.ac.ac) flVar).setTimeUpdate(((int) (j11 - j10)) / 1000);
        }
        cJ(j10, j11);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.InterfaceC0061fl
    public void Qhi(int i10, int i11) {
        this.lB = this.lG;
        this.Qhi = 4;
        com.bytedance.sdk.openadsdk.apiImpl.feed.ac acVar = this.Jma;
        if (acVar != null) {
            acVar.Qhi(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(int i10, String str) {
        this.kYc = i10;
        this.tP = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public long ac() {
        return this.lB;
    }
}
