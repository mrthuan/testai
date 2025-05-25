package com.bytedance.sdk.component.adexpress.Qhi.cJ;

import com.bytedance.sdk.component.utils.ABk;
import com.tom_roush.fontbox.afm.AFMParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: Version.java */
/* loaded from: classes.dex */
public class hm {
    private static com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi Qhi;

    public static void CJ() {
        ac.cJ(Tgh.Sf(), cJ(), "temp_pkg_info.json");
        Qhi = null;
    }

    public static void Qhi() {
        FileInputStream fileInputStream;
        Throwable th2;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(Tgh.Sf(), "temp_pkg_info.json");
            Long valueOf = Long.valueOf(file.length());
            if (valueOf.longValue() > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[valueOf.intValue()];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi Qhi2 = com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi.Qhi(new JSONObject(new String(bArr, "utf-8")));
                    if (Qhi2 != null) {
                        Qhi = Qhi2;
                        Qhi2.ac();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        ABk.Qhi(AFMParser.VERSION, "version init error", th2);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th4;
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th2 = th5;
        }
    }

    public static void ac() {
        ac.Qhi(Tgh.Sf(), cJ(), "temp_pkg_info.json");
    }

    public static synchronized com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi cJ() {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi;
        synchronized (hm.class) {
            qhi = Qhi;
        }
        return qhi;
    }

    public static boolean cJ(com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi) {
        return ac.ac(cJ(), qhi);
    }

    public static synchronized void Qhi(com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi) {
        synchronized (hm.class) {
            if (qhi != null) {
                if (qhi.ROR()) {
                    Qhi = qhi;
                }
            }
        }
    }

    public static boolean Qhi(String str) {
        return ac.Qhi(cJ(), str);
    }
}
