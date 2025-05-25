package o4;

import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes.dex */
public final class d implements t3.b {

    /* renamed from: b  reason: collision with root package name */
    public final Object f22741b;

    public d(Object obj) {
        com.google.android.play.core.assetpacks.c.l(obj);
        this.f22741b = obj;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f22741b.toString().getBytes(t3.b.f29917a));
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f22741b.equals(((d) obj).f22741b);
        }
        return false;
    }

    @Override // t3.b
    public final int hashCode() {
        return this.f22741b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f22741b + '}';
    }
}
