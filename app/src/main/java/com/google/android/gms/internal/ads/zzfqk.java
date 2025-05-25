package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfqk extends zzaxm implements zzfqm {
    public zzfqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final void zze(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(null);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final void zzf() {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final void zzi(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzdc(5, zza);
    }
}
