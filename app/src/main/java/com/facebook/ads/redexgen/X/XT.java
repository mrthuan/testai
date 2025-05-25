package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: assets/audience_network.dex */
public final class XT implements C9 {
    public static String[] A0F = {"3qzXOmg4s2331UA7hG", "9bk", "VVdoXs4tz6DPKYHGOZRt6RiMCyELY1A5", "g7JlN9bgbBs41PAJ4JuNA0qeFJ1c1UUN", "LKvHqs3IZORZ6jeOQe1pAUwl2aVi1yge", "34f97P4Qb7PfWYgeR24LPv7AajWY1fA6", "GiS2v9udXUeFFnoeEASPbMACNgmzJ", "g0nN8wixzNmLcgKoJI"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public FE A04;
    public FE A05;
    public FE A06;
    public FF A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final InterfaceC0830Gr A0D;
    public final FD A0C = new FD();
    public final FC A0B = new FC();
    public final I4 A0E = new I4(32);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07(C1292Yw c1292Yw, FC fc2) {
        int i10;
        long j10 = fc2.A01;
        this.A0E.A0W(1);
        A06(j10, this.A0E.A00, 1);
        long j11 = j10 + 1;
        byte b10 = this.A0E.A00[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        BF bf2 = c1292Yw.A02;
        String[] strArr = A0F;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[7] = "6HdF621ULlaMIov5Sn";
        strArr2[0] = "aYQM3gHOLvWB46aIdh";
        if (bf2.A04 == null) {
            c1292Yw.A02.A04 = new byte[16];
        }
        A06(j11, c1292Yw.A02.A04, i11);
        long j12 = j11 + i11;
        if (z10) {
            this.A0E.A0W(2);
            A06(j12, this.A0E.A00, 2);
            j12 += 2;
            i10 = this.A0E.A0I();
        } else {
            i10 = 1;
        }
        int[] iArr = c1292Yw.A02.A06;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = c1292Yw.A02.A07;
        if (iArr2 == null || iArr2.length < i10) {
            iArr2 = new int[i10];
        }
        if (z10) {
            int i12 = i10 * 6;
            this.A0E.A0W(i12);
            A06(j12, this.A0E.A00, i12);
            j12 += i12;
            this.A0E.A0Y(0);
            for (int i13 = 0; i13 < i10; i13++) {
                iArr[i13] = this.A0E.A0I();
                iArr2[i13] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = fc2.A00 - ((int) (j12 - fc2.A01));
        }
        C8 c82 = fc2.A02;
        c1292Yw.A02.A03(i10, iArr, iArr2, c82.A03, c1292Yw.A02.A04, c82.A01, c82.A02, c82.A00);
        int i14 = (int) (j12 - fc2.A01);
        fc2.A01 += i14;
        fc2.A00 -= i14;
    }

    public XT(InterfaceC0830Gr interfaceC0830Gr) {
        this.A0D = interfaceC0830Gr;
        this.A0A = interfaceC0830Gr.A7b();
        this.A04 = new FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
    }

    private int A00(int i10) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3t(), new FE(this.A06.A03, this.A0A));
        }
        return Math.min(i10, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j10) {
        if (format == null) {
            return null;
        }
        if (j10 != 0) {
            long j11 = format.A0G;
            String[] strArr = A0F;
            if (strArr[5].charAt(28) != strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "iKt3Y1BQ3CJXTdnfarGB4lWbdbXT1axy";
            strArr2[4] = "iefBNEa9mmKDxjNV7WvFRyBB3S0z1vzT";
            if (j11 != Long.MAX_VALUE) {
                return format.A0H(format.A0G + j10);
            }
            return format;
        }
        return format;
    }

    private void A02(int i10) {
        this.A01 += i10;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j10) {
        while (j10 >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j10) {
        if (j10 == -1) {
            return;
        }
        while (j10 >= this.A04.A03) {
            this.A0D.AEz(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j10, ByteBuffer byteBuffer, int i10) {
        A03(j10);
        while (i10 > 0) {
            int remaining = (int) (this.A05.A03 - j10);
            int min = Math.min(i10, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j10);
            byteBuffer.put(bArr, remaining2, min);
            i10 -= min;
            j10 += min;
            int remaining3 = (j10 > this.A05.A03 ? 1 : (j10 == this.A05.A03 ? 0 : -1));
            if (remaining3 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j10, byte[] bArr, int i10) {
        A03(j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (this.A05.A03 - j10));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j10);
            int remaining = i10 - i11;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i11 -= min;
            j10 += min;
            int remaining2 = (j10 > this.A05.A03 ? 1 : (j10 == this.A05.A03 ? 0 : -1));
            if (remaining2 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.FE r6) {
        /*
            r5 = this;
            boolean r0 = r6.A02
            if (r0 != 0) goto L5
            return
        L5:
            com.facebook.ads.redexgen.X.FE r0 = r5.A06
            boolean r4 = r0.A02
            com.facebook.ads.redexgen.X.FE r0 = r5.A06
            long r2 = r0.A04
            long r0 = r6.A04
            long r2 = r2 - r0
            int r1 = (int) r2
            int r0 = r5.A0A
            int r1 = r1 / r0
            int r4 = r4 + r1
            com.facebook.ads.redexgen.X.Gq[] r2 = new com.facebook.ads.redexgen.X.C0829Gq[r4]
            r1 = 0
        L18:
            int r0 = r2.length
            if (r1 >= r0) goto L26
            com.facebook.ads.redexgen.X.Gq r0 = r6.A01
            r2[r1] = r0
            com.facebook.ads.redexgen.X.FE r6 = r6.A01()
            int r1 = r1 + 1
            goto L18
        L26:
            com.facebook.ads.redexgen.X.Gr r0 = r5.A0D
            r0.AF0(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XT.A08(com.facebook.ads.redexgen.X.FE):void");
    }

    private final void A09(boolean z10) {
        this.A0C.A0H(z10);
        A08(this.A04);
        this.A04 = new FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
        this.A01 = 0L;
        this.A0D.AHB();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j10, boolean z10, boolean z11) {
        return this.A0C.A08(j10, z10, z11);
    }

    public final int A0E(C06709u c06709u, C1292Yw c1292Yw, boolean z10, boolean z11, long j10) {
        int result = this.A0C.A09(c06709u, c1292Yw, z10, z11, this.A02, this.A0B);
        switch (result) {
            case -5:
                this.A02 = c06709u.A00;
                return -5;
            case -4:
                if (!c1292Yw.A04()) {
                    int result2 = (c1292Yw.A00 > j10 ? 1 : (c1292Yw.A00 == j10 ? 0 : -1));
                    if (result2 < 0) {
                        c1292Yw.A00(SlideAtom.USES_MASTER_SLIDE_ID);
                    }
                    boolean A0A = c1292Yw.A0A();
                    String[] strArr = A0F;
                    String str = strArr[3];
                    String str2 = strArr[2];
                    int charAt = str.charAt(7);
                    int result3 = str2.charAt(7);
                    if (charAt != result3) {
                        String[] strArr2 = A0F;
                        strArr2[7] = "nHnyKFMdmGIlRqyLio";
                        strArr2[0] = "5Se0YnkMdMNTcGBGkq";
                        if (A0A) {
                            A07(c1292Yw, this.A0B);
                        }
                        int result4 = this.A0B.A00;
                        c1292Yw.A09(result4);
                        long j11 = this.A0B.A01;
                        ByteBuffer byteBuffer = c1292Yw.A01;
                        int result5 = this.A0B.A00;
                        A05(j11, byteBuffer, result5);
                        return -4;
                    }
                    throw new RuntimeException();
                }
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j10, boolean z10, boolean z11) {
        A04(this.A0C.A0D(j10, z10, z11));
    }

    public final void A0L(FF ff2) {
        this.A07 = ff2;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.C9
    public final void A69(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        if (this.A07 != null && formatChanged) {
            this.A07.ADv(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9
    public final int AFu(InterfaceC0724By interfaceC0724By, int i10, boolean z10) throws IOException, InterruptedException {
        int read = interfaceC0724By.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        return read;
    }

    @Override // com.facebook.ads.redexgen.X.C9
    public final void AFv(I4 i42, int i10) {
        while (i10 > 0) {
            int A00 = A00(i10);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            i42.A0c(bArr, bytesAppended, A00);
            i10 -= A00;
            A02(A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9
    public final void AFw(long j10, int i10, int i11, int i12, C8 c82) {
        if (this.A08) {
            A69(this.A03);
        }
        if (this.A09) {
            if ((i10 & 1) == 0 || !this.A0C.A0J(j10)) {
                return;
            }
            String[] strArr = A0F;
            if (strArr[3].charAt(7) == strArr[2].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "0U0U2SqxFsdc1RAk3H";
            strArr2[0] = "sNqMg87rvgY5P5a5aa";
            this.A09 = false;
        }
        this.A0C.A0G(j10 + this.A00, i10, (this.A01 - i11) - i12, i11, c82);
    }
}
