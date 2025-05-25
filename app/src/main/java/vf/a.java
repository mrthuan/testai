package vf;

import tf.d;

/* compiled from: Thread.kt */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cg.a<d> f30810a;

    public a(cg.a<d> aVar) {
        this.f30810a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f30810a.invoke();
    }
}
