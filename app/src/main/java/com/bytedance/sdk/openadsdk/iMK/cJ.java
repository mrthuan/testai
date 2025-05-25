package com.bytedance.sdk.openadsdk.iMK;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.zc;
import com.bytedance.sdk.openadsdk.utils.js;
import java.util.Map;

/* compiled from: TTAdNetDepend.java */
/* loaded from: classes.dex */
public class cJ implements com.bytedance.sdk.component.ROR.ac.cJ {
    public static String Qhi = "sp_multi_ttadnet_config";
    private final Context cJ;

    public cJ(Context context) {
        this.cJ = context;
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public int CJ() {
        return BuildConfig.VERSION_CODE;
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public Address Qhi(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public String[] Tgh() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String PAe = HzH.CJ().PAe();
        if (!TextUtils.isEmpty(PAe)) {
            if ("SG".equals(PAe) || "CN".equals(PAe)) {
                return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
            }
            return strArr;
        }
        int hpZ = js.hpZ();
        if (hpZ == 2 || hpZ == 1) {
            return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
        }
        return strArr;
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public String ac() {
        return "android";
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public String cJ() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public String fl() {
        return zc.Qhi(this.cJ);
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public int Qhi() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public String Qhi(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ(Qhi, str, str2);
    }

    @Override // com.bytedance.sdk.component.ROR.ac.cJ
    public void Qhi(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi(Qhi, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi(Qhi, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi(Qhi, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi(Qhi, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi(Qhi, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
