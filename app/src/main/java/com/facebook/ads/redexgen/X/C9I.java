package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9I  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9I {
    public final int A00;
    public final C9F A01;

    public C9I(int i10, C9F c9f) {
        this.A00 = i10;
        this.A01 = c9f;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final AnonymousClass96 A02(int i10, byte[] bArr, int i11, int[] iArr, int i12) throws IOException {
        return this.A01.A06(i10, bArr, i11, iArr, i12);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}
