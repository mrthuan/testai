package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.l.q;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.o;
import java.util.Map;

/* loaded from: classes.dex */
public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().b(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(attachUserData, crashType);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            i.b().a(map);
        }
    }

    public static void checkInnerNpth(boolean z10) {
        o.c(z10);
    }

    public static void dumpHprof(String str) {
        o.c(str);
    }

    public static void enableALogCollector(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        o.a(str, bVar, cVar);
    }

    public static void enableAnrInfo(boolean z10) {
        o.b(z10);
    }

    public static void enableLoopMonitor(boolean z10) {
        o.a(z10);
    }

    public static void enableNativeDump(boolean z10) {
        o.d(z10);
    }

    public static void enableThreadsBoost() {
        i.a(1);
    }

    public static ConfigManager getConfigManager() {
        return i.i();
    }

    public static boolean hasCrash() {
        return o.k();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return o.l();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return o.m();
    }

    public static synchronized void init(Application application, Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        synchronized (Npth.class) {
            if (sInit) {
                return;
            }
            sInit = true;
            o.a(application, context, true, true, true, true, j10);
            i.a(application, context, iCommonParams);
            Map<String, Object> a10 = i.a().a();
            int a11 = q.a(a10.get("update_version_code"), 0);
            int a12 = q.a(a10.get("aid"), 4444);
            MonitorCrash init = MonitorCrash.init(context, String.valueOf(a12), a11, String.valueOf(a10.get("app_version")));
            if (init != null) {
                init.config().setDeviceId(i.a().d()).setChannel(String.valueOf(a10.get("channel")));
            }
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            i.a(true);
            init(context, iCommonParams, true, false, true, true);
        }
    }

    public static boolean isANREnable() {
        return o.c();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return o.b();
    }

    public static boolean isNativeCrashEnable() {
        return o.d();
    }

    public static boolean isRunning() {
        return o.i();
    }

    public static boolean isStopUpload() {
        return o.n();
    }

    public static void openANRMonitor() {
        o.g();
    }

    public static void openJavaCrashMonitor() {
        o.f();
    }

    public static boolean openNativeCrashMonitor() {
        return o.h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        o.a(iOOMCallback);
    }

    public static void registerSdk(int i10, String str) {
        i.a(i10, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().b(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(crashType, attachUserData);
        }
    }

    public static void reportDartError(String str) {
        o.a(str);
    }

    @Deprecated
    public static void reportError(String str) {
        o.b(str);
    }

    public static void setAlogFlushAddr(long j10) {
        o.a(j10);
    }

    public static void setAlogFlushV2Addr(long j10) {
        o.b(j10);
    }

    public static void setAlogLogDirAddr(long j10) {
        o.c(j10);
    }

    public static void setAnrInfoFileObserver(String str, f fVar) {
        o.a(str, fVar);
    }

    public static void setApplication(Application application) {
        i.a(application);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(attachUserData, crashType);
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            i.a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        i.b().a(iCrashFilter);
    }

    public static void setCurProcessName(String str) {
        com.apm.insight.l.a.a(str);
    }

    public static void setEncryptImpl(e eVar) {
        o.a(eVar);
    }

    public static void setLogcatImpl(com.apm.insight.runtime.j jVar) {
        o.a(jVar);
    }

    public static void setRequestIntercept(com.apm.insight.k.h hVar) {
        o.a(hVar);
    }

    public static void stopAnr() {
        o.j();
    }

    public static void stopUpload() {
        o.o();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        o.a(iOOMCallback, crashType);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            init(context, iCommonParams, true, false, false);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i10, String str) {
        synchronized (Npth.class) {
            i.a(true);
            i.b(i10, str);
            init(context, iCommonParams, true, true, true, true);
        }
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, g gVar) {
        o.a(str, map, map2, gVar);
    }

    @Deprecated
    public static void reportError(Throwable th2) {
        o.a(th2);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z10, z10, z11, z12);
        }
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, g gVar) {
        o.a(str, map, map2, map3, gVar);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12, boolean z13) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z10, z11, z12, z13, 0L);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        Application application;
        Context context2 = context;
        synchronized (Npth.class) {
            if (i.h() != null) {
                application = i.h();
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
            } else {
                application = (Application) context.getApplicationContext();
                if (application == null) {
                    throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (application.getBaseContext() != null) {
                    context2 = application.getBaseContext();
                }
            }
            init(application, context2, iCommonParams, z10, z11, z12, z13, j10);
        }
    }

    public static void setAlogWriteAddr(long j10) {
    }
}
