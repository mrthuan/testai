package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: PglEncryptStatisticsHelper.java */
/* loaded from: classes.dex */
public class EBS {
    private static final AtomicInteger CJ;
    private static final AtomicInteger Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private static final AtomicInteger f8906ac;
    private static final AtomicInteger cJ;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        Qhi = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        cJ = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        f8906ac = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        CJ = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void Qhi() {
        try {
            long Qhi2 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "upload_time_key", 0L);
            int i10 = (Qhi2 > 0L ? 1 : (Qhi2 == 0L ? 0 : -1));
            if (i10 > 0 && System.currentTimeMillis() - Qhi2 >= 86400000) {
                cJ();
                synchronized (EBS.class) {
                    Qhi.set(0);
                    cJ.set(0);
                    f8906ac.set(0);
                    CJ.set(0);
                    com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file");
                    com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                }
            } else if (i10 <= 0 || Qhi2 > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void cJ() {
        final int i10 = Qhi.get();
        final int i11 = cJ.get();
        final int i12 = f8906ac.get();
        final int i13 = CJ.get();
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.core.EBS.1
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("crypt_v4_statistics").cJ(jSONObject.toString());
            }
        });
    }

    public static synchronized void cJ(boolean z10) {
        synchronized (EBS.class) {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(Qhi.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(cJ.incrementAndGet()));
            }
        }
    }

    public static void Qhi(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.core.EBS.2
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("crypt_v4_fail").cJ(jSONObject.toString());
            }
        });
    }

    public static synchronized void Qhi(boolean z10) {
        synchronized (EBS.class) {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(f8906ac.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(f8906ac.incrementAndGet()));
            }
        }
    }

    public static void Qhi(JSONObject jSONObject) {
        cJ(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
