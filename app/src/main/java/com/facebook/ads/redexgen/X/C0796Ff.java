package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.inmobi.commons.core.configs.TelemetryConfig;

/* renamed from: com.facebook.ads.redexgen.X.Ff  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0796Ff extends AbstractC1202Vg<C1431bo> {
    public C0796Ff(C1431bo c1431bo) {
        super(c1431bo);
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1314Zs c1314Zs;
        Handler handler;
        Runnable runnable;
        C1431bo A07 = A07();
        if (A07 == null) {
            return;
        }
        c1314Zs = A07.A08;
        if (MK.A02(c1314Zs)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
    }
}
