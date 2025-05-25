package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcce implements zzfs {
    private final Context zza;
    private final zzfs zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbah zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzfy zzl;

    public zzcce(Context context, zzfs zzfsVar, String str, int i10, zzgu zzguVar, zzccd zzccdVar) {
        this.zza = context;
        this.zzb = zzfsVar;
        this.zzc = str;
        this.zzd = i10;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        zzbbn zzbbnVar = zzbbw.zzdT;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && !this.zzj) {
            return true;
        }
        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzdU)).booleanValue() || this.zzk) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i10, i11);
            }
            return this.zzb.zza(bArr, i10, i11);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) {
        Long l10;
        if (!this.zzg) {
            this.zzg = true;
            Uri uri = zzfyVar.zza;
            this.zzh = uri;
            this.zzl = zzfyVar;
            this.zzi = zzbah.zza(uri);
            zzbbn zzbbnVar = zzbbw.zzdQ;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            zzbae zzbaeVar = null;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                if (this.zzi != null) {
                    this.zzi.zzh = zzfyVar.zze;
                    this.zzi.zzi = zzfvj.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    if (this.zzi.zzg) {
                        l10 = (Long) zzbaVar.c.zza(zzbbw.zzdS);
                    } else {
                        l10 = (Long) zzbaVar.c.zza(zzbbw.zzdR);
                    }
                    long longValue = l10.longValue();
                    com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                    SystemClock.elapsedRealtime();
                    Future zza = zzbas.zza(this.zza, this.zzi);
                    try {
                        try {
                            try {
                                zzbat zzbatVar = (zzbat) zza.get(longValue, TimeUnit.MILLISECONDS);
                                zzbatVar.zzd();
                                this.zzj = zzbatVar.zzf();
                                this.zzk = zzbatVar.zze();
                                zzbatVar.zza();
                                if (!zzg()) {
                                    this.zzf = zzbatVar.zzc();
                                }
                            } catch (InterruptedException unused) {
                                zza.cancel(false);
                                Thread.currentThread().interrupt();
                            }
                        } catch (ExecutionException | TimeoutException unused2) {
                            zza.cancel(false);
                        }
                    } catch (Throwable unused3) {
                    }
                    com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                    SystemClock.elapsedRealtime();
                    throw null;
                }
            } else {
                if (this.zzi != null) {
                    this.zzi.zzh = zzfyVar.zze;
                    this.zzi.zzi = zzfvj.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    zzbaeVar = com.google.android.gms.ads.internal.zzu.B.f10559i.zzb(this.zzi);
                }
                if (zzbaeVar != null && zzbaeVar.zze()) {
                    this.zzj = zzbaeVar.zzg();
                    this.zzk = zzbaeVar.zzf();
                    if (!zzg()) {
                        this.zzf = zzbaeVar.zzc();
                        return -1L;
                    }
                }
            }
            if (this.zzi != null) {
                zzfw zza2 = zzfyVar.zza();
                zza2.zzd(Uri.parse(this.zzi.zza));
                this.zzl = zza2.zze();
            }
            return this.zzb.zzb(this.zzl);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        if (this.zzg) {
            this.zzg = false;
            this.zzh = null;
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.a(inputStream);
                this.zzf = null;
                return;
            }
            this.zzb.zzd();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzf(zzgu zzguVar) {
    }
}
