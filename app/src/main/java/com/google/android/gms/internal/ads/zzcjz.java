package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcjz implements zzfee {
    private final zzcif zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjz(zzcif zzcifVar, zzcjy zzcjyVar) {
        this.zza = zzcifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final /* synthetic */ zzfee zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final /* synthetic */ zzfee zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final zzfef zzc() {
        zzhfk.zzc(this.zzb, Context.class);
        return new zzckb(this.zza, this.zzb, this.zzc, null);
    }
}
