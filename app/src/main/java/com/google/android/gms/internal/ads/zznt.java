package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zznt implements zznx {
    public static final zzfvk zza = new zzfvk() { // from class: com.google.android.gms.internal.ads.zznr
        @Override // com.google.android.gms.internal.ads.zzfvk
        public final Object zza() {
            String zzn;
            zzn = zznt.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzcb zzc;
    private final zzca zzd;
    private final HashMap zze;
    private zznw zzf;
    private zzcc zzg;
    private String zzh;
    private long zzi;

    public zznt() {
        throw null;
    }

    public final long zzl() {
        long j10;
        long j11;
        zzns zznsVar = (zzns) this.zze.get(this.zzh);
        if (zznsVar != null) {
            j10 = zznsVar.zzd;
            if (j10 != -1) {
                j11 = zznsVar.zzd;
                return j11;
            }
        }
        return this.zzi + 1;
    }

    private final zzns zzm(int i10, zzui zzuiVar) {
        long j10;
        int i11;
        zzui zzuiVar2;
        zzui zzuiVar3;
        long j11 = Long.MAX_VALUE;
        zzns zznsVar = null;
        for (zzns zznsVar2 : this.zze.values()) {
            zznsVar2.zzg(i10, zzuiVar);
            if (zznsVar2.zzj(i10, zzuiVar)) {
                j10 = zznsVar2.zzd;
                if (j10 != -1 && j10 >= j11) {
                    if (i11 == 0) {
                        int i12 = zzet.zza;
                        zzuiVar2 = zznsVar.zze;
                        if (zzuiVar2 != null) {
                            zzuiVar3 = zznsVar2.zze;
                            if (zzuiVar3 != null) {
                                zznsVar = zznsVar2;
                            }
                        }
                    }
                } else {
                    zznsVar = zznsVar2;
                    j11 = j10;
                }
            }
        }
        if (zznsVar == null) {
            String zzn = zzn();
            zzns zznsVar3 = new zzns(this, zzn, i10, zzuiVar);
            this.zze.put(zzn, zznsVar3);
            return zznsVar3;
        }
        return zznsVar;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzns zznsVar) {
        long j10;
        long j11;
        j10 = zznsVar.zzd;
        if (j10 != -1) {
            j11 = zznsVar.zzd;
            this.zzi = j11;
        }
        this.zzh = null;
    }

    private final void zzp(zzlo zzloVar) {
        String str;
        long j10;
        zzui zzuiVar;
        zzui zzuiVar2;
        zzui zzuiVar3;
        String unused;
        String unused2;
        if (zzloVar.zzb.zzo()) {
            String str2 = this.zzh;
            if (str2 != null) {
                zzns zznsVar = (zzns) this.zze.get(str2);
                zznsVar.getClass();
                zzo(zznsVar);
                return;
            }
            return;
        }
        zzns zznsVar2 = (zzns) this.zze.get(this.zzh);
        zzns zzm = zzm(zzloVar.zzc, zzloVar.zzd);
        str = zzm.zzb;
        this.zzh = str;
        zzi(zzloVar);
        zzui zzuiVar4 = zzloVar.zzd;
        if (zzuiVar4 != null && zzuiVar4.zzb()) {
            if (zznsVar2 != null) {
                long j11 = zzuiVar4.zzd;
                j10 = zznsVar2.zzd;
                if (j10 == j11) {
                    zzuiVar = zznsVar2.zze;
                    if (zzuiVar != null) {
                        zzuiVar2 = zznsVar2.zze;
                        if (zzuiVar2.zzb == zzloVar.zzd.zzb) {
                            zzuiVar3 = zznsVar2.zze;
                            if (zzuiVar3.zzc == zzloVar.zzd.zzc) {
                                return;
                            }
                        }
                    }
                }
            }
            zzui zzuiVar5 = zzloVar.zzd;
            unused = zzm(zzloVar.zzc, new zzui(zzuiVar5.zza, zzuiVar5.zzd)).zzb;
            unused2 = zzm.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized String zzf(zzcc zzccVar, zzui zzuiVar) {
        String str;
        str = zzm(zzccVar.zzn(zzuiVar.zza, this.zzd).zzc, zzuiVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzg(zzlo zzloVar) {
        boolean z10;
        zznw zznwVar;
        String str;
        String str2 = this.zzh;
        if (str2 != null) {
            zzns zznsVar = (zzns) this.zze.get(str2);
            zznsVar.getClass();
            zzo(zznsVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar2 = (zzns) it.next();
            it.remove();
            z10 = zznsVar2.zzf;
            if (z10 && (zznwVar = this.zzf) != null) {
                str = zznsVar2.zzb;
                zznwVar.zzd(zzloVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzh(zznw zznwVar) {
        this.zzf = zznwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x003a, code lost:
        if (r0 == r10.zzc) goto L21;
     */
    @Override // com.google.android.gms.internal.ads.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzlo r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zznw r0 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            r0.getClass()
            com.google.android.gms.internal.ads.zzcc r0 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L10
            goto Lc4
        L10:
            com.google.android.gms.internal.ads.zzui r0 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = r9.zzl()     // Catch: java.lang.Throwable -> Lc6
            long r3 = r0.zzd     // Catch: java.lang.Throwable -> Lc6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc4
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns r0 = (com.google.android.gms.internal.ads.zzns) r0     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = com.google.android.gms.internal.ads.zzns.zzb(r0)     // Catch: java.lang.Throwable -> Lc6
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r0 = com.google.android.gms.internal.ads.zzns.zza(r0)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            if (r0 != r1) goto Lc4
        L3c:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzui r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns r0 = r9.zzm(r0, r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L4e
            java.lang.String r1 = com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r9.zzh = r1     // Catch: java.lang.Throwable -> Lc6
        L4e:
            com.google.android.gms.internal.ads.zzui r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            r2 = 1
            if (r1 == 0) goto L98
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L98
            java.lang.Object r3 = r1.zza     // Catch: java.lang.Throwable -> Lc6
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Lc6
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzui r6 = new com.google.android.gms.internal.ads.zzui     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns r1 = r9.zzm(r1, r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = com.google.android.gms.internal.ads.zzns.zzi(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto L98
            com.google.android.gms.internal.ads.zzns.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzcc r3 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzui r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzca r5 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lc6
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzca r3 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzui r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lc6
            r3.zzi(r4)     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzet.zzu(r3)     // Catch: java.lang.Throwable -> Lc6
            long r7 = com.google.android.gms.internal.ads.zzet.zzu(r3)     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns.zzd(r1)     // Catch: java.lang.Throwable -> Lc6
        L98:
            boolean r1 = com.google.android.gms.internal.ads.zzns.zzi(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto La4
            com.google.android.gms.internal.ads.zzns.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
        La4:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Lc4
            boolean r1 = com.google.android.gms.internal.ads.zzns.zzh(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto Lc4
            com.google.android.gms.internal.ads.zzns.zze(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zznw r1 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r9)
            return
        Lc4:
            monitor-exit(r9)
            return
        Lc6:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznt.zzi(com.google.android.gms.internal.ads.zzlo):void");
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzj(zzlo zzloVar, int i10) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        this.zzf.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar = (zzns) it.next();
            if (zznsVar.zzk(zzloVar)) {
                it.remove();
                z10 = zznsVar.zzf;
                if (z10) {
                    str = zznsVar.zzb;
                    boolean equals = str.equals(this.zzh);
                    boolean z12 = false;
                    if (i10 == 0 && equals) {
                        z11 = zznsVar.zzg;
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (equals) {
                        zzo(zznsVar);
                    }
                    zznw zznwVar = this.zzf;
                    str2 = zznsVar.zzb;
                    zznwVar.zzd(zzloVar, str2, z12);
                }
            }
        }
        zzp(zzloVar);
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzk(zzlo zzloVar) {
        boolean z10;
        String str;
        String str2;
        this.zzf.getClass();
        zzcc zzccVar = this.zzg;
        this.zzg = zzloVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar = (zzns) it.next();
            if (!zznsVar.zzl(zzccVar, this.zzg) || zznsVar.zzk(zzloVar)) {
                it.remove();
                z10 = zznsVar.zzf;
                if (z10) {
                    str = zznsVar.zzb;
                    if (str.equals(this.zzh)) {
                        zzo(zznsVar);
                    }
                    zznw zznwVar = this.zzf;
                    str2 = zznsVar.zzb;
                    zznwVar.zzd(zzloVar, str2, false);
                }
            }
        }
        zzp(zzloVar);
    }

    public zznt(zzfvk zzfvkVar) {
        this.zzc = new zzcb();
        this.zzd = new zzca();
        this.zze = new HashMap();
        this.zzg = zzcc.zza;
        this.zzi = -1L;
    }
}
