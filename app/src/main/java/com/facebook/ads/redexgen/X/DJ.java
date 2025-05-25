package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DJ {
    public final int A00;
    public final long A01;

    public DJ(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static DJ A00(InterfaceC0724By interfaceC0724By, I4 i42) throws IOException, InterruptedException {
        interfaceC0724By.AEO(i42.A00, 0, 8);
        i42.A0Y(0);
        int A08 = i42.A08();
        long size = i42.A0K();
        return new DJ(A08, size);
    }
}
