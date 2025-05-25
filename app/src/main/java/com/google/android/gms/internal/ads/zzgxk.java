package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxk extends zzgxj {
    @Override // com.google.android.gms.internal.ads.zzgxj
    public final void zza(Object obj) {
        ((zzgxu) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgxj
    public final void zzb(zzhbh zzhbhVar, Map.Entry entry) {
        zzgxv zzgxvVar = (zzgxv) entry.getKey();
        if (zzgxvVar.zzc) {
            zzhbf zzhbfVar = zzhbf.zza;
            switch (zzgxvVar.zzb.ordinal()) {
                case 0:
                    zzhag.zzt(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 1:
                    zzhag.zzx(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 2:
                    zzhag.zzA(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 3:
                    zzhag.zzI(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 4:
                    zzhag.zzz(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 5:
                    zzhag.zzw(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 6:
                    zzhag.zzv(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 7:
                    zzhag.zzr(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 8:
                    zzhag.zzG(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzhag.zzy(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgzt.zza().zzb(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzhag.zzB(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgzt.zza().zzb(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzhag.zzs(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar);
                    return;
                case 12:
                    zzhag.zzH(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 13:
                    zzhag.zzz(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 14:
                    zzhag.zzC(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 15:
                    zzhag.zzD(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 16:
                    zzhag.zzE(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                case 17:
                    zzhag.zzF(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                    return;
                default:
                    return;
            }
        }
        zzhbf zzhbfVar2 = zzhbf.zza;
        switch (zzgxvVar.zzb.ordinal()) {
            case 0:
                zzhbhVar.zzf(zzgxvVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzhbhVar.zzo(zzgxvVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzhbhVar.zzt(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzhbhVar.zzK(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzhbhVar.zzr(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzhbhVar.zzm(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzhbhVar.zzk(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzhbhVar.zzb(zzgxvVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzhbhVar.zzG(zzgxvVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzhbhVar.zzq(zzgxvVar.zza, entry.getValue(), zzgzt.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzhbhVar.zzv(zzgxvVar.zza, entry.getValue(), zzgzt.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzhbhVar.zzd(zzgxvVar.zza, (zzgwm) entry.getValue());
                return;
            case 12:
                zzhbhVar.zzI(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzhbhVar.zzr(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzhbhVar.zzx(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzhbhVar.zzz(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzhbhVar.zzB(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzhbhVar.zzD(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
