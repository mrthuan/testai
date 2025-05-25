package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class X8 implements InterfaceC0838Gz {
    public static byte[] A03;
    public static String[] A04 = {"Ne7ZKUe", "PSO0U5rzFo7bmFbA9aIaTCLs4C45Ec76", "n2YcQoEvp", "A0Q5ZUOPoOCVUrviysnzG", "zb5q8BZfDBvmVPM7uFOoyQTMVCraB8xF", "52iGK0t26yzfPfzglwEyvTsLNRy5L", "Ycsm2ZrfC0lohk9KjHhsrMWfSuRqw1L2", "37ez3Sl1APBPbLkl98B7sVpsTL4MR"};
    public int A00;
    public H3 A01;
    public byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 115, 42, 41, 59, Field.DDE, 126, 124, Field.AUTOTEXTLIST, 110, 110, 115, 110, 60, 107, 116, 117, 112, 121, 60, 108, 125, 110, 111, 117, 114, 123, 60, Field.GREETINGLINE, 125, 111, 121, 42, Field.DATA, 60, 121, 114, Byte.MAX_VALUE, 115, 120, 121, 120, 60, 111, 104, 110, 117, 114, 123, Field.ASK, 60, 2, 4, 122, 22, 4, 20, 30, 30, Field.FILESIZE, 126, 117, 104, 96, 117, 115, 100, 117, 116, 48, Field.FILESIZE, Field.SECTIONPAGES, Field.AUTOTEXTLIST, 48, 118, Byte.MAX_VALUE, 98, 125, 113, 100, 42, 48, Field.HYPERLINK, 99, 126, 120, 125, 125, 98, Byte.MAX_VALUE, 121, 104, 105, Field.DDE, 126, 110, 101, 104, 96, 104, Field.IMPORT, Field.DDE, 118, 115, 102, 115};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        if (this.A01 != null) {
            H3 h32 = this.A01;
            if (A04[0].length() != 15) {
                A04[2] = "GK7vJTRqbjO3";
                return h32.A04;
            }
            throw new RuntimeException();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws IOException {
        this.A01 = h32;
        Uri uri = h32.A04;
        String scheme = uri.getScheme();
        if (A00(102, 4, 94).equals(scheme)) {
            String[] uriParts = IK.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 107));
            if (uriParts.length == 2) {
                String str = uriParts[1];
                String dataString = uriParts[0];
                if (dataString.contains(A00(1, 7, 4))) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e10) {
                        String scheme2 = A00(8, 43, 80) + str;
                        throw new A0(scheme2, e10);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, A00(51, 8, 27)).getBytes();
                }
                return this.A02.length;
            }
            String scheme3 = A00(59, 23, 92) + uri;
            throw new A0(scheme3);
        }
        String scheme4 = A00(82, 20, 65) + scheme;
        throw new A0(scheme4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int length = this.A02.length;
        if (A04[2].length() != 11) {
            A04[0] = "UkFdkMsPJijR7VnNGK8H6arT";
            int i12 = length - this.A00;
            if (i12 == 0) {
                return -1;
            }
            int min = Math.min(i11, i12);
            byte[] bArr2 = this.A02;
            int remainingBytes = this.A00;
            System.arraycopy(bArr2, remainingBytes, bArr, i10, min);
            int remainingBytes2 = this.A00;
            this.A00 = remainingBytes2 + min;
            return min;
        }
        throw new RuntimeException();
    }
}
