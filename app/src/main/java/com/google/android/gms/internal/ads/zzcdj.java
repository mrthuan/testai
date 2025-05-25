package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcdj extends zzfl {
    private final Context zza;
    private final zzfs zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbah zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private y9.a zzo;
    private final AtomicLong zzp;
    private final zzcdu zzq;

    public zzcdj(Context context, zzfs zzfsVar, String str, int i10, zzgu zzguVar, zzcdu zzcduVar) {
        super(false);
        this.zza = context;
        this.zzb = zzfsVar;
        this.zzq = zzcduVar;
        this.zzc = str;
        this.zzd = i10;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue();
        zzf(zzguVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        zzbbn zzbbnVar = zzbbw.zzdT;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && !this.zzl) {
            return true;
        }
        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzdU)).booleanValue() || this.zzm) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        int zza;
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                zza = inputStream.read(bArr, i10, i11);
            } else {
                zza = this.zzb.zza(bArr, i10, i11);
            }
            if (!this.zze || this.zzf != null) {
                zzg(zza);
            }
            return zza;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dc  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v20, types: [long] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // com.google.android.gms.internal.ads.zzfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfy r15) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdj.zzb(com.google.android.gms.internal.ads.zzfy):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        if (this.zzg) {
            boolean z10 = false;
            this.zzg = false;
            this.zzh = null;
            if (!this.zze || this.zzf != null) {
                z10 = true;
            }
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.a(inputStream);
                this.zzf = null;
            } else {
                this.zzb.zzd();
            }
            if (z10) {
                zzh();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzbzo.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcdj.this.zzm();
                        }
                    });
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final Long zzm() {
        return Long.valueOf(com.google.android.gms.ads.internal.zzu.B.f10559i.zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
