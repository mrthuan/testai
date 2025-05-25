package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbwu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwu> CREATOR = new zzbwv();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String zzb;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzbwu(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(null, null);
        serverSideVerificationOptions.getClass();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, str);
        SafeParcelWriter.j(parcel, 2, this.zzb);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzbwu(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
