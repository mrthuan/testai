package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Z5 implements B2 {
    public final C1295Yz A00 = new C1295Yz();
    public final C1294Yy A01 = new C1294Yy();
    public final InterfaceC0682Ag[] A02;

    public Z5(InterfaceC0682Ag... interfaceC0682AgArr) {
        this.A02 = (InterfaceC0682Ag[]) Arrays.copyOf(interfaceC0682AgArr, interfaceC0682AgArr.length + 2);
        this.A02[interfaceC0682AgArr.length] = this.A00;
        this.A02[interfaceC0682AgArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.B2
    public final A2 A3x(A2 a22) {
        this.A00.A0B(a22.A02);
        return new A2(this.A01.A01(a22.A01), this.A01.A00(a22.A00), a22.A02);
    }

    @Override // com.facebook.ads.redexgen.X.B2
    public final InterfaceC0682Ag[] A6S() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.B2
    public final long A7m(long j10) {
        return this.A01.A02(j10);
    }

    @Override // com.facebook.ads.redexgen.X.B2
    public final long A8O() {
        return this.A00.A0A();
    }
}
