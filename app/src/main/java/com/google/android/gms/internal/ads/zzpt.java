package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzpt {
    private final Context zza;
    private Boolean zzb;

    public zzpt() {
        this.zza = null;
    }

    public final zzoq zza(zzaf zzafVar, zzh zzhVar) {
        boolean booleanValue;
        zzafVar.getClass();
        zzhVar.getClass();
        int i10 = zzet.zza;
        if (i10 >= 29 && zzafVar.zzA != -1) {
            Context context = this.zza;
            Boolean bool = this.zzb;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        boolean z10 = false;
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z10 = true;
                        }
                        this.zzb = Boolean.valueOf(z10);
                    } else {
                        this.zzb = Boolean.FALSE;
                    }
                } else {
                    this.zzb = Boolean.FALSE;
                }
                booleanValue = this.zzb.booleanValue();
            }
            String str = zzafVar.zzm;
            str.getClass();
            int zza = zzbn.zza(str, zzafVar.zzj);
            if (zza != 0 && i10 >= zzet.zzg(zza)) {
                int zzh = zzet.zzh(zzafVar.zzz);
                if (zzh == 0) {
                    return zzoq.zza;
                }
                try {
                    AudioFormat zzw = zzet.zzw(zzafVar.zzA, zzh, zza);
                    if (i10 >= 31) {
                        return zzps.zza(zzw, zzhVar.zza().zza, booleanValue);
                    }
                    return zzpr.zza(zzw, zzhVar.zza().zza, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return zzoq.zza;
                }
            }
            return zzoq.zza;
        }
        return zzoq.zza;
    }

    public zzpt(Context context) {
        this.zza = context;
    }
}
