package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzuv implements zzug, zzuf {
    private final zzug[] zza;
    private zzuf zze;
    private zzwi zzf;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzvz zzh = new zzts(zzfxr.zzm(), zzfxr.zzm());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzug[] zzg = new zzug[0];

    public zzuv(zztt zzttVar, long[] jArr, zzug... zzugVarArr) {
        this.zza = zzugVarArr;
        for (int i10 = 0; i10 < zzugVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zzwf(zzugVarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zza(long j10, zzlj zzljVar) {
        zzug zzugVar;
        zzug[] zzugVarArr = this.zzg;
        if (zzugVarArr.length > 0) {
            zzugVar = zzugVarArr[0];
        } else {
            zzugVar = this.zza[0];
        }
        return zzugVar.zza(j10, zzljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzd() {
        zzug[] zzugVarArr;
        zzug[] zzugVarArr2;
        long j10 = -9223372036854775807L;
        for (zzug zzugVar : this.zzg) {
            long zzd = zzugVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (zzug zzugVar2 : this.zzg) {
                        if (zzugVar2 == zzugVar) {
                            break;
                        } else if (zzugVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = zzd;
                } else if (zzd != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && zzugVar.zze(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zze(long j10) {
        long zze = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zzug[] zzugVarArr = this.zzg;
            if (i10 < zzugVarArr.length) {
                if (zzugVarArr[i10].zze(zze) == zze) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return zze;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ void zzf(zzvz zzvzVar) {
        zzug zzugVar = (zzug) zzvzVar;
        zzuf zzufVar = this.zze;
        zzufVar.getClass();
        zzufVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzg(zzxv[] zzxvVarArr, boolean[] zArr, zzvx[] zzvxVarArr, boolean[] zArr2, long j10) {
        int length;
        zzvx zzvxVar;
        int intValue;
        int length2 = zzxvVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzxvVarArr.length;
            Integer num = null;
            if (i11 >= length) {
                break;
            }
            zzvx zzvxVar2 = zzvxVarArr[i11];
            if (zzvxVar2 != null) {
                num = (Integer) this.zzb.get(zzvxVar2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i11] = intValue;
            zzxv zzxvVar = zzxvVarArr[i11];
            if (zzxvVar != null) {
                String str = zzxvVar.zze().zzb;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.zzb.clear();
        zzvx[] zzvxVarArr2 = new zzvx[length];
        zzvx[] zzvxVarArr3 = new zzvx[length];
        zzxv[] zzxvVarArr2 = new zzxv[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.zza.length) {
            for (int i13 = i10; i13 < zzxvVarArr.length; i13++) {
                if (iArr[i13] == i12) {
                    zzvxVar = zzvxVarArr[i13];
                } else {
                    zzvxVar = null;
                }
                zzvxVarArr3[i13] = zzvxVar;
                if (iArr2[i13] == i12) {
                    zzxv zzxvVar2 = zzxvVarArr[i13];
                    zzxvVar2.getClass();
                    zzcd zzcdVar = (zzcd) this.zzd.get(zzxvVar2.zze());
                    zzcdVar.getClass();
                    zzxvVarArr2[i13] = new zzuu(zzxvVar2, zzcdVar);
                } else {
                    zzxvVarArr2[i13] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzxv[] zzxvVarArr3 = zzxvVarArr2;
            zzvx[] zzvxVarArr4 = zzvxVarArr3;
            long zzg = this.zza[i12].zzg(zzxvVarArr2, zArr, zzvxVarArr3, zArr2, j11);
            if (i12 == 0) {
                j11 = zzg;
            } else if (zzg != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < zzxvVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr2[i14] == i12) {
                    zzvx zzvxVar3 = zzvxVarArr4[i14];
                    zzvxVar3.getClass();
                    zzvxVarArr2[i14] = zzvxVar3;
                    this.zzb.put(zzvxVar3, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr[i14] == i12) {
                    if (zzvxVarArr4[i14] != null) {
                        z11 = false;
                    }
                    zzdi.zzf(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i12]);
            }
            i12++;
            arrayList = arrayList2;
            zzxvVarArr2 = zzxvVarArr3;
            zzvxVarArr3 = zzvxVarArr4;
            i10 = 0;
        }
        int i15 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzvxVarArr2, i15, zzvxVarArr, i15, length);
        this.zzg = (zzug[]) arrayList3.toArray(new zzug[i15]);
        this.zzh = new zzts(arrayList3, zzfyh.zzb(arrayList3, new zzful() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return ((zzug) obj).zzi().zzc();
            }
        }));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzuf
    public final void zzh(zzug zzugVar) {
        this.zzc.remove(zzugVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (zzug zzugVar2 : this.zza) {
            i10 += zzugVar2.zzi().zzb;
        }
        zzcd[] zzcdVarArr = new zzcd[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zzug[] zzugVarArr = this.zza;
            if (i11 < zzugVarArr.length) {
                zzwi zzi = zzugVarArr[i11].zzi();
                int i13 = zzi.zzb;
                int i14 = 0;
                while (i14 < i13) {
                    zzcd zzb = zzi.zzb(i14);
                    zzaf[] zzafVarArr = new zzaf[zzb.zza];
                    for (int i15 = 0; i15 < zzb.zza; i15++) {
                        zzaf zzb2 = zzb.zzb(i15);
                        zzad zzb3 = zzb2.zzb();
                        String str = zzb2.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzb3.zzK(i11 + ":" + str);
                        zzafVarArr[i15] = zzb3.zzad();
                    }
                    zzcd zzcdVar = new zzcd(i11 + ":" + zzb.zzb, zzafVarArr);
                    this.zzd.put(zzcdVar, zzb);
                    zzcdVarArr[i12] = zzcdVar;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.zzf = new zzwi(zzcdVarArr);
                zzuf zzufVar = this.zze;
                zzufVar.getClass();
                zzufVar.zzh(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final zzwi zzi() {
        zzwi zzwiVar = this.zzf;
        zzwiVar.getClass();
        return zzwiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzj(long j10, boolean z10) {
        for (zzug zzugVar : this.zzg) {
            zzugVar.zzj(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() {
        int i10 = 0;
        while (true) {
            zzug[] zzugVarArr = this.zza;
            if (i10 < zzugVarArr.length) {
                zzugVarArr[i10].zzk();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl(zzuf zzufVar, long j10) {
        this.zze = zzufVar;
        Collections.addAll(this.zzc, this.zza);
        int i10 = 0;
        while (true) {
            zzug[] zzugVarArr = this.zza;
            if (i10 < zzugVarArr.length) {
                zzugVarArr[i10].zzl(this, j10);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zzug zzn(int i10) {
        zzug zzugVar = this.zza[i10];
        if (zzugVar instanceof zzwf) {
            return ((zzwf) zzugVar).zzn();
        }
        return zzugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((zzug) this.zzc.get(i10)).zzo(zzkfVar);
            }
            return false;
        }
        return this.zzh.zzo(zzkfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
