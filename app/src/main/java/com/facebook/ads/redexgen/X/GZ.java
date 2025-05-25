package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class GZ implements Comparator<Format> {
    public GZ() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(Format format, Format format2) {
        return format2.A04 - format.A04;
    }
}
