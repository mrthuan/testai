package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class FunctionReference extends CallableReference implements f, ig.e {
    private final int arity;
    private final int flags;

    public FunctionReference(int i10) {
        this(i10, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ig.b computeReflected() {
        i.f19949a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && g.a(getBoundReceiver(), functionReference.getBoundReceiver()) && g.a(getOwner(), functionReference.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof ig.e)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // ig.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ig.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ig.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ig.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, ig.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ig.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ig.e getReflected() {
        return (ig.e) super.getReflected();
    }

    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
