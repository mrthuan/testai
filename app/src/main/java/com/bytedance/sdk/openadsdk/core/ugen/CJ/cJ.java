package com.bytedance.sdk.openadsdk.core.ugen.cJ;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.pA;
import com.bytedance.adsdk.ugeno.core.zc;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.lB;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.ugen.CJ.ROR;
import com.bytedance.sdk.openadsdk.core.ugen.CJ.ac;
import com.bytedance.sdk.openadsdk.core.ugen.CJ.fl;
import com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ;
import com.bytedance.sdk.openadsdk.core.ugen.cJ.Qhi;
import com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.media.C1646h;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenEndcardInflater.java */
/* loaded from: classes.dex */
public class cJ implements pA, Qhi.InterfaceC0128Qhi {
    protected static int Qhi = 8;
    private View ABk;
    private final tP CJ;
    private ac Gm;
    private float HzH;
    private boolean MQ = true;
    private String ROR;
    private String Sf;
    private String Tgh;
    private final fl WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Activity f9202ac;
    private Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi f9203fl;

    /* renamed from: hm  reason: collision with root package name */
    private JSONObject f9204hm;
    private float hpZ;
    private float iMK;
    private long kYc;
    private float pA;
    private long tP;

    /* renamed from: zc  reason: collision with root package name */
    private String f9205zc;

    public cJ(Activity activity, tP tPVar, com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi qhi, String str, fl flVar) {
        this.f9202ac = activity;
        this.f9205zc = str;
        this.CJ = tPVar;
        this.WAv = flVar;
        this.f9203fl = qhi;
    }

