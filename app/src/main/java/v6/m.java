package v6;

import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final s6.b f30720a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f30721b;

    public m(s6.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f30720a = bVar;
                this.f30721b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f30720a.equals(mVar.f30720a)) {
            return false;
        }
        return Arrays.equals(this.f30721b, mVar.f30721b);
    }

    public final int hashCode() {
        return ((this.f30720a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f30721b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f30720a + ", bytes=[...]}";
    }
}
