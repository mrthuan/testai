package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Wh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1228Wh implements InterfaceC0857Hs {
    public final Handler A00;

    public C1228Wh(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0857Hs
    public final Looper A7j() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0857Hs
    public final Message AAz(int i10, int i11, int i12) {
        return this.A00.obtainMessage(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0857Hs
    public final Message AB0(int i10, int i11, int i12, Object obj) {
        return this.A00.obtainMessage(i10, i11, i12, obj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0857Hs
    public final Message AB1(int i10, Object obj) {
        return this.A00.obtainMessage(i10, obj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0857Hs
    public final void AFb(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0857Hs
    public final boolean AGD(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0857Hs
    public final boolean AGE(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }
}
