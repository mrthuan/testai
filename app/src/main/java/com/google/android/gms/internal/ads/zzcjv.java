package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcjv implements zzfcq {
    private final zzcif zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzcjv(zzcif zzcifVar, zzcju zzcjuVar) {
        this.zza = zzcifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* synthetic */ zzfcq zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* synthetic */ zzfcq zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* synthetic */ zzfcq zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final zzfcr zzd() {
        zzhfk.zzc(this.zzb, Context.class);
        zzhfk.zzc(this.zzc, String.class);
        zzhfk.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcjx(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
