package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11433a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11434b;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11) {
        this.f11433a = i10;
        this.f11434b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.f11433a == activityTransition.f11433a && this.f11434b == activityTransition.f11434b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11433a), Integer.valueOf(this.f11434b)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(this.f11433a);
        sb2.append(", mTransitionType=");
        sb2.append(this.f11434b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11433a);
        SafeParcelWriter.f(parcel, 2, this.f11434b);
        SafeParcelWriter.p(o10, parcel);
    }
}
