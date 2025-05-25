package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i10, ig.d dVar, String str, String str2) {
        super(i10, CallableReference.NO_RECEIVER, ((b) dVar).a(), str, str2, !(dVar instanceof ig.c) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i10, Class cls, String str, String str2, int i11) {
        super(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    public FunctionReferenceImpl(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(i10, obj, cls, str, str2, i11);
    }
}
