package oa;

import java.util.Arrays;
import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes2.dex */
public final class g extends b0.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f22933a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f22934b;

    public g(String str, byte[] bArr) {
        this.f22933a = str;
        this.f22934b = bArr;
    }

    @Override // oa.b0.d.a
    public final byte[] a() {
        return this.f22934b;
    }

    @Override // oa.b0.d.a
    public final String b() {
        return this.f22933a;
    }

    public final boolean equals(Object obj) {
        byte[] a10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d.a)) {
            return false;
        }
        b0.d.a aVar = (b0.d.a) obj;
        if (this.f22933a.equals(aVar.b())) {
            if (aVar instanceof g) {
                a10 = ((g) aVar).f22934b;
            } else {
                a10 = aVar.a();
            }
            if (Arrays.equals(this.f22934b, a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22933a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22934b);
    }

    public final String toString() {
        return "File{filename=" + this.f22933a + ", contents=" + Arrays.toString(this.f22934b) + "}";
    }
}
