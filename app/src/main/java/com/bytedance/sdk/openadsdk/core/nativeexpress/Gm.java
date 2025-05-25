package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: ExpressInitHelper.java */
/* loaded from: classes.dex */
public class Gm {
    private static String Qhi;
    private static String cJ;

    public static void Qhi() {
        com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Qhi(new com.bytedance.sdk.component.adexpress.Qhi.Qhi.cJ() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Gm.1
            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.cJ
            public int Qhi(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.cJ
            public Cursor Qhi(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.ac(com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.cJ
            public int Qhi(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.cJ
            public void Qhi(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Qhi(new com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Gm.2

            /* compiled from: ExpressInitHelper.java */
            /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.Gm$2$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements Runnable {
                final /* synthetic */ MessageQueue[] Qhi;

                public AnonymousClass1(MessageQueue[] messageQueueArr) {
                    this.Qhi = messageQueueArr;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.Qhi[0] = Looper.myQueue();
                    Qhi(this.Qhi[0]);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public ExecutorService ABk() {
                if (lG.Gm()) {
                    return lG.CJ();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public void CJ() {
                if ((com.bytedance.sdk.openadsdk.core.HzH.CJ().dI() != 0 && com.bytedance.sdk.openadsdk.core.HzH.CJ().zjb() != 0) || (com.bytedance.sdk.openadsdk.core.HzH.CJ().dVA() != 0 && com.bytedance.sdk.openadsdk.core.HzH.CJ().ots() != 0)) {
                    com.bytedance.sdk.component.adexpress.fl.Tgh.Qhi().Qhi(com.bytedance.sdk.openadsdk.core.HzH.CJ().dI());
                    com.bytedance.sdk.component.adexpress.fl.Tgh.Qhi().cJ(com.bytedance.sdk.openadsdk.core.HzH.CJ().ots());
                    Qhi(com.bytedance.sdk.openadsdk.core.iMK.ac().getLooper().getQueue());
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public int Gm() {
                return com.bytedance.sdk.openadsdk.core.HzH.CJ().dVA();
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public com.bytedance.sdk.component.ROR.cJ.cJ ROR() {
                com.bytedance.sdk.component.ROR.cJ.cJ ac2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().ac();
                ac2.Qhi(8);
                ac2.Qhi("express_get");
                return ac2;
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public String Sf() {
                return com.bytedance.sdk.openadsdk.core.hm.cJ().CJ();
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public com.bytedance.sdk.component.ROR.cJ.Qhi Tgh() {
                com.bytedance.sdk.component.ROR.cJ.Qhi CJ = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().CJ();
                CJ.Qhi(8);
                CJ.Qhi("express_down");
                return CJ;
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public int WAv() {
                return com.bytedance.sdk.openadsdk.core.HzH.CJ().dI();
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public Handler ac() {
                return com.bytedance.sdk.openadsdk.core.iMK.ac();
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public Context cJ() {
                return com.bytedance.sdk.openadsdk.core.HzH.Qhi();
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi fl() {
                return com.bytedance.sdk.openadsdk.core.HzH.ac().Qhi();
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public int hm() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public ExecutorService iMK() {
                if (lG.Gm()) {
                    return lG.Sf();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public int pA() {
                return zn.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public int zc() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac
            public int Qhi() {
                if (com.bytedance.sdk.openadsdk.core.HzH.CJ() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.HzH.CJ().CJ();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Qhi(MessageQueue messageQueue) {
                if (messageQueue != null) {
                    messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Gm.2.2
                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() {
                            if (com.bytedance.sdk.openadsdk.core.HzH.CJ().zjb() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.Qhi.cJ cJVar = new com.bytedance.sdk.openadsdk.core.widget.Qhi.cJ();
                                cJVar.Qhi(false);
                                cJVar.cJ();
                            }
                            if (com.bytedance.sdk.openadsdk.core.HzH.CJ().ots() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.Qhi.cJ cJVar2 = new com.bytedance.sdk.openadsdk.core.widget.Qhi.cJ();
                                cJVar2.Qhi(true);
                                cJVar2.cJ();
                            }
                            return false;
                        }
                    });
                }
            }
        });
        com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Qhi(new com.bytedance.sdk.component.adexpress.Qhi.Qhi.fl() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Gm.3
            @Override // com.bytedance.sdk.component.adexpress.Qhi.Qhi.fl
            public void Qhi(int i10) {
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().cJ(i10).Tgh(com.bytedance.sdk.openadsdk.core.Sf.Qhi(i10)));
            }
        });
        com.bytedance.sdk.component.widget.Qhi.Qhi.Qhi().Qhi(new com.bytedance.sdk.component.widget.Qhi.cJ() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Gm.4
            @Override // com.bytedance.sdk.component.widget.Qhi.cJ
            public void Qhi(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.cJ.ac.ac(com.bytedance.sdk.openadsdk.utils.cJ.Qhi(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.widget.Qhi.cJ
            public void Qhi(com.bytedance.sdk.component.widget.cJ.Qhi qhi, String str, String str2, JSONObject jSONObject, long j10) {
                tP ac2 = tP.ac();
                ac2.HzH(qhi.Qhi());
                ac2.MQ(qhi.cJ());
                ac2.kYc(qhi.ac());
                com.bytedance.sdk.openadsdk.cJ.ac.cJ(ac2, str, str2, jSONObject, j10);
            }
        });
    }

    public static String ac() {
        Map<String, com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi> Qhi2;
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi;
        String ac2;
        if (cJ == null) {
            cJ = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi cJ2 = com.bytedance.sdk.component.adexpress.Qhi.cJ.hm.cJ();
        if (cJ2 != null && (Qhi2 = cJ2.Qhi()) != null && (qhi = Qhi2.get("v3")) != null && (ac2 = qhi.ac()) != null && !ac2.equals(cJ)) {
            cJ = ac2;
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sp", "js_render_v3_ver", ac2);
        }
        return cJ;
    }

    public static String cJ() {
        String ac2;
        if (Qhi == null) {
            Qhi = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi cJ2 = com.bytedance.sdk.component.adexpress.Qhi.cJ.hm.cJ();
        if (cJ2 != null && (ac2 = cJ2.ac()) != null && !ac2.equals(Qhi)) {
            Qhi = ac2;
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sp", "js_render_ver", ac2);
        }
        return Qhi;
    }
}
