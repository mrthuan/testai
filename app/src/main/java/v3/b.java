package v3;

import com.bumptech.glide.load.engine.a;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.a f30501a;

    public b(com.bumptech.glide.load.engine.a aVar) {
        this.f30501a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.engine.a aVar = this.f30501a;
        aVar.getClass();
        while (true) {
            try {
                aVar.b((a.C0053a) aVar.f6933d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
