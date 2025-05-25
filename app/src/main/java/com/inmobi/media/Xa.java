package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes2.dex */
public final class Xa extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        kotlin.jvm.internal.g.e(network, "network");
        super.onAvailable(network);
        Ha.f().b(new H1(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.g.e(network, "network");
        super.onLost(network);
        Ha.f().b(new H1(10, 4, "lost"));
    }
}
