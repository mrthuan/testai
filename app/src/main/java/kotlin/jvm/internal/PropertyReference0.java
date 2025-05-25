package kotlin.jvm.internal;

import ig.h;
import ig.i;

/* loaded from: classes.dex */
public abstract class PropertyReference0 extends PropertyReference implements ig.i {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ig.b computeReflected() {
        i.f19949a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get();

    @Override // ig.i
    public Object getDelegate() {
        return ((ig.i) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public /* bridge */ /* synthetic */ h.a getGetter() {
        getGetter();
        return null;
    }

    @Override // cg.a
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public i.a getGetter() {
        ((ig.i) getReflected()).getGetter();
        return null;
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
