package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ih  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0872Ih {
    public final Handler A00;
    public final InterfaceC0873Ii A01;

    public C0872Ih(Handler handler, InterfaceC0873Ii interfaceC0873Ii) {
        this.A00 = interfaceC0873Ii != null ? (Handler) AbstractC0844Hf.A01(handler) : null;
        this.A01 = interfaceC0873Ii;
    }

    public final void A01(int i10, int i11, int i12, float f10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0869Ie(this, i10, i11, i12, f10));
        }
    }

    public final void A02(int i10, long j10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0868Id(this, i10, j10));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0870If(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0867Ic(this, format));
        }
    }

    public final void A05(BH bh2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0871Ig(this, bh2));
        }
    }

    public final void A06(BH bh2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0865Ia(this, bh2));
        }
    }

    public final void A07(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0866Ib(this, str, j10, j11));
        }
    }
}
