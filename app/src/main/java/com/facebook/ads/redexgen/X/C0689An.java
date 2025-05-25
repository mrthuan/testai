package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.An  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0689An {
    public final Handler A00;
    public final InterfaceC0690Ao A01;

    public C0689An(Handler handler, InterfaceC0690Ao interfaceC0690Ao) {
        this.A00 = interfaceC0690Ao != null ? (Handler) AbstractC0844Hf.A01(handler) : null;
        this.A01 = interfaceC0690Ao;
    }

    public final void A01(int i10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0688Am(this, i10));
        }
    }

    public final void A02(int i10, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0686Ak(this, i10, j10, j11));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0685Aj(this, format));
        }
    }

    public final void A04(BH bh2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0687Al(this, bh2));
        }
    }

    public final void A05(BH bh2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0683Ah(this, bh2));
        }
    }

    public final void A06(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0684Ai(this, str, j10, j11));
        }
    }
}
