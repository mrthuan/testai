package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: CompositeGeneratedAdaptersObserver.kt */
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements n {

    /* renamed from: a  reason: collision with root package name */
    public final i[] f3971a;

    public CompositeGeneratedAdaptersObserver(i[] iVarArr) {
        this.f3971a = iVarArr;
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        v vVar = new v(0);
        i[] iVarArr = this.f3971a;
        for (i iVar : iVarArr) {
            iVar.a(event, false, vVar);
        }
        for (i iVar2 : iVarArr) {
            iVar2.a(event, true, vVar);
        }
    }
}
