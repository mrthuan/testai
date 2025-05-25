package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new zab();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f11313a;

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallIntentResponse(@SafeParcelable.Param PendingIntent pendingIntent) {
        this.f11313a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 1, this.f11313a, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
