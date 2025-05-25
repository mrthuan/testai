package com.google.android.gms.measurement.internal;

import a8.g0;
import a8.i2;
import a8.j0;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class zzej extends com.google.android.gms.internal.measurement.zzbn implements zzek {
    public zzej() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        ArrayList arrayList;
        switch (i10) {
            case 1:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).I((zzaw) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzaw.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).d((zzlj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzlj.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).L((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                zzaw zzawVar = (zzaw) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzaw.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzgw zzgwVar = (zzgw) this;
                Preconditions.j(zzawVar);
                Preconditions.f(readString);
                zzgwVar.N0(readString, true);
                zzgwVar.L0(new g0(0, zzgwVar, zzawVar, readString));
                parcel2.writeNoException();
                break;
            case 6:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).b((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                zzq zzqVar = (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR);
                boolean zzf = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzgw zzgwVar2 = (zzgw) this;
                zzgwVar2.M0(zzqVar);
                String str = zzqVar.f11920a;
                Preconditions.j(str);
                zzlg zzlgVar = zzgwVar2.f11800a;
                try {
                    List<i2> list = (List) zzlgVar.zzaB().s(new j0(zzgwVar2, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (i2 i2Var : list) {
                        if (zzf || !zzlo.a0(i2Var.c)) {
                            arrayList.add(new zzlj(i2Var));
                        }
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    zzeu zzaA = zzlgVar.zzaA();
                    zzaA.f11712f.c(zzeu.v(str), "Failed to get user properties. appId", e10);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                byte[] j10 = ((zzgw) this).j((zzaw) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzaw.CREATOR), readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(j10);
                break;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).S(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                break;
            case 11:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                String p10 = ((zzgw) this).p((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(p10);
                break;
            case 12:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).t0((zzac) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzac.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                zzac zzacVar = (zzac) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzac.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzgw zzgwVar3 = (zzgw) this;
                Preconditions.j(zzacVar);
                Preconditions.j(zzacVar.c);
                Preconditions.f(zzacVar.f11516a);
                zzgwVar3.N0(zzacVar.f11516a, true);
                zzgwVar3.L0(new e0(2, zzgwVar3, new zzac(zzacVar)));
                parcel2.writeNoException();
                break;
            case 14:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List f02 = ((zzgw) this).f0(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbo.zzf(parcel), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(f02);
                break;
            case 15:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzf2 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List e11 = ((zzgw) this).e(readString6, readString7, readString8, zzf2);
                parcel2.writeNoException();
                parcel2.writeTypedList(e11);
                break;
            case 16:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List M = ((zzgw) this).M(parcel.readString(), parcel.readString(), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(M);
                break;
            case 17:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List t4 = ((zzgw) this).t(readString9, readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeTypedList(t4);
                break;
            case 18:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).m0((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).c((Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, Bundle.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                ((zzgw) this).e0((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
