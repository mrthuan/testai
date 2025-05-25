package bb;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5398a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5399b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f5398a = i10;
        this.f5399b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5398a) {
            case 0:
                com.google.firebase.heartbeatinfo.a aVar = (com.google.firebase.heartbeatinfo.a) this.f5399b;
                synchronized (aVar) {
                    aVar.f13583a.get().k(System.currentTimeMillis(), aVar.c.get().a());
                }
                return null;
            default:
                return ((mb.h) this.f5399b).c();
        }
    }
}
