package com.bytedance.sdk.openadsdk.pA.Qhi.Qhi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.cJ.ABk;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AndroidRGPDownLoader.java */
/* loaded from: classes.dex */
public class Qhi extends ac {
    public Qhi(Context context, tP tPVar, String str) {
        super(context, tPVar, str);
    }

    @Override // com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.ac, com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl
    public boolean Qhi() {
        HashMap hashMap;
        if (this.Qhi == null) {
            return false;
        }
        tP tPVar = this.cJ;
        if (tPVar == null || tPVar.nR() != 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("dpl_probability_jump", Boolean.valueOf(this.ROR >= 11));
        }
        return Qhi(this.cJ, this.Qhi.ac(), ac(), this.f9354ac, hashMap);
    }

    @Override // com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.ac
    public boolean cJ() {
        boolean z10;
        com.bytedance.sdk.openadsdk.core.fl.Qhi(this.cJ, this.f9354ac, 1, null);
        if (this.cJ.ReL() != null) {
            HashMap hashMap = new HashMap();
            tP tPVar = this.cJ;
            if (tPVar != null && tPVar.nR() == 0) {
                if (this.ROR >= 11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hashMap.put("dpl_probability_jump", Boolean.valueOf(z10));
            }
            if (Qhi(this.cJ.ReL().Qhi(), ac(), this.f9354ac, this.cJ, hashMap)) {
                return true;
            }
            if (!this.CJ || this.Tgh.get()) {
                this.CJ = true;
                Qhi(this.cJ, hashMap);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.cJ, this.f9354ac, "open_fallback_url", hashMap);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.fl.Qhi(this.cJ, this.f9354ac, -1, null);
        }
        return false;
    }

    public static boolean Qhi(tP tPVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent Qhi;
        if (tPVar != null && tPVar.XH() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (Qhi = js.Qhi(context, str)) == null) {
                return false;
            }
            Qhi.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                Qhi.addFlags(268435456);
            }
            context.startActivity(Qhi);
            if (map == null) {
                map = new HashMap<>();
            }
            Qhi(tPVar, map);
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void Qhi(tP tPVar, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (tPVar != null && tPVar.nR() == 0) {
            map.put("auto_click", Boolean.valueOf(!tPVar.CJ()));
        }
        map.put("can_query_install", 0);
    }

    public static boolean Qhi(String str, Context context, String str2, tP tPVar, Map<String, Object> map) {
        Intent intent = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            try {
                intent2.setData(parse);
                if (!(context instanceof Activity)) {
                    intent2.addFlags(268435456);
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                Qhi(tPVar, map);
                map.put(InMobiNetworkValues.URL, str);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str2, "open_url_app", map);
                context.startActivity(intent2);
                ABk.Qhi().Qhi(map).Qhi(tPVar, str2);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi("dp_start_act_success", tPVar, str2, map);
                return true;
            } catch (Throwable th3) {
                th = th3;
                intent = intent2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("exception", th.getMessage());
                    if (intent != null) {
                        jSONObject.put("intent", intent.toString());
                    }
                    jSONObject.put("can_query_install", 0);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, str2, -4, jSONObject);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, str2, -2, null);
        return false;
    }
}
