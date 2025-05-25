package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public abstract class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zaaw f11025a;

    public /* synthetic */ p(zaaw zaawVar) {
        this.f11025a = zaawVar;
    }

    public abstract void a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.zaaw] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.locks.Lock] */
    @Override // java.lang.Runnable
    public final void run() {
        zaaw zaawVar = this.f11025a;
        zaawVar.f11053b.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e10) {
                t tVar = zaawVar.f11052a.f11098e;
                tVar.sendMessage(tVar.obtainMessage(2, e10));
            }
        } finally {
            zaawVar.f11053b.unlock();
        }
    }
}
