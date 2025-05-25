package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzann implements zzang {
    final /* synthetic */ zzano zza;
    private final zzej zzb = new zzej(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzann(zzano zzanoVar, int i10) {
        this.zza = zzanoVar;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zza(zzek zzekVar) {
        List list;
        SparseArray sparseArray;
        int i10;
        zzacn zzacnVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzer zzerVar;
        zzacn zzacnVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzanr zzanrVar;
        zzer zzerVar2;
        int i11;
        if (zzekVar.zzm() == 2) {
            list = this.zza.zzb;
            zzer zzerVar3 = (zzer) list.get(0);
            if ((zzekVar.zzm() & 128) != 0) {
                zzekVar.zzL(1);
                int zzq = zzekVar.zzq();
                int i12 = 3;
                zzekVar.zzL(3);
                zzekVar.zzF(this.zzb, 2);
                this.zzb.zzn(3);
                int i13 = 13;
                this.zza.zzr = this.zzb.zzd(13);
                zzekVar.zzF(this.zzb, 2);
                int i14 = 4;
                this.zzb.zzn(4);
                int i15 = 12;
                zzekVar.zzL(this.zzb.zzd(12));
                this.zzc.clear();
                this.zzd.clear();
                int zzb = zzekVar.zzb();
                while (zzb > 0) {
                    int i16 = 5;
                    zzekVar.zzF(this.zzb, 5);
                    zzej zzejVar = this.zzb;
                    int zzd = zzejVar.zzd(8);
                    zzejVar.zzn(i12);
                    int zzd2 = this.zzb.zzd(i13);
                    this.zzb.zzn(i14);
                    int zzd3 = this.zzb.zzd(i15);
                    int zzd4 = zzekVar.zzd();
                    int i17 = zzd4 + zzd3;
                    int i18 = 0;
                    String str = null;
                    ArrayList arrayList = null;
                    int i19 = -1;
                    while (zzekVar.zzd() < i17) {
                        int zzm = zzekVar.zzm();
                        int zzd5 = zzekVar.zzd() + zzekVar.zzm();
                        if (zzd5 > i17) {
                            break;
                        }
                        if (zzm == i16) {
                            long zzu = zzekVar.zzu();
                            if (zzu != 1094921523) {
                                if (zzu != 1161904947) {
                                    if (zzu != 1094921524) {
                                        if (zzu == 1212503619) {
                                            i11 = 36;
                                            zzerVar2 = zzerVar3;
                                            i19 = i11;
                                        }
                                        zzerVar2 = zzerVar3;
                                    }
                                    zzerVar2 = zzerVar3;
                                    i19 = 172;
                                }
                                zzerVar2 = zzerVar3;
                                i19 = 135;
                            }
                            zzerVar2 = zzerVar3;
                            i19 = 129;
                        } else {
                            if (zzm != 106) {
                                if (zzm != 122) {
                                    if (zzm == 127) {
                                        int zzm2 = zzekVar.zzm();
                                        if (zzm2 != 21) {
                                            if (zzm2 == 14) {
                                                i11 = ShapeTypes.FLOW_CHART_INTERNAL_STORAGE;
                                            } else {
                                                if (zzm2 == 33) {
                                                    i11 = ShapeTypes.FLOW_CHART_TERMINATOR;
                                                }
                                                zzerVar2 = zzerVar3;
                                            }
                                        }
                                        zzerVar2 = zzerVar3;
                                        i19 = 172;
                                    } else if (zzm == 123) {
                                        i11 = ShapeTypes.FLOW_CHART_MULTIDOCUMENT;
                                    } else if (zzm == 10) {
                                        String trim = zzekVar.zzA(i12, zzfuj.zzc).trim();
                                        i18 = zzekVar.zzm();
                                        zzerVar2 = zzerVar3;
                                        str = trim;
                                    } else if (zzm == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzekVar.zzd() < zzd5) {
                                            String trim2 = zzekVar.zzA(i12, zzfuj.zzc).trim();
                                            int zzm3 = zzekVar.zzm();
                                            zzer zzerVar4 = zzerVar3;
                                            byte[] bArr = new byte[i14];
                                            zzekVar.zzG(bArr, 0, i14);
                                            arrayList2.add(new zzanp(trim2, zzm3, bArr));
                                            zzerVar3 = zzerVar4;
                                            i12 = 3;
                                            i14 = 4;
                                        }
                                        zzerVar2 = zzerVar3;
                                        arrayList = arrayList2;
                                        i19 = 89;
                                    } else {
                                        zzerVar2 = zzerVar3;
                                        if (zzm == 111) {
                                            i19 = 257;
                                        }
                                    }
                                    zzerVar2 = zzerVar3;
                                    i19 = i11;
                                }
                                zzerVar2 = zzerVar3;
                                i19 = 135;
                            }
                            zzerVar2 = zzerVar3;
                            i19 = 129;
                        }
                        zzekVar.zzL(zzd5 - zzekVar.zzd());
                        zzerVar3 = zzerVar2;
                        i12 = 3;
                        i14 = 4;
                        i16 = 5;
                    }
                    zzer zzerVar5 = zzerVar3;
                    zzekVar.zzK(i17);
                    zzanq zzanqVar = new zzanq(i19, str, i18, arrayList, Arrays.copyOfRange(zzekVar.zzM(), zzd4, i17));
                    if (zzd == 6 || zzd == 5) {
                        zzd = zzanqVar.zza;
                    }
                    zzb -= zzd3 + 5;
                    sparseBooleanArray3 = this.zza.zzh;
                    if (!sparseBooleanArray3.get(zzd2)) {
                        zzanrVar = this.zza.zze;
                        zzant zza = zzanrVar.zza(zzd, zzanqVar);
                        this.zzd.put(zzd2, zzd2);
                        this.zzc.put(zzd2, zza);
                    }
                    zzerVar3 = zzerVar5;
                    i12 = 3;
                    i14 = 4;
                    i15 = 12;
                    i13 = 13;
                }
                zzer zzerVar6 = zzerVar3;
                int size = this.zzd.size();
                int i20 = 0;
                while (i20 < size) {
                    SparseIntArray sparseIntArray = this.zzd;
                    zzano zzanoVar = this.zza;
                    int keyAt = sparseIntArray.keyAt(i20);
                    int valueAt = sparseIntArray.valueAt(i20);
                    sparseBooleanArray = zzanoVar.zzh;
                    sparseBooleanArray.put(keyAt, true);
                    sparseBooleanArray2 = this.zza.zzi;
                    sparseBooleanArray2.put(valueAt, true);
                    zzant zzantVar = (zzant) this.zzc.valueAt(i20);
                    if (zzantVar != null) {
                        zzacnVar2 = this.zza.zzl;
                        zzans zzansVar = new zzans(zzq, keyAt, 8192);
                        zzerVar = zzerVar6;
                        zzantVar.zzb(zzerVar, zzacnVar2, zzansVar);
                        sparseArray2 = this.zza.zzg;
                        sparseArray2.put(valueAt, zzantVar);
                    } else {
                        zzerVar = zzerVar6;
                    }
                    i20++;
                    zzerVar6 = zzerVar;
                }
                zzano zzanoVar2 = this.zza;
                int i21 = this.zze;
                sparseArray = zzanoVar2.zzg;
                sparseArray.remove(i21);
                this.zza.zzm = 0;
                zzano zzanoVar3 = this.zza;
                i10 = zzanoVar3.zzm;
                if (i10 == 0) {
                    zzacnVar = zzanoVar3.zzl;
                    zzacnVar.zzD();
                    this.zza.zzn = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzb(zzer zzerVar, zzacn zzacnVar, zzans zzansVar) {
    }
}
