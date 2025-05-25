package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgzn implements zzhae {
    private final zzgzj zza;
    private final zzhas zzb;
    private final boolean zzc;
    private final zzgxj zzd;

    private zzgzn(zzhas zzhasVar, zzgxj zzgxjVar, zzgzj zzgzjVar) {
        this.zzb = zzhasVar;
        this.zzc = zzgzjVar instanceof zzgxu;
        this.zzd = zzgxjVar;
        this.zza = zzgzjVar;
    }

    public static zzgzn zzc(zzhas zzhasVar, zzgxj zzgxjVar, zzgzj zzgzjVar) {
        return new zzgzn(zzhasVar, zzgxjVar, zzgzjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final int zza(Object obj) {
        int zzb = ((zzgxy) obj).zzt.zzb();
        if (this.zzc) {
            return zzb + ((zzgxu) obj).zza.zzd();
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final int zzb(Object obj) {
        int hashCode = ((zzgxy) obj).zzt.hashCode();
        if (this.zzc) {
            return (hashCode * 53) + ((zzgxu) obj).zza.zza.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final Object zze() {
        zzgzj zzgzjVar = this.zza;
        if (zzgzjVar instanceof zzgxy) {
            return ((zzgxy) zzgzjVar).zzbj();
        }
        return zzgzjVar.zzcZ().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzg(Object obj, Object obj2) {
        zzhag.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhag.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzh(Object obj, zzgzw zzgzwVar, zzgxi zzgxiVar) {
        this.zzb.zza(obj);
        zzgxu zzgxuVar = (zzgxu) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgwa zzgwaVar) {
        zzgxy zzgxyVar = (zzgxy) obj;
        if (zzgxyVar.zzt == zzhat.zzc()) {
            zzgxyVar.zzt = zzhat.zzf();
        }
        zzgxu zzgxuVar = (zzgxu) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzj(Object obj, zzhbh zzhbhVar) {
        Iterator zzf = ((zzgxu) obj).zza.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgxm zzgxmVar = (zzgxm) entry.getKey();
            if (zzgxmVar.zzc() == zzhbg.MESSAGE && !zzgxmVar.zze() && !zzgxmVar.zzd()) {
                if (entry instanceof zzgyr) {
                    zzhbhVar.zzw(zzgxmVar.zza(), ((zzgyr) entry).zza().zzb());
                } else {
                    zzhbhVar.zzw(zzgxmVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        ((zzgxy) obj).zzt.zzk(zzhbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzgxy) obj).zzt.equals(((zzgxy) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgxu) obj).zza.equals(((zzgxu) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzl(Object obj) {
        return ((zzgxu) obj).zza.zzi();
    }
}
