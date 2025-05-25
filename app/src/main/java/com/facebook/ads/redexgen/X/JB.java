package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public class JB implements InterfaceC1537dj {
    public final /* synthetic */ C0881Is A00;

    public JB(C0881Is c0881Is) {
        this.A00 = c0881Is;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1537dj
    public final void ADV() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList<Runnable> arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC1537dj interfaceC1537dj;
        InterfaceC1537dj interfaceC1537dj2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        for (Runnable runnable2 : arrayList) {
            runnable2.run();
        }
        interfaceC1537dj = this.A00.A00;
        if (interfaceC1537dj != null) {
            interfaceC1537dj2 = this.A00.A00;
            interfaceC1537dj2.ADV();
        }
    }
}
