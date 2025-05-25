package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List<Location> f11463a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Location> f11462b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzbg();

    @SafeParcelable.Constructor
    public LocationResult(@SafeParcelable.Param List<Location> list) {
        this.f11463a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.f11463a.size();
        List<Location> list = this.f11463a;
        if (size != list.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.f11463a.iterator();
        Iterator<Location> it2 = list.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 17;
        for (Location location : this.f11463a) {
            long time = location.getTime();
            i10 = (i10 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11463a);
        return f.o(new StringBuilder(valueOf.length() + 27), "LocationResult[locations: ", valueOf, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.n(parcel, 1, this.f11463a);
        SafeParcelWriter.p(o10, parcel);
    }
}
