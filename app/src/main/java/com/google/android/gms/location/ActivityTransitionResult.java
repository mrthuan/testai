package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List<ActivityTransitionEvent> f11441a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f11442b;

    public ActivityTransitionResult() {
        throw null;
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param Bundle bundle) {
        this.f11442b = null;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                for (int i10 = 1; i10 < arrayList.size(); i10++) {
                    Preconditions.b(((ActivityTransitionEvent) arrayList.get(i10)).c >= ((ActivityTransitionEvent) arrayList.get(i10 + (-1))).c);
                }
            }
            this.f11441a = Collections.unmodifiableList(arrayList);
            this.f11442b = bundle;
            return;
        }
        throw new NullPointerException("transitionEvents list can't be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f11441a.equals(((ActivityTransitionResult) obj).f11441a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11441a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.n(parcel, 1, this.f11441a);
        SafeParcelWriter.b(parcel, 2, this.f11442b);
        SafeParcelWriter.p(o10, parcel);
    }
}
