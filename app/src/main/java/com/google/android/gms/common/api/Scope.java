package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f10919a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10920b;

    public Scope() {
        throw null;
    }

    @SafeParcelable.Constructor
    public Scope(@SafeParcelable.Param int i10, @SafeParcelable.Param String str) {
        Preconditions.g("scopeUri must not be null or empty", str);
        this.f10919a = i10;
        this.f10920b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f10920b.equals(((Scope) obj).f10920b);
    }

    public final int hashCode() {
        return this.f10920b.hashCode();
    }

    public final String toString() {
        return this.f10920b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10919a);
        SafeParcelWriter.j(parcel, 2, this.f10920b);
        SafeParcelWriter.p(o10, parcel);
    }
}
