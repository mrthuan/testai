package e3;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class p<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f16439a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f16440b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(e eVar) {
        this.f16439a = eVar;
        this.f16440b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        V v10 = this.f16439a;
        if (v10 != null && v10.equals(pVar.f16439a)) {
            return true;
        }
        Throwable th2 = this.f16440b;
        if (th2 == null || pVar.f16440b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16439a, this.f16440b});
    }

    public p(Throwable th2) {
        this.f16440b = th2;
        this.f16439a = null;
    }
}
