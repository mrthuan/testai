package rh;

/* compiled from: PGControl.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f29557a;

    public b(a aVar) {
        this.f29557a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f29557a;
        if (!aVar.f29544a) {
            aVar.s().N();
        }
    }
}
