package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzboo extends zzaxn implements zzbop {
    public zzboo() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbos zzbosVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder);
                    }
                }
                zzbos zzbosVar2 = zzbosVar;
                zzaxo.zzc(parcel);
                zzu(K, zzqVar, zzlVar, readString, zzbosVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface2;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder2);
                    }
                }
                zzaxo.zzc(parcel);
                zzx(K2, zzlVar2, readString2, zzbosVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface3;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder3);
                    }
                }
                zzbos zzbosVar3 = zzbosVar;
                zzaxo.zzc(parcel);
                zzv(K3, zzqVar2, zzlVar3, readString3, readString4, zzbosVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper K4 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface4;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder4);
                    }
                }
                zzbos zzbosVar4 = zzbosVar;
                zzaxo.zzc(parcel);
                zzy(K4, zzlVar4, readString5, readString6, zzbosVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper K5 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString7 = parcel.readString();
                zzbvy zzb = zzbvx.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzaxo.zzc(parcel);
                zzp(K5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzaxo.zzc(parcel);
                zzs((com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i12 = zzaxo.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper K6 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface5;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder5);
                    }
                }
                zzbos zzbosVar5 = zzbosVar;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzaxo.zzc(parcel);
                zzz(K6, zzlVar6, readString10, readString11, zzbosVar5, (zzbes) zzaxo.zza(parcel, zzbes.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzg);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzaxo.zzc(parcel);
                zzB((com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper K7 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzD(K7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i13 = zzaxo.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper K8 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbvy zzb2 = zzbvx.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzaxo.zzc(parcel);
                zzr(K8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbfx zzi = zzi();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdq zzh = zzh();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzh);
                return true;
            case 27:
                zzbpb zzk = zzk();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper K9 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface6;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder6);
                    }
                }
                zzaxo.zzc(parcel);
                zzA(K9, zzlVar7, readString14, zzbosVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper K10 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzK(K10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper K11 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbkz zzb3 = zzbky.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzblf.CREATOR);
                zzaxo.zzc(parcel);
                zzq(K11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper K12 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface7;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder7);
                    }
                }
                zzaxo.zzc(parcel);
                zzC(K12, zzlVar8, readString15, zzbosVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbra zzl = zzl();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzl);
                return true;
            case 34:
                zzbra zzm = zzm();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper K13 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface8;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder8);
                    }
                }
                zzbos zzbosVar6 = zzbosVar;
                zzaxo.zzc(parcel);
                zzw(K13, zzqVar3, zzlVar9, readString16, readString17, zzbosVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbov zzj = zzj();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper K14 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzJ(K14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper K15 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface9 instanceof zzbos) {
                        zzbosVar = (zzbos) queryLocalInterface9;
                    } else {
                        zzbosVar = new zzboq(readStrongBinder9);
                    }
                }
                zzaxo.zzc(parcel);
                zzt(K15, zzlVar10, readString18, zzbosVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper K16 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzH(K16);
                parcel2.writeNoException();
                return true;
        }
    }
}
