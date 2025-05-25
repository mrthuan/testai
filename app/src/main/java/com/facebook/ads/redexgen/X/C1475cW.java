package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1475cW implements C6X {
    public static byte[] A04;
    public final /* synthetic */ InterfaceC04540x A00;
    public final /* synthetic */ GK A01;
    public final /* synthetic */ C0783Ei A02;
    public final /* synthetic */ C0974Mm A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C1475cW(GK gk2, C0974Mm c0974Mm, InterfaceC04540x interfaceC04540x, C0783Ei c0783Ei) {
        this.A01 = gk2;
        this.A03 = c0974Mm;
        this.A00 = interfaceC04540x;
        this.A02 = c0783Ei;
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABT() {
        long j10;
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 69);
        InterfaceC1498ct A0E = this.A02.A0E();
        j10 = this.A01.A00;
        A0E.A38(C0956Lu.A01(j10), adErrorType.getErrorCode(), A00);
        this.A00.ACN(this.A01, C0894Jg.A01(adErrorType, A00));
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABc() {
        InterfaceC04540x interfaceC04540x;
        this.A03.A0J();
        this.A00.ABO(this.A01, this.A03);
        InterfaceC1498ct A0E = this.A02.A0E();
        interfaceC04540x = this.A01.A01;
        A0E.A44(interfaceC04540x != null);
    }
}
