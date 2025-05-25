package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzepo implements zzevo {
    private final zzgcu zza;
    private final VersionInfoParcel zzb;

    public zzepo(VersionInfoParcel versionInfoParcel, zzgcu zzgcuVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepo.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepp zzc() {
        return zzepp.zzb(this.zzb);
    }
}
