package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.PriorityQueue;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: assets/audience_network.dex */
public final class I8 {
    public final Object A01 = new Object();
    public final PriorityQueue<Integer> A02 = new PriorityQueue<>(10, Collections.reverseOrder());
    public int A00 = SlideAtom.USES_MASTER_SLIDE_ID;

    public final void A00(int i10) {
        synchronized (this.A01) {
            this.A02.add(Integer.valueOf(i10));
            this.A00 = Math.max(this.A00, i10);
        }
    }

    public final void A01(int i10) throws InterruptedException {
        synchronized (this.A01) {
            while (this.A00 != i10) {
                this.A01.wait();
            }
        }
    }

    public final void A02(int i10) throws I7 {
        synchronized (this.A01) {
            if (this.A00 != i10) {
                throw new I7(i10, this.A00);
            }
        }
    }

    public final void A03(int i10) {
        synchronized (this.A01) {
            this.A02.remove(Integer.valueOf(i10));
            this.A00 = this.A02.isEmpty() ? SlideAtom.USES_MASTER_SLIDE_ID : this.A02.peek().intValue();
            this.A01.notifyAll();
        }
    }
}
