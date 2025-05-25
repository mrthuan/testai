package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.ABk.cJ;
import com.bytedance.sdk.openadsdk.ABk.cJ.Qhi;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class BusMonitorDependWrapper implements cJ {
    private cJ Qhi;
    private Handler cJ;

    public BusMonitorDependWrapper(cJ cJVar) {
        this.Qhi = cJVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public Context getContext() {
        cJ cJVar = this.Qhi;
        if (cJVar != null && cJVar.getContext() != null) {
            return this.Qhi.getContext();
        }
        return getReflectContext();
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public ExecutorService getExecutorService() {
        cJ cJVar = this.Qhi;
        if (cJVar != null && cJVar.getExecutorService() != null) {
            return this.Qhi.getExecutorService();
        }
        return Executors.newFixedThreadPool(2);
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public Handler getHandler() {
        cJ cJVar = this.Qhi;
        if (cJVar != null && cJVar.getHandler() != null) {
            return this.Qhi.getHandler();
        }
        if (this.cJ == null) {
            HandlerThread handlerThread = new HandlerThread("pag_monitor");
            handlerThread.start();
            this.cJ = new Handler(handlerThread.getLooper());
        }
        return this.cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public int getOnceLogCount() {
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public int getOnceLogInterval() {
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        cJ cJVar = this.Qhi;
        if (cJVar == null || (uploadIntervalTime = cJVar.getUploadIntervalTime()) < 1800000) {
            return Constants.THIRTY_MINUTES;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public boolean isMonitorOpen() {
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.cJ
    public void onMonitorUpload(List<Qhi> list) {
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.onMonitorUpload(list);
        }
    }
}
