package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public abstract class CT {
    public static byte[] A00;
    public static String[] A01 = {"wKfvjnTfcOCKDMPJJwrDJ", "BiqBrO9zznhho2tL5UciatPP4bSmOs", "cZYy1M68RFqrdQwlSPY78RcvokmRJ", "tju6iARchYraidMuKGJ5uPvGKVeMW6gD", "Y97vgpZfbX6TvfdF2pMOeBFL", "2mehisQ4WAFPRb0II6r5g", "hLX37fwLOdV4BXkBL9GY87j8KNIyc", "u9IItuxuS7Hs6eOanDo40tgXJH3Fx3"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<long[], long[]> A05(YY yy) {
        if (yy != null) {
            YX A072 = yy.A07(CO.A0O);
            String[] strArr = A01;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "SB39xNBo9M6iPaB1lJN3UDY5qWf8gr";
            strArr2[7] = "2q10ZFvNKxj4J1CiL420MMAJAxUxvK";
            if (A072 != null) {
                I4 i42 = A072.A00;
                i42.A0Y(8);
                int A012 = CO.A01(i42.A08());
                int A0H = i42.A0H();
                long[] jArr = new long[A0H];
                long[] jArr2 = new long[A0H];
                for (int i10 = 0; i10 < A0H; i10++) {
                    jArr[i10] = A012 == 1 ? i42.A0N() : i42.A0M();
                    jArr2[i10] = A012 == 1 ? i42.A0L() : i42.A08();
                    if (i42.A0U() != 1) {
                        throw new IllegalArgumentException(A0I(272, 23, 57));
                    }
                    i42.A0Z(2);
                }
                return Pair.create(jArr, jArr2);
            }
        }
        return Pair.create(null, null);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CS A0B(I4 i42) {
        long A0M;
        int i10;
        i42.A0Y(8);
        int A012 = CO.A01(i42.A08());
        i42.A0Z(A012 == 0 ? 8 : 16);
        int A082 = i42.A08();
        i42.A0Z(4);
        boolean z10 = true;
        int A062 = i42.A06();
        int i11 = A012 == 0 ? 4 : 8;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            } else if (i42.A00[A062 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        if (z10) {
            i42.A0Z(i11);
            A0M = -9223372036854775807L;
        } else {
            A0M = A012 == 0 ? i42.A0M() : i42.A0N();
            if (A0M == 0) {
                A0M = -9223372036854775807L;
            }
        }
        i42.A0Z(16);
        int A083 = i42.A08();
        int A084 = i42.A08();
        i42.A0Z(4);
        int A085 = i42.A08();
        int A086 = i42.A08();
        if (A083 == 0 && A084 == 65536 && A085 == (-65536) && A086 == 0) {
            i10 = 90;
        } else {
            if (A083 == 0) {
                int i13 = -65536;
                if (A01[4].length() != 24) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "DRv0rQs5Tea6yP10dxVxA";
                strArr[5] = "0Obd8siLUSB8su0UFYouw";
                if (A084 == i13 && A085 == 65536 && A086 == 0) {
                    i10 = 270;
                }
            }
            i10 = (A083 == (-65536) && A084 == 0 && A085 == 0 && A086 == (-65536)) ? ShapeTypes.MATH_EQUAL : 0;
        }
        return new CS(A082, A0M, i10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0735Cj A0C(YY yy, YX yx, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws A0 {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        YY A062 = yy.A06(CO.A0d);
        int A022 = A02(A062.A07(CO.A0V).A00);
        if (A022 == -1) {
            return null;
        }
        CS A0B = A0B(yy.A07(CO.A1J).A00);
        if (j11 == -9223372036854775807L) {
            j11 = A0B.A02;
        }
        long A042 = A04(yx.A00);
        long A0F = j11 == -9223372036854775807L ? -9223372036854775807L : IK.A0F(j11, 1000000L, A042);
        YY A063 = A062.A06(CO.A0h).A06(CO.A16);
        Pair<Long, String> A064 = A06(A062.A07(CO.A0c).A00);
        I4 i42 = A063.A07(CO.A1A).A00;
        i10 = A0B.A00;
        i11 = A0B.A01;
        CR A0A = A0A(i42, i10, i11, (String) A064.second, drmInitData, z11);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z10) {
            Pair<long[], long[]> A052 = A05(yy.A06(CO.A0N));
            jArr = (long[]) A052.first;
            jArr2 = (long[]) A052.second;
        }
        if (A0A.A02 == null) {
            return null;
        }
        i12 = A0B.A00;
        return new C0735Cj(i12, A022, ((Long) A064.first).longValue(), A042, A0F, A0A.A02, A0A.A01, A0A.A03, A0A.A00, jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0736Ck A0D(I4 i42, int i10, int i11, String str) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            i42.A0Y(i12);
            int A082 = i42.A08();
            if (i42.A08() == CO.A1G) {
                int A012 = CO.A01(i42.A08());
                i42.A0Z(1);
                int i13 = 0;
                int i14 = 0;
                if (A012 != 0) {
                    int A0E = i42.A0E();
                    String[] strArr = A01;
                    if (strArr[1].length() == strArr[7].length()) {
                        String[] strArr2 = A01;
                        strArr2[6] = "qu8ijNmmTbbg3oNQNlJL6MLizRZ8y";
                        strArr2[2] = "aYTRmwnSMEmjoN0pr4C9D2r3oJTUQ";
                        i13 = (A0E & 240) >> 4;
                        i14 = A0E & 15;
                    }
                    throw new RuntimeException();
                }
                i42.A0Z(1);
                boolean z10 = i42.A0E() == 1;
                int A0E2 = i42.A0E();
                byte[] bArr = new byte[16];
                i42.A0c(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z10 && A0E2 == 0) {
                    int A0E3 = i42.A0E();
                    bArr2 = new byte[A0E3];
                    i42.A0c(bArr2, 0, A0E3);
                    if (A01[3].charAt(25) != 'q') {
                        A01[4] = "FzDJD7GxRHP6LR8w8noFgrhr";
                    }
                    throw new RuntimeException();
                }
                return new C0736Ck(z10, str, A0E2, bArr, i13, i14, bArr2);
            }
            i12 += A082;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x033c, code lost:
        if (r6 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0342, code lost:
        if (r21.length < 2) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0344, code lost:
        r28 = r35.A09[0];
        r30 = r28 + com.facebook.ads.redexgen.X.IK.A0F(r35.A08[0], r35.A06, r35.A05);
        r5 = com.facebook.ads.redexgen.X.CT.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0367, code lost:
        if (r5[1].length() == r5[7].length()) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0371, code lost:
        if (A0N(r21, r0, r28, r30) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0373, code lost:
        r5 = com.facebook.ads.redexgen.X.IK.A0F(r28 - r21[0], r35.A07.A0C, r35.A06);
        r3 = com.facebook.ads.redexgen.X.IK.A0F(r0 - r30, r35.A07.A0C, r35.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x039a, code lost:
        if (r5 != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x039e, code lost:
        if (r3 == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03a5, code lost:
        if (r5 > 2147483647L) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03a9, code lost:
        if (r3 > 2147483647L) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03ab, code lost:
        r37.A00 = (int) r5;
        r37.A01 = (int) r3;
        com.facebook.ads.redexgen.X.IK.A0a(r21, 1000000, r35.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03cb, code lost:
        return new com.facebook.ads.redexgen.X.C0738Cm(r35, r18, r19, r17, r21, r20, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03cc, code lost:
        com.facebook.ads.redexgen.X.CT.A01[4] = "rX3C7Ywl9vX0ZnhkJJoFAv9K";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03db, code lost:
        if (A0N(r21, r0, r28, r30) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03ea, code lost:
        if (r6 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0494, code lost:
        if (r23 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0496, code lost:
        r12 = new int[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05a6, code lost:
        if (r23 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x05aa, code lost:
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c5, code lost:
        if (r28 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e8, code lost:
        if (r28 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01eb, code lost:
        r3 = false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 38
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C0738Cm A0E(com.facebook.ads.redexgen.X.C0735Cj r35, com.facebook.ads.redexgen.X.YY r36, com.facebook.ads.redexgen.X.C1 r37) throws com.facebook.ads.redexgen.X.A0 {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CT.A0E(com.facebook.ads.redexgen.X.Cj, com.facebook.ads.redexgen.X.YY, com.facebook.ads.redexgen.X.C1):com.facebook.ads.redexgen.X.Cm");
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{-102, -114, -32, -45, -37, -49, -41, -36, -41, -36, -43, -63, -49, -37, -34, -38, -45, -31, -81, -30, -62, -41, -37, -45, -31, -30, -49, -37, -34, -78, -45, -38, -30, -49, -114, Field.TOA, 61, -113, -126, -118, 126, -122, -117, -122, -117, -124, 112, 126, -118, -115, -119, -126, -112, 102, -117, 96, -123, -110, -117, -120, 61, -101, -113, -31, -44, -36, -48, -40, -35, -40, -35, -42, -61, -40, -36, -44, -30, -29, -48, -36, -33, -77, -44, -37, -29, -48, -78, -41, -48, -35, -42, -44, -30, -113, -72, -98, -16, -29, -21, -33, -25, -20, -25, -20, -27, -47, -9, -20, -31, -26, -16, -19, -20, -25, -8, -33, -14, -25, -19, -20, -47, -33, -21, -18, -22, -29, -15, -98, -90, -39, -44, -46, -75, -58, -41, -40, -54, -41, -40, -104, -74, -67, -66, -63, -72, -67, -74, 111, -76, -77, -72, -61, 111, -69, -72, -62, -61, -119, 111, -76, -77, -72, -61, 111, -77, -66, -76, -62, 111, -67, -66, -61, 111, -62, -61, -80, -63, -61, 111, -58, -72, -61, -73, 111, -80, 111, -62, -56, -67, -78, 111, -62, -80, -68, -65, -69, -76, 125, -98, -61, -72, -60, -61, -56, -66, -56, -55, -70, -61, -55, 117, -56, -55, -73, -63, 117, -73, -60, -51, 117, -69, -60, -57, 117, -55, -57, -74, -72, -64, 117, -126, -96, -113, -111, -103, 78, -106, -113, -95, 78, -100, -99, 78, -95, -113, -101, -98, -102, -109, 78, -94, -113, -112, -102, -109, 78, -95, -105, -88, -109, 78, -105, -100, -108, -99, -96, -101, -113, -94, -105, -99, -100, -95, -70, -65, -63, -68, -68, -69, -66, -64, -79, -80, 108, -71, -79, -80, -75, -83, 108, -66, -83, -64, -79, 122, -24, -9, -9, -13, -16, -22, -24, -5, -16, -10, -11, -74, -5, -5, -12, -13, -78, -1, -12, -13, -103, -88, -88, -92, -95, -101, -103, -84, -95, -89, -90, 103, -80, 101, -101, -103, -91, -99, -86, -103, 101, -91, -89, -84, -95, -89, -90, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, 126, -57, 124, -68, -65, -125, 124, -78, -76, -80, 124, -123, Byte.MAX_VALUE, -121, -92, -77, -77, -81, -84, -90, -92, -73, -84, -78, -79, 114, -69, 112, -80, -77, 119, 112, -71, -73, -73, -110, -95, -95, -99, -102, -108, -110, -91, -102, -96, -97, 96, -87, Field.GREETINGLINE, -94, -90, -102, -108, -100, -91, -102, -98, -106, Field.GREETINGLINE, -91, -87, 100, -104, -24, -4, -21, -16, -10, -74, -70, -18, -9, -9, -60, -40, -57, -52, -46, -110, -60, -58, -106, -52, -32, -49, -44, -38, -102, -52, -41, -52, -50, -101, -81, -98, -93, -87, 105, -101, -89, -84, 103, -79, -100, -32, -12, -29, -24, -18, -82, -28, -32, -30, -78, -37, -17, -34, -29, -23, -87, -25, -22, -82, -37, -89, -26, -37, -18, -25, -119, -99, -116, -111, -105, Field.CONTROL, -107, -104, -115, -113, -41, -21, -38, -33, -27, -91, -24, -41, -19, 116, -120, 119, 124, -126, Field.SECTIONPAGES, -119, -127, 119, Field.SECTION, 119, -121, -122, -13, 7, -10, -5, 1, -63, 8, 0, -10, -64, -10, 6, 5, -64, -6, -10, -111, -91, -108, -103, -97, Field.SHAPE, -90, -98, -108, Field.GREETINGLINE, -108, -92, -93, Field.GREETINGLINE, -104, -108, 107, -96, -94, -97, -106, -103, -100, -107, 109, -100, -110, -94, -19, -20, -19, -69, -93, -94, -93, -77, -82, -80, -71, -82, 124, 126, -121, -116, -11, -6, -5, -2, -10, -45, 6, 1, -1, -27, -5, 12, -9, -78, 5, -6, 1, 7, -2, -10, -78, -12, -9, -78, 2, 1, 5, -5, 6, -5, 8, -9, -94, -85, -94, -81, -125, -113, -118, 126, 61, 126, -111, -116, -118, 61, -122, -112, 61, -118, 126, -117, -127, 126, -111, -116, -113, -106, -37, -45, -30, -49, -20, -37, -19, -27, -79, -95, -90, -89, Field.GREETINGLINE, -97, -78, -83, -85, Field.GREETINGLINE, -89, -79, Field.GREETINGLINE, -85, -97, -84, -94, -97, -78, -83, -80, -73, -88, -92, -86, -93, -69, -67, -86, -68, -85, -100, -91, -102, Field.CONTROL, -104, -85, -90, -92, Field.CONTROL, -96, -86, Field.CONTROL, -92, -104, -91, -101, -104, -85, -90, -87, -80, -13, -28, -9, -13, -80, -93, -98, -97, -97, -110, -115, -114, -104, Field.HYPERLINK, Field.BIDIOUTLINE, -112, -103, -103, 1, -12, -17, -16, -6, -70, -20, 1, -18, -35, -48, -53, -52, -42, -106, -49, -52, -35, -54, -39, -52, -57, -56, -46, -110, -37, -112, -39, -47, -57, -111, -46, -47, -107, -111, -39, -45, -101, -100, -113, -118, -117, -107, Field.DOCPROPERTY, -98, Field.FORMDROPDOWN, -100, -108, -118, Field.ADVANCE, -107, -108, Field.HYPERLINK, Field.ADVANCE, -100, -106, Field.SHAPE};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0K(com.facebook.ads.redexgen.X.I4 r23, int r24, int r25, int r26, int r27, int r28, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r29, com.facebook.ads.redexgen.X.CR r30, int r31) throws com.facebook.ads.redexgen.X.A0 {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CT.A0K(com.facebook.ads.redexgen.X.I4, int, int, int, int, int, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData, com.facebook.ads.redexgen.X.CR, int):void");
    }

    static {
        A0J();
        A08 = IK.A08(A0I(696, 4, 39));
        A05 = IK.A08(A0I(662, 4, 34));
        A07 = IK.A08(A0I(692, 4, 108));
        A04 = IK.A08(A0I(636, 4, 102));
        A06 = IK.A08(A0I(TTAdConstant.STYLE_SIZE_RADIO_2_3, 4, 53));
        A02 = IK.A08(A0I(606, 4, 44));
        A03 = IK.A08(A0I(632, 4, 91));
    }

    public static float A00(I4 i42, int i10) {
        i42.A0Y(i10 + 8);
        int vSpacing = i42.A0H();
        int hSpacing = i42.A0H();
        return vSpacing / hSpacing;
    }

    public static int A01(I4 i42) {
        int A0E = i42.A0E();
        int size = A0E & ShapeTypes.VERTICAL_SCROLL;
        while ((A0E & 128) == 128) {
            A0E = i42.A0E();
            int currentByte = A0E & ShapeTypes.VERTICAL_SCROLL;
            size = (size << 7) | currentByte;
        }
        return size;
    }

    public static int A02(I4 i42) {
        i42.A0Y(16);
        int A082 = i42.A08();
        int trackType = A05;
        if (A082 == trackType) {
            return 1;
        }
        int trackType2 = A08;
        if (A082 == trackType2) {
            return 2;
        }
        int trackType3 = A07;
        if (A082 != trackType3) {
            int trackType4 = A04;
            if (A082 != trackType4) {
                int trackType5 = A06;
                if (A082 != trackType5) {
                    int trackType6 = A02;
                    if (A082 == trackType6) {
                        return 3;
                    }
                    int i10 = A03;
                    String[] strArr = A01;
                    String str = strArr[0];
                    String str2 = strArr[5];
                    int length = str.length();
                    int trackType7 = str2.length();
                    if (length != trackType7) {
                        throw new RuntimeException();
                    }
                    A01[4] = "ptSvWaLuPQhFEfQVJrBGw099";
                    if (A082 == i10) {
                        return 4;
                    }
                    return -1;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(com.facebook.ads.redexgen.X.I4 r6, int r7, int r8) {
        /*
            int r5 = r6.A06()
        L4:
            int r0 = r5 - r7
            if (r0 >= r8) goto L2c
            r6.A0Y(r5)
            int r4 = r6.A08()
            if (r4 <= 0) goto L2a
            r3 = 1
        L12:
            r2 = 574(0x23e, float:8.04E-43)
            r1 = 32
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r0 = A0I(r2, r1, r0)
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A05(r3, r0)
            int r1 = r6.A08()
            int r0 = com.facebook.ads.redexgen.X.CO.A0S
            if (r1 != r0) goto L28
            return r5
        L28:
            int r5 = r5 + r4
            goto L4
        L2a:
            r3 = 0
            goto L12
        L2c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CT.A03(com.facebook.ads.redexgen.X.I4, int, int):int");
    }

    public static long A04(I4 i42) {
        int fullAtom = 8;
        i42.A0Y(8);
        if (CO.A01(i42.A08()) != 0) {
            fullAtom = 16;
        }
        i42.A0Z(fullAtom);
        return i42.A0M();
    }

    public static Pair<Long, String> A06(I4 i42) {
        i42.A0Y(8);
        int fullAtom = CO.A01(i42.A08());
        int languageCode = fullAtom == 0 ? 8 : 16;
        i42.A0Z(languageCode);
        long A0M = i42.A0M();
        int version = fullAtom == 0 ? 4 : 8;
        i42.A0Z(version);
        int A0I = i42.A0I();
        int languageCode2 = A0I >> 10;
        StringBuilder append = new StringBuilder().append(A0I(0, 0, 85)).append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = A0I >> 5;
        StringBuilder append2 = append.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = A0I & 31;
        return Pair.create(Long.valueOf(A0M), append2.append((char) (languageCode4 + 96)).toString());
    }

    public static Pair<String, byte[]> A07(I4 i42, int i10) {
        i42.A0Y(i10 + 8 + 4);
        i42.A0Z(1);
        A01(i42);
        i42.A0Z(2);
        int A0E = i42.A0E();
        if ((A0E & 128) != 0) {
            i42.A0Z(2);
        }
        if ((A0E & 64) != 0) {
            i42.A0Z(i42.A0I());
        }
        int i11 = A0E & 32;
        if (A01[3].charAt(25) != 'q') {
            A01[4] = "9zjbq8A01Hky9x2uEvc360p9";
            if (i11 != 0) {
                i42.A0Z(2);
            }
            i42.A0Z(1);
            A01(i42);
            String mimeType = AbstractC0862Hx.A03(i42.A0E());
            if (!A0I(482, 10, 21).equals(mimeType) && !A0I(PglCryptUtils.LOAD_SO_FAILED, 13, 0).equals(mimeType)) {
                boolean equals = A0I(514, 16, ShapeTypes.VERTICAL_SCROLL).equals(mimeType);
                int objectTypeIndication = A01[4].length();
                if (objectTypeIndication != 24) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[6] = "EPCMbb5M2ndyYlrS8sZelweUVDWhj";
                strArr[2] = "RxyG9YUmCwxkJjXIkU0O3vs0xICJ2";
                if (!equals) {
                    i42.A0Z(12);
                    i42.A0Z(1);
                    int flags = A01(i42);
                    byte[] bArr = new byte[flags];
                    i42.A0c(bArr, 0, flags);
                    return Pair.create(mimeType, bArr);
                }
            }
            return Pair.create(mimeType, null);
        }
        throw new RuntimeException();
    }

    public static Pair<Integer, C0736Ck> A08(I4 i42, int i10, int i11) {
        int i12 = i10 + 8;
        int childAtomType = -1;
        int childAtomSize = 0;
        String schemeType = null;
        Integer dataFormat = null;
        while (true) {
            int i13 = i12 - i10;
            String[] strArr = A01;
            String str = strArr[6];
            String str2 = strArr[2];
            int schemeInformationBoxPosition = str.length();
            int childPosition = str2.length();
            if (schemeInformationBoxPosition != childPosition) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[1] = "u8GxPqM0qiVjecpGcAI22AXxAkx5XE";
            strArr2[7] = "6HZRT7kxjkFFZpA9NZx363WBPs3Huj";
            if (i13 < i11) {
                i42.A0Y(i12);
                int schemeInformationBoxSize = i42.A08();
                int schemeInformationBoxPosition2 = i42.A08();
                int childPosition2 = CO.A0T;
                if (schemeInformationBoxPosition2 == childPosition2) {
                    int childPosition3 = i42.A08();
                    dataFormat = Integer.valueOf(childPosition3);
                } else {
                    int childPosition4 = CO.A0z;
                    if (schemeInformationBoxPosition2 == childPosition4) {
                        i42.A0Z(4);
                        schemeType = i42.A0S(4);
                    } else {
                        int childPosition5 = CO.A0y;
                        if (schemeInformationBoxPosition2 == childPosition5) {
                            childAtomType = i12;
                            childAtomSize = schemeInformationBoxSize;
                        }
                    }
                }
                i12 += schemeInformationBoxSize;
            } else if (A0I(566, 4, 56).equals(schemeType) || A0I(558, 4, 119).equals(schemeType) || A0I(570, 4, 6).equals(schemeType) || A0I(TTAdConstant.STYLE_SIZE_RADIO_9_16, 4, 45).equals(schemeType)) {
                boolean z10 = true;
                AbstractC0844Hf.A05(dataFormat != null, A0I(610, 22, 10));
                AbstractC0844Hf.A05(childAtomType != -1, A0I(640, 22, 43));
                C0736Ck A0D = A0D(i42, childAtomType, childAtomSize, schemeType);
                if (A0D == null) {
                    z10 = false;
                }
                AbstractC0844Hf.A05(z10, A0I(670, 22, 36));
                Pair<Integer, C0736Ck> create = Pair.create(dataFormat, A0D);
                String[] strArr3 = A01;
                String str3 = strArr3[1];
                String str4 = strArr3[7];
                int schemeInformationBoxPosition3 = str3.length();
                int childPosition6 = str4.length();
                if (schemeInformationBoxPosition3 == childPosition6) {
                    A01[4] = "BomvvRogxkATO5u6fLPcNSRZ";
                    return create;
                }
            } else {
                return null;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.X.C0736Ck> A09(com.facebook.ads.redexgen.X.I4 r6, int r7, int r8) {
        /*
            int r4 = r6.A06()
        L4:
            int r0 = r4 - r7
            if (r0 >= r8) goto L53
            r6.A0Y(r4)
            int r3 = r6.A08()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.CT.A01
            r0 = 3
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.CT.A01
            java.lang.String r1 = "z9X14U2xyaoBmPkEGCOx1"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "DsriTKfNXeqdZCjpQL7vy"
            r0 = 5
            r2[r0] = r1
            if (r3 <= 0) goto L4b
            r5 = 1
        L2d:
            r2 = 574(0x23e, float:8.04E-43)
            r1 = 32
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r0 = A0I(r2, r1, r0)
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A05(r5, r0)
            int r1 = r6.A08()
            int r0 = com.facebook.ads.redexgen.X.CO.A13
            if (r1 != r0) goto L49
            android.util.Pair r0 = A08(r6, r4, r3)
            if (r0 == 0) goto L49
            return r0
        L49:
            int r4 = r4 + r3
            goto L4
        L4b:
            r5 = 0
            goto L2d
        L4d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L53:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CT.A09(com.facebook.ads.redexgen.X.I4, int, int):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
        if (r6 != r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0159, code lost:
        if (r6 == com.facebook.ads.redexgen.X.CO.A1O) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015d, code lost:
        if (r6 == com.facebook.ads.redexgen.X.CO.A1W) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0161, code lost:
        if (r6 == com.facebook.ads.redexgen.X.CO.A18) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (r6 != com.facebook.ads.redexgen.X.CO.A09) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0167, code lost:
        r7 = r7;
        r8 = r8;
        A0L(r23, r6, r7, r8, r24, r26, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017f, code lost:
        if (r6 != r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0184, code lost:
        if (r6 != com.facebook.ads.redexgen.X.CO.A0A) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0186, code lost:
        r13.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0B(java.lang.Integer.toString(r24), A0I(315, 27, 37), null, -1, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.CR A0A(com.facebook.ads.redexgen.X.I4 r23, int r24, int r25, java.lang.String r26, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r27, boolean r28) throws com.facebook.ads.redexgen.X.A0 {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CT.A0A(com.facebook.ads.redexgen.X.I4, int, int, java.lang.String, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData, boolean):com.facebook.ads.redexgen.X.CR");
    }

    public static Metadata A0F(YX yx, boolean z10) {
        if (z10) {
            return null;
        }
        I4 i42 = yx.A00;
        i42.A0Y(8);
        while (i42.A04() >= 8) {
            int atomPosition = i42.A06();
            int A082 = i42.A08();
            if (i42.A08() == CO.A0g) {
                i42.A0Y(atomPosition);
                return A0H(i42, atomPosition + A082);
            }
            i42.A0Z(A082 - 8);
        }
        return null;
    }

    public static Metadata A0G(I4 i42, int i10) {
        i42.A0Z(8);
        ArrayList arrayList = new ArrayList();
        while (i42.A06() < i10) {
            Id3Frame A042 = AbstractC0727Cb.A04(i42);
            if (A042 != null) {
                arrayList.add(A042);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(I4 i42, int i10) {
        i42.A0Z(12);
        while (i42.A06() < i10) {
            int A062 = i42.A06();
            int atomType = i42.A08();
            int atomSize = i42.A08();
            int atomPosition = CO.A0Z;
            if (atomSize == atomPosition) {
                i42.A0Y(A062);
                return A0G(i42, A062 + atomType);
            }
            int atomPosition2 = atomType - 8;
            i42.A0Z(atomPosition2);
        }
        if (A01[3].charAt(25) != 'q') {
            A01[3] = "eZNVatTIYyd9KfmF8OttG16Me3cbZREr";
            return null;
        }
        throw new RuntimeException();
    }

    public static void A0L(I4 i42, int i10, int i11, int i12, int i13, String str, CR cr) throws A0 {
        String A0I;
        i42.A0Y(i11 + 8 + 8);
        List list = null;
        long j10 = Long.MAX_VALUE;
        if (i10 == CO.A02) {
            A0I = A0I(295, 20, 116);
        } else if (i10 == CO.A1O) {
            A0I = A0I(388, 28, 30);
            int i14 = (i12 - 8) - 8;
            byte[] bArr = new byte[i14];
            if (A01[4].length() != 24) {
                i42.A0c(bArr, 0, i14);
                list = Collections.singletonList(bArr);
            } else {
                String[] strArr = A01;
                strArr[1] = "KykxXqtA4hxsgCSu10LzWv14ucl7xu";
                strArr[7] = "BGtgEZ2LrbQo2YAkZ53sLCFYW54s0h";
                i42.A0c(bArr, 0, i14);
                list = Collections.singletonList(bArr);
            }
        } else if (i10 == CO.A1W) {
            A0I = A0I(367, 21, 48);
        } else if (i10 == CO.A18) {
            A0I = A0I(295, 20, 116);
            j10 = 0;
        } else if (i10 == CO.A09) {
            A0I = A0I(342, 25, 60);
            cr.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        String mimeType = Integer.toString(i13);
        String[] strArr2 = A01;
        if (strArr2[6].length() != strArr2[2].length()) {
            throw new RuntimeException();
        }
        A01[3] = "qNRFp5z8cylDu7M8uboDkb8OElCQgoCr";
        cr.A02 = Format.A09(mimeType, A0I, null, -1, 0, str, -1, null, j10, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x027c, code lost:
        com.facebook.ads.redexgen.X.CT.A01[3] = "edjy6hWV1aP471I9DFgChAk6TLiFBb4Y";
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0283, code lost:
        if (r6 != r9) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0286, code lost:
        r8 = com.facebook.ads.redexgen.X.CT.A01;
        r8[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
        r8[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
        r0 = A0I(com.bytedance.sdk.openadsdk.TTAdConstant.PACKAGE_NAME_CODE, 10, 116);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x029c, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A0w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x029e, code lost:
        if (r6 != r3) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a0, code lost:
        r0 = A0I(445, 12, 39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ac, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ae, code lost:
        if (r6 == r3) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b0, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b2, code lost:
        if (r6 != r3) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b4, code lost:
        r8 = com.facebook.ads.redexgen.X.CT.A01;
        r3 = r8[0];
        r0 = r8[5];
        r3 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c6, code lost:
        if (r3 == r0.length()) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02cd, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ce, code lost:
        r8 = com.facebook.ads.redexgen.X.CT.A01;
        r8[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
        r8[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
        r0 = A0I(492, 9, 99);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e4, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e6, code lost:
        if (r6 != r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02e8, code lost:
        r0 = A0I(482, 10, 21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02f4, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f6, code lost:
        if (r6 != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f8, code lost:
        r0 = A0I(435, 10, 88);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0330, code lost:
        if (r39.A02 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0332, code lost:
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0342, code lost:
        if (A0I(492, 9, 99).equals(r0) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0344, code lost:
        r22 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0346, code lost:
        r15 = java.lang.Integer.toString(r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x034a, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x034c, code lost:
        r39.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(r15, r0, null, -1, -1, r20, r14, r22, r23, r2, 0, r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0362, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0363, code lost:
        r23 = java.util.Collections.singletonList(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0368, code lost:
        r22 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r6 == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
        r0 = A0I(426, 9, 80);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if ((r4 - r33) >= r34) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r31.A0Y(r4);
        r6 = r31.A08();
        r10 = com.facebook.ads.redexgen.X.CT.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (r10[1].length() == r10[7].length()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r6 <= 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        com.facebook.ads.redexgen.X.AbstractC0844Hf.A05(r11, A0I(574, 32, lib.zj.office.fc.ss.usermodel.ShapeTypes.VERTICAL_SCROLL));
        r9 = r31.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
        if (r9 == com.facebook.ads.redexgen.X.CO.A0S) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
        if (r37 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (r9 != com.facebook.ads.redexgen.X.CO.A1V) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
        r10 = com.facebook.ads.redexgen.X.CT.A01[4].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
        if (r10 == 24) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r9 != com.facebook.ads.redexgen.X.CO.A0E) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
        r31.A0Y(r4 + 8);
        r39.A02 = com.facebook.ads.redexgen.X.AV.A07(r31, java.lang.Integer.toString(r35), r36, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
        if (r9 != com.facebook.ads.redexgen.X.CO.A0H) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
        r31.A0Y(r4 + 8);
        r39.A02 = com.facebook.ads.redexgen.X.AV.A08(r31, java.lang.Integer.toString(r35), r36, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
        if (r9 != com.facebook.ads.redexgen.X.CO.A0G) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
        r24 = java.lang.Integer.toString(r35);
        r25 = r0;
        r10 = com.facebook.ads.redexgen.X.CT.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
        if (r10[0].length() == r10[5].length()) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
        r39.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(r24, r25, null, -1, -1, r20, r14, null, r2, 0, r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0152, code lost:
        com.facebook.ads.redexgen.X.CT.A01[4] = "EBLYUFe8VXGddau7pqu73bNM";
        r39.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(r24, r25, null, -1, -1, r20, r14, null, r2, 0, r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
        if (r9 != com.facebook.ads.redexgen.X.CO.A05) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
        r3 = new byte[r6];
        r31.A0Y(r4);
        r31.A0c(r3, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0175, code lost:
        r11 = com.facebook.ads.redexgen.X.CT.A01;
        r11[1] = "UhNjDCpah48Za7zHs6qx4SD3d3Rscb";
        r11[7] = "O3XcQ3fycqCqLrfQRv5Yk09BCeMxh0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0183, code lost:
        if (r9 != com.facebook.ads.redexgen.X.CO.A0S) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0185, code lost:
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0186, code lost:
        if (r8 == (-1)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0188, code lost:
        r3 = A07(r31, r8);
        r0 = (java.lang.String) r3.first;
        r3 = (byte[]) r3.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a2, code lost:
        if (A0I(467, 15, 103).equals(r0) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a4, code lost:
        r9 = com.facebook.ads.redexgen.X.AbstractC0848Hj.A03(r3);
        r14 = ((java.lang.Integer) r9.first).intValue();
        r20 = ((java.lang.Integer) r9.second).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b8, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01bb, code lost:
        r8 = A03(r31, r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c0, code lost:
        com.facebook.ads.redexgen.X.CT.A01[4] = "77JkTzz3NFo7gTAW49b3hBRm";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c7, code lost:
        if (r6 <= 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cb, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01da, code lost:
        if (r6 == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01de, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e0, code lost:
        if (r6 != r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e2, code lost:
        r0 = A0I(457, 10, 108);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ee, code lost:
        r9 = com.facebook.ads.redexgen.X.CO.A0I;
        r10 = com.facebook.ads.redexgen.X.CT.A01;
        r8 = r10[0];
        r3 = r10[5];
        r8 = r8.length();
        r3 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0200, code lost:
        if (r8 == r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0208, code lost:
        r10 = com.facebook.ads.redexgen.X.CT.A01;
        r10[6] = "Zqe6d8cjHif8ypNB2BqCb7eNUxdxZ";
        r10[2] = "QA9ktGqLcEAqVLo1te6DtcBXMYCen";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0214, code lost:
        if (r6 != r9) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0216, code lost:
        r0 = A0I(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.LOAD_SO_FAILED, 13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0221, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0223, code lost:
        if (r6 == r3) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0225, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0227, code lost:
        if (r6 != r3) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0229, code lost:
        r0 = A0I(514, 16, lib.zj.office.fc.ss.usermodel.ShapeTypes.VERTICAL_SCROLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0235, code lost:
        r3 = com.facebook.ads.redexgen.X.CO.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0237, code lost:
        if (r6 != r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0239, code lost:
        r0 = A0I(530, 28, 29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0245, code lost:
        r9 = com.facebook.ads.redexgen.X.CO.A0v;
        r10 = com.facebook.ads.redexgen.X.CT.A01;
        r8 = r10[1];
        r3 = r10[7];
        r8 = r8.length();
        r3 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0257, code lost:
        if (r8 == r3) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0259, code lost:
        r10 = com.facebook.ads.redexgen.X.CT.A01;
        r10[0] = "Za6iKmGifzJSKPrg9mzrH";
        r10[5] = "sngbP1wZsMOGH9hu1alub";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0265, code lost:
        if (r6 != r9) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0267, code lost:
        r8 = com.facebook.ads.redexgen.X.CT.A01;
        r3 = r8[6];
        r0 = r8[2];
        r3 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0279, code lost:
        if (r3 == r0.length()) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0M(com.facebook.ads.redexgen.X.I4 r31, int r32, int r33, int r34, int r35, java.lang.String r36, boolean r37, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r38, com.facebook.ads.redexgen.X.CR r39, int r40) throws com.facebook.ads.redexgen.X.A0 {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CT.A0M(com.facebook.ads.redexgen.X.I4, int, int, int, int, java.lang.String, boolean, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData, com.facebook.ads.redexgen.X.CR, int):void");
    }

    public static boolean A0N(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int latestDelayIndex = IK.A06(3, 0, length);
        int lastIndex = jArr.length;
        int A062 = IK.A06(lastIndex - 3, 0, length);
        int lastIndex2 = (jArr[0] > j11 ? 1 : (jArr[0] == j11 ? 0 : -1));
        if (lastIndex2 <= 0) {
            int lastIndex3 = (j11 > jArr[latestDelayIndex] ? 1 : (j11 == jArr[latestDelayIndex] ? 0 : -1));
            if (lastIndex3 < 0) {
                int lastIndex4 = (jArr[A062] > j12 ? 1 : (jArr[A062] == j12 ? 0 : -1));
                if (lastIndex4 < 0) {
                    int lastIndex5 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
                    if (lastIndex5 <= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A0O(com.facebook.ads.redexgen.X.I4 r4, int r5, int r6) {
        /*
            int r3 = r5 + 8
        L2:
            int r0 = r3 - r5
            if (r0 >= r6) goto L20
            r4.A0Y(r3)
            int r2 = r4.A08()
            int r1 = r4.A08()
            int r0 = com.facebook.ads.redexgen.X.CO.A0q
            if (r1 != r0) goto L1e
            byte[] r1 = r4.A00
            int r0 = r3 + r2
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            return r0
        L1e:
            int r3 = r3 + r2
            goto L2
        L20:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CT.A0O(com.facebook.ads.redexgen.X.I4, int, int):byte[]");
    }
}
