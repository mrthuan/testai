package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcop implements zzaxw {
    private zzcej zza;
    private final Executor zzb;
    private final zzcob zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcoe zzg = new zzcoe();

    public zzcop(Executor executor, zzcob zzcobVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcobVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcop.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        boolean z10;
        if (this.zzf) {
            z10 = false;
        } else {
            z10 = zzaxvVar.zzj;
        }
        zzcoe zzcoeVar = this.zzg;
        zzcoeVar.zza = z10;
        zzcoeVar.zzd = this.zzd.b();
        this.zzg.zzf = zzaxvVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcej zzcejVar) {
        this.zza = zzcejVar;
    }
}
