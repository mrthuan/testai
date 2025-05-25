package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.dV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1524dV {
    public static C1524dV A03 = null;
    public final II A00;
    public final ViewpointRegistry A01;
    public final C1534df A02;

    public C1524dV(II ii2, AbstractC1540dm abstractC1540dm, C1534df c1534df, ViewpointRegistry viewpointRegistry) {
        this.A00 = ii2;
        this.A01 = viewpointRegistry;
        this.A02 = c1534df;
        abstractC1540dm.A02(new I2(c1534df));
    }

    public static C1524dV A00(II ii2, AbstractC1540dm abstractC1540dm, InterfaceC1543dq interfaceC1543dq, IA ia2) {
        C1524dV localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(ii2);
        return new C1524dV(ii2, abstractC1540dm, new C1534df(ii2, interfaceC1543dq, new C0899Jm(), ia2, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC1539dl interfaceC1539dl) {
        this.A02.A0B(interfaceC1539dl);
    }

    public final void A02(InterfaceC1537dj interfaceC1537dj) {
        this.A02.A0C(interfaceC1537dj);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C1545dt c1545dt) {
        if (this.A00.A00 && c1545dt != null) {
            this.A01.A04(dspViewableNode, c1545dt);
        } else {
            this.A01.A03(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C1545dt c1545dt, Cdo cdo) {
        if (this.A00.A00 && c1545dt != null) {
            this.A01.A05(dspViewableNode, c1545dt, cdo);
        } else {
            this.A01.A06(dspViewableNode, cdo);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, Cdo cdo) {
        A05(dspViewableNode, null, cdo);
    }
}
