package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcix implements zzfaz {
    private final zzcif zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzcix(zzcif zzcifVar, zzciw zzciwVar) {
        this.zza = zzcifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* synthetic */ zzfaz zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* synthetic */ zzfaz zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* synthetic */ zzfaz zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final zzfba zzd() {
        zzhfk.zzc(this.zzb, Context.class);
        zzhfk.zzc(this.zzc, String.class);
        zzhfk.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzciz(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
