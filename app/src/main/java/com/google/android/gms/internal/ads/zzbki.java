package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbki extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbki> CREATOR = new zzbkj();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String[] zzb;
    @SafeParcelable.Field
    public final String[] zzc;

    @SafeParcelable.Constructor
    public zzbki(@SafeParcelable.Param String str, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, str);
        SafeParcelWriter.k(parcel, 2, this.zzb);
        SafeParcelWriter.k(parcel, 3, this.zzc);
        SafeParcelWriter.p(o10, parcel);
    }
}
