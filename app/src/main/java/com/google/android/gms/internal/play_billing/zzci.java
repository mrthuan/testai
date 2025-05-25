package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzci {
    private static final zzci zzb = new zzci(true);
    final zzfb zza = new zzer(16);
    private boolean zzc;
    private boolean zzd;

    private zzci() {
    }

    public static int zza(zzfv zzfvVar, int i10, Object obj) {
        zzby.zzw(i10 << 3);
        if (zzfv.zzj == null) {
            zzec zzecVar = (zzec) obj;
            byte[] bArr = zzda.zzd;
            if (zzecVar instanceof zzaz) {
                zzaz zzazVar = (zzaz) zzecVar;
                throw null;
            }
        }
        zzfw zzfwVar = zzfw.INT;
        throw null;
    }

    public static int zzb(zzch zzchVar, Object obj) {
        zzfv zzd = zzchVar.zzd();
        int zza = zzchVar.zza();
        if (zzchVar.zzg()) {
            List<Object> list = (List) obj;
            int i10 = 0;
            if (zzchVar.zzf()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    return zzby.zzw(0) + zzby.zzw(zza << 3);
                }
                it.next();
                zzfv zzfvVar = zzfv.zza;
                zzfw zzfwVar = zzfw.INT;
                throw null;
            }
            for (Object obj2 : list) {
                i10 += zza(zzd, zza, obj2);
            }
            return i10;
        }
        return zza(zzd, zza, obj);
    }

    public static zzci zzd() {
        return zzb;
    }

    private static Object zzk(Object obj) {
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzd();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzl(Map.Entry entry) {
        zzec zzf;
        zzch zzchVar = (zzch) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzdh;
        if (zzchVar.zzg()) {
            if (!z10) {
                Object zze = zze(zzchVar);
                if (zze == null) {
                    zze = new ArrayList();
                }
                for (Object obj : (List) value) {
                    ((List) zze).add(zzk(obj));
                }
                this.zza.put(zzchVar, zze);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (zzchVar.zze() == zzfw.MESSAGE) {
            Object zze2 = zze(zzchVar);
            if (zze2 == null) {
                this.zza.put(zzchVar, zzk(value));
                if (z10) {
                    this.zzd = true;
                }
            } else if (!z10) {
                if (zze2 instanceof zzeh) {
                    zzf = zzchVar.zzc((zzeh) zze2, (zzeh) value);
                } else {
                    zzf = zzchVar.zzb(((zzec) zze2).zzF(), (zzec) value).zzf();
                }
                this.zza.put(zzchVar, zzf);
            } else {
                zzdh zzdhVar = (zzdh) value;
                throw null;
            }
        } else if (!z10) {
            this.zza.put(zzchVar, zzk(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private static boolean zzm(Map.Entry entry) {
        zzch zzchVar = (zzch) entry.getKey();
        if (zzchVar.zze() == zzfw.MESSAGE) {
            if (zzchVar.zzg()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!zzn(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return zzn(entry.getValue());
        }
        return true;
    }

    private static boolean zzn(Object obj) {
        if (obj instanceof zzed) {
            return ((zzed) obj).zzk();
        }
        if (obj instanceof zzdh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i10;
        int zzw;
        int zzw2;
        int zzf;
        int zzw3;
        zzch zzchVar = (zzch) entry.getKey();
        Object value = entry.getValue();
        if (zzchVar.zze() == zzfw.MESSAGE && !zzchVar.zzg() && !zzchVar.zzf()) {
            if (value instanceof zzdh) {
                int zza = ((zzch) entry.getKey()).zza();
                int zzw4 = zzby.zzw(8);
                i10 = zzw4 + zzw4;
                zzw = zzby.zzw(zza) + zzby.zzw(16);
                zzw2 = zzby.zzw(24);
                zzf = ((zzdh) value).zza();
                zzw3 = zzby.zzw(zzf);
            } else {
                int zza2 = ((zzch) entry.getKey()).zza();
                int zzw5 = zzby.zzw(8);
                i10 = zzw5 + zzw5;
                zzw = zzby.zzw(zza2) + zzby.zzw(16);
                zzw2 = zzby.zzw(24);
                zzf = ((zzec) value).zzf();
                zzw3 = zzby.zzw(zzf);
            }
            return i10 + zzw + zzw3 + zzf + zzw2;
        }
        return zzb(zzchVar, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzp(com.google.android.gms.internal.play_billing.zzch r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.play_billing.zzfv r0 = r4.zzd()
            byte[] r1 = com.google.android.gms.internal.play_billing.zzda.zzd
            r5.getClass()
            com.google.android.gms.internal.play_billing.zzfv r1 = com.google.android.gms.internal.play_billing.zzfv.zza
            com.google.android.gms.internal.play_billing.zzfw r1 = com.google.android.gms.internal.play_billing.zzfw.INT
            com.google.android.gms.internal.play_billing.zzfw r0 = r0.zza()
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzec
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzdh
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzcu
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzbq
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
            com.google.android.gms.internal.play_billing.zzfv r4 = r4.zzd()
            com.google.android.gms.internal.play_billing.zzfw r4 = r4.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzci.zzp(com.google.android.gms.internal.play_billing.zzch, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzci zzciVar = new zzci();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzciVar.zzi((zzch) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzciVar.zzi((zzch) entry.getKey(), entry.getValue());
        }
        zzciVar.zzd = this.zzd;
        return zzciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzci)) {
            return false;
        }
        return this.zza.equals(((zzci) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        for (Map.Entry entry : this.zza.zzc()) {
            i10 += zzo(entry);
        }
        return i10;
    }

    public final Object zze(zzch zzchVar) {
        Object obj = this.zza.get(zzchVar);
        if (!(obj instanceof zzdh)) {
            return obj;
        }
        zzdh zzdhVar = (zzdh) obj;
        throw null;
    }

    public final Iterator zzf() {
        if (this.zzd) {
            return new zzdg(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzcs) {
                    ((zzcs) zzg.getValue()).zzr();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzci zzciVar) {
        for (int i10 = 0; i10 < zzciVar.zza.zzb(); i10++) {
            zzl(zzciVar.zza.zzg(i10));
        }
        for (Map.Entry entry : zzciVar.zza.zzc()) {
            zzl(entry);
        }
    }

    public final void zzi(zzch zzchVar, Object obj) {
        if (zzchVar.zzg()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zzp(zzchVar, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzp(zzchVar, obj);
        }
        if (obj instanceof zzdh) {
            this.zzd = true;
        }
        this.zza.put(zzchVar, obj);
    }

    public final boolean zzj() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzm(this.zza.zzg(i10))) {
                return false;
            }
        }
        for (Map.Entry entry : this.zza.zzc()) {
            if (!zzm(entry)) {
                return false;
            }
        }
        return true;
    }

    private zzci(boolean z10) {
        zzg();
        zzg();
    }
}
