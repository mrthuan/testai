package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public abstract class D0 {
    public static byte[] A00;
    public static String[] A01 = {"qTZEp", "4FC", "GVjMT7IO", "idgz8GTtDxXm2DT6Q4W8HIp0oNrYHYmb", "FbpHKh3QT1SdWaw7OeCQFPuoblxH9zoB", "jQTmnshEA3vQhZuIt4EWQ9mfUiSmLT6K", "Lm0", "luRz3eSIkgTHKYiDYnp1YmzqTFiN9rHv"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0751Cz A04(I4 i42) throws A0 {
        A0A(1, i42, false);
        long A0K = i42.A0K();
        int A0E = i42.A0E();
        long A0K2 = i42.A0K();
        int A0A = i42.A0A();
        int A0A2 = i42.A0A();
        int A0A3 = i42.A0A();
        int A0E2 = i42.A0E();
        return new C0751Cz(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (i42.A0E() & 1) > 0, Arrays.copyOf(i42.A00, i42.A07()));
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ ShapeTypes.VERTICAL_SCROLL);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{82, 107, 118, 102, 109, 119, Field.ADDIN, 112, 109, 104, Field.QUOTE, Field.USERADDRESS, Field.AUTONUM, Field.QUOTE, Field.PAGEREF, Field.GOTOBUTTON, Field.QUOTE, 34, 102, Field.PAGEREF, Field.DDEAUTO, Field.FILLIN, Field.AUTONUMOUT, Field.FILLIN, Field.PAGEREF, Field.GOTOBUTTON, Field.QUOTE, Field.AUTONUMOUT, Field.AUTONUMLGL, 102, 97, 48, 41, Field.AUTONUMOUT, 36, Field.GLOSSARY, Field.AUTONUMLGL, 97, Field.PAGEREF, 56, 48, Field.PAGEREF, Field.QUOTE, Field.AUTONUMOUT, Field.PAGEREF, 36, 96, Field.QUOTE, Field.GLOSSARY, 36, Field.PAGEREF, 96, 34, Field.GLOSSARY, Field.GLOSSARY, 43, 96, Field.AUTONUMOUT, Field.GLOSSARY, 96, Field.MACROBUTTON, Field.AUTONUMOUT, 33, Field.GOTOBUTTON, Field.AUTONUMOUT, 96, Field.IMPORT, 41, Field.AUTONUMOUT, Field.DATA, 96, Field.NUMWORDS, 112, 56, 117, 118, 108, 96, 112, 56, 116, 115, 108, 96, 112, 56, 116, 114, 29, 96, 33, Field.AUTONUMOUT, 96, 122, 103, 111, 122, 124, 107, 122, 123, Field.BARCODE, 119, 122, 126, 123, 122, 109, Field.BARCODE, 107, 102, 111, 122, Field.BARCODE, 59, Field.EQ, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.GLOSSARY, 125, 41, 36, Field.DDE, 56, 125, 58, Field.GLOSSARY, 56, 60, 41, 56, Field.GLOSSARY, 125, 41, Field.AUTONUMLGL, 60, Field.MACROBUTTON, 125, 108, 125, Field.MACROBUTTON, Field.GOTOBUTTON, 41, 125, Field.SYMBOL, 56, Field.USERADDRESS, Field.GOTOBUTTON, Field.SYMBOL, 60, Field.BARCODE, Field.EQ, 56, 103, 125, 123, 111, 124, 112, 116, 115, 122, 61, Byte.MAX_VALUE, 116, 105, 61, 124, 123, 105, 120, 111, 61, 112, 114, 121, 120, 110, 61, 115, 114, 105, 61, 110, 120, 105, 61, 124, 110, 61, 120, 101, 109, 120, 126, 105, 120, 121, 32, Field.AUTONUMOUT, Field.FILLIN, 43, Field.GLOSSARY, Field.DATA, 33, 102, 36, Field.GLOSSARY, Field.GOTOBUTTON, 102, Field.QUOTE, Field.USERADDRESS, Field.AUTONUM, Field.QUOTE, Field.PAGEREF, Field.GOTOBUTTON, Field.QUOTE, 34, 102, Field.GOTOBUTTON, 41, 102, 36, Field.QUOTE, 102, Field.AUTONUMLGL, Field.QUOTE, Field.GOTOBUTTON, 77, 78, 78, 74, Field.ADVANCE, Field.ADDIN, 1, Field.DOCPROPERTY, Field.HYPERLINK, Field.ADDIN, Field.INCLUDETEXT, 1, Field.FORMTEXT, Field.FORMDROPDOWN, Field.INCLUDETEXT, 64, Field.DOCPROPERTY, Field.INCLUDETEXT, Field.FORMDROPDOWN, 1, Field.DOCPROPERTY, Field.TOA, 64, Field.AUTOTEXT, 1, 19, 1, Field.AUTOTEXT, 78, Field.DOCPROPERTY, 1, Field.FILESIZE, Field.INCLUDETEXT, Field.SECTIONPAGES, 78, Field.FILESIZE, 64, Field.INCLUDEPICTURE, 77, Field.INCLUDETEXT, Field.NUMWORDS, 1, 114, 126, 111, 111, 118, 113, 120, Field.BARCODE, 107, 102, 111, 122, Field.BARCODE, 112, 107, 119, 122, 109, Field.BARCODE, 107, 119, 126, 113, Field.BARCODE, Field.GLOSSARY, Field.BARCODE, 113, 112, 107, Field.BARCODE, 108, 106, 111, 111, 112, 109, 107, 122, 123, Field.PAGEREF, Field.BARCODE, 76, 80, Field.ADDRESSBLOCK, Field.SHAPE, Field.AUTOTEXTLIST, Field.ADVANCE, Field.FORMDROPDOWN, 80, Field.HYPERLINK, Field.AUTOTEXTLIST, 78, Field.NUMCHARS, Field.FORMDROPDOWN, Field.LISTNUM, Field.NUMCHARS, Field.NOTEREF, Field.DOCPROPERTY, Field.ADDIN, Field.AUTOTEXTLIST, Field.NUMCHARS, Field.HYPERLINK, Field.FORMDROPDOWN, Field.ADDIN, Field.ADDRESSBLOCK, Field.DOCPROPERTY, 82, Field.NUMCHARS, Field.NOTEREF, 78, Field.ADDRESSBLOCK, 82, Field.AUTOTEXT, Field.LISTNUM, Field.FORMDROPDOWN, 78, Field.ADDIN, Field.AUTOTEXT, Field.NUMCHARS, 82, Field.FORMDROPDOWN, Field.NOTEREF, Field.NUMCHARS, Field.FORMTEXT, Field.AUTOTEXTLIST, 78, Field.FORMDROPDOWN, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.NUMCHARS, Field.FORMDROPDOWN, Field.TOA, Field.NOTEREF, 48, Field.FILLIN, Field.EQ, 43, Field.ASK, Field.IMPORT, Field.FILLIN, 22, 59, Field.GOTOBUTTON, Field.FILLIN, 98, Field.PAGEREF, 48, Field.FILLIN, Field.QUOTE, Field.AUTONUM, Field.FILLIN, 48, 98, Field.AUTONUM, 42, Field.QUOTE, 44, 98, 112, 98, 43, Field.EQ, 98, 44, Field.DDE, Field.AUTONUM, 98, Field.ASK, Field.FILLIN, 33, Field.DDE, Field.ASK, Field.QUOTE, 32, Field.DDEAUTO, Field.FILLIN, 48, 43, 100, Field.AUTONUM, 33, Field.IMPORT, 33, Field.AUTONUM, Field.GOTOBUTTON, 33, 32, 100, Field.ASK, Field.DDE, 48, Field.IMPORT, 100, 41, Field.EQ, Field.IMPORT, 48, 100, Field.ASK, 33, 100, Field.USERADDRESS, 33, Field.AUTONUM, 43, 100, Field.PAGEREF, 34, 48, 33, Field.AUTONUM, 100, 41, Field.PAGEREF, Field.AUTONUMOUT, Field.AUTONUMOUT, Field.DDE, 42, Field.QUOTE, 100, Field.FILLIN, 43, Field.EQ, Field.AUTONUMOUT, Field.DATA, Field.DDE, 42, Field.QUOTE, 100, Field.IMPORT, 48, 33, Field.AUTONUMOUT, Field.IMPORT, 4, 31, 31, 80, 3, 24, 31, 2, 4, 80, 24, 21, 17, 20, 21, 2, 74, 80};
    }

    static {
        A06();
    }

    public static int A00(int i10) {
        int val = 0;
        while (i10 > 0) {
            val++;
            i10 >>>= 1;
        }
        return val;
    }

    public static long A01(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x006d */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C0748Cw A02(com.facebook.ads.redexgen.X.C0746Cu r14) throws com.facebook.ads.redexgen.X.A0 {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D0.A02(com.facebook.ads.redexgen.X.Cu):com.facebook.ads.redexgen.X.Cw");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C0749Cx A03(com.facebook.ads.redexgen.X.I4 r9) throws com.facebook.ads.redexgen.X.A0 {
        /*
            r1 = 3
            r0 = 0
            A0A(r1, r9, r0)
            r3 = 7
            long r1 = r9.A0K()
            int r0 = (int) r1
            int r1 = r3 + 4
            java.lang.String r7 = r9.A0S(r0)
            int r0 = r7.length()
            int r1 = r1 + r0
            long r2 = r9.A0K()
            int r0 = (int) r2
            java.lang.String[] r6 = new java.lang.String[r0]
            int r1 = r1 + 4
            r8 = 0
        L20:
            long r4 = (long) r8
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3c
            long r4 = r9.A0K()
            int r0 = (int) r4
            int r1 = r1 + 4
            java.lang.String r0 = r9.A0S(r0)
            r6[r8] = r0
            r0 = r6[r8]
            int r0 = r0.length()
            int r1 = r1 + r0
            int r8 = r8 + 1
            goto L20
        L3c:
            int r0 = r9.A0E()
            r0 = r0 & 1
            if (r0 == 0) goto L4c
            int r1 = r1 + 1
            com.facebook.ads.redexgen.X.Cx r0 = new com.facebook.ads.redexgen.X.Cx
            r0.<init>(r7, r6, r1)
            return r0
        L4c:
            r2 = 198(0xc6, float:2.77E-43)
            r1 = 30
            r0 = 57
            java.lang.String r1 = A05(r2, r1, r0)
            com.facebook.ads.redexgen.X.A0 r0 = new com.facebook.ads.redexgen.X.A0
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D0.A03(com.facebook.ads.redexgen.X.I4):com.facebook.ads.redexgen.X.Cx");
    }

    public static void A07(int i10, C0746Cu c0746Cu) throws A0 {
        int submaps;
        int A02 = c0746Cu.A02(6) + 1;
        for (int i11 = 0; i11 < A02; i11++) {
            int A022 = c0746Cu.A02(16);
            switch (A022) {
                case 0:
                    if (c0746Cu.A04()) {
                        submaps = c0746Cu.A02(4) + 1;
                    } else {
                        submaps = 1;
                    }
                    if (c0746Cu.A04()) {
                        int i12 = c0746Cu.A02(8);
                        int i13 = i12 + 1;
                        for (int i14 = 0; i14 < i13; i14++) {
                            int mappingsCount = i10 - 1;
                            c0746Cu.A03(A00(mappingsCount));
                            int mappingsCount2 = i10 - 1;
                            c0746Cu.A03(A00(mappingsCount2));
                        }
                    }
                    if (A01[6].length() != 3) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "JOEGydLRZ18FabkiFWUulairw0GZ2Gkh";
                    strArr[7] = "5Wral0wZEQZa4E9pz2QUd29KUvRb4rco";
                    int mappingsCount3 = c0746Cu.A02(2);
                    if (mappingsCount3 == 0) {
                        if (submaps > 1) {
                            for (int mappingsCount4 = 0; mappingsCount4 < i10; mappingsCount4++) {
                                c0746Cu.A03(4);
                            }
                        }
                        for (int mappingsCount5 = 0; mappingsCount5 < submaps; mappingsCount5++) {
                            c0746Cu.A03(8);
                            c0746Cu.A03(8);
                            c0746Cu.A03(8);
                        }
                        break;
                    } else {
                        throw new A0(A05(TTAdConstant.LANDING_PAGE_TYPE_CODE, 58, 59));
                    }
                default:
                    Log.e(A05(0, 10, 123), A05(270, 41, 96) + A022);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(com.facebook.ads.redexgen.X.C0746Cu r16) throws com.facebook.ads.redexgen.X.A0 {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D0.A08(com.facebook.ads.redexgen.X.Cu):void");
    }

    public static void A09(C0746Cu c0746Cu) throws A0 {
        int A02 = c0746Cu.A02(6) + 1;
        for (int i10 = 0; i10 < A02; i10++) {
            int residueCount = c0746Cu.A02(16);
            if (residueCount <= 2) {
                c0746Cu.A03(24);
                c0746Cu.A03(24);
                c0746Cu.A03(24);
                int A022 = c0746Cu.A02(6) + 1;
                c0746Cu.A03(8);
                int[] iArr = new int[A022];
                for (int i11 = 0; i11 < A022; i11++) {
                    int i12 = 0;
                    int lowBits = c0746Cu.A02(3);
                    String[] strArr = A01;
                    String str = strArr[5];
                    String str2 = strArr[7];
                    int residueCount2 = str.charAt(15);
                    if (residueCount2 == str2.charAt(15)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "Fzm";
                    if (c0746Cu.A04()) {
                        i12 = c0746Cu.A02(5);
                    }
                    iArr[i11] = (i12 * 8) + lowBits;
                }
                for (int i13 = 0; i13 < A022; i13++) {
                    for (int i14 = 0; i14 < 8; i14++) {
                        int residueCount3 = iArr[i13];
                        if ((residueCount3 & (1 << i14)) != 0) {
                            c0746Cu.A03(8);
                        }
                    }
                }
            } else {
                throw new A0(A05(363, 43, 61));
            }
        }
    }

    public static boolean A0A(int i10, I4 i42, boolean z10) throws A0 {
        if (i42.A04() < 7) {
            if (z10) {
                return false;
            }
            throw new A0(A05(464, 18, 15) + i42.A04());
        } else if (i42.A0E() != i10) {
            if (z10) {
                return false;
            }
            throw new A0(A05(93, 21, 96) + Integer.toHexString(i10));
        } else {
            if (i42.A0E() == 118 && i42.A0E() == 111 && i42.A0E() == 114 && i42.A0E() == 98 && i42.A0E() == 105) {
                int A0E = i42.A0E();
                if (A01[0].length() == 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[3] = "cEFw80voMQ3YbzzTADHjyBYd9BAt2Eq9";
                strArr[4] = "t97577fmCTvKx9PENiZekz1qhGw5m7zB";
                if (A0E == 115) {
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            throw new A0(A05(10, 28, 57));
        }
    }

    public static C0750Cy[] A0B(C0746Cu c0746Cu) {
        int A02 = c0746Cu.A02(6) + 1;
        C0750Cy[] c0750CyArr = new C0750Cy[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = c0746Cu.A04();
            int A022 = c0746Cu.A02(16);
            int i10 = c0746Cu.A02(16);
            c0750CyArr[windowType] = new C0750Cy(A04, A022, i10, c0746Cu.A02(8));
        }
        return c0750CyArr;
    }

    public static C0750Cy[] A0C(I4 i42, int i10) throws A0 {
        A0A(5, i42, false);
        int A0E = i42.A0E() + 1;
        C0746Cu c0746Cu = new C0746Cu(i42.A00);
        int numberOfBooks = i42.A06();
        c0746Cu.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0E; numberOfBooks2++) {
            A02(c0746Cu);
        }
        int numberOfBooks3 = c0746Cu.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i11 = 0; i11 < timeCount; i11++) {
            int numberOfBooks4 = c0746Cu.A02(16);
            if (numberOfBooks4 != 0) {
                throw new A0(A05(311, 52, 67));
            }
        }
        A08(c0746Cu);
        A09(c0746Cu);
        A07(i10, c0746Cu);
        C0750Cy[] A0B = A0B(c0746Cu);
        if (c0746Cu.A04()) {
            return A0B;
        }
        throw new A0(A05(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, 43, 98));
    }
}
