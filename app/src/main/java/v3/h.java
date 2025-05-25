package v3;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
public final class h implements t3.b {

    /* renamed from: b  reason: collision with root package name */
    public final Object f30511b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30512d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f30513e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f30514f;

    /* renamed from: g  reason: collision with root package name */
    public final t3.b f30515g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, t3.h<?>> f30516h;

    /* renamed from: i  reason: collision with root package name */
    public final t3.e f30517i;

    /* renamed from: j  reason: collision with root package name */
    public int f30518j;

    public h(Object obj, t3.b bVar, int i10, int i11, p4.b bVar2, Class cls, Class cls2, t3.e eVar) {
        com.google.android.play.core.assetpacks.c.l(obj);
        this.f30511b = obj;
        if (bVar != null) {
            this.f30515g = bVar;
            this.c = i10;
            this.f30512d = i11;
            com.google.android.play.core.assetpacks.c.l(bVar2);
            this.f30516h = bVar2;
            if (cls != null) {
                this.f30513e = cls;
                if (cls2 != null) {
                    this.f30514f = cls2;
                    com.google.android.play.core.assetpacks.c.l(eVar);
                    this.f30517i = eVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f30511b.equals(hVar.f30511b) || !this.f30515g.equals(hVar.f30515g) || this.f30512d != hVar.f30512d || this.c != hVar.c || !this.f30516h.equals(hVar.f30516h) || !this.f30513e.equals(hVar.f30513e) || !this.f30514f.equals(hVar.f30514f) || !this.f30517i.equals(hVar.f30517i)) {
            return false;
        }
        return true;
    }

    @Override // t3.b
    public final int hashCode() {
        if (this.f30518j == 0) {
            int hashCode = this.f30511b.hashCode();
            this.f30518j = hashCode;
            int hashCode2 = ((((this.f30515g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.f30512d;
            this.f30518j = hashCode2;
            int hashCode3 = this.f30516h.hashCode() + (hashCode2 * 31);
            this.f30518j = hashCode3;
            int hashCode4 = this.f30513e.hashCode() + (hashCode3 * 31);
            this.f30518j = hashCode4;
            int hashCode5 = this.f30514f.hashCode() + (hashCode4 * 31);
            this.f30518j = hashCode5;
            this.f30518j = this.f30517i.hashCode() + (hashCode5 * 31);
        }
        return this.f30518j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f30511b + ", width=" + this.c + ", height=" + this.f30512d + ", resourceClass=" + this.f30513e + ", transcodeClass=" + this.f30514f + ", signature=" + this.f30515g + ", hashCode=" + this.f30518j + ", transformations=" + this.f30516h + ", options=" + this.f30517i + '}';
    }
}
