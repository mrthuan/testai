package xi;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: LogFontW.java */
/* loaded from: classes3.dex */
public final class s0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f31778a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31779b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31780d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31781e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f31782f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f31783g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f31784h;

    /* renamed from: i  reason: collision with root package name */
    public final int f31785i;

    /* renamed from: j  reason: collision with root package name */
    public final int f31786j;

    /* renamed from: k  reason: collision with root package name */
    public final int f31787k;

    /* renamed from: l  reason: collision with root package name */
    public final int f31788l;

    /* renamed from: m  reason: collision with root package name */
    public final int f31789m;

    /* renamed from: n  reason: collision with root package name */
    public final String f31790n;

    /* renamed from: o  reason: collision with root package name */
    public yh.a f31791o;

    public s0(yh.a aVar) {
        this.f31778a = (int) (-aVar.f32142b);
        this.f31779b = 0;
        this.c = 0;
        this.f31780d = 0;
        this.f31781e = aVar.f32143d ? OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD : 400;
        this.f31782f = aVar.c;
        this.f31783g = false;
        this.f31784h = false;
        this.f31785i = 0;
        this.f31786j = 0;
        this.f31787k = 0;
        this.f31788l = 4;
        this.f31789m = 0;
        this.f31790n = aVar.f32141a;
    }

    @Override // xi.l0
    public final void a(wi.d dVar) {
        dVar.k(this.f31791o);
    }

    public final String toString() {
        return "  LogFontW\n    height: " + this.f31778a + "\n    width: " + this.f31779b + "\n    orientation: " + this.f31780d + "\n    weight: " + this.f31781e + "\n    italic: " + this.f31782f + "\n    underline: " + this.f31783g + "\n    strikeout: " + this.f31784h + "\n    charSet: " + this.f31785i + "\n    outPrecision: " + this.f31786j + "\n    clipPrecision: " + this.f31787k + "\n    quality: " + this.f31788l + "\n    pitchAndFamily: " + this.f31789m + "\n    faceFamily: " + this.f31790n;
    }

    public s0(wi.c cVar) {
        this.f31778a = cVar.readInt();
        this.f31779b = cVar.readInt();
        this.c = cVar.readInt();
        this.f31780d = cVar.readInt();
        this.f31781e = cVar.readInt();
        this.f31782f = cVar.readByte() != 0;
        this.f31783g = cVar.readByte() != 0;
        this.f31784h = cVar.readByte() != 0;
        this.f31785i = cVar.readByte();
        this.f31786j = cVar.readByte();
        this.f31787k = cVar.readByte();
        this.f31788l = cVar.readByte();
        this.f31789m = cVar.readByte();
        this.f31790n = cVar.o(32);
    }
}
