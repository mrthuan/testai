package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class H9 extends IOException {
    public final int A00;
    public final H3 A01;

    public H9(IOException iOException, H3 h32, int i10) {
        super(iOException);
        this.A01 = h32;
        this.A00 = i10;
    }

    public H9(String str, H3 h32, int i10) {
        super(str);
        this.A01 = h32;
        this.A00 = i10;
    }

    public H9(String str, IOException iOException, H3 h32, int i10) {
        super(str, iOException);
        this.A01 = h32;
        this.A00 = i10;
    }
}
