package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: NetCacheDispatcher.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.sdk.component.cJ.Qhi.fl {
    public static volatile WAv Qhi;
    private ExecutorService CJ;
    private List<com.bytedance.sdk.component.cJ.Qhi.cJ> cJ = new CopyOnWriteArrayList();

    /* renamed from: ac  reason: collision with root package name */
    private List<com.bytedance.sdk.component.cJ.Qhi.cJ> f8338ac = new CopyOnWriteArrayList();

    public Qhi(ExecutorService executorService) {
        this.CJ = executorService;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public List<com.bytedance.sdk.component.cJ.Qhi.cJ> CJ() {
        return this.f8338ac;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public int Qhi() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public List<com.bytedance.sdk.component.cJ.Qhi.cJ> ac() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public ExecutorService cJ() {
        ExecutorService executorService;
        if (Qhi != null) {
            executorService = Qhi.Qhi();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        return this.CJ;
    }

    public boolean fl() {
        if (Qhi != null && Qhi.Qhi() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.fl
    public void Qhi(int i10) {
    }

    public static void Qhi(WAv wAv) {
        Qhi = wAv;
    }
}
