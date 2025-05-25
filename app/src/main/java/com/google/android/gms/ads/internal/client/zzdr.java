package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzdr extends zzaxm implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void q0(boolean z10) {
        Parcel zza = zza();
        int i10 = zzaxo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        zzdc(1, zza());
    }
}
