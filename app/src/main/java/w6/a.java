package w6;

import java.util.Arrays;
import v6.n;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<n> f30979a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f30980b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f30979a = iterable;
        this.f30980b = bArr;
    }

    @Override // w6.e
    public final Iterable<n> a() {
        return this.f30979a;
    }

    @Override // w6.e
    public final byte[] b() {
        return this.f30980b;
    }

    public final boolean equals(Object obj) {
        byte[] b10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f30979a.equals(eVar.a())) {
            if (eVar instanceof a) {
                b10 = ((a) eVar).f30980b;
            } else {
                b10 = eVar.b();
            }
            if (Arrays.equals(this.f30980b, b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30979a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f30980b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f30979a + ", extras=" + Arrays.toString(this.f30980b) + "}";
    }
}
