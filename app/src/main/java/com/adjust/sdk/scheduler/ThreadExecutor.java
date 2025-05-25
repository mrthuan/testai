package com.adjust.sdk.scheduler;

/* loaded from: classes.dex */
public interface ThreadExecutor {
    void submit(Runnable runnable);

    void teardown();
}
