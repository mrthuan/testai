package com.facebook.ads.redexgen.X;

import android.text.Layout;

/* loaded from: assets/audience_network.dex */
public final class XO extends C0807Fs implements Comparable<XO> {
    public final int A00;

    public XO(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12, z10, i13);
        this.A00 = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(XO xo2) {
        if (xo2.A00 < this.A00) {
            return -1;
        }
        if (xo2.A00 > this.A00) {
            return 1;
        }
        return 0;
    }
}
