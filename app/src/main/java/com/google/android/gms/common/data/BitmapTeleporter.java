package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11160a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public ParcelFileDescriptor f11161b;
    @SafeParcelable.Field
    public final int c;

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param int i10, @SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param int i11) {
        this.f11160a = i10;
        this.f11161b = parcelFileDescriptor;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f11161b != null) {
            int o10 = SafeParcelWriter.o(20293, parcel);
            SafeParcelWriter.f(parcel, 1, this.f11160a);
            SafeParcelWriter.i(parcel, 2, this.f11161b, i10 | 1);
            SafeParcelWriter.f(parcel, 3, this.c);
            SafeParcelWriter.p(o10, parcel);
            this.f11161b = null;
            return;
        }
        Preconditions.j(null);
        throw null;
    }
}
