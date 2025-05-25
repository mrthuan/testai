package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public abstract class zzam extends zzaf implements Set {
    private transient zzai zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
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
    public final int hashCode() {
        return zzau.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public zzai zzd() {
        zzai zzaiVar = this.zza;
        if (zzaiVar == null) {
            zzai zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzaiVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzav iterator();

    public zzai zzh() {
        Object[] array = toArray();
        int i10 = zzai.zzd;
        return zzai.zzi(array, array.length);
    }
}
