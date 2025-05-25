package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KV extends FrameLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<KO> A01 = new AtomicReference<>();

    public static void A00(boolean z10, KO ko2) {
        A00.set(z10);
        A01.set(ko2);
    }
}
