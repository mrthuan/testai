package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbsl extends zzaxm implements zzbsn {
    public zzbsl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzH() {
        Parcel zzdb = zzdb(11, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzh(int i10, int i11, Intent intent) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zzaxo.zzd(zza, intent);
        zzdc(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzi() {
        zzdc(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzk(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzl(Bundle bundle) {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzm() {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzo() {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzr() {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzs(Bundle bundle) {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        Parcel zzdb = zzdb(6, zza);
        if (zzdb.readInt() != 0) {
            bundle.readFromParcel(zzdb);
        }
        zzdb.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzt() {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzu() {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzv() {
        zzdc(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzx() {
        zzdc(9, zza());
    }
}
