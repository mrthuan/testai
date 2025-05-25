package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class DN extends Exception {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{122, 118, 64, 97, 103, 107, 96, 97, 118, 36, 109, 106, 109, 112, 36, 98, 101, 109, 104, 97, 96, Field.USERADDRESS, 36, Field.SECTIONPAGES, 99, 101, 105, 98, 99, 116, Field.ASK, 111, 104, 111, 114, Field.ASK, 96, 103, 111, 106, 99, 98, 60, Field.ASK, Field.ADDRESSBLOCK, 13, 124, 112, 56, Field.AUTONUMOUT, Field.AUTONUM, 117, 60, Field.AUTONUMOUT, Field.AUTONUMOUT, 60, Field.IMPORT, Field.USERADDRESS, 117, 58, Field.AUTONUMLGL, Field.BARCODE, 41, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.BARCODE, 117, Field.USERADDRESS, Field.QUOTE, Field.AUTONUMOUT, 43, Field.IMPORT, 58, 34, Field.USERADDRESS, 41, 117, 22, Field.USERADDRESS, Field.BARCODE, Field.GOTOBUTTON, 58, 24, Field.AUTONUMOUT, Field.BARCODE, Field.USERADDRESS, 56, 15, 41, 58, 56, 48, 9, Field.USERADDRESS, Field.AUTONUMLGL, Field.BARCODE, Field.USERADDRESS, 41, Field.USERADDRESS, 41, 4, 64, Field.MERGESEQ, Field.TOA, 113};
    }

    public DN(Format format, Throwable th2, boolean z10, int i10) {
        super(A01(23, 22, 14) + i10 + A01(45, 3, 88) + format, th2);
        this.A02 = format.A0O;
        this.A03 = z10;
        this.A00 = null;
        this.A01 = A00(i10);
    }

    public DN(Format format, Throwable th2, boolean z10, String str) {
        super(A01(2, 21, 12) + str + A01(0, 2, 94) + format, th2);
        this.A02 = format.A0O;
        this.A03 = z10;
        this.A00 = str;
        this.A01 = IK.A02 >= 21 ? A02(th2) : null;
    }

    public static String A00(int i10) {
        String A01 = i10 < 0 ? A01(101, 4, 38) : A01(0, 0, 87);
        StringBuilder sb2 = new StringBuilder();
        String sign = A01(48, 53, 83);
        return sb2.append(sign).append(A01).append(Math.abs(i10)).toString();
    }

    public static String A02(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
