package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbq {
    public static void zza(AtomicReference atomicReference, zzfbp zzfbpVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfbpVar.zza(obj);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        } catch (NullPointerException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }
}
