package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcpo implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;
    private final zzhfu zzf;
    private final zzhfu zzg;
    private final zzhfu zzh;
    private final zzhfu zzi;
    private final zzhfu zzj;

    public zzcpo(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7, zzhfu zzhfuVar8, zzhfu zzhfuVar9, zzhfu zzhfuVar10) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar4;
        this.zze = zzhfuVar5;
        this.zzf = zzhfuVar6;
        this.zzg = zzhfuVar7;
        this.zzh = zzhfuVar8;
        this.zzi = zzhfuVar9;
        this.zzj = zzhfuVar10;
    }

    public static zzcpn zzc(zzcrt zzcrtVar, Context context, zzfem zzfemVar, View view, zzcej zzcejVar, zzcrs zzcrsVar, zzdjm zzdjmVar, zzdes zzdesVar, zzhew zzhewVar, Executor executor) {
        return new zzcpn(zzcrtVar, context, zzfemVar, view, zzcejVar, zzcrsVar, zzdjmVar, zzdesVar, zzhewVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzcpn zzb() {
        return new zzcpn(((zzcue) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcpu) this.zzc).zza(), ((zzcpt) this.zzd).zza(), ((zzcqg) this.zze).zza(), ((zzcpv) this.zzf).zza(), ((zzdhj) this.zzg).zza(), (zzdes) this.zzh.zzb(), zzhfb.zza(zzhfn.zza(this.zzi)), (Executor) this.zzj.zzb());
    }
}
