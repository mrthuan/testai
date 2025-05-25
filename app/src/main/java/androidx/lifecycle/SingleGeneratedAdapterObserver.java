package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: SingleGeneratedAdapterObserver.kt */
/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements n {

    /* renamed from: a  reason: collision with root package name */
    public final i f4021a;

    public SingleGeneratedAdapterObserver(i iVar) {
        this.f4021a = iVar;
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        i iVar = this.f4021a;
        iVar.a(event, false, null);
        iVar.a(event, true, null);
    }
}
