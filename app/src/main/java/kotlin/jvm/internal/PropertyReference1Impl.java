package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(ig.d dVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((b) dVar).a(), str, str2, !(dVar instanceof ig.c) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1
    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
