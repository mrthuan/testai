package t3;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import v3.l;

/* compiled from: MultiTransformation.java */
/* loaded from: classes.dex */
public final class c<T> implements h<T> {

    /* renamed from: b  reason: collision with root package name */
    public final List f29918b;

    @SafeVarargs
    public c(h<T>... hVarArr) {
        if (hVarArr.length != 0) {
            this.f29918b = Arrays.asList(hVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        for (h hVar : this.f29918b) {
            hVar.a(messageDigest);
        }
    }

    @Override // t3.h
    public final l b(com.bumptech.glide.d dVar, l lVar, int i10, int i11) {
        l lVar2 = lVar;
        for (h hVar : this.f29918b) {
            l b10 = hVar.b(dVar, lVar2, i10, i11);
            if (lVar2 != null && !lVar2.equals(lVar) && !lVar2.equals(b10)) {
                lVar2.a();
            }
            lVar2 = b10;
        }
        return lVar2;
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f29918b.equals(((c) obj).f29918b);
        }
        return false;
    }

    @Override // t3.b
    public final int hashCode() {
        return this.f29918b.hashCode();
    }
}
