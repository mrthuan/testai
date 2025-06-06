package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
final class zzlz implements zzmg {
    private final zzmg[] zza;

    public zzlz(zzmg... zzmgVarArr) {
        this.zza = zzmgVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final zzmf zzb(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmg zzmgVar = zzmgVarArr[i10];
            if (zzmgVar.zzc(cls)) {
                return zzmgVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final boolean zzc(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzmgVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
