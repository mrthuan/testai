package lib.zj.office.system;

/* compiled from: BackReaderThread.java */
/* loaded from: classes3.dex */
public final class c extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public j f21021a;

    /* renamed from: b  reason: collision with root package name */
    public f f21022b;

    public c(j jVar, f fVar) {
        this.f21021a = jVar;
        this.f21022b = fVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f21022b.r(24, Boolean.TRUE);
        while (!this.f21021a.isReaderFinish()) {
            try {
                this.f21021a.backReader();
            } catch (Exception e10) {
                e10.toString();
                if (!this.f21021a.isAborted()) {
                    this.f21022b.o().c().a(true, e10);
                    this.f21022b.r(23, Boolean.TRUE);
                }
            } catch (OutOfMemoryError e11) {
                e11.toString();
                this.f21022b.o().c().a(true, e11);
                this.f21022b.r(23, Boolean.TRUE);
            }
        }
        this.f21022b.r(23, Boolean.TRUE);
        this.f21022b.r(805306376, Boolean.TRUE);
        this.f21022b = null;
        this.f21021a = null;
    }
}
