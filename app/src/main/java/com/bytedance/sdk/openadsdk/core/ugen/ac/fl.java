package com.bytedance.sdk.openadsdk.core.ugen.ac;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.zc;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.kYc;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Iterator;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UGenSwiperEvent.java */
/* loaded from: classes.dex */
public class fl {
    private boolean ABk;
    private com.bytedance.adsdk.ugeno.component.cJ CJ;
    private JSONObject Gm;
    private final Context ROR;
    private final tP Sf;
    private com.bytedance.sdk.openadsdk.core.widget.ac WAv;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.component.cJ f9196ac;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.component.cJ f9197fl;

    /* renamed from: hm  reason: collision with root package name */
    private final String f9198hm;
    private JSONArray hpZ;
    private boolean iMK;
    private boolean pA;

    /* renamed from: zc  reason: collision with root package name */
    private final JSONObject f9199zc;
    private int Qhi = -1;
    private int cJ = -1;
    private final String Tgh = "UGenSwiperEvent";

    public fl(Context context, tP tPVar, String str, JSONObject jSONObject) {
        this.ROR = context;
        this.Sf = tPVar;
        this.f9198hm = str;
        this.f9199zc = jSONObject;
    }

    public JSONObject CJ() {
        return this.Gm;
    }

    public void ac() {
        int i10;
        com.bytedance.adsdk.ugeno.component.cJ cJVar = this.f9197fl;
        if (!(cJVar instanceof com.bytedance.adsdk.ugeno.cJ) || (i10 = this.Qhi) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.cJ) cJVar).Qhi(i10 + 1);
    }

    public void cJ() {
        int i10;
        com.bytedance.adsdk.ugeno.component.cJ cJVar = this.f9197fl;
        if (!(cJVar instanceof com.bytedance.adsdk.ugeno.cJ) || (i10 = this.Qhi) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.cJ) cJVar).Qhi(i10 - 1);
    }

    public void Qhi(com.bytedance.adsdk.ugeno.component.cJ<View> cJVar) {
        com.bytedance.adsdk.ugeno.component.cJ<View> cJ = cJVar.cJ("swiperLayout");
        this.f9197fl = cJ;
        if (cJ instanceof com.bytedance.adsdk.ugeno.cJ) {
            this.hpZ = this.f9199zc.optJSONArray("dpa_data");
            this.f9196ac = cJVar.cJ("swiperLeftArrow");
            this.CJ = cJVar.cJ("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.cJ) this.f9197fl).Qhi(new com.bytedance.adsdk.ugeno.swiper.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.ugen.ac.fl.1
                @Override // com.bytedance.adsdk.ugeno.swiper.Qhi
                public void Qhi(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                    fl.this.cJ = i10;
                    fl.this.Qhi = i11;
                    fl.this.ABk = z10;
                    fl.this.iMK = z11;
                    fl.this.pA = z12;
                    fl.this.Qhi(z10, z11, z12);
                    fl.this.Qhi(i10);
                }
            });
        }
    }

    public void Qhi() {
        Qhi(this.ABk, this.iMK, this.pA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(boolean z10, boolean z11, boolean z12) {
        com.bytedance.adsdk.ugeno.component.cJ cJVar = this.f9196ac;
        if (cJVar == null || this.CJ == null) {
            return;
        }
        View hm2 = cJVar.hm();
        View hm3 = this.CJ.hm();
        JSONArray jSONArray = this.hpZ;
        if (jSONArray != null && jSONArray.length() == 1) {
            hm2.setVisibility(8);
            hm3.setVisibility(8);
        } else if (z10) {
        } else {
            if (z11) {
                if (hm2 instanceof TextView) {
                    Qhi((TextView) hm2, 90);
                }
                if (hm3 instanceof TextView) {
                    Qhi((TextView) hm3, FunctionEval.FunctionID.EXTERNAL_FUNC);
                }
            } else if (z12) {
                if (hm2 instanceof TextView) {
                    Qhi((TextView) hm2, FunctionEval.FunctionID.EXTERNAL_FUNC);
                }
                if (hm3 instanceof TextView) {
                    Qhi((TextView) hm3, 90);
                }
            } else {
                if (hm2 instanceof TextView) {
                    Qhi((TextView) hm2, FunctionEval.FunctionID.EXTERNAL_FUNC);
                }
                if (hm3 instanceof TextView) {
                    Qhi((TextView) hm3, FunctionEval.FunctionID.EXTERNAL_FUNC);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i10);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.Sf, this.f9198hm, "carousel_show", jSONObject);
    }

    private void Qhi(TextView textView, int i10) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i10, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.widget.ac acVar) {
        this.WAv = acVar;
    }

    public boolean Qhi(zc zcVar) {
        JSONObject optJSONObject;
        this.Gm = null;
        int i10 = this.cJ;
        if (i10 != -1 && i10 != 0) {
            try {
                JSONObject ac2 = zcVar.ac();
                if (ac2 != null && (optJSONObject = ac2.optJSONObject("related_dpa_click")) != null) {
                    boolean optBoolean = optJSONObject.optBoolean("enableOpenExternalUrl");
                    int optInt = optJSONObject.optInt("landingStyle");
                    if (optBoolean && optInt != -1) {
                        if (this.hpZ != null) {
                            String Qhi = com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(optJSONObject.optString(InMobiNetworkValues.URL), this.hpZ.optJSONObject(this.cJ));
                            String Qhi2 = com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(optJSONObject.optString("fallback_url"), this.hpZ.optJSONObject(this.cJ));
                            optJSONObject.put(InMobiNetworkValues.URL, Qhi);
                            optJSONObject.put("fallback_url", Qhi2);
                            Qhi(optJSONObject, this.hpZ.optJSONObject(this.cJ));
                        }
                        Qhi(optJSONObject, zcVar.Qhi().hm());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th2) {
                ABk.Qhi("UGenSwiperEvent", th2.getMessage());
            }
        }
        return false;
    }

    private void Qhi(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
        this.Gm = optJSONObject;
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.Gm.putOpt(next, com.bytedance.adsdk.ugeno.Qhi.ac.Qhi((String) this.Gm.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.Gm);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0008, code lost:
        if (r4 != 3) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean Qhi(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            goto L27
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.hpZ.Qhi(r6)
            if (r4 != 0) goto L26
            goto L27
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.hpZ.Qhi(r5)
            if (r4 != 0) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ugen.ac.fl.Qhi(int, java.lang.String, java.lang.String):boolean");
    }

    private void Qhi(JSONObject jSONObject, View view) {
        if (Qhi(jSONObject.optInt("landingStyle"), jSONObject.optString(InMobiNetworkValues.URL), jSONObject.optString("fallback_url"))) {
            kYc.Qhi(Qhi(view), this.ROR instanceof Activity, jSONObject, this.Sf, this.f9198hm, js.Qhi(this.f9198hm), null, this.WAv);
        }
    }

    private Context Qhi(View view) {
        Activity Qhi = view != null ? com.bytedance.sdk.component.utils.cJ.Qhi(view) : null;
        return Qhi == null ? this.ROR : Qhi;
    }
}
