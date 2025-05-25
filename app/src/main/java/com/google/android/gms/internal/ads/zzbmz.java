package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbmz extends zzcaa {
    private final com.google.android.gms.ads.internal.util.zzbd zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbmz(com.google.android.gms.ads.internal.util.zzbd zzbdVar) {
        this.zzb = zzbdVar;
    }

    public final zzbmu zza() {
        boolean z10;
        zzbmu zzbmuVar = new zzbmu(this);
        com.google.android.gms.ads.internal.util.zze.h("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.h("createNewReference: Lock acquired");
            zzj(new zzbmv(this, zzbmuVar), new zzbmw(this, zzbmuVar));
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.m(z10);
            this.zzd++;
        }
        com.google.android.gms.ads.internal.util.zze.h("createNewReference: Lock released");
        return zzbmuVar;
    }

    public final void zzb() {
        boolean z10;
        com.google.android.gms.ads.internal.util.zze.h("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.h("markAsDestroyable: Lock acquired");
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.m(z10);
            com.google.android.gms.ads.internal.util.zze.h("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.h("markAsDestroyable: Lock released");
    }

    public final void zzc() {
        boolean z10;
        com.google.android.gms.ads.internal.util.zze.h("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.h("maybeDestroy: Lock acquired");
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.m(z10);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.h("No reference is left (including root). Cleaning up engine.");
                zzj(new zzbmy(this), new zzbzw());
            } else {
                com.google.android.gms.ads.internal.util.zze.h("There are still references to the engine. Not destroying.");
            }
        }
        com.google.android.gms.ads.internal.util.zze.h("maybeDestroy: Lock released");
    }

    public final void zzd() {
        boolean z10;
        com.google.android.gms.ads.internal.util.zze.h("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.h("releaseOneReference: Lock acquired");
            if (this.zzd > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.m(z10);
            com.google.android.gms.ads.internal.util.zze.h("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.h("releaseOneReference: Lock released");
    }
}
