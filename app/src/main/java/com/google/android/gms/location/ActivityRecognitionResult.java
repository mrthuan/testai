package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List<DetectedActivity> f11429a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final long f11430b;
    @SafeParcelable.Field
    public final long c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11431d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f11432e;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11, @SafeParcelable.Param int i10, @SafeParcelable.Param Bundle bundle) {
        boolean z10;
        boolean z11 = true;
        if (arrayList != null && arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("Must have at least 1 detected activity", z10);
        Preconditions.a("Must set times", (j10 <= 0 || j11 <= 0) ? false : z11);
        this.f11429a = arrayList;
        this.f11430b = j10;
        this.c = j11;
        this.f11431d = i10;
        this.f11432e = bundle;
    }

    public static boolean d(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        } else if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj instanceof Bundle) {
                    if (!d(bundle.getBundle(str), bundle2.getBundle(str))) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i10 = 0; i10 < length; i10++) {
                            if (Objects.a(Array.get(obj, i10), Array.get(obj2, i10))) {
                            }
                        }
                        continue;
                    }
                    return false;
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    @ShowFirstParty
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f11430b == activityRecognitionResult.f11430b && this.c == activityRecognitionResult.c && this.f11431d == activityRecognitionResult.f11431d && Objects.a(this.f11429a, activityRecognitionResult.f11429a) && d(this.f11432e, activityRecognitionResult.f11432e)) {
                return true;
            }
        }
        return false;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11430b), Long.valueOf(this.c), Integer.valueOf(this.f11431d), this.f11429a, this.f11432e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11429a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 124);
        sb2.append("ActivityRecognitionResult [probableActivities=");
        sb2.append(valueOf);
        sb2.append(", timeMillis=");
        sb2.append(this.f11430b);
        sb2.append(", elapsedRealtimeMillis=");
        sb2.append(this.c);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.n(parcel, 1, this.f11429a);
        SafeParcelWriter.g(parcel, 2, this.f11430b);
        SafeParcelWriter.g(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11431d);
        SafeParcelWriter.b(parcel, 5, this.f11432e);
        SafeParcelWriter.p(o10, parcel);
    }
}
