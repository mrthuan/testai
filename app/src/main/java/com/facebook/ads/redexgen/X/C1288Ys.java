package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ys  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1288Ys implements InterfaceC0724By {
    public static String[] A07 = {"UVRdrrF5AQHdn5VM3Ax7WcOvit3GJvfg", "IurwM7uI09sQtW0HXBAe", "aEKj", "lR", "u6F3mb", "doA9UZ62L24DYsON", "v0Wrh1Y4KqLJK8wLp", "upnoaaNR"};
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC0838Gz A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C1288Ys(InterfaceC0838Gz interfaceC0838Gz, long j10, long j11) {
        this.A05 = interfaceC0838Gz;
        this.A02 = j10;
        this.A04 = j11;
    }

    private int A00(int i10) {
        int bytesSkipped = Math.min(this.A00, i10);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i10, int i11) {
        if (this.A00 == 0) {
            return 0;
        }
        int min = Math.min(this.A00, i11);
        System.arraycopy(this.A03, 0, bArr, i10, min);
        A05(min);
        return min;
    }

    private int A02(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i10 + i12, i11 - i12);
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                A07[4] = "iBALdr";
                if (read == -1) {
                    if (i12 == 0 && z10) {
                        return -1;
                    }
                    throw new EOFException();
                }
                return i12 + read;
            }
            throw new RuntimeException();
        }
        throw new InterruptedException();
    }

    private void A03(int i10) {
        if (i10 != -1) {
            this.A02 += i10;
        }
    }

    private void A04(int i10) {
        int i11 = this.A01 + i10;
        int requiredLength = this.A03.length;
        if (i11 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i11;
            int newPeekCapacity = IK.A06(requiredLength2 * 2, 65536 + i11, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i10) {
        this.A00 -= i10;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - 524288) {
            bArr = new byte[this.A00 + 65536];
        }
        byte[] newPeekBuffer = this.A03;
        System.arraycopy(newPeekBuffer, i10, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i10, boolean z10) throws IOException, InterruptedException {
        A04(i10);
        int min = Math.min(this.A00 - this.A01, i10);
        while (min < i10) {
            min = A02(this.A03, this.A01, i10, min, z10);
            if (min == -1) {
                return false;
            }
        }
        int bytesPeeked = this.A01;
        this.A01 = bytesPeeked + i10;
        int i11 = this.A00;
        int bytesPeeked2 = this.A01;
        this.A00 = Math.max(i11, bytesPeeked2);
        if (A07[6].length() != 13) {
            A07[6] = "PCV";
            return true;
        }
        throw new RuntimeException();
    }

    public final boolean A07(int i10, boolean z10) throws IOException, InterruptedException {
        int A00 = A00(i10);
        while (A00 < i10 && A00 != -1) {
            int bytesSkipped = this.A06.length;
            A00 = A02(this.A06, -A00, Math.min(i10, bytesSkipped + A00), A00, z10);
        }
        A03(A00);
        return A00 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final void A3s(int i10) throws IOException, InterruptedException {
        A06(i10, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final long A7g() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final long A81() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final long A86() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final void AEO(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        AEP(bArr, i10, i11, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final boolean AEP(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        if (!A06(i11, z10)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final boolean AEp(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        int A01 = A01(bArr, i10, i11);
        while (A01 < i11 && A01 != -1) {
            A01 = A02(bArr, i10, i11, A01, z10);
        }
        A03(A01);
        return A01 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final void AFq() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final int AGn(int i10) throws IOException, InterruptedException {
        int bytesSkipped = A00(i10);
        if (bytesSkipped == 0) {
            bytesSkipped = A02(this.A06, 0, Math.min(i10, this.A06.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final void AGq(int i10) throws IOException, InterruptedException {
        A07(i10, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final int read(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int bytesRead = A01(bArr, i10, i11);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i10, i11, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724By
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        AEp(bArr, i10, i11, false);
    }
}
