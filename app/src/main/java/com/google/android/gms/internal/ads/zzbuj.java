package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbuj extends zzaxn implements zzbuk {
    public zzbuj() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbuu zzbuuVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                return false;
                            }
                            String readString = parcel.readString();
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface instanceof zzbuu) {
                                    zzbuuVar = (zzbuu) queryLocalInterface;
                                } else {
                                    zzbuuVar = new zzbus(readStrongBinder);
                                }
                            }
                            zzaxo.zzc(parcel);
                            zzh(readString, zzbuuVar);
                            parcel2.writeNoException();
                        } else {
                            zzbvb zzbvbVar = (zzbvb) zzaxo.zza(parcel, zzbvb.CREATOR);
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface2 instanceof zzbuu) {
                                    zzbuuVar = (zzbuu) queryLocalInterface2;
                                } else {
                                    zzbuuVar = new zzbus(readStrongBinder2);
                                }
                            }
                            zzaxo.zzc(parcel);
                            zze(zzbvbVar, zzbuuVar);
                            parcel2.writeNoException();
                        }
                    } else {
                        zzbvb zzbvbVar2 = (zzbvb) zzaxo.zza(parcel, zzbvb.CREATOR);
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                            if (queryLocalInterface3 instanceof zzbuu) {
                                zzbuuVar = (zzbuu) queryLocalInterface3;
                            } else {
                                zzbuuVar = new zzbus(readStrongBinder3);
                            }
                        }
                        zzaxo.zzc(parcel);
                        zzf(zzbvbVar2, zzbuuVar);
                        parcel2.writeNoException();
                    }
                } else {
                    zzbvb zzbvbVar3 = (zzbvb) zzaxo.zza(parcel, zzbvb.CREATOR);
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                        if (queryLocalInterface4 instanceof zzbuu) {
                            zzbuuVar = (zzbuu) queryLocalInterface4;
                        } else {
                            zzbuuVar = new zzbus(readStrongBinder4);
                        }
                    }
                    zzaxo.zzc(parcel);
                    zzg(zzbvbVar3, zzbuuVar);
                    parcel2.writeNoException();
                }
            } else {
                zzbtz zzbtzVar = (zzbtz) zzaxo.zza(parcel, zzbtz.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface5 instanceof zzbul) {
                        zzbul zzbulVar = (zzbul) queryLocalInterface5;
                    }
                }
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
            }
        } else {
            zzbtz zzbtzVar2 = (zzbtz) zzaxo.zza(parcel, zzbtz.CREATOR);
            zzaxo.zzc(parcel);
            parcel2.writeNoException();
            zzaxo.zze(parcel2, null);
        }
        return true;
    }
}
