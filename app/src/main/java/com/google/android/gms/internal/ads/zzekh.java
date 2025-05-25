package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzekh extends zzbor {
    private final zzcwo zza;
    private final zzdeo zzb;
    private final zzcxi zzc;
    private final zzcxx zzd;
    private final zzcyc zze;
    private final zzdbn zzf;
    private final zzcyw zzg;
    private final zzdfl zzh;
    private final zzdbj zzi;
    private final zzcxd zzj;

    public zzekh(zzcwo zzcwoVar, zzdeo zzdeoVar, zzcxi zzcxiVar, zzcxx zzcxxVar, zzcyc zzcycVar, zzdbn zzdbnVar, zzcyw zzcywVar, zzdfl zzdflVar, zzdbj zzdbjVar, zzcxd zzcxdVar) {
        this.zza = zzcwoVar;
        this.zzb = zzdeoVar;
        this.zzc = zzcxiVar;
        this.zzd = zzcxxVar;
        this.zze = zzcycVar;
        this.zzf = zzdbnVar;
        this.zzg = zzcywVar;
        this.zzh = zzdflVar;
        this.zzi = zzdbjVar;
        this.zzj = zzcxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdG();
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzf() {
        this.zzg.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    @Deprecated
    public final void zzj(int i10) {
        zzk(new com.google.android.gms.ads.internal.client.zze(i10, "", "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfgi.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, "undefined", null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzp() {
        this.zzg.zzdr();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzx() {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }

    public void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzg(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    public void zzs(zzbvz zzbvzVar) {
    }

    public void zzt(zzbwd zzbwdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzi(int i10, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzr(zzbfx zzbfxVar, String str) {
    }
}
