package kotlin.jvm.internal;

import ig.g;
import ig.h;
import ig.j;

/* loaded from: classes.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements ig.g {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ig.b computeReflected() {
        i.f19949a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // ig.j
    public Object getDelegate(Object obj) {
        return ((ig.g) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public /* bridge */ /* synthetic */ h.a getGetter() {
        getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference
    public /* bridge */ /* synthetic */ ig.f getSetter() {
        getSetter();
        return null;
    }

    @Override // cg.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public j.a getGetter() {
        ((ig.g) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference
    public g.a getSetter() {
        ((ig.g) getReflected()).getSetter();
        return null;
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
