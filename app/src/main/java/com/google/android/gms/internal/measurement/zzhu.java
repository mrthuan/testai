package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l10, boolean z10) {
        super(zzhyVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String str = (String) obj;
            return null;
        }
    }
}
