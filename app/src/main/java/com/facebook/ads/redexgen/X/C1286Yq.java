package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Yq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1286Yq implements C9 {
    @Override // com.facebook.ads.redexgen.X.C9
    public final void A69(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.C9
    public final int AFu(InterfaceC0724By interfaceC0724By, int i10, boolean z10) throws IOException, InterruptedException {
        int AGn = interfaceC0724By.AGn(i10);
        if (AGn == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return AGn;
    }

    @Override // com.facebook.ads.redexgen.X.C9
    public final void AFv(I4 i42, int i10) {
        i42.A0Z(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C9
    public final void AFw(long j10, int i10, int i11, int i12, C8 c82) {
    }
}
