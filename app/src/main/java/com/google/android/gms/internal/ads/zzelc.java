package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzelc {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdqb zzb;

    public zzelc(zzdqb zzdqbVar) {
        this.zzb = zzdqbVar;
    }

    public final zzbql zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbql) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }
}
