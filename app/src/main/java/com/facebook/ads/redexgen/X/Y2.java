package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class Y2 implements D3 {
    public static String[] A0C = {"Bbs", "qKP6KHSkWW9KU9paIT6cf", "rU75di5eOLilCbxPpy0GSAGaZrwajqTf", "YuVhXtragfVeFRPbNAekYc6E0B7lda9D", "hXC", "Q2lOeY0ESaZONfZDo5", "kBrVqaC6UGic4BlLAWI19a1g6tHSTPJ5", "2JtfLv4jLMmGEDOdqHeBx3Ka5hQzD6D9"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C9 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final C3 A09;
    public final I4 A0A;
    public final String A0B;

    public Y2() {
        this(null);
    }

    public Y2(String str) {
        this.A02 = 0;
        this.A0A = new I4(4);
        this.A0A.A00[0] = -1;
        this.A09 = new C3();
        this.A0B = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[LOOP:0: B:3:0x000a->B:16:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00(com.facebook.ads.redexgen.X.I4 r9) {
        /*
            r8 = this;
            byte[] r6 = r9.A00
            int r5 = r9.A06()
            int r7 = r9.A07()
        La:
            if (r5 >= r7) goto L42
            r1 = r6[r5]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            r4 = 0
            r3 = 1
            if (r1 != r0) goto L40
            r2 = 1
        L16:
            boolean r0 = r8.A08
            if (r0 == 0) goto L3e
            r1 = r6[r5]
            r0 = 224(0xe0, float:3.14E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L3e
            r0 = 1
        L22:
            r8.A08 = r2
            if (r0 == 0) goto L3b
            int r0 = r5 + 1
            r9.A0Y(r0)
            r8.A08 = r4
            com.facebook.ads.redexgen.X.I4 r0 = r8.A0A
            byte[] r1 = r0.A00
            r0 = r6[r5]
            r1[r3] = r0
            r0 = 2
            r8.A00 = r0
            r8.A02 = r3
            return
        L3b:
            int r5 = r5 + 1
            goto La
        L3e:
            r0 = 0
            goto L22
        L40:
            r2 = 0
            goto L16
        L42:
            r9.A0Y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y2.A00(com.facebook.ads.redexgen.X.I4):void");
    }

    private void A01(I4 i42) {
        int min = Math.min(i42.A04(), this.A01 - this.A00);
        this.A05.AFv(i42, min);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + min;
        int i10 = this.A00;
        int bytesToRead2 = this.A01;
        if (i10 < bytesToRead2) {
            return;
        }
        this.A05.AFw(this.A04, 1, this.A01, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        this.A02 = 0;
    }

    private void A02(I4 i42) {
        int min = Math.min(i42.A04(), 4 - this.A00);
        i42.A0c(this.A0A.A00, this.A00, min);
        this.A00 += min;
        if (this.A00 < 4) {
            return;
        }
        this.A0A.A0Y(0);
        if (C3.A04(this.A0A.A08(), this.A09)) {
            this.A01 = this.A09.A02;
            if (!this.A07) {
                this.A03 = (this.A09.A04 * 1000000) / this.A09.A03;
                this.A05.A69(Format.A07(this.A06, this.A09.A06, null, -1, 4096, this.A09.A01, this.A09.A03, null, null, 0, this.A0B));
                this.A07 = true;
            }
            this.A0A.A0Y(0);
            this.A05.AFv(this.A0A, 4);
            this.A02 = 2;
            return;
        }
        this.A00 = 0;
        int bytesToRead = A0C[7].charAt(6);
        if (bytesToRead != 52) {
            throw new RuntimeException();
        }
        A0C[2] = "yj03MnPaN3pOKkNVSQZdPFhvu9IxLlvy";
        this.A02 = 1;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A4n(I4 i42) {
        while (i42.A04() > 0) {
            switch (this.A02) {
                case 0:
                    A00(i42);
                    break;
                case 1:
                    A02(i42);
                    break;
                case 2:
                    A01(i42);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A5B(InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
        dh2.A05();
        this.A06 = dh2.A04();
        this.A05 = interfaceC0725Bz.AHA(dh2.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEM(long j10, boolean z10) {
        this.A04 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AG6() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
