package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.adjust.sdk.network.ErrorCodes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class DW {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"KyUIazmDYRjHGIYmM", "vQ7MPDC9OxlEQa1IJnKsCbnMY25pV9Py", "oIY4tBYD3sYPgYHy5PuZ8JwrQPquqjMA", "vRxUo5t7WeracVAtrgWMVLiyWCaBJb7M", "RvXFZZsiaZmjdaxyxnCHLoHhYQiV7o", "vBhnj9ZoedWgTZMIFLvOvTo0B13knnsy", "vqETaYR", "Sf"};
    public static final SparseIntArray A03;
    public static final SparseIntArray A04;
    public static final DL A05;
    public static final HashMap<DT, List<DL>> A06;
    public static final Map<String, Integer> A07;
    public static final Pattern A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static int A00() throws DU {
        if (A00 == -1) {
            int i10 = 0;
            DL A062 = A06(A07(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 9, 115), false);
            if (A062 != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A062.A0J()) {
                    i10 = Math.max(A01(codecProfileLevel.level), i10);
                }
                i10 = Math.max(i10, IK.A02 >= 21 ? 345600 : 172800);
            }
            A00 = i10;
        }
        return A00;
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
            if (A02[7].length() != 2) {
                throw new RuntimeException();
            }
            A02[4] = "BD020y3FFzLQ4T6FngoIJN6dqP5f0s";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r17.A01 == false) goto L45;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: Exception -> 0x0132, TRY_ENTER, TryCatch #5 {Exception -> 0x0132, blocks: (B:6:0x0022, B:8:0x002a, B:11:0x0036, B:34:0x00a6, B:37:0x00b6, B:39:0x00bc, B:45:0x00f6, B:46:0x0131, B:40:0x00e7, B:41:0x00eb), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.X.DL> A08(com.facebook.ads.redexgen.X.DT r17, com.facebook.ads.redexgen.X.DV r18, java.lang.String r19) throws com.facebook.ads.redexgen.X.DU {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DW.A08(com.facebook.ads.redexgen.X.DT, com.facebook.ads.redexgen.X.DV, java.lang.String):java.util.ArrayList");
    }

    public static void A0A() {
        byte[] bArr = {78, Field.FORMTEXT, 1, 9, Field.FORMCHECKBOX, 64, Field.NOTEREF, 77, Field.INCLUDETEXT, Field.FILESIZE, 1, Field.DOCPROPERTY, 78, 1, 80, Field.ADVANCE, Field.INCLUDETEXT, Field.FORMDROPDOWN, Field.HYPERLINK, 1, Field.SECTIONPAGES, 64, Field.ADDIN, 64, Field.INCLUDEPICTURE, Field.NOTEREF, 77, Field.NOTEREF, Field.DOCPROPERTY, Field.NOTEREF, Field.INCLUDETEXT, 82, 8, 115, 126, 112, 17, Field.QUOTE, Field.QUOTE, Field.PAGEREF, 61, Field.SYMBOL, Field.USERADDRESS, Field.IMPORT, 106, 112, 125, 32, Field.AUTONUM, 48, Field.ASK, 33, Field.AUTONUM, 112, Field.AUTONUMLGL, Field.PAGEREF, 33, Field.PAGEREF, Field.SECTIONPAGES, 82, Field.DDEAUTO, Field.DDEAUTO, 44, 43, 10, 12, 0, 11, 10, 29, 56, 74, 78, Field.MERGESEQ, Field.AUTOTEXT, 120, 10, 14, 11, 14, 30, 108, 107, 109, 105, 103, 21, 18, 20, 17, 108, 25, 25, 31, 29, 24, 109, 109, 107, 104, Field.GOTOBUTTON, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.SECTION, Field.FORMCHECKBOX, Field.INCLUDETEXT, Field.EQ, Field.EQ, Field.AUTONUM, Field.EQ, 106, 96, 121, 104, 104, 106, 109, 76, 74, Field.FORMTEXT, 77, 76, Field.HTMLCONTROL, 1, 11, 18, 3, 15, 16, 12, 0, 6, Field.FILLIN, 33, Field.DDE, Field.ASK, Field.FILLIN, 48, 110, 100, 125, 96, 125, 30, 105, Field.NOTEREF, 78, Field.SECTIONPAGES, Field.TOA, Field.NOTEREF, Field.SHAPE, 110, 100, 125, 123, Field.SECTIONPAGES, Field.SHAPE, Field.AUTOTEXT, Field.INCLUDETEXT, Field.GREETINGLINE, 105, Field.NOTEREF, 78, Field.SECTIONPAGES, Field.TOA, Field.NOTEREF, Field.SHAPE, 101, Field.SECTIONPAGES, 74, Field.AUTOTEXT, Field.FORMTEXT, Field.FORMCHECKBOX, 3, Field.CONTROL, 76, 3, 82, 86, Field.FORMTEXT, Field.ADDIN, Field.LISTNUM, 3, 64, 76, Field.FORMCHECKBOX, Field.FORMTEXT, 64, 3, 10, 115, 112, 114, 2, 123, 120, 121, Field.SECTION, 56, 60, Field.SYMBOL, 31, 102, 98, 100, 1, 120, 124, Byte.MAX_VALUE, Field.FILLIN, Field.GREETINGLINE, Field.CONTROL, Field.SHAPE, 58, Field.INCLUDEPICTURE, 74, Field.SECTION, 41, 80, Field.AUTOTEXTLIST, Field.CONTROL, Field.CONTROL, 44, Field.GLOSSARY, 16, 110, 104, 60, Field.SECTIONPAGES, Field.FORMCHECKBOX, 18, 99, 106, Field.INCLUDETEXT, Field.AUTONUMLGL, Field.BARCODE, 13, 8, Field.DATA, 6, 15, 14, 19, 8, 15, 6, Field.SECTION, 12, 0, 13, 7, 14, 19, 12, 4, 5, Field.SECTION, 32, Field.IMPORT, 34, Field.SECTION, 2, 14, 5, 4, 2, Field.SECTION, 18, 21, 19, 8, 15, 6, Field.HTMLCONTROL, Field.SECTION, 74, 100, 109, 108, 113, 106, 109, 100, Field.QUOTE, 110, 98, 111, 101, 108, 113, 110, 102, 103, Field.QUOTE, Field.MERGESEQ, Field.FORMTEXT, Field.DOCPROPERTY, 64, Field.QUOTE, 96, 108, 103, 102, 96, Field.QUOTE, 112, 119, 113, 106, 109, 100, Field.SYMBOL, Field.QUOTE, 32, Field.ADDRESSBLOCK, Field.GREETINGLINE, Field.BIDIOUTLINE, 74, Field.IMPORT, Field.AUTONUMOUT, Field.AUTONUMLGL, 106, 23, 19, 22, Field.AUTOTEXT, Field.GOTOBUTTON, Field.AUTONUM, 48, 111, 18, 22, 21, 99, 30, 23, 31, 20, 105, 96, 107, 102, Field.NUMWORDS, 18, Field.NUMCHARS, 86, 41, 42, Field.EQ, 78, Field.MERGESEQ, 21, 121, 3, 5, 100, 30, Field.NUMWORDS, Field.AUTONUMLGL, 64, Field.TOA, Field.IMPORT, Field.SECTIONPAGES, Field.NOTEREF, 15, 18, 113, 6, Field.FILLIN, 33, Field.DDE, Field.ASK, Field.FILLIN, 48, Field.LISTNUM, 114, 115, 126, 118, Field.ADVANCE, 120, 115, 114, 116, Field.HTMLCONTROL, 126, 100, 99, Field.IMPORT, 86, Field.FORMCHECKBOX, Field.GREETINGLINE, Field.IMPORT, 115, 126, 115, 121, 48, 99, Field.IMPORT, 123, 126, 100, 99, Field.IMPORT, 100, 114, 116, 98, 101, 114, Field.IMPORT, 115, 114, 116, 120, 115, 114, 101, Field.IMPORT, 113, 120, 101, Field.DDE, Field.IMPORT, Field.FILLIN, 15, 14, 3, 11, 41, 5, 14, 15, 9, Field.BARCODE, 30, 3, 6, Field.ASK, 13, 16, 29, Field.NUMWORDS, Field.NOTEREF, Field.AUTOTEXTLIST, Field.HYPERLINK, 120, 115, 101, 120, 126, 115, 26, 111, 98, 4, 114, 112, 101, 19, 120, Field.FILESIZE, Field.INCLUDETEXT, Field.FORMDROPDOWN, 82, 78, 19, 124, 124, 126, 19, 121, Field.HYPERLINK, Field.GREETINGLINE, 82, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.AUTOTEXT, Field.INCLUDETEXT, Field.FORMTEXT, Field.FORMDROPDOWN, Field.PAGEREF, 78, 115, 114, 101, 100, 120, Field.PAGEREF, 74, Field.ADDRESSBLOCK, Field.NOTEREF, Field.PAGEREF, Field.AUTOTEXT, 110, 104, 100, 111, 110, 121, 13, 15, 26, 108, 7, 58, 59, 44, Field.DDE, Field.EQ, 108, 3, 20, 1, 108, 6, Field.FILLIN, 33, Field.DDE, Field.ASK, Field.FILLIN, 48, 108, Field.EQ, Field.FILLIN, 33, Field.IMPORT, 48, Field.FILLIN, 7, 5, 16, 102, 5, Field.NUMCHARS, 3, 102, 9, 29, 12, 1, 7, 102, 12, 13, 11, 7, 12, 13, 26, 102, 9, 9, 11, Field.USERADDRESS, 60, 41, Field.SHAPE, 60, Field.PAGEREF, 58, Field.SHAPE, 48, 36, Field.AUTONUMLGL, 56, Field.USERADDRESS, Field.SHAPE, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.USERADDRESS, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.QUOTE, Field.SHAPE, Field.AUTONUMLGL, 34, 33, 48, Field.GOTOBUTTON, Field.SECTIONPAGES, 110, 108, 121, 15, 108, 117, 106, 15, 96, 116, 101, 104, 110, 15, 101, 100, 98, 110, 101, 100, 115, 15, 115, 96, 118, 114, 112, 101, 19, 110, 120, 126, 19, 112, 109, 14, 19, 121, Field.HYPERLINK, Field.GREETINGLINE, 82, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.AUTOTEXT, 30, Field.NUMCHARS, 9, Byte.MAX_VALUE, 2, 20, 18, Byte.MAX_VALUE, 48, 48, Field.GOTOBUTTON, Byte.MAX_VALUE, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.AUTONUM, Field.AUTONUMOUT, 33, Field.CONTROL, 42, 60, 58, Field.CONTROL, 15, 9, Field.SECTION, Field.CONTROL, 29, Field.NUMCHARS, 26, 25, Field.NUMWORDS, 14, 120, Field.EQ, Field.SYMBOL, Field.SYMBOL, Field.EQ, 58, Field.MACROBUTTON, 120, 36, Field.IMPORT, 33, 120, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUMLGL, Field.SYMBOL, Field.GOTOBUTTON, Field.MACROBUTTON, 36, 109, 111, 122, 12, Field.FORMDROPDOWN, Field.SECTION, 77, Field.AUTOTEXT, 12, Field.INCLUDEPICTURE, Field.CONTROL, Field.FORMTEXT, Field.MERGESEQ, 77, 12, Field.FORMTEXT, Field.FORMCHECKBOX, Field.SECTION, 77, Field.FORMTEXT, Field.FORMCHECKBOX, 80, 12, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, Field.SECTION, 1, 3, 22, 96, Field.BARCODE, Field.DDE, 33, Field.QUOTE, 96, Field.GLOSSARY, 59, 42, Field.FILLIN, 33, 96, 42, 43, Field.DDE, 33, 42, 43, 60, 96, Field.QUOTE, Field.USERADDRESS, 125, Field.IMPORT, Field.AUTONUMLGL, 32, 86, 9, Field.NUMWORDS, 23, 21, 86, 14, 17, Field.NUMCHARS, 29, 23, 86, Field.NUMCHARS, 29, Field.NUMWORDS, 23, Field.NUMCHARS, 29, 10, 86, 14, 8, 64, Field.TOA, Field.AUTOTEXTLIST, Field.IMPORT, 42, Field.DDEAUTO, Field.ADDRESSBLOCK, Field.HYPERLINK, Field.NOTEREF, Field.ASK, 59, Field.USERADDRESS, 76, 119, 103, 114, 23, 21, 20, 8, 106, 119, 117, 2, 9, Field.EQ, Field.MACROBUTTON, 42, 42, Field.MACROBUTTON, Field.AUTONUMOUT, 61, 122, Field.SYMBOL, Field.AUTONUMLGL, Field.USERADDRESS, Field.BARCODE, Field.SYMBOL, 122, Field.GREETINGLINE, 101, 96, 101, 100, 124, 101, 43, 74, Field.ADDRESSBLOCK, Field.NOTEREF, 43, 103, 110, 125, 110, 103, Field.EQ, 43, Field.ADDIN, 106, 111, 106, 107, 115, 106, 36, Field.FILESIZE, 82, Field.FORMCHECKBOX, 36, 116, 118, 107, 98, 109, 104, 97, Field.USERADDRESS, 36, 5, Field.USERADDRESS, 59, Field.USERADDRESS, Field.BARCODE, Field.FILLIN, Field.USERADDRESS, 112, 24, 21, 6, 19, 112, 60, Field.AUTONUMLGL, Field.ASK, Field.AUTONUMLGL, 60, 112, Field.QUOTE, 36, 34, Field.SYMBOL, Field.USERADDRESS, Field.IMPORT, 106, 112, 4, Field.BARCODE, 58, Field.BARCODE, Field.USERADDRESS, Field.ASK, Field.BARCODE, 113, 25, 20, 7, 18, 113, 33, Field.QUOTE, Field.USERADDRESS, Field.IMPORT, 56, 61, Field.AUTONUMOUT, 113, 34, Field.PAGEREF, Field.QUOTE, 56, Field.BARCODE, Field.AUTONUM, 107, 113, 76, 125, 117, 123, 121, 125, Field.AUTOTEXTLIST, 43, 56, 58, 34, Field.AUTOTEXTLIST, 78, 58, 2, 77, Field.AUTOTEXT, Field.SECTIONPAGES, 19, Field.FILESIZE, Field.SECTIONPAGES, 114, 102, 119, 122, 124, 60, 118, 114, 112, 32, 9, 29, 12, 1, 7, Field.FORMCHECKBOX, 13, 9, 11, Field.HTMLCONTROL, Field.FILESIZE, 2, 7, 11, 24, 15, 26, Field.NOTEREF, 61, 42, Field.BARCODE, 110, 43, 125, 42, 34, Field.AUTONUM, 59, 11, 9, 9, 97, 108, Byte.MAX_VALUE, 56, Field.INCLUDEPICTURE, Field.ADDRESSBLOCK, Field.NOTEREF, 26, 59, Field.IMPORT, 61, Field.PAGEREF, Field.AUTONUMOUT, Field.DOCPROPERTY, Field.AUTOTEXTLIST, 74, Field.ADDIN, 86, Field.ADDRESSBLOCK, Field.ADVANCE, 76, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, 76, 76, Field.BIDIOUTLINE, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.AUTOTEXTLIST, 120, 106, 102, 120, 126, 101, 108, 76, Field.GREETINGLINE, Field.ADDIN, Field.MERGESEQ, 80, 76, 44, 58, Field.DDE, 
        Field.DDE, Field.USERADDRESS, Field.EQ, 48, 108, Field.DATA, 24, 7, 10, 11, 1, Field.SECTION, 15, 24, 13, 116, 107, 110, 110, 103, 20, 11, 14, 14, 7, 1, 80, 98, 125, 120, 120, 113, 100, 120, 97, 103, Field.USERADDRESS, 33, 42, Field.DATA, 48, 33, Field.HTMLCONTROL, Field.INCLUDETEXT, Field.FORMDROPDOWN, 78, Field.FORMCHECKBOX, 77, Field.DOCPROPERTY, Field.INCLUDETEXT, Field.GREETINGLINE, Field.SECTION, 86, Field.MERGESEQ, Field.NOTEREF, 80, Field.SECTION};
        if (A02[5].charAt(16) == 'm') {
            throw new RuntimeException();
        }
        A02[3] = "v3s1R4n4E2CplWuCnbp9IXiCJ0VpMC0h";
        A01 = bArr;
    }

    static {
        A0A();
        A05 = DL.A01(A07(657, 22, 75));
        A08 = Pattern.compile(A07(899, 10, 123));
        A06 = new HashMap<>();
        A00 = -1;
        A04 = new SparseIntArray();
        A04.put(66, 1);
        A04.put(77, 2);
        A04.put(88, 4);
        A04.put(100, 8);
        A03 = new SparseIntArray();
        A03.put(10, 1);
        A03.put(11, 4);
        A03.put(12, 8);
        A03.put(13, 16);
        A03.put(20, 32);
        A03.put(21, 64);
        A03.put(22, 128);
        A03.put(30, 256);
        A03.put(31, 512);
        A03.put(32, 1024);
        A03.put(40, 2048);
        A03.put(41, 4096);
        A03.put(42, 8192);
        A03.put(50, 16384);
        A03.put(51, Variant.VT_RESERVED);
        A03.put(52, 65536);
        A07 = new HashMap();
        A07.put(A07(345, 3, 7), 1);
        A07.put(A07(352, 3, 40), 4);
        A07.put(A07(355, 3, 53), 16);
        A07.put(A07(358, 3, 100), 64);
        A07.put(A07(361, 3, 102), 256);
        A07.put(A07(313, 4, 113), 1024);
        A07.put(A07(317, 4, 27), 4096);
        A07.put(A07(321, 4, 59), 16384);
        A07.put(A07(325, 4, 30), 65536);
        A07.put(A07(329, 4, 62), 262144);
        A07.put(A07(333, 4, 50), 1048576);
        A07.put(A07(337, 4, 69), 4194304);
        A07.put(A07(341, 4, 55), 16777216);
        A07.put(A07(221, 3, 2), 2);
        A07.put(A07(224, 3, 69), 8);
        A07.put(A07(227, 3, 105), 32);
        A07.put(A07(230, 3, 71), 128);
        A07.put(A07(UnknownRecord.BITMAP_00E9, 3, 17), 512);
        A07.put(A07(189, 4, 95), 2048);
        A07.put(A07(193, 4, 87), 8192);
        A07.put(A07(197, 4, 20), Integer.valueOf((int) Variant.VT_RESERVED));
        A07.put(A07(201, 4, 74), 131072);
        A07.put(A07(205, 4, 84), 524288);
        A07.put(A07(209, 4, 114), 2097152);
        A07.put(A07(213, 4, 111), 8388608);
        A07.put(A07(217, 4, 124), 33554432);
    }

    public static int A01(int i10) {
        switch (i10) {
            case 1:
                return 25344;
            case 2:
                return 25344;
            case 8:
                return 101376;
            case 16:
                return 101376;
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
                return 414720;
            case 256:
                return 414720;
            case 512:
                if (A02[2].charAt(23) != 'K') {
                    String[] strArr = A02;
                    strArr[6] = "NlyGzCz";
                    strArr[0] = "RF3BFBC4AW17GvE58";
                    return 921600;
                }
                throw new RuntimeException();
            case 1024:
                return 1310720;
            case 2048:
                return 2097152;
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case Variant.VT_RESERVED /* 32768 */:
                return 9437184;
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r4.equals(A07(953, 4, 20)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A02(java.lang.String r7) {
        /*
            r6 = 0
            if (r7 != 0) goto L4
            return r6
        L4:
            r2 = 897(0x381, float:1.257E-42)
            r1 = 2
            r0 = 24
            java.lang.String r0 = A07(r2, r1, r0)
            java.lang.String[] r3 = r7.split(r0)
            r5 = 0
            r4 = r3[r5]
            int r0 = r4.hashCode()
            switch(r0) {
                case 3006243: goto L71;
                case 3006244: goto L41;
                case 3199032: goto L31;
                case 3214780: goto L20;
                default: goto L1b;
            }
        L1b:
            r5 = -1
        L1c:
            switch(r5) {
                case 0: goto L87;
                case 1: goto L87;
                case 2: goto L82;
                case 3: goto L82;
                default: goto L1f;
            }
        L1f:
            return r6
        L20:
            r2 = 957(0x3bd, float:1.341E-42)
            r1 = 4
            r0 = 54
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            r5 = 1
            goto L1c
        L31:
            r2 = 953(0x3b9, float:1.335E-42)
            r1 = 4
            r0 = 20
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            goto L1c
        L41:
            r2 = 940(0x3ac, float:1.317E-42)
            r1 = 4
            r0 = 65
            java.lang.String r5 = A07(r2, r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.DW.A02
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L5d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.DW.A02
            java.lang.String r1 = "6nM1zSh"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "83kXhSrbScQaBsiK5"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L1b
            r5 = 3
            goto L1c
        L71:
            r2 = 936(0x3a8, float:1.312E-42)
            r1 = 4
            r0 = 100
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            r5 = 2
            goto L1c
        L82:
            android.util.Pair r0 = A03(r7, r3)
            return r0
        L87:
            android.util.Pair r0 = A04(r7, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DW.A02(java.lang.String):android.util.Pair");
    }

    public static Pair<Integer, Integer> A03(String str, String[] strArr) {
        Integer valueOf;
        Integer valueOf2;
        int length = strArr.length;
        String A072 = A07(238, 37, 124);
        String A073 = A07(425, 14, 119);
        if (length < 2) {
            Log.w(A073, A072 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                Log.w(A073, A072 + str);
                return null;
            }
            int i10 = A04.get(valueOf.intValue(), -1);
            if (i10 == -1) {
                Log.w(A073, A07(814, 21, 25) + valueOf);
                return null;
            }
            int i11 = A03.get(valueOf2.intValue(), -1);
            if (i11 == -1) {
                Log.w(A073, A07(795, 19, 22) + valueOf2);
                return null;
            }
            return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
        } catch (NumberFormatException unused) {
            Log.w(A073, A072 + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A04(String str, String[] strArr) {
        int i10;
        int length = strArr.length;
        String A072 = A07(275, 38, 30);
        String A073 = A07(425, 14, 119);
        if (length < 4) {
            Log.w(A073, A072 + str);
            return null;
        }
        Matcher matcher = A08.matcher(strArr[1]);
        if (A02[4].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "yFIGXMH";
        strArr2[0] = "KAF3RCWkxumAXr2AT";
        if (!matcher.matches()) {
            Log.w(A073, A072 + str);
            return null;
        }
        String group = matcher.group(1);
        if (A07(53, 1, 92).equals(group)) {
            i10 = 1;
        } else if (A07(54, 1, 26).equals(group)) {
            i10 = 2;
        } else {
            Log.w(A073, A07(862, 29, 76) + group);
            return null;
        }
        Integer num = A07.get(strArr[3]);
        if (num == null) {
            Log.w(A073, A07(835, 27, 77) + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i10), num);
    }

    public static DL A05() {
        return A05;
    }

    public static DL A06(String str, boolean z10) throws DU {
        List<DL> A09 = A09(str, z10);
        if (A09.isEmpty()) {
            return null;
        }
        return A09.get(0);
    }

    public static synchronized List<DL> A09(String str, boolean z10) throws DU {
        synchronized (DW.class) {
            DT dt = new DT(str, z10);
            List<DL> list = A06.get(dt);
            if (list != null) {
                return list;
            }
            DV c1257Xn = IK.A02 >= 21 ? new C1257Xn(z10) : new C1258Xo();
            ArrayList<DL> A082 = A08(dt, c1257Xn, str);
            if (z10 && A082.isEmpty() && 21 <= IK.A02 && IK.A02 <= 23) {
                c1257Xn = new C1258Xo();
                A082 = A08(dt, c1257Xn, str);
                if (!A082.isEmpty()) {
                    Log.w(A07(425, 14, 119), A07(374, 51, 10) + str + A07(34, 12, 77) + A082.get(0).A02);
                }
            }
            if (A07(922, 14, 117).equals(str)) {
                DT key = new DT(A07(912, 10, 14), dt.A01);
                A082.addAll(A08(key, c1257Xn, str));
            }
            A0B(A082);
            List<DL> unmodifiableList = Collections.unmodifiableList(A082);
            A06.put(dt, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static void A0B(List<DL> list) {
        if (IK.A02 < 26 && list.size() > 1) {
            if (A07(583, 25, 60).equals(list.get(0).A02)) {
                for (int i10 = 1; i10 < list.size(); i10++) {
                    DL dl2 = list.get(i10);
                    if (A07(657, 22, 75).equals(dl2.A02)) {
                        list.remove(i10);
                        list.add(0, dl2);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ad, code lost:
        if (A07(627, 15, 76).equals(r9) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02bd, code lost:
        if (A07(457, 22, 32).equals(r9) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02bf, code lost:
        r3 = r5.equals(com.facebook.ads.redexgen.X.IK.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d0, code lost:
        if (com.facebook.ads.redexgen.X.DW.A02[4].length() == 30) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d2, code lost:
        if (r3 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e4, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(1042, 8, 60)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f5, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(1050, 7, 57)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0306, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(1036, 6, 89)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0317, code lost:
        if (A07(763, 6, 22).equals(com.facebook.ads.redexgen.X.IK.A03) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0329, code lost:
        if (A07(966, 12, 37).equals(com.facebook.ads.redexgen.X.IK.A03) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x032b, code lost:
        r3 = com.facebook.ads.redexgen.X.IK.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x033b, code lost:
        if (com.facebook.ads.redexgen.X.DW.A02[3].charAt(0) == 'v') goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0348, code lost:
        if (A07(55, 5, 12).equals(r3) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0358, code lost:
        if (A07(757, 6, 7).equals(com.facebook.ads.redexgen.X.IK.A03) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0369, code lost:
        if (A07(769, 5, 57).equals(com.facebook.ads.redexgen.X.IK.A03) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x036b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x036c, code lost:
        com.facebook.ads.redexgen.X.DW.A02[7] = "8B";
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x037e, code lost:
        if (A07(55, 5, 12).equals(r3) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0381, code lost:
        com.facebook.ads.redexgen.X.DW.A02[3] = "vM2VV5cNViG9iheEl1QedVwh11kRb2VM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0388, code lost:
        if (r3 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x038c, code lost:
        r6 = com.facebook.ads.redexgen.X.IK.A02;
        r4 = A07(961, 5, 76);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0399, code lost:
        if (r6 > 19) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x039b, code lost:
        r2 = com.facebook.ads.redexgen.X.DW.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03af, code lost:
        if (r2[6].length() == r2[0].length()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03b1, code lost:
        r2 = com.facebook.ads.redexgen.X.DW.A02;
        r2[6] = "H8RZpiF";
        r2[0] = "Qt7Gz5GbdPMmxFN0p";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03c7, code lost:
        if (A07(642, 15, 100).equals(r9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03cf, code lost:
        if (r5.equals(com.facebook.ads.redexgen.X.IK.A05) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03e0, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(944, 2, 82)) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03f1, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(997, 7, 66)) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03f3, code lost:
        r5 = com.facebook.ads.redexgen.X.IK.A03;
        r2 = com.facebook.ads.redexgen.X.DW.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0405, code lost:
        if (r2[6].length() == r2[0].length()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0407, code lost:
        com.facebook.ads.redexgen.X.DW.A02[7] = "DL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0412, code lost:
        if (r5.startsWith(r4) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0423, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(991, 6, 34)) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0433, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(com.adjust.sdk.network.ErrorCodes.PROTOCOL_EXCEPTION, 2, 5)) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0435, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0436, code lost:
        com.facebook.ads.redexgen.X.DW.A02[2] = "9VtxEaZDUnNZ6VyPkQGTvbLzZEhrKpnq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0447, code lost:
        if (A07(642, 15, 25).equals(r9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044c, code lost:
        if (com.facebook.ads.redexgen.X.IK.A02 > 19) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0454, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(r4) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0464, code lost:
        if (A07(731, 26, 101).equals(r9) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0466, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0475, code lost:
        if (A07(922, 14, 117).equals(r11) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0485, code lost:
        if (A07(555, 28, 108).equals(r9) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0487, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0488, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
        if (com.facebook.ads.redexgen.X.IK.A03.startsWith(A07(236, 2, 88)) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f8, code lost:
        if (A07(774, 6, 90).equals(com.facebook.ads.redexgen.X.IK.A03) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0211, code lost:
        if (r4 == 16) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0221, code lost:
        if (A07(679, 26, 63).equals(r9) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0232, code lost:
        if (A07(70, 5, 102).equals(com.facebook.ads.redexgen.X.IK.A03) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0234, code lost:
        r3 = A07(75, 5, 38).equals(com.facebook.ads.redexgen.X.IK.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0250, code lost:
        if (com.facebook.ads.redexgen.X.DW.A02[2].charAt(23) == 'K') goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0252, code lost:
        r2 = com.facebook.ads.redexgen.X.DW.A02;
        r2[6] = "3Mp5Uuh";
        r2[0] = "BKjPN78J93LmhHbAv";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x025e, code lost:
        if (r3 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026f, code lost:
        if (A07(80, 5, 64).equals(com.facebook.ads.redexgen.X.IK.A03) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0280, code lost:
        if (A07(85, 5, 57).equals(com.facebook.ads.redexgen.X.IK.A03) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0282, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0283, code lost:
        if (r3 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028d, code lost:
        if (r4 == 16) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0290, code lost:
        r4 = com.facebook.ads.redexgen.X.IK.A02;
        r5 = A07(984, 7, 22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029d, code lost:
        if (r4 >= 24) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(android.media.MediaCodecInfo r8, java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DW.A0C(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    public static boolean A0D(String str) {
        if (IK.A02 <= 22) {
            if ((A07(447, 10, 42).equals(IK.A06) || A07(439, 8, 117).equals(IK.A06)) && (A07(479, 22, 22).equals(str) || A07(PglCryptUtils.LOAD_SO_FAILED, 29, 95).equals(str))) {
                return true;
            }
        }
        return false;
    }
}
