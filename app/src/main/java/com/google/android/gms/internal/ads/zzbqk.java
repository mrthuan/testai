package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbqk extends zzaxn implements zzbql {
    public zzbqk() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbql zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzbql) {
            return (zzbql) queryLocalInterface;
        }
        return new zzbqj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbqo zzbqoVar = null;
        zzbpw zzbpuVar = null;
        zzbqf zzbqdVar = null;
        zzbpz zzbpxVar = null;
        zzbqi zzbqgVar = null;
        zzbqf zzbqdVar2 = null;
        zzbqi zzbqgVar2 = null;
        zzbqc zzbqaVar = null;
        zzbpz zzbpxVar2 = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 10) {
                            if (i10 != 11) {
                                switch (i10) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof zzbpz) {
                                                zzbpxVar2 = (zzbpz) queryLocalInterface;
                                            } else {
                                                zzbpxVar2 = new zzbpx(readStrongBinder);
                                            }
                                        }
                                        zzbpz zzbpzVar = zzbpxVar2;
                                        zzaxo.zzc(parcel);
                                        zzj(readString, readString2, zzlVar, K, zzbpzVar, zzbor.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof zzbqc) {
                                                zzbqaVar = (zzbqc) queryLocalInterface2;
                                            } else {
                                                zzbqaVar = new zzbqa(readStrongBinder2);
                                            }
                                        }
                                        zzbqc zzbqcVar = zzbqaVar;
                                        zzbos zzb = zzbor.zzb(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        zzl(readString3, readString4, zzlVar2, K2, zzbqcVar, zzb);
                                        parcel2.writeNoException();
                                        break;
                                    case 15:
                                        IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        boolean zzs = zzs(K3);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzs ? 1 : 0);
                                        break;
                                    case 16:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K4 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof zzbqi) {
                                                zzbqgVar2 = (zzbqi) queryLocalInterface3;
                                            } else {
                                                zzbqgVar2 = new zzbqg(readStrongBinder3);
                                            }
                                        }
                                        zzbqi zzbqiVar = zzbqgVar2;
                                        zzbos zzb2 = zzbor.zzb(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        zzp(readString5, readString6, zzlVar3, K4, zzbqiVar, zzb2);
                                        parcel2.writeNoException();
                                        break;
                                    case 17:
                                        IObjectWrapper K5 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        boolean zzt = zzt(K5);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzt ? 1 : 0);
                                        break;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K6 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof zzbqf) {
                                                zzbqdVar2 = (zzbqf) queryLocalInterface4;
                                            } else {
                                                zzbqdVar2 = new zzbqd(readStrongBinder4);
                                            }
                                        }
                                        zzbqf zzbqfVar = zzbqdVar2;
                                        zzbos zzb3 = zzbor.zzb(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        zzm(readString7, readString8, zzlVar4, K6, zzbqfVar, zzb3);
                                        parcel2.writeNoException();
                                        break;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        zzaxo.zzc(parcel);
                                        zzq(readString9);
                                        parcel2.writeNoException();
                                        break;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K7 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof zzbqi) {
                                                zzbqgVar = (zzbqi) queryLocalInterface5;
                                            } else {
                                                zzbqgVar = new zzbqg(readStrongBinder5);
                                            }
                                        }
                                        zzbqi zzbqiVar2 = zzbqgVar;
                                        zzbos zzb4 = zzbor.zzb(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        zzo(readString10, readString11, zzlVar5, K7, zzbqiVar2, zzb4);
                                        parcel2.writeNoException();
                                        break;
                                    case 21:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K8 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof zzbpz) {
                                                zzbpxVar = (zzbpz) queryLocalInterface6;
                                            } else {
                                                zzbpxVar = new zzbpx(readStrongBinder6);
                                            }
                                        }
                                        zzbpz zzbpzVar2 = zzbpxVar;
                                        zzaxo.zzc(parcel);
                                        zzk(readString12, readString13, zzlVar6, K8, zzbpzVar2, zzbor.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K9 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof zzbqf) {
                                                zzbqdVar = (zzbqf) queryLocalInterface7;
                                            } else {
                                                zzbqdVar = new zzbqd(readStrongBinder7);
                                            }
                                        }
                                        zzbqf zzbqfVar2 = zzbqdVar;
                                        zzaxo.zzc(parcel);
                                        zzn(readString14, readString15, zzlVar7, K9, zzbqfVar2, zzbor.zzb(parcel.readStrongBinder()), (zzbes) zzaxo.zza(parcel, zzbes.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 23:
                                        String readString16 = parcel.readString();
                                        String readString17 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper K10 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        IBinder readStrongBinder8 = parcel.readStrongBinder();
                                        if (readStrongBinder8 != null) {
                                            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                            if (queryLocalInterface8 instanceof zzbpw) {
                                                zzbpuVar = (zzbpw) queryLocalInterface8;
                                            } else {
                                                zzbpuVar = new zzbpu(readStrongBinder8);
                                            }
                                        }
                                        zzbpw zzbpwVar = zzbpuVar;
                                        zzbos zzb5 = zzbor.zzb(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        zzi(readString16, readString17, zzlVar8, K10, zzbpwVar, zzb5);
                                        parcel2.writeNoException();
                                        break;
                                    case 24:
                                        IObjectWrapper K11 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                                        zzaxo.zzc(parcel);
                                        boolean zzr = zzr(K11);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzr ? 1 : 0);
                                        break;
                                    default:
                                        return false;
                                }
                            } else {
                                parcel.createStringArray();
                                Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                                zzaxo.zzc(parcel);
                                parcel2.writeNoException();
                            }
                        } else {
                            IObjectWrapper.Stub.K(parcel.readStrongBinder());
                            zzaxo.zzc(parcel);
                            parcel2.writeNoException();
                        }
                    } else {
                        com.google.android.gms.ads.internal.client.zzdq zze = zze();
                        parcel2.writeNoException();
                        zzaxo.zzf(parcel2, zze);
                    }
                } else {
                    zzbra zzg = zzg();
                    parcel2.writeNoException();
                    zzaxo.zze(parcel2, zzg);
                }
            } else {
                zzbra zzf = zzf();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzf);
            }
        } else {
            IObjectWrapper K12 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
            String readString18 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaxo.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaxo.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 != null) {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface9 instanceof zzbqo) {
                    zzbqoVar = (zzbqo) queryLocalInterface9;
                } else {
                    zzbqoVar = new zzbqm(readStrongBinder9);
                }
            }
            zzbqo zzbqoVar2 = zzbqoVar;
            zzaxo.zzc(parcel);
            zzh(K12, readString18, bundle, bundle2, zzqVar, zzbqoVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
