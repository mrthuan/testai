package s0;

/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f29689a;

    /* renamed from: b  reason: collision with root package name */
    public a f29690b;
    public boolean c;

    /* compiled from: CancellationSignal.java */
    /* loaded from: classes.dex */
    public interface a {
        void onCancel();
    }

    public final void a(a aVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f29690b == aVar) {
                return;
            }
            this.f29690b = aVar;
            if (this.f29689a) {
                aVar.onCancel();
            }
        }
    }
}
