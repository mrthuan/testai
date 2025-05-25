package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdit implements zzaxw {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdiw zzb;

    public zzdit(zzdiw zzdiwVar, String str) {
        this.zza = str;
        this.zzb = zzdiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        Map map;
        zzdkx zzdkxVar;
        zzdkx zzdkxVar2;
        zzdkx zzdkxVar3;
        zzdkx zzdkxVar4;
        Map map2;
        zzdkx zzdkxVar5;
        zzdkx zzdkxVar6;
        zzdkx zzdkxVar7;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbz)).booleanValue()) {
            synchronized (this) {
                if (zzaxvVar.zzj) {
                    zzdiw zzdiwVar = this.zzb;
                    zzdkxVar4 = zzdiwVar.zzn;
                    if (zzdkxVar4 != null) {
                        map2 = zzdiwVar.zzx;
                        map2.put(this.zza, Boolean.TRUE);
                        zzdiw zzdiwVar2 = this.zzb;
                        zzdkxVar5 = zzdiwVar2.zzn;
                        View zzf = zzdkxVar5.zzf();
                        zzdkxVar6 = this.zzb.zzn;
                        Map zzl = zzdkxVar6.zzl();
                        zzdkxVar7 = this.zzb.zzn;
                        zzdiwVar2.zzB(zzf, zzl, zzdkxVar7.zzm(), true);
                    }
                }
            }
        } else if (zzaxvVar.zzj) {
            zzdiw zzdiwVar3 = this.zzb;
            String str = this.zza;
            map = zzdiwVar3.zzx;
            map.put(str, Boolean.TRUE);
            zzdiw zzdiwVar4 = this.zzb;
            zzdkxVar = zzdiwVar4.zzn;
            View zzf2 = zzdkxVar.zzf();
            zzdkxVar2 = this.zzb.zzn;
            Map zzl2 = zzdkxVar2.zzl();
            zzdkxVar3 = this.zzb.zzn;
            zzdiwVar4.zzB(zzf2, zzl2, zzdkxVar3.zzm(), true);
        }
    }
}
