package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Yr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1287Yr implements C0 {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC0723Bx> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{Field.ADDRESSBLOCK, 106, 106, 119, 106, 56, 113, 118, 107, 108, 121, 118, 108, 113, 121, 108, 113, 118, Byte.MAX_VALUE, 56, Field.GREETINGLINE, Field.ADVANCE, Field.AUTOTEXTLIST, Field.HTMLCONTROL, 56, 125, 96, 108, 125, 118, 107, 113, 119, 118, 74, 113, 122, 103, 111, 122, 124, 107, 122, 123, Field.BARCODE, 122, 109, 109, 112, 109, Field.BARCODE, 124, 109, 122, 126, 107, 118, 113, 120, Field.BARCODE, Field.AUTOTEXTLIST, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.BIDIOUTLINE, Field.BARCODE, 122, 103, 107, 109, 126, 124, 107, 112, 109, Field.AUTOTEXTLIST, Field.DOCPROPERTY, Field.CONTROL, 20, Field.BIDIOUTLINE, Field.HTMLCONTROL, Field.AUTOTEXTLIST, Field.SHAPE, Field.HYPERLINK, Field.DOCPROPERTY, Field.DOCPROPERTY, Field.ADDIN, 20, Field.HTMLCONTROL, Field.GREETINGLINE, Field.TOA, 20, Field.FORMDROPDOWN, Field.ADVANCE, 78, Field.SHAPE, Field.NOTEREF, Field.ADVANCE, Field.HTMLCONTROL, 86, 20, Field.SHAPE, Field.SECTIONPAGES, Field.DOCPROPERTY, 74, 86, Field.HTMLCONTROL, Field.INCLUDEPICTURE, Field.SHAPE, Field.NOTEREF, 8, 20, Field.SHAPE, Field.SECTIONPAGES, 78, 20, Field.BIDIOUTLINE, 86, Field.HTMLCONTROL, Field.AUTOTEXTLIST, 20, 124, 86, Field.HTMLCONTROL, Field.AUTOTEXTLIST, Byte.MAX_VALUE, Field.SECTIONPAGES, 78, Field.NOTEREF, Field.HTMLCONTROL, Field.AUTOTEXTLIST, 78, Field.DOCPROPERTY, Field.NOTEREF};
    }

    static {
        A01();
        Constructor<? extends InterfaceC0723Bx> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 113)).asSubclass(InterfaceC0723Bx.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException(A00(0, 34, 83), e10);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.C0
    public final synchronized InterfaceC0723Bx[] A4x() {
        InterfaceC0723Bx[] interfaceC0723BxArr;
        interfaceC0723BxArr = new InterfaceC0723Bx[A07 == null ? 12 : 13];
        interfaceC0723BxArr[0] = new C1272Yc(this.A01);
        interfaceC0723BxArr[1] = new YS(this.A00);
        interfaceC0723BxArr[2] = new YQ(this.A03);
        interfaceC0723BxArr[3] = new YZ(this.A02);
        interfaceC0723BxArr[4] = new YC();
        interfaceC0723BxArr[5] = new YF();
        interfaceC0723BxArr[6] = new C1263Xt(this.A05, this.A04);
        interfaceC0723BxArr[7] = new C1279Yj();
        interfaceC0723BxArr[8] = new YK();
        interfaceC0723BxArr[9] = new C1269Xz();
        interfaceC0723BxArr[10] = new C1261Xr();
        interfaceC0723BxArr[11] = new C1282Ym();
        if (A07 != null) {
            try {
                interfaceC0723BxArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException(A00(34, 40, 84), e10);
            }
        }
        return interfaceC0723BxArr;
    }
}
