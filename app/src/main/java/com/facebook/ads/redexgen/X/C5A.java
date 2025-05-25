package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.5A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5A extends DD {
    public static byte[] A0C;
    public static String[] A0D = {"uPRtooN1mrpPWtcIlb5668ZKfYVdzjkj", "9X5O0mohLhXJ7t6NoPERFE8nyauk6CB9", "qU5XOqtgL8wvA16vKF1DqOjKAu5DqneE", "7EXG0IPVOCl5nW4ISobsZsOVcrd8XJic", "1cIPLbJRIWAOgz82BPbrtaaCtdud6uIX", "LoaGbC7dgNNPM6H7LjLEtBOJkffBiTAV", "ATKN7VvE5cyZJ8kViDaz3Q8PQ8A", "az4oatOqZKbyVNpIoLDpKLWjQ80V1Ke9"};
    public static final int[] A0E;
    public static final int[] A0F;
    public static final int[] A0G;
    public static final int[] A0H;
    public static final int[] A0I;
    public static final int[] A0J;
    public static final int[] A0K;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public List<C0807Fs> A05;
    public List<C0807Fs> A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final I4 A0A = new I4();
    public final ArrayList<C0814Fz> A0B = new ArrayList<>();
    public C0814Fz A04 = new C0814Fz(0, 4);

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 16);
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[7].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0WoUWtBUrhBdvujHrk0pBh1b44b9fFkR";
            strArr2[7] = "LpwXMND3FqjgYESdE0TPh3qwS83waWDS";
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0C = new byte[]{-47, -32, -32, -36, -39, -45, -47, -28, -39, -33, -34, -97, -24, -99, -35, -32, -92, -99, -45, -43, -47, -99, -90, -96, -88};
    }

    static {
        A07();
        A0G = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0F = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0K = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        A0E = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, UnknownRecord.BITMAP_00E9, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        A0H = new int[]{ShapeTypes.GEAR_9, ShapeTypes.MATH_PLUS, 189, 191, 8482, ShapeTypes.ACTION_BUTTON_HOME, ShapeTypes.ACTION_BUTTON_HELP, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        A0I = new int[]{193, 201, 211, 218, 220, 252, 8216, ShapeTypes.ACTION_BUTTON_BLANK, 42, 39, 8212, ShapeTypes.ACTION_BUTTON_RETURN, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, UnknownRecord.PHONETICPR_00EF, 212, 217, 249, 219, ShapeTypes.ACTION_BUTTON_SOUND, ShapeTypes.CHART_PLUS};
        A0J = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, ShapeTypes.ACTION_BUTTON_FORWARD_NEXT, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    }

    public C5A(String str, int i10) {
        this.A08 = A04(0, 25, 96).equals(str) ? 2 : 3;
        switch (i10) {
            case 3:
            case 4:
                this.A09 = 2;
                break;
            default:
                this.A09 = 1;
                break;
        }
        A0B(0);
        A06();
    }

    public static char A00(byte b10) {
        int index = A0E[(b10 & Byte.MAX_VALUE) - 32];
        return (char) index;
    }

    public static char A01(byte b10) {
        int index = A0I[b10 & 31];
        return (char) index;
    }

    public static char A02(byte b10) {
        int index = A0J[b10 & 31];
        return (char) index;
    }

    public static char A03(byte b10) {
        int index = A0H[b10 & 15];
        return (char) index;
    }

    private List<C0807Fs> A05() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.A0B.size(); i10++) {
            C0807Fs A05 = this.A0B.get(i10).A05();
            if (A05 != null) {
                arrayList.add(A05);
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A04.A09(this.A02);
        this.A0B.clear();
        this.A0B.add(this.A04);
    }

    private void A08(byte b10) {
        this.A04.A08(' ');
        int style = (b10 >> 1) & 7;
        this.A04.A0E(style, (b10 & 1) == 1);
    }

    private void A09(byte b10) {
        switch (b10) {
            case 32:
                A0B(2);
                return;
            case 33:
            case 34:
            case 35:
            case 36:
            case 40:
            default:
                if (this.A02 == 0) {
                    return;
                }
                switch (b10) {
                    case 33:
                        this.A04.A06();
                        return;
                    case 36:
                    default:
                        return;
                    case 44:
                        this.A05 = null;
                        int i10 = this.A02;
                        String[] strArr = A0D;
                        if (strArr[3].charAt(22) != strArr[5].charAt(22)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0D;
                        strArr2[1] = "IxV2WZghQ5T6kwEibQ02uWW7iDs4uQOS";
                        strArr2[7] = "gVEIHyW2z7iU6qQnAfFVCGXDV5ZJtx1l";
                        if (i10 != 1 && this.A02 != 3) {
                            return;
                        }
                        A06();
                        return;
                    case 45:
                        if (this.A02 != 1 || this.A04.A0F()) {
                            return;
                        }
                        this.A04.A07();
                        return;
                    case 46:
                        A06();
                        return;
                    case 47:
                        this.A05 = A05();
                        A06();
                        return;
                }
            case 37:
                A0B(1);
                A0C(2);
                return;
            case 38:
                A0B(1);
                A0C(3);
                return;
            case 39:
                A0B(1);
                A0C(4);
                return;
            case 41:
                A0B(3);
                return;
        }
    }

    private void A0A(byte b10, byte b11) {
        int i10 = A0G[b10 & 7];
        int row = b11 & 32;
        int row2 = row != 0 ? 1 : 0;
        if (row2 != 0) {
            i10++;
        }
        int A04 = this.A04.A04();
        String[] strArr = A0D;
        String str = strArr[0];
        String str2 = strArr[4];
        int charAt = str.charAt(27);
        int row3 = str2.charAt(27);
        if (charAt == row3) {
            String[] strArr2 = A0D;
            strArr2[3] = "H7JbpxrghbTwVbej4vMcLROuhZC8DeWr";
            strArr2[5] = "f6rT0LLTXL2YnQKUw42rJTOPcer4RkWK";
            if (i10 != A04) {
                int i11 = this.A02;
                String[] strArr3 = A0D;
                String str3 = strArr3[3];
                String str4 = strArr3[5];
                int charAt2 = str3.charAt(22);
                int row4 = str4.charAt(22);
                if (charAt2 == row4) {
                    A0D[2] = "rCP7fK2t8T6BPFgVAgjNGO2T1MmN1wLB";
                    if (i11 != 1 && !this.A04.A0F()) {
                        this.A04 = new C0814Fz(this.A02, this.A03);
                        this.A0B.add(this.A04);
                    }
                    this.A04.A0C(i10);
                }
            }
            boolean isCursor = (b11 & 16) == 16;
            int row5 = b11 & 1;
            boolean z10 = row5 == 1;
            int row6 = b11 >> 1;
            int i12 = row6 & 7;
            C0814Fz c0814Fz = this.A04;
            int row7 = isCursor ? 8 : i12;
            c0814Fz.A0E(row7, z10);
            if (isCursor) {
                C0814Fz c0814Fz2 = this.A04;
                int row8 = A0F[i12];
                c0814Fz2.A0B(row8);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0B(int i10) {
        if (this.A02 == i10) {
            return;
        }
        int i11 = this.A02;
        this.A02 = i10;
        A06();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.A05 = null;
        }
    }

    private void A0C(int i10) {
        this.A03 = i10;
        this.A04.A0A(i10);
    }

    public static boolean A0D(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean A0E(byte b10, byte b11) {
        boolean A0D2 = A0D(b10);
        if (A0D2) {
            boolean isRepeatableControl = this.A07;
            if (isRepeatableControl && this.A00 == b10 && this.A01 == b11) {
                this.A07 = false;
                return true;
            }
            this.A07 = true;
            this.A00 = b10;
            this.A01 = b11;
        }
        boolean isRepeatableControl2 = A0F(b10, b11);
        if (isRepeatableControl2) {
            A08(b11);
        } else {
            boolean isRepeatableControl3 = A0H(b10, b11);
            if (isRepeatableControl3) {
                A0A(b10, b11);
            } else {
                boolean isRepeatableControl4 = A0I(b10, b11);
                if (isRepeatableControl4) {
                    this.A04.A0D(b11 - 32);
                } else {
                    boolean isRepeatableControl5 = A0G(b10, b11);
                    if (isRepeatableControl5) {
                        A09(b11);
                    }
                }
            }
        }
        return A0D2;
    }

    public static boolean A0F(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean A0G(byte b10, byte b11) {
        return (b10 & 247) == 20 && (b11 & 240) == 32;
    }

    public static boolean A0H(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean A0I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public static /* synthetic */ int[] A0J() {
        int[] iArr = A0K;
        String[] strArr = A0D;
        if (strArr[0].charAt(27) != strArr[4].charAt(27)) {
            throw new RuntimeException();
        }
        A0D[2] = "hjViamzirxEPLHidOwU1TOUc6K9qymfc";
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final /* bridge */ /* synthetic */ DO A0L() throws C0809Fu {
        return super.A5Q();
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final /* bridge */ /* synthetic */ DM A0M() throws C0809Fu {
        return super.A5R();
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final XN A0N() {
        this.A06 = this.A05;
        return new XN(this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final /* bridge */ /* synthetic */ void A0O(DO r12) throws C0809Fu {
        super.AEj(r12);
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final void A0P(DO r10) {
        this.A0A.A0b(r10.A01.array(), r10.A01.limit());
        boolean z10 = false;
        boolean z11 = false;
        while (this.A0A.A04() >= this.A08) {
            byte ccData2 = this.A08 == 2 ? (byte) -4 : (byte) this.A0A.A0E();
            byte ccData1 = (byte) (this.A0A.A0E() & ShapeTypes.VERTICAL_SCROLL);
            byte A0E2 = (byte) (this.A0A.A0E() & ShapeTypes.VERTICAL_SCROLL);
            if ((ccData2 & 6) == 4 && (this.A09 != 1 || (ccData2 & 1) == 0)) {
                if (this.A09 != 2 || (ccData2 & 1) == 1) {
                    if (ccData1 != 0 || A0E2 != 0) {
                        z10 = true;
                        if ((ccData1 & 247) == 17 && (A0E2 & 240) == 48) {
                            this.A04.A08(A03(A0E2));
                        } else if ((ccData1 & 246) == 18 && (A0E2 & 224) == 32) {
                            this.A04.A06();
                            if ((ccData1 & 1) == 0) {
                                this.A04.A08(A01(A0E2));
                            } else {
                                this.A04.A08(A02(A0E2));
                            }
                        } else {
                            int i10 = ccData1 & 224;
                            if (A0D[2].charAt(21) != 'O') {
                                throw new RuntimeException();
                            }
                            A0D[6] = "aD9kIE7wrPx5oNR2SvDx5IuQrQK";
                            if (i10 == 0) {
                                z11 = A0E(ccData1, A0E2);
                            } else {
                                this.A04.A08(A00(ccData1));
                                if ((A0E2 & 224) != 0) {
                                    this.A04.A08(A00(A0E2));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z10) {
            if (!z11) {
                this.A07 = false;
            }
            if (this.A02 == 1 || this.A02 == 3) {
                this.A05 = A05();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final boolean A0R() {
        return this.A05 != this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.DD, com.facebook.ads.redexgen.X.BG
    public final void AEy() {
    }

    @Override // com.facebook.ads.redexgen.X.DD, com.facebook.ads.redexgen.X.XQ
    public final /* bridge */ /* synthetic */ void AGb(long j10) {
        super.AGb(j10);
    }

    @Override // com.facebook.ads.redexgen.X.DD, com.facebook.ads.redexgen.X.BG
    public final void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A0B(0);
        A0C(4);
        A06();
        this.A07 = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
    }
}
