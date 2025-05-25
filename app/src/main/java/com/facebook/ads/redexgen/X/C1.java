package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class C1 {
    public static byte[] A02;
    public static String[] A03 = {"0aDEHir", "KeFAePI1lGBtE1CqAwqlTmaTiKQi585e", "oL2e04jbfOxdtKuwfeKQnW7E8P42I46y", "aGz9Hcb30XOvVP9HaLLwVPlUk", "Ko6ZwJto5HSbbo1gKWEXYnH6bpNNiPLs", "doxRQxYmnKukwMO8NbdWOtVN68TpFesA", "LAzIqji4IuYx9FVtRgQH7OQvPgoyEYhN", "CzXOhWpOkYu1cjXOwBdQnYqH0"};
    public static final InterfaceC0764Dn A04;
    public static final Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 46);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-83, 111, -86, Byte.MAX_VALUE, 124, -120, -80, 124, -75, -112, 124, -107, -84, -54, -121, -52, 111, 119, -86, Byte.MAX_VALUE, 124, -120, -80, 124, -75, -112, 124, -107, -84, -54, -121, -52, 120, 111, 119, -86, Byte.MAX_VALUE, 124, -120, -80, 124, -75, -112, 124, -107, -84, -54, -121, -52, 120, -99, -87, -89, 104, -101, -86, -86, -90, -97, 104, -93, -114, -81, -88, -97, -83, -4, -25, 8, 1, -26, -32, -29, -43};
        if (A03[5].charAt(25) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "VeQWCF02N5mb5X7ahc1LI9FSMTOHD8V3";
        strArr[2] = "hbqvlfSPUh2jdrc5qFStp6bRHKmwzne9";
        A02 = bArr;
    }

    static {
        A01();
        A04 = new C1285Yp();
        A05 = Pattern.compile(A00(0, 50, 33));
    }

    private boolean A02(String str) {
        Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i10) {
        int encoderPadding = i10 >> 12;
        int encoderDelay = i10 & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata r9) {
        /*
            r8 = this;
            r3 = 0
        L1:
            int r0 = r9.A00()
            if (r3 >= r0) goto L7a
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata$Entry r4 = r9.A01(r3)
            boolean r7 = r4 instanceof com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame
            r2 = 66
            r1 = 8
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r6 = A00(r2, r1, r0)
            r5 = 1
            if (r7 == 0) goto L4e
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame r4 = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame) r4
            java.lang.String r0 = r4.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = r4.A02
            boolean r4 = r8.A02(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1.A03
            r0 = 5
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 56
            if (r1 == r0) goto L3f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1.A03
            java.lang.String r1 = "KQWxn43FztGs1nSTIKFdJKZvnTIiAT7x"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "K3QOntDZZViFMWU0Bvdf3H2DebaVhORR"
            r0 = 1
            r2[r0] = r1
            if (r4 == 0) goto L77
            return r5
        L4e:
            boolean r0 = r4 instanceof com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame
            if (r0 == 0) goto L77
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame r4 = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame) r4
            r2 = 50
            r1 = 16
            r0 = 12
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.String r0 = r4.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = r4.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = r4.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L77
            return r5
        L77:
            int r3 = r3 + 1
            goto L1
        L7a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1.A05(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata):boolean");
    }
}
