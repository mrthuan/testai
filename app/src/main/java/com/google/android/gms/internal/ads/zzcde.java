package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcde extends zzccv implements zzcba {
    public static final /* synthetic */ int zzd = 0;
    private zzcbb zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzccn zzi;
    private long zzj;
    private long zzk;

    public zzcde(zzcbk zzcbkVar, zzcbj zzcbjVar) {
        super(zzcbkVar);
        zzcdw zzcdwVar = new zzcdw(zzcbkVar.getContext(), zzcbjVar, (zzcbk) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.d("ExoPlayerAdapter initialized.");
        this.zze = zzcdwVar;
        zzcdwVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.a(str, "MD5")));
    }

    private static String zzd(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + PackagingURIHelper.FORWARD_SLASH_STRING + canonicalName + ":" + message;
    }

    private final void zzx(long j10) {
        com.google.android.gms.ads.internal.util.zzt.f10496l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdd
            @Override // java.lang.Runnable
            public final void run() {
                zzcde.this.zzb();
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzccv, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcbb zzcbbVar = this.zze;
        if (zzcbbVar != null) {
            zzcbbVar.zzL(null);
            this.zze.zzH();
        }
    }

    public final zzcbb zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbb zzcbbVar = this.zze;
        this.zze = null;
        return zzcbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [long] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.StringBuilder] */
    public final void zzb() {
        zzcde zzcdeVar;
        zzcde zzcdeVar2;
        String str;
        String str2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar;
        ?? longValue;
        long intValue;
        ?? booleanValue;
        ?? r62;
        zzcde zzcdeVar3;
        String str3;
        zzcde zzcdeVar4;
        com.google.android.gms.ads.internal.client.zzba zzbaVar2;
        zzcde zzcdeVar5;
        long j10;
        long j11;
        String str4;
        zzcde zzcdeVar6;
        long j12;
        boolean z10;
        String str5;
        long j13;
        long j14;
        long j15;
        long j16;
        zzcde zzcdeVar7;
        String zzc = zzc(this.zzf);
        String str6 = "error";
        try {
            zzbbn zzbbnVar = zzbbw.zzr;
            zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            longValue = ((Long) zzbaVar.c.zza(zzbbnVar)).longValue() * 1000;
            intValue = ((Integer) zzbaVar.c.zza(zzbbw.zzq)).intValue();
            booleanValue = ((Boolean) zzbaVar.c.zza(zzbbw.zzbG)).booleanValue();
        } catch (Exception e10) {
            e = e10;
            zzcdeVar = this;
            zzcdeVar2 = zzcdeVar;
            str = zzc;
            str2 = "error";
        }
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                r62 = this.zzj;
                if (currentTimeMillis - r62 <= longValue) {
                    try {
                        if (!this.zzg) {
                            if (this.zzh) {
                                zzcdeVar7 = this;
                            } else if (this.zze.zzV()) {
                                long zzz = this.zze.zzz();
                                try {
                                    if (zzz > 0) {
                                        long zzv = this.zze.zzv();
                                        if (zzv != this.zzk) {
                                            if (zzv > 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            boolean z11 = z10;
                                            try {
                                                str5 = this.zzf;
                                                j13 = -1;
                                                if (booleanValue != 0) {
                                                    j14 = this.zze.zzA();
                                                } else {
                                                    j14 = -1;
                                                }
                                                if (booleanValue != 0) {
                                                    j15 = this.zze.zzx();
                                                } else {
                                                    j15 = -1;
                                                }
                                                if (booleanValue != 0) {
                                                    j13 = this.zze.zzB();
                                                }
                                                j16 = j14;
                                                j11 = intValue;
                                                str4 = zzc;
                                                zzbaVar2 = zzbaVar;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str4 = zzc;
                                                booleanValue = this;
                                            }
                                            try {
                                                zzo(str5, zzc, zzv, zzz, z11, j16, j15, j13, zzcbb.zzs(), zzcbb.zzu());
                                                zzcdeVar6 = this;
                                                j10 = zzv;
                                                try {
                                                    zzcdeVar6.zzk = j10;
                                                    j12 = zzz;
                                                    zzcdeVar6 = zzcdeVar6;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    booleanValue = zzcdeVar6;
                                                    r62 = str4;
                                                    zzcdeVar4 = booleanValue;
                                                    zzcdeVar3 = zzcdeVar4;
                                                    str3 = r62;
                                                    str = str3;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                break;
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                str2 = str6;
                                                                zzcde zzcdeVar8 = zzcdeVar3;
                                                                zzcdeVar2 = zzcdeVar4;
                                                                zzcdeVar = zzcdeVar8;
                                                                com.google.android.gms.ads.internal.util.client.zzm.e("Failed to preload url " + zzcdeVar2.zzf + " Exception: " + e.getMessage());
                                                                com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e, "VideoStreamExoPlayerCache.preload");
                                                                zzcdeVar.release();
                                                                zzcdeVar2.zzg(zzcdeVar2.zzf, str, str2, zzd(str2, e));
                                                                com.google.android.gms.ads.internal.zzu.B.f10576z.zzc(zzcdeVar2.zzi);
                                                                return;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                booleanValue = this;
                                                r62 = str4;
                                                zzcdeVar4 = booleanValue;
                                                zzcdeVar3 = zzcdeVar4;
                                                str3 = r62;
                                                str = str3;
                                                while (true) {
                                                    break;
                                                    break;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            j10 = zzv;
                                            j11 = intValue;
                                            str4 = zzc;
                                            zzbaVar2 = zzbaVar;
                                            zzcdeVar6 = this;
                                            j12 = zzz;
                                        }
                                        if (j10 >= j12) {
                                            zzcdeVar6.zzj(zzcdeVar6.zzf, str4, j12);
                                            zzcdeVar7 = zzcdeVar6;
                                        } else {
                                            int i10 = (zzcdeVar6.zze.zzw() > j11 ? 1 : (zzcdeVar6.zze.zzw() == j11 ? 0 : -1));
                                            zzcdeVar5 = zzcdeVar6;
                                            if (i10 >= 0) {
                                                zzcdeVar7 = zzcdeVar6;
                                                zzcdeVar5 = zzcdeVar6;
                                                if (j10 > 0) {
                                                }
                                            }
                                        }
                                    } else {
                                        zzbaVar2 = zzbaVar;
                                        zzcdeVar5 = this;
                                    }
                                    zzcdeVar5.zzx(((Long) zzbaVar2.c.zza(zzbbw.zzs)).longValue());
                                    return;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } else {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            zzcdeVar2 = zzcdeVar7;
                            com.google.android.gms.ads.internal.zzu.B.f10576z.zzc(zzcdeVar2.zzi);
                            return;
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th7) {
                        th = th7;
                        str6 = longValue;
                    }
                } else {
                    str3 = zzc;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th8) {
                        th = th8;
                        zzcdeVar4 = this;
                        zzcdeVar3 = zzcdeVar4;
                        str6 = "downloadTimeout";
                        str = str3;
                        while (true) {
                            break;
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                r62 = zzc;
                booleanValue = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzi(final boolean z10, final long j10) {
        final zzcbk zzcbkVar = (zzcbk) this.zzc.get();
        if (zzcbkVar != null) {
            zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbk.this.zzv(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.g(5);
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.g(5);
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
        r5 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23, types: [com.google.android.gms.internal.ads.zzccv] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzcde] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.google.android.gms.internal.ads.zzccv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzu(java.lang.String r47, java.lang.String[] r48) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcde.zzu(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.e("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final boolean zzw(String str, String[] strArr, zzccn zzccnVar) {
        this.zzf = str;
        this.zzi = zzccnVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbk zzcbkVar = (zzcbk) this.zzc.get();
            if (zzcbkVar != null) {
                zzcbkVar.zzt(zzc, this);
            }
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            this.zzj = System.currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Failed to preload url " + str + " Exception: " + e10.getMessage());
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzm(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzD(int i10, int i11) {
    }
}
