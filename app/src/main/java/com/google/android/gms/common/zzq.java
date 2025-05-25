package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11401a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11402b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11403d;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z10) {
        this.f11401a = z10;
        this.f11402b = str;
        this.c = s.B0(i10) - 1;
        int i12 = 1;
        int[] iArr = {1, 2, 3};
        int i13 = 0;
        while (true) {
            if (i13 >= 3) {
                break;
            }
            int i14 = iArr[i13];
            int i15 = i14 - 1;
            if (i14 != 0) {
                if (i15 == i11) {
                    i12 = i14;
                    break;
                }
                i13++;
            } else {
                throw null;
            }
        }
        this.f11403d = i12 - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 1, this.f11401a);
        SafeParcelWriter.j(parcel, 2, this.f11402b);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11403d);
        SafeParcelWriter.p(o10, parcel);
    }
}
