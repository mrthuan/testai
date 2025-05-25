package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdLogInfoModel.java */
/* loaded from: classes.dex */
public class cJ {
    public ArrayList<Integer> CJ;
    public String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    public int f9091ac = 1;
    public int cJ;

    /* renamed from: fl  reason: collision with root package name */
    public AdSlot f9092fl;

    public AdSlot CJ() {
        return this.f9092fl;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public int ac() {
        return this.f9091ac;
    }

    public int cJ() {
        return this.cJ;
    }

    public ArrayList<Integer> fl() {
        return this.CJ;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void cJ(int i10) {
        this.f9091ac = i10;
    }

    public void Qhi(int i10) {
        this.cJ = i10;
    }

    public void Qhi(AdSlot adSlot) {
        this.f9092fl = adSlot;
    }

    public void Qhi(ArrayList<Integer> arrayList) {
        this.CJ = arrayList;
    }

    public static void Qhi(cJ cJVar) {
        int cJ;
        if (cJVar == null || cJVar.CJ() == null || (cJ = cJVar.cJ()) >= 0 || cJ == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.core.model.cJ.1
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", cJ.this.ac());
                jSONObject.put("err_code", cJ.this.cJ());
                jSONObject.put("server_res_str", cJ.this.Qhi());
                if (cJ.this.fl() != null && cJ.this.fl().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) cJ.this.fl()).toString());
                }
                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("rd_client_custom_error").Qhi(cJ.this.CJ().getDurationSlotType()).cJ(jSONObject.toString());
            }
        });
    }
}
