package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: TTAdManagerImpl.java */
@Deprecated
/* loaded from: classes.dex */
public class aP implements pM {

    /* renamed from: fl  reason: collision with root package name */
    private static final Map<Integer, String> f8985fl = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.aP.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_set_id_scope");
            put(6, "app_set_id");
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, "vendor");
            put(10, "model");
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, InMobiNetworkValues.URL);
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, "screen_height");
            put(22, "screen_width");
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, "os_version");
            put(26, "conn_type");
            put(27, "boot");
            put(28, "feature_data");
        }
    };
    boolean Qhi = false;
    boolean cJ = false;

    /* renamed from: ac  reason: collision with root package name */
    String f8986ac = "com.union_test.internationad";
    String CJ = "8025677";
    private int Tgh = 0;

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public String CJ() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public int ROR() {
        return this.Tgh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public int Tgh() {
        return hm.cJ().MQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public pM ac(int i10) {
        hm.cJ().ac(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    /* renamed from: fl */
    public aP cJ(String str) {
        hm.cJ().ac(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    /* renamed from: CJ */
    public aP Qhi(String str) {
        hm.cJ().Qhi(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public pM Qhi(int i10) {
        hm.cJ().fl(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public pM Tgh(int i10) {
        hm.cJ().Qhi(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public int ac() {
        return hm.cJ().hm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public pM cJ(int i10) {
        hm.cJ().cJ(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public String fl() {
        return ac((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public pM CJ(int i10) {
        hm.cJ().Tgh(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public pM Qhi() {
        com.bytedance.sdk.component.utils.ABk.Qhi("PangleSDK-6206");
        com.bykv.vk.openvk.component.video.api.Tgh.ac.Qhi("PangleSDK-6206");
        com.bytedance.sdk.component.utils.ABk.cJ();
        com.bytedance.sdk.component.ROR.Qhi.Qhi();
        com.bykv.vk.openvk.component.video.api.Tgh.ac.Qhi();
        com.bytedance.sdk.openadsdk.utils.qMt.Qhi();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public String ac(String str) {
        int i10;
        js.WAv("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.fl.ac.Qhi();
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = true;
            jSONObject.put("is_init", iMK.fl() ? 1 : 0);
            String WAv = HzH.CJ().WAv();
            String qMt = HzH.CJ().qMt();
            if (WAv != null && qMt != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", WAv);
                jSONObject2.put("param", qMt);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(InMobiNetworkValues.PACKAGE_NAME, js.fl());
            jSONObject.put("user_data", MQ.Qhi(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.ROR CJ = HzH.CJ();
                if (CJ.aP("gaid")) {
                    jSONObject.put("gaid", com.bytedance.sdk.openadsdk.pA.Qhi.cJ.Qhi.Qhi().cJ());
                }
                Context Qhi = HzH.Qhi();
                jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.Qhi.ROR());
                jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.fl.cJ());
                jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.fl.ac());
                jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.fl.CJ());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - iMK.Qhi()) / 1000);
                jSONObject.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.HzH.YD().gT() ? 1 : 0);
                jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Gm.cJ());
                jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Gm.ac());
                jSONObject.put("vendor", Build.MANUFACTURER);
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("user_agent_device", js.cJ());
                jSONObject.put("user_agent_webview", js.ac());
                jSONObject.put("sys_compiling_time", zc.cJ(Qhi));
                jSONObject.put("screen_height", zn.CJ(Qhi));
                jSONObject.put("screen_width", zn.ac(Qhi));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.CQU.Qhi());
                jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.Eh.Qhi());
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("conn_type", js.zc(Qhi));
                if (CJ.aP("boot")) {
                    jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                js.Qhi(jSONObject);
                com.bytedance.sdk.openadsdk.core.fl.ac.Qhi(jSONObject);
                i10 = f8985fl.size();
            } else {
                i10 = 2;
            }
            while (i10 > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(f8985fl.get(Integer.valueOf(i10)));
                i10--;
            }
            com.bytedance.sdk.openadsdk.CJ.MQ.Qhi().Qhi(jSONObject);
            if (!com.bytedance.sdk.openadsdk.core.settings.HzH.Ug() || !com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN)) {
                z10 = false;
            }
            JSONObject Qhi2 = Qhi(jSONObject, z10);
            while (i10 > 0 && Qhi2.toString().getBytes().length > 4096) {
                jSONObject.remove(f8985fl.get(Integer.valueOf(i10)));
                Qhi2 = Qhi(jSONObject, z10);
                i10--;
            }
            if (com.bytedance.sdk.component.utils.ABk.CJ()) {
                Objects.toString(Qhi2);
                int length = Qhi2.toString().getBytes().length;
            }
            Objects.toString(Qhi2);
            return Qhi2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public int cJ() {
        return hm.cJ().Sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public pM fl(int i10) {
        this.Tgh = i10;
        return this;
    }

    private JSONObject Qhi(JSONObject jSONObject, boolean z10) {
        JSONObject Qhi;
        if (z10) {
            Qhi = PangleEncryptManager.encryptType4(jSONObject, new qMt(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            EBS.Qhi(Qhi);
        } else {
            Qhi = com.bytedance.sdk.component.utils.Qhi.Qhi(jSONObject);
        }
        return Qhi != null ? Qhi : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.pM
    public boolean Qhi(String str, int i10, String str2, String str3, String str4) {
        if (this.f8986ac.equals(HzH.Qhi().getPackageName()) && this.CJ.equals(hm.cJ().CJ()) && !TextUtils.isEmpty(str)) {
            try {
                Method Qhi = com.bytedance.sdk.component.utils.Dww.Qhi("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
                if (Qhi != null) {
                    Qhi.invoke(null, str, Integer.valueOf(i10), str2, str3, str4);
                }
            } catch (Throwable unused) {
            }
            return true;
        }
        return false;
    }
}
