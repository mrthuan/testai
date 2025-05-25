package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzesa implements zzevo {
    private final zzgcu zza;

    public zzesa(Context context, zzgcu zzgcuVar) {
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzerz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
                zzayv zzg = zzuVar.f10557g.zzi().zzg();
                Bundle bundle = null;
                if (zzg != null && (!zzuVar.f10557g.zzi().zzP() || !zzuVar.f10557g.zzi().zzQ())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzayl zza = zzg.zza();
                    if (zza != null) {
                        zzj = zza.zzd();
                        str = zza.zze();
                        zzk = zza.zzf();
                        if (zzj != null) {
                            zzuVar.f10557g.zzi().zzx(zzj);
                        }
                        if (zzk != null) {
                            zzuVar.f10557g.zzi().t(zzk);
                        }
                    } else {
                        zzj = zzuVar.f10557g.zzi().zzj();
                        zzk = zzuVar.f10557g.zzi().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!zzuVar.f10557g.zzi().zzQ()) {
                        if (zzk != null && !TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", zzk);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzj != null && !zzuVar.f10557g.zzi().zzP()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzesb(bundle);
            }
        });
    }
}
