package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbr {
    private final zzz zza = new zzz();

    public final zzbr zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzbr zzb(zzbt zzbtVar) {
        zzab zzabVar;
        zzabVar = zzbtVar.zza;
        for (int i10 = 0; i10 < zzabVar.zzb(); i10++) {
            this.zza.zza(zzabVar.zza(i10));
        }
        return this;
    }

    public final zzbr zzc(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.zza.zza(iArr[i10]);
        }
        return this;
    }

    public final zzbr zzd(int i10, boolean z10) {
        if (z10) {
            this.zza.zza(i10);
        }
        return this;
    }

    public final zzbt zze() {
        return new zzbt(this.zza.zzb(), null);
    }
}
