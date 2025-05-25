package com.bytedance.sdk.openadsdk.core.ugen.cJ;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.Gm;
import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.pA;
import com.bytedance.adsdk.ugeno.core.zc;
import com.bytedance.sdk.openadsdk.core.ugen.CJ.ROR;
import com.bytedance.sdk.openadsdk.utils.lG;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenEndCardRender.java */
/* loaded from: classes.dex */
public class Qhi implements iMK, pA {
    private pA CJ;
    private final Context Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private InterfaceC0128Qhi f9200ac;
    private com.bytedance.adsdk.ugeno.component.cJ<View> cJ;

    /* compiled from: UGenEndCardRender.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.cJ.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0128Qhi {
        void Qhi(zc zcVar);
    }

    public Qhi(Context context) {
        this.Qhi = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(JSONObject jSONObject, JSONObject jSONObject2, ROR ror) {
        try {
            Gm gm2 = new Gm(this.Qhi);
            com.bytedance.adsdk.ugeno.component.cJ<View> Qhi = gm2.Qhi(jSONObject);
            this.cJ = Qhi;
            if (Qhi == null) {
                if (ror != null) {
                    ror.Qhi(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View hm2 = Qhi.hm();
            if (hm2 != null) {
                hm2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.Qhi.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            gm2.Qhi((iMK) this);
            gm2.Qhi((pA) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.zc.Qhi());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            gm2.cJ(jSONObject2);
            if (ror != null) {
                ror.Qhi(this.cJ);
            }
        } catch (Exception e10) {
            if (ror != null) {
                ror.Qhi(3000, "ugen render fail exception is" + e10.getMessage());
            }
        }
    }

    public void Qhi(final JSONObject jSONObject, final JSONObject jSONObject2, final ROR ror) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cJ(jSONObject, jSONObject2, ror);
        } else {
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.Qhi.1
                @Override // java.lang.Runnable
                public void run() {
                    Qhi.this.cJ(jSONObject, jSONObject2, ror);
                }
            });
        }
    }

    public void Qhi(InterfaceC0128Qhi interfaceC0128Qhi) {
        this.f9200ac = interfaceC0128Qhi;
    }

    public void Qhi(pA pAVar) {
        this.CJ = pAVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.iMK
    public void Qhi(zc zcVar, iMK.cJ cJVar, iMK.Qhi qhi) {
        InterfaceC0128Qhi interfaceC0128Qhi;
        if (zcVar == null) {
            return;
        }
        if ((zcVar.cJ() == 1 || zcVar.cJ() == 4) && (interfaceC0128Qhi = this.f9200ac) != null) {
            interfaceC0128Qhi.Qhi(zcVar);
        }
        if (cJVar == null || zcVar.CJ() == null) {
            return;
        }
        cJVar.Qhi(zcVar.CJ());
    }

    @Override // com.bytedance.adsdk.ugeno.core.pA
    public void Qhi(com.bytedance.adsdk.ugeno.component.cJ cJVar, MotionEvent motionEvent) {
        pA pAVar = this.CJ;
        if (pAVar != null) {
            pAVar.Qhi(cJVar, motionEvent);
        }
    }
}
