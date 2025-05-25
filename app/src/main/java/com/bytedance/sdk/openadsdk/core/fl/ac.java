package com.bytedance.sdk.openadsdk.core.fl;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.Tgh;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SecSdkHelperUtil.java */
/* loaded from: classes.dex */
public class ac {
    private static boolean Qhi = false;

    public static String CJ() {
        if (HzH.CJ().Qe()) {
            return cJ.cJ().fl();
        }
        return "";
    }

    public static void Qhi() {
        if (!Qhi && HzH.CJ().Qe()) {
            cJ.cJ();
            Qhi = cJ.cJ().ac();
        }
    }

    public static String Tgh() {
        if (HzH.CJ().Qe()) {
            return cJ.cJ().CJ();
        }
        return null;
    }

    public static void ac() {
        if (HzH.CJ().Qe()) {
            cJ.cJ().ac("AdShow");
        }
    }

    public static void cJ(String str) {
        if (TextUtils.isEmpty(str) || !HzH.CJ().Qe()) {
            return;
        }
        cJ.cJ().cJ(str);
    }

    public static int fl() {
        if (HzH.CJ().Qe()) {
            return cJ.cJ().Tgh();
        }
        return 6;
    }

    public static void cJ() {
        if (HzH.CJ().Qe()) {
            cJ.cJ().Qhi();
        }
    }

    public static void Qhi(String str) {
        if (TextUtils.isEmpty(str) && HzH.CJ().Qe()) {
            cJ.cJ().Qhi(str);
        }
    }

    public static Map<String, String> Qhi(String str, String str2) {
        if (HzH.CJ().Qe()) {
            return cJ.cJ().Qhi(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void Qhi(MotionEvent motionEvent) {
        if (HzH.CJ().Qe()) {
            cJ.cJ().Qhi(motionEvent);
        }
    }

    public static void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (HzH.CJ().Qe()) {
                Qhi();
                if (fl() == 0) {
                    jSONObject.put("sec_did", cJ.cJ().CJ());
                    String Qhi2 = Tgh.Qhi(jSONObject.toString());
                    Map<String, String> Qhi3 = cJ.cJ().Qhi("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", Qhi2 != null ? Qhi2.getBytes() : new byte[0]);
                    if (Qhi3 != null && Qhi3.size() > 0) {
                        for (String str : Qhi3.keySet()) {
                            jSONObject.put(str, Qhi3.get(str));
                        }
                        jSONObject.put(InMobiNetworkValues.URL, "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", Qhi2);
                        return;
                    }
                    jSONObject.put("pglx", "8");
                    return;
                }
                jSONObject.put("pglx", String.valueOf(fl()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th2) {
            ABk.Qhi("SecSdkHelperUtil", th2.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
