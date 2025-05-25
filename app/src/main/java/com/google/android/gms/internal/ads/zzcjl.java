package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcjl implements zzdtt {
    private final zzcif zza;
    private Context zzb;
    private zzbjw zzc;

    public /* synthetic */ zzcjl(zzcif zzcifVar, zzcjk zzcjkVar) {
        this.zza = zzcifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtt
    public final /* synthetic */ zzdtt zza(zzbjw zzbjwVar) {
        zzbjwVar.getClass();
        this.zzc = zzbjwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtt
    public final /* synthetic */ zzdtt zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtt
    public final zzdtu zzc() {
        zzhfk.zzc(this.zzb, Context.class);
        zzhfk.zzc(this.zzc, zzbjw.class);
        return new zzcjn(this.zza, this.zzb, this.zzc, null);
    }
}
