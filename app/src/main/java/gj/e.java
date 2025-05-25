package gj;

/* compiled from: LayoutThread.java */
/* loaded from: classes3.dex */
public final class e extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17824a;

    /* renamed from: b  reason: collision with root package name */
    public final ai.d f17825b;

    public e(ai.d dVar) {
        this.f17825b = dVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        xh.e n10;
        ai.d dVar = this.f17825b;
        while (!this.f17824a) {
            try {
                if (dVar.q()) {
                    dVar.k();
                    Thread.sleep(50L);
                } else {
                    Thread.sleep(1000L);
                }
            } catch (Exception e10) {
                if (dVar != null && (n10 = ((ai.e) dVar).n()) != null && n10.getControl() != null) {
                    n10.getControl().o().c().a(false, e10);
                    return;
                }
                return;
            }
        }
    }
}
