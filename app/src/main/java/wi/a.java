package wi;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: EMFHeader.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Rectangle f31217a;

    /* renamed from: b  reason: collision with root package name */
    public final Rectangle f31218b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31219d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31220e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31221f;

    /* renamed from: g  reason: collision with root package name */
    public final int f31222g;

    /* renamed from: h  reason: collision with root package name */
    public final int f31223h;

    /* renamed from: i  reason: collision with root package name */
    public final String f31224i;

    /* renamed from: j  reason: collision with root package name */
    public final int f31225j;

    /* renamed from: k  reason: collision with root package name */
    public final Dimension f31226k;

    /* renamed from: l  reason: collision with root package name */
    public final Dimension f31227l;

    /* renamed from: m  reason: collision with root package name */
    public final Dimension f31228m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f31229n;

    static {
        new Dimension(320, 240);
    }

    public a(c cVar) {
        boolean z10;
        cVar.readUnsignedInt();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        this.f31217a = cVar.m();
        this.f31218b = cVar.m();
        this.c = new String(cVar.h(4));
        int readUnsignedInt2 = (int) cVar.readUnsignedInt();
        this.f31219d = readUnsignedInt2 >> 16;
        this.f31220e = readUnsignedInt2 & Variant.VT_ILLEGAL;
        this.f31221f = (int) cVar.readUnsignedInt();
        this.f31222g = (int) cVar.readUnsignedInt();
        this.f31223h = cVar.readUnsignedShort();
        cVar.readUnsignedShort();
        int readUnsignedInt3 = (int) cVar.readUnsignedInt();
        int readUnsignedInt4 = (int) cVar.readUnsignedInt();
        this.f31225j = (int) cVar.readUnsignedInt();
        this.f31226k = cVar.n();
        this.f31227l = cVar.n();
        int i10 = 88;
        if (readUnsignedInt4 > 88) {
            cVar.readUnsignedInt();
            cVar.readUnsignedInt();
            if (((int) cVar.readUnsignedInt()) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31229n = z10;
            i10 = 100;
            if (readUnsignedInt4 > 100) {
                this.f31228m = cVar.n();
                i10 = 108;
            }
        }
        if (i10 < readUnsignedInt4) {
            cVar.skipBytes(readUnsignedInt4 - i10);
        } else {
            readUnsignedInt4 = i10;
        }
        this.f31224i = cVar.o(readUnsignedInt3);
        int i11 = (readUnsignedInt3 * 2) + readUnsignedInt4;
        if (i11 < readUnsignedInt) {
            cVar.skipBytes(readUnsignedInt - i11);
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("EMF Header\n  bounds: ");
        stringBuffer.append(this.f31217a);
        stringBuffer.append("\n  frame: ");
        stringBuffer.append(this.f31218b);
        stringBuffer.append("\n  signature: ");
        stringBuffer.append(this.c);
        stringBuffer.append("\n  versionMajor: ");
        stringBuffer.append(this.f31219d);
        stringBuffer.append("\n  versionMinor: ");
        stringBuffer.append(this.f31220e);
        stringBuffer.append("\n  #bytes: ");
        stringBuffer.append(this.f31221f);
        stringBuffer.append("\n  #records: ");
        stringBuffer.append(this.f31222g);
        stringBuffer.append("\n  #handles: ");
        stringBuffer.append(this.f31223h);
        stringBuffer.append("\n  description: ");
        stringBuffer.append(this.f31224i);
        stringBuffer.append("\n  #palEntries: ");
        stringBuffer.append(this.f31225j);
        stringBuffer.append("\n  device: ");
        stringBuffer.append(this.f31226k);
        stringBuffer.append("\n  millimeters: ");
        stringBuffer.append(this.f31227l);
        stringBuffer.append("\n  openGL: ");
        stringBuffer.append(this.f31229n);
        stringBuffer.append("\n  micrometers: ");
        stringBuffer.append(this.f31228m);
        return stringBuffer.toString();
    }
}
