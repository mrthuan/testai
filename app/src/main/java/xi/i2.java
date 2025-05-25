package xi;

import lib.zj.office.java.awt.Color;

/* compiled from: TriVertex.java */
/* loaded from: classes3.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f31723a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31724b;
    public final Color c;

    public i2(wi.c cVar) {
        this.f31723a = cVar.readInt();
        this.f31724b = cVar.readInt();
        this.c = new Color(cVar.readShort() >> 8, cVar.readShort() >> 8, cVar.readShort() >> 8, cVar.readShort() >> 8);
    }

    public final String toString() {
        return "[" + this.f31723a + ", " + this.f31724b + "] " + this.c;
    }
}
