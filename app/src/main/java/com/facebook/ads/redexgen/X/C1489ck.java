package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.ck  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1489ck extends AbstractC04390h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, Field.MACROBUTTON, Field.AUTONUM, Field.GLOSSARY, Field.DDEAUTO, -22, Field.USERADDRESS, Field.SYMBOL, -22, Field.SYMBOL, 58, Field.GLOSSARY, 56, -22, Field.AUTONUM, Field.MACROBUTTON, 56, Field.AUTONUMLGL, -22, Field.BARCODE, 60, Field.AUTONUM, 4, -22};
    }

    static {
        A01();
        A02 = C1489ck.class.getSimpleName();
    }

    public C1489ck(C1314Zs c1314Zs, J7 j72, String str, Uri uri) {
        super(c1314Zs, j72, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04390h
    public final EnumC04380g A0C() {
        try {
            L2.A0D(new L2(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC04380g.A09;
    }
}
