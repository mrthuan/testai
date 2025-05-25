package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class YY extends CO {
    public static byte[] A03;
    public final long A00;
    public final List<YY> A01;
    public final List<YX> A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{121, 58, Field.AUTONUM, Field.IMPORT, Field.DDE, 56, 48, Field.IMPORT, 60, 43, 42, 99, 121, 24, Field.ADVANCE, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, 78, Field.ADDRESSBLOCK, Field.MERGESEQ, 2, 24};
    }

    public YY(int i10, long j10) {
        super(i10);
        this.A00 = j10;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final YY A06(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            YY yy = this.A01.get(i11);
            int childrenSize = ((CO) yy).A00;
            if (childrenSize == i10) {
                return yy;
            }
        }
        return null;
    }

    public final YX A07(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            YX yx = this.A02.get(i11);
            int childrenSize = ((CO) yx).A00;
            if (childrenSize == i10) {
                return yx;
            }
        }
        return null;
    }

    public final void A08(YY yy) {
        this.A01.add(yy);
    }

    public final void A09(YX yx) {
        this.A02.add(yx);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final String toString() {
        return CO.A02(super.A00) + A04(13, 9, 74) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 43) + Arrays.toString(this.A01.toArray());
    }
}
