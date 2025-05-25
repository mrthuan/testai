package com.bytedance.sdk.component.fl.Qhi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadPoolFactory.java */
/* loaded from: classes.dex */
public class ac {
    private static final TimeUnit Qhi = TimeUnit.SECONDS;

    public static ExecutorService Qhi() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, Qhi, new LinkedBlockingQueue(), new Qhi("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
