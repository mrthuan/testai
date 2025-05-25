package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaer extends zzaet {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaer() {
        super(new zzacj());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzek zzekVar) {
        return Double.valueOf(Double.longBitsToDouble(zzekVar.zzt()));
    }

    private static Object zzh(zzek zzekVar, int i10) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) zzg(zzekVar).doubleValue());
                                zzekVar.zzL(2);
                                return date;
                            }
                            int zzp = zzekVar.zzp();
                            ArrayList arrayList = new ArrayList(zzp);
                            for (int i11 = 0; i11 < zzp; i11++) {
                                Object zzh = zzh(zzekVar, zzekVar.zzm());
                                if (zzh != null) {
                                    arrayList.add(zzh);
                                }
                            }
                            return arrayList;
                        }
                        return zzj(zzekVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String zzi = zzi(zzekVar);
                        int zzm = zzekVar.zzm();
                        if (zzm == 9) {
                            return hashMap;
                        }
                        Object zzh2 = zzh(zzekVar, zzm);
                        if (zzh2 != null) {
                            hashMap.put(zzi, zzh2);
                        }
                    }
                } else {
                    return zzi(zzekVar);
                }
            } else {
                if (zzekVar.zzm() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return zzg(zzekVar);
        }
    }

    private static String zzi(zzek zzekVar) {
        int zzq = zzekVar.zzq();
        int zzd = zzekVar.zzd();
        zzekVar.zzL(zzq);
        return new String(zzekVar.zzM(), zzd, zzq);
    }

    private static HashMap zzj(zzek zzekVar) {
        int zzp = zzekVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i10 = 0; i10 < zzp; i10++) {
            String zzi = zzi(zzekVar);
            Object zzh = zzh(zzekVar, zzekVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zza(zzek zzekVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzb(zzek zzekVar, long j10) {
        if (zzekVar.zzm() == 2 && "onMetaData".equals(zzi(zzekVar)) && zzekVar.zzb() != 0 && zzekVar.zzm() == 8) {
            HashMap zzj = zzj(zzekVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.zzd[i10] = ((Double) obj5).longValue();
                        } else {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
