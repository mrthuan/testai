package com.bytedance.sdk.openadsdk.core.ROR;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VastAdConfig.java */
/* loaded from: classes.dex */
public class Qhi {
    private String CJ;
    private String Gm;
    private String ROR;
    private double Sf;
    private String Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    ac f8941ac;
    cJ cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f8942fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8943hm;
    private String pA;
    fl Qhi = new fl(this);

    /* renamed from: zc  reason: collision with root package name */
    private final Set<Gm> f8944zc = new HashSet();
    private String ABk = "VAST_ACTION_BUTTON";
    private boolean iMK = false;

    private JSONArray hpZ() {
        JSONArray jSONArray = new JSONArray();
        for (Gm gm2 : this.f8944zc) {
            if (gm2 != null) {
                jSONArray.put(gm2.CJ());
            }
        }
        return jSONArray;
    }

    public int ABk() {
        return this.WAv;
    }

    public String CJ() {
        return this.CJ;
    }

    public String Gm() {
        return this.Gm;
    }

    public fl Qhi() {
        return this.Qhi;
    }

    public String ROR() {
        return this.ROR;
    }

    public double Sf() {
        return this.Sf;
    }

    public String Tgh() {
        return this.Tgh;
    }

    public JSONObject WAv() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.Qhi.Qhi());
        cJ cJVar = this.cJ;
        if (cJVar != null) {
            jSONObject.put("vastIcon", cJVar.Qhi());
        }
        ac acVar = this.f8941ac;
        if (acVar != null) {
            jSONObject.put("endCard", acVar.Qhi());
        }
        jSONObject.put(InMobiNetworkValues.TITLE, this.CJ);
        jSONObject.put(InMobiNetworkValues.DESCRIPTION, this.f8942fl);
        jSONObject.put("clickThroughUrl", this.Tgh);
        jSONObject.put("videoUrl", this.ROR);
        jSONObject.put("videDuration", this.Sf);
        jSONObject.put("tag", this.Gm);
        jSONObject.put("videoWidth", this.f8943hm);
        jSONObject.put("videoHeight", this.WAv);
        jSONObject.put("viewabilityVendor", hpZ());
        return jSONObject;
    }

    public ac ac() {
        return this.f8941ac;
    }

    public cJ cJ() {
        return this.cJ;
    }

    public String fl() {
        return this.f8942fl;
    }

    public String hm() {
        ac acVar;
        String str = this.Tgh;
        if (!TextUtils.isEmpty(this.pA)) {
            String str2 = this.pA;
            this.pA = null;
            return str2;
        }
        String str3 = this.ABk;
        str3.getClass();
        if (!str3.equals("VAST_ICON")) {
            if (str3.equals("VAST_END_CARD") && (acVar = this.f8941ac) != null && !TextUtils.isEmpty(acVar.Sf)) {
                str = this.f8941ac.Sf;
            }
        } else {
            cJ cJVar = this.cJ;
            if (cJVar != null && !TextUtils.isEmpty(cJVar.Sf)) {
                str = this.cJ.Sf;
            }
        }
        this.ABk = "VAST_ACTION_BUTTON";
        return str;
    }

    public Set<Gm> iMK() {
        return this.f8944zc;
    }

    public void pA() {
        this.iMK = true;
    }

    public int zc() {
        return this.f8943hm;
    }

    public void CJ(String str) {
        this.ROR = str;
    }

    public void Qhi(cJ cJVar) {
        if (cJVar != null) {
            cJVar.Qhi(this.ROR);
        }
        this.cJ = cJVar;
    }

    public void ROR(String str) {
        this.pA = str;
    }

    public void Tgh(String str) {
        this.Gm = str;
        this.Qhi.Qhi(str);
    }

    public void ac(String str) {
        this.Tgh = str;
    }

    public void cJ(String str) {
        this.f8942fl = str;
    }

    public void fl(String str) {
        this.ABk = str;
    }

    public void cJ(int i10) {
        this.WAv = i10;
    }

    public void Qhi(ac acVar) {
        if (acVar != null) {
            acVar.Qhi(this.ROR);
        }
        this.f8941ac = acVar;
    }

    public void Qhi(String str) {
        this.CJ = str;
    }

    public void Qhi(double d10) {
        this.Sf = d10;
    }

    public static Qhi Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Qhi qhi = new Qhi();
        qhi.Qhi.Qhi(jSONObject.optJSONObject("videoTrackers"));
        qhi.cJ = cJ.Qhi(jSONObject.optJSONObject("vastIcon"));
        qhi.f8941ac = ac.cJ(jSONObject.optJSONObject("endCard"));
        qhi.CJ = jSONObject.optString(InMobiNetworkValues.TITLE);
        qhi.f8942fl = jSONObject.optString(InMobiNetworkValues.DESCRIPTION);
        qhi.Tgh = jSONObject.optString("clickThroughUrl");
        qhi.ROR = jSONObject.optString("videoUrl");
        qhi.Sf = jSONObject.optDouble("videDuration");
        qhi.Gm = jSONObject.optString("tag");
        qhi.f8943hm = jSONObject.optInt("videoWidth");
        qhi.f8943hm = jSONObject.optInt("videoHeight");
        qhi.f8944zc.addAll(Gm.Qhi(jSONObject.optJSONArray("viewabilityVendor")));
        return qhi;
    }

    public void Qhi(tP tPVar) {
        this.Qhi.Qhi(tPVar);
        cJ cJVar = this.cJ;
        if (cJVar != null) {
            cJVar.Qhi(tPVar);
        }
        ac acVar = this.f8941ac;
        if (acVar != null) {
            acVar.Qhi(tPVar);
        }
    }

    public void Qhi(int i10) {
        this.f8943hm = i10;
    }

    public void Qhi(Set<Gm> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.f8944zc.addAll(set);
    }
}
