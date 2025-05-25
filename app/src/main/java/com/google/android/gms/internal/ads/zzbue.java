package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbue> CREATOR = new zzbuf();
    @SafeParcelable.Field
    public final boolean zza;
    @SafeParcelable.Field
    public final List zzb;

    public zzbue() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 2, z10);
        SafeParcelWriter.l(parcel, 3, this.zzb);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzbue(@SafeParcelable.Param boolean z10, @SafeParcelable.Param List list) {
        this.zza = z10;
        this.zzb = list;
    }
}
