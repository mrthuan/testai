package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzat extends zzal {
    static final zzal zza = new zzat(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzat(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzat zzg(int i10, Object[] objArr, zzak zzakVar) {
        int i11;
        short[] sArr;
        char c;
        char c10;
        byte[] bArr;
        byte[] bArr2;
        int i12 = i10;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return (zzat) zza;
        }
        Object obj = null;
        int i13 = 1;
        if (i12 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzad.zza(obj2, obj3);
            return new zzat(null, objArr2, 1);
        }
        zzaa.zzb(i12, objArr2.length >> 1, "index");
        int max = Math.max(i12, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1);
            do {
                i11 += i11;
            } while (i11 * 0.7d < max);
        } else {
            i11 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzad.zza(obj4, obj5);
            i12 = 1;
            c = 1;
            c10 = 2;
        } else {
            int i14 = i11 - 1;
            char c11 = 65535;
            if (i11 <= 128) {
                byte[] bArr3 = new byte[i11];
                Arrays.fill(bArr3, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj6 = objArr2[i18];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i18 ^ i13];
                    Objects.requireNonNull(obj7);
                    zzad.zza(obj6, obj7);
                    int zza2 = zzae.zza(obj6.hashCode());
                    while (true) {
                        int i19 = zza2 & i14;
                        int i20 = bArr3[i19] & 255;
                        if (i20 == 255) {
                            bArr3[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArr2[i17] = obj6;
                                objArr2[i17 ^ 1] = obj7;
                            }
                            i16++;
                        } else if (obj6.equals(objArr2[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj8 = objArr2[i21];
                            Objects.requireNonNull(obj8);
                            zzaj zzajVar = new zzaj(obj6, obj7, obj8);
                            objArr2[i21] = obj7;
                            obj = zzajVar;
                            break;
                        } else {
                            zza2 = i19 + 1;
                        }
                    }
                    i15++;
                    i13 = 1;
                }
                if (i16 == i12) {
                    bArr = bArr3;
                } else {
                    bArr2 = new Object[]{bArr3, Integer.valueOf(i16), obj};
                    c10 = 2;
                    c = 1;
                    obj = bArr2;
                }
            } else if (i11 <= 32768) {
                sArr = new short[i11];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i12; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object obj9 = objArr2[i25];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArr2[i25 ^ 1];
                    Objects.requireNonNull(obj10);
                    zzad.zza(obj9, obj10);
                    int zza3 = zzae.zza(obj9.hashCode());
                    while (true) {
                        int i26 = zza3 & i14;
                        char c12 = (char) sArr[i26];
                        if (c12 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArr2[i24] = obj9;
                                objArr2[i24 ^ 1] = obj10;
                            }
                            i22++;
                        } else if (obj9.equals(objArr2[c12])) {
                            int i27 = c12 ^ 1;
                            Object obj11 = objArr2[i27];
                            Objects.requireNonNull(obj11);
                            zzaj zzajVar2 = new zzaj(obj9, obj10, obj11);
                            objArr2[i27] = obj10;
                            obj = zzajVar2;
                            break;
                        } else {
                            zza3 = i26 + 1;
                        }
                    }
                }
                if (i22 != i12) {
                    c10 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i22), obj};
                    c = 1;
                }
                bArr = sArr;
            } else {
                int i28 = 1;
                sArr = new int[i11];
                Arrays.fill((int[]) sArr, -1);
                int i29 = 0;
                int i30 = 0;
                while (i29 < i12) {
                    int i31 = i30 + i30;
                    int i32 = i29 + i29;
                    Object obj12 = objArr2[i32];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArr2[i32 ^ i28];
                    Objects.requireNonNull(obj13);
                    zzad.zza(obj12, obj13);
                    int zza4 = zzae.zza(obj12.hashCode());
                    while (true) {
                        int i33 = zza4 & i14;
                        ?? r15 = sArr[i33];
                        if (r15 == c11) {
                            sArr[i33] = i31;
                            if (i30 < i29) {
                                objArr2[i31] = obj12;
                                objArr2[i31 ^ 1] = obj13;
                            }
                            i30++;
                        } else if (obj12.equals(objArr2[r15])) {
                            int i34 = r15 ^ 1;
                            Object obj14 = objArr2[i34];
                            Objects.requireNonNull(obj14);
                            zzaj zzajVar3 = new zzaj(obj12, obj13, obj14);
                            objArr2[i34] = obj13;
                            obj = zzajVar3;
                            break;
                        } else {
                            zza4 = i33 + 1;
                            c11 = 65535;
                        }
                    }
                    i29++;
                    i28 = 1;
                    c11 = 65535;
                }
                if (i30 != i12) {
                    c = 1;
                    c10 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i30), obj};
                }
                bArr = sArr;
            }
            c10 = 2;
            bArr2 = bArr;
            c = 1;
            obj = bArr2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzaj zzajVar4 = (zzaj) objArr3[c10];
            if (zzakVar != null) {
                zzakVar.zzc = zzajVar4;
                Object obj15 = objArr3[0];
                int intValue = ((Integer) objArr3[c]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                obj = obj15;
                i12 = intValue;
            } else {
                throw zzajVar4.zza();
            }
        }
        return new zzat(obj, objArr2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzal, java.util.Map
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
            int r1 = com.google.android.gms.internal.play_billing.zzae.zza(r1)
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
            int r1 = com.google.android.gms.internal.play_billing.zzae.zza(r1)
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
            int r6 = com.google.android.gms.internal.play_billing.zzae.zza(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzat.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    public final zzaf zza() {
        return new zzas(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    public final zzam zzd() {
        return new zzaq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    public final zzam zze() {
        return new zzar(this, new zzas(this.zzb, 0, this.zzd));
    }
}
