package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: e  reason: collision with root package name */
    public static final Status f10921e;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: f  reason: collision with root package name */
    public static final Status f10922f;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: g  reason: collision with root package name */
    public static final Status f10923g;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: h  reason: collision with root package name */
    public static final Status f10924h;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: i  reason: collision with root package name */
    public static final Status f10925i;
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f10926a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10927b;
    @SafeParcelable.Field
    public final PendingIntent c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final ConnectionResult f10928d;

    static {
        new Status(-1, null, null, null);
        f10921e = new Status(0, null, null, null);
        f10922f = new Status(14, null, null, null);
        f10923g = new Status(8, null, null, null);
        f10924h = new Status(15, null, null, null);
        f10925i = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new zzb();
    }

    public Status() {
        throw null;
    }

    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param ConnectionResult connectionResult) {
        this.f10926a = i10;
        this.f10927b = str;
        this.c = pendingIntent;
        this.f10928d = connectionResult;
    }

    public final boolean d() {
        if (this.f10926a <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f10926a != status.f10926a || !Objects.a(this.f10927b, status.f10927b) || !Objects.a(this.c, status.c) || !Objects.a(this.f10928d, status.f10928d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10926a), this.f10927b, this.c, this.f10928d});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        String str = this.f10927b;
        if (str == null) {
            str = CommonStatusCodes.a(this.f10926a);
        }
        toStringHelper.a(str, "statusCode");
        toStringHelper.a(this.c, "resolution");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10926a);
        SafeParcelWriter.j(parcel, 2, this.f10927b);
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.i(parcel, 4, this.f10928d, i10);
        SafeParcelWriter.p(o10, parcel);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this;
    }
}
