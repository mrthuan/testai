package com.bytedance.sdk.openadsdk.core.fl;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SecSdkHelper.java */
/* loaded from: classes.dex */
public class cJ {
    private static com.bytedance.sdk.openadsdk.core.fl.Qhi Qhi;
    private String cJ;

    /* compiled from: SecSdkHelper.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private static final cJ Qhi = new cJ();
    }

    public String CJ() {
        String CJ;
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi != null && (CJ = qhi.CJ()) != null) {
            return CJ;
        }
        return "";
    }

    public void Qhi(String str) {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi;
        if (TextUtils.isEmpty(str) || (qhi = Qhi) == null) {
            return;
        }
        qhi.Qhi(str);
    }

    public int Tgh() {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi != null) {
            return qhi.Tgh();
        }
        return 1;
    }

    public void ac(String str) {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi != null) {
            qhi.ac(str);
        }
    }

    public void cJ(String str) {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi;
        if (TextUtils.isEmpty(str) || (qhi = Qhi) == null) {
            return;
        }
        qhi.cJ(str);
    }

    public String fl() {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi != null) {
            return qhi.fl();
        }
        return "";
    }

    private cJ() {
        this.cJ = null;
        Qhi = new com.bytedance.sdk.openadsdk.core.fl.Qhi();
    }

    public boolean ac() {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi == null) {
            return false;
        }
        return qhi.cJ();
    }

    public static cJ cJ() {
        return Qhi.Qhi;
    }

    public void Qhi() {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi != null) {
            qhi.ac();
        }
    }

    public Map<String, String> Qhi(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi != null) {
            return qhi.Qhi(str, bArr);
        }
        return new HashMap();
    }

    public void Qhi(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.fl.Qhi qhi = Qhi;
        if (qhi != null) {
            qhi.Qhi(motionEvent);
        }
    }
}
