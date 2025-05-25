package com.facebook.ads.redexgen.X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: assets/audience_network.dex */
public final class IB extends BufferedOutputStream {
    public boolean A00;

    public IB(OutputStream outputStream) {
        super(outputStream);
    }

    public IB(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public final void A00(OutputStream outputStream) {
        AbstractC0844Hf.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00 = true;
        Throwable e10 = null;
        try {
            flush();
        } catch (Throwable th2) {
            e10 = th2;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e10 == null) {
                e10 = thrown;
            }
        }
        if (e10 != null) {
            IK.A0Y(e10);
            throw null;
        }
    }
}
