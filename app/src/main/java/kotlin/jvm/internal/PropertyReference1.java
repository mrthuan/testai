package kotlin.jvm.internal;

import ig.h;
import ig.j;

/* loaded from: classes.dex */
public abstract class PropertyReference1 extends PropertyReference implements ig.j {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ig.b computeReflected() {
        i.f19949a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // ig.j
    public Object getDelegate(Object obj) {
        return ((ig.j) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public /* bridge */ /* synthetic */ h.a getGetter() {
        getGetter();
        return null;
    }

    @Override // cg.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public j.a getGetter() {
        ((ig.j) getReflected()).getGetter();
        return null;
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
