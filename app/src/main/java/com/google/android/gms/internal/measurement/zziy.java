package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
final class zziy extends zzis {
    private final zzja zza;

    public zziy(zzja zzjaVar, int i10) {
        super(zzjaVar.size(), i10);
        this.zza = zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
