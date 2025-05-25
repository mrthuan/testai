package com.facebook.ads.redexgen.X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.facebook.ads.redexgen.X.2N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2N extends C3H {
    @Override // com.facebook.ads.redexgen.X.C3H, com.facebook.ads.redexgen.X.C05233o
    public final Object A00(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11);
    }

    @Override // com.facebook.ads.redexgen.X.C3H, com.facebook.ads.redexgen.X.C05233o
    public final Object A01(int i10, int i11, boolean z10, int i12) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12);
    }
}
