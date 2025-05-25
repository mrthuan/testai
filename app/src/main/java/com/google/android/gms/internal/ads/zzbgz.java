package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbgz extends zzaxn implements zzbha {
    public zzbgz() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbgx zzbgxVar = null;
        com.google.android.gms.ads.internal.client.zzcs zzcsVar = null;
        switch (i10) {
            case 2:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                List zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 4:
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 5:
                zzbfd zzk = zzk();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzk);
                return true;
            case 6:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 7:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 10:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdq zzh = zzh();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzh);
                return true;
            case 12:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbew zzi = zzi();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzi);
                return true;
            case 15:
                zzaxo.zzc(parcel);
                zzz((Bundle) zzaxo.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                zzaxo.zzc(parcel);
                boolean zzI = zzI((Bundle) zzaxo.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzI ? 1 : 0);
                return true;
            case 17:
                zzaxo.zzc(parcel);
                zzB((Bundle) zzaxo.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper zzm = zzm();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzm);
                return true;
            case 19:
                IObjectWrapper zzl = zzl();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzl);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof zzbgx) {
                        zzbgxVar = (zzbgx) queryLocalInterface;
                    } else {
                        zzbgxVar = new zzbgv(readStrongBinder);
                    }
                }
                zzaxo.zzc(parcel);
                zzF(zzbgxVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 24:
                boolean zzH = zzH();
                parcel2.writeNoException();
                int i12 = zzaxo.zza;
                parcel2.writeInt(zzH ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzcw K = com.google.android.gms.ads.internal.client.zzcv.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzy(K);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    if (queryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzcs) {
                        zzcsVar = (com.google.android.gms.ads.internal.client.zzcs) queryLocalInterface2;
                    } else {
                        zzcsVar = new com.google.android.gms.ads.internal.client.zzcq(readStrongBinder2);
                    }
                }
                zzaxo.zzc(parcel);
                zzD(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbfa zzj = zzj();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzj);
                return true;
            case 30:
                boolean zzG = zzG();
                parcel2.writeNoException();
                int i13 = zzaxo.zza;
                parcel2.writeInt(zzG ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdn zzg = zzg();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzg);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdg K2 = com.google.android.gms.ads.internal.client.zzdf.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzE(K2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
