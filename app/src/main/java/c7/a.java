package c7;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f5629b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5630d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5631e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5632f;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f5629b = j10;
        this.c = i10;
        this.f5630d = i11;
        this.f5631e = j11;
        this.f5632f = i12;
    }

    @Override // c7.e
    public final int a() {
        return this.f5630d;
    }

    @Override // c7.e
    public final long b() {
        return this.f5631e;
    }

    @Override // c7.e
    public final int c() {
        return this.c;
    }

    @Override // c7.e
    public final int d() {
        return this.f5632f;
    }

    @Override // c7.e
    public final long e() {
        return this.f5629b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5629b == eVar.e() && this.c == eVar.c() && this.f5630d == eVar.a() && this.f5631e == eVar.b() && this.f5632f == eVar.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5629b;
        long j11 = this.f5631e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f5630d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f5632f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f5629b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f5630d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f5631e);
        sb2.append(", maxBlobByteSizePerRow=");
        return a6.h.g(sb2, this.f5632f, "}");
    }
}
