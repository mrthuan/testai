package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbkk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkk> CREATOR = new zzbkl();
    @SafeParcelable.Field
    public final boolean zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final byte[] zzd;
    @SafeParcelable.Field
    public final String[] zze;
    @SafeParcelable.Field
    public final String[] zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public final long zzh;

    @SafeParcelable.Constructor
    public zzbkk(@SafeParcelable.Param boolean z10, @SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param String[] strArr2, @SafeParcelable.Param boolean z11, @SafeParcelable.Param long j10) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z11;
        this.zzh = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 1, z10);
        SafeParcelWriter.j(parcel, 2, this.zzb);
        SafeParcelWriter.f(parcel, 3, this.zzc);
        SafeParcelWriter.c(parcel, 4, this.zzd);
        SafeParcelWriter.k(parcel, 5, this.zze);
        SafeParcelWriter.k(parcel, 6, this.zzf);
        SafeParcelWriter.a(parcel, 7, this.zzg);
        SafeParcelWriter.g(parcel, 8, this.zzh);
        SafeParcelWriter.p(o10, parcel);
    }
}
