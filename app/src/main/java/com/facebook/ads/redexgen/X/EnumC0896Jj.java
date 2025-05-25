// Auto-fixed: added missing class declaration
public class EnumC0896Jj {
package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Jj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0896Jj implements Serializable {
    A05(320, 50),
    A08(0, 0),
    A06(-1, 50),
    A07(-1, 90),
    A09(-1, 250);
    
    public static byte[] A02 = null;
    public static String[] A03 = {"Tf0gzpE1z0DOygMknAScYVGYgxUCN6If", "OJWxv0TW5miQ3Kn", "GlLNElMoCA8", "Xgk0OdYHTIXe2Q1HA3YZKPRbdeS7oU4D", "PHyDcqcelsxe2C8hrB0OPMJ92C1p28xb", "tjympuwDZEvmjp4dt80fu9pzZi", "KXSmHfhq6DtFyO2I4KCsZ7pXn2h8CepA", "nIUh7sEtDWkIx81Fpy5uA9wFEXEhOC2B"};
    public static final long serialVersionUID = 42;
    public final int A00;
    public final int A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].charAt(1) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "VIfYmPrZv6LGyPijtMThbF852HrrLBlI";
            strArr[6] = "4hX5Bu6XJriXyO1ylOVNaDjvP68bIemq";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 68);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{15, 12, 3, 3, 8, 31, 18, 126, Byte.MAX_VALUE, 125, 18, 120, 125, Field.EQ, Field.GOTOBUTTON, 61, 61, Field.AUTONUM, 33, 44, 59, Field.AUTONUM, 58, Field.AUTONUMOUT, 59, Field.FILLIN, 44, Field.FORMTEXT, Field.INCLUDEPICTURE, 61, Field.USERADDRESS, Field.EQ, Field.EQ, 58, Field.DDE, 32, Field.IMPORT, 58, Field.AUTONUM, 56, Field.IMPORT, 43, 32, Field.FORMTEXT, Field.AUTOTEXT, 97, 102, 124, 109, 122, 123, 124, 97, 124, 97, 105, 100, 36, Field.MACROBUTTON, Field.AUTONUMLGL, 34, Field.IMPORT, 56, Field.EQ, 58, Field.MACROBUTTON, 41, Field.USERADDRESS, Field.MACROBUTTON, Field.BARCODE, Field.EQ, Field.USERADDRESS, 34, 41, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.FORMTEXT};
    }

    static {
        A01();
    }

    EnumC0896Jj(int i10, int i11) {
        this.A01 = i10;
        this.A00 = i11;
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }
}

}
