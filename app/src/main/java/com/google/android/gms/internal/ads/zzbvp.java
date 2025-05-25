package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbvp extends zzaxn implements zzbvq {
    public zzbvp() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                zzbvt zzbvtVar = null;
                zzbvo zzbvoVar = null;
                com.google.android.gms.ads.internal.client.zzby zzbyVar = null;
                if (i10 != 3) {
                    if (i10 != 34) {
                        switch (i10) {
                            case 5:
                                boolean zzs = zzs();
                                parcel2.writeNoException();
                                int i12 = zzaxo.zza;
                                parcel2.writeInt(zzs ? 1 : 0);
                                break;
                            case 6:
                                zzh();
                                parcel2.writeNoException();
                                break;
                            case 7:
                                zzj();
                                parcel2.writeNoException();
                                break;
                            case 8:
                                zze();
                                parcel2.writeNoException();
                                break;
                            case 9:
                                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                zzaxo.zzc(parcel);
                                zzi(K);
                                parcel2.writeNoException();
                                break;
                            case 10:
                                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                zzaxo.zzc(parcel);
                                zzk(K2);
                                parcel2.writeNoException();
                                break;
                            case 11:
                                IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                zzaxo.zzc(parcel);
                                zzf(K3);
                                parcel2.writeNoException();
                                break;
                            case 12:
                                String zzd = zzd();
                                parcel2.writeNoException();
                                parcel2.writeString(zzd);
                                break;
                            case 13:
                                String readString = parcel.readString();
                                zzaxo.zzc(parcel);
                                zzp(readString);
                                parcel2.writeNoException();
                                break;
                            case 14:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                                    if (queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzby) {
                                        zzbyVar = (com.google.android.gms.ads.internal.client.zzby) queryLocalInterface;
                                    } else {
                                        zzbyVar = new com.google.android.gms.ads.internal.client.zzbw(readStrongBinder);
                                    }
                                }
                                zzaxo.zzc(parcel);
                                zzl(zzbyVar);
                                parcel2.writeNoException();
                                break;
                            case 15:
                                Bundle zzb = zzb();
                                parcel2.writeNoException();
                                zzaxo.zze(parcel2, zzb);
                                break;
                            case 16:
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface2 instanceof zzbvo) {
                                        zzbvoVar = (zzbvo) queryLocalInterface2;
                                    } else {
                                        zzbvoVar = new zzbvo(readStrongBinder2);
                                    }
                                }
                                zzaxo.zzc(parcel);
                                zzu(zzbvoVar);
                                parcel2.writeNoException();
                                break;
                            case 17:
                                parcel.readString();
                                zzaxo.zzc(parcel);
                                parcel2.writeNoException();
                                break;
                            case 18:
                                IObjectWrapper K4 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                zzaxo.zzc(parcel);
                                zzr(K4);
                                parcel2.writeNoException();
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                zzaxo.zzc(parcel);
                                zzm(readString2);
                                parcel2.writeNoException();
                                break;
                            case 20:
                                boolean zzt = zzt();
                                parcel2.writeNoException();
                                int i13 = zzaxo.zza;
                                parcel2.writeInt(zzt ? 1 : 0);
                                break;
                            case 21:
                                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                                parcel2.writeNoException();
                                zzaxo.zzf(parcel2, zzc);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        boolean zzg = zzaxo.zzg(parcel);
                        zzaxo.zzc(parcel);
                        zzn(zzg);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface3 instanceof zzbvt) {
                            zzbvtVar = (zzbvt) queryLocalInterface3;
                        } else {
                            zzbvtVar = new zzbvr(readStrongBinder3);
                        }
                    }
                    zzaxo.zzc(parcel);
                    zzo(zzbvtVar);
                    parcel2.writeNoException();
                }
            } else {
                zzq();
                parcel2.writeNoException();
            }
        } else {
            zzaxo.zzc(parcel);
            zzg((zzbvu) zzaxo.zza(parcel, zzbvu.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
