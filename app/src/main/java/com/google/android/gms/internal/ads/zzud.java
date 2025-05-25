package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzud extends zzwk {
    private final boolean zzb;
    private final zzcb zzc;
    private final zzca zzd;
    private zzub zze;
    private zzua zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzud(zzuk zzukVar, boolean z10) {
        super(zzukVar);
        boolean z11;
        if (z10) {
            zzukVar.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzcb();
        this.zzd = new zzca();
        zzukVar.zzM();
        this.zze = zzub.zzq(zzukVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zze;
        if (obj2 != null && obj.equals(zzub.zzc)) {
            obj3 = this.zze.zze;
            return obj3;
        }
        return obj;
    }

    private final boolean zzL(long j10) {
        zzua zzuaVar = this.zzf;
        int zza = this.zze.zza(zzuaVar.zza.zza);
        if (zza == -1) {
            return false;
        }
        zzub zzubVar = this.zze;
        zzca zzcaVar = this.zzd;
        zzubVar.zzd(zza, zzcaVar, false);
        long j11 = zzcaVar.zzd;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zzuaVar.zzs(j10);
        return true;
    }

    public final zzcc zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final zzui zzD(zzui zzuiVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zze;
        Object obj3 = zzuiVar.zza;
        if (obj != null) {
            obj2 = this.zze.zze;
            if (obj2.equals(obj3)) {
                obj3 = zzub.zzc;
            }
        }
        return zzuiVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzE(com.google.android.gms.internal.ads.zzcc r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzub r0 = r14.zze
            com.google.android.gms.internal.ads.zzub r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzua r15 = r14.zzf
            if (r15 == 0) goto L9e
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9e
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzub r0 = r14.zze
            com.google.android.gms.internal.ads.zzub r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcb.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzub.zzc
            com.google.android.gms.internal.ads.zzub r15 = com.google.android.gms.internal.ads.zzub.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.zzcb r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcb r0 = r14.zzc
            java.lang.Object r0 = r0.zzb
            com.google.android.gms.internal.ads.zzua r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzub r8 = r14.zze
            com.google.android.gms.internal.ads.zzca r9 = r14.zzd
            com.google.android.gms.internal.ads.zzui r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzub r5 = r14.zze
            com.google.android.gms.internal.ads.zzcb r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcb r9 = r14.zzc
            com.google.android.gms.internal.ads.zzca r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzub r0 = r14.zze
            com.google.android.gms.internal.ads.zzub r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzub r15 = com.google.android.gms.internal.ads.zzub.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzua r15 = r14.zzf
            if (r15 == 0) goto L9e
            boolean r0 = r14.zzL(r4)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzui r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzui r1 = r15.zza(r0)
        L9e:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzub r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzua r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzud.zzE(com.google.android.gms.internal.ads.zzcc):void");
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB(null, ((zzwk) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzuk
    public final void zzG(zzug zzugVar) {
        ((zzua) zzugVar).zzt();
        if (zzugVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzuk
    /* renamed from: zzH */
    public final zzua zzI(zzui zzuiVar, zzyk zzykVar, long j10) {
        zzua zzuaVar = new zzua(zzuiVar, zzykVar, j10);
        zzuaVar.zzu(((zzwk) this).zza);
        if (this.zzh) {
            zzuaVar.zzr(zzuiVar.zza(zzK(zzuiVar.zza)));
        } else {
            this.zzf = zzuaVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwk) this).zza);
            }
        }
        return zzuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzth
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzth, com.google.android.gms.internal.ads.zzuk
    public final void zzt(zzbc zzbcVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwg(this.zze.zzb, zzbcVar));
        } else {
            this.zze = zzub.zzq(zzbcVar);
        }
        ((zzwk) this).zza.zzt(zzbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzuk
    public final void zzz() {
    }
}
