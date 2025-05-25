package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.AbstractC1291Yv;
import com.facebook.ads.redexgen.X.C1292Yw;
import java.lang.Exception;
import java.util.ArrayDeque;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* renamed from: com.facebook.ads.redexgen.X.Yu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1290Yu<I extends C1292Yw, O extends AbstractC1291Yv, E extends Exception> implements BG<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i10, O o10, boolean z10);

    public abstract E A0X(Throwable th2);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0020 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1290Yu(I[] r4, O[] r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.A07 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.A09 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.A0A = r0
            r3.A0B = r4
            int r0 = r4.length
            r3.A00 = r0
            r2 = 0
        L1e:
            int r0 = r3.A00
            if (r2 >= r0) goto L2d
            I extends com.facebook.ads.redexgen.X.Yw[] r1 = r3.A0B
            com.facebook.ads.redexgen.X.Yw r0 = r3.A0T()
            r1[r2] = r0
            int r2 = r2 + 1
            goto L1e
        L2d:
            r3.A0C = r5
            int r0 = r5.length
            r3.A01 = r0
            r2 = 0
        L33:
            int r0 = r3.A01
            if (r2 >= r0) goto L42
            O extends com.facebook.ads.redexgen.X.Yv[] r1 = r3.A0C
            com.facebook.ads.redexgen.X.Yv r0 = r3.A0V()
            r1[r2] = r0
            int r2 = r2 + 1
            goto L33
        L42:
            com.facebook.ads.redexgen.X.BJ r0 = new com.facebook.ads.redexgen.X.BJ
            r0.<init>(r3)
            r3.A08 = r0
            java.lang.Thread r0 = r3.A08
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1290Yu.<init>(com.facebook.ads.redexgen.X.Yw[], com.facebook.ads.redexgen.X.Yv[]):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0L() throws Exception {
        if (this.A04 == null) {
            return;
        }
        throw this.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    public void A0M() {
        while (A0R()) {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0N(I inputBuffer) {
        inputBuffer.A07();
        I[] iArr = this.A0B;
        int i10 = this.A00;
        this.A00 = i10 + 1;
        iArr[i10] = inputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0O(O outputBuffer) {
        outputBuffer.A07();
        O[] oArr = this.A0C;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        oArr[i10] = outputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private boolean A0Q() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private boolean A0R() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I removeFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            O o10 = oArr[i10];
            boolean resetDecoder = this.A05;
            this.A05 = false;
            if (removeFirst.A04()) {
                o10.A00(4);
            } else {
                if (removeFirst.A03()) {
                    o10.A00(SlideAtom.USES_MASTER_SLIDE_ID);
                }
                try {
                    this.A04 = A0W(removeFirst, o10, resetDecoder);
                } catch (OutOfMemoryError e10) {
                    this.A04 = A0X(e10);
                } catch (RuntimeException e11) {
                    this.A04 = A0X(e11);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    A0O(o10);
                } else if (o10.A03()) {
                    this.A02++;
                    A0O(o10);
                } else {
                    o10.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o10);
                }
                A0N(removeFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BG
    /* renamed from: A0S */
    public final I A5Q() throws Exception {
        I i10;
        I i11;
        synchronized (this.A07) {
            A0L();
            AbstractC0844Hf.A04(this.A03 == null);
            if (this.A00 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.A0B;
                int i12 = this.A00 - 1;
                this.A00 = i12;
                i10 = iArr[i12];
            }
            this.A03 = i10;
            i11 = this.A03;
        }
        return i11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BG
    /* renamed from: A0U */
    public final O A5R() throws Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    public final void A0Y(int i10) {
        AbstractC0844Hf.A04(this.A00 == this.A0B.length);
        for (I i11 : this.A0B) {
            i11.A09(i10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BG
    /* renamed from: A0Z */
    public final void AEj(I inputBuffer) throws Exception {
        synchronized (this.A07) {
            A0L();
            AbstractC0844Hf.A03(inputBuffer == this.A03);
            this.A09.addLast(inputBuffer);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    public void A0a(O outputBuffer) {
        synchronized (this.A07) {
            A0O(outputBuffer);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BG
    public final void AEy() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BG
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A03 != null) {
                A0N(this.A03);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
