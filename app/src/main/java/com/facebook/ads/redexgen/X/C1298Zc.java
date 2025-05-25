package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1298Zc implements KO {
    @Override // com.facebook.ads.redexgen.X.KO
    public final void AFg(Throwable th2, Object obj) {
        if (obj instanceof InterfaceC06097e) {
            C1314Zs adContext = ((InterfaceC06097e) obj).A6G();
            if (adContext != null) {
                adContext.A0P(th2);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C1314Zs)) {
                return;
            }
            ((C1314Zs) context).A0P(th2);
        }
    }
}
