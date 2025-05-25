package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.h;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzbh extends zzaw {
    public zzbh() {
        this.zza.add(zzbl.FOR_IN);
        this.zza.add(zzbl.FOR_IN_CONST);
        this.zza.add(zzbl.FOR_IN_LET);
        this.zza.add(zzbl.FOR_LET);
        this.zza.add(zzbl.FOR_OF);
        this.zza.add(zzbl.FOR_OF_CONST);
        this.zza.add(zzbl.FOR_OF_LET);
        this.zza.add(zzbl.WHILE);
    }

    private static zzap zzc(zzbf zzbfVar, Iterator it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzc = zzbfVar.zza((zzap) it.next()).zzc((zzae) zzapVar);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static zzap zze(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zzc(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    if (h.d(zzbl.FOR_IN, 3, list, 0) instanceof zzat) {
                        return zzd(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    if (h.d(zzbl.FOR_IN_CONST, 3, list, 0) instanceof zzat) {
                        return zzd(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    if (h.d(zzbl.FOR_IN_LET, 3, list, 0) instanceof zzat) {
                        return zzd(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    zzap zzb = zzgVar.zzb((zzap) h.d(zzbl.FOR_LET, 4, list, 0));
                    if (zzb instanceof zzae) {
                        zzae zzaeVar = (zzae) zzb;
                        zzap zzapVar = (zzap) list.get(1);
                        zzap zzapVar2 = (zzap) list.get(2);
                        zzap zzb2 = zzgVar.zzb((zzap) list.get(3));
                        zzg zza = zzgVar.zza();
                        for (int i10 = 0; i10 < zzaeVar.zzc(); i10++) {
                            String zzi = zzaeVar.zze(i10).zzi();
                            zza.zzg(zzi, zzgVar.zzd(zzi));
                        }
                        while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                            zzap zzc = zzgVar.zzc((zzae) zzb2);
                            if (zzc instanceof zzag) {
                                zzag zzagVar = (zzag) zzc;
                                if ("break".equals(zzagVar.zzc())) {
                                    return zzap.zzf;
                                }
                                if ("return".equals(zzagVar.zzc())) {
                                    return zzagVar;
                                }
                            }
                            zzg zza2 = zzgVar.zza();
                            for (int i11 = 0; i11 < zzaeVar.zzc(); i11++) {
                                String zzi2 = zzaeVar.zze(i11).zzi();
                                zza2.zzg(zzi2, zza.zzd(zzi2));
                            }
                            zza2.zzb(zzapVar2);
                            zza = zza2;
                        }
                        return zzap.zzf;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    if (h.d(zzbl.FOR_OF, 3, list, 0) instanceof zzat) {
                        return zze(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    if (h.d(zzbl.FOR_OF_CONST, 3, list, 0) instanceof zzat) {
                        return zze(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    if (h.d(zzbl.FOR_OF_LET, 3, list, 0) instanceof zzat) {
                        return zze(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.zzb(str);
            }
        }
        zzap zzapVar3 = (zzap) h.d(zzbl.WHILE, 4, list, 0);
        zzap zzapVar4 = (zzap) list.get(1);
        zzap zzb3 = zzgVar.zzb((zzap) list.get(3));
        if (zzgVar.zzb((zzap) list.get(2)).zzg().booleanValue()) {
            zzap zzc2 = zzgVar.zzc((zzae) zzb3);
            if (zzc2 instanceof zzag) {
                zzag zzagVar2 = (zzag) zzc2;
                if ("break".equals(zzagVar2.zzc())) {
                    return zzap.zzf;
                }
                if ("return".equals(zzagVar2.zzc())) {
                    return zzagVar2;
                }
            }
        }
        while (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
            zzap zzc3 = zzgVar.zzc((zzae) zzb3);
            if (zzc3 instanceof zzag) {
                zzag zzagVar3 = (zzag) zzc3;
                if ("break".equals(zzagVar3.zzc())) {
                    return zzap.zzf;
                }
                if ("return".equals(zzagVar3.zzc())) {
                    return zzagVar3;
                }
            }
            zzgVar.zzb(zzapVar4);
        }
        return zzap.zzf;
    }
}
