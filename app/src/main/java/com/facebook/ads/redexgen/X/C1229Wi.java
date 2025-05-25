package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Wi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1229Wi implements InterfaceC0847Hi {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0847Hi
    public final C1228Wh A4y(Looper looper, Handler.Callback callback) {
        return new C1228Wh(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0847Hi
    public final long A5p() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0847Hi
    public final long AHK() {
        return SystemClock.uptimeMillis();
    }
}
