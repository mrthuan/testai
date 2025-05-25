package com.google.android.gms.measurement.internal;

import a8.c2;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfa extends c2 {
    public final boolean q() {
        n();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((zzge) this.f3529a).f11773a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // a8.c2
    public final void p() {
    }
}
