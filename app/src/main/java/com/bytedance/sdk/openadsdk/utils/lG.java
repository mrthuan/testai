package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.ac.ROR;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: ThreadUtils.java */
/* loaded from: classes.dex */
public class lG {
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR CJ;
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR Gm;
    private static volatile ThreadPoolExecutor Qhi;
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR ROR;
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR Sf;
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR Tgh;
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR WAv;

    /* renamed from: ac  reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR f9391ac;
    private static volatile boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR f9392fl;

    /* renamed from: hm  reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.Sf.ac.ROR f9393hm;

    static {
        com.bytedance.sdk.component.Sf.ac.ac.Qhi(new com.bytedance.sdk.component.Sf.ac.Qhi() { // from class: com.bytedance.sdk.openadsdk.utils.lG.1
            @Override // com.bytedance.sdk.component.Sf.ac.Qhi
            public void Qhi(com.bytedance.sdk.component.Sf.ac.ROR ror, com.bytedance.sdk.component.Sf.ac.cJ cJVar) {
                cJVar.cJ();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.Sf.ac.ac.Qhi(new com.bytedance.sdk.component.Sf.ac.Tgh() { // from class: com.bytedance.sdk.openadsdk.utils.lG.3
            @Override // com.bytedance.sdk.component.Sf.ac.Tgh
            public void Qhi(final com.bytedance.sdk.component.Sf.ac.ROR ror) {
                if (!NFd.Qhi && ror != null) {
                    try {
                        LinkedHashMap<String, com.bytedance.sdk.component.Sf.ac.Qhi.Qhi> Qhi2 = ror.Qhi();
                        if (Qhi2 != null && Qhi2.size() > 0) {
                            for (Map.Entry<String, com.bytedance.sdk.component.Sf.ac.Qhi.Qhi> entry : Qhi2.entrySet()) {
                                final com.bytedance.sdk.component.Sf.ac.Qhi.Qhi value = entry.getValue();
                                if (value != null) {
                                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
                                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.utils.lG.3.1
                                        @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                                        public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                                            int cJ2;
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put(NamingTable.TAG, value.Qhi());
                                                jSONObject.put("times", value.cJ());
                                                jSONObject.put("runMaxTime", value.Tgh());
                                                jSONObject.put("waitMaxTime", value.fl());
                                                if (value.cJ() == 0) {
                                                    cJ2 = 1;
                                                } else {
                                                    cJ2 = value.cJ();
                                                }
                                                long j10 = cJ2;
                                                jSONObject.put("avgRunTime", value.CJ() / j10);
                                                jSONObject.put("avgWaitTime", value.ac() / j10);
                                                jSONObject.put("poolType", ror.cJ());
                                            } catch (Exception e10) {
                                                com.bytedance.sdk.component.utils.ABk.Qhi("ThreadUtils", "run: ", e10);
                                            }
                                            return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("pag_thread_pool_state").cJ(jSONObject.toString());
                                        }
                                    });
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
            }
        });
        Qhi = null;
        cJ = false;
    }

    private static ThreadPoolExecutor ABk() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = f9391ac;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(f9391ac)) {
                    f9391ac = Qhi("ad", f9391ac);
                }
                ror = f9391ac;
            }
            return ror;
        }
        return ror2;
    }

    public static ExecutorService CJ() {
        if (Gm()) {
            return iMK();
        }
        return com.bytedance.sdk.component.Sf.ROR.cJ();
    }

    public static boolean Gm() {
        if (com.bytedance.sdk.openadsdk.core.settings.HzH.Ug()) {
            return com.bytedance.sdk.openadsdk.core.settings.HzH.YD().mZ();
        }
        return true;
    }

    private static com.bytedance.sdk.component.Sf.ac.ROR HzH() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = Sf;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(Sf)) {
                    Sf = Qhi("image", Sf);
                }
                ror = Sf;
            }
            return ror;
        }
        return ror2;
    }

    public static ScheduledExecutorService Qhi() {
        return com.bytedance.sdk.component.Sf.ROR.Tgh();
    }

    public static ExecutorService ROR() {
        if (Gm()) {
            return kYc();
        }
        return com.bytedance.sdk.component.Sf.ROR.ac();
    }

    public static com.bytedance.sdk.component.Sf.ac.ROR Sf() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = f9393hm;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(f9393hm)) {
                    f9393hm = Qhi("express", f9393hm);
                }
                ror = f9393hm;
            }
            return ror;
        }
        return ror2;
    }

    public static boolean Tgh() {
        String str;
        if (Gm()) {
            str = "pag_log";
        } else {
            str = "csj_log";
        }
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static com.bytedance.sdk.component.Sf.ac.ROR WAv() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = WAv;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(WAv)) {
                    WAv = Qhi("net", WAv);
                }
                ror = WAv;
            }
            return ror;
        }
        return ror2;
    }

    public static ExecutorService ac() {
        if (Gm()) {
            return pA();
        }
        return com.bytedance.sdk.component.Sf.ROR.CJ();
    }

    public static ExecutorService cJ() {
        if (Gm()) {
            return HzH();
        }
        return com.bytedance.sdk.component.Sf.ROR.WAv();
    }

    public static boolean fl() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static com.bytedance.sdk.component.Sf.ac.ROR hm() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = Gm;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(Gm)) {
                    Gm = Qhi("monitor", Gm);
                }
                ror = Gm;
            }
            return ror;
        }
        return ror2;
    }

    private static com.bytedance.sdk.component.Sf.ac.ROR hpZ() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = f9392fl;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(f9392fl)) {
                    f9392fl = Qhi("aidl", f9392fl);
                }
                ror = f9392fl;
            }
            return ror;
        }
        return ror2;
    }

    private static com.bytedance.sdk.component.Sf.ac.ROR iMK() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = Tgh;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(Tgh)) {
                    Tgh = Qhi("cache", Tgh);
                }
                ror = Tgh;
            }
            return ror;
        }
        return ror2;
    }

    private static com.bytedance.sdk.component.Sf.ac.ROR kYc() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = ROR;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(ROR)) {
                    ROR = Qhi("io", ROR);
                }
                ror = ROR;
            }
            return ror;
        }
        return ror2;
    }

    private static com.bytedance.sdk.component.Sf.ac.ROR pA() {
        com.bytedance.sdk.component.Sf.ac.ROR ror;
        com.bytedance.sdk.component.Sf.ac.ROR ror2 = CJ;
        if (Qhi(ror2)) {
            synchronized (lG.class) {
                if (Qhi(CJ)) {
                    CJ = Qhi("log", CJ);
                }
                ror = CJ;
            }
            return ror;
        }
        return ror2;
    }

    private static ThreadPoolExecutor zc() {
        int i10;
        if (Qhi == null) {
            synchronized (lG.class) {
                if (Qhi == null) {
                    if (com.bytedance.sdk.openadsdk.core.settings.HzH.Ug()) {
                        i10 = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Oy();
                        cJ = true;
                    } else {
                        i10 = 4;
                    }
                    Qhi = new ThreadPoolExecutor(i10, Api.BaseClientBuilder.API_PRIORITY_OTHER, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                }
            }
        }
        return Qhi;
    }

    public static void Qhi(Runnable runnable) {
        if (runnable == null || NFd.Qhi) {
            return;
        }
        if (fl()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.iMK.ac().post(runnable);
        }
    }

    public static void fl(final com.bytedance.sdk.component.Sf.hm hmVar) {
        if (NFd.Qhi) {
            return;
        }
        if (Gm()) {
            ABk().execute(new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName(), hmVar) { // from class: com.bytedance.sdk.openadsdk.utils.lG.2
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            });
            return;
        }
        ThreadPoolExecutor zc2 = zc();
        zc2.execute(hmVar);
        if (cJ || !com.bytedance.sdk.openadsdk.core.settings.HzH.Ug()) {
            return;
        }
        cJ = true;
        zc2.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Oy());
    }

    public static void CJ(final com.bytedance.sdk.component.Sf.hm hmVar) {
        if (hmVar == null || NFd.Qhi) {
            return;
        }
        if (Gm()) {
            ABk().execute(new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.lG.9
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Sf.ROR.fl(hmVar);
        }
    }

    public static void ac(final com.bytedance.sdk.component.Sf.hm hmVar) {
        if (hmVar == null || NFd.Qhi) {
            return;
        }
        if (Gm()) {
            pA().execute(new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.lG.7
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Sf.ROR.ac(hmVar);
        }
    }

    public static void cJ(final com.bytedance.sdk.component.Sf.hm hmVar) {
        if (NFd.Qhi) {
            return;
        }
        if (Gm()) {
            kYc().execute(new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.lG.5
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Sf.ROR.cJ(hmVar);
        }
    }

    public static void Qhi(final com.bytedance.sdk.component.Sf.hm hmVar) {
        if (NFd.Qhi) {
            return;
        }
        if (Gm()) {
            iMK().execute(new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.lG.4
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Sf.ROR.Qhi(hmVar);
        }
    }

    public static void ac(final com.bytedance.sdk.component.Sf.hm hmVar, int i10) {
        if (hmVar == null || NFd.Qhi) {
            return;
        }
        if (Gm()) {
            hpZ().execute(new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.lG.10
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Sf.ROR.ac(hmVar, i10);
        }
    }

    public static void cJ(final com.bytedance.sdk.component.Sf.hm hmVar, int i10) {
        if (hmVar == null || NFd.Qhi) {
            return;
        }
        if (Gm()) {
            com.bytedance.sdk.component.Sf.ac.cJ cJVar = new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.lG.8
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            };
            cJVar.Qhi(i10);
            pA().execute(cJVar);
            return;
        }
        com.bytedance.sdk.component.Sf.ROR.cJ(hmVar, i10);
    }

    public static void Qhi(final com.bytedance.sdk.component.Sf.hm hmVar, int i10) {
        if (hmVar == null || NFd.Qhi) {
            return;
        }
        if (Gm()) {
            com.bytedance.sdk.component.Sf.ac.cJ cJVar = new com.bytedance.sdk.component.Sf.ac.cJ(hmVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.lG.6
                @Override // java.lang.Runnable
                public void run() {
                    hmVar.run();
                }
            };
            cJVar.Qhi(i10);
            kYc().execute(cJVar);
            return;
        }
        com.bytedance.sdk.component.Sf.ROR.Qhi(hmVar, 5, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static ROR.Qhi cJ(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        ROR.Qhi qhi = new ROR.Qhi();
        str.getClass();
        switch (str.hashCode()) {
            case -1308979344:
                if (str.equals("express")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3107:
                if (str.equals("ad")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3366:
                if (str.equals("io")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 108957:
                if (str.equals("net")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str.equals("cache")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1236319578:
                if (str.equals("monitor")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return qhi.Qhi(str).Qhi(2).cJ(4).ac(0).Qhi(10000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            case 1:
                return qhi.Qhi(str).Qhi(4).cJ(4).ac(0).Qhi(20000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            case 2:
                return qhi.Qhi(str).Qhi(4).cJ(10).ac(0).Qhi(20000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            case 3:
                return qhi.Qhi(str).Qhi(4).cJ(6).ac(2).Qhi(20000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            case 4:
                return qhi.Qhi(str).Qhi(10).cJ(10).ac(0).Qhi(10000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            case 5:
                return qhi.Qhi(str).Qhi(2).cJ(4).ac(0).Qhi(10000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            case 6:
                return qhi.Qhi(str).Qhi(0).cJ(0).ac(0).Qhi(TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL).Qhi(true).fl(-1).CJ(20).cJ(false);
            case 7:
                return qhi.Qhi(str).Qhi(3).cJ(3).ac(0).Qhi(20000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            case '\b':
                return qhi.Qhi(str).Qhi(2).cJ(2).ac(0).Qhi(10000L).Qhi(true).fl(-1).CJ(10).cJ(false);
            default:
                return qhi.Qhi(str).Qhi(8).cJ(16).ac(2).Qhi(20000L).Qhi(true).fl(-1).CJ(10).cJ(false);
        }
    }

    public static void Qhi(com.bytedance.sdk.component.Sf.ac.cJ cJVar) {
        WAv().execute(cJVar);
    }

    private static boolean Qhi(com.bytedance.sdk.component.Sf.ac.ROR ror) {
        if (ror != null) {
            return !ror.ac() && com.bytedance.sdk.openadsdk.core.settings.HzH.Ug();
        }
        return true;
    }

    private static com.bytedance.sdk.component.Sf.ac.ROR Qhi(String str, com.bytedance.sdk.component.Sf.ac.ROR ror) {
        ROR.Qhi Qhi2 = Qhi(str);
        if (ror == null) {
            return Qhi2.Qhi();
        }
        ror.Qhi(Qhi2);
        return ror;
    }

    private static ROR.Qhi Qhi(String str) {
        ROR.Qhi cJ2 = cJ(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.HzH.Ug()) {
                cJ2.cJ(true);
                JSONObject Wrw = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Wrw();
                JSONObject optJSONObject = Wrw != null ? Wrw.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    cJ2.cJ(true);
                    if (optJSONObject.has("coreSize")) {
                        cJ2.Qhi(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has("maxSize")) {
                        cJ2.cJ(optJSONObject.optInt("maxSize"));
                    }
                    if (optJSONObject.has("createSize")) {
                        cJ2.ac(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        cJ2.Qhi(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        cJ2.Qhi(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        cJ2.fl(optJSONObject.optInt("reportLogThreshold"));
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        cJ2.CJ(optJSONObject.optInt("logTaskCount"));
                    }
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return cJ2;
    }
}
