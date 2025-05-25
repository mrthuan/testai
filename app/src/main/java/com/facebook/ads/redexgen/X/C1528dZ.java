package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.dZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1528dZ {
    public final InterfaceC1532dd A00;
    public final String A01;
    public final Collection<Cdo> A02;
    public final Collection<Cdo> A03;
    public final List<Rect> A04;

    public C1528dZ(String str, InterfaceC1532dd interfaceC1532dd, List<Rect> rects, Collection<Cdo> collection, Collection<Cdo> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1532dd;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
