package com.bytedance.sdk.openadsdk.component.reward;

import android.text.TextUtils;
import androidx.activity.f;
import com.bytedance.sdk.component.utils.kYc;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashSet;

/* compiled from: SpCache.java */
/* loaded from: classes.dex */
class iMK {
    private final String Qhi;
    private final HashSet<String> cJ = new HashSet<>();

    public iMK(String str) {
        this.Qhi = TextUtils.isEmpty(str) ? "" : str;
    }

    private String Sf(String str) {
        if (TextUtils.isEmpty(str)) {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        return f.o(new StringBuilder(), this.Qhi, "_cache_", str);
    }

    public boolean CJ(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "has_played", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    public String Qhi(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ(Sf(str), "material_data", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void ROR(String str) {
        try {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str));
            this.cJ.remove(str);
        } catch (Throwable unused) {
        }
    }

    public boolean Tgh(String str) {
        String cJ;
        try {
            cJ = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ(Sf(str), "in_use_process", "");
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(cJ)) {
            return false;
        }
        if (cJ.equals(kYc.cJ(HzH.Qhi())) && !this.cJ.contains(str)) {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "in_use_process", "");
            return false;
        }
        return true;
    }

    public long ac(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "create_time", 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public String cJ(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ(Sf(str), "req_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void fl(String str) {
        try {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "in_use_process", kYc.cJ(HzH.Qhi()));
            this.cJ.add(str);
        } catch (Throwable unused) {
        }
    }

    public void Qhi(String str, String str2, String str3) {
        try {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "has_played", Boolean.FALSE);
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "create_time", Long.valueOf(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "material_data", str2);
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "in_use_process", "");
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi(Sf(str), "req_id", str3);
            this.cJ.remove(str);
        } catch (Throwable unused) {
        }
    }
}
