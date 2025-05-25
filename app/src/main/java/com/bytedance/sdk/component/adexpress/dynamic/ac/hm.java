package com.bytedance.sdk.component.adexpress.dynamic.ac;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicLayoutUnit.java */
/* loaded from: classes.dex */
public class hm {
    private String ABk;
    private float CJ;
    private hm Gm;
    private String Qhi;
    private float ROR;
    private float Sf;
    private float Tgh;
    private List<hm> WAv;

    /* renamed from: ac  reason: collision with root package name */
    private float f8194ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private float f8195fl;

    /* renamed from: hm  reason: collision with root package name */
    private Tgh f8196hm;
    private boolean iMK;

    /* renamed from: zc  reason: collision with root package name */
    private List<List<hm>> f8197zc;
    private Map<String, String> pA = new HashMap();
    private Map<Integer, String> hpZ = new HashMap();

    public int ABk() {
        ROR fl2 = this.f8196hm.fl();
        return fl2.YB() + fl2.Qe();
    }

    public float CJ() {
        return this.CJ;
    }

    public boolean Dww() {
        if (this.f8196hm.fl().et() >= 0 && this.f8196hm.fl().SL() >= 0 && this.f8196hm.fl().PER() >= 0 && this.f8196hm.fl().Gy() >= 0) {
            return false;
        }
        return true;
    }

    public boolean EBS() {
        return TextUtils.equals(this.f8196hm.fl().aP(), "flex");
    }

    public List<hm> Gm() {
        return this.WAv;
    }

    public List<List<hm>> HzH() {
        return this.f8197zc;
    }

    public Map<String, String> MQ() {
        return this.pA;
    }

    public String Qhi() {
        return this.ABk;
    }

    public float ROR() {
        return this.f8194ac;
    }

    public float Sf() {
        return this.Tgh;
    }

    public float Tgh() {
        return this.cJ;
    }

    public Tgh WAv() {
        return this.f8196hm;
    }

    public String ac() {
        return this.Qhi;
    }

    public String bxS() {
        return this.f8196hm.fl().bxS();
    }

    public Map<Integer, String> cJ() {
        return this.hpZ;
    }

    public float fl() {
        return this.f8195fl;
    }

    public float hm() {
        return this.ROR;
    }

    public float hpZ() {
        ROR fl2 = this.f8196hm.fl();
        float HzH = fl2.HzH() + iMK();
        return (fl2.zc() * 2.0f) + fl2.iMK() + HzH;
    }

    public int iMK() {
        ROR fl2 = this.f8196hm.fl();
        return fl2.dIT() + fl2.MND();
    }

    public boolean kYc() {
        List<hm> list = this.WAv;
        if (list != null && list.size() > 0) {
            return false;
        }
        return true;
    }

    public float pA() {
        ROR fl2 = this.f8196hm.fl();
        float pA = fl2.pA() + ABk();
        return (fl2.zc() * 2.0f) + fl2.hpZ() + pA;
    }

    public void qMt() {
        List<List<hm>> list = this.f8197zc;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List<hm> list2 : this.f8197zc) {
                if (list2 != null && list2.size() > 0) {
                    arrayList.add(list2);
                }
            }
            this.f8197zc = arrayList;
        }
    }

    public boolean tP() {
        return this.iMK;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.Qhi + "', x=" + this.cJ + ", y=" + this.f8194ac + ", width=" + this.Tgh + ", height=" + this.ROR + ", remainWidth=" + this.Sf + ", rootBrick=" + this.f8196hm + ", childrenBrickUnits=" + this.WAv + '}';
    }

    public hm zc() {
        return this.Gm;
    }

    public void CJ(float f10) {
        this.f8194ac = f10;
    }

    public void Qhi(String str) {
        this.ABk = str;
    }

    public void ROR(float f10) {
        this.Sf = f10;
    }

    public void Tgh(float f10) {
        this.ROR = f10;
    }

    public void ac(float f10) {
        this.cJ = f10;
    }

    public void cJ(String str) {
        this.Qhi = str;
    }

    public void fl(float f10) {
        this.Tgh = f10;
    }

    public void Qhi(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    this.hpZ.put(Integer.valueOf(optJSONObject.optInt(FacebookMediationAdapter.KEY_ID)), optJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void ac(String str) {
        this.f8196hm.fl().Tgh(str);
    }

    public void cJ(float f10) {
        this.f8195fl = f10;
    }

    public void cJ(List<List<hm>> list) {
        this.f8197zc = list;
    }

    public void Qhi(float f10) {
        this.CJ = f10;
    }

    public void Qhi(Tgh tgh) {
        this.f8196hm = tgh;
    }

    public void Qhi(List<hm> list) {
        this.WAv = list;
    }

    public void Qhi(hm hmVar) {
        this.Gm = hmVar;
    }

    public void Qhi(boolean z10) {
        this.iMK = z10;
    }

    public void Qhi(String str, String str2) {
        this.pA.put(str, str2);
    }

    public String Qhi(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8196hm.cJ());
        sb2.append(":");
        sb2.append(this.Qhi);
        if (this.f8196hm.fl() != null) {
            sb2.append(":");
            sb2.append(this.f8196hm.fl().VV());
        }
        sb2.append(":");
        sb2.append(i10);
        return sb2.toString();
    }
}
