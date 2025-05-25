package com.facebook.ads.redexgen.X;

import android.hardware.display.DisplayManager;

/* loaded from: assets/audience_network.dex */
public final class IW implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ IY A01;

    public IW(IY iy, DisplayManager displayManager) {
        this.A01 = iy;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
