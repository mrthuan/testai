package f9;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final d f17158a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17159b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f17158a;
            f10 += ((b) dVar).f17159b;
        }
        this.f17158a = dVar;
        this.f17159b = f10;
    }

    @Override // f9.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f17158a.a(rectF) + this.f17159b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f17158a.equals(bVar.f17158a) && this.f17159b == bVar.f17159b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17158a, Float.valueOf(this.f17159b)});
    }
}
