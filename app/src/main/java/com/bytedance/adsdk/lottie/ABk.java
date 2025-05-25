package com.bytedance.adsdk.lottie;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public class ABk<T> {
    public static Executor Qhi = Executors.newCachedThreadPool();
    private final Handler CJ;

    /* renamed from: ac  reason: collision with root package name */
    private final Set<Gm<Throwable>> f7687ac;
    private final Set<Gm<T>> cJ;

    /* renamed from: fl  reason: collision with root package name */
    private volatile zc<T> f7688fl;

    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class Qhi extends FutureTask<zc<T>> {
        public Qhi(Callable<zc<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (!isCancelled()) {
                try {
                    ABk.this.Qhi((zc) get());
                } catch (InterruptedException | ExecutionException e10) {
                    ABk.this.Qhi(new zc(e10));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ABk(Callable<zc<T>> callable) {
        this(callable, false);
    }

    public synchronized ABk<T> CJ(Gm<Throwable> gm2) {
        this.f7687ac.remove(gm2);
        return this;
    }

    public synchronized ABk<T> ac(Gm<Throwable> gm2) {
        zc<T> zcVar = this.f7688fl;
        if (zcVar != null && zcVar.cJ() != null) {
            gm2.Qhi(zcVar.cJ());
        }
        this.f7687ac.add(gm2);
        return this;
    }

    public synchronized ABk<T> cJ(Gm<T> gm2) {
        this.cJ.remove(gm2);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ABk(Callable<zc<T>> callable, boolean z10) {
        this.cJ = new LinkedHashSet(1);
        this.f7687ac = new LinkedHashSet(1);
        this.CJ = new Handler(Looper.getMainLooper());
        this.f7688fl = null;
        if (z10) {
            try {
                Qhi((zc) callable.call());
                return;
            } catch (Throwable th2) {
                Qhi((zc) new zc<>(th2));
                return;
            }
        }
        Qhi.execute(new Qhi(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(zc<T> zcVar) {
        if (this.f7688fl == null) {
            this.f7688fl = zcVar;
            Qhi();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized ABk<T> Qhi(Gm<T> gm2) {
        zc<T> zcVar = this.f7688fl;
        if (zcVar != null && zcVar.Qhi() != null) {
            gm2.Qhi(zcVar.Qhi());
        }
        this.cJ.add(gm2);
        return this;
    }

    private void Qhi() {
        this.CJ.post(new Runnable() { // from class: com.bytedance.adsdk.lottie.ABk.1
            @Override // java.lang.Runnable
            public void run() {
                zc zcVar = ABk.this.f7688fl;
                if (zcVar == null) {
                    return;
                }
                if (zcVar.Qhi() != null) {
                    ABk.this.Qhi((ABk) zcVar.Qhi());
                } else {
                    ABk.this.Qhi(zcVar.cJ());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Qhi(T t4) {
        Iterator it = new ArrayList(this.cJ).iterator();
        while (it.hasNext()) {
            ((Gm) it.next()).Qhi(t4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Qhi(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f7687ac);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Gm) it.next()).Qhi(th2);
        }
    }
}
