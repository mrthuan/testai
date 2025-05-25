package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Fragment.java */
/* loaded from: classes.dex */
public final class n extends androidx.activity.result.c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3883a;

    public n(AtomicReference atomicReference) {
        this.f3883a = atomicReference;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f3883a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
