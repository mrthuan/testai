package xi;

import android.graphics.Point;
import java.nio.charset.Charset;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: ExtTextOutA.java */
/* loaded from: classes3.dex */
public final class g0 extends d {

    /* renamed from: g  reason: collision with root package name */
    public final g2 f31706g;

    public g0() {
        super(83, null, 0, 1.0f, 1.0f);
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
        String str = new String(cVar.h(readUnsignedInt2), Charset.defaultCharset().name());
        int i11 = readUnsignedInt2 % 4;
        if (i11 != 0) {
            for (int i12 = 0; i12 < 4 - i11; i12++) {
                cVar.readByte();
            }
        }
        int[] iArr = new int[readUnsignedInt2];
        for (int i13 = 0; i13 < readUnsignedInt2; i13++) {
            iArr[i13] = (int) cVar.readUnsignedInt();
        }
        return new g0(m10, readUnsignedInt, readFloat, readFloat2, new g2(j10, str, readUnsignedInt3, m11, iArr));
    }

    @Override // xi.d
    public final f2 d() {
        return this.f31706g;
    }

    public g0(Rectangle rectangle, int i10, float f10, float f11, g2 g2Var) {
        super(83, rectangle, i10, f10, f11);
        this.f31706g = g2Var;
    }
}
