package xj;

import java.util.Objects;
import net.lingala.zip4j.headers.HeaderSignature;

/* compiled from: FileHeader.java */
/* loaded from: classes3.dex */
public final class f extends b {

    /* renamed from: r  reason: collision with root package name */
    public int f31839r;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f31840s;

    /* renamed from: t  reason: collision with root package name */
    public long f31841t;

    public f() {
        this.f17399a = HeaderSignature.CENTRAL_DIRECTORY;
    }

    @Override // xj.b
    public final boolean equals(Object obj) {
        long j10;
        long j11;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        k kVar = this.f31829m;
        if (kVar != null) {
            j10 = kVar.f31848d;
        } else {
            j10 = this.f31841t;
        }
        k kVar2 = fVar.f31829m;
        if (kVar2 != null) {
            j11 = kVar2.f31848d;
        } else {
            j11 = fVar.f31841t;
        }
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10;
        Object[] objArr = new Object[2];
        objArr[0] = this.f31825i;
        k kVar = this.f31829m;
        if (kVar != null) {
            j10 = kVar.f31848d;
        } else {
            j10 = this.f31841t;
        }
        objArr[1] = Long.valueOf(j10);
        return Objects.hash(objArr);
    }

    public final String toString() {
        return this.f31825i;
    }
}
