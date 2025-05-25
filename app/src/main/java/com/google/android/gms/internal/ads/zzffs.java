package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzffs {
    private final zzfel zza;
    private final zzfeo zzb;
    private final zzedh zzc;
    private final zzfll zzd;
    private final zzfkf zze;
    private final zzcni zzf;

    public zzffs(zzedh zzedhVar, zzfll zzfllVar, zzfel zzfelVar, zzfeo zzfeoVar, zzcni zzcniVar, zzfkf zzfkfVar) {
        this.zza = zzfelVar;
        this.zzb = zzfeoVar;
        this.zzc = zzedhVar;
        this.zzd = zzfllVar;
        this.zzf = zzcniVar;
        this.zze = zzfkfVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzai) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzc.zzd(new zzedj(System.currentTimeMillis(), this.zzb.zzb, str, i10));
    }

    public final void zzc(List list, int i10) {
        y9.a zzh;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjg)).booleanValue() && zzcni.zzj(str)) {
                zzh = this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.f10107f.f10111e);
            } else {
                zzh = zzgcj.zzh(str);
            }
            zzgcj.zzr(zzh, new zzffr(this, i10), zzbzo.zza);
        }
    }
}
