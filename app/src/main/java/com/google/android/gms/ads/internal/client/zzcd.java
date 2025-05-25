package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbjz;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzdjv;
import com.google.android.gms.internal.ads.zzfee;
import com.google.android.gms.internal.ads.zzfei;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzcd extends zzaxn implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzaxo.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbom zzf = zzbol.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu k10 = ((ClientApi) this).k(K, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, k10);
                return true;
            case 2:
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzaxo.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbom zzf2 = zzbol.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu o02 = ((ClientApi) this).o0(K2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, o02);
                return true;
            case 3:
                IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbom zzf3 = zzbol.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbq y02 = ((ClientApi) this).y0(K3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, y02);
                return true;
            case 4:
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper K4 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                IObjectWrapper K5 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzbfh V = ((ClientApi) this).V(K4, K5);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, V);
                return true;
            case 6:
                IObjectWrapper K6 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbom zzf4 = zzbol.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaxo.zzc(parcel);
                Context context = (Context) ObjectWrapper.L0(K6);
                zzfee zzw = zzcgj.zzb(context, zzf4, readInt4).zzw();
                zzw.zzb(context);
                zzfei zzb = zzw.zzc().zzb();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzb);
                return true;
            case 7:
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper K7 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzbsn zzm = ((ClientApi) this).zzm(K7);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper K8 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzco zzg = ((ClientApi) this).zzg(K8, readInt5);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu Q = ((ClientApi) this).Q(IObjectWrapper.Stub.K(parcel.readStrongBinder()), (zzq) zzaxo.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, Q);
                return true;
            case 11:
                IObjectWrapper K9 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                IObjectWrapper K10 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                IObjectWrapper K11 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzdjv zzdjvVar = new zzdjv((View) ObjectWrapper.L0(K9), (HashMap) ObjectWrapper.L0(K10), (HashMap) ObjectWrapper.L0(K11));
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzdjvVar);
                return true;
            case 12:
                IObjectWrapper K12 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbom zzf5 = zzbol.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbwg a02 = ((ClientApi) this).a0(K12, readString5, zzf5, readInt7);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, a02);
                return true;
            case 13:
                IObjectWrapper K13 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzaxo.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbom zzf6 = zzbol.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu a10 = ((ClientApi) this).a(K13, zzqVar3, readString6, zzf6, readInt8);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, a10);
                return true;
            case 14:
                IObjectWrapper K14 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbom zzf7 = zzbol.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbym i12 = ((ClientApi) this).i(K14, zzf7, readInt9);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, i12);
                return true;
            case 15:
                IObjectWrapper K15 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbom zzf8 = zzbol.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbsg C = ((ClientApi) this).C(K15, zzf8, readInt10);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, C);
                return true;
            case 16:
                IObjectWrapper K16 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbom zzf9 = zzbol.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbjw zzc = zzbjv.zzc(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzbjz p02 = ((ClientApi) this).p0(K16, zzf9, readInt11, zzc);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, p02);
                return true;
            case 17:
                IObjectWrapper K17 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbom zzf10 = zzbol.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzdj v02 = ((ClientApi) this).v0(K17, zzf10, readInt12);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, v02);
                return true;
            default:
                return false;
        }
    }
}
