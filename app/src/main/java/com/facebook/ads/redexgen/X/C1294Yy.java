package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Yy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1294Yy implements InterfaceC0682Ag {
    public static String[] A0D = {"NxTbi7bx", "NV", "29YIJTQraO09", "tSBtmW6rpVAi", "UK8XAzXUIUX", "n", "AP", "UABkszmBYQrswcP0tzS304augAMBuSYm"};
    public long A06;
    public long A07;
    public BB A08;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;
    public ByteBuffer A09 = InterfaceC0682Ag.A00;
    public ShortBuffer A0B = this.A09.asShortBuffer();
    public ByteBuffer A0A = InterfaceC0682Ag.A00;
    public int A04 = -1;

    public final float A00(float f10) {
        float A00 = IK.A00(f10, 0.1f, 8.0f);
        if (this.A00 != A00) {
            this.A00 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final float A01(float f10) {
        float A00 = IK.A00(f10, 0.1f, 8.0f);
        if (this.A01 != A00) {
            this.A01 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final long A02(long j10) {
        if (this.A07 >= 1024) {
            if (this.A03 == this.A05) {
                return IK.A0F(j10, this.A06, this.A07);
            }
            return IK.A0F(j10, this.A06 * this.A03, this.A07 * this.A05);
        }
        return (long) (this.A01 * j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final boolean A4m(int i10, int i11, int i12) throws C0681Af {
        int i13;
        if (i12 == 2) {
            if (this.A04 == -1) {
                i13 = i10;
            } else {
                i13 = this.A04;
            }
            int outputSampleRateHz = this.A05;
            if (outputSampleRateHz == i10) {
                int outputSampleRateHz2 = this.A02;
                if (outputSampleRateHz2 == i11) {
                    int outputSampleRateHz3 = this.A03;
                    if (outputSampleRateHz3 == i13) {
                        return false;
                    }
                }
            }
            this.A05 = i10;
            this.A02 = i11;
            this.A03 = i13;
            this.A08 = null;
            return true;
        }
        throw new C0681Af(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final ByteBuffer A7u() {
        ByteBuffer byteBuffer = this.A0A;
        ByteBuffer outputBuffer = InterfaceC0682Ag.A00;
        this.A0A = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final int A7v() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final int A7x() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final boolean A9L() {
        return this.A05 != -1 && (Math.abs(this.A01 - 1.0f) >= 0.01f || Math.abs(this.A00 - 1.0f) >= 0.01f || this.A03 != this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final boolean A9Q() {
        if (this.A0C) {
            if (this.A08 != null) {
                BB bb2 = this.A08;
                if (A0D[4].length() != 11) {
                    throw new RuntimeException();
                }
                A0D[7] = "db88kXXxHhEdgH646vKmXFO9QUk0hgxF";
                if (bb2.A0H() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final void AEh() {
        AbstractC0844Hf.A04(this.A08 != null);
        this.A08.A0J();
        this.A0C = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r0 < r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        r6.A09 = java.nio.ByteBuffer.allocateDirect(r4).order(java.nio.ByteOrder.nativeOrder());
        r6.A0B = r6.A09.asShortBuffer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
        if (r0 < r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
        r6.A09.clear();
        r6.A0B.clear();
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEi(java.nio.ByteBuffer r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.BB r0 = r6.A08
            if (r0 == 0) goto Lb4
            r0 = 1
        L5:
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A04(r0)
            boolean r3 = r7.hasRemaining()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1294Yy.A0D
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb7
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1294Yy.A0D
            java.lang.String r1 = "a"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "UChWpKt8"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L47
            java.nio.ShortBuffer r5 = r7.asShortBuffer()
            int r4 = r7.remaining()
            long r2 = r6.A06
            long r0 = (long) r4
            long r2 = r2 + r0
            r6.A06 = r2
            com.facebook.ads.redexgen.X.BB r0 = r6.A08
            r0.A0L(r5)
            int r0 = r7.position()
            int r0 = r0 + r4
            r7.position(r0)
        L47:
            com.facebook.ads.redexgen.X.BB r0 = r6.A08
            int r1 = r0.A0H()
            int r0 = r6.A02
            int r1 = r1 * r0
            int r4 = r1 * 2
            if (r4 <= 0) goto L9a
            java.nio.ByteBuffer r3 = r6.A09
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1294Yy.A0D
            r0 = 6
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L9b
            int r0 = r3.capacity()
            if (r0 >= r4) goto La9
        L6e:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r4)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r1.order(r0)
            r6.A09 = r0
            java.nio.ByteBuffer r0 = r6.A09
            java.nio.ShortBuffer r0 = r0.asShortBuffer()
            r6.A0B = r0
        L84:
            com.facebook.ads.redexgen.X.BB r1 = r6.A08
            java.nio.ShortBuffer r0 = r6.A0B
            r1.A0K(r0)
            long r2 = r6.A07
            long r0 = (long) r4
            long r2 = r2 + r0
            r6.A07 = r2
            java.nio.ByteBuffer r0 = r6.A09
            r0.limit(r4)
            java.nio.ByteBuffer r0 = r6.A09
            r6.A0A = r0
        L9a:
            return
        L9b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1294Yy.A0D
            java.lang.String r1 = "5PqBhzTCE0A"
            r0 = 4
            r2[r0] = r1
            int r0 = r3.capacity()
            if (r0 >= r4) goto La9
            goto L6e
        La9:
            java.nio.ByteBuffer r0 = r6.A09
            r0.clear()
            java.nio.ShortBuffer r0 = r6.A0B
            r0.clear()
            goto L84
        Lb4:
            r0 = 0
            goto L5
        Lb7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1294Yy.AEi(java.nio.ByteBuffer):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final void flush() {
        if (A9L()) {
            if (this.A08 == null) {
                this.A08 = new BB(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                BB bb2 = this.A08;
                if (A0D[4].length() != 11) {
                    throw new RuntimeException();
                }
                A0D[7] = "o7knR9hqYviLmp7iDxNouRnOfflm0cpl";
                bb2.A0I();
            }
        }
        this.A0A = InterfaceC0682Ag.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        this.A09 = InterfaceC0682Ag.A00;
        this.A0B = this.A09.asShortBuffer();
        this.A0A = InterfaceC0682Ag.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
