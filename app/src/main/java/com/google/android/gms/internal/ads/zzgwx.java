package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgwx implements zzgzw {
    private final zzgww zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgwx(zzgww zzgwwVar) {
        zzgyl.zzc(zzgwwVar, "input");
        this.zza = zzgwwVar;
        zzgwwVar.zzc = this;
    }

    private final void zzO(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhaeVar.zzh(obj, this, zzgxiVar);
            if (this.zzb == this.zzc) {
                return;
            }
            throw zzgyn.zzg();
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzP(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) {
        zzgww zzgwwVar;
        zzgww zzgwwVar2 = this.zza;
        int zzm = zzgwwVar2.zzm();
        if (zzgwwVar2.zza < zzgwwVar2.zzb) {
            int zzd = this.zza.zzd(zzm);
            this.zza.zza++;
            zzhaeVar.zzh(obj, this, zzgxiVar);
            this.zza.zzy(0);
            zzgwwVar.zza--;
            this.zza.zzz(zzd);
            return;
        }
        throw new zzgyn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzQ(int i10) {
        if (this.zza.zzc() == i10) {
            return;
        }
        throw zzgyn.zzi();
    }

    private final void zzR(int i10) {
        if ((this.zzb & 7) == i10) {
            return;
        }
        throw zzgyn.zza();
    }

    private static final void zzS(int i10) {
        if ((i10 & 3) == 0) {
            return;
        }
        throw zzgyn.zzg();
    }

    private static final void zzT(int i10) {
        if ((i10 & 7) == 0) {
            return;
        }
        throw zzgyn.zzg();
    }

    public static zzgwx zzq(zzgww zzgwwVar) {
        zzgwx zzgwxVar = zzgwwVar.zzc;
        if (zzgwxVar != null) {
            return zzgwxVar;
        }
        return new zzgwx(zzgwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzA(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = this.zza.zzc() + zzm;
                    do {
                        zzgyyVar.zzg(this.zza.zzn());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgyyVar.zzg(this.zza.zzn());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = this.zza.zzc() + zzm2;
                    do {
                        list.add(Long.valueOf(this.zza.zzn()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzB(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxp) {
            zzgxp zzgxpVar = (zzgxp) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 == 5) {
                    do {
                        zzgxpVar.zzh(this.zza.zzb());
                        if (!this.zza.zzA()) {
                            i10 = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (i10 == this.zzb);
                } else {
                    throw zzgyn.zza();
                }
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxpVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 == 5) {
                    do {
                        list.add(Float.valueOf(this.zza.zzb()));
                        if (!this.zza.zzA()) {
                            zzl = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (zzl == this.zzb);
                    i10 = zzl;
                } else {
                    throw zzgyn.zza();
                }
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    @Deprecated
    public final void zzC(List list, zzhae zzhaeVar, zzgxi zzgxiVar) {
        int zzl;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                Object zze = zzhaeVar.zze();
                zzO(zze, zzhaeVar, zzgxiVar);
                zzhaeVar.zzf(zze);
                list.add(zze);
                if (!this.zza.zzA() && this.zzd == 0) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == i10);
            this.zzd = zzl;
            return;
        }
        throw zzgyn.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzD(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgxzVar.zzi(this.zza.zzg());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgxzVar.zzi(this.zza.zzg());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzg()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzE(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgyyVar.zzg(this.zza.zzo());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgyyVar.zzg(this.zza.zzo());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzo()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzF(List list, zzhae zzhaeVar, zzgxi zzgxiVar) {
        int zzl;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                Object zze = zzhaeVar.zze();
                zzP(zze, zzhaeVar, zzgxiVar);
                zzhaeVar.zzf(zze);
                list.add(zze);
                if (!this.zza.zzA() && this.zzd == 0) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == i10);
            this.zzd = zzl;
            return;
        }
        throw zzgyn.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzG(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 == 5) {
                    do {
                        zzgxzVar.zzi(this.zza.zzj());
                        if (!this.zza.zzA()) {
                            i10 = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (i10 == this.zzb);
                } else {
                    throw zzgyn.zza();
                }
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxzVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 == 5) {
                    do {
                        list.add(Integer.valueOf(this.zza.zzj()));
                        if (!this.zza.zzA()) {
                            zzl = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (zzl == this.zzb);
                    i10 = zzl;
                } else {
                    throw zzgyn.zza();
                }
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzH(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = this.zza.zzc() + zzm;
                    do {
                        zzgyyVar.zzg(this.zza.zzs());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgyyVar.zzg(this.zza.zzs());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = this.zza.zzc() + zzm2;
                    do {
                        list.add(Long.valueOf(this.zza.zzs()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzI(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgxzVar.zzi(this.zza.zzk());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgxzVar.zzi(this.zza.zzk());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzk()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzJ(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgyyVar.zzg(this.zza.zzt());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgyyVar.zzg(this.zza.zzt());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzt()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    public final void zzK(List list, boolean z10) {
        String zzr;
        int zzl;
        int i10;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzgyv) && !z10) {
                zzgyv zzgyvVar = (zzgyv) list;
                do {
                    zzp();
                    zzgyvVar.zzb();
                    if (!this.zza.zzA()) {
                        i10 = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                do {
                    if (z10) {
                        zzr = zzs();
                    } else {
                        zzr = zzr();
                    }
                    list.add(zzr);
                    if (this.zza.zzA()) {
                        return;
                    }
                    zzl = this.zza.zzl();
                } while (zzl == this.zzb);
                i10 = zzl;
            }
            this.zzd = i10;
            return;
        }
        throw zzgyn.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzL(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgxzVar.zzi(this.zza.zzm());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgxzVar.zzi(this.zza.zzm());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzm()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzM(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgyyVar.zzg(this.zza.zzu());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgyyVar.zzg(this.zza.zzu());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzu()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final boolean zzN() {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final double zza() {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final float zzb() {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzl();
            this.zzb = i10;
        }
        if (i10 != 0 && i10 != this.zzc) {
            return i10 >>> 3;
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zze() {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzf() {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzg() {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzh() {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzi() {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzj() {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzk() {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzl() {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzm() {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzn() {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzo() {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final zzgwm zzp() {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final String zzr() {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final String zzs() {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzt(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) {
        zzR(3);
        zzO(obj, zzhaeVar, zzgxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzu(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) {
        zzR(2);
        zzP(obj, zzhaeVar, zzgxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzv(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgwc) {
            zzgwc zzgwcVar = (zzgwc) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgwcVar.zzg(this.zza.zzB());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgwcVar.zzg(this.zza.zzB());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Boolean.valueOf(this.zza.zzB()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzw(List list) {
        int zzl;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            this.zzd = zzl;
            return;
        }
        throw zzgyn.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzx(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxf) {
            zzgxf zzgxfVar = (zzgxf) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = this.zza.zzc() + zzm;
                    do {
                        zzgxfVar.zzh(this.zza.zza());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgxfVar.zzh(this.zza.zza());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = this.zza.zzc() + zzm2;
                    do {
                        list.add(Double.valueOf(this.zza.zza()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzy(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgww zzgwwVar = this.zza;
                    int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                    do {
                        zzgxzVar.zzi(this.zza.zze());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                zzgxzVar.zzi(this.zza.zze());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgww zzgwwVar2 = this.zza;
                    int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zze()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw zzgyn.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzz(List list) {
        int zzl;
        int i10;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 == 5) {
                    do {
                        zzgxzVar.zzi(this.zza.zzf());
                        if (!this.zza.zzA()) {
                            i10 = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (i10 == this.zzb);
                } else {
                    throw zzgyn.zza();
                }
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxzVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 == 5) {
                    do {
                        list.add(Integer.valueOf(this.zza.zzf()));
                        if (!this.zza.zzA()) {
                            zzl = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (zzl == this.zzb);
                    i10 = zzl;
                } else {
                    throw zzgyn.zza();
                }
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i10;
    }
}
