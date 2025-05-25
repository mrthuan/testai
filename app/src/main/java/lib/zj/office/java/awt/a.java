package lib.zj.office.java.awt;

/* compiled from: Rectanglef.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f20690a;

    /* renamed from: b  reason: collision with root package name */
    public float f20691b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f20692d;

    public a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f20690a == aVar.f20690a && this.f20691b == aVar.f20691b && this.c == aVar.c && this.f20692d == aVar.f20692d) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public final String toString() {
        return a.class.getName() + "[x=" + this.f20690a + ",y=" + this.f20691b + ",width=" + this.c + ",height=" + this.f20692d + "]";
    }

    public a(float f10, float f11) {
        this.f20690a = f10;
        this.f20691b = f11;
        this.c = 0.0f;
        this.f20692d = 0.0f;
    }
}
