package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzxt extends zzxy implements zzlg {
    private static final zzfzc zzb = zzfzc.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzws
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            if (num.intValue() == -1) {
                if (num2.intValue() != -1) {
                    return -1;
                }
                return 0;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    public final Context zza;
    private final Object zzc;
    private final boolean zzd;
    private zzxi zze;
    private zzxm zzf;
    private zzh zzg;
    private final zzwo zzh;

    public zzxt(Context context) {
        Context context2;
        zzwo zzwoVar = new zzwo();
        zzxi zzd = zzxi.zzd(context);
        this.zzc = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.zza = context2;
        this.zzh = zzwoVar;
        this.zze = zzd;
        this.zzg = zzh.zza;
        boolean z10 = false;
        if (context != null && zzet.zzN(context)) {
            z10 = true;
        }
        this.zzd = z10;
        if (!z10 && context != null && zzet.zza >= 32) {
            this.zzf = zzxm.zza(context);
        }
        if (this.zze.zzM && context == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i10, int i11) {
        if (i10 != 0 && i10 == i11) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return Integer.bitCount(i10 & i11);
    }

    public static int zzc(zzaf zzafVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzafVar.zzd)) {
            return 4;
        }
        String zzh = zzh(str);
        String zzh2 = zzh(zzafVar.zzd);
        if (zzh2 != null && zzh != null) {
            if (!zzh2.startsWith(zzh) && !zzh.startsWith(zzh2)) {
                int i10 = zzet.zza;
                if (!zzh2.split("-", 2)[0].equals(zzh.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || zzh2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String zzh(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzxt zzxtVar) {
        zzxtVar.zzu();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0053, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzxt r8, com.google.android.gms.internal.ads.zzaf r9) {
        /*
            java.lang.Object r0 = r8.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzxi r1 = r8.zze     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzM     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            if (r1 == 0) goto L8d
            boolean r1 = r8.zzd     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8d
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8f
            r3 = 2
            if (r1 <= r3) goto L8d
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8f
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r5
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzet.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.google.android.gms.internal.ads.zzxm r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L65
            goto L8d
        L65:
            int r1 = com.google.android.gms.internal.ads.zzet.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzxm r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxm r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxm r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzh r8 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r5
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxt.zzm(com.google.android.gms.internal.ads.zzxt, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    private static void zzt(zzwi zzwiVar, zzci zzciVar, Map map) {
        for (int i10 = 0; i10 < zzwiVar.zzb; i10++) {
            if (((zzce) zzciVar.zzA.get(zzwiVar.zzb(i10))) != null) {
                throw null;
            }
        }
    }

    public final void zzu() {
        boolean z10;
        zzxm zzxmVar;
        synchronized (this.zzc) {
            z10 = false;
            if (this.zze.zzM && !this.zzd && zzet.zza >= 32 && (zzxmVar = this.zzf) != null && zzxmVar.zzg()) {
                z10 = true;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static final Pair zzv(int i10, zzxx zzxxVar, int[][][] iArr, zzxo zzxoVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzxx zzxxVar2 = zzxxVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == zzxxVar2.zzc(i11)) {
                zzwi zzd = zzxxVar2.zzd(i11);
                for (int i12 = 0; i12 < zzd.zzb; i12++) {
                    zzcd zzb2 = zzd.zzb(i12);
                    List zza = zzxoVar.zza(i11, zzb2, iArr[i11][i12]);
                    boolean[] zArr = new boolean[zzb2.zza];
                    int i13 = 0;
                    while (i13 < zzb2.zza) {
                        int i14 = i13 + 1;
                        zzxp zzxpVar = (zzxp) zza.get(i13);
                        int zzb3 = zzxpVar.zzb();
                        if (!zArr[i13] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                randomAccess = zzfxr.zzn(zzxpVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxpVar);
                                for (int i15 = i14; i15 < zzb2.zza; i15++) {
                                    zzxp zzxpVar2 = (zzxp) zza.get(i15);
                                    if (zzxpVar2.zzb() == 2 && zzxpVar.zzc(zzxpVar2)) {
                                        arrayList2.add(zzxpVar2);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i13 = i14;
                    }
                }
            }
            i11++;
            zzxxVar2 = zzxxVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((zzxp) list.get(i16)).zzc;
        }
        zzxp zzxpVar3 = (zzxp) list.get(0);
        return Pair.create(new zzxu(zzxpVar3.zzb, iArr2, 0), Integer.valueOf(zzxpVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zza(zzle zzleVar) {
        synchronized (this.zzc) {
            boolean z10 = this.zze.zzQ;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final Pair zzd(zzxx zzxxVar, int[][][] iArr, final int[] iArr2, zzui zzuiVar, zzcc zzccVar) {
        final zzxi zzxiVar;
        Pair pair;
        int i10;
        final boolean z10;
        final String str;
        zzli zzliVar;
        int i11;
        int[] iArr3;
        int length;
        zzxv zza;
        zzxu zzxuVar;
        zzxm zzxmVar;
        synchronized (this.zzc) {
            zzxiVar = this.zze;
            if (zzxiVar.zzM && zzet.zza >= 32 && (zzxmVar = this.zzf) != null) {
                Looper myLooper = Looper.myLooper();
                zzdi.zzb(myLooper);
                zzxmVar.zzb(this, myLooper);
            }
        }
        int i12 = 2;
        zzxu[] zzxuVarArr = new zzxu[2];
        Pair zzv = zzv(2, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzwy
            /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzxo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzcd r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 199
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.zza(int, com.google.android.gms.internal.ads.zzcd, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfxg.zzj().zzc((zzxs) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zzd((zzxs) obj3, (zzxs) obj4);
                    }
                }), (zzxs) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zzd((zzxs) obj3, (zzxs) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zzd((zzxs) obj3, (zzxs) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzxs) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxr
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zza((zzxs) obj3, (zzxs) obj4);
                    }
                }), (zzxs) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxr
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zza((zzxs) obj3, (zzxs) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxr
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zza((zzxs) obj3, (zzxs) obj4);
                    }
                }).zza();
            }
        });
        int i13 = 4;
        if (zzv == null) {
            pair = zzv(4, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzwu
                @Override // com.google.android.gms.internal.ads.zzxo
                public final List zza(int i14, zzcd zzcdVar, int[] iArr4) {
                    zzfxo zzfxoVar = new zzfxo();
                    for (int i15 = 0; i15 < zzcdVar.zza; i15++) {
                        zzfxoVar.zzf(new zzxd(i14, zzcdVar, i15, zzxi.this, iArr4[i15]));
                    }
                    return zzfxoVar.zzi();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwv
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((zzxd) ((List) obj).get(0)).compareTo((zzxd) ((List) obj2).get(0));
                }
            });
        } else {
            pair = null;
        }
        int i14 = 0;
        if (pair != null) {
            zzxuVarArr[((Integer) pair.second).intValue()] = (zzxu) pair.first;
        } else if (zzv != null) {
            zzxuVarArr[((Integer) zzv.second).intValue()] = (zzxu) zzv.first;
        }
        int i15 = 0;
        while (true) {
            i10 = 1;
            if (i15 < 2) {
                if (zzxxVar.zzc(i15) == 2 && zzxxVar.zzd(i15).zzb > 0) {
                    z10 = true;
                    break;
                }
                i15++;
            } else {
                z10 = false;
                break;
            }
        }
        Pair zzv2 = zzv(1, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzww
            @Override // com.google.android.gms.internal.ads.zzxo
            public final List zza(int i16, zzcd zzcdVar, int[] iArr4) {
                final zzxt zzxtVar = zzxt.this;
                zzfuv zzfuvVar = new zzfuv() { // from class: com.google.android.gms.internal.ads.zzwt
                    @Override // com.google.android.gms.internal.ads.zzfuv
                    public final boolean zza(Object obj) {
                        return zzxt.zzm(zzxt.this, (zzaf) obj);
                    }
                };
                int i17 = iArr2[i16];
                zzfxo zzfxoVar = new zzfxo();
                for (int i18 = 0; i18 < zzcdVar.zza; i18++) {
                    zzfxoVar.zzf(new zzxc(i16, zzcdVar, i18, zzxiVar, iArr4[i18], z10, zzfuvVar, i17));
                }
                return zzfxoVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxc) Collections.max((List) obj)).zza((zzxc) Collections.max((List) obj2));
            }
        });
        if (zzv2 != null) {
            zzxuVarArr[((Integer) zzv2.second).intValue()] = (zzxu) zzv2.first;
        }
        if (zzv2 == null) {
            str = null;
        } else {
            Object obj = zzv2.first;
            str = ((zzxu) obj).zza.zzb(((zzxu) obj).zzb[0]).zzd;
        }
        int i16 = 3;
        Pair zzv3 = zzv(3, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzxa
            @Override // com.google.android.gms.internal.ads.zzxo
            public final List zza(int i17, zzcd zzcdVar, int[] iArr4) {
                zzfxo zzfxoVar = new zzfxo();
                for (int i18 = 0; i18 < zzcdVar.zza; i18++) {
                    int i19 = i18;
                    zzfxoVar.zzf(new zzxn(i17, zzcdVar, i19, zzxi.this, iArr4[i18], str));
                }
                return zzfxoVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzxn) ((List) obj2).get(0)).zza((zzxn) ((List) obj3).get(0));
            }
        });
        if (zzv3 != null) {
            zzxuVarArr[((Integer) zzv3.second).intValue()] = (zzxu) zzv3.first;
        }
        int i17 = 0;
        while (i17 < i12) {
            int zzc = zzxxVar.zzc(i17);
            if (zzc != i12 && zzc != i10 && zzc != i16 && zzc != i13) {
                zzwi zzd = zzxxVar.zzd(i17);
                int[][] iArr4 = iArr[i17];
                int i18 = i14;
                int i19 = i18;
                zzcd zzcdVar = null;
                zzxe zzxeVar = null;
                while (i18 < zzd.zzb) {
                    zzcd zzb2 = zzd.zzb(i18);
                    int[] iArr5 = iArr4[i18];
                    zzxe zzxeVar2 = zzxeVar;
                    for (int i20 = i14; i20 < zzb2.zza; i20++) {
                        if (zzlf.zza(iArr5[i20], zzxiVar.zzN)) {
                            zzxe zzxeVar3 = new zzxe(zzb2.zzb(i20), iArr5[i20]);
                            if (zzxeVar2 == null || zzxeVar3.compareTo(zzxeVar2) > 0) {
                                zzcdVar = zzb2;
                                zzxeVar2 = zzxeVar3;
                                i19 = i20;
                            }
                        }
                    }
                    i18++;
                    zzxeVar = zzxeVar2;
                    i14 = 0;
                }
                if (zzcdVar == null) {
                    zzxuVar = null;
                } else {
                    zzxuVar = new zzxu(zzcdVar, new int[]{i19}, 0);
                }
                zzxuVarArr[i17] = zzxuVar;
            }
            i17++;
            i12 = 2;
            i13 = 4;
            i10 = 1;
            i14 = 0;
            i16 = 3;
        }
        HashMap hashMap = new HashMap();
        int i21 = 2;
        for (int i22 = 0; i22 < 2; i22++) {
            zzt(zzxxVar.zzd(i22), zzxiVar, hashMap);
        }
        zzt(zzxxVar.zze(), zzxiVar, hashMap);
        for (int i23 = 0; i23 < 2; i23++) {
            if (((zzce) hashMap.get(Integer.valueOf(zzxxVar.zzc(i23)))) != null) {
                throw null;
            }
        }
        int i24 = 0;
        while (i24 < i21) {
            zzwi zzd2 = zzxxVar.zzd(i24);
            if (zzxiVar.zzg(i24, zzd2)) {
                if (zzxiVar.zze(i24, zzd2) == null) {
                    zzxuVarArr[i24] = null;
                } else {
                    throw null;
                }
            }
            i24++;
            i21 = 2;
        }
        int i25 = 0;
        for (int i26 = i21; i25 < i26; i26 = 2) {
            int zzc2 = zzxxVar.zzc(i25);
            if (zzxiVar.zzf(i25) || zzxiVar.zzB.contains(Integer.valueOf(zzc2))) {
                zzxuVarArr[i25] = null;
            }
            i25++;
        }
        zzwo zzwoVar = this.zzh;
        zzyj zzq = zzq();
        zzfxr zzf = zzwp.zzf(zzxuVarArr);
        int i27 = 2;
        zzxv[] zzxvVarArr = new zzxv[2];
        int i28 = 0;
        while (i28 < i27) {
            zzxu zzxuVar2 = zzxuVarArr[i28];
            if (zzxuVar2 != null && (length = (iArr3 = zzxuVar2.zzb).length) != 0) {
                if (length == 1) {
                    zza = new zzxw(zzxuVar2.zza, iArr3[0], 0, 0, null);
                    i11 = i28;
                } else {
                    i11 = i28;
                    zza = zzwoVar.zza(zzxuVar2.zza, iArr3, 0, zzq, (zzfxr) zzf.get(i28));
                }
                zzxvVarArr[i11] = zza;
            } else {
                i11 = i28;
            }
            i28 = i11 + 1;
            i27 = 2;
        }
        zzli[] zzliVarArr = new zzli[i27];
        for (int i29 = 0; i29 < i27; i29++) {
            int zzc3 = zzxxVar.zzc(i29);
            if (!zzxiVar.zzf(i29) && !zzxiVar.zzB.contains(Integer.valueOf(zzc3)) && (zzxxVar.zzc(i29) == -2 || zzxvVarArr[i29] != null)) {
                zzliVar = zzli.zza;
            } else {
                zzliVar = null;
            }
            zzliVarArr[i29] = zzliVar;
        }
        return Pair.create(zzliVarArr, zzxvVarArr);
    }

    public final zzxi zzf() {
        zzxi zzxiVar;
        synchronized (this.zzc) {
            zzxiVar = this.zze;
        }
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzj() {
        zzxm zzxmVar;
        synchronized (this.zzc) {
            if (zzet.zza >= 32 && (zzxmVar = this.zzf) != null) {
                zzxmVar.zzc();
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzk(zzh zzhVar) {
        boolean z10;
        synchronized (this.zzc) {
            z10 = !this.zzg.equals(zzhVar);
            this.zzg = zzhVar;
        }
        if (z10) {
            zzu();
        }
    }

    public final void zzl(zzxg zzxgVar) {
        boolean z10;
        zzxi zzxiVar = new zzxi(zzxgVar);
        synchronized (this.zzc) {
            z10 = !this.zze.equals(zzxiVar);
            this.zze = zzxiVar;
        }
        if (z10) {
            if (zzxiVar.zzM && this.zza == null) {
                zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final boolean zzn() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final zzlg zze() {
        return this;
    }
}
