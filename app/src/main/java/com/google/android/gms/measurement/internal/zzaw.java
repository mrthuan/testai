package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.f;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f11546a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final zzau f11547b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f11548d;

    public zzaw(zzaw zzawVar, long j10) {
        Preconditions.j(zzawVar);
        this.f11546a = zzawVar.f11546a;
        this.f11547b = zzawVar.f11547b;
        this.c = zzawVar.c;
        this.f11548d = j10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11547b);
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(this.c);
        sb2.append(",name=");
        return f.o(sb2, this.f11546a, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzax.a(this, parcel, i10);
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param String str, @SafeParcelable.Param zzau zzauVar, @SafeParcelable.Param String str2, @SafeParcelable.Param long j10) {
        this.f11546a = str;
        this.f11547b = zzauVar;
        this.c = str2;
        this.f11548d = j10;
    }
}
