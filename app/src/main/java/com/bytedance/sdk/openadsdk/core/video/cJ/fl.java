package com.bytedance.sdk.openadsdk.core.video.CJ;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.ac.ac;
import com.bykv.vk.openvk.component.video.api.fl.Qhi;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.cJ.Qhi.Sf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ABk;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Gm;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.WAv;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.zc;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import org.json.JSONObject;

/* compiled from: VideoPreloadFactory.java */
/* loaded from: classes.dex */
public class fl {
    public static final Qhi Qhi = new com.bykv.vk.openvk.component.video.Qhi.Qhi.cJ.Qhi();

    private static boolean Qhi(ac acVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ac(ac acVar, tP tPVar, AdSlot adSlot) {
        if (!Qhi(acVar)) {
            return;
        }
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.cJ(new com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi(tPVar, js.ac(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(tPVar, (String) null, -1, acVar), new WAv(acVar.ABk(), acVar.ac())));
    }

    private static void cJ(ac acVar, tP tPVar, AdSlot adSlot) {
        if (Qhi(acVar)) {
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi("load_video_start", new com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi(tPVar, js.ac(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(tPVar, (String) null, -1, acVar), new zc(acVar.ABk(), acVar.WAv() ? acVar.hm() : acVar.ac())));
        }
    }

    public static void Qhi(final ac acVar, final Qhi.InterfaceC0063Qhi interfaceC0063Qhi) {
        tP tPVar;
        AdSlot adSlot;
        if ((acVar.ac() > 0 || acVar.WAv()) && acVar.pA() != -2) {
            boolean z10 = true;
            if (acVar.pA() != 1) {
                acVar.CJ(6000);
                acVar.fl(6000);
                acVar.Tgh(6000);
                boolean z11 = acVar.fl("material_meta") != null && (acVar.fl("material_meta") instanceof tP);
                if (acVar.fl("ad_slot") == null || !(acVar.fl("ad_slot") instanceof AdSlot)) {
                    z10 = false;
                }
                if (z11 && z10) {
                    tPVar = (tP) acVar.fl("material_meta");
                    AdSlot adSlot2 = (AdSlot) acVar.fl("ad_slot");
                    cJ(acVar, tPVar, adSlot2);
                    adSlot = adSlot2;
                } else {
                    tPVar = null;
                    adSlot = null;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final tP tPVar2 = tPVar;
                final AdSlot adSlot3 = adSlot;
                final Qhi.InterfaceC0063Qhi interfaceC0063Qhi2 = new Qhi.InterfaceC0063Qhi() { // from class: com.bytedance.sdk.openadsdk.core.video.CJ.fl.1
                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(ac acVar2, int i10) {
                        Qhi.InterfaceC0063Qhi interfaceC0063Qhi3 = Qhi.InterfaceC0063Qhi.this;
                        if (interfaceC0063Qhi3 != null) {
                            interfaceC0063Qhi3.Qhi(acVar2, i10);
                        }
                        if (tPVar2 == null || adSlot3 == null) {
                            return;
                        }
                        fl.cJ(acVar, tPVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void cJ(ac acVar2, int i10) {
                        AdSlot adSlot4;
                        Qhi.InterfaceC0063Qhi interfaceC0063Qhi3 = Qhi.InterfaceC0063Qhi.this;
                        if (interfaceC0063Qhi3 != null) {
                            interfaceC0063Qhi3.Qhi(acVar2, i10);
                        }
                        tP tPVar3 = tPVar2;
                        if (tPVar3 != null && (adSlot4 = adSlot3) != null) {
                            fl.ac(acVar, tPVar3, adSlot4);
                        }
                        acVar.iMK();
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(ac acVar2, int i10, String str) {
                        Qhi.InterfaceC0063Qhi interfaceC0063Qhi3 = Qhi.InterfaceC0063Qhi.this;
                        if (interfaceC0063Qhi3 != null) {
                            interfaceC0063Qhi3.Qhi(acVar2, i10, str);
                        }
                        if (tPVar2 == null || adSlot3 == null) {
                            return;
                        }
                        fl.cJ(acVar, tPVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, i10, str);
                    }
                };
                if (!Qhi(acVar.ABk())) {
                    if (interfaceC0063Qhi != null) {
                        interfaceC0063Qhi.Qhi(acVar, TTAdConstant.DEEPLINK_FALLBACK_CODE, "unexpected url: " + acVar.ABk());
                    }
                    cJ(acVar, tPVar, adSlot, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
                    return;
                }
                hm hmVar = new hm("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.video.CJ.fl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            fl.Qhi.Qhi(HzH.Qhi(), acVar, interfaceC0063Qhi2);
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                    }
                };
                if (lG.fl()) {
                    lG.cJ(hmVar);
                    return;
                } else {
                    hmVar.run();
                    return;
                }
            }
        }
        if (interfaceC0063Qhi != null) {
            interfaceC0063Qhi.Qhi(acVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(ac acVar, tP tPVar, AdSlot adSlot, long j10, int i10, String str) {
        if (Qhi(acVar)) {
            String ac2 = js.ac(adSlot.getDurationSlotType());
            JSONObject Qhi2 = com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(tPVar, (String) null, -1, acVar);
            Gm gm2 = new Gm();
            gm2.Qhi(acVar.ABk());
            gm2.Qhi(acVar.ac());
            gm2.cJ(j10);
            gm2.Qhi(i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            gm2.cJ(str);
            gm2.ac("");
            com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(new com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi(tPVar, ac2, Qhi2, gm2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(ac acVar, tP tPVar, AdSlot adSlot, long j10) {
        if (Qhi(acVar)) {
            String ac2 = js.ac(adSlot.getDurationSlotType());
            JSONObject Qhi2 = com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(tPVar, (String) null, -1, acVar);
            ABk aBk = new ABk();
            aBk.Qhi(acVar.ABk());
            aBk.Qhi(acVar.ac());
            aBk.cJ(j10);
            if (acVar.tP() == 1) {
                aBk.ac(1L);
            } else {
                aBk.ac(0L);
            }
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi("load_video_success", new com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi(tPVar, ac2, Qhi2, aBk));
        }
    }

    public static boolean Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return Sf.ac(str) != null;
    }
}
