package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.Util;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class TimerOnce {
    private Runnable command;
    private ILogger logger = AdjustFactory.getLogger();
    private String name;
    private FutureScheduler scheduler;
    private ScheduledFuture waitingTask;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TimerOnce.this.logger.verbose("%s fired", TimerOnce.this.name);
            TimerOnce.this.command.run();
            TimerOnce.this.waitingTask = null;
        }
    }

    public TimerOnce(Runnable runnable, String str) {
        this.name = str;
        this.scheduler = new SingleThreadFutureScheduler(str, true);
        this.command = runnable;
    }

    public void cancel() {
        cancel(false);
    }

    public long getFireIn() {
        ScheduledFuture scheduledFuture = this.waitingTask;
        if (scheduledFuture == null) {
            return 0L;
        }
        return scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
    }

    public void startIn(long j10) {
        cancel(false);
        this.logger.verbose("%s starting. Launching in %s seconds", this.name, Util.SecondsDisplayFormat.format(j10 / 1000.0d));
        this.waitingTask = this.scheduler.scheduleFuture(new a(), j10);
    }

    public void teardown() {
        cancel(true);
        FutureScheduler futureScheduler = this.scheduler;
        if (futureScheduler != null) {
            futureScheduler.teardown();
        }
        this.scheduler = null;
    }

    private void cancel(boolean z10) {
        ScheduledFuture scheduledFuture = this.waitingTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z10);
        }
        this.waitingTask = null;
        this.logger.verbose("%s canceled", this.name);
    }
}