    private void cJ() {
        int ip2 = this.CJ.ip();
        if (ip2 != 2 && ip2 != 3) {
            if (ip2 == 4) {
                Tgh.Qhi(this.f9202ac, this.CJ, this.f9205zc).CJ();
                return;
            } else if (ip2 != 5) {
                return;
            } else {
                js.ac(this.f9202ac, this.CJ.Dq());
                return;
            }
        }
        if (ip2 == 3) {
            String YB = this.CJ.YB();
            if (!TextUtils.isEmpty(YB) && YB.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.ac.Qhi(this.f9202ac, YB, YB.substring(YB.indexOf("?id=") + 4), this.f9205zc, this.CJ)) {
                    return;
                }
            }
        }
        Activity activity = this.f9202ac;
        tP tPVar = this.CJ;
        int Qhi2 = js.Qhi(this.f9205zc);
        String str = this.f9205zc;
        lB.Qhi((Context) activity, tPVar, Qhi2, (PAGNativeAd) null, (PangleAd) null, str, Tgh.Qhi(this.f9202ac, this.CJ, str), true, 0);
    }

    public void Qhi() {
        if (this.CJ == null) {
            this.WAv.Qhi(1, "material is null", "net");
        } else if (this.f9203fl == null) {
            this.WAv.Qhi(1, "material ugen template is null", "net");
        } else {
            this.cJ = new Qhi(this.f9202ac);
            this.Sf = this.f9203fl.ac();
            this.Tgh = this.f9203fl.Qhi();
            this.ROR = this.f9203fl.cJ();
            this.f9204hm = this.CJ.mZ();
            this.WAv.Qhi();
            com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi().Qhi("endcard", this.Sf, this.Tgh, this.ROR, "", new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.cJ.1
                @Override // com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi
                public void Qhi(JSONObject jSONObject, String str) {
                    cJ cJVar = cJ.this;
                    cJVar.Qhi(jSONObject, cJVar.f9204hm);
                    cJ.this.WAv.Qhi(str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi
                public void Qhi(int i10, String str, String str2) {
                    cJ.this.WAv.Qhi(i10, str, str2);
                }
            });
        }
    }

    public void Qhi(View view) {
        this.ABk = view;
    }

    public void Qhi(ac acVar) {
        this.Gm = acVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(JSONObject jSONObject, JSONObject jSONObject2) {
        this.cJ.Qhi((Qhi.InterfaceC0128Qhi) this);
        this.cJ.Qhi((pA) this);
        this.WAv.cJ();
        this.cJ.Qhi(jSONObject, jSONObject2, new ROR() { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.cJ.2
            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.ROR
            public void Qhi(int i10, String str) {
                if (cJ.this.WAv != null) {
                    cJ.this.WAv.Qhi(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.ROR
            public void Qhi(com.bytedance.adsdk.ugeno.component.cJ<View> cJVar) {
                if (cJ.this.WAv != null) {
                    cJ.this.WAv.Qhi(cJVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.cJ.Qhi.InterfaceC0128Qhi
    public void Qhi(zc zcVar) {
        String optString = zcVar.ac().optString("type");
        optString.getClass();
        char c = 65535;
        switch (optString.hashCode()) {
            case -314498168:
                if (optString.equals("privacy")) {
                    c = 0;
                    break;
                }
                break;
            case 94756344:
                if (optString.equals("close")) {
                    c = 1;
                    break;
                }
                break;
            case 1820422063:
                if (optString.equals("creative")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (this.f9202ac == null || TextUtils.isEmpty(HzH.CJ().es())) {
                    return;
                }
                TTWebsiteActivity.Qhi(this.f9202ac, this.CJ, this.f9205zc);
                return;
            case 1:
                ac acVar = this.Gm;
                if (acVar != null) {
                    acVar.cJ();
                    return;
                }
                return;
            case 2:
                if (this.f9202ac == null || this.CJ == null) {
                    return;
                }
                cJ();
                Activity activity = this.f9202ac;
                if (activity instanceof com.bytedance.sdk.openadsdk.core.video.ac.cJ) {
                    ((com.bytedance.sdk.openadsdk.core.video.ac.cJ) activity).CJ();
                }
                Qhi(zcVar, this.CJ);
                return;
            default:
                return;
        }
    }

    private void Qhi(zc zcVar, tP tPVar) {
        int[] iArr;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.iMK);
            jSONObject.put("down_y", this.pA);
            jSONObject.put("down_time", this.kYc);
            jSONObject.put("up_x", this.hpZ);
            jSONObject.put("up_y", this.HzH);
            jSONObject.put("up_time", this.tP);
            View hm2 = zcVar.Qhi().hm();
            int i10 = 1;
            if (hm2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                hm2.getLocationOnScreen(new int[2]);
                jSONObject2.put(InMobiNetworkValues.WIDTH, hm2.getWidth());
                jSONObject2.put(InMobiNetworkValues.HEIGHT, hm2.getHeight());
                jSONObject2.put("left", iArr[0]);
                jSONObject2.put("top", iArr[1]);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.ABk;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.ABk.getWidth());
                jSONObject.put("button_height", this.ABk.getHeight());
            }
            View findViewById = this.f9202ac.findViewById(16908290);
            if (findViewById != null) {
                int[] iArr3 = new int[2];
                findViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put(InMobiNetworkValues.WIDTH, findViewById.getWidth());
                jSONObject.put(InMobiNetworkValues.HEIGHT, findViewById.getHeight());
            }
            jSONObject.put("click_area_type", zcVar.Qhi().pA());
            jSONObject.put("brick_id", zcVar.Qhi().iMK());
            jSONObject.put("endcard_id", this.Tgh);
            jSONObject.put("click_scence", 2);
            if (!this.MQ) {
                i10 = 2;
            }
            jSONObject.put("user_behavior_type", i10);
            ac acVar = this.Gm;
            if (acVar != null) {
                jSONObject.put("endcard_type", acVar.Qhi());
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, this.f9205zc, C1646h.CLICK_BEACON, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.pA
    public void Qhi(com.bytedance.adsdk.ugeno.component.cJ cJVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kYc = System.currentTimeMillis();
            this.iMK = motionEvent.getRawX();
            this.pA = motionEvent.getRawY();
            this.MQ = true;
        } else if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.iMK) >= Qhi || Math.abs(motionEvent.getRawY() - this.pA) >= Qhi) {
                this.MQ = false;
            }
        } else {
            this.hpZ = motionEvent.getRawX();
            this.HzH = motionEvent.getRawY();
            if (Math.abs(this.hpZ - this.iMK) >= Qhi || Math.abs(this.HzH - this.pA) >= Qhi) {
                this.MQ = false;
            }
            this.tP = System.currentTimeMillis();
        }
    }
}
