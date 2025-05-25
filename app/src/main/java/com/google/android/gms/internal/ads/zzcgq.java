package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcgq implements zzhfc {
    private final zzcgm zza;

    public zzcgq(zzcgm zzcgmVar) {
        this.zza = zzcgmVar;
    }

    public final WeakReference zza() {
        WeakReference zzg = this.zza.zzg();
        zzhfk.zzb(zzg);
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        WeakReference zzg = this.zza.zzg();
        zzhfk.zzb(zzg);
        return zzg;
    }
}
