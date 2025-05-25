package yd;

import androidx.activity.r;
import kotlin.jvm.internal.g;

/* compiled from: ADOrder.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f32115a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32116b;
    public final String c;

    public b(int i10, int i11, String floorName) {
        g.e(floorName, "floorName");
        this.f32115a = i10;
        this.f32116b = i11;
        this.c = floorName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f32115a == bVar.f32115a && this.f32116b == bVar.f32116b && g.a(this.c, bVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f32115a * 31) + this.f32116b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ADOrder(index=");
        sb2.append(this.f32115a);
        sb2.append(", totalFloors=");
        sb2.append(this.f32116b);
        sb2.append(", floorName=");
        return r.f(sb2, this.c, ')');
    }
}
