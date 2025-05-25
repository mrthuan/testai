package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.h;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzbk extends zzaw {
    public zzbk() {
        this.zza.add(zzbl.ASSIGN);
        this.zza.add(zzbl.CONST);
        this.zza.add(zzbl.CREATE_ARRAY);
        this.zza.add(zzbl.CREATE_OBJECT);
        this.zza.add(zzbl.EXPRESSION_LIST);
        this.zza.add(zzbl.GET);
        this.zza.add(zzbl.GET_INDEX);
        this.zza.add(zzbl.GET_PROPERTY);
        this.zza.add(zzbl.NULL);
        this.zza.add(zzbl.SET_PROPERTY);
        this.zza.add(zzbl.TYPEOF);
        this.zza.add(zzbl.UNDEFINED);
        this.zza.add(zzbl.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        String str2;
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        int i10 = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal != 24) {
                    if (ordinal != 33) {
                        if (ordinal != 49) {
                            if (ordinal != 58) {
                                if (ordinal != 17) {
                                    if (ordinal != 18) {
                                        if (ordinal != 35 && ordinal != 36) {
                                            switch (ordinal) {
                                                case 62:
                                                    zzap zzb = zzgVar.zzb((zzap) h.d(zzbl.TYPEOF, 1, list, 0));
                                                    if (zzb instanceof zzau) {
                                                        str2 = "undefined";
                                                    } else if (zzb instanceof zzaf) {
                                                        str2 = "boolean";
                                                    } else if (zzb instanceof zzah) {
                                                        str2 = "number";
                                                    } else if (zzb instanceof zzat) {
                                                        str2 = "string";
                                                    } else if (zzb instanceof zzao) {
                                                        str2 = "function";
                                                    } else if (!(zzb instanceof zzaq) && !(zzb instanceof zzag)) {
                                                        str2 = "object";
                                                    } else {
                                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzb));
                                                    }
                                                    return new zzat(str2);
                                                case 63:
                                                    zzh.zzh(zzbl.UNDEFINED.name(), 0, list);
                                                    return zzap.zzf;
                                                case 64:
                                                    zzh.zzi(zzbl.VAR.name(), 1, list);
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        zzap zzb2 = zzgVar.zzb((zzap) it.next());
                                                        if (zzb2 instanceof zzat) {
                                                            zzgVar.zze(zzb2.zzi(), zzap.zzf);
                                                        } else {
                                                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", zzb2.getClass().getCanonicalName()));
                                                        }
                                                    }
                                                    return zzap.zzf;
                                                default:
                                                    return super.zzb(str);
                                            }
                                        }
                                        zzap zzb3 = zzgVar.zzb((zzap) h.d(zzbl.GET_PROPERTY, 2, list, 0));
                                        zzap zzb4 = zzgVar.zzb((zzap) list.get(1));
                                        if ((zzb3 instanceof zzae) && zzh.zzk(zzb4)) {
                                            return ((zzae) zzb3).zze(zzb4.zzh().intValue());
                                        }
                                        if (zzb3 instanceof zzal) {
                                            return ((zzal) zzb3).zzf(zzb4.zzi());
                                        }
                                        if (zzb3 instanceof zzat) {
                                            if ("length".equals(zzb4.zzi())) {
                                                return new zzah(Double.valueOf(zzb3.zzi().length()));
                                            }
                                            if (zzh.zzk(zzb4) && zzb4.zzh().doubleValue() < zzb3.zzi().length()) {
                                                return new zzat(String.valueOf(zzb3.zzi().charAt(zzb4.zzh().intValue())));
                                            }
                                        }
                                        return zzap.zzf;
                                    } else if (list.isEmpty()) {
                                        return new zzam();
                                    } else {
                                        if (list.size() % 2 == 0) {
                                            zzam zzamVar = new zzam();
                                            while (i10 < list.size() - 1) {
                                                zzap zzb5 = zzgVar.zzb((zzap) list.get(i10));
                                                zzap zzb6 = zzgVar.zzb((zzap) list.get(i10 + 1));
                                                if (!(zzb5 instanceof zzag) && !(zzb6 instanceof zzag)) {
                                                    zzamVar.zzr(zzb5.zzi(), zzb6);
                                                    i10 += 2;
                                                } else {
                                                    throw new IllegalStateException("Failed to evaluate map entry");
                                                }
                                            }
                                            return zzamVar;
                                        }
                                        throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                                    }
                                } else if (list.isEmpty()) {
                                    return new zzae();
                                } else {
                                    zzae zzaeVar = new zzae();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        zzap zzb7 = zzgVar.zzb((zzap) it2.next());
                                        if (!(zzb7 instanceof zzag)) {
                                            zzaeVar.zzq(i10, zzb7);
                                            i10++;
                                        } else {
                                            throw new IllegalStateException("Failed to evaluate array element");
                                        }
                                    }
                                    return zzaeVar;
                                }
                            }
                            zzap zzb8 = zzgVar.zzb((zzap) h.d(zzbl.SET_PROPERTY, 3, list, 0));
                            zzap zzb9 = zzgVar.zzb((zzap) list.get(1));
                            zzap zzb10 = zzgVar.zzb((zzap) list.get(2));
                            if (zzb8 != zzap.zzf && zzb8 != zzap.zzg) {
                                if ((zzb8 instanceof zzae) && (zzb9 instanceof zzah)) {
                                    ((zzae) zzb8).zzq(zzb9.zzh().intValue(), zzb10);
                                } else if (zzb8 instanceof zzal) {
                                    ((zzal) zzb8).zzr(zzb9.zzi(), zzb10);
                                }
                                return zzb10;
                            }
                            throw new IllegalStateException(String.format("Can't set property %s of %s", zzb9.zzi(), zzb8.zzi()));
                        }
                        zzh.zzh(zzbl.NULL.name(), 0, list);
                        return zzap.zzg;
                    }
                    zzap zzb11 = zzgVar.zzb((zzap) h.d(zzbl.GET, 1, list, 0));
                    if (zzb11 instanceof zzat) {
                        return zzgVar.zzd(zzb11.zzi());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", zzb11.getClass().getCanonicalName()));
                }
                zzh.zzi(zzbl.EXPRESSION_LIST.name(), 1, list);
                zzap zzapVar = zzap.zzf;
                while (i10 < list.size()) {
                    zzapVar = zzgVar.zzb((zzap) list.get(i10));
                    if (!(zzapVar instanceof zzag)) {
                        i10++;
                    } else {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                }
                return zzapVar;
            }
            zzh.zzi(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i11 = 0; i11 < list.size() - 1; i11 += 2) {
                    zzap zzb12 = zzgVar.zzb((zzap) list.get(i11));
                    if (zzb12 instanceof zzat) {
                        zzgVar.zzf(zzb12.zzi(), zzgVar.zzb((zzap) list.get(i11 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", zzb12.getClass().getCanonicalName()));
                    }
                }
                return zzap.zzf;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        zzap zzb13 = zzgVar.zzb((zzap) h.d(zzbl.ASSIGN, 2, list, 0));
        if (zzb13 instanceof zzat) {
            if (zzgVar.zzh(zzb13.zzi())) {
                zzap zzb14 = zzgVar.zzb((zzap) list.get(1));
                zzgVar.zzg(zzb13.zzi(), zzb14);
                return zzb14;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", zzb13.zzi()));
        }
        throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", zzb13.getClass().getCanonicalName()));
    }
}
