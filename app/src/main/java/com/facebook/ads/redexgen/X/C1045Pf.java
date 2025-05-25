package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.Pf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1045Pf extends InputStream {
    public static String[] A07 = {"B8lxMUavHKfoRp1ohdiOuIMzoadcXLBz", "taDtiJzBvL", "1gxctnmp", "xW0DP8NMjWRKl", "7bIhL0zS", "nSBO3UXQ6VW4x", "omPJR1lrO3rz1FXfY5MEGpCyJVEjNQz7", "CC4tEEDcP37TF"};
    public int A00;
    public long A01;
    public InterfaceC0838Gz A02;
    public final Uri A03;
    public final C1313Zr A04;
    public final InterfaceC0837Gy A05;
    public final String A06;

    public C1045Pf(C1313Zr c1313Zr, Uri uri, InterfaceC0837Gy interfaceC0837Gy) throws IOException {
        this.A04 = c1313Zr;
        this.A05 = interfaceC0837Gy;
        this.A03 = uri;
        this.A06 = RW.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A05.A4t();
        this.A01 = (int) this.A02.AEE(new H3(this.A03, i10, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A02.read(bArr, i10, i11);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.A01 - this.A00;
        if (j11 <= 0) {
            return 0L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        this.A00 = (int) (this.A00 + j10);
        A00(this.A00);
        if (A07[0].charAt(28) != 'X') {
            throw new RuntimeException();
        }
        A07[1] = "2";
        return j10;
    }
}
