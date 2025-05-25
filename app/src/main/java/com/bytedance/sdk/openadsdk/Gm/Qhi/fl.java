package com.bytedance.sdk.openadsdk.Gm.Qhi;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.Gm.Qhi.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.ads.mediation.pangle.PangleConstants;
import org.json.JSONObject;

/* compiled from: LogStatsBase.java */
/* loaded from: classes.dex */
public class fl<T extends fl> implements ac {
    private String Gm;
    private String Qhi;
    private String ROR;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private String f8488ac;
    private String cJ;

    /* renamed from: hm  reason: collision with root package name */
    private String f8490hm;

    /* renamed from: zc  reason: collision with root package name */
    private String f8491zc;
    private final String CJ = BuildConfig.VERSION_NAME;

    /* renamed from: fl  reason: collision with root package name */
    private long f8489fl = System.currentTimeMillis() / 1000;
    private int Tgh = 0;
    private int Sf = 0;

    public static fl<fl> cJ() {
        return new fl<>();
    }

    @JProtect
    private JSONObject pA() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put(InMobiNetworkValues.PACKAGE_NAME, js.fl());
            jSONObject.put("ua", js.ac());
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.pA.Qhi.cJ.Qhi.Qhi().cJ());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String ABk() {
        return this.WAv;
    }

    public String CJ() {
        return this.Gm;
    }

    public int Gm() {
        return this.Sf;
    }

    @Override // com.bytedance.sdk.openadsdk.Gm.Qhi.ac
    @JProtect
    public JSONObject Qhi() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", ROR());
            jSONObject2.put("app_version", js.ROR());
            jSONObject2.put("timestamp", Sf());
            jSONObject2.put("conn_type", hpZ.cJ(HzH.Qhi()));
            jSONObject2.put(PangleConstants.APP_ID, TextUtils.isEmpty(hm.cJ().CJ()) ? "" : hm.cJ().CJ());
            jSONObject2.put("device_info", pA());
            if (!TextUtils.isEmpty(ac())) {
                jSONObject2.put("type", ac());
            }
            jSONObject2.put("error_code", Gm());
            if (!TextUtils.isEmpty(zc())) {
                jSONObject2.put("error_msg", zc());
            }
            if (!TextUtils.isEmpty(fl())) {
                jSONObject2.put("rit", fl());
            }
            if (!TextUtils.isEmpty(Tgh())) {
                jSONObject2.put("creative_id", Tgh());
            }
            if (hm() > 0) {
                jSONObject2.put("adtype", hm());
            }
            if (!TextUtils.isEmpty(WAv())) {
                jSONObject2.put("req_id", WAv());
            }
            if (!TextUtils.isEmpty(ABk())) {
                jSONObject2.put("extra", ABk());
            }
            String CJ = CJ();
            if (TextUtils.isEmpty(CJ)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(CJ);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(CJ)) {
                jSONObject2.put("event_extra", CJ);
            }
            if (!TextUtils.isEmpty(iMK())) {
                jSONObject2.put("duration", iMK());
            }
        } catch (Throwable th2) {
            ABk.Qhi("LogStatsBase", th2.getMessage());
        }
        return jSONObject2;
    }

    public String ROR() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public long Sf() {
        return this.f8489fl;
    }

    public String Tgh() {
        return this.f8488ac;
    }

    public String WAv() {
        return this.ROR;
    }

    public String ac() {
        return this.Qhi;
    }

    public String fl() {
        return this.cJ;
    }

    public int hm() {
        return this.Tgh;
    }

    public String iMK() {
        return this.f8491zc;
    }

    public String zc() {
        return this.f8490hm;
    }

    public T CJ(String str) {
        this.f8488ac = str;
        return hpZ();
    }

    public T ROR(String str) {
        this.WAv = str;
        return hpZ();
    }

    public T Sf(String str) {
        this.f8491zc = str;
        return hpZ();
    }

    public T Tgh(String str) {
        this.f8490hm = str;
        return hpZ();
    }

    public T ac(String str) {
        this.cJ = str;
        return hpZ();
    }

    public T cJ(String str) {
        this.Gm = str;
        return hpZ();
    }

    public T fl(String str) {
        this.ROR = str;
        return hpZ();
    }

    public T cJ(int i10) {
        this.Sf = i10;
        return hpZ();
    }

    private T hpZ() {
        return this;
    }

    public T Qhi(String str) {
        this.Qhi = str;
        return hpZ();
    }

    public T Qhi(int i10) {
        this.Tgh = i10;
        return hpZ();
    }
}
