package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Dg */
/* loaded from: assets/audience_network.dex */
public final class C0757Dg implements XU, InterfaceC0725Bz, HB<XY>, HE, FF {
    public static byte[] A0c;
    public static String[] A0d = {"peLU6GbomQp3KTDTEO6fFbGDd5YKfbx5", "7mT0mr2NYOE5sZhPJJhz2OZpyXxRGG9d", "UXLPIbz1b38T7IFge1hDzhsuoxMK7yBR", "gCShhPyLIj5hpfUfS", "XuIiTKqZqLFDSY9gTXO0Gx3LpXWUQlMf", "5IJgqt6", "EtcMKAz9SJVscvNDduv2RLMG0vWKtUvv", "0mgYyHLWy1r45Lytf"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C6 A07;
    public XV A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final C0786Ep A0S;
    public final InterfaceC0787Eq A0T;
    public final F6 A0U;
    public final InterfaceC0830Gr A0V;
    public final InterfaceC0838Gz A0W;
    public final String A0b;
    public final C1242Wv A0X = new C1242Wv(A07(0, 27, 38));
    public final C0850Hl A0Y = new C0850Hl();
    public final Runnable A0Z = new En(this);
    public final Runnable A0a = new Eo(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public XT[] A0K = new XT[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{30, 61, Field.MACROBUTTON, Field.AUTONUM, Field.IMPORT, 32, 104, 23, 42, Field.ASK, 32, Field.MACROBUTTON, Field.EQ, Field.ASK, 61, 32, 31, Field.IMPORT, Field.AUTONUM, 59, Field.MACROBUTTON, 2, Field.IMPORT, 32, 59, 61, Field.AUTONUM};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.XU
    public final long AGC(InterfaceC0824Gl[] interfaceC0824GlArr, boolean[] zArr, FG[] fgArr, boolean[] zArr2, long j10) {
        int i10;
        int i11;
        AbstractC0844Hf.A04(this.A0F);
        int i12 = this.A01;
        int i13 = 0;
        while (true) {
            i10 = 0;
            if (i13 >= interfaceC0824GlArr.length) {
                break;
            }
            if (fgArr[i13] != null && (interfaceC0824GlArr[i13] == null || !zArr[i13])) {
                i11 = ((XX) fgArr[i13]).A00;
                AbstractC0844Hf.A04(this.A0L[i11]);
                this.A01--;
                this.A0L[i11] = false;
                fgArr[i13] = null;
            }
            i13++;
        }
        boolean z10 = !this.A0I ? j10 == 0 : i12 != 0;
        for (int i14 = 0; i14 < interfaceC0824GlArr.length; i14++) {
            if (fgArr[i14] == null && interfaceC0824GlArr[i14] != null) {
                InterfaceC0824Gl interfaceC0824Gl = interfaceC0824GlArr[i14];
                AbstractC0844Hf.A04(interfaceC0824Gl.length() == 1);
                AbstractC0844Hf.A04(interfaceC0824Gl.A7a(0) == 0);
                int A00 = this.A09.A00(interfaceC0824Gl.A8Y());
                AbstractC0844Hf.A04(!this.A0L[A00]);
                this.A01++;
                this.A0L[A00] = true;
                fgArr[i14] = new XX(this, A00);
                zArr2[i14] = true;
                if (!z10) {
                    XT xt = this.A0K[A00];
                    xt.A0J();
                    z10 = xt.A0D(j10, true, true) == -1 && xt.A0B() != 0;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0E = false;
            this.A0D = false;
            if (this.A0X.A08()) {
                XT[] xtArr = this.A0K;
                int length = xtArr.length;
                while (i10 < length) {
                    xtArr[i10].A0H();
                    i10++;
                }
                this.A0X.A05();
            } else {
                XT[] xtArr2 = this.A0K;
                int length2 = xtArr2.length;
                while (i10 < length2) {
                    xtArr2[i10].A0I();
                    i10++;
                }
            }
        } else if (z10) {
            j10 = AGB(j10);
            for (int i15 = 0; i15 < fgArr.length; i15++) {
                if (fgArr[i15] != null) {
                    zArr2[i15] = true;
                }
            }
        }
        this.A0I = true;
        return j10;
    }

    static {
        A0B();
    }

    public C0757Dg(Uri uri, InterfaceC0838Gz interfaceC0838Gz, InterfaceC0723Bx[] interfaceC0723BxArr, int i10, F6 f62, InterfaceC0787Eq interfaceC0787Eq, InterfaceC0830Gr interfaceC0830Gr, String str, int i11) {
        this.A0Q = uri;
        this.A0W = interfaceC0838Gz;
        this.A0O = i10;
        this.A0U = f62;
        this.A0T = interfaceC0787Eq;
        this.A0V = interfaceC0830Gr;
        this.A0b = str;
        this.A0P = i11;
        this.A0S = new C0786Ep(interfaceC0723BxArr, this);
        this.A00 = i10 == -1 ? 3 : i10;
        f62.A03();
    }

    private int A00() {
        int i10 = 0;
        for (XT xt : this.A0K) {
            int extractedSamplesCount = xt.A0C();
            i10 += extractedSamplesCount;
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.HB
    /* renamed from: A01 */
    public final int ACT(XY xy, long j10, long j11, IOException iOException) {
        H3 h32;
        long j12;
        long j13;
        boolean isErrorFatal = A0N(iOException);
        F6 f62 = this.A0U;
        h32 = xy.A03;
        j12 = xy.A02;
        long j14 = this.A03;
        j13 = xy.A00;
        f62.A0H(h32, 1, -1, null, 0, null, j12, j14, j10, j11, j13, iOException, isErrorFatal);
        A0E(xy);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(xy, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long j10 = Long.MIN_VALUE;
        for (XT xt : this.A0K) {
            long largestQueuedTimestampUs = xt.A0F();
            j10 = Math.max(j10, largestQueuedTimestampUs);
        }
        return j10;
    }

    public void A09() {
        if (this.A0G) {
            return;
        }
        boolean z10 = this.A0F;
        if (A0d[5].length() != 14) {
            A0d[1] = "ZlqthdC5a5V1gMLl5Bq31xGEZ23V1gO9";
            if (z10 || this.A07 == null || !this.A0H) {
                return;
            }
            for (XT xt : this.A0K) {
                if (xt.A0G() == null) {
                    return;
                }
            }
            this.A0Y.A01();
            int length = this.A0K.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            this.A0N = new boolean[length];
            this.A0L = new boolean[length];
            this.A0M = new boolean[length];
            this.A03 = this.A07.A7F();
            int i10 = 0;
            while (true) {
                boolean z11 = true;
                if (i10 < length) {
                    Format A0G = this.A0K[i10].A0G();
                    trackGroupArr[i10] = new TrackGroup(A0G);
                    String str = A0G.A0O;
                    if (!AbstractC0862Hx.A0B(str)) {
                        boolean A09 = AbstractC0862Hx.A09(str);
                        String[] strArr = A0d;
                        String str2 = strArr[2];
                        String str3 = strArr[0];
                        int charAt = str2.charAt(13);
                        int trackCount = str3.charAt(13);
                        if (charAt == trackCount) {
                            break;
                        }
                        A0d[5] = "wjlt";
                        if (!A09) {
                            z11 = false;
                        }
                    }
                    this.A0N[i10] = z11;
                    this.A0A |= z11;
                    i10++;
                } else {
                    this.A09 = new TrackGroupArray(trackGroupArr);
                    if (this.A0O == -1) {
                        int trackCount2 = (this.A05 > (-1L) ? 1 : (this.A05 == (-1L) ? 0 : -1));
                        if (trackCount2 == 0) {
                            int trackCount3 = (this.A07.A7F() > (-9223372036854775807L) ? 1 : (this.A07.A7F() == (-9223372036854775807L) ? 0 : -1));
                            if (trackCount3 == 0) {
                                if (A0d[1].charAt(24) != 'Q') {
                                    String[] strArr2 = A0d;
                                    strArr2[7] = "bvBqSLHYyRK7T41Ph";
                                    strArr2[3] = "q1iL5o2Amc4Ds9Lvm";
                                    this.A00 = 6;
                                } else {
                                    A0d[5] = "4JTtgCqRPlniUROX";
                                    this.A00 = 6;
                                }
                            }
                        }
                    }
                    this.A0F = true;
                    this.A0T.ADc(this.A03, this.A07.A9h());
                    this.A08.ADC(this);
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0A() {
        H3 h32;
        long j10;
        XY xy = new XY(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            AbstractC0844Hf.A04(A0I());
            if (this.A03 != -9223372036854775807L) {
                long j11 = this.A06;
                long j12 = this.A03;
                if (A0d[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0d;
                strArr[4] = "EEVowzvPGAuoS8G3kXEqEFrH8fWZZ317";
                strArr[6] = "VR26HTJrPSZGT1wLH8eUhUMOdoWDO7dv";
                if (j11 >= j12) {
                    this.A0B = true;
                    this.A06 = -9223372036854775807L;
                    return;
                }
            }
            xy.A04(this.A07.A8H(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(xy, this, this.A00);
        F6 f62 = this.A0U;
        h32 = xy.A03;
        j10 = xy.A02;
        f62.A0E(h32, 1, -1, null, 0, null, j10, this.A03, A04);
    }

    private void A0C(int i10) {
        if (!this.A0M[i10]) {
            Format A01 = this.A09.A01(i10).A01(0);
            this.A0U.A06(AbstractC0862Hx.A01(A01.A0O), A01, 0, null, this.A04);
            this.A0M[i10] = true;
        }
    }

    private void A0D(int i10) {
        if (!this.A0E || !this.A0N[i10] || this.A0K[i10].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (XT xt : this.A0K) {
            xt.A0I();
        }
        this.A08.ABd(this);
    }

    private void A0E(XY xy) {
        long j10;
        if (this.A05 != -1) {
            return;
        }
        j10 = xy.A01;
        this.A05 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.HB
    /* renamed from: A0F */
    public final void ACS(XY xy, long j10, long j11) {
        H3 h32;
        long j12;
        long j13;
        long j14;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j14 = 0;
            } else {
                j14 = 10000 + A02;
            }
            this.A03 = j14;
            this.A0T.ADc(this.A03, this.A07.A9h());
        }
        F6 f62 = this.A0U;
        h32 = xy.A03;
        j12 = xy.A02;
        long j15 = this.A03;
        j13 = xy.A00;
        f62.A0G(h32, 1, -1, null, 0, null, j12, j15, j10, j11, j13);
        A0E(xy);
        this.A0B = true;
        this.A08.ABd(this);
    }

    @Override // com.facebook.ads.redexgen.X.HB
    /* renamed from: A0G */
    public final void ACQ(XY xy, long j10, long j11, boolean z10) {
        H3 h32;
        long j12;
        long j13;
        F6 f62 = this.A0U;
        h32 = xy.A03;
        j12 = xy.A02;
        long j14 = this.A03;
        j13 = xy.A00;
        f62.A0F(h32, 1, -1, null, 0, null, j12, j14, j10, j11, j13);
        if (!z10) {
            A0E(xy);
            for (XT xt : this.A0K) {
                xt.A0I();
            }
            if (this.A01 > 0) {
                this.A08.ABd(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j10) {
        int length = this.A0K.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return true;
            }
            XT xt = this.A0K[i10];
            xt.A0J();
            int i11 = xt.A0D(j10, true, false);
            if ((i11 != -1) || (!this.A0N[i10] && this.A0A)) {
                i10++;
            }
        }
        return false;
    }

    private boolean A0L(XY xy, int i10) {
        if (this.A05 != -1 || (this.A07 != null && this.A07.A7F() != -9223372036854775807L)) {
            this.A02 = i10;
            if (A0d[5].length() != 14) {
                A0d[1] = "skDgVB0Ht0zuzgTIxTUQ6nUZxrKrp9x6";
                return true;
            }
        } else {
            if (this.A0F && !A0J()) {
                this.A0E = true;
                return false;
            }
            this.A0D = this.A0F;
            this.A04 = 0L;
            this.A02 = 0;
            for (XT xt : this.A0K) {
                xt.A0I();
                String[] strArr = A0d;
                if (strArr[4].charAt(26) == strArr[6].charAt(26)) {
                    String[] strArr2 = A0d;
                    strArr2[7] = "KZ8GDv2dcd7yDyxHm";
                    strArr2[3] = "atXiisDnWt347KW7D";
                }
            }
            xy.A04(0L, 0L);
            return true;
        }
        throw new RuntimeException();
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof XR;
    }

    public final int A0O(int i10, long j10) {
        int skipCount;
        if (A0J()) {
            return 0;
        }
        XT xt = this.A0K[i10];
        if (this.A0B && j10 > xt.A0F()) {
            skipCount = xt.A0A();
        } else {
            skipCount = xt.A0D(j10, true, true);
            if (skipCount == -1) {
                skipCount = 0;
            }
        }
        if (skipCount > 0) {
            A0C(i10);
        } else {
            A0D(i10);
        }
        return skipCount;
    }

    public final int A0P(int i10, C06709u c06709u, C1292Yw c1292Yw, boolean z10) {
        if (A0J()) {
            return -3;
        }
        XT xt = this.A0K[i10];
        String[] strArr = A0d;
        if (strArr[4].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0d[1] = "CFUr7kPjUmptptxTmpAlPyDYAkhTIB3I";
        int A0E = xt.A0E(c06709u, c1292Yw, z10, this.A0B, this.A04);
        if (A0E == -4) {
            A0C(i10);
        } else if (A0E == -3) {
            A0D(i10);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (XT xt : this.A0K) {
                xt.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i10) {
        return !A0J() && (this.A0B || this.A0K[i10].A0M());
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final boolean A4p(long j10) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean A02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final void A5W(long j10, boolean z10) {
        int length = this.A0K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.A0K[i10].A0K(j10, z10, this.A0L[i10]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0725Bz
    public final void A5u() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final long A6L(long j10, AI ai2) {
        if (!this.A07.A9h()) {
            return 0L;
        }
        C5 A8H = this.A07.A8H(j10);
        return IK.A0I(j10, ai2, A8H.A00.A01, A8H.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final long A6b() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            return this.A06;
        }
        if (this.A0A) {
            A02 = Long.MAX_VALUE;
            int i10 = this.A0K.length;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.A0N[i11]) {
                    A02 = Math.min(A02, this.A0K[i11].A0F());
                }
            }
        } else {
            A02 = A02();
        }
        int trackCount = (A02 > Long.MIN_VALUE ? 1 : (A02 == Long.MIN_VALUE ? 0 : -1));
        if (trackCount == 0) {
            return this.A04;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final long A7s() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A6b();
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final TrackGroupArray A8Z() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final void AAn() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.HE
    public final void ACX() {
        for (XT xt : this.A0K) {
            xt.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.X.FF
    public final void ADv(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final void AEX(XV xv, long j10) {
        this.A08 = xv;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final long AEo() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                String[] strArr = A0d;
                if (strArr[2].charAt(13) != strArr[0].charAt(13)) {
                    String[] strArr2 = A0d;
                    strArr2[4] = "8QQskbS2Pw4utxbEv0LyYmP5VjWpvONg";
                    strArr2[6] = "uwG3ZIcw3rm7jy9KlanJYK16xJWMutQx";
                    this.A0D = false;
                    return this.A04;
                }
                throw new RuntimeException();
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final void AEu(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0725Bz
    public final void AG8(C6 c62) {
        this.A07 = c62;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.XU
    public final long AGB(long j10) {
        if (!this.A07.A9h()) {
            j10 = 0;
        }
        this.A04 = j10;
        this.A0D = false;
        if (!A0I() && A0K(j10)) {
            return j10;
        }
        this.A0E = false;
        this.A06 = j10;
        this.A0B = false;
        if (this.A0X.A08()) {
            C1242Wv c1242Wv = this.A0X;
            if (A0d[5].length() == 14) {
                throw new RuntimeException();
            }
            A0d[1] = "E7sj14dZL93fqj6GUgSTTa20SijXvEHd";
            c1242Wv.A05();
        } else {
            for (XT xt : this.A0K) {
                xt.A0I();
            }
        }
        return j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0725Bz
    public final C9 AHA(int i10, int i11) {
        int length = this.A0K.length;
        for (int i12 = 0; i12 < length; i12++) {
            int trackCount = this.A0J[i12];
            if (trackCount == i10) {
                return this.A0K[i12];
            }
        }
        XT xt = new XT(this.A0V);
        xt.A0L(this);
        int trackCount2 = length + 1;
        this.A0J = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J[length] = i10;
        int trackCount3 = length + 1;
        this.A0K = (XT[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K[length] = xt;
        return xt;
    }
}
