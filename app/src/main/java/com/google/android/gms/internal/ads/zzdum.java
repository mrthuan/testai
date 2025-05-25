package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdum extends zzbky {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfju zzd;
    final /* synthetic */ zzbzt zze;
    final /* synthetic */ zzdun zzf;

    public zzdum(zzdun zzdunVar, Object obj, String str, long j10, zzfju zzfjuVar, zzbzt zzbztVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzfjuVar;
        this.zze = zzbztVar;
        this.zzf = zzdunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zze(String str) {
        zzdsu zzdsuVar;
        zzddp zzddpVar;
        zzfki zzfkiVar;
        synchronized (this.zza) {
            zzdun zzdunVar = this.zzf;
            String str2 = this.zzb;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzdunVar.zzv(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzdsuVar = this.zzf.zzl;
            zzdsuVar.zzb(this.zzb, "error");
            zzddpVar = this.zzf.zzo;
            zzddpVar.zzb(this.zzb, "error");
            zzfkiVar = this.zzf.zzp;
            zzfju zzfjuVar = this.zzd;
            zzfjuVar.zzc(str);
            zzfjuVar.zzg(false);
            zzfkiVar.zzb(zzfjuVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zzf() {
        zzdsu zzdsuVar;
        zzddp zzddpVar;
        zzfki zzfkiVar;
        synchronized (this.zza) {
            zzdun zzdunVar = this.zzf;
            String str = this.zzb;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzdunVar.zzv(str, true, "", (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzdsuVar = this.zzf.zzl;
            zzdsuVar.zzd(this.zzb);
            zzddpVar = this.zzf.zzo;
            zzddpVar.zzd(this.zzb);
            zzfkiVar = this.zzf.zzp;
            zzfju zzfjuVar = this.zzd;
            zzfjuVar.zzg(true);
            zzfkiVar.zzb(zzfjuVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
