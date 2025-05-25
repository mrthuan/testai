package com.bytedance.sdk.openadsdk.component.reward.cJ;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.zc;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.model.HzH;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: BaseRewardFullAdType.java */
/* loaded from: classes.dex */
public class Qhi {
    protected int CJ;
    protected com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi Qhi;
    protected final hpZ ROR;
    protected final zc Sf;
    protected final com.bytedance.sdk.openadsdk.component.reward.view.Tgh Tgh;
    protected CQU WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected int f8855ac;
    protected tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected final pA f8856fl;

    /* renamed from: hm  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.video.ac.cJ f8857hm;

    public Qhi(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.Qhi = qhi;
        this.cJ = qhi.cJ;
        this.f8855ac = qhi.NBs;
        this.CJ = qhi.dI;
        this.f8856fl = qhi.bxS;
        this.Tgh = qhi.es;
        this.ROR = qhi.lG;
        this.Sf = qhi.js;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar, CQU cqu) {
        this.f8857hm = cJVar;
        this.WAv = cqu;
    }

    public void ac() {
        if (bxS.cJ(this.Qhi.cJ) && DeviceUtils.ROR() == 0) {
            this.Qhi.dIT = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        qhi.js.cJ(qhi.dIT);
    }

    public boolean cJ() {
        if (HzH.cJ(this.Qhi.cJ) && this.Qhi.tP.get()) {
            FrameLayout Tgh = this.Qhi.es.Tgh();
            Tgh.setVisibility(4);
            Tgh.setVisibility(0);
            return false;
        } else if (this.Qhi.WAv.get() || this.Qhi.Gm.get() || bxS.Gm(this.Qhi.cJ)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Qhi() {
        return this.Qhi.cJ.IC() || this.Qhi.cJ.gga() == 15 || this.Qhi.cJ.gga() == 5 || this.Qhi.cJ.gga() == 50;
    }

    public void Qhi(boolean z10) {
        if (this.Qhi.WAv.get()) {
            return;
        }
        tP tPVar = this.cJ;
        if (tPVar != null && tPVar.Ewb()) {
            this.Sf.ac(false);
            this.Sf.Qhi(true);
            this.Qhi.es.cJ(8);
            this.Qhi.es.ac(8);
            return;
        }
        if (!z10) {
            this.Sf.ac(false);
            this.Sf.Qhi(false);
            this.Sf.CJ(false);
            this.Qhi.es.fl(8);
        } else {
            this.Sf.Qhi(this.Qhi.cJ.rB());
            if (bxS.Gm(this.Qhi.cJ) || Qhi()) {
                this.Sf.ac(true);
            }
            if (!Qhi() && (!(this instanceof Sf) || !this.Qhi.cJ.Qhi())) {
                this.Sf.Tgh();
                this.Qhi.es.fl(0);
            } else {
                this.Sf.CJ(true);
            }
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (qhi.Hf != FullRewardExpressView.Qhi) {
                qhi.es.cJ(8);
                this.Qhi.es.ac(8);
                return;
            }
            qhi.es.cJ(0);
            this.Qhi.es.ac(0);
            return;
        }
        this.Qhi.es.cJ(4);
        this.Qhi.es.ac(8);
    }
}
