package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class IF {
    public static final Comparator<IE> A07 = new IC();
    public static final Comparator<IE> A08 = new ID();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final IE[] A06 = new IE[5];
    public final ArrayList<IE> A05 = new ArrayList<>();
    public int A00 = -1;

    public IF(int i10) {
        this.A04 = i10;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A07);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A08);
            this.A00 = 0;
        }
    }

    public final float A02(float f10) {
        A01();
        float f11 = this.A03 * f10;
        int i10 = 0;
        for (int i11 = 0; i11 < this.A05.size(); i11++) {
            IE ie2 = this.A05.get(i11);
            i10 += ie2.A02;
            float desiredWeight = i10;
            if (desiredWeight >= f11) {
                float desiredWeight2 = ie2.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i10, float f10) {
        IE oldestSample;
        A00();
        if (this.A02 > 0) {
            IE[] ieArr = this.A06;
            int i11 = this.A02 - 1;
            this.A02 = i11;
            oldestSample = ieArr[i11];
        } else {
            oldestSample = new IE(null);
        }
        int i12 = this.A01;
        this.A01 = i12 + 1;
        oldestSample.A01 = i12;
        oldestSample.A02 = i10;
        oldestSample.A00 = f10;
        this.A05.add(oldestSample);
        this.A03 += i10;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            IE ie2 = this.A05.get(0);
            if (ie2.A02 <= excessWeight) {
                this.A03 -= ie2.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    IE[] ieArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    ieArr2[excessWeight2] = ie2;
                }
            } else {
                ie2.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
