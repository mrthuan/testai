package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4v  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4v {
    public SparseArray<C05544u> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        return ((j10 / 4) * 3) + (j11 / 4);
    }

    private C05544u A01(int i10) {
        C05544u c05544u = this.A00.get(i10);
        if (c05544u == null) {
            C05544u c05544u2 = new C05544u();
            this.A00.put(i10, c05544u2);
            return c05544u2;
        }
        return c05544u;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.4u r0 = (com.facebook.ads.redexgen.X.C05544u) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4v.A02():void");
    }

    public final AnonymousClass56 A03(int i10) {
        C05544u c05544u = this.A00.get(i10);
        if (c05544u != null && !c05544u.A03.isEmpty()) {
            ArrayList<AnonymousClass56> arrayList = c05544u.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        C05544u A01 = A01(i10);
        A01.A01 = A00(A01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        C05544u A01 = A01(i10);
        A01.A02 = A00(A01.A02, j10);
    }

    public final void A07(AbstractC05364c abstractC05364c) {
        this.A01++;
    }

    public final void A08(AbstractC05364c abstractC05364c, AbstractC05364c abstractC05364c2, boolean z10) {
        if (abstractC05364c != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (abstractC05364c2 != null) {
            A07(abstractC05364c2);
        }
    }

    public final void A09(AnonymousClass56 anonymousClass56) {
        int A0H = anonymousClass56.A0H();
        ArrayList<AnonymousClass56> arrayList = A01(A0H).A03;
        int i10 = this.A00.get(A0H).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        anonymousClass56.A0Q();
        arrayList.add(anonymousClass56);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
