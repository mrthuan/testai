package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ws  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1239Ws implements InterfaceC0838Gz {
    public long A00;
    public boolean A01;
    public final InterfaceC0836Gx A02;
    public final InterfaceC0838Gz A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws IOException {
        this.A00 = this.A03.AEE(h32);
        if (this.A00 == 0) {
            return 0L;
        }
        if (h32.A02 == -1 && this.A00 != -1) {
            h32 = new H3(h32.A04, h32.A01, h32.A03, this.A00, h32.A05, h32.A00);
        }
        this.A01 = true;
        this.A02.AEG(h32);
        return this.A00;
    }

    public C1239Ws(InterfaceC0838Gz interfaceC0838Gz, InterfaceC0836Gx interfaceC0836Gx) {
        this.A03 = (InterfaceC0838Gz) AbstractC0844Hf.A01(interfaceC0838Gz);
        this.A02 = (InterfaceC0836Gx) AbstractC0844Hf.A01(interfaceC0836Gx);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        return this.A03.A8c();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read > 0) {
            this.A02.write(bArr, i10, read);
            int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
            if (bytesRead != 0) {
                this.A00 -= read;
            }
        }
        return read;
    }
}
