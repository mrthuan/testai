package xi;

import lib.zj.office.java.awt.Rectangle;

/* compiled from: GradientFill.java */
/* loaded from: classes3.dex */
public final class m0 extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31734d;

    /* renamed from: e  reason: collision with root package name */
    public final i2[] f31735e;

    /* renamed from: f  reason: collision with root package name */
    public final r.d[] f31736f;

    public m0() {
        super(118);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        i2[] i2VarArr = new i2[readUnsignedInt];
        int readUnsignedInt2 = (int) cVar.readUnsignedInt();
        r.d[] dVarArr = new r.d[readUnsignedInt2];
        int readUnsignedInt3 = (int) cVar.readUnsignedInt();
        for (int i11 = 0; i11 < readUnsignedInt; i11++) {
            i2VarArr[i11] = new i2(cVar);
        }
        for (int i12 = 0; i12 < readUnsignedInt2; i12++) {
            if (readUnsignedInt3 == 2) {
                dVarArr[i12] = new o0(cVar);
            } else {
                dVarArr[i12] = new n0(cVar);
            }
        }
        return new m0(m10, readUnsignedInt3, i2VarArr, dVarArr);
    }

    @Override // wi.e
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("\n  bounds: ");
        stringBuffer.append(this.c);
        stringBuffer.append("\n  mode: ");
        stringBuffer.append(this.f31734d);
        stringBuffer.append("\n");
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i2[] i2VarArr = this.f31735e;
            if (i11 >= i2VarArr.length) {
                break;
            }
            stringBuffer.append("  vertex[");
            stringBuffer.append(i11);
            stringBuffer.append("]: ");
            stringBuffer.append(i2VarArr[i11]);
            stringBuffer.append("\n");
            i11++;
        }
        while (true) {
            r.d[] dVarArr = this.f31736f;
            if (i10 < dVarArr.length) {
                stringBuffer.append("  gradient[");
                stringBuffer.append(i10);
                stringBuffer.append("]: ");
                stringBuffer.append(dVarArr[i10]);
                stringBuffer.append("\n");
                i10++;
            } else {
                return stringBuffer.toString();
            }
        }
    }

    public m0(Rectangle rectangle, int i10, i2[] i2VarArr, r.d[] dVarArr) {
        this();
        this.c = rectangle;
        this.f31734d = i10;
        this.f31735e = i2VarArr;
        this.f31736f = dVarArr;
    }
}
