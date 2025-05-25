package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzpd {
    private final Handler zza;
    private final zzpe zzb;

    public zzpd(Handler handler, zzpe zzpeVar) {
        this.zza = zzpeVar == null ? null : handler;
        this.zzb = zzpeVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzox
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoy
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzpf zzpfVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzl(zzpfVar);
                }
            });
        }
    }

    public final void zzd(final zzpf zzpfVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzm(zzpfVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpb
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzn(str, j10, j11);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpc
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzhn zzhnVar) {
        zzhnVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzos
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzp(zzhnVar);
                }
            });
        }
    }

    public final void zzh(final zzhn zzhnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzq(zzhnVar);
                }
            });
        }
    }

    public final void zzi(final zzaf zzafVar, final zzho zzhoVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoz
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzr(zzafVar, zzhoVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzj(Exception exc) {
        int i10 = zzet.zza;
        this.zzb.zza(exc);
    }

    public final /* synthetic */ void zzk(Exception exc) {
        int i10 = zzet.zza;
        this.zzb.zzh(exc);
    }

    public final /* synthetic */ void zzl(zzpf zzpfVar) {
        int i10 = zzet.zza;
        this.zzb.zzi(zzpfVar);
    }

    public final /* synthetic */ void zzm(zzpf zzpfVar) {
        int i10 = zzet.zza;
        this.zzb.zzj(zzpfVar);
    }

    public final /* synthetic */ void zzn(String str, long j10, long j11) {
        int i10 = zzet.zza;
        this.zzb.zzb(str, j10, j11);
    }

    public final /* synthetic */ void zzo(String str) {
        int i10 = zzet.zza;
        this.zzb.zzc(str);
    }

    public final /* synthetic */ void zzp(zzhn zzhnVar) {
        zzhnVar.zza();
        int i10 = zzet.zza;
        this.zzb.zzd(zzhnVar);
    }

    public final /* synthetic */ void zzq(zzhn zzhnVar) {
        int i10 = zzet.zza;
        this.zzb.zze(zzhnVar);
    }

    public final /* synthetic */ void zzr(zzaf zzafVar, zzho zzhoVar) {
        int i10 = zzet.zza;
        this.zzb.zzf(zzafVar, zzhoVar);
    }

    public final /* synthetic */ void zzs(long j10) {
        int i10 = zzet.zza;
        this.zzb.zzg(j10);
    }

    public final /* synthetic */ void zzt(boolean z10) {
        int i10 = zzet.zza;
        this.zzb.zzn(z10);
    }

    public final /* synthetic */ void zzu(int i10, long j10, long j11) {
        int i11 = zzet.zza;
        this.zzb.zzk(i10, j10, j11);
    }

    public final void zzv(final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzs(j10);
                }
            });
        }
    }

    public final void zzw(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzt(z10);
                }
            });
        }
    }

    public final void zzx(final int i10, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzu(i10, j10, j11);
                }
            });
        }
    }
}
