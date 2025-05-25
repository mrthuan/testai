package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzlk {
    private final zzif zza;

    @Deprecated
    public zzlk(Context context, zzcdt zzcdtVar) {
        this.zza = new zzif(context, zzcdtVar);
    }

    @Deprecated
    public final zzlk zza(final zzkb zzkbVar) {
        zzif zzifVar = this.zza;
        zzdi.zzf(!zzifVar.zzr);
        zzkbVar.getClass();
        zzifVar.zzf = new zzfvk() { // from class: com.google.android.gms.internal.ads.zzhx
            @Override // com.google.android.gms.internal.ads.zzfvk
            public final Object zza() {
                return zzkb.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlk zzb(final zzyb zzybVar) {
        zzif zzifVar = this.zza;
        zzdi.zzf(!zzifVar.zzr);
        zzybVar.getClass();
        zzifVar.zze = new zzfvk() { // from class: com.google.android.gms.internal.ads.zzie
            @Override // com.google.android.gms.internal.ads.zzfvk
            public final Object zza() {
                return zzyb.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzll zzc() {
        zzif zzifVar = this.zza;
        zzdi.zzf(!zzifVar.zzr);
        zzifVar.zzr = true;
        return new zzll(zzifVar);
    }
}
