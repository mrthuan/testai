package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(ig.d dVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((b) dVar).a(), str, str2, !(dVar instanceof ig.c) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference0
    public Object get() {
        getGetter();
        throw null;
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
