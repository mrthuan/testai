package jb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: RemoteMessage.java */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class t extends AbstractSafeParcelable {
    public static final Parcelable.Creator<t> CREATOR = new u();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f19154a;

    /* renamed from: b  reason: collision with root package name */
    public y.b f19155b;

    @SafeParcelable.Constructor
    public t(@SafeParcelable.Param Bundle bundle) {
        this.f19154a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.b(parcel, 2, this.f19154a);
        SafeParcelWriter.p(o10, parcel);
    }
}
