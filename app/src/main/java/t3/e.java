package t3;

import java.security.MessageDigest;
import t3.d;

/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: b  reason: collision with root package name */
    public final p4.b f29923b = new p4.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            p4.b bVar = this.f29923b;
            if (i10 < bVar.c) {
                d dVar = (d) bVar.h(i10);
                V l10 = this.f29923b.l(i10);
                d.b<T> bVar2 = dVar.f29921b;
                if (dVar.f29922d == null) {
                    dVar.f29922d = dVar.c.getBytes(b.f29917a);
                }
                bVar2.a(dVar.f29922d, l10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(d<T> dVar) {
        p4.b bVar = this.f29923b;
        if (bVar.containsKey(dVar)) {
            return (T) bVar.getOrDefault(dVar, null);
        }
        return dVar.f29920a;
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f29923b.equals(((e) obj).f29923b);
        }
        return false;
    }

    @Override // t3.b
    public final int hashCode() {
        return this.f29923b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f29923b + '}';
    }
}
