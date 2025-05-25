package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Xi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1253Xi implements InterfaceC0752Db {
    public static byte[] A01;
    public static String[] A02 = {"oDcarx9FEV95l", "ZTtmoYFQI4gqa1qx5G8sf9d7DJClXSOg", "4BWiiQEHzTJJ", "sM9tLFh19BbK8", "f3pvpmQKnWva5xh3Eex5w2xyNPMIbB03", "EKLMFNQM5OgFXY3Ny", "aUxYV7Tn322", "5RuBVxa5hmFU3oUcV3HVFMdvL2Njpkaf"};
    public static final int A03;
    public static final InterfaceC0764Dn A04;
    public final InterfaceC0764Dn A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ChapterFrame A06(I4 i42, int i10, int i11, boolean z10, int i12, InterfaceC0764Dn interfaceC0764Dn) throws UnsupportedEncodingException {
        int A06 = i42.A06();
        int A022 = A02(i42.A00, A06);
        String str = new String(i42.A00, A06, A022 - A06, A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107));
        i42.A0Y(A022 + 1);
        int A08 = i42.A08();
        int A082 = i42.A08();
        long A0M = i42.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = i42.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = A06 + i10;
        while (i42.A06() < i13) {
            Id3Frame A0B = A0B(i11, i42, z10, i12, interfaceC0764Dn);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static GeobFrame A09(I4 i42, int i10) throws UnsupportedEncodingException {
        int A0E = i42.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i10 - 1];
        i42.A0c(bArr, 0, i10 - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107));
        int i11 = A022 + 1;
        int A032 = A03(bArr, i11, A0E);
        String A0K = A0K(bArr, i11, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{Field.NUMCHARS, Field.LISTNUM, Field.NUMCHARS, Field.LISTNUM, Field.NUMCHARS, Field.LISTNUM, Field.SECTIONPAGES, 4, Field.SECTIONPAGES, 4, Field.SECTIONPAGES, 4, Field.SECTIONPAGES, 4, Field.FORMTEXT, 74, 12, 24, 11, 7, 15, Field.SYMBOL, 3, 16, 15, Field.CONTROL, 4, 33, Field.AUTONUMOUT, 33, 96, Field.AUTONUMOUT, Field.GLOSSARY, Field.GLOSSARY, 96, Field.MACROBUTTON, Field.DATA, Field.GLOSSARY, Field.GOTOBUTTON, Field.AUTONUMOUT, 96, Field.AUTONUMOUT, Field.GLOSSARY, 96, 34, Field.PAGEREF, 96, 33, Field.DDEAUTO, 96, 9, 4, 115, 96, Field.AUTONUMOUT, 33, Field.FILLIN, Field.PAGEREF, 2, 10, 15, 6, 7, Field.INCLUDEPICTURE, 23, 12, Field.INCLUDEPICTURE, 7, 6, 0, 12, 7, 6, Field.INCLUDEPICTURE, 5, 17, 2, 14, 6, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, 10, 7, Field.GREETINGLINE, 64, 103, 111, 106, 99, 98, Field.ASK, 114, 105, Field.ASK, 112, 103, 106, 111, 98, 103, 114, 99, Field.ASK, Field.AUTOTEXT, Field.SECTIONPAGES, Field.AUTONUMLGL, Field.ASK, 114, 103, 97, Field.ASK, 113, 111, 114, 110, Field.ASK, 107, 103, 108, 105, 116, 80, 99, 116, 117, 111, 105, 104, 59, Field.HTMLCONTROL, 111, 124, 112, 120, 61, 110, 116, 103, 120, 61, 120, 101, 126, 120, 120, 121, 110, 61, 111, 120, 112, 124, 116, 115, 116, 115, 122, 61, 105, 124, 122, 61, 121, 124, 105, 124, 25, 20, 99, Field.BARCODE, Field.PAGEREF, Field.SYMBOL, Field.HTMLCONTROL, 78, 78, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.HTMLCONTROL, Field.FORMCHECKBOX, 19, Field.USERADDRESS, 105, 30, Field.BARCODE, Field.SYMBOL, Field.AUTONUMLGL, Field.USERADDRESS, Field.BARCODE, Field.DATA, 106, 82, 80, Field.TOA, Field.TOA, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 25, 112, 125, 10, 25, 77, Field.HYPERLINK, Field.GREETINGLINE, 25, 78, 80, 77, Field.ADDIN, 25, Field.ADVANCE, Field.HYPERLINK, Field.FORMDROPDOWN, 86, Field.MERGESEQ, 111, Field.BIDIOUTLINE, Field.MERGESEQ, 74, 80, 86, Field.CONTROL, 4, 11, 25, Field.HYPERLINK, Field.CONTROL, Field.ADDRESSBLOCK, 25, 76, Field.CONTROL, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, Field.SHAPE, 80, Field.CONTROL, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 25, Field.LISTNUM, 86, Field.ADVANCE, Field.TOA, Field.MERGESEQ, Field.BIDIOUTLINE, 74, 74, 80, 86, Field.CONTROL, 25, 74, Field.LISTNUM, Field.ADDIN, Field.BIDIOUTLINE, Field.ADVANCE, Field.BIDIOUTLINE, 105, Field.ADDIN, Field.FORMDROPDOWN, 74, 74, Field.SHAPE, Field.GREETINGLINE, 26, 115, 126, 9, 26, 78, Field.HTMLCONTROL, Field.ADDRESSBLOCK, 26, 77, Field.FORMDROPDOWN, 78, 82, 26, Field.AUTOTEXT, Field.ADVANCE, Field.TOA, Field.AUTOTEXT, 74, 74, Field.DOCPROPERTY, Field.NOTEREF, 78, Field.SHAPE, Field.GREETINGLINE, 26, Field.CONTROL, Field.HTMLCONTROL, 80, Field.DOCPROPERTY, Field.NOTEREF, 108, Field.SHAPE, Field.NOTEREF, Field.TOA, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.ADVANCE, 7, Field.MERGESEQ, 115, 113, 104, 104, 113, 118, Byte.MAX_VALUE, 56, 109, 118, 107, 109, 104, 104, 119, 106, 108, 125, 124, 56, 123, 119, 117, 104, 106, 125, 107, 107, 125, 124, 56, 119, 106, 56, 125, 118, 123, 106, 97, 104, 108, 125, 124, 56, 126, 106, 121, 117, 125, 24, 20, 20, 20, Field.INCLUDEPICTURE, Field.SECTIONPAGES, 80, 59, Field.FILLIN, 32, 2, 3, 17, 122, 102, 97, 21, 18, Field.NOTEREF, Field.TOA, Field.HTMLCONTROL, 48, Field.PAGEREF, 4, Field.BARCODE, Field.AUTONUMOUT, 41, 33, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.PAGEREF, Field.AUTONUMOUT, Field.AUTONUMLGL, 113, Field.IMPORT, 56, Field.QUOTE, 34, Field.PAGEREF, 113, Field.PAGEREF, Field.SYMBOL, Field.QUOTE, Field.AUTONUMOUT, Field.AUTONUMOUT, 113, Field.MACROBUTTON, Field.DATA, Field.PAGEREF, Field.AUTONUMOUT, 34, 113, Field.USERADDRESS, Field.IMPORT, 113, 24, 21, 98, 113, Field.PAGEREF, 48, Field.AUTONUM, 113, Field.SYMBOL, Field.AUTONUMOUT, 48, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.QUOTE, 107, 113, 31, 36, Field.SYMBOL, Field.BARCODE, 58, 58, Field.PAGEREF, 56, Field.USERADDRESS, Field.GLOSSARY, Field.DDEAUTO, 106, 41, 34, 43, 56, 43, 41, Field.USERADDRESS, Field.GLOSSARY, 56, 106, Field.GLOSSARY, 36, 41, Field.PAGEREF, Field.DDEAUTO, Field.QUOTE, 36, Field.DDE, 117, 122, 122, 122, 41, Field.DDE, 33, Field.FILLIN, Field.PAGEREF, 111, Field.FORMTEXT, Field.SECTIONPAGES, 78, Field.NOTEREF, 74, 0, Field.FILESIZE, Field.SHAPE, 74, Field.NOTEREF, 121, 125, 113, 119, 117, Field.BARCODE, 122, 96, 119};
    }

    static {
        A0L();
        A04 = new C1254Xj();
        A03 = IK.A08(A0I(ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, 3, 77));
    }

    public C1253Xi() {
        this(null);
    }

    public C1253Xi(InterfaceC0764Dn interfaceC0764Dn) {
        this.A00 = interfaceC0764Dn;
    }

    public static int A00(int i10) {
        if (i10 == 0 || i10 == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(I4 i42, int i10) {
        byte[] bArr = i42.A00;
        for (int A06 = i42.A06(); A06 + 1 < i10; A06++) {
            int i11 = bArr[A06];
            if ((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) == 255) {
                int i12 = A06 + 1;
                int i13 = A02[2].length();
                if (i13 != 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[5] = "fMvheGAz69fX12AY3";
                strArr[6] = "xzSVXT6CIC9";
                if (bArr[i12] == 0) {
                    int i14 = A06 + 1;
                    System.arraycopy(bArr, A06 + 2, bArr, i14, (i10 - A06) - 2);
                    i10--;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1253Xi.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(byte[] r4, int r5, int r6) {
        /*
            int r1 = A02(r4, r5)
            if (r6 == 0) goto L9
            r0 = 3
            if (r6 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r4.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L45
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r4[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r3 = r1 + 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1253Xi.A02
            r0 = 0
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L34
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1253Xi.A02
            java.lang.String r1 = "c1mKOA0yx6PM3ayoz9Rx2ZFyjjZjHwoF"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "pETkHlW31R8gYQsHDxP1siPj2h04g4up"
            r0 = 7
            r2[r0] = r1
            int r1 = A02(r4, r3)
            goto La
        L45:
            int r0 = r4.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1253Xi.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(I4 i42, int i10, int i11) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionStartIndex = i42.A0E();
        String A0H = A0H(descriptionStartIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        i42.A0c(bArr, 0, encoding2);
        String A0I = A0I(458, 6, 93);
        String A0I2 = A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107);
        if (i11 == 2) {
            A022 = 2;
            A0M = A0I + IK.A0M(new String(bArr, 0, 3, A0I2));
            if (A0I(474, 9, 13).equals(A0M)) {
                A0M = A0I(464, 10, 50);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = IK.A0M(new String(bArr, 0, A022, A0I2));
            if (A0M.indexOf(47) == -1) {
                A0M = A0I + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i12 = bArr[encoding3] & FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i13 = A022 + 2;
        int mimeTypeEndIndex = A03(bArr, i13, descriptionStartIndex);
        int encoding4 = mimeTypeEndIndex - i13;
        String str = new String(bArr, i13, encoding4, A0H);
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, str, i12, A0N(bArr, A00(descriptionStartIndex) + mimeTypeEndIndex, encoding5));
    }

    public static BinaryFrame A05(I4 i42, int i10, String str) {
        byte[] bArr = new byte[i10];
        i42.A0c(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(I4 i42, int i10, int i11, boolean z10, int elementIdEndIndex, InterfaceC0764Dn interfaceC0764Dn) throws UnsupportedEncodingException {
        int A06 = i42.A06();
        int A022 = A02(i42.A00, A06);
        String A0I = A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107);
        String str = new String(i42.A00, A06, A022 - A06, A0I);
        i42.A0Y(A022 + 1);
        int framePosition = i42.A0E();
        boolean z11 = (framePosition & 2) != 0;
        boolean z12 = (framePosition & 1) != 0;
        int A0E = i42.A0E();
        String[] strArr = new String[A0E];
        for (int i12 = 0; i12 < A0E; i12++) {
            int startIndex = i42.A06();
            int i13 = A02(i42.A00, startIndex);
            strArr[i12] = new String(i42.A00, startIndex, i13 - startIndex, A0I);
            i42.A0Y(i13 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = A06 + i10;
        while (i42.A06() < i14) {
            Id3Frame A0B = A0B(i11, i42, z10, elementIdEndIndex, interfaceC0764Dn);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    public static CommentFrame A08(I4 i42, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int textStartIndex = i42.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        i42.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i10 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 4;
        i42.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
        if (r8 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
        if (r6 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fb, code lost:
        if (r6 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010c, code lost:
        if (r8 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
        if (r8 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
        if (r8 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C0765Do A0A(com.facebook.ads.redexgen.X.I4 r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1253Xi.A0A(com.facebook.ads.redexgen.X.I4):com.facebook.ads.redexgen.X.Do");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
        if (r9 != 88) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017c, code lost:
        if (r22 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017e, code lost:
        if (r8 != 88) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0181, code lost:
        if (r11 == 87) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0184, code lost:
        r4 = A0F(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x018a, code lost:
        if (r11 != 87) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018c, code lost:
        r0 = A0J(r22, r11, r10, r9, r8);
        r4 = A0G(r23, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019a, code lost:
        if (r11 != 80) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019e, code lost:
        if (r10 != 82) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a0, code lost:
        if (r9 != 73) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a4, code lost:
        if (r8 != 86) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a6, code lost:
        r4 = A0C(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01af, code lost:
        if (r11 != 71) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b3, code lost:
        if (r10 != 69) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b5, code lost:
        if (r9 != 79) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
        if (r8 == 66) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01bb, code lost:
        if (r22 != 2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01bd, code lost:
        r4 = A09(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c6, code lost:
        if (r22 != 2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c8, code lost:
        if (r11 != 80) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ca, code lost:
        if (r10 != 73) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01cc, code lost:
        if (r9 != 67) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01cf, code lost:
        if (r11 != 65) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01d1, code lost:
        if (r10 != 80) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01d3, code lost:
        if (r9 != 73) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d5, code lost:
        if (r8 != 67) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01d7, code lost:
        r4 = A04(r23, r7, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01dc, code lost:
        if (r11 != 67) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01de, code lost:
        if (r10 != 79) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e2, code lost:
        if (r9 != 77) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01e4, code lost:
        if (r8 == 77) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01e6, code lost:
        if (r22 != 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e8, code lost:
        r4 = A08(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ef, code lost:
        if (r11 != 67) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01f3, code lost:
        if (r10 != 72) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01f5, code lost:
        if (r9 != 65) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01f7, code lost:
        if (r8 != 80) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01f9, code lost:
        r4 = A06(r23, r7, r22, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0206, code lost:
        if (r11 != 67) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0208, code lost:
        if (r10 != 84) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x020a, code lost:
        if (r9 != 79) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x020c, code lost:
        if (r8 != 67) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x020e, code lost:
        r4 = A07(r23, r7, r22, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x021b, code lost:
        r0 = A0J(r22, r11, r10, r9, r8);
        r4 = A05(r23, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0176, code lost:
        if (r11 == 87) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0178, code lost:
        if (r10 != 88) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame A0B(int r22, com.facebook.ads.redexgen.X.I4 r23, boolean r24, int r25, com.facebook.ads.redexgen.X.InterfaceC0764Dn r26) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1253Xi.A0B(int, com.facebook.ads.redexgen.X.I4, boolean, int, com.facebook.ads.redexgen.X.Dn):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(I4 i42, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        i42.A0c(bArr, 0, i10);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(I4 i42, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int valueStartIndex = i42.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 1;
        i42.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 81);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(I4 i42, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int A0E = i42.A0E();
        String A0H = A0H(A0E);
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 1;
        i42.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, A0E);
        return new TextInformationFrame(str, null, new String(data, 0, encoding3, A0H));
    }

    public static UrlLinkFrame A0F(I4 i42, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int descriptionEndIndex = i42.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        i42.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107));
        String charset = A0I(454, 4, 63);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(I4 i42, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        i42.A0c(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107)));
    }

    public static String A0H(int i10) {
        String A0I = A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 107);
        switch (i10) {
            case 0:
                return A0I;
            case 1:
                return A0I(357, 6, 11);
            case 2:
                return A0I(363, 8, 74);
            case 3:
                return A0I(371, 5, 0);
            default:
                return A0I;
        }
    }

    public static String A0J(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, A0I(0, 6, 36), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, A0I(6, 8, 122), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String A0K(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        if (i11 > i10) {
            int length = bArr.length;
            String[] strArr = A02;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "2w8qNsEXNbi1RtaKY";
            strArr2[6] = "xIsAvF4aqsL";
            if (i11 <= length) {
                return new String(bArr, i10, i11 - i10, str);
            }
        }
        return A0I(0, 0, 89);
    }

    public static boolean A0M(I4 i42, int i10, int i11, boolean z10) {
        int A08;
        long A0M;
        int A0I;
        int A06 = i42.A06();
        while (true) {
            try {
                if (i42.A04() < i11) {
                    i42.A0Y(A06);
                    return true;
                }
                if (i10 >= 3) {
                    try {
                        A08 = i42.A08();
                        A0M = i42.A0M();
                        A0I = i42.A0I();
                    } catch (Throwable th2) {
                        th = th2;
                        i42.A0Y(A06);
                        throw th;
                    }
                } else {
                    A08 = i42.A0G();
                    A0M = i42.A0G();
                    A0I = 0;
                }
                if (A08 == 0 && A0M == 0 && A0I == 0) {
                    i42.A0Y(A06);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & A0M) != 0) {
                        i42.A0Y(A06);
                        return false;
                    }
                    A0M = (((A0M >> 24) & 255) << 21) | (A0M & 255) | (((A0M >> 8) & 255) << 7) | (((A0M >> 16) & 255) << 14);
                }
                boolean z11 = false;
                boolean z12 = false;
                if (i10 == 4) {
                    z11 = (A0I & 64) != 0;
                    z12 = (A0I & 1) != 0;
                } else if (i10 == 3) {
                    int minimumFrameSize = A0I & 32;
                    z11 = minimumFrameSize != 0;
                    int minimumFrameSize2 = A0I & 128;
                    z12 = minimumFrameSize2 != 0;
                }
                int minimumFrameSize3 = 0;
                if (z11) {
                    minimumFrameSize3 = 0 + 1;
                }
                if (z12) {
                    minimumFrameSize3 += 4;
                }
                if (A0M < minimumFrameSize3) {
                    i42.A0Y(A06);
                    return false;
                }
                int minimumFrameSize4 = i42.A04();
                if (minimumFrameSize4 >= A0M) {
                    int minimumFrameSize5 = (int) A0M;
                    i42.A0Z(minimumFrameSize5);
                } else {
                    i42.A0Y(A06);
                    return false;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static byte[] A0N(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public final Metadata A0O(byte[] bArr, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList = new ArrayList();
        I4 i42 = new I4(bArr, i10);
        C0765Do A0A = A0A(i42);
        if (A0A == null) {
            return null;
        }
        int A06 = i42.A06();
        i11 = A0A.A01;
        int frameHeaderSize = i11 == 2 ? 6 : 10;
        i12 = A0A.A00;
        z10 = A0A.A02;
        if (z10) {
            i17 = A0A.A00;
            i12 = A01(i42, i17);
        }
        i42.A0X(A06 + i12);
        boolean z11 = false;
        i13 = A0A.A01;
        if (!A0M(i42, i13, frameHeaderSize, false)) {
            i15 = A0A.A01;
            String[] strArr = A02;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "2HRW23rQNZUN4UoGi";
            strArr2[6] = "wx9wVCYymkj";
            if (i15 == 4 && A0M(i42, 4, frameHeaderSize, true)) {
                z11 = true;
            } else {
                StringBuilder append = new StringBuilder().append(A0I(84, 45, 27));
                i16 = A0A.A01;
                Log.w(A0I(ShapeTypes.MATH_DIVIDE, 10, 71), append.append(i16).toString());
                return null;
            }
        }
        while (i42.A04() >= frameHeaderSize) {
            i14 = A0A.A01;
            Id3Frame A0B = A0B(i14, i42, z11, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0752Db
    public final Metadata A5N(EX ex) {
        ByteBuffer buffer = ex.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
