package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbd implements zzfcc {
    private zzcvx zza;
    private final Executor zzb = zzgda.zzb();

    public final zzcvx zza() {
        return this.zza;
    }

    public final y9.a zzb(zzfcd zzfcdVar, zzfcb zzfcbVar, zzcvx zzcvxVar) {
        zzcvw zza = zzfcbVar.zza(zzfcdVar.zzb);
        zza.zzb(new zzfcg(true));
        zzcvx zzcvxVar2 = (zzcvx) zza.zzh();
        this.zza = zzcvxVar2;
        final zzctc zzb = zzcvxVar2.zzb();
        final zzfhd zzfhdVar = new zzfhd();
        return zzgcj.zzm(zzgcj.zzn(zzgca.zzu(zzb.zzj()), new zzgbq(this) { // from class: com.google.android.gms.internal.ads.zzfbb
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                zzfex zzfexVar = (zzfex) obj;
                zzfhdVar.zzb = zzfexVar;
                Iterator it = zzfexVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((zzfel) it.next()).zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzb.zzi(zzgcj.zzh(zzfexVar));
                    }
                }
                return zzgcj.zzh(null);
            }
        }, this.zzb), new zzful() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzfhd zzfhdVar2 = zzfhd.this;
                zzfhdVar2.zzc = (zzcru) obj;
                return zzfhdVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* bridge */ /* synthetic */ y9.a zzc(zzfcd zzfcdVar, zzfcb zzfcbVar, Object obj) {
        return zzb(zzfcdVar, zzfcbVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
