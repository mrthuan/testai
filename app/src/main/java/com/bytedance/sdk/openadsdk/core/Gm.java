package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.js;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: IPManger.java */
/* loaded from: classes.dex */
public class Gm {
    private static final AtomicInteger Qhi = new AtomicInteger(0);
    private static final AtomicBoolean cJ = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void CJ() {
        if (Qhi.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.lG.Qhi().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Gm.2
                @Override // java.lang.Runnable
                public void run() {
                    Gm.ac(zc.Qhi(HzH.Qhi()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ac(final String str) {
        com.bytedance.sdk.openadsdk.utils.lG.ac(new com.bytedance.sdk.component.Sf.hm("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.Gm.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject Qhi2;
                final String SO = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().SO();
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi(0, SO);
                if (TextUtils.isEmpty(SO)) {
                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi(-1, SO, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.ROR.cJ.fl cJ2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
                try {
                    cJ2.cJ(SO);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.bxS.Qhi(HzH.Qhi(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.cJ.Qhi.ac.Qhi().cJ());
                    if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        Qhi2 = PangleEncryptManager.encryptType4(jSONObject, new qMt(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (Qhi2 != null && Qhi2.optInt("cypher") == 4) {
                            EBS.cJ(true);
                            cJ2.cJ("x-pgli18n", "4");
                            cJ2.cJ("Content-Type", "application/json; charset=utf-8");
                        } else {
                            EBS.cJ(false);
                        }
                    } else {
                        Qhi2 = com.bytedance.sdk.component.utils.Qhi.Qhi(jSONObject);
                        if (Gm.cJ(Qhi2)) {
                            cJ2.cJ("Content-Encoding", "union_sdk_encode");
                        }
                    }
                    if (Gm.cJ(Qhi2)) {
                        jSONObject = Qhi2;
                    }
                    cJ2.cJ("Content-Type", "application/json; charset=utf-8");
                    cJ2.cJ("User-Agent", js.ac());
                    cJ2.Qhi(jSONObject);
                    cJ2.Qhi(6);
                    cJ2.Qhi("send_i_p_v6");
                    cJ2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.Gm.1.1
                        @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                        public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                            if (cJVar.Tgh()) {
                                com.bytedance.sdk.openadsdk.Gm.ac.Qhi(1, SO);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.Gm.ac.Qhi(-1, SO, cJVar.Qhi(), cJVar.cJ());
                            Gm.CJ();
                        }

                        @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                        public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.Gm.ac.Qhi(-1, SO, 1, iOException.getMessage());
                            }
                            Gm.CJ();
                        }
                    });
                } catch (Exception e10) {
                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi(-1, SO, -2, e10.getMessage());
                    com.bytedance.sdk.component.utils.ABk.cJ("build ipv6 request failed:" + e10.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ac() {
        Qhi.set(0);
    }

    /* compiled from: IPManger.java */
    /* loaded from: classes.dex */
    public static class Qhi implements bxS.Qhi {
        private static final AtomicBoolean Qhi = new AtomicBoolean(false);
        private static volatile long cJ = -1;

        private Qhi() {
        }

        public static void Qhi() {
            if (Qhi.compareAndSet(false, true)) {
                cJ = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.bxS.Qhi(new Qhi(), HzH.Qhi());
            }
        }

        public void cJ() {
            com.bytedance.sdk.component.utils.bxS.Qhi(this);
        }

        @Override // com.bytedance.sdk.component.utils.bxS.Qhi
        public void Qhi(Context context, Intent intent, boolean z10, int i10) {
            if (System.currentTimeMillis() - cJ >= 2000 && i10 != 0) {
                Gm.ac();
                Gm.ac(zc.Qhi(HzH.Qhi()));
                cJ();
            }
        }
    }

    public static void Qhi(String str) {
        AtomicBoolean atomicBoolean = cJ;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.hpZ.Sf(HzH.Qhi())) {
                atomicBoolean.set(false);
                return;
            }
            Qhi.Qhi();
            ac(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean cJ(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
