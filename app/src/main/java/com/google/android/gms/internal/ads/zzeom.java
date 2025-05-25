package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeom implements zzevo {
    private final zzgcu zza;
    private final zzdqb zzb;
    private final zzdun zzc;
    private final zzeoo zzd;

    public zzeom(zzgcu zzgcuVar, zzdqb zzdqbVar, zzdun zzdunVar, zzeoo zzeooVar) {
        this.zza = zzgcuVar;
        this.zzb = zzdqbVar;
        this.zzc = zzdunVar;
        this.zzd = zzeooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzbbn zzbbnVar = zzbbw.zzkL;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && this.zzd.zza() != null) {
            zzeon zza = this.zzd.zza();
            zza.getClass();
            return zzgcj.zzh(zza);
        }
        if (!zzfvj.zzd((String) zzbaVar.c.zza(zzbbw.zzbh)) && (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt()))) {
            this.zzd.zzc(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeol
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeom.this.zzc();
                }
            });
        }
        return zzgcj.zzh(new zzeon(new Bundle()));
    }

    public final zzeon zzc() {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbh)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfge zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkL)).booleanValue() || zzt) {
                    try {
                        zzbra zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzffn unused) {
                    }
                }
                try {
                    zzbra zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzffn unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzffn unused3) {
            }
        }
        zzeon zzeonVar = new zzeon(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkL)).booleanValue()) {
            this.zzd.zzb(zzeonVar);
        }
        return zzeonVar;
    }
}
