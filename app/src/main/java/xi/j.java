package xi;

import android.graphics.Point;

/* compiled from: AngleArc.java */
/* loaded from: classes3.dex */
public final class j extends wi.e {
    public final Point c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31725d;

    /* renamed from: e  reason: collision with root package name */
    public final float f31726e;

    /* renamed from: f  reason: collision with root package name */
    public final float f31727f;

    public j() {
        super(41);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new j(cVar.j(), (int) cVar.readUnsignedInt(), cVar.readFloat(), cVar.readFloat());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  center: " + this.c + "\n  radius: " + this.f31725d + "\n  startAngle: " + this.f31726e + "\n  sweepAngle: " + this.f31727f;
    }

    public j(Point point, int i10, float f10, float f11) {
        this();
        this.c = point;
        this.f31725d = i10;
        this.f31726e = f10;
        this.f31727f = f11;
    }
}
