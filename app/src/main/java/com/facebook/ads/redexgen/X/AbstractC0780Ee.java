package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ee  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0780Ee implements ZA, AF {
    public static byte[] A09;
    public static String[] A0A = {"TGIDFoCBYxIF6ABX8Bb3YhgSCE6qJKJw", "k8x7EORVgyJpniE3v7l1sl2ahbf", "4b9Q5nu1tg7UbAwdel0cO", "y7Iepw7clTjfA3BSQvCr3z0BBal2gVJQ", "BkJkflNpLqMAXbClsZu1Tgk", "7g28kXVMy8F22eANNiIr0umbfD8", "uCFoYTNMIzRreI1EZJcJh", ""};
    public int A00;
    public int A01;
    public long A02;
    public AG A03;
    public FG A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public static String A0w(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0A;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0A[4] = "PtCLOxMd8VvSKNflPtLSreF";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    public static void A0x() {
        A09 = new byte[]{125, Byte.MAX_VALUE, 112, Field.SHAPE, 125, 111, 107, 119, 108, 123, 77, 123, 109, 109, 119, 113, 112};
    }

    public abstract void A15();

    public abstract void A16(long j10, boolean z10) throws C06589h;

    static {
        A0x();
    }

    public AbstractC0780Ee(int i10) {
        this.A08 = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0y(InterfaceC0707Bh<?> interfaceC0707Bh, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC0707Bh == null) {
            if (A0A[4].length() != 23) {
                throw new RuntimeException();
            }
            A0A[7] = "AgFTFeTwA";
            return false;
        }
        throw new NullPointerException(A0w(0, 17, 84));
    }

    public final int A0z() {
        return this.A00;
    }

    public final int A10(long j10) {
        return this.A04.AGp(j10 - this.A02);
    }

    public final int A11(C06709u c06709u, C1292Yw c1292Yw, boolean z10) {
        int AEn = this.A04.AEn(c06709u, c1292Yw, z10);
        if (AEn == -4) {
            if (c1292Yw.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            long j10 = c1292Yw.A00 + this.A02;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[1];
            int length = str.length();
            int result = str2.length();
            if (length == result) {
                String[] strArr2 = A0A;
                strArr2[5] = "CzSSMfFdvLk6vI6nJvpBH5LM7Bz";
                strArr2[1] = "xvblbbOmPCw57hjiz1VSTisu9P6";
                c1292Yw.A00 = j10;
                return AEn;
            }
            throw new RuntimeException();
        }
        if (AEn == -5) {
            Format format = c06709u.A00;
            int result2 = (format.A0G > Long.MAX_VALUE ? 1 : (format.A0G == Long.MAX_VALUE ? 0 : -1));
            if (result2 != 0) {
                long j11 = format.A0G + this.A02;
                String[] strArr3 = A0A;
                String str3 = strArr3[6];
                String str4 = strArr3[2];
                int length2 = str3.length();
                int result3 = str4.length();
                if (length2 == result3) {
                    A0A[4] = "tyRJUCaEOPSIcdTfNMFBVXS";
                    c06709u.A00 = format.A0H(j11);
                }
                throw new RuntimeException();
            }
        }
        return AEn;
    }

    public final AG A12() {
        return this.A03;
    }

    public void A13() throws C06589h {
    }

    public void A14() throws C06589h {
    }

    public void A17(boolean z10) throws C06589h {
    }

    public void A18(Format[] formatArr, long j10) throws C06589h {
    }

    public final boolean A19() {
        return this.A05 ? this.A06 : this.A04.A9b();
    }

    public final Format[] A1A() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void A5U() {
        AbstractC0844Hf.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A15();
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void A5r(AG ag2, Format[] formatArr, FG fg2, long j10, boolean z10, long j11) throws C06589h {
        AbstractC0844Hf.A04(this.A01 == 0);
        this.A03 = ag2;
        this.A01 = 1;
        A17(z10);
        AFh(formatArr, fg2, j11);
        A16(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final AF A6g() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public InterfaceC0860Hv A7l() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final int A8P() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final FG A8S() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.ZA, com.facebook.ads.redexgen.X.AF
    public final int A8a() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.AC
    public void A8t(int i10, Object obj) throws C06589h {
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final boolean A8z() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final boolean A9N() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void AAp() throws IOException {
        this.A04.AAm();
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void AFh(Format[] formatArr, FG fg2, long j10) throws C06589h {
        AbstractC0844Hf.A04(!this.A06);
        this.A04 = fg2;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j10;
        A18(formatArr, j10);
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void AFr(long j10) throws C06589h {
        this.A06 = false;
        this.A05 = false;
        A16(j10, false);
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void AGO() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void AGS(int i10) {
        this.A00 = i10;
    }

    public int AH8() throws C06589h {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void start() throws C06589h {
        AbstractC0844Hf.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final void stop() throws C06589h {
        AbstractC0844Hf.A04(this.A01 == 2);
        String[] strArr = A0A;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0A[4] = "rU4Km09Vru4RjUp4PpcuDly";
        this.A01 = 1;
        A14();
    }
}
