package oa;

import oa.d0;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes2.dex */
public final class z extends d0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f23044a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23045b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23046d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23047e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23048f;

    /* renamed from: g  reason: collision with root package name */
    public final int f23049g;

    /* renamed from: h  reason: collision with root package name */
    public final String f23050h;

    /* renamed from: i  reason: collision with root package name */
    public final String f23051i;

    public z(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f23044a = i10;
        if (str != null) {
            this.f23045b = str;
            this.c = i11;
            this.f23046d = j10;
            this.f23047e = j11;
            this.f23048f = z10;
            this.f23049g = i12;
            if (str2 != null) {
                this.f23050h = str2;
                if (str3 != null) {
                    this.f23051i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // oa.d0.b
    public final int a() {
        return this.f23044a;
    }

    @Override // oa.d0.b
    public final int b() {
        return this.c;
    }

    @Override // oa.d0.b
    public final long c() {
        return this.f23047e;
    }

    @Override // oa.d0.b
    public final boolean d() {
        return this.f23048f;
    }

    @Override // oa.d0.b
    public final String e() {
        return this.f23050h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.b)) {
            return false;
        }
        d0.b bVar = (d0.b) obj;
        if (this.f23044a == bVar.a() && this.f23045b.equals(bVar.f()) && this.c == bVar.b() && this.f23046d == bVar.i() && this.f23047e == bVar.c() && this.f23048f == bVar.d() && this.f23049g == bVar.h() && this.f23050h.equals(bVar.e()) && this.f23051i.equals(bVar.g())) {
            return true;
        }
        return false;
    }

    @Override // oa.d0.b
    public final String f() {
        return this.f23045b;
    }

    @Override // oa.d0.b
    public final String g() {
        return this.f23051i;
    }

    @Override // oa.d0.b
    public final int h() {
        return this.f23049g;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f23046d;
        long j11 = this.f23047e;
        int hashCode = (((((((((this.f23044a ^ 1000003) * 1000003) ^ this.f23045b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f23048f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f23049g) * 1000003) ^ this.f23050h.hashCode()) * 1000003) ^ this.f23051i.hashCode();
    }

    @Override // oa.d0.b
    public final long i() {
        return this.f23046d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f23044a);
        sb2.append(", model=");
        sb2.append(this.f23045b);
        sb2.append(", availableProcessors=");
        sb2.append(this.c);
        sb2.append(", totalRam=");
        sb2.append(this.f23046d);
        sb2.append(", diskSpace=");
        sb2.append(this.f23047e);
        sb2.append(", isEmulator=");
        sb2.append(this.f23048f);
        sb2.append(", state=");
        sb2.append(this.f23049g);
        sb2.append(", manufacturer=");
        sb2.append(this.f23050h);
        sb2.append(", modelClass=");
        return androidx.activity.r.g(sb2, this.f23051i, "}");
    }
}
