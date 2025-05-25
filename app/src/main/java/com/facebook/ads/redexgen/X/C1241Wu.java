package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Wu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1241Wu implements InterfaceC0838Gz {
    public final int A00;
    public final InterfaceC0838Gz A01;
    public final I8 A02;

    public C1241Wu(InterfaceC0838Gz interfaceC0838Gz, I8 i82, int i10) {
        this.A01 = (InterfaceC0838Gz) AbstractC0844Hf.A01(interfaceC0838Gz);
        this.A02 = (I8) AbstractC0844Hf.A01(i82);
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        return this.A01.A8c();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.AEE(h32);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
