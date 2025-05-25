package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.ABk;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Sf;
import com.bytedance.sdk.openadsdk.utils.zn;
import org.json.JSONObject;

/* compiled from: RewardFullExpressVideoLayout.java */
/* loaded from: classes.dex */
public class ac {
    private boolean Gm;
    com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl Qhi;
    private final tP ROR;
    private final String Sf;
    private final Activity Tgh;
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi WAv;
    Handler cJ;

    /* renamed from: hm  reason: collision with root package name */
    private FullRewardExpressView f8886hm;

    /* renamed from: ac  reason: collision with root package name */
    boolean f8884ac = false;
    boolean CJ = false;

    /* renamed from: fl  reason: collision with root package name */
    boolean f8885fl = false;

    public ac(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.WAv = qhi;
        this.Tgh = qhi.FQ;
        this.ROR = qhi.cJ;
        this.Sf = qhi.f8798fl;
    }

    public boolean CJ() {
        return this.CJ;
    }

    public void Gm() {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.hm();
        this.f8886hm.WAv();
    }

    public void Qhi(AdSlot adSlot) {
        if (this.f8885fl) {
            return;
        }
        this.f8885fl = true;
        this.f8886hm = new FullRewardExpressView(this.WAv, adSlot, this.Sf);
    }

    public void ROR() {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.WAv();
        }
    }

    public boolean Sf() {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.ABk();
    }

    public void Tgh() {
        if (this.Gm) {
            return;
        }
        this.Gm = true;
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.Gm();
        }
        Handler handler = this.cJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void WAv() {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.Sf();
    }

    public boolean ac() {
        return this.f8884ac;
    }

    public FrameLayout cJ() {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView != null) {
            FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
            if (this.f8886hm.ABk()) {
                zc();
            }
            return videoFrameLayout;
        }
        return null;
    }

    public Handler fl() {
        if (this.cJ == null) {
            this.cJ = new Handler(Looper.getMainLooper());
        }
        return this.cJ;
    }

    public int hm() {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    public void zc() {
        if (tP.fl(this.ROR) && this.ROR.aP() == 3 && this.ROR.NFd() == 0) {
            try {
                if (this.ROR.SL() == 1) {
                    int cJ = zn.cJ(HzH.Qhi(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.f8886hm.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = cJ;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public FullRewardExpressView Qhi() {
        return this.f8886hm;
    }

    public void Qhi(boolean z10) {
        this.f8884ac = z10;
    }

    public void cJ(boolean z10) {
        this.CJ = z10;
    }

    public void Qhi(Sf sf2, com.bytedance.sdk.openadsdk.core.nativeexpress.ROR ror) {
        tP tPVar;
        if (this.f8886hm == null || (tPVar = this.ROR) == null) {
            return;
        }
        this.Qhi = Qhi(tPVar);
        sf2.Qhi(this.f8886hm);
        sf2.Qhi(this.Qhi);
        this.f8886hm.setClickListener(sf2);
        ror.Qhi((View) this.f8886hm);
        ror.Qhi(this.Qhi);
        this.f8886hm.setClickCreativeListener(ror);
    }

    private com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl Qhi(tP tPVar) {
        if (tPVar.ip() == 4) {
            return com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(this.Tgh, tPVar, this.Sf);
        }
        return null;
    }

    public void Qhi(ABk aBk) {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressVideoListenerProxy(aBk);
    }

    public void Qhi(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public JSONObject Qhi(JSONObject jSONObject) {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.Qhi(jSONObject, this.WAv.cJ);
        }
        return null;
    }

    public void Qhi(int i10, boolean z10) {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.Qhi(i10, z10);
        }
    }

    public void Qhi(int i10, String str) {
        FullRewardExpressView fullRewardExpressView = this.f8886hm;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.cJ(i10, str);
        }
    }
}
