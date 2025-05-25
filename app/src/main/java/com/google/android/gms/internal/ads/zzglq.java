package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzglq {
    private ArrayList zza = new ArrayList();
    private zzgln zzb = zzgln.zza;
    private Integer zzc = null;

    public final zzglq zza(zzgea zzgeaVar, int i10, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgls(zzgeaVar, i10, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzglq zzb(zzgln zzglnVar) {
        if (this.zza != null) {
            this.zzb = zzglnVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzglq zzc(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzglu zzd() {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int zza = ((zzgls) arrayList.get(i10)).zza();
                    i10++;
                    if (zza == intValue) {
                        zzglu zzgluVar = new zzglu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                        this.zza = null;
                        return zzgluVar;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzglu zzgluVar2 = new zzglu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzgluVar2;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
