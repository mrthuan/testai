package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11316a;
    @InstallState
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11317b;
    @SafeParcelable.Field
    public final Long c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final Long f11318d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f11319e;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface InstallState {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    /* loaded from: classes.dex */
    public static class ProgressInfo {
        public ProgressInfo(long j10) {
            if (j10 != 0) {
                return;
            }
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param int i10, @SafeParcelable.Param @InstallState int i11, @SafeParcelable.Param Long l10, @SafeParcelable.Param Long l11, @SafeParcelable.Param int i12) {
        this.f11316a = i10;
        this.f11317b = i11;
        this.c = l10;
        this.f11318d = l11;
        this.f11319e = i12;
        if (l10 != null && l11 != null && l11.longValue() != 0) {
            l10.longValue();
            new ProgressInfo(l11.longValue());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11316a);
        SafeParcelWriter.f(parcel, 2, this.f11317b);
        SafeParcelWriter.h(parcel, 3, this.c);
        SafeParcelWriter.h(parcel, 4, this.f11318d);
        SafeParcelWriter.f(parcel, 5, this.f11319e);
        SafeParcelWriter.p(o10, parcel);
    }
}
