package rm;

import androidx.activity.r;

/* compiled from: UserGuidePagerEntity.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f29636a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29637b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29638d;

    public h(int i10, String str, String str2, String str3) {
        ea.a.p("R2k_bGU=", "OR9zXc5F");
        ea.a.p("QHUpdBp0DmU=", "EwCS3JAJ");
        ea.a.p("Um4ibTptA2cXRltsDWVy", "PxMaJnL6");
        this.f29636a = str;
        this.f29637b = str2;
        this.c = i10;
        this.f29638d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.g.a(this.f29636a, hVar.f29636a) && kotlin.jvm.internal.g.a(this.f29637b, hVar.f29637b) && this.c == hVar.c && kotlin.jvm.internal.g.a(this.f29638d, hVar.f29638d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f29637b;
        return this.f29638d.hashCode() + ((androidx.activity.f.h(str, this.f29636a.hashCode() * 31, 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserGuidePagerEntity(title=");
        sb2.append(this.f29636a);
        sb2.append(", subtitle=");
        sb2.append(this.f29637b);
        sb2.append(", animRes=");
        sb2.append(this.c);
        sb2.append(", animImageFolder=");
        return r.g(sb2, this.f29638d, ")");
    }
}
