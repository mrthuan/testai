package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzns {
    final /* synthetic */ zznt zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzui zze;
    private boolean zzf;
    private boolean zzg;

    public zzns(zznt zzntVar, String str, int i10, zzui zzuiVar) {
        long j10;
        this.zza = zzntVar;
        this.zzb = str;
        this.zzc = i10;
        if (zzuiVar == null) {
            j10 = -1;
        } else {
            j10 = zzuiVar.zzd;
        }
        this.zzd = j10;
        if (zzuiVar != null && zzuiVar.zzb()) {
            this.zze = zzuiVar;
        }
    }

    public final void zzg(int i10, zzui zzuiVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzuiVar != null) {
            zznt zzntVar = this.zza;
            long j10 = zzuiVar.zzd;
            if (j10 >= zznt.zza(zzntVar)) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzj(int i10, zzui zzuiVar) {
        if (zzuiVar == null) {
            if (i10 == this.zzc) {
                return true;
            }
            return false;
        }
        zzui zzuiVar2 = this.zze;
        if (zzuiVar2 == null) {
            if (!zzuiVar.zzb() && zzuiVar.zzd == this.zzd) {
                return true;
            }
            return false;
        } else if (zzuiVar.zzd == zzuiVar2.zzd && zzuiVar.zzb == zzuiVar2.zzb && zzuiVar.zzc == zzuiVar2.zzc) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean zzk(zzlo zzloVar) {
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar == null) {
            if (this.zzc != zzloVar.zzc) {
                return true;
            }
            return false;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        if (zzuiVar.zzd > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcc zzccVar = zzloVar.zzb;
        int zza = zzccVar.zza(zzuiVar.zza);
        int zza2 = zzccVar.zza(this.zze.zza);
        zzui zzuiVar2 = zzloVar.zzd;
        if (zzuiVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zzuiVar2.zzb()) {
            zzui zzuiVar3 = zzloVar.zzd;
            int i10 = zzuiVar3.zzb;
            int i11 = zzuiVar3.zzc;
            zzui zzuiVar4 = this.zze;
            int i12 = zzuiVar4.zzb;
            if (i10 > i12) {
                return true;
            }
            if (i10 == i12 && i11 > zzuiVar4.zzc) {
                return true;
            }
            return false;
        }
        int i13 = zzloVar.zzd.zze;
        if (i13 == -1 || i13 > this.zze.zzb) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcc r7, com.google.android.gms.internal.ads.zzcc r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = r3
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zznt r1 = r6.zza
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zznt.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zznt r0 = r6.zza
            com.google.android.gms.internal.ads.zzcb r0 = com.google.android.gms.internal.ads.zznt.zzc(r0)
            int r0 = r0.zzn
        L26:
            com.google.android.gms.internal.ads.zznt r1 = r6.zza
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zznt.zzc(r1)
            int r1 = r1.zzo
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zznt r7 = r6.zza
            com.google.android.gms.internal.ads.zzca r7 = com.google.android.gms.internal.ads.zznt.zzb(r7)
            com.google.android.gms.internal.ads.zzca r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzc
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzui r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzns.zzl(com.google.android.gms.internal.ads.zzcc, com.google.android.gms.internal.ads.zzcc):boolean");
    }
}
