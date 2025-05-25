package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbc;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbi implements zzfcc {
    private final zzfcc zza;
    private final zzfcc zzb;
    private final zzfhq zzc;
    private final String zzd;
    private zzcvx zze;
    private final Executor zzf;

    public zzfbi(zzfcc zzfccVar, zzfcc zzfccVar2, zzfhq zzfhqVar, String str, Executor executor) {
        this.zza = zzfccVar;
        this.zzb = zzfccVar2;
        this.zzc = zzfhqVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final y9.a zzg(zzfhd zzfhdVar, zzfcd zzfcdVar) {
        zzcvx zzcvxVar = zzfhdVar.zza;
        this.zze = zzcvxVar;
        if (zzfhdVar.zzc != null) {
            if (zzcvxVar.zzf() != null) {
                zzfhdVar.zzc.zzp().zzl(zzfhdVar.zza.zzf());
            }
            return zzgcj.zzh(zzfhdVar.zzc);
        }
        zzcvxVar.zzb().zzl(zzfhdVar.zzb);
        return ((zzfbs) this.zza).zzb(zzfcdVar, null, zzfhdVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    /* renamed from: zza */
    public final synchronized zzcvx zzd() {
        return this.zze;
    }

    public final /* synthetic */ y9.a zzb(zzfcd zzfcdVar, zzfbh zzfbhVar, zzfcb zzfcbVar, zzcvx zzcvxVar, zzfbn zzfbnVar) {
        if (zzfbnVar != null) {
            zzfbh zzfbhVar2 = new zzfbh(zzfbhVar.zza, zzfbhVar.zzb, zzfbhVar.zzc, zzfbhVar.zzd, zzfbhVar.zze, zzfbhVar.zzf, zzfbnVar.zza);
            if (zzfbnVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfbhVar2);
                return zzg(zzfbnVar.zzc, zzfcdVar);
            }
            y9.a zza = this.zzc.zza(zzfbhVar2);
            if (zza != null) {
                this.zze = null;
                return zzgcj.zzn(zza, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfbe
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        return zzfbi.this.zze((zzfhn) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfbhVar2);
            zzfcdVar = new zzfcd(zzfcdVar.zzb, zzfbnVar.zzb);
        }
        y9.a zzb = ((zzfbs) this.zza).zzb(zzfcdVar, zzfcbVar, zzcvxVar);
        this.zze = zzcvxVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* bridge */ /* synthetic */ y9.a zzc(zzfcd zzfcdVar, zzfcb zzfcbVar, Object obj) {
        return zzf(zzfcdVar, zzfcbVar, null);
    }

    public final /* synthetic */ y9.a zze(zzfhn zzfhnVar) {
        zzfhp zzfhpVar;
        if (zzfhnVar != null && zzfhnVar.zza != null && (zzfhpVar = zzfhnVar.zzb) != null) {
            zzbbc.zzb.zzc zzd = zzbbc.zzb.zzd();
            zzbbc.zzb.zza.C0160zza zza = zzbbc.zzb.zza.zza();
            zza.zzf(zzbbc.zzb.zzd.IN_MEMORY);
            zza.zzh(zzbbc.zzb.zze.zzi());
            zzd.zzd(zza);
            zzfhnVar.zza.zza.zzb().zzc().zzm(zzd.zzbr());
            return zzg(zzfhnVar.zza, ((zzfbh) zzfhpVar).zzb);
        }
        throw new zzdwl(1, "Empty prefetch");
    }

    public final synchronized y9.a zzf(final zzfcd zzfcdVar, final zzfcb zzfcbVar, zzcvx zzcvxVar) {
        zzcvw zza = zzfcbVar.zza(zzfcdVar.zzb);
        zza.zza(new zzfbj(this.zzd));
        final zzcvx zzcvxVar2 = (zzcvx) zza.zzh();
        zzcvxVar2.zzg();
        zzcvxVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcvxVar2.zzg().zzd;
        if (zzlVar.f10217s == null && zzlVar.f10222x == null) {
            zzffg zzg = zzcvxVar2.zzg();
            final zzfbh zzfbhVar = new zzfbh(zzfcbVar, zzfcdVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzgcj.zzn(zzgca.zzu(((zzfbo) this.zzb).zzb(zzfcdVar, zzfcbVar, zzcvxVar2)), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfbf
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return zzfbi.this.zzb(zzfcdVar, zzfbhVar, zzfcbVar, zzcvxVar2, (zzfbn) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcvxVar2;
        return ((zzfbs) this.zza).zzb(zzfcdVar, zzfcbVar, zzcvxVar2);
    }
}
