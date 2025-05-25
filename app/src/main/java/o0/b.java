package o0;

import android.graphics.Insets;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f22638e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f22639a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22640b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22641d;

    /* compiled from: Insets.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f22639a = i10;
        this.f22640b = i11;
        this.c = i12;
        this.f22641d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f22639a, bVar2.f22639a), Math.max(bVar.f22640b, bVar2.f22640b), Math.max(bVar.c, bVar2.c), Math.max(bVar.f22641d, bVar2.f22641d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f22638e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return a.a(this.f22639a, this.f22640b, this.c, this.f22641d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22641d == bVar.f22641d && this.f22639a == bVar.f22639a && this.c == bVar.c && this.f22640b == bVar.f22640b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f22639a * 31) + this.f22640b) * 31) + this.c) * 31) + this.f22641d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f22639a);
        sb2.append(", top=");
        sb2.append(this.f22640b);
        sb2.append(", right=");
        sb2.append(this.c);
        sb2.append(", bottom=");
        return androidx.activity.f.n(sb2, this.f22641d, '}');
    }
}
