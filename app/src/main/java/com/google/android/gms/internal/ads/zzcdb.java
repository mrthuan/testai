package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcdb extends zzccv implements zzgu {
    private String zzd;
    private final zzcbj zze;
    private boolean zzf;
    private final zzcda zzg;
    private final zzccg zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcdb(zzcbk zzcbkVar, zzcbj zzcbjVar) {
        super(zzcbkVar);
        String str;
        int i10;
        this.zze = zzcbjVar;
        this.zzg = new zzcda();
        this.zzh = new zzccg();
        this.zzk = new Object();
        if (zzcbkVar != null) {
            str = zzcbkVar.zzr();
        } else {
            str = null;
        }
        this.zzl = (String) zzfus.zzd(str).zzb("");
        if (zzcbkVar != null) {
            i10 = zzcbkVar.zzf();
        } else {
            i10 = 0;
        }
        this.zzm = i10;
    }

    public static final String zzm(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.a(str, "MD5")));
    }

    private final void zzv() {
        boolean z10;
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcbb.zzs();
        int zzu = zzcbb.zzu();
        String str = this.zzd;
        String zzm = zzm(str);
        long j10 = round;
        if (round > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzn(str, zzm, position, zza, j10, zza2, z10, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzd(zzfs zzfsVar, zzfy zzfyVar, boolean z10) {
        if (zzfsVar instanceof zzgg) {
            this.zzg.zzb((zzgg) zzfsVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzccv
    public final boolean zzt(String str) {
        Object obj;
        String str2;
        zzfs zzfsVar;
        this.zzd = str;
        String zzm = zzm(str);
        int i10 = 0;
        try {
            zzgb zzgbVar = new zzgb();
            zzgbVar.zzf(this.zzb);
            zzgbVar.zzc(this.zze.zzd);
            zzgbVar.zzd(this.zze.zze);
            zzgbVar.zzb(true);
            zzgbVar.zze(this);
            zzfs zza = zzgbVar.zza();
            if (this.zze.zzi) {
                zza = new zzcce(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzfy(Uri.parse(str), 0L, -1L, null));
            zzcbk zzcbkVar = (zzcbk) this.zzc.get();
            if (zzcbkVar != null) {
                zzcbkVar.zzt(zzm, this);
            }
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzbbn zzbbnVar = zzbbw.zzs;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            long longValue = ((Long) zzbaVar.c.zza(zzbbnVar)).longValue();
            long longValue2 = ((Long) zzbaVar.c.zza(zzbbw.zzr)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i11 = 8192;
            byte[] bArr = new byte[8192];
            obj = "error";
            long j10 = currentTimeMillis;
            while (true) {
                try {
                    int zza2 = zza.zza(bArr, i10, Math.min(this.zzi.remaining(), i11));
                    if (zza2 == -1) {
                        this.zzn = true;
                        zzj(str, zzm, (int) this.zzh.zza(this.zzi));
                        return true;
                    }
                    str2 = this.zzk;
                    synchronized (str2) {
                        if (!this.zzf) {
                            zzfsVar = zza;
                            this.zzi.put(bArr, 0, zza2);
                        } else {
                            zzfsVar = zza;
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzv();
                        return true;
                    }
                    try {
                        if (!this.zzf) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - j10 >= longValue) {
                                zzv();
                                j10 = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis <= 1000 * longValue2) {
                                i11 = 8192;
                                i10 = 0;
                                zza = zzfsVar;
                            } else {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                        } else {
                            int limit = this.zzi.limit();
                            throw new IOException("Precache abort at " + limit + " bytes");
                        }
                    } catch (Exception e10) {
                        e = e10;
                        String m10 = androidx.activity.f.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                        com.google.android.gms.ads.internal.util.client.zzm.e("Failed to preload url " + str + " Exception: " + m10);
                        zzg(str, zzm, str2, m10);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str2 = obj;
                    String m102 = androidx.activity.f.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                    com.google.android.gms.ads.internal.util.client.zzm.e("Failed to preload url " + str + " Exception: " + m102);
                    zzg(str, zzm, str2, m102);
                    return false;
                }
            }
        } catch (Exception e12) {
            e = e12;
            obj = "error";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzb(zzfs zzfsVar, zzfy zzfyVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzc(zzfs zzfsVar, zzfy zzfyVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zza(zzfs zzfsVar, zzfy zzfyVar, boolean z10, int i10) {
    }
}
