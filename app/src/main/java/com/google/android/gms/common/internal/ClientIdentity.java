package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();
    @KeepForSdk
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11179a;
    @KeepForSdk
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11180b;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param int i10, @SafeParcelable.Param String str) {
        this.f11179a = i10;
        this.f11180b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.f11179a == this.f11179a && Objects.a(clientIdentity.f11180b, this.f11180b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11179a;
    }

    public final String toString() {
        return this.f11179a + ":" + this.f11180b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11179a);
        SafeParcelWriter.j(parcel, 2, this.f11180b);
        SafeParcelWriter.p(o10, parcel);
    }
}
