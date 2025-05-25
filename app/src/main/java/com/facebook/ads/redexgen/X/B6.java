package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class B6 {
    public static byte[] A00;
    public static String[] A01 = {"Q5YmFWlnR5UwYdfdhbWnWDAFZJXmhRpv", "pbZNQfZIEs1SNcZO0zs6qP5OkaISQtwt", "4zG9yYWQyQveu", "FYvUEoMpOg3hka6RJqEpZvWO8PPoRHV2", "9FscUhrcId3cAgtAb5GJ6Xt6AS7cgtAq", "aj4E6w0PUq5nqaq6dNrKw553aukh9OQl", "389BeR8VkLVuOX9G1z", "f1lnET0"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        I3 A042 = A04(bArr);
        A042.A08(60);
        int i10 = A02[A042.A04(6)];
        int i11 = A03[A042.A04(4)];
        int A043 = A042.A04(5);
        int i12 = A043 >= A04.length ? -1 : (A04[A043] * 1000) / 2;
        A042.A08(10);
        int A044 = A042.A04(2);
        if (A01[3].charAt(5) != 'P') {
            A01[4] = "MuH0kIyyozsoWddCoQuVDTZonM6AA1pg";
            return Format.A07(str, A05(0, 13, 75), null, i12, -1, i10 + (A044 > 0 ? 1 : 0), i11, null, drmInitData, 0, str2);
        }
        throw new RuntimeException();
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{29, Field.EQ, 32, Field.PAGEREF, 43, -21, Field.GOTOBUTTON, 42, 32, -22, 32, 48, Field.GLOSSARY};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, BOFRecord.VERSION, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int position = byteBuffer.position();
        int position2 = byteBuffer.get(position);
        switch (position2) {
            case -2:
                int position3 = position + 5;
                int i10 = (byteBuffer.get(position3) & 1) << 6;
                int position4 = position + 4;
                nblks = i10 | ((byteBuffer.get(position4) & 252) >> 2);
                break;
            case -1:
                int position5 = position + 4;
                int i11 = (byteBuffer.get(position5) & 7) << 4;
                int position6 = position + 7;
                nblks = i11 | ((byteBuffer.get(position6) & 60) >> 2);
                break;
            case 31:
                int position7 = position + 5;
                int i12 = (byteBuffer.get(position7) & 7) << 4;
                int position8 = position + 6;
                nblks = i12 | ((byteBuffer.get(position8) & 60) >> 2);
                break;
            default:
                int position9 = position + 4;
                int i13 = (byteBuffer.get(position9) & 1) << 6;
                int position10 = position + 5;
                nblks = i13 | ((byteBuffer.get(position10) & 252) >> 2);
                break;
        }
        int position11 = nblks + 1;
        return position11 * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(byte[] r8) {
        /*
            r7 = 0
            r0 = 0
            r0 = r8[r0]
            r2 = 6
            r6 = 7
            r5 = 4
            switch(r0) {
                case -2: goto L73;
                case -1: goto L5a;
                case 31: goto L41;
                default: goto La;
            }
        La:
            r0 = 5
            r0 = r8[r0]
            r0 = r0 & 3
            int r4 = r0 << 12
            r0 = r8[r2]
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r5
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.B6.A01
            r0 = 4
            r1 = r1[r0]
            r0 = 12
            char r1 = r1.charAt(r0)
            r0 = 75
            if (r1 == r0) goto L9d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B6.A01
            java.lang.String r1 = "PlfY379TAwnazPRd5q"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "VbrLe8k"
            r0 = 7
            r2[r0] = r1
            r4 = r4 | r3
            r0 = r8[r6]
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> r5
            r4 = r4 | r0
            int r0 = r4 + 1
        L3a:
            if (r7 == 0) goto L40
            int r0 = r0 * 16
            int r0 = r0 / 14
        L40:
            return r0
        L41:
            r0 = r8[r2]
            r0 = r0 & 3
            int r1 = r0 << 12
            r0 = r8[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r5
            r1 = r1 | r0
            r0 = 8
            r0 = r8[r0]
            r0 = r0 & 60
            int r0 = r0 >> 2
            r1 = r1 | r0
            int r0 = r1 + 1
            r7 = 1
            goto L3a
        L5a:
            r0 = r8[r6]
            r0 = r0 & 3
            int r1 = r0 << 12
            r0 = r8[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r5
            r1 = r1 | r0
            r0 = 9
            r0 = r8[r0]
            r0 = r0 & 60
            int r0 = r0 >> 2
            r1 = r1 | r0
            int r0 = r1 + 1
            r7 = 1
            goto L3a
        L73:
            r0 = r8[r5]
            r0 = r0 & 3
            int r4 = r0 << 12
            r0 = r8[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r5
            r4 = r4 | r0
            r3 = r8[r2]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.B6.A01
            r0 = 3
            r1 = r1[r0]
            r0 = 5
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto L9d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B6.A01
            java.lang.String r1 = "NpAlLABwFQFe5"
            r0 = 2
            r2[r0] = r1
            r0 = r3 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> r5
            r4 = r4 | r0
            int r0 = r4 + 1
            goto L3a
        L9d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B6.A01(byte[]):int");
    }

    public static int A02(byte[] bArr) {
        int i10;
        switch (bArr[0]) {
            case -2:
                int nblks = bArr[5];
                i10 = ((nblks & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i10 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case 31:
                i10 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                i10 = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
                break;
        }
        int nblks2 = i10 + 1;
        return nblks2 * 32;
    }

    public static I3 A04(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new I3(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                copyOf[i10] = copyOf[i10 + 1];
                copyOf[i10 + 1] = b10;
            }
        }
        I3 i32 = new I3(copyOf);
        if (copyOf[0] == 31) {
            I3 i33 = new I3(copyOf);
            while (i33.A01() >= 16) {
                i33.A08(2);
                i32.A0A(i33.A04(14), 14);
            }
        }
        i32.A0B(copyOf);
        if (A01[3].charAt(5) != 'P') {
            String[] strArr = A01;
            strArr[5] = "MmKi7b0sfZEENPZj4CT4hoOnJABUQCnv";
            strArr[1] = "HlEGlOBrKKriZ52mssjH9VMTQOaRBxBc";
            return i32;
        }
        throw new RuntimeException();
    }

    public static boolean A07(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
