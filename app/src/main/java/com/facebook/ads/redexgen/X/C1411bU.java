package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.bU  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1411bU implements C2C {
    public static byte[] A05;
    public static String[] A06 = {"41kFMkgYcMqjBdEAHWyZzQ9Q1YQDMkZo", "a1qrqbdzoLKte5dp2TdqsHV2Btmo8HIO", "VlRnhGghZyM7Xz", "WVmrs7jRPAo6ieNv", "abQhu9SgesOIRxLkCU6L7yAdrfeNFYXV", "iVqBhi5IkesALAcr", "e6wMTa30i0R6i9", "GTVyj1NjpD4uWxM1mBTnBnh1LH0X6W6g"};
    public final AbstractC1425bi A00;
    public final AnonymousClass20 A01;
    public final C1414bX A02;
    public final AnonymousClass27 A03;
    public final C1314Zs A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{110, Field.MERGESEQ, 15, 64, 77, Field.FILESIZE, 74, 76, Field.HTMLCONTROL, 15, Field.FORMTEXT, Field.BIDIOUTLINE, 15, Field.SECTION, Field.LISTNUM, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, 9, 30, 5, 15, 7, 14, 20, 14, 19, 31, 25, 10, 24, 20, 0, 14, 18, Field.GLOSSARY, 43, Field.DATA, Field.NUMCHARS, 13, 0, 12, 7, 10, 12, Field.FILLIN, 12, 29, 30, 6, Field.NUMWORDS, 2, Field.CONTROL, 80, 74, Field.SECTION, Field.HTMLCONTROL, 76, 76, Field.ADDIN, 76, Field.SECTION, Field.ADDRESSBLOCK, Field.ADDIN, Field.LISTNUM, Field.HTMLCONTROL, Field.SECTION, Field.DOCPROPERTY, Field.HTMLCONTROL, Field.FORMCHECKBOX, 14, 13, 12, 5, 29, 11, 12, 20, 3, 14, 11, 6, 3, 22, 11, 13, 12, 29, 22, 11, 15, 7, 29, 9, 7, Field.NUMWORDS, Field.FILLIN, 15, 25, 25, 11, 13, 15, 80, 74, 118, 82, Field.NOTEREF, Field.NOTEREF, 82, Field.DOCPROPERTY, Field.BIDIOUTLINE, Field.NUMWORDS, Field.AUTOTEXTLIST, 78, Field.DOCPROPERTY, Field.SHAPE, Field.CONTROL, Field.GREETINGLINE, Field.NUMWORDS, Field.ADDRESSBLOCK, Field.ADVANCE, Field.TOA, Field.NUMWORDS, 86, Field.GREETINGLINE, Field.NOTEREF, Field.NOTEREF, Field.LISTNUM, Field.BIDIOUTLINE, Field.GREETINGLINE, 21, Field.QUOTE, 36, 34, Field.GLOSSARY, Field.AUTONUMLGL, 34, 34, Field.BARCODE, 34, Field.GLOSSARY, 61, Field.AUTONUMLGL, Field.QUOTE, Field.QUOTE, Field.EQ, Field.IMPORT, Field.AUTONUMLGL, Field.GLOSSARY, 59, Field.AUTONUMLGL, 41, Field.NOTEREF, Field.AUTOTEXTLIST, 64};
    }

    static {
        A01();
    }

    public C1411bU(C1314Zs c1314Zs, C1414bX c1414bX, AnonymousClass20 anonymousClass20, AbstractC1425bi abstractC1425bi, AnonymousClass27 anonymousClass27) {
        this.A04 = c1314Zs;
        this.A02 = c1414bX;
        this.A01 = anonymousClass20;
        this.A00 = abstractC1425bi;
        this.A03 = anonymousClass27;
    }

    @Override // com.facebook.ads.redexgen.X.C2C
    public final Bundle A50(String str) {
        return C2J.A02(str, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C2C
    public final void A5S() {
        this.A03.A0F(1012, null);
        this.A03.A0C();
        this.A02.A0D(null);
    }

    @Override // com.facebook.ads.redexgen.X.C2C
    public final int A7h() {
        return 1010;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    @Override // com.facebook.ads.redexgen.X.C2C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A8u(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1411bU.A8u(android.os.Message):void");
    }
}
