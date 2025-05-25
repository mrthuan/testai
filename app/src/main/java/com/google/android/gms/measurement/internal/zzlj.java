package com.google.android.gms.measurement.internal;

import a8.i2;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzlj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlj> CREATOR = new zzlk();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11909a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11910b;
    @SafeParcelable.Field
    public final long c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final Long f11911d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f11912e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f11913f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final Double f11914g;

    @SafeParcelable.Constructor
    public zzlj(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param long j10, @SafeParcelable.Param Long l10, @SafeParcelable.Param Float f10, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param Double d10) {
        this.f11909a = i10;
        this.f11910b = str;
        this.c = j10;
        this.f11911d = l10;
        if (i10 == 1) {
            this.f11914g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f11914g = d10;
        }
        this.f11912e = str2;
        this.f11913f = str3;
    }

    public final Object d() {
        Long l10 = this.f11911d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f11914g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f11912e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzlk.a(this, parcel);
    }

    public zzlj(i2 i2Var) {
        this(i2Var.f201d, i2Var.f202e, i2Var.c, i2Var.f200b);
    }

    public zzlj(long j10, Object obj, String str, String str2) {
        Preconditions.f(str);
        this.f11909a = 2;
        this.f11910b = str;
        this.c = j10;
        this.f11913f = str2;
        if (obj == null) {
            this.f11911d = null;
            this.f11914g = null;
            this.f11912e = null;
        } else if (obj instanceof Long) {
            this.f11911d = (Long) obj;
            this.f11914g = null;
            this.f11912e = null;
        } else if (obj instanceof String) {
            this.f11911d = null;
            this.f11914g = null;
            this.f11912e = (String) obj;
        } else if (obj instanceof Double) {
            this.f11911d = null;
            this.f11914g = (Double) obj;
            this.f11912e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
