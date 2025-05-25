package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbwf extends zzaxn implements zzbwg {
    public zzbwf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwg zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzbwg) {
            return (zzbwg) queryLocalInterface;
        }
        return new zzbwe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbwn zzbwnVar = null;
        zzbwn zzbwnVar2 = null;
        com.google.android.gms.ads.internal.client.zzdd zzddVar = null;
        zzbwo zzbwoVar = null;
        zzbwj zzbwjVar = null;
        switch (i10) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzbwn) {
                        zzbwnVar = (zzbwn) queryLocalInterface;
                    } else {
                        zzbwnVar = new zzbwl(readStrongBinder);
                    }
                }
                zzaxo.zzc(parcel);
                zzf(zzlVar, zzbwnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzbwj) {
                        zzbwjVar = (zzbwj) queryLocalInterface2;
                    } else {
                        zzbwjVar = new zzbwh(readStrongBinder2);
                    }
                }
                zzaxo.zzc(parcel);
                zzk(zzbwjVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i12 = zzaxo.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzm(K);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzbwo) {
                        zzbwoVar = (zzbwo) queryLocalInterface3;
                    } else {
                        zzbwoVar = new zzbwo(readStrongBinder3);
                    }
                }
                zzaxo.zzc(parcel);
                zzp(zzbwoVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaxo.zzc(parcel);
                zzl((zzbwu) zzaxo.zza(parcel, zzbwu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    if (queryLocalInterface4 instanceof com.google.android.gms.ads.internal.client.zzdd) {
                        zzddVar = (com.google.android.gms.ads.internal.client.zzdd) queryLocalInterface4;
                    } else {
                        zzddVar = new com.google.android.gms.ads.internal.client.zzdb(readStrongBinder4);
                    }
                }
                zzaxo.zzc(parcel);
                zzi(zzddVar);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzb);
                return true;
            case 10:
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                boolean zzg = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzn(K2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwd zzd = zzd();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg K3 = com.google.android.gms.ads.internal.client.zzdf.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzj(K3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface5 instanceof zzbwn) {
                        zzbwnVar2 = (zzbwn) queryLocalInterface5;
                    } else {
                        zzbwnVar2 = new zzbwl(readStrongBinder5);
                    }
                }
                zzaxo.zzc(parcel);
                zzg(zzlVar2, zzbwnVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
