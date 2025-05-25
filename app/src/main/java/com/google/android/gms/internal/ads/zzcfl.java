package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcfl extends com.google.android.gms.ads.internal.client.zzdp {
    private final zzcbk zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzdt zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbgl zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcfl(zzcbk zzcbkVar, float f10, boolean z10, boolean z11) {
        this.zza = zzcbkVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfk
            @Override // java.lang.Runnable
            public final void run() {
                zzcfl.this.zzd(i10, i11, z10, z11);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
            @Override // java.lang.Runnable
            public final void run() {
                zzcfl.this.zzr(hashMap);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0013, B:13:0x0027, B:14:0x0029, B:16:0x0041, B:17:0x004a), top: B:31:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0013, B:13:0x0027, B:14:0x0029, B:16:0x0041, B:17:0x004a), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            float r1 = r3.zzi     // Catch: java.lang.Throwable -> L60
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            float r1 = r3.zzk     // Catch: java.lang.Throwable -> L60
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            r3.zzi = r5     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbbn r5 = com.google.android.gms.internal.ads.zzbbw.zzlP     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r2.zza(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L60
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L29
            r3.zzj = r4     // Catch: java.lang.Throwable -> L60
        L29:
            boolean r4 = r3.zzh     // Catch: java.lang.Throwable -> L60
            r3.zzh = r7     // Catch: java.lang.Throwable -> L60
            int r5 = r3.zze     // Catch: java.lang.Throwable -> L60
            r3.zze = r6     // Catch: java.lang.Throwable -> L60
            float r2 = r3.zzk     // Catch: java.lang.Throwable -> L60
            r3.zzk = r8     // Catch: java.lang.Throwable -> L60
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L60
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L4a
            com.google.android.gms.internal.ads.zzcbk r8 = r3.zza     // Catch: java.lang.Throwable -> L60
            android.view.View r8 = r8.zzF()     // Catch: java.lang.Throwable -> L60
            r8.invalidate()     // Catch: java.lang.Throwable -> L60
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L4e
            goto L5c
        L4e:
            com.google.android.gms.internal.ads.zzbgl r8 = r3.zzn     // Catch: android.os.RemoteException -> L56
            if (r8 == 0) goto L5c
            r8.zze()     // Catch: android.os.RemoteException -> L56
            goto L5c
        L56:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.f(r0, r8)
        L5c:
            r3.zzw(r5, r6, r4, r7)
            return
        L60:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfl.zzc(float, float, int, boolean, float):void");
    }

    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar2;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar3;
        synchronized (this.zzb) {
            boolean z17 = this.zzg;
            boolean z18 = false;
            if (!z17 && i11 == 1) {
                i11 = 1;
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 != i11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && i11 == 1) {
                i11 = 1;
                z14 = true;
            } else {
                z14 = false;
            }
            if (z13 && i11 == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z13 && i11 == 3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z17 || z12) {
                z18 = true;
            }
            this.zzg = z18;
            if (z12) {
                try {
                    com.google.android.gms.ads.internal.client.zzdt zzdtVar4 = this.zzf;
                    if (zzdtVar4 != null) {
                        zzdtVar4.zzi();
                    }
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
                }
            }
            if (z14 && (zzdtVar3 = this.zzf) != null) {
                zzdtVar3.zzh();
            }
            if (z15 && (zzdtVar2 = this.zzf) != null) {
                zzdtVar2.zzg();
            }
            if (z16) {
                com.google.android.gms.ads.internal.client.zzdt zzdtVar5 = this.zzf;
                if (zzdtVar5 != null) {
                    zzdtVar5.zze();
                }
                this.zza.zzw();
            }
            if (z10 != z11 && (zzdtVar = this.zzf) != null) {
                zzdtVar.q0(z11);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final com.google.android.gms.ads.internal.client.zzdt zzi() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        synchronized (this.zzb) {
            zzdtVar = this.zzf;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z10) {
        String str;
        if (true != z10) {
            str = "unmute";
        } else {
            str = "mute";
        }
        zzx(str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        synchronized (this.zzb) {
            this.zzf = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z10;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        String str;
        String str2;
        String str3;
        Object obj = this.zzb;
        boolean z10 = zzfkVar.f10194a;
        boolean z11 = zzfkVar.f10195b;
        boolean z12 = zzfkVar.c;
        synchronized (obj) {
            this.zzl = z11;
            this.zzm = z12;
        }
        if (true != z10) {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str = "1";
        }
        if (true != z11) {
            str2 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str2 = "1";
        }
        if (true != z12) {
            str3 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str3 = "1";
        }
        y.b bVar = new y.b(3);
        bVar.put("muteStart", str);
        bVar.put("customControlsRequested", str2);
        bVar.put("clickToExpandRequested", str3);
        zzx("initialState", Collections.unmodifiableMap(bVar));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbgl zzbglVar) {
        synchronized (this.zzb) {
            this.zzn = zzbglVar;
        }
    }
}
