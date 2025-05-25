package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzbbc;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfgv implements zzfgu {
    private final ConcurrentHashMap zza;
    private final zzfhb zzb;
    private final zzfgx zzc = new zzfgx();

    public zzfgv(zzfhb zzfhbVar) {
        this.zza = new ConcurrentHashMap(zzfhbVar.zzd);
        this.zzb = zzfhbVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfhb> creator = zzfhb.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfH)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.zzb.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfhe) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfgt) entry.getValue()).zzb(); i11++) {
                    sb2.append("[O]");
                }
                for (int zzb = ((zzfgt) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfgt) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzm.b(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final zzfhb zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final synchronized zzfhd zzb(zzfhe zzfheVar) {
        zzfhd zzfhdVar;
        zzfgt zzfgtVar = (zzfgt) this.zza.get(zzfheVar);
        if (zzfgtVar != null) {
            zzfhdVar = zzfgtVar.zze();
            if (zzfhdVar == null) {
                this.zzc.zze();
            }
            zzfhr zzf = zzfgtVar.zzf();
            if (zzfhdVar != null) {
                zzbbc.zzb.zzc zzd = zzbbc.zzb.zzd();
                zzbbc.zzb.zza.C0160zza zza = zzbbc.zzb.zza.zza();
                zza.zzf(zzbbc.zzb.zzd.IN_MEMORY);
                zzbbc.zzb.zze.zza zzc = zzbbc.zzb.zze.zzc();
                zzc.zzd(zzf.zza);
                zzc.zze(zzf.zzb);
                zza.zzg(zzc);
                zzd.zzd(zza);
                zzfhdVar.zza.zzb().zzc().zzi(zzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfhdVar = null;
        }
        return zzfhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    @Deprecated
    public final zzfhe zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfhf(zzlVar, str, new zzbve(this.zzb.zza).zza().zzj, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final synchronized boolean zzd(zzfhe zzfheVar, zzfhd zzfhdVar) {
        boolean zzh;
        zzfgt zzfgtVar = (zzfgt) this.zza.get(zzfheVar);
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        zzfhdVar.zzd = System.currentTimeMillis();
        if (zzfgtVar == null) {
            zzfhb zzfhbVar = this.zzb;
            zzfgt zzfgtVar2 = new zzfgt(zzfhbVar.zzd, zzfhbVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i10 = this.zzb.zzg;
                int i11 = i10 - 1;
                zzfhe zzfheVar2 = null;
                if (i10 != 0) {
                    long j10 = Long.MAX_VALUE;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                                for (Map.Entry entry : this.zza.entrySet()) {
                                    if (((zzfgt) entry.getValue()).zza() < i12) {
                                        i12 = ((zzfgt) entry.getValue()).zza();
                                        zzfheVar2 = (zzfhe) entry.getKey();
                                    }
                                }
                                if (zzfheVar2 != null) {
                                    this.zza.remove(zzfheVar2);
                                }
                            }
                        } else {
                            for (Map.Entry entry2 : this.zza.entrySet()) {
                                if (((zzfgt) entry2.getValue()).zzd() < j10) {
                                    j10 = ((zzfgt) entry2.getValue()).zzd();
                                    zzfheVar2 = (zzfhe) entry2.getKey();
                                }
                            }
                            if (zzfheVar2 != null) {
                                this.zza.remove(zzfheVar2);
                            }
                        }
                    } else {
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfgt) entry3.getValue()).zzc() < j10) {
                                j10 = ((zzfgt) entry3.getValue()).zzc();
                                zzfheVar2 = (zzfhe) entry3.getKey();
                            }
                        }
                        if (zzfheVar2 != null) {
                            this.zza.remove(zzfheVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfheVar, zzfgtVar2);
            this.zzc.zzd();
            zzfgtVar = zzfgtVar2;
        }
        zzh = zzfgtVar.zzh(zzfhdVar);
        this.zzc.zzc();
        zzfgw zza = this.zzc.zza();
        zzfhr zzf = zzfgtVar.zzf();
        zzbbc.zzb.zzc zzd = zzbbc.zzb.zzd();
        zzbbc.zzb.zza.C0160zza zza2 = zzbbc.zzb.zza.zza();
        zza2.zzf(zzbbc.zzb.zzd.IN_MEMORY);
        zzbbc.zzb.zzg.zza zzc = zzbbc.zzb.zzg.zzc();
        zzc.zze(zza.zza);
        zzc.zzf(zza.zzb);
        zzc.zzg(zzf.zzb);
        zza2.zzi(zzc);
        zzd.zzd(zza2);
        zzfhdVar.zza.zzb().zzc().zzj(zzd.zzbr());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final synchronized boolean zze(zzfhe zzfheVar) {
        zzfgt zzfgtVar = (zzfgt) this.zza.get(zzfheVar);
        if (zzfgtVar == null) {
            return true;
        }
        zzfhb zzfhbVar = this.zzb;
        if (zzfgtVar.zzb() < zzfhbVar.zzd) {
            return true;
        }
        return false;
    }
}
