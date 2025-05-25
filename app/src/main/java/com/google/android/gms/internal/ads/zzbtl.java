package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbtl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtl> CREATOR = new zzbtm();
    @SafeParcelable.Field
    public final View zza;
    @SafeParcelable.Field
    public final Map zzb;

    @SafeParcelable.Constructor
    public zzbtl(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2) {
        this.zza = (View) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder));
        this.zzb = (Map) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        View view = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.e(parcel, 1, new ObjectWrapper(view).asBinder());
        SafeParcelWriter.e(parcel, 2, new ObjectWrapper(this.zzb).asBinder());
        SafeParcelWriter.p(o10, parcel);
    }
}
