package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.g;

/* compiled from: Result.kt */
/* loaded from: classes.dex */
public final class Result<T> implements Serializable {
    public static final a Companion = new a();
    private final Object value;

    /* compiled from: Result.kt */
    /* loaded from: classes.dex */
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable exception) {
            g.e(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof Failure) && g.a(this.exception, ((Failure) obj).exception)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    /* compiled from: Result.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Result m12boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m14equalsimpl(Object obj, Object obj2) {
        if (!(obj2 instanceof Result) || !g.a(obj, ((Result) obj2).m21unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m15equalsimpl0(Object obj, Object obj2) {
        return g.a(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m16exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m17hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m18isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m19isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m20toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m14equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m17hashCodeimpl(this.value);
    }

    public String toString() {
        return m20toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m21unboximpl() {
        return this.value;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Object m13constructorimpl(Object obj) {
        return obj;
    }
}
