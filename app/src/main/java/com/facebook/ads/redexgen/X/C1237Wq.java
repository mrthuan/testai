package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Wq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1237Wq implements InterfaceC0836Gx {
    public static String[] A0B = {"O9FvuKNm9Ic7vWVIOgmWo6M6Rn16GEKF", "jzCTQcr3kWPaI80CUjbIE10W230TUzkC", "OGCWJ8MD0aQs1rzTOn0Vjde8DqfkZq8g", "ED1Lm6gLEaTbYzKuTAynsKw0VrQmiyDF", "ADZm06Sr8xsGprSkDFbUPye7calVVjK5", "4YYO9RaBhRqFLuXkLeBvFQjBmPoVatzd", "qTUPArcDYrTCckej64g9Bs5w5vMlxcQY", "EfRxebdqtmYzM7REr089ZAH8rT5xoOFL"};
    public long A00;
    public long A01;
    public H3 A02;
    public IB A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final HP A09;
    public final boolean A0A;

    public C1237Wq(HP hp2, long j10) {
        this(hp2, j10, 20480, true);
    }

    public C1237Wq(HP hp2, long j10, int i10, boolean z10) {
        this.A09 = (HP) AbstractC0844Hf.A01(hp2);
        this.A08 = j10;
        this.A07 = i10;
        this.A0A = z10;
    }

    private void A00() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.flush();
            boolean success = this.A0A;
            if (success) {
                this.A05.getFD().sync();
            }
            IK.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A4j(file);
            } else {
                file.delete();
            }
        } catch (Throwable th2) {
            IK.A0X(this.A06);
            this.A06 = null;
            File file2 = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A4j(file2);
            } else {
                file2.delete();
            }
            throw th2;
        }
    }

    private void A01() throws IOException {
        long maxLength;
        if (this.A02.A02 == -1) {
            maxLength = this.A08;
        } else {
            maxLength = Math.min(this.A02.A02 - this.A00, this.A08);
        }
        this.A04 = this.A09.AGu(this.A02.A05, this.A00 + this.A02.A01, maxLength);
        this.A05 = new FileOutputStream(this.A04);
        if (this.A07 > 0) {
            if (this.A03 == null) {
                this.A03 = new IB(this.A05, this.A07);
            } else {
                this.A03.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
        if (A0B[1].charAt(8) == 'w') {
            throw new RuntimeException();
        }
        A0B[1] = "Vc4jFbtJFhDJOpD2utN43xt10XGoOu5t";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0836Gx
    public final void AEG(H3 h32) throws C1238Wr {
        if (h32.A02 == -1 && !h32.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = h32;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e10) {
            throw new C1238Wr(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0836Gx
    public final void close() throws C1238Wr {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e10) {
            throw new C1238Wr(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0836Gx
    public final void write(byte[] bArr, int i10, int i11) throws C1238Wr {
        if (this.A02 == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.A01 == this.A08) {
                    A00();
                    A01();
                }
                int bytesWritten = i11 - i12;
                int min = (int) Math.min(bytesWritten, this.A08 - this.A01);
                int bytesWritten2 = i10 + i12;
                this.A06.write(bArr, bytesWritten2, min);
                i12 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e10) {
                throw new C1238Wr(e10);
            }
        }
    }
}
