package u9;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f30263a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30264b;

    public b(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f30263a = pendingIntent;
            this.f30264b = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    @Override // u9.a
    public final PendingIntent a() {
        return this.f30263a;
    }

    @Override // u9.a
    public final boolean b() {
        return this.f30264b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f30263a.equals(aVar.a()) && this.f30264b == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f30263a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f30264b) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String obj = this.f30263a.toString();
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + this.f30264b + "}";
    }
}
