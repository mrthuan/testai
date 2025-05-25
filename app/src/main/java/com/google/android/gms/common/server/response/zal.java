package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11349a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11350b;
    @SafeParcelable.Field
    public final ArrayList c;

    @SafeParcelable.Constructor
    public zal(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param ArrayList arrayList) {
        this.f11349a = i10;
        this.f11350b = str;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11349a);
        SafeParcelWriter.j(parcel, 2, this.f11350b);
        SafeParcelWriter.n(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f11349a = 1;
        this.f11350b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.c = arrayList;
    }
}
