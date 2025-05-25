package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzei extends com.google.android.gms.internal.measurement.zzbm implements zzek {
    public zzei(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void I(zzaw zzawVar, zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzawVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void L(zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List M(String str, String str2, zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        Parcel zzb = zzb(16, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzac.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void S(long j10, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void b(zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void c(Bundle bundle, zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void d(zzlj zzljVar, zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzljVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List e(String str, String str2, String str3, boolean z10) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.zzbo.zza;
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzb = zzb(15, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzlj.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void e0(zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List f0(String str, String str2, boolean z10, zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.zzbo.zza;
        zza.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        Parcel zzb = zzb(14, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzlj.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final byte[] j(zzaw zzawVar, String str) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzawVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void m0(zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final String p(zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List t(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzac.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void t0(zzac zzacVar, zzq zzqVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzacVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzqVar);
        zzc(12, zza);
    }
}
