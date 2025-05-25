package com.bytedance.sdk.openadsdk.api.init;

import a1.b;
import a1.d;
import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.adsdk.ugeno.cJ.fl;
import com.bytedance.sdk.component.Sf.Tgh;
import com.bytedance.sdk.component.Sf.WAv;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.adexpress.Qhi.cJ.ROR;
import com.bytedance.sdk.component.cJ;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ABk.ac;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.HzH.Qhi;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Sf;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.core.Eh;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Gm;
import com.bytedance.sdk.openadsdk.core.pA;
import com.bytedance.sdk.openadsdk.core.settings.ABk;
import com.bytedance.sdk.openadsdk.tP.Qhi;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.hpZ;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.kYc;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long Qhi;

    /* loaded from: classes.dex */
    public interface PAGInitCallback {
        void fail(int i10, String str);

        void success();
    }

    static {
        try {
            cJ.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
                @Override // com.bytedance.sdk.component.cJ.Qhi
                public ExecutorService getExecutorService() {
                    return lG.CJ();
                }
            });
            lG.Qhi(new hm("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInitHelper.initAPM();
                    PAGInitHelper.initMemoryData();
                }
            });
            iMK.Qhi(System.currentTimeMillis());
            iMK.cJ();
            SSWebView.setWebViewProvider(new SSWebView.ac() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // com.bytedance.sdk.component.widget.SSWebView.ac
                public WebView createWebView(Context context, AttributeSet attributeSet, int i10) {
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        if (i10 == 0) {
                            return new PangleWebView(context, attributeSet);
                        }
                        return new PangleWebView(context, attributeSet, i10);
                    } catch (Exception unused) {
                        if (i10 == 0) {
                            return new PangleWebView(context, attributeSet);
                        }
                        return new PangleWebView(context, attributeSet, i10);
                    }
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
        Qhi = 0L;
    }

    private static void CJ(Context context, InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            MQ.Qhi(initConfig.getPackageName());
            fl.Qhi(initConfig.getPackageName());
        } else {
            MQ.Qhi((String) null);
            fl.Qhi((String) null);
        }
        HzH.cJ(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.cJ.Qhi();
        } else {
            com.bytedance.sdk.openadsdk.multipro.cJ.cJ();
        }
        Gm.Qhi();
        com.bytedance.sdk.openadsdk.core.ugen.cJ.Qhi(context);
    }

    private static void Tgh(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        lG.Qhi(new hm("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // java.lang.Runnable
            public void run() {
                iMK.Qhi(initConfig.getData());
                Qhi.Qhi(context, initConfig.getAppId());
                Qhi.Qhi();
                ac.Qhi();
                ac.cJ();
                new com.bytedance.sdk.openadsdk.utils.iMK();
                ROR.Qhi(kYc.Qhi() * 10);
                com.bytedance.sdk.openadsdk.cJ.Qhi.fl.Qhi(context, initConfig.isSupportMultiProcess());
                pA.Qhi().cJ();
                com.bytedance.sdk.openadsdk.core.fl.ac.Qhi();
                com.bytedance.sdk.openadsdk.tP.Qhi.Qhi(new Qhi.InterfaceC0137Qhi() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.1
                    public void onGdprChanged(int i10) {
                        PAGConfig.setGDPRConsent(i10);
                    }
                });
                com.bytedance.sdk.openadsdk.core.settings.HzH.Qhi = com.bytedance.sdk.openadsdk.core.settings.HzH.ac(context);
                Sf.cJ();
                com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi(HzH.CJ().pv());
                com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi(CacheDirFactory.getICacheDir(0));
                com.bytedance.sdk.openadsdk.core.settings.ROR CJ = HzH.CJ();
                if (!CJ.Dq()) {
                    synchronized (CJ) {
                        if (!CJ.Dq()) {
                            CJ.cJ();
                            CJ.sDy();
                        }
                    }
                }
                DeviceUtils.WAv();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                com.bytedance.sdk.component.Sf.ROR.Qhi(true);
                com.bytedance.sdk.component.Sf.ROR.Qhi(new com.bytedance.sdk.openadsdk.Gm.cJ.Qhi());
                DeviceUtils.Qhi(context);
                DeviceUtils.WAv(context);
                DeviceUtils.Gm(context);
                com.bytedance.sdk.openadsdk.Gm.Qhi.Qhi();
                com.bytedance.sdk.openadsdk.core.settings.fl.Qhi();
                com.bytedance.sdk.openadsdk.Gm.ac.CJ();
                js.ABk(context);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi();
                PAGSdk.ac();
                com.bytedance.sdk.openadsdk.core.fl.ac.cJ();
                com.bytedance.sdk.component.Sf.ac.ac.Qhi(iMK.cJ());
            }
        });
    }

    private static void ac(Context context, InitConfig initConfig) {
        iMK.Qhi = true;
        Eh.Qhi().Qhi(initConfig.getAppId()).cJ(initConfig.getCoppa()).ac(initConfig.getGdpr()).CJ(initConfig.getCcpa()).Tgh(initConfig.getAppIconId()).Qhi(initConfig.getTitleBarTheme());
        com.bytedance.sdk.openadsdk.core.hm.bxS();
        if (initConfig instanceof PAGConfig) {
            Eh.Qhi().fl(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (cJ(initConfig)) {
                Eh.Qhi().Qhi();
                hpZ.Qhi();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.Sf.Qhi();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback == null || iMK.CJ() != 0) {
            return;
        }
        PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.multipro.ac.Qhi();
    }

    private static void fl(Context context, InitConfig initConfig) {
        if (!ABk.Qhi()) {
            return;
        }
        com.bytedance.sdk.component.Sf.ROR.ac(-1);
        Tgh.Qhi(new com.bytedance.sdk.component.Sf.Gm() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
            @Override // com.bytedance.sdk.component.Sf.Gm
            public WAv createThreadFactory(int i10, String str) {
                return new WAv(i10, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                    @Override // com.bytedance.sdk.component.Sf.WAv, java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        int Ri = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Ri();
                        if (Ri >= -524288 && Ri < 0) {
                            Thread thread = new Thread(this.Qhi, runnable, this.cJ, Ri);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i11 = this.f8033ac;
                            if (i11 > 10 || i11 <= 0) {
                                this.f8033ac = 5;
                            }
                            thread.setPriority(this.f8033ac);
                            return thread;
                        }
                        return super.newThread(runnable);
                    }
                };
            }
        });
        com.bytedance.sdk.openadsdk.multipro.ac.Qhi(context);
        com.bytedance.sdk.component.ROR.ac.Qhi.Qhi(new com.bytedance.sdk.component.ROR.ac.ac() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
            @Override // com.bytedance.sdk.component.ROR.ac.ac
            public ExecutorService getThreadPool() {
                return lG.CJ();
            }
        });
        com.bytedance.sdk.openadsdk.fl.cJ.ac();
        iMK.cJ.set(true);
        try {
            com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Qhi(new com.bytedance.sdk.openadsdk.ROR.Qhi());
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.PAGSdk", e10.getMessage());
        }
        ac(initConfig);
        ac(context, initConfig);
        com.bykv.vk.openvk.component.video.api.ac.Qhi(context, null);
        com.bykv.vk.openvk.component.video.api.ac.Qhi(2);
        com.bykv.vk.openvk.component.video.api.ac.Qhi(initConfig.isSupportMultiProcess());
        com.bykv.vk.openvk.component.video.api.ac.Qhi(com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().fl());
    }

    public static String getApplicationName(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getBiddingToken(Context context, String str) {
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            return null;
        }
        HzH.cJ(context);
        return getBiddingToken(str);
    }

    public static String getSDKVersion() {
        if (Eh.Qhi() != null) {
            return Eh.Qhi().CJ();
        }
        return "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.cJ(context, pAGConfig, pAGInitCallback);
            }
        });
        iMK.ROR();
    }

    public static boolean isInitSuccess() {
        if (iMK.CJ() == 1) {
            return true;
        }
        return false;
    }

    public static boolean onlyVerityPlayable(String str, int i10, String str2, String str3, String str4) {
        if (Eh.Qhi() != null) {
            return Eh.Qhi().Qhi(str, i10, str2, str3, str4);
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (!TextUtils.isEmpty(str)) {
            MQ.Qhi(str);
            fl.Qhi(str);
        }
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && HzH.CJ().tP() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z10) {
        com.bytedance.sdk.openadsdk.common.ac.Qhi(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        Qhi = SystemClock.elapsedRealtime();
        HzH.cJ(context);
        if (pAGInitCallback != null) {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (iMK.CJ() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            cJ(-1, "DisableSDK is called, interrupt initialization");
        } else if (isInitSuccess()) {
            CJ();
        } else {
            iMK.Qhi(3);
            if (context == null) {
                cJ(4000, "Context is null, please check. ");
                return;
            }
            if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            if (initConfig == null) {
                cJ(4000, "PAGConfig is null, please check.");
                return;
            }
            CJ(context, initConfig);
            ApmHelper.initApm(context, initConfig);
            try {
                com.bytedance.sdk.openadsdk.core.hm.Qhi(new com.bytedance.sdk.openadsdk.core.ABk() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                    @Override // com.bytedance.sdk.openadsdk.core.ABk
                    public void fail(int i10, String str) {
                        PAGSdk.cJ(i10, str);
                    }

                    public void success() {
                        PAGSdk.CJ();
                    }
                });
                try {
                    MQ.Qhi(HzH.Qhi(), "tt_ad_logo_txt");
                    if (MQ.CJ(context, "tt_ad_logo") == 0) {
                        Qhi(initConfig, pAGInitCallback);
                    } else if (isInitSuccess()) {
                        if (pAGInitCallback != null) {
                            CJ();
                        }
                    } else {
                        final com.bytedance.sdk.openadsdk.ac.Qhi qhi = new com.bytedance.sdk.openadsdk.ac.Qhi();
                        SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                            @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                            public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                                return com.bytedance.sdk.openadsdk.ac.Qhi.this;
                            }
                        });
                        if (!initConfig.isSupportMultiProcess()) {
                            cJ(context, initConfig);
                            return;
                        }
                        com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().Qhi(new com.bytedance.sdk.openadsdk.multipro.aidl.cJ() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                            @Override // com.bytedance.sdk.openadsdk.multipro.aidl.cJ
                            public void onServiceConnected() {
                                iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                        PAGSdk.cJ(context, initConfig);
                                    }
                                });
                            }
                        });
                        com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().ac();
                    }
                } catch (Throwable unused) {
                    Qhi(initConfig, pAGInitCallback);
                }
            } catch (Throwable unused2) {
                cJ(4000, "Internal Error, setting exception. ");
            }
        }
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            lG.fl(new hm("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.14
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                }
            });
        }
    }

    private static void Qhi(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        iMK.Qhi(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                cJ(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                cJ(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            lG.fl(new hm("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.15
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                }
            });
        }
    }

    private static void Qhi(final Context context, final boolean z10, final InitConfig initConfig, final long j10, final long j11) {
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean ac2 = com.bytedance.sdk.openadsdk.core.hm.cJ().ac();
                    jSONObject.put("duration", j10);
                    jSONObject.put("sdk_init_time", j11);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.cJ(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", ac2);
                    jSONObject.put("minSdkVersion", js.Gm(context));
                    jSONObject.put("targetSdkVersion", js.WAv(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z10);
                    com.bytedance.sdk.openadsdk.core.hm.cJ().cJ(false);
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.PAGSdk", "run: ", e10);
                }
                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("pangle_sdk_init").cJ(jSONObject.toString());
            }
        });
    }

    public static String getBiddingToken(String str) {
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            return null;
        }
        return (HzH.Qhi() == null || Eh.Qhi() == null) ? "" : Eh.Qhi().ac(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void CJ() {
        iMK.Qhi(1);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                Iterator<PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.success();
                    }
                }
            }
            ac.cJ(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
                @Override // com.bytedance.sdk.openadsdk.ABk.fl
                public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                    com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                    qhi.cJ("init");
                    return qhi;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
        }
    }

    public static String getBiddingToken(Context context) {
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            return null;
        }
        HzH.cJ(context);
        return getBiddingToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ac() {
        ShortcutManager c;
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context Qhi2 = HzH.Qhi();
                if (Qhi2 == null || (c = d.c(Qhi2.getSystemService(b.a()))) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.hm cJ = com.bytedance.sdk.openadsdk.core.hm.cJ();
                isRequestPinShortcutSupported = c.isRequestPinShortcutSupported();
                cJ.Qhi(isRequestPinShortcutSupported);
            } catch (Throwable unused) {
            }
        }
    }

    public static String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            return null;
        }
        return (HzH.Qhi() == null || Eh.Qhi() == null) ? "" : Eh.Qhi().fl();
    }

    private static void ac(InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.hm.cJ().ac(initConfig.getData());
        }
        com.bytedance.sdk.openadsdk.core.hm.cJ().ac(cJ(initConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(Context context, InitConfig initConfig) {
        long elapsedRealtime;
        try {
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.PAGSdk", th2.getMessage());
            cJ(4000, th2.getMessage());
            elapsedRealtime = SystemClock.elapsedRealtime() - Qhi;
        }
        if (isInitSuccess()) {
            CJ();
            return;
        }
        fl(context, initConfig);
        com.bytedance.sdk.openadsdk.core.settings.HzH.YD().EBS();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - Qhi;
        CJ();
        Tgh(context, initConfig);
        elapsedRealtime = elapsedRealtime2;
        Qhi(context, isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - Qhi, elapsedRealtime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean cJ(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(int i10, String str) {
        iMK.Qhi(2);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                Iterator<PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.fail(i10, str);
                    }
                }
                ac.ac(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
                    @Override // com.bytedance.sdk.openadsdk.ABk.fl
                    public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                        com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                        qhi.cJ("init");
                        return qhi;
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
        }
    }
}
