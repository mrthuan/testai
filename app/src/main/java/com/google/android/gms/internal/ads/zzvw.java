package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzvw implements zzadp {
    private zzrj zzA;
    private final zzvq zza;
    private final zzri zzd;
    private zzvv zze;
    private zzaf zzf;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzu;
    private zzaf zzx;
    private boolean zzz;
    private final zzvs zzb = new zzvs();
    private int zzg = 1000;
    private long[] zzh = new long[1000];
    private long[] zzi = new long[1000];
    private long[] zzl = new long[1000];
    private int[] zzk = new int[1000];
    private int[] zzj = new int[1000];
    private zzado[] zzm = new zzado[1000];
    private final zzwd zzc = new zzwd(new zzdn() { // from class: com.google.android.gms.internal.ads.zzvr
        @Override // com.google.android.gms.internal.ads.zzdn
        public final void zza(Object obj) {
            zzrh zzrhVar = ((zzvu) obj).zzb;
        }
    });
    private long zzr = Long.MIN_VALUE;
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private boolean zzw = true;
    private boolean zzv = true;
    private boolean zzy = true;

    public zzvw(zzyk zzykVar, zzri zzriVar, zzrd zzrdVar) {
        this.zzd = zzriVar;
        this.zza = new zzvq(zzykVar);
    }

    private final int zzA(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.zzl[i10] > j10 ? 1 : (this.zzl[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.zzk[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzg) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int zzB(int i10) {
        int i11 = this.zzp + i10;
        int i12 = this.zzg;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    private final synchronized int zzC(zzjz zzjzVar, zzhd zzhdVar, boolean z10, boolean z11, zzvs zzvsVar) {
        zzhdVar.zzd = false;
        if (!zzK()) {
            if (!z11 && !this.zzu) {
                zzaf zzafVar = this.zzx;
                if (zzafVar == null || (!z10 && zzafVar == this.zzf)) {
                    return -3;
                }
                zzH(zzafVar, zzjzVar);
                return -5;
            }
            zzhdVar.zzc(4);
            zzhdVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzaf zzafVar2 = ((zzvu) this.zzc.zza(this.zzo + this.zzq)).zza;
        if (!z10 && zzafVar2 == this.zzf) {
            int zzB = zzB(this.zzq);
            if (!zzL(zzB)) {
                zzhdVar.zzd = true;
                return -3;
            }
            zzhdVar.zzc(this.zzk[zzB]);
            if (this.zzq == this.zzn - 1 && (z11 || this.zzu)) {
                zzhdVar.zza(536870912);
            }
            zzhdVar.zze = this.zzl[zzB];
            zzvsVar.zza = this.zzj[zzB];
            zzvsVar.zzb = this.zzi[zzB];
            zzvsVar.zzc = this.zzm[zzB];
            return -4;
        }
        zzH(zzafVar2, zzjzVar);
        return -5;
    }

    private final synchronized long zzD(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzn;
        if (i11 != 0) {
            long[] jArr = this.zzl;
            int i12 = this.zzp;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.zzq) != i11) {
                    i11 = i10 + 1;
                }
                int zzA = zzA(i12, i11, j10, false);
                if (zzA != -1) {
                    return zzF(zzA);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzE() {
        int i10 = this.zzn;
        if (i10 == 0) {
            return -1L;
        }
        return zzF(i10);
    }

    private final long zzF(int i10) {
        int i11;
        long j10 = this.zzs;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzB = zzB(i10 - 1);
            for (int i12 = 0; i12 < i10; i12++) {
                j11 = Math.max(j11, this.zzl[zzB]);
                if ((this.zzk[zzB] & 1) != 0) {
                    break;
                }
                zzB--;
                if (zzB == -1) {
                    zzB = this.zzg - 1;
                }
            }
        }
        this.zzs = Math.max(j10, j11);
        this.zzn -= i10;
        int i13 = this.zzo + i10;
        this.zzo = i13;
        int i14 = this.zzp + i10;
        this.zzp = i14;
        int i15 = this.zzg;
        if (i14 >= i15) {
            this.zzp = i14 - i15;
        }
        int i16 = this.zzq - i10;
        this.zzq = i16;
        if (i16 < 0) {
            this.zzq = 0;
        }
        this.zzc.zze(i13);
        if (this.zzn == 0) {
            int i17 = this.zzp;
            if (i17 == 0) {
                i17 = this.zzg;
            }
            return this.zzi[i17 - 1] + this.zzj[i11];
        }
        return this.zzi[this.zzp];
    }

    private final synchronized void zzG(long j10, int i10, long j11, int i11, zzado zzadoVar) {
        boolean z10;
        int zzB;
        boolean z11;
        int i12 = this.zzn;
        if (i12 > 0) {
            if (this.zzi[zzB(i12 - 1)] + this.zzj[zzB] <= j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdi.zzd(z11);
        }
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzu = z10;
        this.zzt = Math.max(this.zzt, j10);
        int zzB2 = zzB(this.zzn);
        this.zzl[zzB2] = j10;
        this.zzi[zzB2] = j11;
        this.zzj[zzB2] = i11;
        this.zzk[zzB2] = i10;
        this.zzm[zzB2] = zzadoVar;
        this.zzh[zzB2] = 0;
        if (this.zzc.zzf() || !((zzvu) this.zzc.zzb()).zza.equals(this.zzx)) {
            zzaf zzafVar = this.zzx;
            zzafVar.getClass();
            this.zzc.zzc(this.zzo + this.zzn, new zzvu(zzafVar, zzrh.zza, null));
        }
        int i13 = this.zzn + 1;
        this.zzn = i13;
        int i14 = this.zzg;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzado[] zzadoVarArr = new zzado[i15];
            int i16 = this.zzp;
            int i17 = i14 - i16;
            System.arraycopy(this.zzi, i16, jArr2, 0, i17);
            System.arraycopy(this.zzl, this.zzp, jArr3, 0, i17);
            System.arraycopy(this.zzk, this.zzp, iArr, 0, i17);
            System.arraycopy(this.zzj, this.zzp, iArr2, 0, i17);
            System.arraycopy(this.zzm, this.zzp, zzadoVarArr, 0, i17);
            System.arraycopy(this.zzh, this.zzp, jArr, 0, i17);
            int i18 = this.zzp;
            System.arraycopy(this.zzi, 0, jArr2, i17, i18);
            System.arraycopy(this.zzl, 0, jArr3, i17, i18);
            System.arraycopy(this.zzk, 0, iArr, i17, i18);
            System.arraycopy(this.zzj, 0, iArr2, i17, i18);
            System.arraycopy(this.zzm, 0, zzadoVarArr, i17, i18);
            System.arraycopy(this.zzh, 0, jArr, i17, i18);
            this.zzi = jArr2;
            this.zzl = jArr3;
            this.zzk = iArr;
            this.zzj = iArr2;
            this.zzm = zzadoVarArr;
            this.zzh = jArr;
            this.zzp = 0;
            this.zzg = i15;
        }
    }

    private final void zzH(zzaf zzafVar, zzjz zzjzVar) {
        zzy zzyVar;
        zzaf zzafVar2 = this.zzf;
        zzrj zzrjVar = null;
        if (zzafVar2 == null) {
            zzyVar = null;
        } else {
            zzyVar = zzafVar2.zzp;
        }
        this.zzf = zzafVar;
        zzy zzyVar2 = zzafVar.zzp;
        zzjzVar.zza = zzafVar.zzc(this.zzd.zza(zzafVar));
        zzjzVar.zzb = this.zzA;
        if (zzafVar2 != null && zzet.zzG(zzyVar, zzyVar2)) {
            return;
        }
        if (zzafVar.zzp != null) {
            zzrjVar = new zzrj(new zzrb(new zzrl(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }
        this.zzA = zzrjVar;
        zzjzVar.zzb = zzrjVar;
    }

    private final void zzI() {
        if (this.zzA != null) {
            this.zzA = null;
            this.zzf = null;
        }
    }

    private final synchronized void zzJ() {
        this.zzq = 0;
        this.zza.zzg();
    }

    private final boolean zzK() {
        if (this.zzq != this.zzn) {
            return true;
        }
        return false;
    }

    private final boolean zzL(int i10) {
        if (this.zzA != null) {
            return (this.zzk[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzM(zzaf zzafVar) {
        this.zzw = false;
        if (zzet.zzG(zzafVar, this.zzx)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzvu) this.zzc.zzb()).zza.equals(zzafVar)) {
            this.zzx = ((zzvu) this.zzc.zzb()).zza;
        } else {
            this.zzx = zzafVar;
        }
        boolean z10 = this.zzy;
        zzaf zzafVar2 = this.zzx;
        this.zzy = z10 & zzbn.zzf(zzafVar2.zzm, zzafVar2.zzj);
        this.zzz = false;
        return true;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzo + this.zzq;
    }

    public final synchronized int zzc(long j10, boolean z10) {
        int i10 = this.zzq;
        int zzB = zzB(i10);
        if (zzK() && j10 >= this.zzl[zzB]) {
            if (j10 > this.zzt && z10) {
                return this.zzn - i10;
            }
            int zzA = zzA(zzB, this.zzn - i10, j10, true);
            if (zzA == -1) {
                return 0;
            }
            return zzA;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzo + this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(com.google.android.gms.internal.ads.zzjz r9, com.google.android.gms.internal.ads.zzhd r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzvs r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzC(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzvq r9 = r8.zza
            com.google.android.gms.internal.ads.zzvs r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzvq r9 = r8.zza
            com.google.android.gms.internal.ads.zzvs r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzq
            int r9 = r9 + r1
            r8.zzq = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.zze(com.google.android.gms.internal.ads.zzjz, com.google.android.gms.internal.ads.zzhd, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzp zzpVar, int i10, boolean z10) {
        return zzadn.zza(this, zzpVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzp zzpVar, int i10, boolean z10, int i11) {
        return this.zza.zza(zzpVar, i10, z10);
    }

    public final synchronized long zzh() {
        return this.zzt;
    }

    public final synchronized zzaf zzi() {
        if (this.zzw) {
            return null;
        }
        return this.zzx;
    }

    public final void zzj(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzD(j10, false, z11));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzl(zzaf zzafVar) {
        boolean zzM = zzM(zzafVar);
        zzvv zzvvVar = this.zze;
        if (zzvvVar != null && zzM) {
            zzvvVar.zzM(zzafVar);
        }
    }

    public final void zzm() {
        zzrj zzrjVar = this.zzA;
        if (zzrjVar == null) {
            return;
        }
        throw zzrjVar.zza();
    }

    public final void zzn() {
        zzk();
        zzI();
    }

    public final void zzo() {
        zzp(true);
        zzI();
    }

    public final void zzp(boolean z10) {
        this.zza.zzf();
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzv = true;
        this.zzr = Long.MIN_VALUE;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = false;
        this.zzc.zzd();
        if (z10) {
            this.zzx = null;
            this.zzw = true;
            this.zzy = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzq(zzek zzekVar, int i10) {
        zzadn.zzb(this, zzekVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzr(zzek zzekVar, int i10, int i11) {
        this.zza.zzh(zzekVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(long j10, int i10, int i11, int i12, zzado zzadoVar) {
        if (this.zzv) {
            if ((i10 & 1) != 0) {
                this.zzv = false;
            } else {
                return;
            }
        }
        if (this.zzy) {
            if (j10 >= this.zzr) {
                if ((i10 & 1) == 0) {
                    if (!this.zzz) {
                        zzea.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzx)));
                        this.zzz = true;
                    }
                    i10 |= 1;
                }
            } else {
                return;
            }
        }
        zzG(j10, i10, (this.zza.zzb() - i11) - i12, i11, zzadoVar);
    }

    public final void zzt(long j10) {
        this.zzr = j10;
    }

    public final void zzu(zzvv zzvvVar) {
        this.zze = zzvvVar;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzq + i10 <= this.zzn) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzdi.zzd(z10);
        this.zzq += i10;
    }

    public final synchronized boolean zzw() {
        return this.zzu;
    }

    public final synchronized boolean zzx(boolean z10) {
        boolean z11 = true;
        if (!zzK()) {
            if (!z10 && !this.zzu) {
                zzaf zzafVar = this.zzx;
                if (zzafVar != null) {
                    if (zzafVar == this.zzf) {
                        return false;
                    }
                } else {
                    z11 = false;
                }
            }
            return z11;
        } else if (((zzvu) this.zzc.zza(this.zzo + this.zzq)).zza != this.zzf) {
            return true;
        } else {
            return zzL(zzB(this.zzq));
        }
    }

    public final synchronized boolean zzy(int i10) {
        zzJ();
        int i11 = this.zzo;
        if (i10 >= i11 && i10 <= this.zzn + i11) {
            this.zzr = Long.MIN_VALUE;
            this.zzq = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzz(long j10, boolean z10) {
        int zzA;
        zzJ();
        int i10 = this.zzq;
        int zzB = zzB(i10);
        if (zzK() && j10 >= this.zzl[zzB]) {
            if (j10 > this.zzt) {
                if (z10) {
                    z10 = true;
                }
            }
            if (this.zzy) {
                zzA = this.zzn - i10;
                int i11 = 0;
                while (true) {
                    if (i11 < zzA) {
                        if (this.zzl[zzB] < j10) {
                            zzB++;
                            if (zzB == this.zzg) {
                                zzB = 0;
                            }
                            i11++;
                        } else {
                            zzA = i11;
                            break;
                        }
                    } else if (!z10) {
                        zzA = -1;
                    }
                }
            } else {
                zzA = zzA(zzB, this.zzn - i10, j10, true);
            }
            if (zzA != -1) {
                this.zzr = j10;
                this.zzq += zzA;
                return true;
            }
        }
        return false;
    }
}
