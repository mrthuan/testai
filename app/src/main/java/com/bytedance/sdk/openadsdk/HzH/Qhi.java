package com.bytedance.sdk.openadsdk.HzH;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.activity.f;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.openadsdk.CJ.tP;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.settings.pA;
import com.bytedance.sdk.openadsdk.kYc.ac;
import com.bytedance.sdk.openadsdk.kYc.fl;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: StrategyCenterUtils.java */
/* loaded from: classes.dex */
public class Qhi {
    public static final ConcurrentHashMap<String, Object> Qhi = new ConcurrentHashMap<>();
    private static volatile ac cJ;

    public static ac Qhi(final Context context, final String str) {
        if (cJ == null) {
            synchronized (Qhi.class) {
                if (cJ == null) {
                    ac acVar = new ac(new fl() { // from class: com.bytedance.sdk.openadsdk.HzH.Qhi.1
                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public Handler CJ() {
                            return iMK.cJ();
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public ExecutorService Qhi() {
                            return lG.CJ();
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public Map<String, String> ROR() {
                            HashMap hashMap = new HashMap();
                            hashMap.put("User-Agent", js.ac());
                            return hashMap;
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public JSONObject Tgh() {
                            try {
                                JSONObject Qhi2 = pA.Qhi(bxS.Qhi(HzH.Qhi(), 0L));
                                if (!Qhi2.has("app_id")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        Qhi2.put("app_id", str);
                                    } else if (TextUtils.isEmpty(hm.cJ().CJ())) {
                                        return null;
                                    } else {
                                        Qhi2.put("app_id", hm.cJ().CJ());
                                    }
                                }
                                return com.bytedance.sdk.component.utils.Qhi.Qhi(Qhi2);
                            } catch (Throwable th2) {
                                ABk.Qhi("StrategyUtils", th2.getMessage());
                                return null;
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public String ac() {
                            return "pag_adn_strategy_center";
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public Context cJ() {
                            Context context2 = context;
                            if (context2 != null) {
                                return context2;
                            }
                            return HzH.Qhi();
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public String fl() {
                            return js.CJ("/api/ad/union/sdk/strategies/adn");
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.fl
                        public JSONObject Qhi(JSONObject jSONObject) {
                            int optInt = jSONObject.optInt("cypher", -1);
                            if (optInt != -1 && optInt == 3) {
                                String ac2 = com.bytedance.sdk.component.utils.Qhi.ac(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                if (TextUtils.isEmpty(ac2)) {
                                    return jSONObject;
                                }
                                try {
                                    return new JSONObject(ac2);
                                } catch (Throwable unused) {
                                    return jSONObject;
                                }
                            }
                            return jSONObject;
                        }
                    });
                    cJ = acVar;
                    acVar.Qhi(new com.bytedance.sdk.openadsdk.kYc.Qhi() { // from class: com.bytedance.sdk.openadsdk.HzH.Qhi.2
                        @Override // com.bytedance.sdk.openadsdk.kYc.Qhi
                        public void Qhi() {
                            com.bytedance.sdk.openadsdk.ABk.ac.Qhi(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.HzH.Qhi.2.1
                                @Override // com.bytedance.sdk.openadsdk.ABk.fl
                                public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                                    com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                    qhi.cJ("strategy_fetch");
                                    return qhi;
                                }
                            });
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.Qhi
                        public void cJ() {
                            com.bytedance.sdk.openadsdk.ABk.ac.cJ(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.HzH.Qhi.2.2
                                @Override // com.bytedance.sdk.openadsdk.ABk.fl
                                public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                                    com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                    qhi.cJ("strategy_fetch");
                                    return qhi;
                                }
                            });
                            tP.Qhi().cJ();
                        }

                        @Override // com.bytedance.sdk.openadsdk.kYc.Qhi
                        public void Qhi(int i10, String str2) {
                            com.bytedance.sdk.openadsdk.ABk.ac.ac(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.HzH.Qhi.2.3
                                @Override // com.bytedance.sdk.openadsdk.ABk.fl
                                public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                                    com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                    qhi.cJ("strategy_fetch");
                                    return qhi;
                                }
                            });
                        }
                    });
                }
            }
        }
        return cJ;
    }

    private static ac cJ() {
        return Qhi(HzH.Qhi(), hm.cJ().CJ());
    }

    public static int Qhi(String str, int i10) {
        return cJ().Qhi(str, i10);
    }

    public static boolean Qhi(String str, boolean z10) {
        return cJ().Qhi(str, z10);
    }

    public static String Qhi(String str, String str2) {
        return cJ().Qhi(str, str2);
    }

    public static int Qhi(String str, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String m10 = f.m(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = Qhi;
            Object obj = concurrentHashMap.get(m10);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String Qhi2 = cJ().Qhi(str, "");
                if (TextUtils.isEmpty(Qhi2)) {
                    return i10;
                }
                int optInt = new JSONObject(Qhi2).optInt(str2, i10);
                concurrentHashMap.put(m10, Integer.valueOf(optInt));
                return optInt;
            } catch (Throwable th2) {
                ABk.Qhi("StrategyUtils", th2.getMessage());
            }
        }
        return i10;
    }

    public static void Qhi() {
        cJ().Qhi();
    }
}
