package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class AO {
    public static String[] A06 = {"pSGbucuoMvma1b5VVDAxEZMYXBJBkJd7", "jnfD7zJLfl7YfEaLudX29nBu0s4EE7wy", "kblP6w5tAUndOGYtYbLdLGUEXv4b54", "VT18E82QCK2DEIowipbGw7Y7OUzTjYnd", "AYuYTw0tW8ONeycLuKpYQRyZiiLmzDTW", "M9C1QOaf2rsBVjgJKmiK14Vpxz77Nv8B", "sFFKCjvZ8i7qkazJexEMRuLcVG", "s9HSZGEi8dFN8vFbKvf1UaL44HFpBCz2"};
    public AP A01;
    public AP A02;
    public boolean A03;
    public final ArrayList<AP> A05 = new ArrayList<>();
    public final AK A04 = new AK();
    public AM A00 = AM.A01;

    private AP A00(AP ap2, AM am2) {
        if (am2.A0E() || this.A00.A0E()) {
            return ap2;
        }
        AM am3 = this.A00;
        Et et = ap2.A01;
        if (A06[0].charAt(13) != 'D') {
            A06[0] = "n7aIj5hp7lyBwHeNy22XvNfOlXYQiwaL";
            Object uid = am3.A0A(et.A02, this.A04, true).A03;
            int newPeriodIndex = am2.A04(uid);
            if (newPeriodIndex == -1) {
                return ap2;
            }
            int newWindowIndex = am2.A09(newPeriodIndex, this.A04).A00;
            return new AP(newWindowIndex, ap2.A01.A00(newPeriodIndex));
        }
        throw new RuntimeException();
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    public final AP A03() {
        return this.A01;
    }

    public final AP A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        return this.A05.get(this.A05.size() - 1);
    }

    public final AP A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    public final AP A06() {
        return this.A02;
    }

    public final Et A07(int i10) {
        Et et = null;
        if (this.A00 != null) {
            int A00 = this.A00.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                AP mediaPeriod = this.A05.get(periodIndex);
                Et match = mediaPeriod.A01;
                int i11 = match.A02;
                if (i11 < A00 && this.A00.A09(i11, this.A04).A00 == i10) {
                    if (et != null) {
                        return null;
                    }
                    et = mediaPeriod.A01;
                }
            }
        }
        return et;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i10) {
        A02();
    }

    public final void A0B(int i10, Et et) {
        this.A05.add(new AP(i10, et));
        if (this.A05.size() == 1 && !this.A00.A0E()) {
            A02();
        }
    }

    public final void A0C(int i10, Et et) {
        AP mediaPeriod;
        AP ap2 = new AP(i10, et);
        this.A05.remove(ap2);
        AP mediaPeriod2 = this.A02;
        if (ap2.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                AP mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i10, Et et) {
        this.A02 = new AP(i10, et);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(com.facebook.ads.redexgen.X.AM r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.AP> r0 = r3.A05
            int r0 = r0.size()
            if (r2 >= r0) goto L1d
            java.util.ArrayList<com.facebook.ads.redexgen.X.AP> r1 = r3.A05
            java.util.ArrayList<com.facebook.ads.redexgen.X.AP> r0 = r3.A05
            java.lang.Object r0 = r0.get(r2)
            com.facebook.ads.redexgen.X.AP r0 = (com.facebook.ads.redexgen.X.AP) r0
            com.facebook.ads.redexgen.X.AP r0 = r3.A00(r0, r4)
            r1.set(r2, r0)
            int r2 = r2 + 1
            goto L1
        L1d:
            com.facebook.ads.redexgen.X.AP r0 = r3.A02
            if (r0 == 0) goto L29
            com.facebook.ads.redexgen.X.AP r0 = r3.A02
            com.facebook.ads.redexgen.X.AP r0 = r3.A00(r0, r4)
            r3.A02 = r0
        L29:
            r3.A00 = r4
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AO.A0E(com.facebook.ads.redexgen.X.AM):void");
    }

    public final boolean A0F() {
        return this.A03;
    }
}
