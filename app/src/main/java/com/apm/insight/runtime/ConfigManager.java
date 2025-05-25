package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes.dex */
public class ConfigManager {
    public static final long BLOCK_MONITOR_INTERVAL = 1000;
    private static final long BLOCK_MONITOR_MIN_INTERVAL = 10;
    public static final String CONFIG_URL_SUFFIX = "/settings/get";
    public static final String EXCEPTION_URL_SUFFIX = "/monitor/collect/c/exception";
    public static final String JAVA_URL_SUFFIX = "/monitor/collect/c/crash";
    private static final long LAUNCH_CRASH_INTERVAL = 8000;
    public static final String LAUNCH_URL_SUFFIX = "/monitor/collect/c/exception/dump_collection";
    public static final String LOG_TYPE_ALL_STACK = "npth_enable_all_thread_stack";
    public static final String NATIVE_URL_SUFFIX = "/monitor/collect/c/native_bin_crash";
    private ThreadPoolExecutor mThreadPoolExecutor;
    private boolean reportErrorEnable = true;
    private String mNativeMemUrl = "";
    private String mCoreDumpUrl = "";
    private String mJavaCrashUploadUrl = "";
    private String mLaunchCrashUploadUrl = "";
    private String mExceptionUploadUrl = "";
    private String mConfigUrl = "";
    private String mNativeCrashUploadUrl = "";
    private String mAlogUploadUrl = "";
    private String mAsanReportUploadUrl = "";
    private long mLaunchCrashInterval = LAUNCH_CRASH_INTERVAL;
    private com.apm.insight.e mEncryptImpl = new com.apm.insight.e() { // from class: com.apm.insight.runtime.ConfigManager.1
        @Override // com.apm.insight.e
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    };
    private int mLogcatDumpCount = 512;
    private int mLogcatLevel = 1;
    private boolean mNativeCrashMiniDump = true;
    private boolean mEnsureEnable = true;
    private boolean mEnsureWithLogcat = false;
    private long mBlockMonitorInterval = 1000;
    private boolean mBlockMonitorEnable = false;
    private boolean mIsDebugMode = false;

    public static void setDefaultCommonParams(ICommonParams iCommonParams, Context context) {
        com.apm.insight.i.a(new d(context, iCommonParams));
    }

    public static void updateDid(final String str) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.ConfigManager.2
            @Override // java.lang.Runnable
            public void run() {
                com.apm.insight.i.c().a(str);
                com.apm.insight.j.b.d();
            }
        });
    }

    public String getAlogUploadUrl() {
        return this.mAlogUploadUrl;
    }

    public String getAsanReportUploadUrl() {
        return this.mAsanReportUploadUrl;
    }

    public long getBlockInterval() {
        return this.mBlockMonitorInterval;
    }

    public String getConfigUrl() {
        return this.mConfigUrl;
    }

    public String getCoreDumpUrl() {
        return this.mCoreDumpUrl;
    }

    public com.apm.insight.e getEncryptImpl() {
        return this.mEncryptImpl;
    }

    public String getExceptionUploadUrl() {
        return this.mExceptionUploadUrl;
    }

    public Set<String> getFilterThreadSet() {
        return com.apm.insight.l.i.a();
    }

    public String getJavaCrashUploadUrl() {
        return this.mJavaCrashUploadUrl;
    }

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public String getLaunchCrashUploadUrl() {
        return this.mLaunchCrashUploadUrl;
    }

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public String getNativeCrashUploadUrl() {
        return this.mNativeCrashUploadUrl;
    }

    public String getNativeMemUrl() {
        return this.mNativeMemUrl;
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isApmExists() {
        return com.apm.insight.k.a.c();
    }

    public boolean isBlockMonitorEnable() {
        return this.mBlockMonitorEnable;
    }

    public boolean isCrashIgnored(final String str) {
        try {
            f fVar = new f() { // from class: com.apm.insight.runtime.ConfigManager.3
                @Override // com.apm.insight.runtime.f
                public Object a(String str2) {
                    if (str2.equals("md5")) {
                        return str;
                    }
                    return super.a(str2);
                }
            };
            if (n.a("java_crash_ignore", fVar)) {
                return true;
            }
            if (com.apm.insight.l.o.b(com.apm.insight.i.g())) {
                com.apm.insight.k.a.d();
                return n.a("java_crash_ignore", fVar);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isDebugMode() {
        return this.mIsDebugMode;
    }

    public boolean isEnsureEnable() {
        return this.mEnsureEnable;
    }

    public boolean isEnsureWithLogcat() {
        return this.mEnsureWithLogcat;
    }

    public boolean isNativeCrashMiniDump() {
        return this.mNativeCrashMiniDump;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    public void setAlogUploadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mAlogUploadUrl = str;
    }

    public void setBlockMonitorEnable(boolean z10) {
        this.mBlockMonitorEnable = z10;
    }

    public void setBlockMonitorInterval(long j10) {
        this.mBlockMonitorInterval = j10;
    }

    public void setConfigUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mConfigUrl = str;
    }

    public void setCurrentProcessName(String str) {
        com.apm.insight.l.a.a(str);
    }

    public void setDebugMode(boolean z10) {
        this.mIsDebugMode = z10;
    }

    public void setEncryptImpl(com.apm.insight.e eVar) {
        if (eVar != null) {
            this.mEncryptImpl = eVar;
        }
    }

    public void setEnsureEnable(boolean z10) {
        this.mEnsureEnable = z10;
    }

    public void setEnsureWithLogcat(boolean z10) {
        this.mEnsureWithLogcat = z10;
    }

    public void setJavaCrashUploadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mJavaCrashUploadUrl = str;
    }

    public void setLaunchCrashInterval(long j10) {
        if (j10 > 0) {
            this.mLaunchCrashInterval = j10;
        }
    }

    public void setLaunchCrashUrl(String str) {
        int indexOf;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mExceptionUploadUrl = str;
        if (str.indexOf("//") == -1) {
            str2 = str.substring(0, str.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) + 1) + "monitor/collect/c/exception/dump_collection";
        } else {
            str2 = str.substring(0, str.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING, indexOf + 2) + 1) + "monitor/collect/c/exception/dump_collection";
        }
        this.mLaunchCrashUploadUrl = str2;
    }

    public void setLogcatDumpCount(int i10) {
        if (i10 > 0) {
            this.mLogcatDumpCount = i10;
        }
    }

    public void setLogcatLevel(int i10) {
        if (i10 >= 0 && i10 <= 4) {
            this.mLogcatLevel = i10;
        }
    }

    public void setNativeCrashUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mNativeCrashUploadUrl = str;
    }

    public void setReportErrorEnable(boolean z10) {
        this.reportErrorEnable = z10;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.mThreadPoolExecutor = threadPoolExecutor;
    }
}
