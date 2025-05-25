package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzazr;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzbcq;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzbt extends zzaxn implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzbu) {
            return (zzbu) queryLocalInterface;
        }
        return new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbh zzbhVar = null;
        zzci zzciVar = null;
        zzbk zzbkVar = null;
        zzdg zzdgVar = null;
        zzby zzbyVar = null;
        zzcf zzcfVar = null;
        zzbe zzbeVar = null;
        zzcb zzcbVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzaa = zzaa();
                parcel2.writeNoException();
                int i12 = zzaxo.zza;
                parcel2.writeInt(zzaa ? 1 : 0);
                return true;
            case 4:
                zzaxo.zzc(parcel);
                boolean zzab = zzab((zzl) zzaxo.zza(parcel, zzl.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbh) {
                        zzbhVar = (zzbh) queryLocalInterface;
                    } else {
                        zzbhVar = new zzbf(readStrongBinder);
                    }
                }
                zzaxo.zzc(parcel);
                zzD(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzcb) {
                        zzcbVar = (zzcb) queryLocalInterface2;
                    } else {
                        zzcbVar = new zzbz(readStrongBinder2);
                    }
                }
                zzaxo.zzc(parcel);
                zzG(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzg);
                return true;
            case 13:
                zzaxo.zzc(parcel);
                zzF((zzq) zzaxo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsw zzb = zzbsv.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbsz zzb2 = zzbsy.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzaxo.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbcr zzb3 = zzbcq.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzbe) {
                        zzbeVar = (zzbe) queryLocalInterface3;
                    } else {
                        zzbeVar = new zzbc(readStrongBinder3);
                    }
                }
                zzaxo.zzc(parcel);
                zzC(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzcf) {
                        zzcfVar = (zzcf) queryLocalInterface4;
                    } else {
                        zzcfVar = new zzcf(readStrongBinder4);
                    }
                }
                zzaxo.zzc(parcel);
                zzac(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                int i13 = zzaxo.zza;
                parcel2.writeInt(zzZ ? 1 : 0);
                return true;
            case 24:
                zzbvt zzb4 = zzbvs.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzaxo.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzl = zzl();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzl);
                return true;
            case 29:
                zzaxo.zzc(parcel);
                zzU((zzfk) zzaxo.zza(parcel, zzfk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzaxo.zzc(parcel);
                zzK((zzdu) zzaxo.zza(parcel, zzdu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzcb zzj = zzj();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzj);
                return true;
            case 33:
                zzbh zzi = zzi();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzi);
                return true;
            case 34:
                boolean zzg3 = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzby) {
                        zzbyVar = (zzby) queryLocalInterface5;
                    } else {
                        zzbyVar = new zzbw(readStrongBinder5);
                    }
                }
                zzaxo.zzc(parcel);
                zzE(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzaxo.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzaxo.zzc(parcel);
                zzI((zzw) zzaxo.zza(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzazs zze = zzazr.zze(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdn zzk = zzk();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzdg) {
                        zzdgVar = (zzdg) queryLocalInterface6;
                    } else {
                        zzdgVar = new zzde(readStrongBinder6);
                    }
                }
                zzaxo.zzc(parcel);
                zzP(zzdgVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar = (zzl) zzaxo.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzbk) {
                        zzbkVar = (zzbk) queryLocalInterface7;
                    } else {
                        zzbkVar = new zzbi(readStrongBinder7);
                    }
                }
                zzaxo.zzc(parcel);
                zzy(zzlVar, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzW(K);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzci) {
                        zzciVar = (zzci) queryLocalInterface8;
                    } else {
                        zzciVar = new zzcg(readStrongBinder8);
                    }
                }
                zzaxo.zzc(parcel);
                zzJ(zzciVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzY = zzY();
                parcel2.writeNoException();
                int i14 = zzaxo.zza;
                parcel2.writeInt(zzY ? 1 : 0);
                return true;
        }
    }
}
