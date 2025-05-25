package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.facebook.ads.redexgen.X.Vm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1208Vm implements InterfaceC0945Lj {
    public final Collection<String> A00;

    public C1208Vm() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void AEb(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.A00) {
            sb2.append(str);
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
