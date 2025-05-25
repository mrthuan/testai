package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final zzbs f11498a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f11499b;
    @SafeParcelable.Field
    public final String c;

    @SafeParcelable.Constructor
    public zzbq(@SafeParcelable.Param List<String> list, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param String str) {
        zzbs zzj;
        if (list == null) {
            zzj = zzbs.zzi();
        } else {
            zzj = zzbs.zzj(list);
        }
        this.f11498a = zzj;
        this.f11499b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.l(parcel, 1, this.f11498a);
        SafeParcelWriter.i(parcel, 2, this.f11499b, i10);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }
}
