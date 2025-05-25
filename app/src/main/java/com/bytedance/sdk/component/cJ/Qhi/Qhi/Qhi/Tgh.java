package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NetDispatcher.java */
/* loaded from: classes.dex */
public class Tgh extends com.bytedance.sdk.component.cJ.Qhi.fl {
    private ExecutorService Qhi;
    private List<com.bytedance.sdk.component.cJ.Qhi.cJ> cJ = new CopyOnWriteArrayList();

    /* renamed from: ac  reason: collision with root package name */
    private List<com.bytedance.sdk.component.cJ.Qhi.cJ> f8341ac = new CopyOnWriteArrayList();
    private AtomicInteger CJ = new AtomicInteger(64);

    public Tgh() {
        if (this.Qhi == null) {
            this.Qhi = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.Tgh.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public List<com.bytedance.sdk.component.cJ.Qhi.cJ> CJ() {
        return this.f8341ac;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public void Qhi(int i10) {
        this.CJ.set(i10);
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public List<com.bytedance.sdk.component.cJ.Qhi.cJ> ac() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public ExecutorService cJ() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public int Qhi() {
        return this.CJ.get();
    }
}
