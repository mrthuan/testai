package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.Ta  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1144Ta implements QC {
    public final /* synthetic */ TZ A00;

    public C1144Ta(TZ tz) {
        this.A00 = tz;
    }

    @Override // com.facebook.ads.redexgen.X.QC
    public final void AFf() {
        MS A05;
        Intent intent;
        MS ms;
        Intent intent2;
        Bundle bundle;
        this.A00.A07();
        TZ tz = this.A00;
        A05 = this.A00.A05();
        tz.A03 = A05;
        intent = this.A00.A01;
        if (intent != null && this.A00.A00 != null) {
            ms = this.A00.A03;
            intent2 = this.A00.A01;
            bundle = this.A00.A02;
            ms.A9q(intent2, bundle, this.A00.A00);
        }
    }
}
