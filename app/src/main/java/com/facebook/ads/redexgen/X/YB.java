package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class YB implements D3 {
    public static byte[] A0H;
    public static final byte[] A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C9 A07;
    public C9 A08;
    public C9 A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final I3 A0D;
    public final I4 A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-69, -81, -15, 4, 3, -81, -16, 2, 2, 4, -4, -8, -3, -10, -81, -48, -48, -46, -81, -37, -46, -67, Field.SHAPE, -126, -110, -111, 112, -125, Byte.MAX_VALUE, -126, -125, -112, 104, -119, -104, -119, -121, -104, -119, -120, Field.INCLUDETEXT, -123, -103, -120, -115, -109, Field.INCLUDETEXT, -109, -122, -114, -119, -121, -104, Field.INCLUDETEXT, -104, -99, -108, -119, Field.GREETINGLINE, Field.INCLUDETEXT, -23, -8, -8, -12, -15, -21, -23, -4, -15, -9, -10, -73, -15, -20, -69, -25, -5, -22, -17, -11, -75, -13, -10, -70, -25, -77, -14, -25, -6, -13};
    }

    static {
        A06();
        A0I = new byte[]{Field.TOA, Field.INCLUDETEXT, Field.MACROBUTTON};
    }

    public YB(boolean z10) {
        this(z10, null);
    }

    public YB(boolean z10, String str) {
        this.A0D = new I3(new byte[7]);
        this.A0E = new I4(Arrays.copyOf(A0I, 10));
        A03();
        this.A0G = z10;
        this.A0F = str;
    }

    private void A01() throws A0 {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 4), A00(32, 28, 10) + A04 + A00(0, 22, 117));
                A04 = 2;
            }
            int A042 = this.A0D.A04(4);
            this.A0D.A08(1);
            int audioObjectType = this.A0D.A04(3);
            byte[] A07 = AbstractC0848Hj.A07(A04, A042, audioObjectType);
            Pair<Integer, Integer> A03 = AbstractC0848Hj.A03(A07);
            Format format = Format.A07(this.A0A, A00(75, 15, 108), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(A07), null, 0, this.A0F);
            int audioObjectType2 = format.A0C;
            this.A05 = 1024000000 / audioObjectType2;
            this.A09.A69(format);
            this.A0C = true;
        } else {
            this.A0D.A08(10);
        }
        this.A0D.A08(4);
        int A043 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A043 -= 2;
        }
        A07(this.A09, this.A05, 0, A043);
    }

    private void A02() {
        this.A08.AFv(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0I.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(C9 c92, long j10, int i10, int i11) {
        this.A03 = 3;
        this.A00 = i10;
        this.A07 = c92;
        this.A04 = j10;
        this.A02 = i11;
    }

    private void A08(I4 i42) {
        byte[] bArr = i42.A00;
        int A06 = i42.A06();
        int A07 = i42.A07();
        while (A06 < A07) {
            int i10 = A06 + 1;
            int position = bArr[A06] & FunctionEval.FunctionID.EXTERNAL_FUNC;
            if (this.A01 == 512 && position >= 240 && position != 255) {
                this.A0B = (position & 1) == 0;
                A04();
                i42.A0Y(i10);
                return;
            }
            switch (this.A01 | position) {
                case 329:
                    this.A01 = 768;
                    break;
                case 511:
                    this.A01 = 512;
                    break;
                case 836:
                    this.A01 = 1024;
                    break;
                case 1075:
                    A05();
                    i42.A0Y(i10);
                    return;
                default:
                    int data = this.A01;
                    if (data == 256) {
                        break;
                    } else {
                        this.A01 = 256;
                        A06 = i10 - 1;
                        continue;
                    }
            }
            A06 = i10;
        }
        i42.A0Y(A06);
    }

    private void A09(I4 i42) {
        int min = Math.min(i42.A04(), this.A02 - this.A00);
        this.A07.AFv(i42, min);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + min;
        int i10 = this.A00;
        int bytesToRead2 = this.A02;
        if (i10 == bytesToRead2) {
            this.A07.AFw(this.A06, 1, this.A02, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(I4 i42, byte[] bArr, int i10) {
        int min = Math.min(i42.A04(), i10 - this.A00);
        int bytesToRead = this.A00;
        i42.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A4n(I4 i42) throws A0 {
        while (i42.A04() > 0) {
            switch (this.A03) {
                case 0:
                    A08(i42);
                    break;
                case 1:
                    if (!A0A(i42, this.A0E.A00, 10)) {
                        break;
                    } else {
                        A02();
                        break;
                    }
                case 2:
                    if (!A0A(i42, this.A0D.A00, this.A0B ? 7 : 5)) {
                        break;
                    } else {
                        A01();
                        break;
                    }
                case 3:
                    A09(i42);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A5B(InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
        dh2.A05();
        this.A0A = dh2.A04();
        this.A09 = interfaceC0725Bz.AHA(dh2.A03(), 1);
        if (this.A0G) {
            dh2.A05();
            this.A08 = interfaceC0725Bz.AHA(dh2.A03(), 4);
            this.A08.A69(Format.A0B(dh2.A04(), A00(60, 15, 110), null, -1, null));
            return;
        }
        this.A08 = new C1286Yq();
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEM(long j10, boolean z10) {
        this.A06 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AG6() {
        A03();
    }
}
