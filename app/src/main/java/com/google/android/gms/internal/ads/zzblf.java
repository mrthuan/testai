package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzblf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblf> CREATOR = new zzblg();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final Bundle zzb;

    @SafeParcelable.Constructor
    public zzblf(@SafeParcelable.Param String str, @SafeParcelable.Param Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, str);
        SafeParcelWriter.b(parcel, 2, this.zzb);
        SafeParcelWriter.p(o10, parcel);
    }
}
