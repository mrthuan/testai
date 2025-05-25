package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdInfo.java */
/* loaded from: classes.dex */
public class Qhi {
    private C0121Qhi CJ;
    private String Qhi;
    private String Sf;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private String f9078ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f9079fl;

    /* renamed from: hm  reason: collision with root package name */
    private long f9080hm;

    /* renamed from: zc  reason: collision with root package name */
    private int f9081zc;
    private List<tP> Tgh = new ArrayList();
    private List<hm> ROR = new ArrayList();
    private volatile boolean Gm = false;

    /* compiled from: AdInfo.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.model.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0121Qhi extends tP.Qhi {
        private int Qhi;

        public void Qhi(int i10) {
            this.Qhi = i10;
        }

        public JSONObject cJ() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, fl());
                jSONObject.put("md5", Tgh());
                jSONObject.put(InMobiNetworkValues.URL, ROR());
                jSONObject.put("data", Sf());
                jSONObject.put("diff_data", hm());
                jSONObject.put("version", CJ());
                jSONObject.put("dynamic_creative", WAv());
                jSONObject.put("count_down_time", Qhi());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        public int Qhi() {
            return this.Qhi;
        }

        public static C0121Qhi Qhi(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0121Qhi c0121Qhi = new C0121Qhi();
            c0121Qhi.cJ(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
            c0121Qhi.ac(jSONObject.optString("md5"));
            c0121Qhi.CJ(jSONObject.optString(InMobiNetworkValues.URL));
            c0121Qhi.fl(jSONObject.optString("data"));
            c0121Qhi.Tgh(jSONObject.optString("diff_data"));
            c0121Qhi.Qhi(jSONObject.optString("version"));
            c0121Qhi.ROR(jSONObject.optString("dynamic_creative"));
            c0121Qhi.Qhi(jSONObject.optInt("count_down_time"));
            if (Qhi(c0121Qhi)) {
                return c0121Qhi;
            }
            return null;
        }

        private static boolean Qhi(C0121Qhi c0121Qhi) {
            return (c0121Qhi == null || TextUtils.isEmpty(c0121Qhi.fl()) || TextUtils.isEmpty(c0121Qhi.ROR())) ? false : true;
        }
    }

    public boolean CJ() {
        List<tP> list = this.Tgh;
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean Gm() {
        if (this.f9081zc == 1) {
            return true;
        }
        return false;
    }

    public String Qhi() {
        tP fl2 = fl();
        return fl2 != null ? fl2.jWV() : "";
    }

    public boolean ROR() {
        return this.WAv;
    }

    public C0121Qhi Sf() {
        return this.CJ;
    }

    public boolean Tgh() {
        if (Sf() != null && ac() != null && ac().size() > 1) {
            this.f9079fl = true;
        } else {
            this.f9079fl = false;
            Qhi((C0121Qhi) null);
        }
        return this.f9079fl;
    }

    public void WAv() {
        this.Gm = false;
    }

    public List<tP> ac() {
        return this.Tgh;
    }

    public int cJ() {
        return this.cJ;
    }

    public tP fl() {
        if (this.Tgh.size() > 0) {
            return this.Tgh.get(0);
        }
        return null;
    }

    public boolean hm() {
        return this.Gm;
    }

    public JSONObject zc() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0121Qhi Sf = Sf();
            if (Sf != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject cJ = Sf.cJ();
                if (cJ != null) {
                    jSONObject2.put("tpl_info", cJ);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<tP> list = this.Tgh;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.Tgh.size(); i10++) {
                    jSONArray.put(this.Tgh.get(i10).mZ());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.WAv);
            jSONObject.put("multi_ad_style", this.f9081zc);
            jSONObject.put("request_id", this.Qhi);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdInfo", "toJsonObj: ", th2);
            return null;
        }
    }

    public void ac(String str) {
        this.Sf = str;
    }

    public void cJ(String str) {
        this.f9078ac = str;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void cJ(int i10) {
        this.f9081zc = i10;
    }

    public static Qhi cJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Qhi qhi = new Qhi();
            JSONObject optJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (optJSONObject != null) {
                qhi.Qhi(optJSONObject);
            }
            qhi.cJ(jSONObject.optInt("multi_ad_style", 0));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    tP Qhi = com.bytedance.sdk.openadsdk.core.cJ.Qhi(optJSONArray.optJSONObject(i10));
                    if (Qhi != null) {
                        Qhi.hm(qhi.Gm());
                        arrayList.add(Qhi);
                    }
                }
                qhi.Qhi(arrayList);
            }
            qhi.Qhi(jSONObject.optBoolean("is_choose_ad_original", false));
            qhi.Qhi(jSONObject.optString("request_id", ""));
            return qhi;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdInfo", "fromJson: ", th2);
            return null;
        }
    }

    public void Qhi(int i10) {
        this.cJ = i10;
    }

    public void Qhi(tP tPVar) {
        this.Tgh.add(tPVar);
    }

    public void Qhi(List<tP> list) {
        this.Tgh = list;
    }

    public void Qhi(hm hmVar) {
        this.ROR.add(hmVar);
    }

    public void Qhi(long j10) {
        this.f9080hm = j10;
    }

    public static Map<String, tP> Qhi(Qhi qhi) {
        if (qhi == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (tP tPVar : qhi.ac()) {
            if (!TextUtils.isEmpty(tPVar.Ri())) {
                hashMap.put(tPVar.Ri(), tPVar);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public void Qhi(boolean z10) {
        this.WAv = z10;
    }

    public void Qhi(C0121Qhi c0121Qhi) {
        this.CJ = c0121Qhi;
        if (c0121Qhi == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.Qhi(tP.Qhi.Qhi(c0121Qhi, ""));
    }

    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Qhi(C0121Qhi.Qhi(jSONObject.optJSONObject("tpl_info")));
    }
}
