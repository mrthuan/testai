package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1226Wf implements InterfaceC1544dr<C0882It, C0887Iy> {
    public C1223Wc A00;

    public C1226Wf(C1223Wc c1223Wc) {
        this.A00 = c1223Wc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1544dr
    public final void A5y(Cdo<C0882It, C0887Iy> cdo, InterfaceC1532dd interfaceC1532dd) {
        switch (interfaceC1532dd.A8h(cdo)) {
            case A02:
            case A04:
                this.A00.A02(cdo, interfaceC1532dd);
                return;
            default:
                return;
        }
    }
}
