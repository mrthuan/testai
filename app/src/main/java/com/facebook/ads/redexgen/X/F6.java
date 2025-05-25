package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class F6 {
    public final int A00;
    public final Et A01;
    public final long A02;
    public final CopyOnWriteArrayList<F5> A03;

    public F6() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public F6(CopyOnWriteArrayList<F5> copyOnWriteArrayList, int i10, Et et, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = et;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long A01 = AbstractC06529b.A01(j10);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final F6 A02(int i10, Et et, long j10) {
        return new F6(this.A03, i10, et, j10);
    }

    public final void A03() {
        AbstractC0844Hf.A04(this.A01 != null);
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new Ew(this, listener));
        }
    }

    public final void A04() {
        AbstractC0844Hf.A04(this.A01 != null);
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new RunnableC0788Ex(this, listener));
        }
    }

    public final void A05() {
        AbstractC0844Hf.A04(this.A01 != null);
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new F2(this, listener));
        }
    }

    public final void A06(int i10, Format format, int i11, Object obj, long j10) {
        A0C(new F8(1, i10, format, i11, obj, A00(j10), -9223372036854775807L));
    }

    public final void A07(Handler handler, F9 f92) {
        AbstractC0844Hf.A03((handler == null || f92 == null) ? false : true);
        this.A03.add(new F5(handler, f92));
    }

    public final void A08(F7 f72, F8 f82) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new F0(this, listener, f72, f82));
        }
    }

    public final void A09(F7 f72, F8 f82) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new RunnableC0790Ez(this, listener, f72, f82));
        }
    }

    public final void A0A(F7 f72, F8 f82) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new RunnableC0789Ey(this, listener, f72, f82));
        }
    }

    public final void A0B(F7 f72, F8 f82, IOException iOException, boolean z10) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            A01(next.A00, new F1(this, next.A01, f72, f82, iOException, z10));
        }
    }

    public final void A0C(F8 f82) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new F4(this, listener, f82));
        }
    }

    public final void A0D(F9 f92) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == f92) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(H3 h32, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12) {
        A0A(new F7(h32, j12, 0L, 0L), new F8(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0F(H3 h32, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A08(new F7(h32, j12, j13, j14), new F8(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0G(H3 h32, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A09(new F7(h32, j12, j13, j14), new F8(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0H(H3 h32, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        A0B(new F7(h32, j12, j13, j14), new F8(i10, i11, format, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }
}
