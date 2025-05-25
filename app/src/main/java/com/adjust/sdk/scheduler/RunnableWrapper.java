package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;

/* loaded from: classes.dex */
public class RunnableWrapper implements Runnable {
    private Runnable runnable;

    public RunnableWrapper(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.runnable.run();
        } catch (Throwable th2) {
            AdjustFactory.getLogger().error("Runnable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
        }
    }
}
