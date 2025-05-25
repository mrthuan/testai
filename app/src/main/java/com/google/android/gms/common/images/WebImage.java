package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11173a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final Uri f11174b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11175d;

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param int i10, @SafeParcelable.Param Uri uri, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12) {
        this.f11173a = i10;
        this.f11174b = uri;
        this.c = i11;
        this.f11175d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.a(this.f11174b, webImage.f11174b) && this.c == webImage.c && this.f11175d == webImage.f11175d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11174b, Integer.valueOf(this.c), Integer.valueOf(this.f11175d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.c), Integer.valueOf(this.f11175d), this.f11174b.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11173a);
        SafeParcelWriter.i(parcel, 2, this.f11174b, i10);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11175d);
        SafeParcelWriter.p(o10, parcel);
    }
}
