package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.13  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass13 {
    A03(A00(37, 9, 98)),
    A05(A00(65, 9, 87)),
    A04(A00(46, 19, 70));
    
    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.SECTIONPAGES, Field.DOCPROPERTY, Field.SECTIONPAGES, 74, Field.AUTOTEXT, Field.SECTIONPAGES, Field.SECTION, Field.AUTOTEXT, Field.FORMTEXT, Field.SHAPE, Field.GREETINGLINE, 78, Field.SHAPE, 80, Field.FILESIZE, Field.HYPERLINK, Field.FORMCHECKBOX, Field.ADVANCE, 78, 80, Field.DOCPROPERTY, 78, Field.ADDRESSBLOCK, 80, Field.NOTEREF, Field.GREETINGLINE, Field.INCLUDETEXT, Field.FILESIZE, 8, 19, 19, 3, 15, 17, 29, 16, 16, Field.SECTION, 86, Field.SECTION, Field.TOA, 76, Field.SECTION, Field.SECTIONPAGES, 76, Field.FILESIZE, 106, 107, Field.HTMLCONTROL, 106, 101, 112, 109, 114, 97, Field.HTMLCONTROL, 101, 96, Field.HTMLCONTROL, 104, 101, 125, 107, 113, 112, 97, 122, 122, 74, 102, 120, 116, 121, 121};
    }

    static {
        A01();
    }

    AnonymousClass13(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
