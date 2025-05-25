package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1083Qr extends ContentObserver {
    public final C1132So A00;

    public C1083Qr(Handler handler, C1132So c1132So) {
        super(handler);
        this.A00 = c1132So;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0e();
    }
}
