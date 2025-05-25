package com.google.android.gms.location;

import a6.h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11443a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11444b;

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11) {
        this.f11443a = i10;
        this.f11444b = i11;
    }

    @ShowFirstParty
    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f11443a == detectedActivity.f11443a && this.f11444b == detectedActivity.f11444b) {
                return true;
            }
        }
        return false;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11443a), Integer.valueOf(this.f11444b)});
    }

    public final String toString() {
        String str;
        int i10 = this.f11443a;
        if (i10 > 22 || i10 < 0) {
            i10 = 4;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 7) {
                                    if (i10 != 8) {
                                        if (i10 != 16) {
                                            if (i10 != 17) {
                                                str = Integer.toString(i10);
                                            } else {
                                                str = "IN_RAIL_VEHICLE";
                                            }
                                        } else {
                                            str = "IN_ROAD_VEHICLE";
                                        }
                                    } else {
                                        str = "RUNNING";
                                    }
                                } else {
                                    str = "WALKING";
                                }
                            } else {
                                str = "TILTING";
                            }
                        } else {
                            str = "UNKNOWN";
                        }
                    } else {
                        str = "STILL";
                    }
                } else {
                    str = "ON_FOOT";
                }
            } else {
                str = "ON_BICYCLE";
            }
        } else {
            str = "IN_VEHICLE";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 48);
        sb2.append("DetectedActivity [type=");
        sb2.append(str);
        sb2.append(", confidence=");
        return h.g(sb2, this.f11444b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11443a);
        SafeParcelWriter.f(parcel, 2, this.f11444b);
        SafeParcelWriter.p(o10, parcel);
    }
}
