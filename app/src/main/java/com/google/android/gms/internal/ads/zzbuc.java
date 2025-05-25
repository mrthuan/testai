package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbuc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuc> CREATOR = new zzbud();
    @SafeParcelable.Field
    public final ApplicationInfo zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    public final PackageInfo zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final int zze;
    @SafeParcelable.Field
    public final String zzf;
    @SafeParcelable.Field
    public final List zzg;
    @SafeParcelable.Field
    public final boolean zzh;
    @SafeParcelable.Field
    public final boolean zzi;

    @SafeParcelable.Constructor
    public zzbuc(@SafeParcelable.Param ApplicationInfo applicationInfo, @SafeParcelable.Param String str, @SafeParcelable.Param PackageInfo packageInfo, @SafeParcelable.Param String str2, @SafeParcelable.Param int i10, @SafeParcelable.Param String str3, @SafeParcelable.Param List list, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.zzb = str;
        this.zza = applicationInfo;
        this.zzc = packageInfo;
        this.zzd = str2;
        this.zze = i10;
        this.zzf = str3;
        this.zzg = list;
        this.zzh = z10;
        this.zzi = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ApplicationInfo applicationInfo = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 1, applicationInfo, i10);
        SafeParcelWriter.j(parcel, 2, this.zzb);
        SafeParcelWriter.i(parcel, 3, this.zzc, i10);
        SafeParcelWriter.j(parcel, 4, this.zzd);
        SafeParcelWriter.f(parcel, 5, this.zze);
        SafeParcelWriter.j(parcel, 6, this.zzf);
        SafeParcelWriter.l(parcel, 7, this.zzg);
        SafeParcelWriter.a(parcel, 8, this.zzh);
        SafeParcelWriter.a(parcel, 9, this.zzi);
        SafeParcelWriter.p(o10, parcel);
    }
}
