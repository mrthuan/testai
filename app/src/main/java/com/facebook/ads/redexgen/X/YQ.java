package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class YQ implements InterfaceC0723Bx, C6 {
    public static byte[] A0J;
    public static String[] A0K = {"wz4V52vnyaYzOzVosV2ggmqDE2de2aPD", "esit5oX7p0ewzuQ78yIb5IGBQ4Ll7QTy", "tMkVwszYh26uN0N48v", "KJWf5gllWosHtEG14Ww8x97Nig", "fJrikXC0LBawWnAwWRav5JxSrwLR9RG4", "RlENClTr9MFxo5IUenPz66cSFO", "MF3OfsQe3I", "XRSHK8nEMc6B"};
    public static final C0 A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0725Bz A09;
    public I4 A0A;
    public boolean A0B;
    public C0729Cd[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final I4 A0F;
    public final I4 A0G;
    public final I4 A0H;
    public final ArrayDeque<YY> A0I;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{-18, 33, Field.NUMCHARS, 26, -51, 32, 22, Field.FILLIN, 18, -51, 25, 18, 32, 32, -51, 33, 21, 14, Field.NUMWORDS, -51, 21, 18, 14, 17, 18, 31, -51, 25, 18, Field.NUMWORDS, 20, 33, 21, -51, -43, 34, Field.NUMWORDS, 32, 34, 29, 29, Field.NUMCHARS, 31, 33, 18, 17, -42, -37, -5, -2, -86, -86};
    }

    static {
        A07();
        A0L = new YR();
        A0M = IK.A08(A04(48, 4, 25));
    }

    public YQ() {
        this(0);
    }

    public YQ(int i10) {
        this.A0E = i10;
        this.A0F = new I4(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new I4(I0.A03);
        this.A0G = new I4(4);
        this.A06 = -1;
    }

    private int A00(long j10) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i10 = 1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        for (int i12 = 0; i12 < this.A0C.length; i12++) {
            C0729Cd c0729Cd = this.A0C[i12];
            int i13 = c0729Cd.A00;
            if (i13 != c0729Cd.A03.A01) {
                long j13 = c0729Cd.A03.A06[i13];
                long j14 = this.A0D[i12][i13];
                long j15 = j13 - j10;
                int i14 = (j15 < 0 || j15 >= 262144) ? 1 : 0;
                if ((i14 == 0 && i10 != 0) || (i14 == i10 && j15 < sampleAccumulatedBytes)) {
                    i10 = i14;
                    sampleAccumulatedBytes = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j12) {
                    j12 = j14;
                    trackIndex = i14;
                    minAccumulatedBytesTrackIndex = i12;
                }
            }
        }
        if (j12 == Long.MAX_VALUE || trackIndex == 0) {
            return i11;
        }
        if (A0K[0].charAt(24) != 'E') {
            throw new RuntimeException();
        }
        A0K[6] = "tZzV2qNllM";
        if (j11 < 10485760 + j12) {
            return i11;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A01(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        int i10;
        long A86 = interfaceC0724By.A86();
        if (this.A06 == -1) {
            this.A06 = A00(A86);
            if (this.A06 == -1) {
                return -1;
            }
        }
        C0729Cd c0729Cd = this.A0C[this.A06];
        C9 trackOutput = c0729Cd.A01;
        int i11 = c0729Cd.A00;
        long j10 = c0729Cd.A03.A06[i11];
        int sampleSize = c0729Cd.A03.A05[i11];
        long j11 = (j10 - A86) + this.A04;
        if (j11 < 0 || j11 >= 262144) {
            c42.A00 = j10;
            return 1;
        }
        if (c0729Cd.A02.A02 == 1) {
            j11 += 8;
            sampleSize -= 8;
        }
        interfaceC0724By.AGq((int) j11);
        if (c0729Cd.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[7].length()) {
                A0K[0] = "vyve0RiE3dygV6rbXBv0klsLEJYuli0L";
                bArr[2] = 0;
                int i12 = c0729Cd.A02.A01;
                int i13 = 4 - c0729Cd.A02.A01;
                while (this.A04 < sampleSize) {
                    if (this.A05 == 0) {
                        interfaceC0724By.readFully(this.A0G.A00, i13, i12);
                        this.A0G.A0Y(0);
                        this.A05 = this.A0G.A0H();
                        this.A0H.A0Y(0);
                        trackOutput.AFv(this.A0H, 4);
                        this.A04 += 4;
                        sampleSize += i13;
                    } else {
                        int AFu = trackOutput.AFu(interfaceC0724By, this.A05, false);
                        this.A04 += AFu;
                        this.A05 -= AFu;
                    }
                }
                i10 = 0;
            } else {
                throw new RuntimeException();
            }
        } else {
            while (true) {
                int i14 = this.A04;
                String[] strArr2 = A0K;
                if (strArr2[1].charAt(20) == strArr2[4].charAt(20)) {
                    A0K[6] = "5r7UGAoy7S";
                    if (i14 >= sampleSize) {
                        break;
                    }
                    int AFu2 = trackOutput.AFu(interfaceC0724By, sampleSize - this.A04, false);
                    this.A04 += AFu2;
                    this.A05 -= AFu2;
                } else if (i14 >= sampleSize) {
                    break;
                } else {
                    int AFu22 = trackOutput.AFu(interfaceC0724By, sampleSize - this.A04, false);
                    this.A04 += AFu22;
                    this.A05 -= AFu22;
                }
            }
            i10 = 0;
        }
        trackOutput.AFw(c0729Cd.A03.A07[i11], c0729Cd.A03.A04[i11], sampleSize, 0, null);
        c0729Cd.A00++;
        this.A06 = -1;
        this.A04 = i10;
        this.A05 = i10;
        return i10;
    }

    public static int A02(C0738Cm c0738Cm, long j10) {
        int A00 = c0738Cm.A00(j10);
        if (A00 == -1) {
            return c0738Cm.A01(j10);
        }
        return A00;
    }

    public static long A03(C0738Cm c0738Cm, long j10, long j11) {
        int A02 = A02(c0738Cm, j10);
        if (A02 == -1) {
            return j11;
        }
        return Math.min(c0738Cm.A06[A02], j11);
    }

    private ArrayList<C0738Cm> A05(YY yy, C1 c12, boolean z10) throws A0 {
        C0735Cj A0C;
        ArrayList<C0738Cm> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < yy.A01.size(); i10++) {
            YY yy2 = yy.A01.get(i10);
            int i11 = ((CO) yy2).A00;
            if (i11 == CO.A1L && (A0C = CT.A0C(yy2, yy.A07(CO.A0n), -9223372036854775807L, null, z10, this.A0B)) != null) {
                C0738Cm A0E = CT.A0E(A0C, yy2.A06(CO.A0d).A06(CO.A0h).A06(CO.A16), c12);
                if (A0E.A01 != 0) {
                    arrayList.add(A0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j10) throws A0 {
        while (true) {
            ArrayDeque<YY> arrayDeque = this.A0I;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[3] = "94GrU73F5EyrcbNA6j51EfMGM9";
            strArr2[5] = "F9uNEWGJqPBROLdqhW4wSeNvu2";
            if (arrayDeque.isEmpty() || this.A0I.peek().A00 != j10) {
                break;
            }
            YY pop = this.A0I.pop();
            if (((CO) pop).A00 == CO.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                YY containerAtom = this.A0I.peek();
                containerAtom.A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j10) {
        C0729Cd[] c0729CdArr;
        for (C0729Cd track : this.A0C) {
            C0738Cm c0738Cm = track.A03;
            int A00 = c0738Cm.A00(j10);
            if (A00 == -1) {
                A00 = c0738Cm.A01(j10);
            }
            track.A00 = A00;
        }
    }

    private void A0A(YY yy) throws A0 {
        ArrayList<C0738Cm> A05;
        int trackCount = -1;
        long j10 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C1 c12 = new C1();
        YX A07 = yy.A07(CO.A1P);
        if (A07 != null && (metadata = CT.A0F(A07, this.A0B)) != null) {
            c12.A05(metadata);
        }
        try {
            A05 = A05(yy, c12, (this.A0E & 1) != 0);
        } catch (YU unused) {
            c12 = new C1();
            A05 = A05(yy, c12, true);
        }
        int size = A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0738Cm c0738Cm = A05.get(i10);
            C0735Cj c0735Cj = c0738Cm.A03;
            C0729Cd c0729Cd = new C0729Cd(c0735Cj, c0738Cm, this.A09.AHA(i10, c0735Cj.A03));
            Format A0F = c0735Cj.A07.A0F(c0738Cm.A00 + 30);
            if (c0735Cj.A03 == 1) {
                if (c12.A03()) {
                    A0F = A0F.A0G(c12.A00, c12.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            c0729Cd.A01.A69(A0F);
            j10 = Math.max(j10, c0735Cj.A04 != -9223372036854775807L ? c0735Cj.A04 : c0738Cm.A02);
            if (c0735Cj.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(c0729Cd);
        }
        this.A02 = trackCount;
        this.A08 = j10;
        this.A0C = (C0729Cd[]) arrayList.toArray(new C0729Cd[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5u();
        this.A09.AG8(this);
    }

    public static boolean A0B(int i10) {
        return i10 == CO.A0j || i10 == CO.A1L || i10 == CO.A0d || i10 == CO.A0h || i10 == CO.A16 || i10 == CO.A0N;
    }

    public static boolean A0C(int i10) {
        if (i10 != CO.A0c && i10 != CO.A0n && i10 != CO.A0V && i10 != CO.A1A && i10 != CO.A1D && i10 != CO.A1B && i10 != CO.A0C && i10 != CO.A0O && i10 != CO.A19 && i10 != CO.A1C && i10 != CO.A1E && i10 != CO.A17 && i10 != CO.A0B) {
            int i11 = CO.A1J;
            String[] strArr = A0K;
            if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                throw new RuntimeException();
            }
            A0K[0] = "U3OZ2jnvkswrjx8Ur9vHK1X6EFaJhYJ7";
            if (i10 != i11 && i10 != CO.A0U && i10 != CO.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC0724By.AEp(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        if (this.A07 == 1) {
            interfaceC0724By.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else {
            long endPosition = this.A07;
            if (endPosition == 0) {
                long A7g = interfaceC0724By.A7g();
                if (A7g == -1 && !this.A0I.isEmpty()) {
                    A7g = this.A0I.peek().A00;
                }
                if (A7g != -1) {
                    long endPosition2 = interfaceC0724By.A86();
                    long j10 = A7g - endPosition2;
                    int i10 = this.A00;
                    String[] strArr = A0K;
                    if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0K;
                    strArr2[1] = "dzRUDibdLgOz76mBe3Hd5q70FZ39yex3";
                    strArr2[4] = "PQflqNZiVauK8bXoCB0g54EgUoVKXKVc";
                    long endPosition3 = i10;
                    this.A07 = j10 + endPosition3;
                }
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A86 = (interfaceC0724By.A86() + this.A07) - this.A00;
                this.A0I.push(new YY(this.A01, A86));
                if (this.A07 == this.A00) {
                    A08(A86);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                AbstractC0844Hf.A04(this.A00 == 8);
                AbstractC0844Hf.A04(this.A07 <= 2147483647L);
                this.A0A = new I4((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new A0(A04(0, 48, 60));
    }

    private boolean A0E(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        long j10 = this.A07 - this.A00;
        long A86 = interfaceC0724By.A86() + j10;
        boolean z10 = false;
        if (this.A0A != null) {
            interfaceC0724By.readFully(this.A0A.A00, this.A00, (int) j10);
            if (this.A01 == CO.A0U) {
                this.A0B = A0F(this.A0A);
            } else {
                boolean isEmpty = this.A0I.isEmpty();
                String[] strArr = A0K;
                if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                    throw new RuntimeException();
                }
                A0K[6] = "JSMKdVw6fi";
                if (!isEmpty) {
                    this.A0I.peek().A09(new YX(this.A01, this.A0A));
                }
            }
        } else if (j10 < 262144) {
            interfaceC0724By.AGq((int) j10);
        } else {
            c42.A00 = interfaceC0724By.A86() + j10;
            z10 = true;
        }
        A08(A86);
        return z10 && this.A03 != 2;
    }

    public static boolean A0F(I4 i42) {
        int A08;
        int majorBrand;
        i42.A0Y(8);
        int A082 = i42.A08();
        int majorBrand2 = A0M;
        if (A082 == majorBrand2) {
            return true;
        }
        i42.A0Z(4);
        do {
            int A04 = i42.A04();
            String[] strArr = A0K;
            String str = strArr[3];
            String str2 = strArr[5];
            int length = str.length();
            int majorBrand3 = str2.length();
            if (length != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "ak31gwjiZ7lchhs8qU";
            strArr2[7] = "SN9Txq6J8sCX";
            if (A04 > 0) {
                A08 = i42.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (A08 != majorBrand);
        return true;
    }

    public static long[][] A0G(C0729Cd[] c0729CdArr) {
        long[][] jArr = new long[c0729CdArr.length];
        int[] iArr = new int[c0729CdArr.length];
        long[] jArr2 = new long[c0729CdArr.length];
        boolean[] tracksFinished = new boolean[c0729CdArr.length];
        for (int i10 = 0; i10 < c0729CdArr.length; i10++) {
            jArr[i10] = new long[c0729CdArr[i10].A03.A01];
            jArr2[i10] = c0729CdArr[i10].A03.A07[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < c0729CdArr.length) {
            long j11 = Long.MAX_VALUE;
            int minTimeTrackIndex = -1;
            for (int i12 = 0; i12 < c0729CdArr.length; i12++) {
                if (!tracksFinished[i12]) {
                    long minTimeUs = jArr2[i12];
                    if (minTimeUs <= j11) {
                        minTimeTrackIndex = i12;
                        j11 = jArr2[i12];
                    }
                }
            }
            int i13 = iArr[minTimeTrackIndex];
            jArr[minTimeTrackIndex][i13] = j10;
            j10 += c0729CdArr[minTimeTrackIndex].A03.A05[i13];
            int i14 = i13 + 1;
            iArr[minTimeTrackIndex] = i14;
            if (i14 < jArr[minTimeTrackIndex].length) {
                jArr2[minTimeTrackIndex] = c0729CdArr[minTimeTrackIndex].A03.A07[i14];
            } else {
                tracksFinished[minTimeTrackIndex] = true;
                i11++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        long secondTimeUs;
        long j11;
        int sampleIndex;
        if (this.A0C.length == 0) {
            return new C5(C7.A04);
        }
        long j12 = -9223372036854775807L;
        long secondOffset = -1;
        int i10 = this.A02;
        if (A0K[6].length() == 10) {
            String[] strArr = A0K;
            strArr[1] = "zNPStOwPeWMWlu6U4cps5UEx93ZdGJzU";
            strArr[4] = "1Oiw5RRZUeL0D5PfWcAG5DXe0fbn2IOb";
            if (i10 != -1) {
                C0738Cm c0738Cm = this.A0C[this.A02].A03;
                int A02 = A02(c0738Cm, j10);
                if (A02 == -1) {
                    return new C5(C7.A04);
                }
                secondTimeUs = c0738Cm.A07[A02];
                j11 = c0738Cm.A06[A02];
                if (secondTimeUs < j10 && A02 < c0738Cm.A01 - 1 && (sampleIndex = c0738Cm.A01(j10)) != -1 && sampleIndex != A02) {
                    j12 = c0738Cm.A07[sampleIndex];
                    secondOffset = c0738Cm.A06[sampleIndex];
                }
            } else {
                secondTimeUs = j10;
                j11 = Long.MAX_VALUE;
            }
            for (int i11 = 0; i11 < this.A0C.length; i11++) {
                int i12 = this.A02;
                if (A0K[6].length() == 10) {
                    A0K[0] = "CBUdIpY9GLFYfu7LhTfnmGuFEDhohH6D";
                    if (i11 != i12) {
                        C0738Cm c0738Cm2 = this.A0C[i11].A03;
                        j11 = A03(c0738Cm2, secondTimeUs, j11);
                        if (j12 != -9223372036854775807L) {
                            secondOffset = A03(c0738Cm2, j12, secondOffset);
                        }
                    }
                }
            }
            C7 c72 = new C7(secondTimeUs, j11);
            if (j12 == -9223372036854775807L) {
                return new C5(c72);
            }
            return new C5(c72, new C7(j12, secondOffset));
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A09 = interfaceC0725Bz;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (A0D(interfaceC0724By)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    if (!A0E(interfaceC0724By, c42)) {
                        break;
                    } else {
                        String[] strArr = A0K;
                        if (strArr[2].length() != strArr[7].length()) {
                            A0K[6] = "Qacs7AJWJq";
                            return 1;
                        }
                        throw new RuntimeException();
                    }
                case 2:
                    return A01(interfaceC0724By, c42);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void AG7(long j10, long j11) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j10 == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A09(j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        return AbstractC0733Ch.A04(interfaceC0724By);
    }
}
