package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public class a1 extends c1 implements n {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var) {
        super(true);
        l lVar;
        l lVar2;
        boolean z10 = true;
        W(y0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1.f19992b;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar instanceof l) {
            lVar = (l) kVar;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            c1 k10 = lVar.k();
            while (!k10.N()) {
                k kVar2 = (k) atomicReferenceFieldUpdater.get(k10);
                if (kVar2 instanceof l) {
                    lVar2 = (l) kVar2;
                } else {
                    lVar2 = null;
                }
                if (lVar2 != null) {
                    k10 = lVar2.k();
                }
            }
            this.c = z10;
        }
        z10 = false;
        this.c = z10;
    }

    @Override // kotlinx.coroutines.c1
    public final boolean N() {
        return this.c;
    }

    @Override // kotlinx.coroutines.c1
    public final boolean O() {
        return true;
    }
}
