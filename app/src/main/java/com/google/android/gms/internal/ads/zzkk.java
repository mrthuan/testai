package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzkk {
    private final zzln zzc;
    private final zzdt zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzkh zzh;
    private zzkh zzi;
    private zzkh zzj;
    private int zzk;
    private Object zzl;
    private long zzm;
    private zzig zzn;
    private final zzjp zzp;
    private final zzca zza = new zzca();
    private final zzcb zzb = new zzcb();
    private List zzo = new ArrayList();

    public zzkk(zzln zzlnVar, zzdt zzdtVar, zzjp zzjpVar, zzig zzigVar) {
        this.zzc = zzlnVar;
        this.zzd = zzdtVar;
        this.zzp = zzjpVar;
        this.zzn = zzigVar;
    }

    private final zzki zzA(zzcc zzccVar, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        zzccVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j16);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(zzc);
        }
        zzui zzuiVar = new zzui(obj, j12, zzc);
        boolean zzG = zzG(zzuiVar);
        boolean zzE = zzE(zzccVar, zzuiVar);
        boolean zzD = zzD(zzccVar, zzuiVar, zzG);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j14 = 0;
            j15 = 0;
        } else {
            j14 = j13;
            j15 = this.zza.zzd;
        }
        if (j15 != -9223372036854775807L && j16 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        }
        return new zzki(zzuiVar, j16, j11, j14, j15, false, zzG, zzE, zzD);
    }

    private static zzui zzB(zzcc zzccVar, Object obj, long j10, long j11, zzcb zzcbVar, zzca zzcaVar) {
        zzccVar.zzn(obj, zzcaVar);
        zzccVar.zze(zzcaVar.zzc, zzcbVar, 0L);
        zzccVar.zza(obj);
        zzcaVar.zzb();
        zzccVar.zzn(obj, zzcaVar);
        int zzd = zzcaVar.zzd(j10);
        if (zzd == -1) {
            return new zzui(obj, j11, zzcaVar.zzc(j10));
        }
        return new zzui(obj, zzd, zzcaVar.zze(zzd), j11);
    }

    private final void zzC() {
        final zzui zzuiVar;
        final zzfxo zzfxoVar = new zzfxo();
        for (zzkh zzkhVar = this.zzh; zzkhVar != null; zzkhVar = zzkhVar.zzg()) {
            zzfxoVar.zzf(zzkhVar.zzf.zza);
        }
        zzkh zzkhVar2 = this.zzi;
        if (zzkhVar2 == null) {
            zzuiVar = null;
        } else {
            zzuiVar = zzkhVar2.zzf.zza;
        }
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                zzkk.this.zzk(zzfxoVar, zzuiVar);
            }
        });
    }

    private final boolean zzD(zzcc zzccVar, zzui zzuiVar, boolean z10) {
        int zza = zzccVar.zza(zzuiVar.zza);
        if (zzccVar.zze(zzccVar.zzd(zza, this.zza, false).zzc, this.zzb, 0L).zzi || zzccVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z10) {
            return false;
        }
        return true;
    }

    private final boolean zzE(zzcc zzccVar, zzui zzuiVar) {
        if (!zzG(zzuiVar)) {
            return false;
        }
        int i10 = zzccVar.zzn(zzuiVar.zza, this.zza).zzc;
        if (zzccVar.zze(i10, this.zzb, 0L).zzo != zzccVar.zza(zzuiVar.zza)) {
            return false;
        }
        return true;
    }

    private final boolean zzF(zzcc zzccVar) {
        zzkh zzkhVar = this.zzh;
        if (zzkhVar == null) {
            return true;
        }
        int zza = zzccVar.zza(zzkhVar.zzb);
        while (true) {
            zza = zzccVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkhVar.getClass();
                if (zzkhVar.zzg() == null || zzkhVar.zzf.zzg) {
                    break;
                }
                zzkhVar = zzkhVar.zzg();
            }
            zzkh zzg = zzkhVar.zzg();
            if (zza == -1 || zzg == null || zzccVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkhVar = zzg;
        }
        boolean zzq = zzq(zzkhVar);
        zzkhVar.zzf = zzh(zzccVar, zzkhVar.zzf);
        if (!zzq) {
            return true;
        }
        return false;
    }

    private static final boolean zzG(zzui zzuiVar) {
        if (!zzuiVar.zzb() && zzuiVar.zze == -1) {
            return true;
        }
        return false;
    }

    public static boolean zzo(long j10, long j11) {
        if (j10 != -9223372036854775807L && j10 != j11) {
            return false;
        }
        return true;
    }

    private final long zzv(zzcc zzccVar, Object obj, int i10) {
        zzccVar.zzn(obj, this.zza);
        this.zza.zzi(i10);
        this.zza.zzk(i10);
        return 0L;
    }

    private final long zzw(Object obj) {
        for (int i10 = 0; i10 < this.zzo.size(); i10++) {
            zzkh zzkhVar = (zzkh) this.zzo.get(i10);
            if (zzkhVar.zzb.equals(obj)) {
                return zzkhVar.zzf.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzki zzx(zzcc zzccVar, zzkh zzkhVar, long j10) {
        long j11;
        zzki zzkiVar = zzkhVar.zzf;
        long zze = (zzkhVar.zze() + zzkiVar.zze) - j10;
        if (zzkiVar.zzg) {
            long j12 = 0;
            int zzi = zzccVar.zzi(zzccVar.zza(zzkiVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i10 = zzccVar.zzd(zzi, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                obj.getClass();
                long j13 = zzkiVar.zza.zzd;
                if (zzccVar.zze(i10, this.zzb, 0L).zzn == zzi) {
                    Pair zzm = zzccVar.zzm(this.zzb, this.zza, i10, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzkh zzg = zzkhVar.zzg();
                        if (zzg != null && zzg.zzb.equals(obj)) {
                            j13 = zzg.zzf.zza.zzd;
                        } else {
                            j13 = zzw(obj);
                            if (j13 == -1) {
                                j13 = this.zze;
                                this.zze = 1 + j13;
                            }
                        }
                        j11 = longValue;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    j11 = 0;
                }
                zzui zzB = zzB(zzccVar, obj, j11, j13, this.zzb, this.zza);
                if (j12 != -9223372036854775807L && zzkiVar.zzc != -9223372036854775807L) {
                    zzccVar.zzn(zzkiVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzy(zzccVar, zzB, j12, j11);
            }
        } else {
            zzui zzuiVar = zzkiVar.zza;
            zzccVar.zzn(zzuiVar.zza, this.zza);
            if (zzuiVar.zzb()) {
                int i11 = zzuiVar.zzb;
                if (this.zza.zza(i11) != -1) {
                    int zzf = this.zza.zzf(i11, zzuiVar.zzc);
                    if (zzf < 0) {
                        return zzz(zzccVar, zzuiVar.zza, i11, zzf, zzkiVar.zzc, zzuiVar.zzd);
                    }
                    long j14 = zzkiVar.zzc;
                    if (j14 == -9223372036854775807L) {
                        zzcb zzcbVar = this.zzb;
                        zzca zzcaVar = this.zza;
                        Pair zzm2 = zzccVar.zzm(zzcbVar, zzcaVar, zzcaVar.zzc, -9223372036854775807L, Math.max(0L, zze));
                        if (zzm2 != null) {
                            j14 = ((Long) zzm2.second).longValue();
                        }
                    }
                    zzv(zzccVar, zzuiVar.zza, zzuiVar.zzb);
                    return zzA(zzccVar, zzuiVar.zza, Math.max(0L, j14), zzkiVar.zzc, zzuiVar.zzd);
                }
            } else {
                int i12 = zzuiVar.zze;
                if (i12 != -1) {
                    this.zza.zzm(i12);
                }
                zzca zzcaVar2 = this.zza;
                int i13 = zzuiVar.zze;
                int zze2 = zzcaVar2.zze(i13);
                zzcaVar2.zzn(i13);
                if (zze2 != this.zza.zza(zzuiVar.zze)) {
                    return zzz(zzccVar, zzuiVar.zza, zzuiVar.zze, zze2, zzkiVar.zze, zzuiVar.zzd);
                }
                zzv(zzccVar, zzuiVar.zza, zzuiVar.zze);
                return zzA(zzccVar, zzuiVar.zza, 0L, zzkiVar.zze, zzuiVar.zzd);
            }
        }
        return null;
    }

    private final zzki zzy(zzcc zzccVar, zzui zzuiVar, long j10, long j11) {
        zzccVar.zzn(zzuiVar.zza, this.zza);
        if (zzuiVar.zzb()) {
            return zzz(zzccVar, zzuiVar.zza, zzuiVar.zzb, zzuiVar.zzc, j10, zzuiVar.zzd);
        }
        return zzA(zzccVar, zzuiVar.zza, j11, j10, zzuiVar.zzd);
    }

    private final zzki zzz(zzcc zzccVar, Object obj, int i10, int i11, long j10, long j11) {
        long j12;
        zzui zzuiVar = new zzui(obj, i10, i11, j11);
        long zzh = zzccVar.zzn(zzuiVar.zza, this.zza).zzh(zzuiVar.zzb, zzuiVar.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzj();
        }
        this.zza.zzn(zzuiVar.zzb);
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j12 = Math.max(0L, (-1) + zzh);
        } else {
            j12 = 0;
        }
        return new zzki(zzuiVar, j12, j10, -9223372036854775807L, zzh, false, false, false, false);
    }

    public final zzkh zza() {
        zzkh zzkhVar = this.zzh;
        if (zzkhVar == null) {
            return null;
        }
        if (zzkhVar == this.zzi) {
            this.zzi = zzkhVar.zzg();
        }
        zzkhVar.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzkh zzkhVar2 = this.zzh;
            this.zzl = zzkhVar2.zzb;
            this.zzm = zzkhVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzC();
        return this.zzh;
    }

    public final zzkh zzb() {
        zzkh zzkhVar = this.zzi;
        zzdi.zzb(zzkhVar);
        this.zzi = zzkhVar.zzg();
        zzC();
        zzkh zzkhVar2 = this.zzi;
        zzdi.zzb(zzkhVar2);
        return zzkhVar2;
    }

    public final zzkh zzc(zzki zzkiVar) {
        long zze;
        zzkh zzkhVar;
        zzkh zzkhVar2 = this.zzj;
        if (zzkhVar2 == null) {
            zze = 1000000000000L;
        } else {
            zze = (zzkhVar2.zze() + zzkhVar2.zzf.zze) - zzkiVar.zzb;
        }
        int i10 = 0;
        while (true) {
            if (i10 < this.zzo.size()) {
                zzki zzkiVar2 = ((zzkh) this.zzo.get(i10)).zzf;
                if (zzo(zzkiVar2.zze, zzkiVar.zze) && zzkiVar2.zzb == zzkiVar.zzb && zzkiVar2.zza.equals(zzkiVar.zza)) {
                    zzkhVar = (zzkh) this.zzo.remove(i10);
                    break;
                }
                i10++;
            } else {
                zzkhVar = null;
                break;
            }
        }
        if (zzkhVar == null) {
            zzkhVar = zzjx.zzd(this.zzp.zza, zzkiVar, zze);
        } else {
            zzkhVar.zzf = zzkiVar;
            zzkhVar.zzp(zze);
        }
        zzkh zzkhVar3 = this.zzj;
        if (zzkhVar3 != null) {
            zzkhVar3.zzo(zzkhVar);
        } else {
            this.zzh = zzkhVar;
            this.zzi = zzkhVar;
        }
        this.zzl = null;
        this.zzj = zzkhVar;
        this.zzk++;
        zzC();
        return zzkhVar;
    }

    public final zzkh zzd() {
        return this.zzj;
    }

    public final zzkh zze() {
        return this.zzh;
    }

    public final zzkh zzf() {
        return this.zzi;
    }

    public final zzki zzg(long j10, zzkx zzkxVar) {
        zzkh zzkhVar = this.zzj;
        if (zzkhVar == null) {
            return zzy(zzkxVar.zza, zzkxVar.zzb, zzkxVar.zzc, zzkxVar.zzr);
        }
        return zzx(zzkxVar.zza, zzkhVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzki zzh(com.google.android.gms.internal.ads.zzcc r19, com.google.android.gms.internal.ads.zzki r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzui r3 = r2.zza
            boolean r12 = zzG(r3)
            boolean r13 = r0.zzE(r1, r3)
            boolean r14 = r0.zzD(r1, r3, r12)
            com.google.android.gms.internal.ads.zzui r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzca r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzca r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            long r5 = r1.zzd
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzca r4 = r0.zza
            r4.zzn(r1)
        L6e:
            com.google.android.gms.internal.ads.zzki r15 = new com.google.android.gms.internal.ads.zzki
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkk.zzh(com.google.android.gms.internal.ads.zzcc, com.google.android.gms.internal.ads.zzki):com.google.android.gms.internal.ads.zzki");
    }

    public final zzui zzi(zzcc zzccVar, Object obj, long j10) {
        long zzw;
        int zza;
        int i10 = zzccVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 != null && (zza = zzccVar.zza(obj2)) != -1 && zzccVar.zzd(zza, this.zza, false).zzc == i10) {
            zzw = this.zzm;
        } else {
            zzkh zzkhVar = this.zzh;
            while (true) {
                if (zzkhVar != null) {
                    if (zzkhVar.zzb.equals(obj)) {
                        zzw = zzkhVar.zzf.zza.zzd;
                        break;
                    }
                    zzkhVar = zzkhVar.zzg();
                } else {
                    zzkh zzkhVar2 = this.zzh;
                    while (true) {
                        if (zzkhVar2 != null) {
                            int zza2 = zzccVar.zza(zzkhVar2.zzb);
                            if (zza2 != -1 && zzccVar.zzd(zza2, this.zza, false).zzc == i10) {
                                zzw = zzkhVar2.zzf.zza.zzd;
                                break;
                            }
                            zzkhVar2 = zzkhVar2.zzg();
                        } else {
                            zzw = zzw(obj);
                            if (zzw == -1) {
                                zzw = this.zze;
                                this.zze = 1 + zzw;
                                if (this.zzh == null) {
                                    this.zzl = obj;
                                    this.zzm = zzw;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j11 = zzw;
        zzccVar.zzn(obj, this.zza);
        zzccVar.zze(this.zza.zzc, this.zzb, 0L);
        int zza3 = zzccVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcb zzcbVar = this.zzb;
            if (zza3 >= zzcbVar.zzn) {
                zzccVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzca zzcaVar = this.zza;
                if (zzcaVar.zzd(zzcaVar.zzd) != -1) {
                    obj3 = this.zza.zzb;
                    obj3.getClass();
                }
                zza3--;
            } else {
                return zzB(zzccVar, obj3, j10, j11, zzcbVar, this.zza);
            }
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzkh zzkhVar = this.zzh;
        zzdi.zzb(zzkhVar);
        this.zzl = zzkhVar.zzb;
        this.zzm = zzkhVar.zzf.zza.zzd;
        while (zzkhVar != null) {
            zzkhVar.zzn();
            zzkhVar = zzkhVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzC();
    }

    public final /* synthetic */ void zzk(zzfxo zzfxoVar, zzui zzuiVar) {
        this.zzc.zzS(zzfxoVar.zzi(), zzuiVar);
    }

    public final void zzl(long j10) {
        zzkh zzkhVar = this.zzj;
        if (zzkhVar != null) {
            zzkhVar.zzm(j10);
        }
    }

    public final void zzm() {
        if (!this.zzo.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.zzo.size(); i10++) {
                ((zzkh) this.zzo.get(i10)).zzn();
            }
            this.zzo = arrayList;
        }
    }

    public final void zzn(zzcc zzccVar, zzig zzigVar) {
        this.zzn = zzigVar;
        long j10 = zzigVar.zzb;
        zzm();
    }

    public final boolean zzp(zzug zzugVar) {
        zzkh zzkhVar = this.zzj;
        if (zzkhVar != null && zzkhVar.zza == zzugVar) {
            return true;
        }
        return false;
    }

    public final boolean zzq(zzkh zzkhVar) {
        zzdi.zzb(zzkhVar);
        boolean z10 = false;
        if (zzkhVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkhVar;
        while (zzkhVar.zzg() != null) {
            zzkhVar = zzkhVar.zzg();
            zzkhVar.getClass();
            if (zzkhVar == this.zzi) {
                this.zzi = this.zzh;
                z10 = true;
            }
            zzkhVar.zzn();
            this.zzk--;
        }
        zzkh zzkhVar2 = this.zzj;
        zzkhVar2.getClass();
        zzkhVar2.zzo(null);
        zzC();
        return z10;
    }

    public final boolean zzr() {
        zzkh zzkhVar = this.zzj;
        if (zzkhVar == null) {
            return true;
        }
        if (zzkhVar.zzf.zzi || !zzkhVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        if (this.zzk < 100) {
            return true;
        }
        return false;
    }

    public final boolean zzs(zzcc zzccVar, long j10, long j11) {
        zzki zzkiVar;
        long zze;
        boolean z10;
        zzkh zzkhVar = null;
        for (zzkh zzkhVar2 = this.zzh; zzkhVar2 != null; zzkhVar2 = zzkhVar2.zzg()) {
            zzki zzkiVar2 = zzkhVar2.zzf;
            if (zzkhVar == null) {
                zzkiVar = zzh(zzccVar, zzkiVar2);
            } else {
                zzki zzx = zzx(zzccVar, zzkhVar, j10);
                if (zzx == null) {
                    if (!zzq(zzkhVar)) {
                        return true;
                    }
                    return false;
                } else if (zzkiVar2.zzb == zzx.zzb && zzkiVar2.zza.equals(zzx.zza)) {
                    zzkiVar = zzx;
                } else if (!zzq(zzkhVar)) {
                    return true;
                } else {
                    return false;
                }
            }
            zzkhVar2.zzf = zzkiVar.zza(zzkiVar2.zzc);
            if (!zzo(zzkiVar2.zze, zzkiVar.zze)) {
                zzkhVar2.zzq();
                long j12 = zzkiVar.zze;
                if (j12 == -9223372036854775807L) {
                    zze = Long.MAX_VALUE;
                } else {
                    zze = j12 + zzkhVar2.zze();
                }
                if (zzkhVar2 == this.zzi) {
                    boolean z11 = zzkhVar2.zzf.zzf;
                    if (j11 == Long.MIN_VALUE || j11 >= zze) {
                        z10 = true;
                        if (zzq(zzkhVar2) && !z10) {
                            return true;
                        }
                        return false;
                    }
                }
                z10 = false;
                if (zzq(zzkhVar2)) {
                }
                return false;
            }
            zzkhVar = zzkhVar2;
        }
        return true;
    }

    public final boolean zzt(zzcc zzccVar, int i10) {
        this.zzf = i10;
        return zzF(zzccVar);
    }

    public final boolean zzu(zzcc zzccVar, boolean z10) {
        this.zzg = z10;
        return zzF(zzccVar);
    }
}
