package com.google.android.gms.internal.consent_sdk;

import b.a;
import com.google.ads.mediation.inmobi.InMobiNetworkKeys;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public abstract class zzde extends zzda implements Set {
    private transient zzdd zza;

    public static int zzf(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzde zzi() {
        return zzdh.zza;
    }

    public static zzde zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", InMobiNetworkKeys.IAB_US_PRIVACY_STRING);
    }

    private static zzde zzl(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int zzf = zzf(i10);
                Object[] objArr2 = new Object[zzf];
                int i11 = zzf - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int zza = zzcz.zza(hashCode);
                        while (true) {
                            int i15 = zza & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                zza++;
                            }
                        }
                    } else {
                        throw new NullPointerException(a.c("at index ", i14));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new zzdi(obj3);
                }
                if (zzf(i13) >= zzf / 2) {
                    if (i13 < 3) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new zzdh(objArr, i12, objArr2, i11, i13);
                }
                return zzl(i13, objArr);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdi(obj4);
        }
        return zzdh.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzde) && zzk() && ((zzde) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i10;
        int i11 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdj iterator();

    public final zzdd zzg() {
        zzdd zzddVar = this.zza;
        if (zzddVar == null) {
            zzdd zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzddVar;
    }

    public zzdd zzh() {
        Object[] array = toArray();
        int i10 = zzdd.zzd;
        return zzdd.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
