package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11281a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f11282b;
    @SafeParcelable.Field
    public final ConnectionResult c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11283d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11284e;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param int i10, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param ConnectionResult connectionResult, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.f11281a = i10;
        this.f11282b = iBinder;
        this.c = connectionResult;
        this.f11283d = z10;
        this.f11284e = z11;
    }

    public final boolean equals(Object obj) {
        Object zzwVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.c.equals(zavVar.c)) {
            Object obj2 = null;
            IBinder iBinder = this.f11282b;
            if (iBinder == null) {
                zzwVar = null;
            } else {
                int i10 = IAccountAccessor.Stub.f11215a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof IAccountAccessor) {
                    zzwVar = (IAccountAccessor) queryLocalInterface;
                } else {
                    zzwVar = new zzw(iBinder);
                }
            }
            IBinder iBinder2 = zavVar.f11282b;
            if (iBinder2 != null) {
                int i11 = IAccountAccessor.Stub.f11215a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof IAccountAccessor) {
                    obj2 = (IAccountAccessor) queryLocalInterface2;
                } else {
                    obj2 = new zzw(iBinder2);
                }
            }
            if (Objects.a(zzwVar, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11281a);
        SafeParcelWriter.e(parcel, 2, this.f11282b);
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.a(parcel, 4, this.f11283d);
        SafeParcelWriter.a(parcel, 5, this.f11284e);
        SafeParcelWriter.p(o10, parcel);
    }
}
