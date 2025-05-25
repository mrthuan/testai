package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzau();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List<com.google.android.gms.internal.location.zzbe> f11445a;
    @InitialTrigger
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11446b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f11447d;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f11448a = new ArrayList();
        @InitialTrigger

        /* renamed from: b  reason: collision with root package name */
        public int f11449b = 5;
        public final String c = "";
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes2.dex */
    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param String str, @SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param @InitialTrigger int i10, @SafeParcelable.Param String str2) {
        this.f11445a = arrayList;
        this.f11446b = i10;
        this.c = str;
        this.f11447d = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeofencingRequest[geofences=");
        sb2.append(this.f11445a);
        sb2.append(", initialTrigger=");
        sb2.append(this.f11446b);
        sb2.append(", tag=");
        sb2.append(this.c);
        sb2.append(", attributionTag=");
        return r.g(sb2, this.f11447d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.n(parcel, 1, this.f11445a);
        SafeParcelWriter.f(parcel, 2, this.f11446b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.j(parcel, 4, this.f11447d);
        SafeParcelWriter.p(o10, parcel);
    }
}
