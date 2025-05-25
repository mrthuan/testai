package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzfpp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpp> CREATOR = new zzfpq();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    public final String zzc;

    @SafeParcelable.Constructor
    public zzfpp(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.j(parcel, 2, this.zzb);
        SafeParcelWriter.j(parcel, 3, this.zzc);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzfpp(String str, String str2) {
        this(1, str, str2);
    }
}
