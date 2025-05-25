package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzaxd implements Callable {
    protected final zzavp zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzaro zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxd(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11) {
        this.zza = zzavpVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaroVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        zzk();
        return null;
    }

    public abstract void zza();

    public Void zzk() {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = zzj;
            if (zzj != null) {
                zza();
                zzauj zzd = this.zza.zzd();
                if (zzd != null && (i10 = this.zzf) != Integer.MIN_VALUE) {
                    zzd.zzc(this.zzg, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
