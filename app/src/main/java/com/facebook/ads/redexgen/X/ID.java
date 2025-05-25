package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public class ID implements Comparator<IE> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(IE ie2, IE ie3) {
        if (ie2.A00 < ie3.A00) {
            return -1;
        }
        return ie3.A00 < ie2.A00 ? 1 : 0;
    }
}
