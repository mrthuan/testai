package o9;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class p extends c {

    /* renamed from: a  reason: collision with root package name */
    public final int f22782a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22783b;

    public /* synthetic */ p(int i10, boolean z10) {
        this.f22782a = i10;
        this.f22783b = z10;
    }

    @Override // o9.c
    public final boolean a() {
        return this.f22783b;
    }

    @Override // o9.c
    public final int b() {
        return this.f22782a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f22782a == cVar.b() && this.f22783b == cVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f22782a ^ 1000003;
        if (true != this.f22783b) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return (i11 * 1000003) ^ i10;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f22782a + ", allowAssetPackDeletion=" + this.f22783b + "}";
    }
}
