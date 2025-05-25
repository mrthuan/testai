package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadFactory;

/* loaded from: assets/audience_network.dex */
public class IJ implements ThreadFactory {
    public final /* synthetic */ String A00;

    public IJ(String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.A00);
    }
}
