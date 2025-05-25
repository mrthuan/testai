package kotlin.jvm.internal;

import ig.h;

/* loaded from: classes.dex */
public abstract class PropertyReference extends CallableReference implements ig.h {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ig.b compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && g.a(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof ig.h)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public abstract /* synthetic */ h.a getGetter();

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // ig.h
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // ig.h
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        ig.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ig.h getReflected() {
        if (!this.syntheticJavaProperty) {
            return (ig.h) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }
}
