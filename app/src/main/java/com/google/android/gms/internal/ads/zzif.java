package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzif {
    final Context zza;
    zzdj zzb;
    zzfvk zzc;
    zzfvk zzd;
    zzfvk zze;
    zzfvk zzf;
    zzfvk zzg;
    zzful zzh;
    Looper zzi;
    int zzj;
    zzh zzk;
    int zzl;
    boolean zzm;
    zzlj zzn;
    long zzo;
    long zzp;
    boolean zzq;
    boolean zzr;
    String zzs;
    zzhq zzt;

    public zzif(final Context context, zzcdt zzcdtVar) {
        zzhy zzhyVar = new zzhy(zzcdtVar);
        zzhz zzhzVar = new zzhz(context);
        zzfvk zzfvkVar = new zzfvk() { // from class: com.google.android.gms.internal.ads.zzia
            @Override // com.google.android.gms.internal.ads.zzfvk
            public final Object zza() {
                return new zzxt(context);
            }
        };
        zzfvk zzfvkVar2 = new zzfvk() { // from class: com.google.android.gms.internal.ads.zzib
            @Override // com.google.android.gms.internal.ads.zzfvk
            public final Object zza() {
                return new zzht();
            }
        };
        zzic zzicVar = new zzic(context);
        zzful zzfulVar = new zzful() { // from class: com.google.android.gms.internal.ads.zzid
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return new zznq((zzdj) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzhyVar;
        this.zzd = zzhzVar;
        this.zze = zzfvkVar;
        this.zzf = zzfvkVar2;
        this.zzg = zzicVar;
        this.zzh = zzfulVar;
        this.zzi = zzet.zzy();
        this.zzk = zzh.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzlj.zzb;
        this.zzt = new zzhq(0.97f, 1.03f, 1000L, 1.0E-7f, zzet.zzr(20L), zzet.zzr(500L), 0.999f, null);
        this.zzb = zzdj.zza;
        this.zzo = 500L;
        this.zzp = 2000L;
        this.zzq = true;
        this.zzs = "";
        this.zzj = -1000;
    }

    public static /* synthetic */ zzuh zza(Context context) {
        return new zztv(context, new zzacd());
    }
}
