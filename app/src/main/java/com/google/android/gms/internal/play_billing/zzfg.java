package com.google.android.gms.internal.play_billing;

import androidx.activity.f;
import java.util.Arrays;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzfg {
    private static final zzfg zza = new zzfg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzfg(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzfg zzc() {
        return zza;
    }

    public static zzfg zze(zzfg zzfgVar, zzfg zzfgVar2) {
        int i10 = zzfgVar.zzb + zzfgVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzfgVar.zzc, i10);
        System.arraycopy(zzfgVar2.zzc, 0, copyOf, zzfgVar.zzb, zzfgVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzfgVar.zzd, i10);
        System.arraycopy(zzfgVar2.zzd, 0, copyOf2, zzfgVar.zzb, zzfgVar2.zzb);
        return new zzfg(i10, copyOf, copyOf2, true);
    }

    public static zzfg zzf() {
        return new zzfg(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        int i10 = this.zzb;
        if (i10 == zzfgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzfgVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzfgVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zzw;
        int zzx;
        int zzw2;
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12];
                int i14 = i13 >>> 3;
                int i15 = i13 & 7;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 5) {
                                    ((Integer) this.zzd[i12]).intValue();
                                    zzw2 = zzby.zzw(i14 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzdc.zza());
                                }
                            } else {
                                int zzw3 = zzby.zzw(i14 << 3);
                                zzw = zzw3 + zzw3;
                                zzx = ((zzfg) this.zzd[i12]).zza();
                            }
                        } else {
                            int zzw4 = zzby.zzw(i14 << 3);
                            int zzd = ((zzbq) this.zzd[i12]).zzd();
                            i11 = zzby.zzw(zzd) + zzd + zzw4 + i11;
                        }
                    } else {
                        ((Long) this.zzd[i12]).longValue();
                        zzw2 = zzby.zzw(i14 << 3) + 8;
                    }
                    i11 = zzw2 + i11;
                } else {
                    int i16 = i14 << 3;
                    long longValue = ((Long) this.zzd[i12]).longValue();
                    zzw = zzby.zzw(i16);
                    zzx = zzby.zzx(longValue);
                }
                i11 = zzx + zzw + i11;
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int zzw = zzby.zzw(8);
                int zzw2 = zzby.zzw(this.zzc[i12] >>> 3) + zzby.zzw(16);
                int zzw3 = zzby.zzw(24);
                int zzd = ((zzbq) this.zzd[i12]).zzd();
                i11 = f.g(zzw + zzw, zzw2, zzby.zzw(zzd) + zzd + zzw3, i11);
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final zzfg zzd(zzfg zzfgVar) {
        if (zzfgVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzfgVar.zzb;
        zzm(i10);
        System.arraycopy(zzfgVar.zzc, 0, this.zzc, this.zzb, zzfgVar.zzb);
        System.arraycopy(zzfgVar.zzd, 0, this.zzd, this.zzb, zzfgVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzee.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzfx zzfxVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzfxVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzfx zzfxVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    zzfxVar.zzk(i13, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzdc.zza());
                                }
                            } else {
                                zzfxVar.zzF(i13);
                                ((zzfg) obj).zzl(zzfxVar);
                                zzfxVar.zzh(i13);
                            }
                        } else {
                            zzfxVar.zzd(i13, (zzbq) obj);
                        }
                    } else {
                        zzfxVar.zzm(i13, ((Long) obj).longValue());
                    }
                } else {
                    zzfxVar.zzt(i13, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzfg() {
        this(0, new int[8], new Object[8], true);
    }
}
