package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SimUtils.java */
/* loaded from: classes.dex */
public class Eh {
    private static volatile boolean CJ = true;
    private static String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private static String f9363ac;
    private static String cJ;

    /* compiled from: SimUtils.java */
    /* loaded from: classes.dex */
    public static class Qhi extends com.bytedance.sdk.component.Sf.hm {
        public static AtomicBoolean Qhi = new AtomicBoolean(false);
        private static final AtomicLong cJ = new AtomicLong(0);

        public Qhi(String str, int i10) {
            super(str, i10);
        }

        public static void Qhi() {
            if (!Qhi.get()) {
                long currentTimeMillis = System.currentTimeMillis();
                AtomicLong atomicLong = cJ;
                if (currentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                    return;
                }
                atomicLong.set(currentTimeMillis);
                lG.cJ(new Qhi("UpdateSimStatusTask", 5));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Qhi.set(true);
            Eh.fl();
            Qhi.set(false);
        }
    }

    public static String Qhi() {
        Qhi.Qhi();
        return Qhi;
    }

    public static String ac() {
        Qhi.Qhi();
        return f9363ac;
    }

    public static String cJ() {
        String str;
        String str2;
        try {
            Qhi.Qhi();
            if (!CJ) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                if (CJ) {
                    str2 = "Have SIM card";
                } else {
                    str2 = "No SIM card, MCC returns null";
                }
                sb2.append(str2);
                com.bytedance.sdk.component.utils.ABk.Qhi("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.HzH.Qhi().getResources().getConfiguration();
            int i10 = configuration.mcc;
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = cJ;
            }
            com.bytedance.sdk.component.utils.ABk.Qhi("MCC", "config=" + configuration.mcc + ",sMCC=" + cJ);
            return str;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("SimUtils", th2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fl() {
        String str;
        String str2;
        String str3;
        String str4;
        if (com.bytedance.sdk.openadsdk.core.HzH.Qhi() == null) {
            return;
        }
        CJ = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.HzH.Qhi().getSystemService("phone");
            int simState = telephonyManager.getSimState();
            if (simState != 0) {
                if (simState == 1) {
                    CJ = false;
                }
            } else {
                CJ = false;
            }
            if (CJ) {
                str = "Have SIM card";
            } else {
                str = "No SIM card";
            }
            com.bytedance.sdk.component.utils.ABk.Qhi("MCC", str);
            String str5 = null;
            try {
                str2 = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                str2 = null;
            }
            try {
                str3 = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                str3 = null;
            }
            if (str3 == null || str3.length() < 5) {
                try {
                    str3 = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (!TextUtils.isEmpty(str3) && str3.length() > 4) {
                String substring = str3.substring(0, 3);
                str4 = str3.substring(3);
                str5 = substring;
            } else {
                str4 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                Qhi = str2;
            }
            if (!TextUtils.isEmpty(str5)) {
                cJ = str5;
            }
            if (!TextUtils.isEmpty(str4)) {
                f9363ac = str4;
            }
        } catch (Throwable unused4) {
        }
    }
}
