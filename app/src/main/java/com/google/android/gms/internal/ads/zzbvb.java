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
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvb> CREATOR = new zzbvc();
    @SafeParcelable.Field
    public final Bundle zza;
    @SafeParcelable.Field
    public final VersionInfoParcel zzb;
    @SafeParcelable.Field
    public final ApplicationInfo zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final List zze;
    @SafeParcelable.Field
    public final PackageInfo zzf;
    @SafeParcelable.Field
    public final String zzg;
    @SafeParcelable.Field
    public final String zzh;
    @SafeParcelable.Field
    public zzfhb zzi;
    @SafeParcelable.Field
    public String zzj;
    @SafeParcelable.Field
    public final boolean zzk;
    @SafeParcelable.Field
    public final boolean zzl;
    @SafeParcelable.Field
    public final Bundle zzm;

    @SafeParcelable.Constructor
    public zzbvb(@SafeParcelable.Param Bundle bundle, @SafeParcelable.Param VersionInfoParcel versionInfoParcel, @SafeParcelable.Param ApplicationInfo applicationInfo, @SafeParcelable.Param String str, @SafeParcelable.Param List list, @SafeParcelable.Param PackageInfo packageInfo, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param zzfhb zzfhbVar, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param Bundle bundle2) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfhbVar;
        this.zzj = str4;
        this.zzk = z10;
        this.zzl = z11;
        this.zzm = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.b(parcel, 1, bundle);
        SafeParcelWriter.i(parcel, 2, this.zzb, i10);
        SafeParcelWriter.i(parcel, 3, this.zzc, i10);
        SafeParcelWriter.j(parcel, 4, this.zzd);
        SafeParcelWriter.l(parcel, 5, this.zze);
        SafeParcelWriter.i(parcel, 6, this.zzf, i10);
        SafeParcelWriter.j(parcel, 7, this.zzg);
        SafeParcelWriter.j(parcel, 9, this.zzh);
        SafeParcelWriter.i(parcel, 10, this.zzi, i10);
        SafeParcelWriter.j(parcel, 11, this.zzj);
        SafeParcelWriter.a(parcel, 12, this.zzk);
        SafeParcelWriter.a(parcel, 13, this.zzl);
        SafeParcelWriter.b(parcel, 14, this.zzm);
        SafeParcelWriter.p(o10, parcel);
    }
}
