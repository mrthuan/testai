package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class DH {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{100, Field.ADVANCE, 86, Field.ADDRESSBLOCK, 86, Field.SECTION, 82, Field.FORMCHECKBOX, 86, 125, 86, Field.INCLUDETEXT, 122, Field.CONTROL, Field.NUMWORDS, 26, 19, Field.GREETINGLINE, Field.FORMTEXT, 64, Field.FORMCHECKBOX, 19, Field.ADDIN, 86, 19, 80, 82, Field.SHAPE, Field.SHAPE, 86, Field.CONTROL, 19, Field.ADDIN, 86, Field.DOCPROPERTY, Field.BIDIOUTLINE, Field.SECTION, 86, 19, Field.SECTION, 86, Field.FORMCHECKBOX, Field.SECTION, Field.LISTNUM, 86, Field.FILESIZE, Field.LISTNUM, Field.ADDRESSBLOCK, Field.ADVANCE, 19, Field.LISTNUM, Field.CONTROL, 64, 29};
    }

    public DH(int i10, int i11) {
        this(SlideAtom.USES_MASTER_SLIDE_ID, i10, i11);
    }

    public DH(int i10, int i11, int i12) {
        this.A04 = i10 != Integer.MIN_VALUE ? i10 + A00(0, 1, 37) : A00(0, 0, 23);
        this.A02 = i11;
        this.A03 = i12;
        this.A00 = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException(A00(1, 53, 93));
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        this.A00 = this.A00 == Integer.MIN_VALUE ? this.A02 : this.A00 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
