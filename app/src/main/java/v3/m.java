package v3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
public final class m implements t3.b {

    /* renamed from: j  reason: collision with root package name */
    public static final p4.g<Class<?>, byte[]> f30525j = new p4.g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final w3.b f30526b;
    public final t3.b c;

    /* renamed from: d  reason: collision with root package name */
    public final t3.b f30527d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30528e;

    /* renamed from: f  reason: collision with root package name */
    public final int f30529f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f30530g;

    /* renamed from: h  reason: collision with root package name */
    public final t3.e f30531h;

    /* renamed from: i  reason: collision with root package name */
    public final t3.h<?> f30532i;

    public m(w3.b bVar, t3.b bVar2, t3.b bVar3, int i10, int i11, t3.h<?> hVar, Class<?> cls, t3.e eVar) {
        this.f30526b = bVar;
        this.c = bVar2;
        this.f30527d = bVar3;
        this.f30528e = i10;
        this.f30529f = i11;
        this.f30532i = hVar;
        this.f30530g = cls;
        this.f30531h = eVar;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        w3.b bVar = this.f30526b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.f30528e).putInt(this.f30529f).array();
        this.f30527d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        t3.h<?> hVar = this.f30532i;
        if (hVar != null) {
            hVar.a(messageDigest);
        }
        this.f30531h.a(messageDigest);
        p4.g<Class<?>, byte[]> gVar = f30525j;
        Class<?> cls = this.f30530g;
        byte[] a10 = gVar.a(cls);
        if (a10 == null) {
            a10 = cls.getName().getBytes(t3.b.f29917a);
            gVar.d(cls, a10);
        }
        messageDigest.update(a10);
        bVar.put(bArr);
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f30529f != mVar.f30529f || this.f30528e != mVar.f30528e || !p4.j.a(this.f30532i, mVar.f30532i) || !this.f30530g.equals(mVar.f30530g) || !this.c.equals(mVar.c) || !this.f30527d.equals(mVar.f30527d) || !this.f30531h.equals(mVar.f30531h)) {
            return false;
        }
        return true;
    }

    @Override // t3.b
    public final int hashCode() {
        int hashCode = ((((this.f30527d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.f30528e) * 31) + this.f30529f;
        t3.h<?> hVar = this.f30532i;
        if (hVar != null) {
            hashCode = (hashCode * 31) + hVar.hashCode();
        }
        int hashCode2 = this.f30530g.hashCode();
        return this.f30531h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.f30527d + ", width=" + this.f30528e + ", height=" + this.f30529f + ", decodedResourceClass=" + this.f30530g + ", transformation='" + this.f30532i + "', options=" + this.f30531h + '}';
    }
}
