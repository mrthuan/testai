package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11327a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f11328b;
    public final SparseArray c;

    @KeepForSdk
    public StringToIntConverter() {
        this.f11327a = 1;
        this.f11328b = new HashMap();
        this.c = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11327a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f11328b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zac(str, ((Integer) hashMap.get(str)).intValue()));
        }
        SafeParcelWriter.n(parcel, 2, arrayList);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param int i10) {
        this.f11327a = i10;
        this.f11328b = new HashMap();
        this.c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = (zac) arrayList.get(i11);
            String str = zacVar.f11332b;
            int i12 = zacVar.c;
            this.f11328b.put(str, Integer.valueOf(i12));
            this.c.put(i12, str);
        }
    }
}
