package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.cy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1503cy implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1503cy(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void AEF(int i10) throws C1502cx {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1502cx {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C1502cx {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1502cx {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
