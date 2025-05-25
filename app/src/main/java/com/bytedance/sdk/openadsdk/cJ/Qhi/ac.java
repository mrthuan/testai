package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.CQU;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.EBS;
import com.bytedance.sdk.openadsdk.utils.Eh;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdLogParamsGenerate.java */
/* loaded from: classes.dex */
public class ac {
    private final boolean CJ;
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final Context f8652ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final String f8653fl;

    /* compiled from: AdLogParamsGenerate.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private static final ac Qhi = new ac();
    }

    private int CJ() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String Qhi(int i10) {
        return i10 != 120 ? i10 != 160 ? i10 != 240 ? i10 != 320 ? i10 != 480 ? i10 != 640 ? "mdpi" : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi" : "ldpi";
    }

    @JProtect
    private String Tgh() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (CQU.fl()) {
                sb2.append("MIUI-");
            } else if (CQU.cJ()) {
                sb2.append("FLYME-");
            } else {
                String iMK = CQU.iMK();
                if (CQU.Qhi(iMK)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(iMK)) {
                    sb2.append(iMK);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    private boolean ac() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String fl() {
        if (DeviceUtils.ac(this.f8652ac)) {
            return PDPrintFieldAttributeObject.ROLE_TV;
        }
        if (DeviceUtils.cJ(this.f8652ac)) {
            return "android_pad";
        }
        return "android";
    }

    public List<com.bytedance.sdk.openadsdk.cJ.Qhi> cJ(List<com.bytedance.sdk.openadsdk.cJ.Qhi> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.cJ.Qhi qhi : list) {
            try {
                JSONObject ac2 = qhi.ac();
                ac2.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.cJ.Qhi(qhi.Qhi, ac2));
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private ac() {
        this.CJ = ac();
        this.f8652ac = HzH.Qhi().getApplicationContext();
        this.f8653fl = fl();
    }

    public static ac Qhi() {
        return Qhi.Qhi;
    }

    public String Qhi(List<com.bytedance.sdk.openadsdk.cJ.Qhi> list) {
        return js.fl((list.size() <= 0 || list.get(0) == null || list.get(0).ac() == null) ? "" : list.get(0).ac().optString("app_log_url"));
    }

    private void Qhi(com.bytedance.sdk.openadsdk.cJ.Qhi qhi, boolean z10) {
        String optString;
        if (qhi == null) {
            return;
        }
        try {
            if (z10) {
                optString = qhi.ac().optJSONObject("params").optString("log_extra", "");
            } else {
                optString = qhi.ac().optString("log_extra", "");
            }
            long Qhi2 = tP.Qhi(optString);
            int CJ = tP.CJ(optString);
            if (Qhi2 == 0) {
                Qhi2 = this.Qhi;
            }
            this.Qhi = Qhi2;
            if (CJ == 0) {
                CJ = this.cJ;
            }
            this.cJ = CJ;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdLogParamsGenerate", "getInfoFromLogExtra exception", e10.getMessage());
        }
    }

    @SuppressLint({"HardwareIds"})
    @JProtect
    public JSONObject cJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ua", js.ac());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", js.ROR());
            jSONObject.put("sim_op", Qhi(this.f8652ac));
            jSONObject.put("root", this.CJ ? 1 : 0);
            jSONObject.put("timezone", CJ());
            jSONObject.put("access", EBS.Qhi(this.f8652ac));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.f8653fl);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", zn.CJ(this.f8652ac) + "x" + zn.ac(this.f8652ac));
            jSONObject.put("display_density", Qhi(zn.ROR(this.f8652ac)));
            jSONObject.put("density_dpi", zn.ROR(this.f8652ac));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", com.bytedance.sdk.openadsdk.core.zc.Qhi(this.f8652ac));
            jSONObject.put("rom", Tgh());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.cJ);
            jSONObject.put("uid", this.Qhi);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.pA.Qhi.cJ.Qhi.Qhi().cJ());
            jSONObject.put("locale_language", DeviceUtils.CJ());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.fl() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", DeviceUtils.cJ() ? 0 : 1);
            com.bytedance.sdk.openadsdk.core.settings.ROR CJ = HzH.CJ();
            jSONObject.put("force_language", MQ.Qhi(this.f8652ac, "tt_choose_language"));
            if (CJ.aP("mnc")) {
                jSONObject.put("mnc", Eh.ac());
            }
            if (CJ.aP("mcc")) {
                jSONObject.put("mcc", Eh.cJ());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public JSONObject Qhi(List<com.bytedance.sdk.openadsdk.cJ.Qhi> list, long j10, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            Qhi(list.get(0), z10);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            for (com.bytedance.sdk.openadsdk.cJ.Qhi qhi : list) {
                jSONArray.put(qhi.Qhi(z10));
            }
            if (z10) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put("event", jSONArray);
            }
            jSONObject2.put("_gen_time", j10);
            jSONObject2.put("local_time", j10 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.cJ.Qhi> Qhi(List<com.bytedance.sdk.openadsdk.cJ.Qhi> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.cJ.Qhi qhi : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject ac2 = qhi.ac();
                jSONObject.putOpt("event", ac2.optString("label"));
                long optLong = ac2.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(optLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.cJ.ROR.f8658ac.format(new Date(optLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = ac2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, ac2.opt(next));
                    }
                }
                if (z10) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.cJ.ROR(qhi.Qhi, jSONObject));
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private String Qhi(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }
}
