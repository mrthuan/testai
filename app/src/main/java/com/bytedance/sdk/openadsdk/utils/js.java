package com.bytedance.sdk.openadsdk.utils;

import a0.a;
import a6.h;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.common.ArbitrageLoadingLayout;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ToolUtils.java */
/* loaded from: classes.dex */
public class js {
    private static final HashSet<String> Gm;
    public static Integer Qhi;
    private static final ExecutorService cJ = Executors.newSingleThreadExecutor();

    /* renamed from: ac  reason: collision with root package name */
    private static volatile boolean f9387ac = false;
    private static final AtomicInteger CJ = new AtomicInteger(0);

    /* renamed from: fl  reason: collision with root package name */
    private static volatile String f9388fl = "";
    private static final ReentrantLock Tgh = new ReentrantLock();
    private static String ROR = null;
    private static String Sf = null;

    /* renamed from: hm  reason: collision with root package name */
    private static String f9389hm = null;
    private static final HashSet<String> WAv = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* compiled from: ToolUtils.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.js$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(js.f9388fl)) {
                    SSWebView sSWebView = new SSWebView(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
                    sSWebView.setWebViewClient(new SSWebView.Qhi());
                    String unused = js.f9388fl = sSWebView.getUserAgentString();
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", "", e10);
            } catch (NoClassDefFoundError e11) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", "", e11);
            }
        }
    }

    /* compiled from: ToolUtils.java */
    /* loaded from: classes.dex */
    public static class Qhi implements Callable<String> {
        private final int Qhi;

        public Qhi(int i10) {
            this.Qhi = i10;
        }

        private synchronized String ac() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.js.Qhi.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = js.qMt();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", e10.getMessage());
            }
            return strArr[0];
        }

        private String cJ() {
            String str;
            Throwable th2;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                                com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                com.bytedance.sdk.openadsdk.core.ac.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi()).Qhi("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.bytedance.sdk.component.utils.ABk.Qhi("getUA", "e:" + th2.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th4) {
                str = "unKnow";
                th2 = th4;
            }
            return str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: Qhi */
        public synchronized String call() {
            String str;
            str = "unKnow";
            int i10 = this.Qhi;
            if (i10 == 1) {
                str = ac();
            } else if (i10 == 2) {
                str = cJ();
            }
            return str;
        }
    }

    /* compiled from: ToolUtils.java */
    /* loaded from: classes.dex */
    public static class cJ {
        public final ComponentName Qhi;
        public final int cJ;

        public cJ(ComponentName componentName, int i10) {
            this.Qhi = componentName;
            this.cJ = i10;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        Gm = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        Qhi = null;
    }

    public static String ABk() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static boolean CJ(int i10) {
        return i10 == 4;
    }

    private static boolean Dww() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int HzH() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String Qhi(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                return null;
                            }
                            return "rewarded_video";
                        }
                        return "fullscreen_interstitial_ad";
                    }
                    return "open_ad";
                }
                return "interaction";
            }
            return "banner_ad";
        }
        return "embeded_ad";
    }

    public static int ROR(int i10) {
        if (i10 != 1) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        return i10;
                    }
                    return 5;
                }
                return 4;
            }
            return 1;
        }
        return 0;
    }

    public static String Sf() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) com.bytedance.sdk.openadsdk.core.HzH.Qhi().getSystemService("activity")).getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean Tgh(int i10) {
        return i10 == 6;
    }

    public static long WAv() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String ac(int i10) {
        return i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 == 4) ? "open_ad" : i10 != 7 ? i10 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    private static String bxS() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            webView.setWebViewClient(new SSWebView.Qhi());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                    com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.ac.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi()).Qhi("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("getUA", "e:" + th2.getMessage());
            return "unKnow";
        }
    }

    public static String cJ(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 7 ? "unknow" : "rewarded_video_landingpage" : "fullscreen_interstitial_ad" : "splash_ad_landingpage" : "interaction_landingpage" : "banner_ad_landingpage" : "embeded_ad_landingpage";
    }

    public static boolean fl(int i10) {
        return i10 == 5;
    }

    public static String hm() {
        return ac("MemTotal");
    }

    public static int hpZ() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (WAv.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 != null && id2.startsWith("America/")) {
                if (!Gm.contains(id2)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", th2.toString());
            return 0;
        }
    }

    public static String iMK() {
        int hpZ = hpZ();
        return (hpZ == 1 || hpZ == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static String kYc() {
        int i10 = -HzH();
        if (i10 >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i10));
        }
        return "Etc/GMT".concat(String.valueOf(i10));
    }

    public static String pA() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static /* synthetic */ String qMt() {
        return bxS();
    }

    public static boolean tP() {
        if (CJ.get() == 1) {
            return true;
        }
        return false;
    }

    public static boolean zc() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void ABk(Context context) {
        try {
            AtomicInteger atomicInteger = CJ;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi().ac();
                return;
            }
            atomicInteger.set(2);
        } catch (Exception unused) {
            CJ.set(2);
        }
    }

    public static String CJ() {
        return bxS.Qhi();
    }

    public static long Gm() {
        try {
            if (Dww()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            }
            return 0L;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", th2.getMessage());
            return 0L;
        }
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, View view) {
    }

    public static synchronized String ROR() {
        String str;
        synchronized (js.class) {
            if (TextUtils.isEmpty(f9389hm) && com.bytedance.sdk.openadsdk.core.HzH.Qhi() != null) {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.HzH.Qhi().getPackageManager().getPackageInfo(fl(), 0);
                Sf = String.valueOf(packageInfo.versionCode);
                f9389hm = packageInfo.versionName;
            }
            str = f9389hm;
        }
        return str;
    }

    public static synchronized String Tgh() {
        String str;
        synchronized (js.class) {
            if (TextUtils.isEmpty(Sf) && com.bytedance.sdk.openadsdk.core.HzH.Qhi() != null) {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.HzH.Qhi().getPackageManager().getPackageInfo(fl(), 0);
                Sf = String.valueOf(packageInfo.versionCode);
                f9389hm = packageInfo.versionName;
            }
            str = Sf;
        }
        return str;
    }

    public static int ac(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean cJ(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static synchronized String fl() {
        String str;
        Context Qhi2;
        synchronized (js.class) {
            if (TextUtils.isEmpty(ROR) && (Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi()) != null) {
                ROR = Qhi2.getPackageName();
            }
            str = ROR;
        }
        return str;
    }

    public static boolean hm(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static int iMK(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Integer num = Qhi;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(queryIntentActivities.size());
        Qhi = valueOf;
        return valueOf.intValue();
    }

    private static String zc(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", Tgh()).toString();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", e10.getMessage());
            return str;
        }
    }

    public static long CJ(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("free_internal_storage", 0L).longValue();
    }

    public static String CJ(String str) {
        return Qhi(str, false);
    }

    public static Intent Qhi(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean hm(String str) {
        if (com.bytedance.sdk.openadsdk.core.iMK.fl()) {
            return true;
        }
        com.bytedance.sdk.component.utils.ABk.cJ("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static int WAv(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", th2.getMessage());
            return -1;
        }
    }

    public static boolean ac(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.cJ.Qhi(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static cJ cJ(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
            if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                return new cJ(new ComponentName(activityInfo.packageName, activityInfo.name), queryIntentActivities.size());
            }
            return new cJ(null, queryIntentActivities.size());
        }
        return new cJ(null, 0);
    }

    public static boolean Sf(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30);
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static long fl(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("total_sdcard_storage", 0L).longValue();
    }

    public static long Gm(Context context) {
        int i10 = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = context.getApplicationInfo().minSdkVersion;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", th2.getMessage());
        }
        return i10;
    }

    public static void WAv(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.ABk.cJ("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static String fl(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.HzH.CJ().js();
        }
        return TextUtils.isEmpty(str) ? hpZ() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/" : !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static int zc(Context context) {
        return ROR(com.bytedance.sdk.component.utils.bxS.Qhi(context, 0L));
    }

    public static boolean Qhi(Context context, Intent intent) {
        return ac(context, intent) > 0;
    }

    public static boolean Qhi() {
        return (com.bytedance.sdk.openadsdk.core.pA.Qhi() == null || com.bytedance.sdk.openadsdk.core.pA.Qhi().CJ()) ? false : true;
    }

    public static String ROR(Context context) {
        Locale locale;
        LocaleList locales;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static void Sf(final String str) {
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("reportMultiLog", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.utils.js.2
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                if (!js.f9387ac && com.bytedance.sdk.openadsdk.core.HzH.CJ().Hf()) {
                    boolean unused = js.f9387ac = true;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("reportMultiLog").cJ(jSONObject.toString());
                }
                return null;
            }
        });
    }

    public static int Tgh(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("is_root", -1);
    }

    public static String ac() {
        if (!TextUtils.isEmpty(f9388fl)) {
            return f9388fl;
        }
        com.bytedance.sdk.openadsdk.multipro.ac.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
        String Qhi2 = com.bytedance.sdk.openadsdk.core.hm.Qhi("sdk_local_web_ua", 86400000L);
        f9388fl = Qhi2;
        if (TextUtils.isEmpty(Qhi2)) {
            ReentrantLock reentrantLock = Tgh;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(f9388fl)) {
                            f9388fl = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
                        }
                        com.bytedance.sdk.openadsdk.core.hm.Qhi("sdk_local_web_ua", f9388fl);
                        reentrantLock.unlock();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", "", e10);
                        return f9388fl;
                    } catch (NoClassDefFoundError e11) {
                        com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", "", e11);
                        return f9388fl;
                    }
                }
            } finally {
                Tgh.unlock();
            }
        }
        return f9388fl;
    }

    public static String Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar == null) {
            return null;
        }
        try {
            return ac(tPVar.sqa());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean Sf(int i10) {
        if (i10 <= 0) {
            return false;
        }
        return i10 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i10;
    }

    public static boolean Tgh(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int Qhi(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c = 3;
                    break;
                }
                break;
            case 564365438:
                if (str.equals("cache_splash_ad")) {
                    c = 4;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 7;
            case 2:
            case 4:
                return 4;
            case 3:
                return 5;
            case 5:
                return 3;
            default:
                return 1;
        }
    }

    public static String cJ() {
        String cJ2;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.ac.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
        try {
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                cJ2 = com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                cJ2 = com.bytedance.sdk.openadsdk.core.ac.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi()).cJ("android_system_ua", "unKnow");
            }
        } catch (Exception unused) {
        }
        if (cJ2 == null || "unKnow".equals(cJ2)) {
            FutureTask futureTask = new FutureTask(new Qhi(2));
            cJ.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
            com.bytedance.sdk.component.utils.ABk.Qhi("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
            return str;
        }
        return cJ2;
    }

    public static String Qhi(Context context) {
        String cJ2 = com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("total_memory", (String) null);
        if (cJ2 == null || cJ(cJ2) <= 0) {
            cJ2 = ac("MemTotal");
            if (cJ(cJ2) <= 0) {
                cJ2 = Sf();
            }
            com.bytedance.sdk.openadsdk.core.ac.Qhi(context).Qhi("total_memory", cJ2);
        }
        return cJ2;
    }

    public static String ROR(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static String Qhi(String str, boolean z10) {
        String h10;
        String Jma = com.bytedance.sdk.openadsdk.core.HzH.CJ().Jma();
        if (TextUtils.isEmpty(Jma)) {
            int hpZ = hpZ();
            if (hpZ == 1) {
                h10 = a.h("https://pangolin16.sgsnssdk.com", str);
            } else if (hpZ == 2) {
                h10 = a.h("https://pangolin16.sgsnssdk.com", str);
            } else {
                h10 = a.h("https://pangolin16.isnssdk.com", str);
            }
            if (!z10) {
                return lB.Qhi(h10);
            }
            return zc(h10);
        }
        String d10 = h.d("https://", Jma, str);
        if (lB.Qhi() && !z10) {
            d10 = lB.Qhi(d10);
        }
        return z10 ? zc(d10) : d10;
    }

    public static long cJ(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String ac(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", th.getMessage());
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    }
                } while (!readLine.contains(str));
                if (readLine == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused5) {
                    }
                    return null;
                }
                String str2 = readLine.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused6) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused7) {
                }
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static String cJ(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("total_memory", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
    }

    public static boolean cJ(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar == null) {
            return true;
        }
        int cJ2 = com.bytedance.sdk.openadsdk.core.HzH.CJ().cJ(tPVar.Hy());
        int ac2 = com.bytedance.sdk.component.utils.hpZ.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
        if (cJ2 != 1) {
            if (cJ2 == 2) {
                return fl(ac2) || CJ(ac2) || Tgh(ac2);
            } else if (cJ2 != 3) {
                return cJ2 != 5 || CJ(ac2) || Tgh(ac2);
            } else {
                return false;
            }
        }
        return CJ(ac2);
    }

    public static long ac(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("total_internal_storage", 0L).longValue();
    }

    public static JSONObject Qhi(boolean z10, com.bytedance.sdk.openadsdk.core.model.tP tPVar, long j10, long j11, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", tPVar.HLI());
            jSONObject.put("load_time", j10);
            com.bykv.vk.openvk.component.video.api.ac.cJ FQ = tPVar.FQ();
            if (FQ != null) {
                jSONObject.put("video_size", FQ.fl());
                jSONObject.put("video_resolution", FQ.hm());
            }
            if (!z10) {
                jSONObject.put("error_code", j11);
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                jSONObject.put("error_message", str);
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", "getVideoDownload json error", e10);
        }
        return jSONObject;
    }

    public static JSONObject Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, long j10, com.bykv.vk.openvk.component.video.api.Qhi qhi) {
        if (tPVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", tPVar.HLI());
            jSONObject.put("buffers_time", j10);
            com.bykv.vk.openvk.component.video.api.ac.cJ FQ = tPVar.FQ();
            if (FQ != null) {
                jSONObject.put("video_size", FQ.fl());
                jSONObject.put("video_resolution", FQ.hm());
            }
            Qhi(jSONObject, qhi);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", "getVideoAction json error", e10);
        }
        return jSONObject;
    }

    private static void Qhi(JSONObject jSONObject, com.bykv.vk.openvk.component.video.api.Qhi qhi) {
        if (jSONObject.has("video_resolution") || qhi == null) {
            return;
        }
        try {
            jSONObject.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(qhi.CJ()), Integer.valueOf(qhi.fl())));
        } catch (Throwable unused) {
        }
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str) {
        if (tPVar != null) {
            try {
                String YB = tPVar.YB();
                if (TextUtils.isEmpty(YB) && tPVar.ReL() != null && tPVar.ReL().ac() == 1 && !TextUtils.isEmpty(tPVar.ReL().cJ())) {
                    YB = tPVar.ReL().cJ();
                }
                String str2 = YB;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.lB.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), str2, tPVar, Qhi(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void Qhi(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !hm(context)) {
            return;
        }
        int length = str2.length();
        int i11 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i12 = 3572;
        int i13 = 0;
        while (i11 <= i10) {
            if (i12 < length) {
                str2.substring(i13, i12);
                i11++;
                i13 = i12;
                i12 += 3572;
            } else {
                str2.substring(i13);
                return;
            }
        }
    }

    public static void Qhi(StringBuilder sb2, String str, String str2) {
        int indexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (indexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(indexOf, str.length() + indexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.cJ Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, SSWebView sSWebView, Context context, String str) {
        int MND = tPVar.MND();
        if (tPVar.jPH() && (MND == 1 || MND == 3)) {
            sSWebView.Qhi(true, (View) new ArbitrageLoadingLayout(context));
            return new com.bytedance.sdk.openadsdk.common.cJ(tPVar, sSWebView, str, false);
        }
        return null;
    }

    public static void Qhi(JSONObject jSONObject) {
        int intValue;
        try {
            Pair<String, Long> CJ2 = com.bytedance.sdk.openadsdk.core.hm.CJ("oem_store");
            int i10 = -1;
            if (CJ2 != null && ((intValue = Integer.valueOf((String) CJ2.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) CJ2.second).longValue() < com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("oem_store_state_time", 259200000))) {
                i10 = intValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.ToolUtils", th2.getMessage());
        }
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, SSWebView sSWebView) {
        com.bytedance.sdk.openadsdk.core.model.Tgh WAv2;
        if (tPVar == null || sSWebView == null) {
            return;
        }
        int MND = tPVar.MND();
        if (tPVar.jPH()) {
            if ((MND == 2 || MND == 3) && (WAv2 = tPVar.WAv()) != null) {
                sSWebView.Qhi(true, WAv2.cJ(), WAv2.ac(), WAv2.CJ(), WAv2.fl(), WAv2.Qhi());
            }
        }
    }
}
