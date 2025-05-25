package com.bytedance.adsdk.ugeno.core.cJ;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.cJ.WAv;
import com.bytedance.adsdk.ugeno.core.hm;
import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.zc;
import org.json.JSONObject;

/* compiled from: UGDelayEventProcessor.java */
/* loaded from: classes.dex */
public class cJ implements WAv.Qhi {
    private zc CJ;
    private int Qhi;
    private Handler Tgh = new WAv(Looper.getMainLooper(), this);

    /* renamed from: ac  reason: collision with root package name */
    private Context f7937ac;
    private iMK cJ;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.component.cJ f7938fl;

    public cJ(Context context, zc zcVar, com.bytedance.adsdk.ugeno.component.cJ cJVar) {
        this.f7937ac = context;
        this.CJ = zcVar;
        this.f7938fl = cJVar;
    }

    public void Qhi(iMK imk) {
        this.cJ = imk;
    }

    public void Qhi() {
        zc zcVar = this.CJ;
        if (zcVar == null) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(zcVar.ac().optString("delay"), this.f7938fl.WAv()));
            this.Qhi = parseInt;
            this.Tgh.sendEmptyMessageDelayed(1001, parseInt);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cJ.WAv.Qhi
    public void Qhi(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject ac2 = this.CJ.ac();
        if (TextUtils.equals(ac2.optString("type"), "onAnimation")) {
            String optString = ac2.optString("nodeId");
            com.bytedance.adsdk.ugeno.component.cJ cJVar = this.f7938fl;
            com.bytedance.adsdk.ugeno.component.cJ cJ = cJVar.cJ(cJVar).cJ(optString);
            new hm(cJ.hm(), com.bytedance.adsdk.ugeno.core.Qhi.Qhi(ac2.optJSONObject("animatorSet"), cJ)).Qhi();
        } else {
            iMK imk = this.cJ;
            if (imk != null) {
                zc zcVar = this.CJ;
                com.bytedance.adsdk.ugeno.component.cJ cJVar2 = this.f7938fl;
                imk.Qhi(zcVar, cJVar2, cJVar2);
            }
        }
        this.Tgh.removeMessages(1001);
    }
}
