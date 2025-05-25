package com.bytedance.sdk.openadsdk.ABk;

import android.content.Context;
import android.os.Handler;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.List;
import java.util.concurrent.ExecutorService;
import lib.zj.office.fc.hpsf.Constants;
import org.json.JSONObject;

/* compiled from: BusMonitorUtils.java */
/* loaded from: classes.dex */
public class ac {
    private static volatile Qhi Qhi;
    private static Boolean cJ;

    public static void cJ(fl flVar) {
        Qhi().Qhi(new Tgh(flVar, 0, 1, 0));
    }

    public static Qhi Qhi() {
        if (Qhi == null) {
            synchronized (ac.class) {
                if (Qhi == null) {
                    Qhi = Qhi.Qhi(new cJ() { // from class: com.bytedance.sdk.openadsdk.ABk.ac.1
                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public Context getContext() {
                            return HzH.Qhi();
                        }

                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public ExecutorService getExecutorService() {
                            return lG.hm();
                        }

                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public Handler getHandler() {
                            return iMK.cJ();
                        }

                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public int getOnceLogCount() {
                            int Qhi2 = com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("bus_monitor_config", "once_count", 10);
                            if (Qhi2 > 100 || Qhi2 < 5) {
                                return 10;
                            }
                            return Qhi2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public int getOnceLogInterval() {
                            int Qhi2 = com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("bus_monitor_config", "once_interval", Constants.CP_MAC_ROMAN);
                            if (Qhi2 < 10000) {
                                return Constants.CP_MAC_ROMAN;
                            }
                            return Qhi2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public int getUploadIntervalTime() {
                            int Qhi2 = com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("bus_monitor_config", "interval", 43200000);
                            if (Qhi2 < 3600000) {
                                return 86400000;
                            }
                            return Qhi2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public boolean isMonitorOpen() {
                            if (ac.cJ != null) {
                                return ac.cJ.booleanValue();
                            }
                            boolean z10 = false;
                            if (com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("bus_monitor_config", "enable", 0) == 1) {
                                z10 = true;
                            }
                            Boolean unused = ac.cJ = Boolean.valueOf(z10);
                            return ac.cJ.booleanValue();
                        }

                        @Override // com.bytedance.sdk.openadsdk.ABk.cJ
                        public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.ABk.cJ.Qhi> list) {
                            if (list != null && !list.isEmpty()) {
                                for (final com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi : list) {
                                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
                                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi("bus_monitor", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.ABk.ac.1.1
                                        @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                                        public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", qhi.cJ());
                                                jSONObject.put("scene", qhi.ac());
                                                jSONObject.put("start_count", qhi.CJ());
                                                jSONObject.put("success_count", qhi.fl());
                                                jSONObject.put("fail_count", qhi.Tgh());
                                                jSONObject.put("rit", qhi.ROR());
                                                jSONObject.put("tag", qhi.Sf());
                                                jSONObject.put("label", qhi.hm());
                                                jSONObject.put("mediation", qhi.Gm());
                                                jSONObject.put("is_init", qhi.zc());
                                                jSONObject.put("extra", qhi.ABk());
                                                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("bus_monitor").cJ(jSONObject.toString());
                                            } catch (Exception e10) {
                                                ABk.Qhi("BusMonitorUtils", "onMonitorUpload: ", e10);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }
        }
        return Qhi;
    }

    public static void ac(fl flVar) {
        Qhi().Qhi(new Tgh(flVar, 0, 0, 1));
    }

    public static void cJ() {
        Qhi().Qhi(true);
    }

    public static void Qhi(fl flVar) {
        Qhi().Qhi(new Tgh(flVar, 1, 0, 0));
    }
}
