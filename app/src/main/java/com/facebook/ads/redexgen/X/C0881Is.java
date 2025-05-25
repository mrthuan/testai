package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Is  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0881Is implements SharedViewpointManager {
    public static byte[] A07;
    public static String[] A08 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC1537dj A00;
    public C1524dV A01;
    public final InterfaceC1547dv A03;
    public final InterfaceC1538dk A04;
    public final II A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC1537dj A02 = new JB(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-28};
    }

    static {
        A04();
    }

    public C0881Is(II ii2, InterfaceC1547dv interfaceC1547dv, InterfaceC1538dk interfaceC1538dk) {
        this.A05 = ii2;
        this.A03 = interfaceC1547dv;
        this.A04 = interfaceC1538dk;
    }

    public static C0881Is A01() {
        return new C0881Is(new II(), new JS(), null);
    }

    private void A05(AbstractC1540dm abstractC1540dm, InterfaceC1543dq interfaceC1543dq, IA ia2) {
        this.A01 = C1524dV.A00(this.A05, abstractC1540dm, interfaceC1543dq, ia2);
        if (0 != 0) {
            this.A01.A01(null);
        }
        this.A01.A02(this.A02);
        String[] strArr = A08;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A08[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C1545dt c1545dt) {
        C1524dV c1524dV = this.A01;
        if (c1524dV != null && dspViewableNode != null) {
            if (this.A05.A00 && c1545dt != null) {
                c1524dV.A04(dspViewableNode, c1545dt);
            } else {
                c1524dV.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C1545dt c1545dt, Cdo cdo) {
        C1524dV c1524dV = this.A01;
        if (c1524dV != null && dspViewableNode != null && cdo != null) {
            if (this.A05.A00 && c1545dt != null) {
                cdo.A00 = dspViewableNode.hashCode() + A02(0, 1, 27) + cdo.A05 + c1545dt;
                c1524dV.A05(dspViewableNode, c1545dt, cdo);
                return;
            }
            c1524dV.A06(dspViewableNode, cdo);
        }
    }

    public final void A08(View view) {
        A06(view != null ? I9.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, Cdo<?, ?> cdo) {
        A07(view != null ? I9.A00(view) : null, null, cdo);
    }

    public final void A0A(AbstractC1540dm abstractC1540dm, View view) {
        if (abstractC1540dm != null && view != null) {
            A05(abstractC1540dm, new JD(view, this.A03), new C06056z(null));
        }
    }
}
