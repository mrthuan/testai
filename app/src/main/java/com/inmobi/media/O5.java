package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
public final class O5 implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        kotlin.jvm.internal.g.d(P5.f14573e, "access$getTAG$p(...)");
        P5.f14574f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        P5.f14574f = false;
        kotlin.jvm.internal.g.d(P5.f14573e, "access$getTAG$p(...)");
    }
}
