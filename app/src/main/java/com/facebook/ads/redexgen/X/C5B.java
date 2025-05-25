package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.5B  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5B {
    public AnonymousClass58 A00 = new AnonymousClass58();
    public final AnonymousClass59 A01;

    public C5B(AnonymousClass59 anonymousClass59) {
        this.A01 = anonymousClass59;
    }

    public final View A00(int i10, int i11, int i12, int i13) {
        int A7z = this.A01.A7z();
        int next = this.A01.A7y();
        int childEnd = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View A6k = this.A01.A6k(i10);
            int A6n = this.A01.A6n(A6k);
            int i14 = this.A01.A6m(A6k);
            this.A00.A03(A7z, next, A6n, i14);
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    return A6k;
                }
            }
            if (i13 != 0) {
                this.A00.A01();
                this.A00.A02(i13);
                if (this.A00.A04()) {
                    view = A6k;
                }
            }
            i10 += childEnd;
        }
        return view;
    }
}
