package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.TelemetryConfig;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzht implements zzkb {
    private final zzyk zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzht() {
        zzyk zzykVar = new zzyk(true, 65536);
        zzk(2500, 0, "bufferForPlaybackMs", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        zzk(5000, 0, "bufferForPlaybackAfterRebufferMs", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        zzk(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzk(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(50000, 50000, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.zza = zzykVar;
        this.zzb = zzet.zzr(50000L);
        this.zzc = zzet.zzr(50000L);
        this.zzd = zzet.zzr(2500L);
        this.zze = zzet.zzr(TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        this.zzf = zzet.zzr(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzk(int i10, int i11, String str, String str2) {
        boolean z10;
        String m10 = androidx.activity.f.m(str, " cannot be less than ", str2);
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zze(z10, m10);
    }

    private final void zzl(zznz zznzVar) {
        if (this.zzg.remove(zznzVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    public final int zza() {
        int i10 = 0;
        for (zzhs zzhsVar : this.zzg.values()) {
            i10 += zzhsVar.zzb;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final long zzb(zznz zznzVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzc(zznz zznzVar) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.zzh;
        boolean z10 = true;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        }
        zzdi.zzg(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id2;
        if (!this.zzg.containsKey(zznzVar)) {
            this.zzg.put(zznzVar, new zzhs(null));
        }
        zzhs zzhsVar = (zzhs) this.zzg.get(zznzVar);
        zzhsVar.getClass();
        zzhsVar.zzb = 13107200;
        zzhsVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzd(zznz zznzVar) {
        zzl(zznzVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zze(zznz zznzVar) {
        zzl(zznzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzf(zznz zznzVar, zzcc zzccVar, zzui zzuiVar, zzle[] zzleVarArr, zzwi zzwiVar, zzxv[] zzxvVarArr) {
        zzhs zzhsVar = (zzhs) this.zzg.get(zznzVar);
        zzhsVar.getClass();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzleVarArr.length;
            int i12 = 13107200;
            if (i10 < 2) {
                if (zzxvVarArr[i10] != null) {
                    if (zzleVarArr[i10].zzb() != 1) {
                        i12 = 131072000;
                    }
                    i11 += i12;
                }
                i10++;
            } else {
                zzhsVar.zzb = Math.max(13107200, i11);
                zzm();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzg(zznz zznzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzh(zzka zzkaVar) {
        zzhs zzhsVar = (zzhs) this.zzg.get(zzkaVar.zza);
        zzhsVar.getClass();
        int zza = this.zza.zza();
        int zza2 = zza();
        long j10 = this.zzb;
        float f10 = zzkaVar.zzc;
        if (f10 > 1.0f) {
            j10 = Math.min(zzet.zzp(j10, f10), this.zzc);
        }
        long j11 = zzkaVar.zzb;
        int i10 = (j11 > Math.max(j10, 500000L) ? 1 : (j11 == Math.max(j10, 500000L) ? 0 : -1));
        boolean z10 = false;
        if (i10 < 0) {
            if (zza < zza2) {
                z10 = true;
            }
            zzhsVar.zza = z10;
            if (!z10 && j11 < 500000) {
                zzea.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzc || zza >= zza2) {
            zzhsVar.zza = false;
        }
        return zzhsVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzi(zzka zzkaVar) {
        long j10;
        boolean z10 = zzkaVar.zzd;
        long zzq = zzet.zzq(zzkaVar.zzb, zzkaVar.zzc);
        if (z10) {
            j10 = this.zze;
        } else {
            j10 = this.zzd;
        }
        long j11 = zzkaVar.zze;
        if (j11 != -9223372036854775807L) {
            j10 = Math.min(j11 / 2, j10);
        }
        if (j10 > 0 && zzq < j10 && this.zza.zza() < zza()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final zzyk zzj() {
        return this.zza;
    }
}
