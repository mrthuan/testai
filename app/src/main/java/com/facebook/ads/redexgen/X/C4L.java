package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.4L  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4L {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass56 A04;
    public AnonymousClass56 A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, Field.DATA, Field.AUTONUMLGL, Field.IMPORT, 2, 103, 14, 2, Field.INCLUDETEXT, 80, 77, Field.AUTOTEXT, 123, 31, 76, 64, 14, 5, 23, Field.DATA, 15, 12, 4, 5, 18, Field.ADDRESSBLOCK, 86, Field.LISTNUM, 14, 21, 34, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.MERGESEQ, 31, 4, Field.GOTOBUTTON, 86, 109, Field.FORMTEXT, Field.AUTOTEXT, 64, Field.TOA, Field.MERGESEQ, 103, 64, Field.NOTEREF, Field.SECTION, Field.DOCPROPERTY, Field.SECTION, Field.SECTIONPAGES, 74, 102, Field.SECTION, Field.SECTIONPAGES, 74, Field.MERGESEQ, Field.BIDIOUTLINE, 19};
    }

    public C4L(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562) {
        this.A05 = anonymousClass56;
        this.A04 = anonymousClass562;
    }

    public C4L(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, int i10, int i11, int i12, int i13) {
        this(anonymousClass56, anonymousClass562);
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A03 = i13;
    }

    public final String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + '}';
    }
