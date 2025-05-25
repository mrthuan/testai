package t0;

import n0.f;
import o0.e;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ aj.b f29871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29872b;

    public b(aj.b bVar, int i10) {
        this.f29871a = bVar;
        this.f29872b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f29871a).f22647w;
        if (eVar != null) {
            eVar.c(this.f29872b);
        }
    }
}
