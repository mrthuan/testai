package c7;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final long f5633a;

    /* renamed from: b  reason: collision with root package name */
    public final v6.s f5634b;
    public final v6.n c;

    public b(long j10, v6.s sVar, v6.n nVar) {
        this.f5633a = j10;
        if (sVar != null) {
            this.f5634b = sVar;
            if (nVar != null) {
                this.c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // c7.i
    public final v6.n a() {
        return this.c;
    }

    @Override // c7.i
    public final long b() {
        return this.f5633a;
    }

    @Override // c7.i
    public final v6.s c() {
        return this.f5634b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f5633a == iVar.b() && this.f5634b.equals(iVar.c()) && this.c.equals(iVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5633a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f5634b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f5633a + ", transportContext=" + this.f5634b + ", event=" + this.c + "}";
    }
}
