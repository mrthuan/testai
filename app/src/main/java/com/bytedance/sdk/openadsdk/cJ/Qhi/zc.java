package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.content.Context;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: OverSeaLogDepend.java */
/* loaded from: classes.dex */
public class zc implements com.bytedance.sdk.component.Tgh.Qhi.Tgh {
    private final String Qhi = "[6206]";

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public void ABk() {
        Qhi.Qhi(Qhi.Tgh);
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public Executor CJ() {
        return lG.ac();
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public com.bytedance.sdk.component.Tgh.Qhi.ROR Gm() {
        com.bytedance.sdk.component.Tgh.Qhi.ROR Qhi;
        synchronized (this) {
            Qhi = com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi());
        }
        return Qhi;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh Qhi(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public boolean ROR() {
        return false;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public boolean Sf() {
        return true;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public int Tgh() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public com.bytedance.sdk.component.Tgh.Qhi.fl.ac WAv() {
        return new Sf();
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public boolean ac() {
        return true;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public boolean cJ() {
        return false;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public Executor fl() {
        return lG.ROR();
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public String hm() {
        return js.ac();
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public boolean iMK() {
        return BinderPoolService.Qhi;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public com.bytedance.sdk.component.Tgh.Qhi.Sf zc() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public boolean Qhi() {
        return false;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public int ac(String str) {
        return com.bytedance.sdk.openadsdk.core.settings.HzH.YD().HUk().Qhi(str);
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public String cJ(String str) {
        return com.bytedance.sdk.component.CJ.Qhi.Qhi(str, com.bytedance.sdk.openadsdk.core.Qhi.Qhi());
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public boolean Qhi(Context context) {
        return hpZ.Qhi(context);
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public String Qhi(String str) {
        return com.bytedance.sdk.component.CJ.Qhi.cJ(str, com.bytedance.sdk.openadsdk.core.Qhi.Qhi());
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public void Qhi(boolean z10, int i10, long j10, com.bytedance.sdk.component.Tgh.Qhi.Tgh.fl flVar) {
        Runnable Qhi;
        if (flVar == null) {
            return;
        }
        Qhi.Qhi(Qhi.f8647ac, z10, i10, j10);
        if (z10) {
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi("track_link_result", false, (com.bytedance.sdk.openadsdk.Gm.cJ) new iMK(true, flVar));
            return;
        }
        pA HUk = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().HUk();
        if (HUk != null && flVar.CJ() < HUk.Qhi(flVar.Tgh())) {
            if (!HUk.Qhi() || (Qhi = flVar.Qhi(com.bytedance.sdk.openadsdk.core.zc.Qhi(HzH.Qhi()), null)) == null) {
                return;
            }
            lG.Qhi().schedule(Qhi, HUk.cJ(flVar.Tgh()), TimeUnit.SECONDS);
            return;
        }
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("track_link_result", false, (com.bytedance.sdk.openadsdk.Gm.cJ) new iMK(false, flVar));
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh
    public void Qhi(boolean z10) {
        Qhi.Qhi(Qhi.Tgh, z10);
    }
}
