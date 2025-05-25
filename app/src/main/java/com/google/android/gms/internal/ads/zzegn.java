package com.google.android.gms.internal.ads;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzegn implements zzeet {
    private final zzcql zza;
    private final zzefu zzb;
    private final zzgcu zzc;
    private final zzcws zzd;
    private final ScheduledExecutorService zze;
    private final zzdsf zzf;

    public zzegn(zzcql zzcqlVar, zzefu zzefuVar, zzcws zzcwsVar, ScheduledExecutorService scheduledExecutorService, zzgcu zzgcuVar, zzdsf zzdsfVar) {
        this.zza = zzcqlVar;
        this.zzb = zzefuVar;
        this.zzd = zzcwsVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgcuVar;
        this.zzf = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzegn.this.zzc(zzfexVar, zzfelVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        Object obj;
        zzbgu zza = zzfexVar.zza.zza.zza();
        boolean zzb = this.zzb.zzb(zzfexVar, zzfelVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkZ)).booleanValue()) {
            zzdsf zzdsfVar = this.zzf;
            String str = "1";
            if (zza != null) {
                obj = "1";
            } else {
                obj = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            }
            zzdsfVar.zzb().put("has_dbl", obj);
            zzdsf zzdsfVar2 = this.zzf;
            if (true != zzb) {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            }
            zzdsfVar2.zzb().put("crdb", str);
        }
        if (zza != null && zzb) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ zzcpk zzc(final zzfex zzfexVar, final zzfel zzfelVar) {
        return this.zza.zzb(new zzcsk(zzfexVar, zzfelVar, null), new zzcrc(zzfexVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // java.lang.Runnable
            public final void run() {
                zzegn.this.zzf(zzfexVar, zzfelVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzfex zzfexVar, zzfel zzfelVar) {
        zzgcj.zzr(zzgcj.zzo(this.zzb.zza(zzfexVar, zzfelVar), zzfelVar.zzR, TimeUnit.SECONDS, this.zze), new zzegm(this), this.zzc);
    }
}
