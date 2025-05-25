package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayableModel.java */
/* loaded from: classes.dex */
public class bxS {
    private int CJ;
    private int Qhi;
    private int ROR;
    private int Sf;
    private String Tgh;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f9088ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f9089fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f9090hm;

    public bxS(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f9088ac = jSONObject.optBoolean("is_playable");
        this.CJ = jSONObject.optInt("playable_type", 0);
        this.f9089fl = jSONObject.optString("playable_style");
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.Tgh = optJSONObject.optString("playable_url", "");
            this.ROR = optJSONObject.optInt("playable_orientation", 0);
            this.cJ = optJSONObject.optInt("new_style", 0);
            this.Qhi = optJSONObject.optInt("close_2_app", 0);
            int cJ = cJ(this.CJ);
            this.Sf = optJSONObject.optInt("playable_webview_timeout", cJ);
            this.f9090hm = optJSONObject.optInt("playable_js_timeout", cJ);
            this.WAv = optJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    public static long ABk(tP tPVar) {
        return Math.max(iMK(tPVar), pA(tPVar));
    }

    public static String CJ(tP tPVar) {
        bxS HzH = HzH(tPVar);
        if (HzH == null) {
            return null;
        }
        return HzH.f9089fl;
    }

    public static boolean Gm(tP tPVar) {
        if (cJ(tPVar) && kYc(tPVar) == 1) {
            return true;
        }
        return false;
    }

    private static bxS HzH(tP tPVar) {
        if (tPVar == null) {
            return null;
        }
        return tPVar.pA();
    }

    public static int Qhi(int i10) {
        return i10 + 10;
    }

    public static boolean ROR(tP tPVar) {
        return true;
    }

    public static boolean Sf(tP tPVar) {
        int i10;
        if (tPVar != null && tPVar.FQ() != null) {
            i10 = tPVar.FQ().MQ();
        } else {
            i10 = 0;
        }
        if (i10 == 1) {
            return false;
        }
        return true;
    }

    public static String Tgh(tP tPVar) {
        if (tPVar == null) {
            return null;
        }
        bxS pA = tPVar.pA();
        if (pA != null && pA.f9088ac) {
            String str = pA.Tgh;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (tPVar.hpZ() == 20) {
            return tPVar.YB();
        }
        if (tPVar.FQ() == null) {
            return null;
        }
        return tPVar.FQ().zc();
    }

    public static int WAv(tP tPVar) {
        bxS HzH = HzH(tPVar);
        if (HzH == null) {
            return 0;
        }
        return HzH.ROR;
    }

    public static boolean ac(tP tPVar) {
        bxS pA = tPVar.pA();
        return pA != null && pA.f9088ac && pA.cJ == 1;
    }

    private static int cJ(int i10) {
        return i10 == 1 ? 10 : 5;
    }

    public static String fl(tP tPVar) {
        bxS HzH = HzH(tPVar);
        if (HzH == null) {
            return null;
        }
        return HzH.Tgh;
    }

    public static boolean hm(tP tPVar) {
        com.bykv.vk.openvk.component.video.api.ac.cJ FQ = tPVar.FQ();
        if (FQ == null || FQ.MQ() != 1) {
            return false;
        }
        return true;
    }

    public static boolean hpZ(tP tPVar) {
        bxS HzH = HzH(tPVar);
        if (HzH != null && HzH.ac()) {
            return true;
        }
        return false;
    }

    public static long iMK(tP tPVar) {
        bxS HzH = HzH(tPVar);
        if (HzH == null) {
            return 5L;
        }
        return HzH.Qhi();
    }

    private static int kYc(tP tPVar) {
        bxS HzH = HzH(tPVar);
        if (HzH == null) {
            return 0;
        }
        return HzH.CJ;
    }

    public static long pA(tP tPVar) {
        bxS HzH = HzH(tPVar);
        if (HzH == null) {
            return 5L;
        }
        return HzH.cJ();
    }

    public static boolean zc(tP tPVar) {
        if (cJ(tPVar) && kYc(tPVar) == 0) {
            return true;
        }
        return false;
    }

    public static int Qhi(tP tPVar) {
        int i10;
        bxS pA = tPVar.pA();
        if (pA != null && (i10 = pA.Qhi) >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public static boolean cJ(tP tPVar) {
        bxS HzH = HzH(tPVar);
        return (HzH == null || !HzH.f9088ac || TextUtils.isEmpty(Tgh(tPVar))) ? false : true;
    }

    public boolean ac() {
        return this.WAv;
    }

    public void Qhi(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.f9088ac);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("PlayableModel", e10.getMessage());
        }
        if (!TextUtils.isEmpty(this.Tgh)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.Tgh);
                jSONObject2.put("playable_orientation", this.ROR);
                jSONObject2.put("new_style", this.cJ);
                jSONObject2.put("close_2_app", this.Qhi);
                jSONObject2.put("playable_webview_timeout", this.Sf);
                jSONObject2.put("playable_js_timeout", this.f9090hm);
                jSONObject2.put("playable_backup_enable", this.WAv ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e11) {
                com.bytedance.sdk.component.utils.ABk.Qhi("PlayableModel", e11.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.CJ);
        } catch (JSONException e12) {
            com.bytedance.sdk.component.utils.ABk.Qhi("PlayableModel", e12.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.f9089fl);
        } catch (JSONException e13) {
            com.bytedance.sdk.component.utils.ABk.Qhi("PlayableModel", e13.getMessage());
        }
    }

    public int cJ() {
        return this.f9090hm;
    }

    public int Qhi() {
        return this.Sf;
    }
}
