package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Ch  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0733Ch {
    public static byte[] A00;
    public static String[] A01 = {"LDHS3H9YnUh7C7BCkh", "wC9e9nnwReFs9ZTI4bgFhMBKq7UfutKa", "dOVlFJvoAdJbJQKRw8v4NRbH1WbgG8Lt", "DZWYNPZ", "BS0YbHQAO0VU4qHMbgdjqGwsVP1Lt8hI", "pFDu33085QdGuzrGUL", "zTHWwR6874BSc50B06ceZtd8OhPobwtD", "iUZAADc"};
    public static final int[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{118, 34, 119, 36, 1, Field.DOCPROPERTY, 0, 80, 31, Field.MERGESEQ, Field.TOA, 26, 33, 117, 117, 36, 115, Field.FILLIN, 48, 16, Field.INCLUDETEXT, Field.ADDIN, 21, 31, Field.MERGESEQ, Field.SHAPE, 26, 21, 108, 25, 120, Field.FILESIZE, 60, Field.GREETINGLINE, Field.DATA, 123, 2, 96, 102, 122, 100, 121, 97, Field.EQ, Field.ASK, Field.MACROBUTTON, 97, 17, Field.INCLUDEPICTURE, 1, Field.CONTROL, 108, 97, 114, Field.AUTONUMLGL, 58, 36, Field.EQ, 99, 102, 124, 96, 61, Field.MERGESEQ, Field.ADDIN, 77, 17, Field.SECTIONPAGES, Field.HYPERLINK, Field.INCLUDETEXT, 31, Field.TOA, Field.FORMDROPDOWN, Field.AUTOTEXT, 21, 100, 126, 98, 59, 31, 5, 25, Field.NUMWORDS, 20, Field.NUMWORDS, Field.NUMWORDS, 22, Field.HTMLCONTROL, Field.FORMTEXT, 2, 7, 22, 11, Field.AUTOTEXT, Field.TOA, Field.HYPERLINK, Field.ADDRESSBLOCK, 9, 9};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e8, code lost:
        if (r14 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ec, code lost:
        if (r17 != r11) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        return r0;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.facebook.ads.redexgen.X.InterfaceC0724By r16, boolean r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0733Ch.A05(com.facebook.ads.redexgen.X.By, boolean):boolean");
    }

    static {
        A01();
        A02 = new int[]{IK.A08(A00(79, 4, 41)), IK.A08(A00(59, 4, 80)), IK.A08(A00(63, 4, 125)), IK.A08(A00(67, 4, 116)), IK.A08(A00(71, 4, ShapeTypes.VERTICAL_SCROLL)), IK.A08(A00(75, 4, 82)), IK.A08(A00(43, 4, 15)), IK.A08(A00(55, 4, 13)), IK.A08(A00(51, 4, 91)), IK.A08(A00(87, 4, 105)), IK.A08(A00(91, 4, 36)), IK.A08(A00(0, 4, 26)), IK.A08(A00(4, 4, 109)), IK.A08(A00(19, 4, 124)), IK.A08(A00(23, 4, 115)), IK.A08(A00(8, 4, 115)), IK.A08(A00(12, 4, 77)), IK.A08(A00(31, 4, 87)), IK.A08(A00(27, 4, 7)), IK.A08(A00(47, 4, 40)), IK.A08(A00(83, 4, 32)), IK.A08(A00(35, 4, 105)), IK.A08(A00(95, 4, 118)), IK.A08(A00(39, 4, 104))};
    }

    public static boolean A02(int i10) {
        if ((i10 >>> 8) == IK.A08(A00(16, 3, 31))) {
            return true;
        }
        for (int i11 : A02) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        return A05(interfaceC0724By, true);
    }

    public static boolean A04(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        return A05(interfaceC0724By, false);
    }
}
