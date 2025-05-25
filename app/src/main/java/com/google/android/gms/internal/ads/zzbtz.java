package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbtz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtz> CREATOR = new zzbua();
    @SafeParcelable.Field
    public final long zzA;
    @SafeParcelable.Field
    public final String zzB;
    @SafeParcelable.Field
    public final float zzC;
    @SafeParcelable.Field
    public final int zzD;
    @SafeParcelable.Field
    public final int zzE;
    @SafeParcelable.Field
    public final boolean zzF;
    @SafeParcelable.Field
    public final String zzG;
    @SafeParcelable.Field
    public final boolean zzH;
    @SafeParcelable.Field
    public final String zzI;
    @SafeParcelable.Field
    public final boolean zzJ;
    @SafeParcelable.Field
    public final int zzK;
    @SafeParcelable.Field
    public final Bundle zzL;
    @SafeParcelable.Field
    public final String zzM;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzdu zzN;
    @SafeParcelable.Field
    public final boolean zzO;
    @SafeParcelable.Field
    public final Bundle zzP;
    @SafeParcelable.Field
    public final String zzQ;
    @SafeParcelable.Field
    public final String zzR;
    @SafeParcelable.Field
    public final String zzS;
    @SafeParcelable.Field
    public final boolean zzT;
    @SafeParcelable.Field
    public final List zzU;
    @SafeParcelable.Field
    public final String zzV;
    @SafeParcelable.Field
    public final List zzW;
    @SafeParcelable.Field
    public final int zzX;
    @SafeParcelable.Field
    public final boolean zzY;
    @SafeParcelable.Field
    public final boolean zzZ;
    @SafeParcelable.Field
    public final int zza;
    @SafeParcelable.Field
    public final boolean zzaa;
    @SafeParcelable.Field
    public final ArrayList zzab;
    @SafeParcelable.Field
    public final String zzac;
    @SafeParcelable.Field
    public final zzblh zzad;
    @SafeParcelable.Field
    public final String zzae;
    @SafeParcelable.Field
    public final Bundle zzaf;
    @SafeParcelable.Field
    public final Bundle zzb;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzq zzd;
    @SafeParcelable.Field
    public final String zze;
    @SafeParcelable.Field
    public final ApplicationInfo zzf;
    @SafeParcelable.Field
    public final PackageInfo zzg;
    @SafeParcelable.Field
    public final String zzh;
    @SafeParcelable.Field
    public final String zzi;
    @SafeParcelable.Field
    public final String zzj;
    @SafeParcelable.Field
    public final VersionInfoParcel zzk;
    @SafeParcelable.Field
    public final Bundle zzl;
    @SafeParcelable.Field
    public final int zzm;
    @SafeParcelable.Field
    public final List zzn;
    @SafeParcelable.Field
    public final Bundle zzo;
    @SafeParcelable.Field
    public final boolean zzp;
    @SafeParcelable.Field
    public final int zzq;
    @SafeParcelable.Field
    public final int zzr;
    @SafeParcelable.Field
    public final float zzs;
    @SafeParcelable.Field
    public final String zzt;
    @SafeParcelable.Field
    public final long zzu;
    @SafeParcelable.Field
    public final String zzv;
    @SafeParcelable.Field
    public final List zzw;
    @SafeParcelable.Field
    public final String zzx;
    @SafeParcelable.Field
    public final zzbes zzy;
    @SafeParcelable.Field
    public final List zzz;

    @SafeParcelable.Constructor
    public zzbtz(@SafeParcelable.Param int i10, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzl zzlVar, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzq zzqVar, @SafeParcelable.Param String str, @SafeParcelable.Param ApplicationInfo applicationInfo, @SafeParcelable.Param PackageInfo packageInfo, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param VersionInfoParcel versionInfoParcel, @SafeParcelable.Param Bundle bundle2, @SafeParcelable.Param int i11, @SafeParcelable.Param List list, @SafeParcelable.Param Bundle bundle3, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i12, @SafeParcelable.Param int i13, @SafeParcelable.Param float f10, @SafeParcelable.Param String str5, @SafeParcelable.Param long j10, @SafeParcelable.Param String str6, @SafeParcelable.Param List list2, @SafeParcelable.Param String str7, @SafeParcelable.Param zzbes zzbesVar, @SafeParcelable.Param List list3, @SafeParcelable.Param long j11, @SafeParcelable.Param String str8, @SafeParcelable.Param float f11, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int i14, @SafeParcelable.Param int i15, @SafeParcelable.Param boolean z12, @SafeParcelable.Param String str9, @SafeParcelable.Param String str10, @SafeParcelable.Param boolean z13, @SafeParcelable.Param int i16, @SafeParcelable.Param Bundle bundle4, @SafeParcelable.Param String str11, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzdu zzduVar, @SafeParcelable.Param boolean z14, @SafeParcelable.Param Bundle bundle5, @SafeParcelable.Param String str12, @SafeParcelable.Param String str13, @SafeParcelable.Param String str14, @SafeParcelable.Param boolean z15, @SafeParcelable.Param List list4, @SafeParcelable.Param String str15, @SafeParcelable.Param List list5, @SafeParcelable.Param int i17, @SafeParcelable.Param boolean z16, @SafeParcelable.Param boolean z17, @SafeParcelable.Param boolean z18, @SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param String str16, @SafeParcelable.Param zzblh zzblhVar, @SafeParcelable.Param String str17, @SafeParcelable.Param Bundle bundle6) {
        List unmodifiableList;
        List unmodifiableList2;
        this.zza = i10;
        this.zzb = bundle;
        this.zzc = zzlVar;
        this.zzd = zzqVar;
        this.zze = str;
        this.zzf = applicationInfo;
        this.zzg = packageInfo;
        this.zzh = str2;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = versionInfoParcel;
        this.zzl = bundle2;
        this.zzm = i11;
        this.zzn = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.zzz = unmodifiableList;
        this.zzo = bundle3;
        this.zzp = z10;
        this.zzq = i12;
        this.zzr = i13;
        this.zzs = f10;
        this.zzt = str5;
        this.zzu = j10;
        this.zzv = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.zzw = unmodifiableList2;
        this.zzx = str7;
        this.zzy = zzbesVar;
        this.zzA = j11;
        this.zzB = str8;
        this.zzC = f11;
        this.zzH = z11;
        this.zzD = i14;
        this.zzE = i15;
        this.zzF = z12;
        this.zzG = str9;
        this.zzI = str10;
        this.zzJ = z13;
        this.zzK = i16;
        this.zzL = bundle4;
        this.zzM = str11;
        this.zzN = zzduVar;
        this.zzO = z14;
        this.zzP = bundle5;
        this.zzQ = str12;
        this.zzR = str13;
        this.zzS = str14;
        this.zzT = z15;
        this.zzU = list4;
        this.zzV = str15;
        this.zzW = list5;
        this.zzX = i17;
        this.zzY = z16;
        this.zzZ = z17;
        this.zzaa = z18;
        this.zzab = arrayList;
        this.zzac = str16;
        this.zzad = zzblhVar;
        this.zzae = str17;
        this.zzaf = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.b(parcel, 2, this.zzb);
        SafeParcelWriter.i(parcel, 3, this.zzc, i10);
        SafeParcelWriter.i(parcel, 4, this.zzd, i10);
        SafeParcelWriter.j(parcel, 5, this.zze);
        SafeParcelWriter.i(parcel, 6, this.zzf, i10);
        SafeParcelWriter.i(parcel, 7, this.zzg, i10);
        SafeParcelWriter.j(parcel, 8, this.zzh);
        SafeParcelWriter.j(parcel, 9, this.zzi);
        SafeParcelWriter.j(parcel, 10, this.zzj);
        SafeParcelWriter.i(parcel, 11, this.zzk, i10);
        SafeParcelWriter.b(parcel, 12, this.zzl);
        SafeParcelWriter.f(parcel, 13, this.zzm);
        SafeParcelWriter.l(parcel, 14, this.zzn);
        SafeParcelWriter.b(parcel, 15, this.zzo);
        SafeParcelWriter.a(parcel, 16, this.zzp);
        SafeParcelWriter.f(parcel, 18, this.zzq);
        SafeParcelWriter.f(parcel, 19, this.zzr);
        SafeParcelWriter.d(parcel, 20, this.zzs);
        SafeParcelWriter.j(parcel, 21, this.zzt);
        SafeParcelWriter.g(parcel, 25, this.zzu);
        SafeParcelWriter.j(parcel, 26, this.zzv);
        SafeParcelWriter.l(parcel, 27, this.zzw);
        SafeParcelWriter.j(parcel, 28, this.zzx);
        SafeParcelWriter.i(parcel, 29, this.zzy, i10);
        SafeParcelWriter.l(parcel, 30, this.zzz);
        SafeParcelWriter.g(parcel, 31, this.zzA);
        SafeParcelWriter.j(parcel, 33, this.zzB);
        SafeParcelWriter.d(parcel, 34, this.zzC);
        SafeParcelWriter.f(parcel, 35, this.zzD);
        SafeParcelWriter.f(parcel, 36, this.zzE);
        SafeParcelWriter.a(parcel, 37, this.zzF);
        SafeParcelWriter.j(parcel, 39, this.zzG);
        SafeParcelWriter.a(parcel, 40, this.zzH);
        SafeParcelWriter.j(parcel, 41, this.zzI);
        SafeParcelWriter.a(parcel, 42, this.zzJ);
        SafeParcelWriter.f(parcel, 43, this.zzK);
        SafeParcelWriter.b(parcel, 44, this.zzL);
        SafeParcelWriter.j(parcel, 45, this.zzM);
        SafeParcelWriter.i(parcel, 46, this.zzN, i10);
        SafeParcelWriter.a(parcel, 47, this.zzO);
        SafeParcelWriter.b(parcel, 48, this.zzP);
        SafeParcelWriter.j(parcel, 49, this.zzQ);
        SafeParcelWriter.j(parcel, 50, this.zzR);
        SafeParcelWriter.j(parcel, 51, this.zzS);
        SafeParcelWriter.a(parcel, 52, this.zzT);
        List list = this.zzU;
        if (list != null) {
            int o11 = SafeParcelWriter.o(53, parcel);
            int size = list.size();
            parcel.writeInt(size);
            for (int i12 = 0; i12 < size; i12++) {
                parcel.writeInt(((Integer) list.get(i12)).intValue());
            }
            SafeParcelWriter.p(o11, parcel);
        }
        SafeParcelWriter.j(parcel, 54, this.zzV);
        SafeParcelWriter.l(parcel, 55, this.zzW);
        SafeParcelWriter.f(parcel, 56, this.zzX);
        SafeParcelWriter.a(parcel, 57, this.zzY);
        SafeParcelWriter.a(parcel, 58, this.zzZ);
        SafeParcelWriter.a(parcel, 59, this.zzaa);
        SafeParcelWriter.l(parcel, 60, this.zzab);
        SafeParcelWriter.j(parcel, 61, this.zzac);
        SafeParcelWriter.i(parcel, 63, this.zzad, i10);
        SafeParcelWriter.j(parcel, 64, this.zzae);
        SafeParcelWriter.b(parcel, 65, this.zzaf);
        SafeParcelWriter.p(o10, parcel);
    }
}
