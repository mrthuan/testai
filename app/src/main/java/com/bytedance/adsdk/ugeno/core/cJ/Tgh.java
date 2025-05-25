package com.bytedance.adsdk.ugeno.core.cJ;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.cJ.WAv;
import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.zc;
import org.json.JSONObject;

/* compiled from: UGTimerEventProcessor.java */
/* loaded from: classes.dex */
public class Tgh implements WAv.Qhi {
    private Context CJ;
    private boolean Qhi;
    private Handler ROR = new WAv(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.component.cJ Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private iMK f7933ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private zc f7934fl;

    public Tgh(Context context, zc zcVar, com.bytedance.adsdk.ugeno.component.cJ cJVar) {
        this.CJ = context;
        this.f7934fl = zcVar;
        this.Tgh = cJVar;
    }

    public void Qhi(iMK imk) {
        this.f7933ac = imk;
    }

    public void Qhi() {
        zc zcVar = this.f7934fl;
        if (zcVar == null) {
            return;
        }
        JSONObject ac2 = zcVar.ac();
        try {
            this.cJ = Integer.parseInt(com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(ac2.optString("interval", "8000"), this.Tgh.WAv()));
            this.Qhi = ac2.optBoolean("repeat");
            this.ROR.sendEmptyMessageDelayed(1001, this.cJ);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cJ.WAv.Qhi
    public void Qhi(Message message) {
        if (message.what != 1001) {
            return;
        }
        iMK imk = this.f7933ac;
        if (imk != null) {
            zc zcVar = this.f7934fl;
            com.bytedance.adsdk.ugeno.component.cJ cJVar = this.Tgh;
            imk.Qhi(zcVar, cJVar, cJVar);
        }
        if (this.Qhi) {
            this.ROR.sendEmptyMessageDelayed(1001, this.cJ);
        } else {
            this.ROR.removeMessages(1001);
        }
    }
}
