package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10880a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final int f10881b;
    @SafeParcelable.Field
    public final long c;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param int i10, @SafeParcelable.Param long j10, @SafeParcelable.Param String str) {
        this.f10880a = str;
        this.f10881b = i10;
        this.c = j10;
    }

    @KeepForSdk
    public final long d() {
        long j10 = this.c;
        if (j10 == -1) {
            return this.f10881b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f10880a;
            if (((str != null && str.equals(feature.f10880a)) || (str == null && feature.f10880a == null)) && d() == feature.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10880a, Long.valueOf(d())});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f10880a, NamingTable.TAG);
        toStringHelper.a(Long.valueOf(d()), "version");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f10880a);
        SafeParcelWriter.f(parcel, 2, this.f10881b);
        SafeParcelWriter.g(parcel, 3, d());
        SafeParcelWriter.p(o10, parcel);
    }

    @KeepForSdk
    public Feature(String str, long j10) {
        this.f10880a = str;
        this.c = j10;
        this.f10881b = -1;
    }
}
