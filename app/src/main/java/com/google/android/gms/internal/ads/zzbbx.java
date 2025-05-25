package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbx {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdc.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbdp.zza);
        zzc(arrayList, zzbdp.zzb);
        zzc(arrayList, zzbdp.zzc);
        zzc(arrayList, zzbdp.zzd);
        zzc(arrayList, zzbdp.zze);
        zzc(arrayList, zzbdp.zzu);
        zzc(arrayList, zzbdp.zzf);
        zzc(arrayList, zzbdp.zzm);
        zzc(arrayList, zzbdp.zzn);
        zzc(arrayList, zzbdp.zzo);
        zzc(arrayList, zzbdp.zzp);
        zzc(arrayList, zzbdp.zzq);
        zzc(arrayList, zzbdp.zzr);
        zzc(arrayList, zzbdp.zzs);
        zzc(arrayList, zzbdp.zzt);
        zzc(arrayList, zzbdp.zzg);
        zzc(arrayList, zzbdp.zzh);
        zzc(arrayList, zzbdp.zzi);
        zzc(arrayList, zzbdp.zzj);
        zzc(arrayList, zzbdp.zzk);
        zzc(arrayList, zzbdp.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbed.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbdc zzbdcVar) {
        String str = (String) zzbdcVar.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
