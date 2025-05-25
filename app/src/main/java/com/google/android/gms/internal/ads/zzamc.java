package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamc implements zzanr {
    private final List zza;

    public zzamc(int i10, List list) {
        this.zza = list;
    }

    private final zzani zzb(zzanq zzanqVar) {
        return new zzani(zzd(zzanqVar));
    }

    private final zzanv zzc(zzanq zzanqVar) {
        return new zzanv(zzd(zzanqVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzanq zzanqVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        zzek zzekVar = new zzek(zzanqVar.zze);
        ArrayList arrayList = this.zza;
        while (zzekVar.zzb() > 0) {
            int zzm = zzekVar.zzm();
            int zzd = zzekVar.zzd() + zzekVar.zzm();
            if (zzm == 134) {
                arrayList = new ArrayList();
                int zzm2 = zzekVar.zzm() & 31;
                for (int i11 = 0; i11 < zzm2; i11++) {
                    String zzA = zzekVar.zzA(3, zzfuj.zzc);
                    int zzm3 = zzekVar.zzm();
                    if ((zzm3 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte zzm4 = (byte) zzekVar.zzm();
                    zzekVar.zzL(1);
                    if (z10) {
                        list = Collections.singletonList((zzm4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzad zzadVar = new zzad();
                    zzadVar.zzX(str);
                    zzadVar.zzO(zzA);
                    zzadVar.zzw(i10);
                    zzadVar.zzL(list);
                    arrayList.add(zzadVar.zzad());
                }
            }
            zzekVar.zzK(zzd);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final zzant zza(int i10, zzanq zzanqVar) {
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 27) {
                        if (i10 != 36) {
                            if (i10 != 45) {
                                if (i10 != 89) {
                                    if (i10 != 172) {
                                        if (i10 != 257) {
                                            if (i10 != 128) {
                                                if (i10 != 129) {
                                                    if (i10 != 138) {
                                                        if (i10 != 139) {
                                                            switch (i10) {
                                                                case 15:
                                                                    return new zzamz(new zzamb(false, zzanqVar.zzb, zzanqVar.zza()));
                                                                case 16:
                                                                    return new zzamz(new zzamk(zzc(zzanqVar)));
                                                                case 17:
                                                                    return new zzamz(new zzamq(zzanqVar.zzb, zzanqVar.zza()));
                                                                default:
                                                                    switch (i10) {
                                                                        case ShapeTypes.FLOW_CHART_INPUT_OUTPUT /* 134 */:
                                                                            return new zzanh(new zzamy("application/x-scte35"));
                                                                        case ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS /* 135 */:
                                                                            break;
                                                                        case ShapeTypes.FLOW_CHART_INTERNAL_STORAGE /* 136 */:
                                                                            break;
                                                                        default:
                                                                            return null;
                                                                    }
                                                            }
                                                        } else {
                                                            return new zzamz(new zzamd(zzanqVar.zzb, zzanqVar.zza(), 5408));
                                                        }
                                                    }
                                                    return new zzamz(new zzamd(zzanqVar.zzb, zzanqVar.zza(), 4096));
                                                }
                                                return new zzamz(new zzalx(zzanqVar.zzb, zzanqVar.zza()));
                                            }
                                        } else {
                                            return new zzanh(new zzamy("application/vnd.dvb.ait"));
                                        }
                                    } else {
                                        return new zzamz(new zzalz(zzanqVar.zzb, zzanqVar.zza()));
                                    }
                                } else {
                                    return new zzamz(new zzame(zzanqVar.zzd));
                                }
                            } else {
                                return new zzamz(new zzams());
                            }
                        } else {
                            return new zzamz(new zzamo(zzb(zzanqVar)));
                        }
                    } else {
                        return new zzamz(new zzamm(zzb(zzanqVar), false, false));
                    }
                } else {
                    return new zzamz(new zzamp());
                }
            } else {
                return new zzamz(new zzamr(zzanqVar.zzb, zzanqVar.zza()));
            }
        }
        return new zzamz(new zzamh(zzc(zzanqVar)));
    }

    public zzamc() {
        this(0);
    }

    public zzamc(int i10) {
        this.zza = zzfxr.zzm();
    }
}
