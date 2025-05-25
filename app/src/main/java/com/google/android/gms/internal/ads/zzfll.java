package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfll {
    private final Context zza;
    private final Executor zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final zzfki zzd;

    public zzfll(Context context, Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzfki zzfkiVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzrVar;
        this.zzd = zzfkiVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfkf zzfkfVar) {
        zzfju zza = zzfjt.zza(this.zza, 14);
        zza.zzi();
        zza.zzg(this.zzc.zza(str));
        if (zzfkfVar == null) {
            this.zzd.zzb(zza.zzm());
            return;
        }
        zzfkfVar.zza(zza);
        zzfkfVar.zzh();
    }

    public final void zzc(final String str, final zzfkf zzfkfVar) {
        if (zzfki.zza() && ((Boolean) zzbdl.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflk
                @Override // java.lang.Runnable
                public final void run() {
                    zzfll.this.zzb(str, zzfkfVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflj
                @Override // java.lang.Runnable
                public final void run() {
                    zzfll.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
