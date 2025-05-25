package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

/* loaded from: classes.dex */
public abstract class CallableReference implements ig.b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f19943a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ig.b reflected;
    private final String signature;

    /* loaded from: classes.dex */
    public static class NoReceiver implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final NoReceiver f19943a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return f19943a;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // ig.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ig.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ig.b compute() {
        ig.b bVar = this.reflected;
        if (bVar == null) {
            ig.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    public abstract ig.b computeReflected();

    @Override // ig.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // ig.b
    public String getName() {
        return this.name;
    }

    public ig.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            i.f19949a.getClass();
            return new h(cls);
        }
        return i.a(cls);
    }

    @Override // ig.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public ig.b getReflected() {
        ig.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // ig.b
    public ig.k getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ig.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ig.b
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ig.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ig.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ig.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // ig.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
