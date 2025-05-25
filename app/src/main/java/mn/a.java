package mn;

/* compiled from: CameraUiState.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22145a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22146b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22147d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f22148e;

    public a() {
        this(false, false, 31);
    }

    public static a a(a aVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f22145a;
        }
        boolean z15 = z10;
        if ((i10 & 2) != 0) {
            z11 = aVar.f22146b;
        }
        boolean z16 = z11;
        if ((i10 & 4) != 0) {
            z12 = aVar.c;
        }
        boolean z17 = z12;
        if ((i10 & 8) != 0) {
            z13 = aVar.f22147d;
        }
        boolean z18 = z13;
        if ((i10 & 16) != 0) {
            z14 = aVar.f22148e;
        }
        aVar.getClass();
        return new a(z15, z16, z17, z18, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22145a == aVar.f22145a && this.f22146b == aVar.f22146b && this.c == aVar.c && this.f22147d == aVar.f22147d && this.f22148e == aVar.f22148e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i10 = 1;
        boolean z10 = this.f22145a;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = i11 * 31;
        boolean z11 = this.f22146b;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.c;
        int i15 = z12;
        if (z12 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z13 = this.f22147d;
        int i17 = z13;
        if (z13 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z14 = this.f22148e;
        if (!z14) {
            i10 = z14 ? 1 : 0;
        }
        return i18 + i10;
    }

    public final String toString() {
        return "CameraUiState(openMore=" + this.f22145a + ", openFlashlight=" + this.f22146b + ", openGrid=" + this.c + ", openSound=" + this.f22147d + ", openSpiritLevel=" + this.f22148e + ")";
    }

    public /* synthetic */ a(boolean z10, boolean z11, int i10) {
        this(false, false, false, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }

    public a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f22145a = z10;
        this.f22146b = z11;
        this.c = z12;
        this.f22147d = z13;
        this.f22148e = z14;
    }
}
