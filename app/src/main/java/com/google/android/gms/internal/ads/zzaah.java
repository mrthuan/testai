package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaah {
    private final zzaag zza;
    private final zzaal zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;

    public zzaah(Context context, zzaag zzaagVar, long j10) {
        this.zza = zzaagVar;
        this.zzb = new zzaal(context);
    }

    private final void zzp(int i10) {
        this.zzd = Math.min(this.zzd, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r15 > 100000) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r20 >= r24) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r17.zzc != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.zzaaf r27) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaah.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzaaf):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzp(0);
    }

    public final void zze(boolean z10) {
        this.zzd = z10 ? 1 : 0;
    }

    public final void zzf() {
        zzp(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzet.zzr(SystemClock.elapsedRealtime());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzp(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i10) {
        this.zzb.zzj(i10);
    }

    public final void zzk(float f10) {
        this.zzb.zzc(f10);
    }

    public final void zzl(Surface surface) {
        this.zzb.zzi(surface);
        zzp(1);
    }

    public final void zzm(float f10) {
        this.zzj = f10;
        this.zzb.zze(f10);
    }

    public final boolean zzn(boolean z10) {
        boolean z11 = true;
        if (!z10 || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= this.zzh) {
                z11 = false;
            }
            return z11;
        }
        this.zzh = -9223372036854775807L;
        return z11;
    }

    public final boolean zzo() {
        int i10 = this.zzd;
        this.zzd = 3;
        this.zzf = zzet.zzr(SystemClock.elapsedRealtime());
        if (i10 != 3) {
            return true;
        }
        return false;
    }
}
