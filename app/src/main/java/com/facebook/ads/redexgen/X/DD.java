package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: assets/audience_network.dex */
public abstract class DD implements XQ {
    public static String[] A06 = {"z2muy9QJdv6UNqkrRX5Tg36TVvjaRGqW", "YxwD1MugG7ZhXNTXvxibfreR7ej", "rT3nprJIB6deoGRocSgDtQnW", "BfDIjN", "UzZd8wX", "7tX", "IQas6CvLP2cXmM1lvwO9WgYKNIICj7B2", "QvQ"};
    public long A00;
    public long A01;
    public C05504q A02;
    public final ArrayDeque<C05504q> A03 = new ArrayDeque<>();
    public final ArrayDeque<DM> A04;
    public final PriorityQueue<C05504q> A05;

    public abstract XN A0N();

    public abstract void A0P(DO r12);

    public abstract boolean A0R();

    public DD() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C05504q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.A04.add(new C05474n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C05504q c05504q) {
        c05504q.A07();
        this.A03.add(c05504q);
    }

    @Override // com.facebook.ads.redexgen.X.BG
    /* renamed from: A0L */
    public DO A5Q() throws C0809Fu {
        AbstractC0844Hf.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BG
    /* renamed from: A0M */
    public DM A5R() throws C0809Fu {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1292Yw) this.A05.peek()).A00 <= this.A00) {
            C05504q poll = this.A05.poll();
            if (poll.A04()) {
                DM outputBuffer = this.A04.pollFirst();
                outputBuffer.A00(4);
                A0K(poll);
                return outputBuffer;
            }
            A0P(poll);
            if (A0R()) {
                XN A0N = A0N();
                if (!poll.A03()) {
                    DM pollFirst = this.A04.pollFirst();
                    pollFirst.A09(((C1292Yw) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.BG
    /* renamed from: A0O */
    public void AEj(DO r62) throws C0809Fu {
        AbstractC0844Hf.A03(r62 == this.A02);
        if (r62.A03()) {
            A0K(this.A02);
        } else {
            C05504q c05504q = this.A02;
            long j10 = this.A01;
            this.A01 = 1 + j10;
            c05504q.A00 = j10;
            if (A06[6].charAt(25) == 'n') {
                throw new RuntimeException();
            }
            A06[0] = "AtrTuyLMED6qzWt7DVqAVoSQD1pO5Y9g";
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(DM dm2) {
        dm2.A07();
        this.A04.add(dm2);
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public void AEy() {
    }

    @Override // com.facebook.ads.redexgen.X.XQ
    public void AGb(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        if (this.A02 != null) {
            A0K(this.A02);
            this.A02 = null;
        }
    }
}
