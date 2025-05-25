package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfzi extends zzfxu {
    static final zzfxu zza = new zzfzi(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzfzi(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static zzfzi zzj(int i10, Object[] objArr, zzfxt zzfxtVar) {
        short[] sArr;
        char c;
        char c10;
        byte[] bArr;
        Object[] objArr2;
        int i11 = i10;
        Object[] objArr3 = objArr;
        if (i11 == 0) {
            return (zzfzi) zza;
        }
        Object obj = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            zzfwo.zzb(obj2, obj3);
            return new zzfzi(null, objArr3, 1);
        }
        zzfuu.zzb(i11, objArr3.length >> 1, "index");
        int zzh = zzfxw.zzh(i10);
        if (i11 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            zzfwo.zzb(obj4, obj5);
            i11 = 1;
            c = 1;
            c10 = 2;
        } else {
            int i13 = zzh - 1;
            char c11 = 65535;
            if (zzh <= 128) {
                byte[] bArr2 = new byte[zzh];
                Arrays.fill(bArr2, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj6 = objArr3[i17];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i17 ^ i12];
                    Objects.requireNonNull(obj7);
                    zzfwo.zzb(obj6, obj7);
                    int zza2 = zzfxj.zza(obj6.hashCode());
                    while (true) {
                        int i18 = zza2 & i13;
                        int i19 = bArr2[i18] & 255;
                        if (i19 == 255) {
                            bArr2[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArr3[i16] = obj6;
                                objArr3[i16 ^ 1] = obj7;
                            }
                            i15++;
                        } else if (obj6.equals(objArr3[i19])) {
                            int i20 = i19 ^ 1;
                            Object obj8 = objArr3[i20];
                            Objects.requireNonNull(obj8);
                            zzfxs zzfxsVar = new zzfxs(obj6, obj7, obj8);
                            objArr3[i20] = obj7;
                            obj = zzfxsVar;
                            break;
                        } else {
                            zza2 = i18 + 1;
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    bArr = bArr2;
                } else {
                    obj = new Object[]{bArr2, Integer.valueOf(i15), obj};
                    c10 = 2;
                    c = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj9 = objArr3[i24];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i24 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfwo.zzb(obj9, obj10);
                        int zza3 = zzfxj.zza(obj9.hashCode());
                        while (true) {
                            int i25 = zza3 & i13;
                            char c12 = (char) sArr[i25];
                            if (c12 == 65535) {
                                sArr[i25] = (short) i23;
                                if (i21 < i22) {
                                    objArr3[i23] = obj9;
                                    objArr3[i23 ^ 1] = obj10;
                                }
                                i21++;
                            } else if (obj9.equals(objArr3[c12])) {
                                int i26 = c12 ^ 1;
                                Object obj11 = objArr3[i26];
                                Objects.requireNonNull(obj11);
                                zzfxs zzfxsVar2 = new zzfxs(obj9, obj10, obj11);
                                objArr3[i26] = obj10;
                                obj = zzfxsVar2;
                                break;
                            } else {
                                zza3 = i25 + 1;
                            }
                        }
                    }
                    if (i21 != i11) {
                        Integer valueOf = Integer.valueOf(i21);
                        c = 1;
                        c10 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    bArr = sArr;
                } else {
                    int i27 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i11) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj12 = objArr3[i31];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i31 ^ i27];
                        Objects.requireNonNull(obj13);
                        zzfwo.zzb(obj12, obj13);
                        int zza4 = zzfxj.zza(obj12.hashCode());
                        while (true) {
                            int i32 = zza4 & i13;
                            ?? r15 = sArr[i32];
                            if (r15 == c11) {
                                sArr[i32] = i30;
                                if (i29 < i28) {
                                    objArr3[i30] = obj12;
                                    objArr3[i30 ^ 1] = obj13;
                                }
                                i29++;
                            } else if (obj12.equals(objArr3[r15])) {
                                int i33 = r15 ^ 1;
                                Object obj14 = objArr3[i33];
                                Objects.requireNonNull(obj14);
                                zzfxs zzfxsVar3 = new zzfxs(obj12, obj13, obj14);
                                objArr3[i33] = obj13;
                                obj = zzfxsVar3;
                                break;
                            } else {
                                zza4 = i32 + 1;
                                c11 = 65535;
                            }
                        }
                        i28++;
                        i27 = 1;
                        c11 = 65535;
                    }
                    if (i29 != i11) {
                        c = 1;
                        c10 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i29), obj};
                        obj = objArr2;
                    }
                    bArr = sArr;
                }
                c = 1;
            }
            c10 = 2;
            obj = bArr;
            c = 1;
        }
        if (obj instanceof Object[]) {
            Object[] objArr4 = (Object[]) obj;
            zzfxs zzfxsVar4 = (zzfxs) objArr4[c10];
            if (zzfxtVar != null) {
                zzfxtVar.zzc = zzfxsVar4;
                Object obj15 = objArr4[0];
                int intValue = ((Integer) objArr4[c]).intValue();
                objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
                obj = obj15;
                i11 = intValue;
            } else {
                throw zzfxsVar4.zza();
            }
        }
        return new zzfzi(obj, objArr3, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfxu, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxj.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxj.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzfxj.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzi.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxm zza() {
        return new zzfzh(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxw zzf() {
        return new zzfzf(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxw zzg() {
        return new zzfzg(this, new zzfzh(this.zzb, 0, this.zzd));
    }
}
