package xi;

import lib.zj.office.java.awt.Color;

/* compiled from: ExtLogPen.java */
/* loaded from: classes3.dex */
public final class e0 extends e {

    /* renamed from: b  reason: collision with root package name */
    public final int f31682b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31683d;

    /* renamed from: e  reason: collision with root package name */
    public final Color f31684e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31685f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f31686g;

    public e0(wi.c cVar, int i10) {
        this.f31682b = (int) cVar.readUnsignedInt();
        this.c = (int) cVar.readUnsignedInt();
        this.f31683d = (int) cVar.readUnsignedInt();
        this.f31684e = cVar.i();
        this.f31685f = (int) cVar.readUnsignedInt();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        if (readUnsignedInt == 0 && i10 > 44) {
            cVar.readUnsignedInt();
        }
        int[] iArr = new int[readUnsignedInt];
        for (int i11 = 0; i11 < readUnsignedInt; i11++) {
            iArr[i11] = (int) cVar.readUnsignedInt();
        }
        this.f31686g = iArr;
    }

    @Override // xi.l0
    public final void a(wi.d dVar) {
        dVar.f31245p = false;
        dVar.f31240k.setColor(this.f31684e.getRGB());
        dVar.f31238i = e.b(dVar, this.f31682b, this.f31686g, this.c);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("  ExtLogPen\n    penStyle: ");
        stringBuffer.append(Integer.toHexString(this.f31682b));
        stringBuffer.append("\n    width: ");
        stringBuffer.append(this.c);
        stringBuffer.append("\n    brushStyle: ");
        stringBuffer.append(this.f31683d);
        stringBuffer.append("\n    color: ");
        stringBuffer.append(this.f31684e);
        stringBuffer.append("\n    hatch: ");
        stringBuffer.append(this.f31685f);
        stringBuffer.append("\n");
        int i10 = 0;
        while (true) {
            int[] iArr = this.f31686g;
            if (i10 < iArr.length) {
                stringBuffer.append("      style[");
                stringBuffer.append(i10);
                stringBuffer.append("]: ");
                stringBuffer.append(iArr[i10]);
                stringBuffer.append("\n");
                i10++;
            } else {
                return stringBuffer.toString();
            }
        }
    }
}
