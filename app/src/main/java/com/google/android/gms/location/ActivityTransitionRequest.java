package com.google.android.gms.location;

import a6.h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import y7.c;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzo();

    /* renamed from: e  reason: collision with root package name */
    public static final c f11437e = new c();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List<ActivityTransition> f11438a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11439b;
    @SafeParcelable.Field
    public final List<ClientIdentity> c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f11440d;

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param String str, @SafeParcelable.Param ArrayList arrayList2, @SafeParcelable.Param String str2) {
        boolean z10;
        List<ClientIdentity> unmodifiableList;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.a("transitions can't be empty.", z10);
            TreeSet treeSet = new TreeSet(f11437e);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ActivityTransition activityTransition = (ActivityTransition) it.next();
                Preconditions.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
            }
            this.f11438a = Collections.unmodifiableList(arrayList);
            this.f11439b = str;
            if (arrayList2 == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            this.c = unmodifiableList;
            this.f11440d = str2;
            return;
        }
        throw new NullPointerException("transitions can't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.a(this.f11438a, activityTransitionRequest.f11438a) && Objects.a(this.f11439b, activityTransitionRequest.f11439b) && Objects.a(this.f11440d, activityTransitionRequest.f11440d) && Objects.a(this.c, activityTransitionRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f11438a.hashCode() * 31;
        int i12 = 0;
        String str = this.f11439b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        List<ClientIdentity> list = this.c;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str2 = this.f11440d;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11438a);
        String valueOf2 = String.valueOf(this.c);
        int length = valueOf.length();
        String str = this.f11439b;
        int length2 = String.valueOf(str).length();
        int length3 = valueOf2.length();
        String str2 = this.f11440d;
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        h.l(sb2, "ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str);
        h.l(sb2, "', mClients=", valueOf2, ", mAttributionTag=", str2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.n(parcel, 1, this.f11438a);
        SafeParcelWriter.j(parcel, 2, this.f11439b);
        SafeParcelWriter.n(parcel, 3, this.c);
        SafeParcelWriter.j(parcel, 4, this.f11440d);
        SafeParcelWriter.p(o10, parcel);
    }
}
