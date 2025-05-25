package xi;

import android.graphics.Point;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: ExtTextOutW.java */
/* loaded from: classes3.dex */
public final class h0 extends d {

    /* renamed from: g  reason: collision with root package name */
    public final h2 f31709g;

    public h0() {
        super(84, null, 0, 1.0f, 1.0f);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        float readFloat = cVar.readFloat();
        float readFloat2 = cVar.readFloat();
        Point j10 = cVar.j();
        int readUnsignedInt2 = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        int readUnsignedInt3 = (int) cVar.readUnsignedInt();
        Rectangle m11 = cVar.m();
        cVar.readUnsignedInt();
        int i11 = readUnsignedInt2 * 2;
        String str = new String(cVar.h(i11), CharEncoding.UTF_16LE);
        int i12 = i11 % 4;
        if (i12 != 0) {
            for (int i13 = 0; i13 < 4 - i12; i13++) {
                cVar.readByte();
            }
        }
        int[] iArr = new int[readUnsignedInt2];
        for (int i14 = 0; i14 < readUnsignedInt2; i14++) {
            iArr[i14] = (int) cVar.readUnsignedInt();
        }
        return new h0(m10, readUnsignedInt, readFloat, readFloat2, new h2(j10, str, readUnsignedInt3, m11, iArr));
    }

    @Override // xi.d
    public final f2 d() {
        return this.f31709g;
    }

    public h0(Rectangle rectangle, int i10, float f10, float f11, h2 h2Var) {
        super(84, rectangle, i10, f10, f11);
        this.f31709g = h2Var;
    }
}
