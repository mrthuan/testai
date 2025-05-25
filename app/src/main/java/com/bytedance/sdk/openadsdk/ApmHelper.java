package com.bytedance.sdk.openadsdk;

import a6.h;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.cJ.ac;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.settings.ROR;
import com.bytedance.sdk.openadsdk.core.zc;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ApmHelper {
    private static boolean CJ = false;
    private static volatile boolean Qhi = false;
    private static Qhi ROR;
    private static cJ Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private static String f8460ac;
    private static final AtomicBoolean cJ = new AtomicBoolean(false);

    /* renamed from: fl  reason: collision with root package name */
    private static boolean f8461fl = false;

    /* loaded from: classes.dex */
    public static class Qhi {
        public final String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public final Throwable f8462ac;
        public final String cJ;

        public Qhi(String str, String str2, Throwable th2) {
            this.Qhi = str;
            this.cJ = str2;
            this.f8462ac = th2;
        }
    }

    /* loaded from: classes.dex */
    public interface cJ {
        void Qhi(String str, String str2, Throwable th2);
    }

    private static String Gm() {
        ROR CJ2 = HzH.CJ();
        if (CJ2 != null) {
            if (CJ2.ABk()) {
                return "support_mem_dynamic_1";
            }
            return "support_mem_dynamic_0";
        }
        return "release";
    }

    private static Map<String, String> WAv() {
        HashMap hashMap = new HashMap();
        tP Qhi2 = com.bytedance.sdk.openadsdk.utils.cJ.Qhi();
        if (Qhi2 != null) {
            hashMap.put("adType", String.valueOf(Qhi2.eN()));
            hashMap.put("aid", String.valueOf(Qhi2.sRC()));
            hashMap.put("cid", Qhi2.HLI());
            hashMap.put("reqId", Qhi2.jWV());
            hashMap.put("rit", Qhi2.CQU("-1"));
            int CQU = Qhi2.CQU();
            if (Qhi2.EBS() != 2) {
                CQU = -1;
            }
            hashMap.put("render_type", String.valueOf(CQU));
        }
        return hashMap;
    }

    public static /* synthetic */ Map ac() {
        return WAv();
    }

    public static /* synthetic */ String fl() {
        return Gm();
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (!cJ.compareAndSet(false, true) || Qhi) {
            return;
        }
        lG.Qhi(new hm("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.Qhi) {
                    ROR CJ2 = HzH.CJ();
                    boolean unused = ApmHelper.CJ = CJ2.dIT();
                    if (ApmHelper.CJ && !TextUtils.isEmpty(CJ2.zn())) {
                        String unused2 = ApmHelper.f8460ac = initConfig.getAppId();
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String Qhi2 = zc.Qhi(context);
                        String zn2 = CJ2.zn();
                        try {
                            final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 6206L, BuildConfig.VERSION_NAME, strArr);
                            initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.AttachUserData
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> ac2 = ApmHelper.ac();
                                    if (ac2.containsKey("render_type")) {
                                        initSDK.addTags("render_type", ac2.get("render_type"));
                                    } else {
                                        initSDK.addTags("render_type", "-2");
                                    }
                                    return ac2;
                                }
                            });
                            if (CJ2.VnT()) {
                                initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so"});
                            }
                            initSDK.config().setDeviceId(Qhi2);
                            initSDK.setReportUrl(zn2);
                            initSDK.addTags("host_appid", ApmHelper.f8460ac);
                            initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            initSDK.config().setChannel(ApmHelper.fl());
                            cJ unused3 = ApmHelper.Tgh = new cJ() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.cJ
                                public void Qhi(String str, String str2, Throwable th2) {
                                    initSDK.reportCustomErr(str, str2, th2);
                                }
                            };
                            boolean unused4 = ApmHelper.Qhi = true;
                            ApmHelper.ac(Qhi2, zn2);
                            initSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.apm.insight.ICrashCallback
                                public void onCrash(CrashType crashType, String str, Thread thread) {
                                    if (!ApmHelper.f8461fl) {
                                        ApmHelper.CJ(crashType.getName());
                                    }
                                    boolean unused5 = ApmHelper.f8461fl = true;
                                }
                            }, CrashType.ALL);
                            Qhi qhi = ApmHelper.ROR;
                            Qhi unused5 = ApmHelper.ROR = null;
                            if (qhi != null) {
                                ApmHelper.Tgh.Qhi(qhi.Qhi, qhi.cJ, qhi.f8462ac);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.Qhi = false;
                        }
                    }
                }
                ApmHelper.cJ.set(false);
            }
        });
    }

    public static boolean isIsInit() {
        return Qhi;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        cJ cJVar = Tgh;
        if (cJVar != null) {
            cJVar.Qhi(str, str2, th2);
        } else {
            ROR = new Qhi(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() {
        if (CJ) {
            cJ(zc.Qhi(HzH.Qhi()), HzH.CJ().zn());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void CJ(final String str) {
        final tP Qhi2 = com.bytedance.sdk.openadsdk.utils.cJ.Qhi();
        if (Qhi2 != null) {
            String Qhi3 = js.Qhi(Qhi2);
            if (TextUtils.isEmpty(Qhi3)) {
                return;
            }
            ac.Qhi(System.currentTimeMillis(), Qhi2, Qhi3, "sdk_crash_info", new com.bytedance.sdk.openadsdk.Gm.ac.Qhi() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.Gm.ac.Qhi
                public JSONObject Qhi() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", str);
                        jSONObject2.put("material", com.bytedance.sdk.component.utils.Qhi.Qhi(Qhi2.mZ()).toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (JSONException unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ac(String str, String str2) {
        cJ(str, str2);
    }

    private static JSONObject ac(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f8460ac);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", Gm());
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e10) {
            ABk.Qhi("ApmHelper", e10.getMessage());
        }
        return jSONObject;
    }

    private static void cJ(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String d10 = h.d("https://", str2, "/monitor/collect/c/session?version_code=6206&device_platform=android&aid=10000001");
        HzH.ac().Qhi(ac(str), d10);
    }
}
