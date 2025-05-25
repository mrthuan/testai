package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxn {
    private static final zzgxn zzb = new zzgxn(true);
    final zzhao zza = new zzhah();
    private boolean zzc;
    private boolean zzd;

    private zzgxn() {
    }

    public static int zza(zzhbf zzhbfVar, int i10, Object obj) {
        int zzD = zzgxd.zzD(i10 << 3);
        if (zzhbfVar == zzhbf.zzj) {
            zzgzj zzgzjVar = (zzgzj) obj;
            byte[] bArr = zzgyl.zzb;
            if (!(zzgzjVar instanceof zzgvw)) {
                zzD += zzD;
            } else {
                zzgvw zzgvwVar = (zzgvw) zzgzjVar;
                throw null;
            }
        }
        return zzD + zzb(zzhbfVar, obj);
    }

    public static int zzb(zzhbf zzhbfVar, Object obj) {
        int zzd;
        int zzD;
        zzhbf zzhbfVar2 = zzhbf.zza;
        zzhbg zzhbgVar = zzhbg.INT;
        switch (zzhbfVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i10 = zzgxd.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i11 = zzgxd.zzf;
                return 4;
            case 2:
                return zzgxd.zzE(((Long) obj).longValue());
            case 3:
                return zzgxd.zzE(((Long) obj).longValue());
            case 4:
                return zzgxd.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i12 = zzgxd.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i13 = zzgxd.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i14 = zzgxd.zzf;
                return 1;
            case 8:
                if (obj instanceof zzgwm) {
                    int i15 = zzgxd.zzf;
                    zzd = ((zzgwm) obj).zzd();
                    zzD = zzgxd.zzD(zzd);
                    break;
                } else {
                    return zzgxd.zzC((String) obj);
                }
            case 9:
                int i16 = zzgxd.zzf;
                return ((zzgzj) obj).zzaY();
            case 10:
                if (obj instanceof zzgyt) {
                    int i17 = zzgxd.zzf;
                    zzd = ((zzgyt) obj).zza();
                    zzD = zzgxd.zzD(zzd);
                    break;
                } else {
                    return zzgxd.zzz((zzgzj) obj);
                }
            case 11:
                if (obj instanceof zzgwm) {
                    int i18 = zzgxd.zzf;
                    zzd = ((zzgwm) obj).zzd();
                    zzD = zzgxd.zzD(zzd);
                    break;
                } else {
                    int i19 = zzgxd.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzgxd.zzD(zzd);
                    break;
                }
            case 12:
                return zzgxd.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgyc) {
                    return zzgxd.zzE(((zzgyc) obj).zza());
                }
                return zzgxd.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i20 = zzgxd.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i21 = zzgxd.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgxd.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgxd.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzgxm zzgxmVar, Object obj) {
        zzhbf zzb2 = zzgxmVar.zzb();
        int zza = zzgxmVar.zza();
        if (zzgxmVar.zze()) {
            List<Object> list = (List) obj;
            int i10 = 0;
            if (zzgxmVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                for (Object obj2 : list) {
                    i10 += zzb(zzb2, obj2);
                }
                return zzgxd.zzD(i10) + zzgxd.zzD(zza << 3) + i10;
            }
            for (Object obj3 : list) {
                i10 += zza(zzb2, zza, obj3);
            }
            return i10;
        }
        return zza(zzb2, zza, obj);
    }

    public static zzgxn zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgxm zzgxmVar = (zzgxm) entry.getKey();
        if (zzgxmVar.zzc() == zzhbg.MESSAGE) {
            if (zzgxmVar.zze()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!zzk(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return zzk(entry.getValue());
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzgzk) {
            return ((zzgzk) obj).zzbw();
        }
        if (obj instanceof zzgyt) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        zzgxm zzgxmVar = (zzgxm) entry.getKey();
        Object value = entry.getValue();
        if (zzgxmVar.zzc() == zzhbg.MESSAGE && !zzgxmVar.zze() && !zzgxmVar.zzd()) {
            if (value instanceof zzgyt) {
                int zza = ((zzgxm) entry.getKey()).zza();
                int zzD = zzgxd.zzD(8);
                int zzD2 = zzgxd.zzD(zza) + zzgxd.zzD(16);
                int zzD3 = zzgxd.zzD(24);
                int zza2 = ((zzgyt) value).zza();
                return zzD + zzD + zzD2 + zzgxd.zzD(zza2) + zza2 + zzD3;
            }
            int zza3 = ((zzgxm) entry.getKey()).zza();
            int zzD4 = zzgxd.zzD(8);
            int zzD5 = zzgxd.zzD(16);
            int zzD6 = zzgxd.zzD(24);
            return zzD4 + zzD4 + zzgxd.zzD(zza3) + zzD5 + zzgxd.zzz((zzgzj) value) + zzD6;
        }
        return zzc(zzgxmVar, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzm(com.google.android.gms.internal.ads.zzgxm r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzhbf r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzgyl.zzb
            r5.getClass()
            com.google.android.gms.internal.ads.zzhbf r1 = com.google.android.gms.internal.ads.zzhbf.zza
            com.google.android.gms.internal.ads.zzhbg r1 = com.google.android.gms.internal.ads.zzhbg.INT
            com.google.android.gms.internal.ads.zzhbg r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzj
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgyt
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgyc
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgwm
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.ads.zzhbf r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzhbg r4 = r4.zza()
            r2 = 1
            r1[r2] = r4
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxn.zzm(com.google.android.gms.internal.ads.zzgxm, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzgxn zzgxnVar = new zzgxn();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgxnVar.zzh((zzgxm) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgxnVar.zzh((zzgxm) entry.getKey(), entry.getValue());
        }
        zzgxnVar.zzd = this.zzd;
        return zzgxnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxn)) {
            return false;
        }
        return this.zza.equals(((zzgxn) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzl(this.zza.zzg(i11));
        }
        for (Map.Entry entry : this.zza.zzc()) {
            i10 += zzl(entry);
        }
        return i10;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzgys(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzgxy) {
                    ((zzgxy) zzg.getValue()).zzbW();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzgxm zzgxmVar, Object obj) {
        if (zzgxmVar.zze()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zzm(zzgxmVar, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzm(zzgxmVar, obj);
        }
        if (obj instanceof zzgyt) {
            this.zzd = true;
        }
        this.zza.put(zzgxmVar, obj);
    }

    public final boolean zzi() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzj(this.zza.zzg(i10))) {
                return false;
            }
        }
        for (Map.Entry entry : this.zza.zzc()) {
            if (!zzj(entry)) {
                return false;
            }
        }
        return true;
    }

    private zzgxn(boolean z10) {
        zzg();
        zzg();
    }
}
