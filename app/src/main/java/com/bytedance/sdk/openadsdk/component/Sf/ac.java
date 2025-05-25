package com.bytedance.sdk.openadsdk.component.Sf;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.core.cJ.Qhi;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: TTAppOpenVideoManager.java */
/* loaded from: classes.dex */
public class ac implements Qhi.InterfaceC0120Qhi {
    private cJ CJ;
    private Context Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private tP f8760ac;
    private FrameLayout cJ;

    public ac(Context context) {
        this.Qhi = context.getApplicationContext();
    }

    public void CJ() {
        try {
            if (cJ()) {
                this.CJ.Qhi();
            }
        } catch (Throwable th2) {
            ABk.Qhi("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public void Qhi(FrameLayout frameLayout, tP tPVar) {
        this.cJ = frameLayout;
        this.f8760ac = tPVar;
        this.CJ = new cJ(this.Qhi, frameLayout, tPVar);
    }

    public long ROR() {
        cJ cJVar = this.CJ;
        if (cJVar != null) {
            return cJVar.fl();
        }
        return 0L;
    }

    public long Sf() {
        cJ cJVar = this.CJ;
        if (cJVar != null) {
            return cJVar.Tgh();
        }
        return 0L;
    }

    public void Tgh() {
        cJ cJVar = this.CJ;
        if (cJVar == null) {
            return;
        }
        this.Qhi = null;
        cJVar.ac();
        this.CJ = null;
    }

    public boolean ac() {
        cJ cJVar = this.CJ;
        if (cJVar != null && cJVar.zc() != null && this.CJ.zc().ROR()) {
            return true;
        }
        return false;
    }

    public boolean cJ() {
        cJ cJVar = this.CJ;
        if (cJVar != null && cJVar.zc() != null && this.CJ.zc().Tgh()) {
            return true;
        }
        return false;
    }

    public void fl() {
        cJ cJVar = this.CJ;
        if (cJVar != null) {
            cJVar.cJ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cJ.Qhi.InterfaceC0120Qhi
    public long getVideoProgress() {
        return ROR();
    }

    public long hm() {
        cJ cJVar = this.CJ;
        if (cJVar != null) {
            return this.CJ.Tgh() + cJVar.Sf();
        }
        return 0L;
    }

    public boolean Qhi() {
        com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi = tP.Qhi(CacheDirFactory.getICacheDir(0).cJ(), this.f8760ac);
        Qhi.cJ(this.f8760ac.HLI());
        Qhi.Qhi(this.cJ.getWidth());
        Qhi.cJ(this.cJ.getHeight());
        Qhi.ac(this.f8760ac.EGK());
        Qhi.Qhi(0L);
        Qhi.Qhi(true);
        return this.CJ.Qhi(Qhi);
    }

    public void Qhi(fl.Qhi qhi) {
        cJ cJVar = this.CJ;
        if (cJVar != null) {
            cJVar.Qhi(qhi);
        }
    }

    public void Qhi(int i10) {
        if (this.CJ != null) {
            hpZ.Qhi qhi = new hpZ.Qhi();
            qhi.Qhi(ROR());
            qhi.ac(hm());
            qhi.cJ(Sf());
            qhi.ac(i10);
            qhi.CJ(this.CJ.ROR());
            this.CJ.Qhi(qhi);
        }
    }
}
