package com.google.android.gms.internal.location;

import a6.h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.f;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    @SafeParcelable.Field
    final com.google.android.gms.location.zzs zzc;
    @SafeParcelable.Field
    final List<ClientIdentity> zzd;
    @SafeParcelable.Field
    final String zze;
    @VisibleForTesting
    static final List<ClientIdentity> zza = Collections.emptyList();
    static final com.google.android.gms.location.zzs zzb = new com.google.android.gms.location.zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param com.google.android.gms.location.zzs zzsVar, @SafeParcelable.Param List<ClientIdentity> list, @SafeParcelable.Param String str) {
        this.zzc = zzsVar;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!Objects.a(this.zzc, zzjVar.zzc) || !Objects.a(this.zzd, zzjVar.zzd) || !Objects.a(this.zze, zzjVar.zze)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        StringBuilder sb2 = new StringBuilder(f.g(valueOf.length(), 77, valueOf2.length(), String.valueOf(str).length()));
        h.l(sb2, "DeviceOrientationRequestInternal{deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        return f.o(sb2, ", tag='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 1, this.zzc, i10);
        SafeParcelWriter.n(parcel, 2, this.zzd);
        SafeParcelWriter.j(parcel, 3, this.zze);
        SafeParcelWriter.p(o10, parcel);
    }
}
