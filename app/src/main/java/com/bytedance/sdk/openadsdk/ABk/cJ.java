package com.bytedance.sdk.openadsdk.ABk;

import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: BusMonitorDepend.java */
/* loaded from: classes.dex */
public interface cJ {
    Context getContext();

    ExecutorService getExecutorService();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.ABk.cJ.Qhi> list);
}
