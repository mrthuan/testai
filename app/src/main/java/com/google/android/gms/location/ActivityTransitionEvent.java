package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11435a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11436b;
    @SafeParcelable.Field
    public final long c;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r5 <= 1) goto L5;
     */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActivityTransitionEvent(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param long r6) {
        /*
            r3 = this;
            r3.<init>()
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityTransition> r0 = com.google.android.gms.location.ActivityTransition.CREATOR
            if (r5 < 0) goto Lb
            r0 = 1
            if (r5 > r0) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 41
            r1.<init>(r2)
            java.lang.String r2 = "Transition type "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " is not valid."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.common.internal.Preconditions.a(r1, r0)
            r3.f11435a = r4
            r3.f11436b = r5
            r3.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityTransitionEvent.<init>(int, int, long):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (this.f11435a == activityTransitionEvent.f11435a && this.f11436b == activityTransitionEvent.f11436b && this.c == activityTransitionEvent.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11435a), Integer.valueOf(this.f11436b), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append("ActivityType ");
        sb3.append(this.f11435a);
        sb2.append(sb3.toString());
        sb2.append(" ");
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("TransitionType ");
        sb4.append(this.f11436b);
        sb2.append(sb4.toString());
        sb2.append(" ");
        StringBuilder sb5 = new StringBuilder(41);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(this.c);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11435a);
        SafeParcelWriter.f(parcel, 2, this.f11436b);
        SafeParcelWriter.g(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }
}
