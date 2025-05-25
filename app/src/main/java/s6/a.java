package s6;

import com.google.android.datatransport.Priority;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f29750a = null;

    /* renamed from: b  reason: collision with root package name */
    public final T f29751b;
    public final Priority c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, Priority priority) {
        if (obj != 0) {
            this.f29751b = obj;
            if (priority != null) {
                this.c = priority;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // s6.c
    public final Integer a() {
        return this.f29750a;
    }

    @Override // s6.c
    public final T b() {
        return this.f29751b;
    }

    @Override // s6.c
    public final Priority c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f29750a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f29751b.equals(cVar.b()) && this.c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f29750a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f29751b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f29750a + ", payload=" + this.f29751b + ", priority=" + this.c + "}";
    }
}
