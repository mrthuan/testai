package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11353a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f11354b;
    @SafeParcelable.Field
    public final String c;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param ArrayList arrayList) {
        this.f11353a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zal zalVar = (zal) arrayList.get(i11);
            String str2 = zalVar.f11350b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = zalVar.c;
            Preconditions.j(arrayList2);
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                zam zamVar = (zam) arrayList2.get(i12);
                hashMap2.put(zamVar.f11352b, zamVar.c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f11354b = hashMap;
        Preconditions.j(str);
        this.c = str;
        for (String str3 : hashMap.keySet()) {
            Map map = (Map) hashMap.get(str3);
            for (String str4 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str4)).f11341j = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = this.f11354b;
        for (String str : hashMap.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11353a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f11354b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zal(str, (Map) hashMap.get(str)));
        }
        SafeParcelWriter.n(parcel, 2, arrayList);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }
}
