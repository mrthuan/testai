package com.bytedance.adsdk.ugeno.core.Qhi;

import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.zc;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import org.json.JSONObject;

/* compiled from: UGenEventListenerAdapter.java */
/* loaded from: classes.dex */
public class Qhi implements iMK {
    private JSONObject CJ;
    private iMK Qhi;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private volatile C0077Qhi f7925fl;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f7924ac = true;
    private boolean Tgh = false;

    /* compiled from: UGenEventListenerAdapter.java */
    /* renamed from: com.bytedance.adsdk.ugeno.core.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0077Qhi implements ICustomRouter {
        private iMK.cJ CJ;
        iMK.Qhi Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private zc f7929ac;

        public C0077Qhi() {
        }

        public void Qhi(zc zcVar) {
            this.f7929ac = zcVar;
        }

        public void Qhi(iMK.cJ cJVar) {
            this.CJ = cJVar;
        }

        public void Qhi(iMK.Qhi qhi) {
            this.Qhi = qhi;
        }
    }

    public Qhi(iMK imk) {
        this.Qhi = imk;
    }

    private void ac(zc zcVar, iMK.cJ cJVar, iMK.Qhi qhi) {
        if (this.f7925fl == null) {
            this.f7925fl = cJ();
        }
        this.f7925fl.Qhi(zcVar);
        this.f7925fl.Qhi(cJVar);
        this.f7925fl.Qhi(qhi);
        JSONObject ac2 = zcVar.ac();
        if (ac2 == null) {
            return;
        }
        new EventChainAction.Builder(ac2.optString("type")).setChainData(this.CJ).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.Qhi.Qhi.1
        }).build().run();
    }

    public void Qhi(JSONObject jSONObject) {
        this.CJ = jSONObject;
    }

    public void cJ(boolean z10) {
        this.Tgh = z10;
    }

    private void cJ(zc zcVar, iMK.cJ cJVar, iMK.Qhi qhi) {
        iMK imk = this.Qhi;
        if (imk == null) {
            return;
        }
        imk.Qhi(zcVar, cJVar, qhi);
    }

    public void Qhi(String str) {
        this.cJ = str;
    }

    public void Qhi(boolean z10) {
        this.f7924ac = z10;
    }

    private C0077Qhi cJ() {
        if (this.f7925fl != null) {
            return this.f7925fl;
        }
        synchronized (C0077Qhi.class) {
            if (this.f7925fl != null) {
                return this.f7925fl;
            }
            this.f7925fl = new C0077Qhi();
            return this.f7925fl;
        }
    }

    public boolean Qhi() {
        String str;
        return this.f7924ac && (str = this.cJ) != null && "3".compareTo(str) <= 0 && this.CJ != null;
    }

    @Override // com.bytedance.adsdk.ugeno.core.iMK
    public void Qhi(zc zcVar, iMK.cJ cJVar, iMK.Qhi qhi) {
        if (Qhi()) {
            ac(zcVar, cJVar, qhi);
        } else {
            cJ(zcVar, cJVar, qhi);
        }
    }
}
