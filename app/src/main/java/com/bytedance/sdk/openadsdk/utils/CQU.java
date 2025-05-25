package com.bytedance.sdk.openadsdk.utils;

import a0.d;
import android.os.Build;
import android.text.TextUtils;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RomUtils.java */
/* loaded from: classes.dex */
public class CQU {
    public static boolean Qhi = false;
    private static int Tgh = Integer.MAX_VALUE;
    public static boolean cJ = false;

    /* renamed from: fl  reason: collision with root package name */
    private static String f9358fl;

    /* renamed from: ac  reason: collision with root package name */
    private static final CharSequence f9357ac = "amigo";
    private static final CharSequence CJ = "funtouch";
    private static final ConcurrentHashMap<String, String> ROR = new ConcurrentHashMap<>();

    /* compiled from: RomUtils.java */
    /* loaded from: classes.dex */
    public static class Qhi implements Callable<String> {
        private final String Qhi;

        public Qhi(String str) {
            this.Qhi = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: Qhi */
        public String call() {
            String str = (String) CQU.ROR.get(this.Qhi);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String ac2 = CQU.ac(this.Qhi);
            System.currentTimeMillis();
            if (ac2 != null) {
                CQU.ROR.put(this.Qhi, ac2);
            }
            return ac2;
        }
    }

    public static String ABk() {
        String iMK = iMK();
        if (iMK != null && iMK.toLowerCase().contains("emotionui")) {
            StringBuilder g10 = d.g(iMK, "_");
            g10.append(Build.DISPLAY);
            return g10.toString();
        }
        return "";
    }

    public static boolean CJ() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_360_DEGREES) || lowerCase.contains("qiku");
    }

    private static String EBS() {
        if (pA()) {
            return hpZ();
        }
        if (fl()) {
            return zc();
        }
        if (cJ()) {
            return HzH();
        }
        if (kYc()) {
            return tP();
        }
        String ABk = ABk();
        if (!TextUtils.isEmpty(ABk)) {
            return ABk;
        }
        if (ROR()) {
            return Tgh();
        }
        if (Sf()) {
            return hm();
        }
        if (CJ()) {
            return ac();
        }
        String WAv = WAv();
        if (!TextUtils.isEmpty(WAv)) {
            return WAv;
        }
        return Build.DISPLAY;
    }

    public static boolean Gm() {
        if (!TextUtils.isEmpty(CJ("ro.letv.release.version"))) {
            return true;
        }
        return false;
    }

    public static String HzH() {
        String str = Build.DISPLAY;
        if (str != null && str.toLowerCase().contains("flyme")) {
            return str;
        }
        return "";
    }

    public static boolean MQ() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String Qhi() {
        if (!TextUtils.isEmpty(f9358fl)) {
            return f9358fl;
        }
        String Qhi2 = com.bytedance.sdk.openadsdk.core.hm.Qhi("sdk_local_rom_info", 604800000L);
        f9358fl = Qhi2;
        if (TextUtils.isEmpty(Qhi2)) {
            String EBS = EBS();
            f9358fl = EBS;
            com.bytedance.sdk.openadsdk.core.hm.Qhi("sdk_local_rom_info", EBS);
        }
        return f9358fl;
    }

    public static boolean ROR() {
        String CJ2 = CJ("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(CJ2) && CJ2.toLowerCase().contains(CJ)) {
            return true;
        }
        return false;
    }

    public static boolean Sf() {
        String str = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(f9357ac)) {
            return true;
        }
        return false;
    }

    public static String Tgh() {
        return CJ("ro.vivo.os.build.display.id") + "_" + CJ("ro.vivo.product.version");
    }

    public static String WAv() {
        if (Gm()) {
            return "eui_" + CJ("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String ac() {
        return CJ("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean fl() {
        if (!cJ) {
            try {
                Class.forName("miui.os.Build");
                Qhi = true;
                cJ = true;
                return true;
            } catch (Exception unused) {
                cJ = true;
            }
        }
        return Qhi;
    }

    public static String hm() {
        return Build.DISPLAY + "_" + CJ("ro.gn.sv.version");
    }

    public static String hpZ() {
        if (pA()) {
            try {
                return "smartisan_".concat(String.valueOf(CJ("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String iMK() {
        return CJ("ro.build.version.emui");
    }

    public static boolean kYc() {
        if (Tgh == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String ROR2 = js.ROR("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(ROR2)) {
                Tgh = 1;
            } else {
                Tgh = 0;
            }
        }
        if (Tgh != 1) {
            return false;
        }
        return true;
    }

    public static boolean pA() {
        if (!"smartisan".equalsIgnoreCase(Build.MANUFACTURER) && !"smartisan".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return true;
    }

    public static String tP() {
        if (kYc()) {
            String ROR2 = js.ROR("ro.build.version.kllkrom");
            return "coloros_" + CJ(ROR2) + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String zc() {
        if (fl()) {
            return "miui_" + CJ("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ac(String str) {
        BufferedReader bufferedReader;
        Throwable th2;
        String str2 = "";
        Process process = null;
        try {
            try {
                try {
                    Process exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
                        try {
                            str2 = bufferedReader.readLine();
                            exec.exitValue();
                            bufferedReader.close();
                        } catch (IllegalThreadStateException unused) {
                            process = exec;
                            try {
                                process.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return str2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                com.bytedance.sdk.component.utils.ABk.Qhi("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th2);
                                return str2;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        com.bytedance.sdk.component.utils.ABk.Qhi("ToolUtils", "Exception while closing InputStream", e10);
                                    }
                                }
                            }
                        }
                    } catch (IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (Throwable th4) {
                    bufferedReader = null;
                    th2 = th4;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
        } catch (IOException e11) {
            com.bytedance.sdk.component.utils.ABk.Qhi("ToolUtils", "Exception while closing InputStream", e11);
        }
        return str2;
    }

    public static boolean cJ() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String CJ(java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = com.bytedance.sdk.openadsdk.utils.CQU.ROR
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L34
            com.bytedance.sdk.openadsdk.utils.CQU$Qhi r1 = new com.bytedance.sdk.openadsdk.utils.CQU$Qhi     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.Sf.Sf r4 = new com.bytedance.sdk.component.Sf.Sf     // Catch: java.lang.Throwable -> L34
            r2 = 5
            r3 = 2
            r4.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.openadsdk.utils.CQU$1 r1 = new com.bytedance.sdk.openadsdk.utils.CQU$1     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "_getSystemPropertyTask"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.openadsdk.utils.lG.cJ(r1)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L34
            r2 = 1
            java.lang.Object r4 = r4.get(r2, r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L34
            goto L35
        L34:
            r4 = r0
        L35:
            if (r4 != 0) goto L38
            goto L39
        L38:
            r0 = r4
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.CQU.CJ(java.lang.String):java.lang.String");
    }

    public static boolean Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            str = iMK();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || MQ();
    }
}
