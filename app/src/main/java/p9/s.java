package p9;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class s extends o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f23822b;

    public s(x xVar) {
        this.f23822b = xVar;
    }

    @Override // p9.o
    public final void a() {
        synchronized (this.f23822b.f23831f) {
            try {
                if (this.f23822b.f23836k.get() > 0 && this.f23822b.f23836k.decrementAndGet() > 0) {
                    this.f23822b.f23828b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                x xVar = this.f23822b;
                if (xVar.f23838m != null) {
                    xVar.f23828b.c("Unbind from service.", new Object[0]);
                    x xVar2 = this.f23822b;
                    xVar2.f23827a.unbindService(xVar2.f23837l);
                    x xVar3 = this.f23822b;
                    xVar3.f23832g = false;
                    xVar3.f23838m = null;
                    xVar3.f23837l = null;
                }
                this.f23822b.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
