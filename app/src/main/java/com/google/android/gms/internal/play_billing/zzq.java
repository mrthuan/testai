package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzq extends zzv implements zzs {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zza(int i10, String str, String str2) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(5, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zzc(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(10, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzd(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(902, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zze(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(12, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzf(int i10, String str, String str2, String str3, String str4) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        Parcel zzv = zzv(3, zzu);
        Bundle bundle = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzg(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(8, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzh(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(6);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(9, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzi(int i10, String str, String str2, String str3) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        Parcel zzv = zzv(4, zzu);
        Bundle bundle = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzj(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(11, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzk(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(2, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzl(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        zzx.zzc(zzu, bundle2);
        Parcel zzv = zzv(901, zzu);
        Bundle bundle3 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzm(int i10, String str, Bundle bundle, zzd zzdVar) {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzdVar);
        zzx(1501, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzn(int i10, String str, Bundle bundle, zzf zzfVar) {
        Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzfVar);
        zzx(1801, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzo(int i10, String str, Bundle bundle, zzh zzhVar) {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzhVar);
        zzx(1601, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzp(int i10, String str, Bundle bundle, zzj zzjVar) {
        Parcel zzu = zzu();
        zzu.writeInt(18);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzjVar);
        zzw(1301, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzq(int i10, String str, Bundle bundle, zzl zzlVar) {
        Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzlVar);
        zzx(1901, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzr(int i10, String str, Bundle bundle, zzn zznVar) {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zznVar);
        zzx(1401, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzs(int i10, String str, Bundle bundle, zzp zzpVar) {
        Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzpVar);
        zzx(1701, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzt(int i10, String str, Bundle bundle, zzu zzuVar) {
        Parcel zzu = zzu();
        zzu.writeInt(12);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzuVar);
        zzw(Constants.CP_UTF16_BE, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zzy(int i10, String str, String str2) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(1, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }
}
