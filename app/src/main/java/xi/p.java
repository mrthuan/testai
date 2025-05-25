package xi;

/* compiled from: BitmapInfoHeader.java */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f31755a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31756b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31757d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31758e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31759f;

    /* renamed from: g  reason: collision with root package name */
    public final int f31760g;

    /* renamed from: h  reason: collision with root package name */
    public final int f31761h;

    /* renamed from: i  reason: collision with root package name */
    public final int f31762i;

    /* renamed from: j  reason: collision with root package name */
    public final int f31763j;

    public p(wi.c cVar) {
        cVar.readUnsignedInt();
        this.f31755a = cVar.readInt();
        this.f31756b = cVar.readInt();
        this.c = cVar.readUnsignedShort();
        this.f31757d = cVar.readUnsignedShort();
        this.f31758e = (int) cVar.readUnsignedInt();
        this.f31759f = (int) cVar.readUnsignedInt();
        this.f31760g = cVar.readInt();
        this.f31761h = cVar.readInt();
        this.f31762i = (int) cVar.readUnsignedInt();
        this.f31763j = (int) cVar.readUnsignedInt();
    }

    public final String toString() {
        return "    size: 40\n    width: " + this.f31755a + "\n    height: " + this.f31756b + "\n    planes: " + this.c + "\n    bitCount: " + this.f31757d + "\n    compression: " + this.f31758e + "\n    sizeImage: " + this.f31759f + "\n    xPelsPerMeter: " + this.f31760g + "\n    yPelsPerMeter: " + this.f31761h + "\n    clrUsed: " + this.f31762i + "\n    clrImportant: " + this.f31763j;
    }
}
