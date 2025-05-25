package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbvz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvz> CREATOR = new zzbwa();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbvz(@SafeParcelable.Param String str, @SafeParcelable.Param int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public static zzbvz zza(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            return new zzbvz(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvz)) {
            zzbvz zzbvzVar = (zzbvz) obj;
            if (Objects.a(this.zza, zzbvzVar.zza)) {
                if (Objects.a(Integer.valueOf(this.zzb), Integer.valueOf(zzbvzVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, str);
        SafeParcelWriter.f(parcel, 3, this.zzb);
        SafeParcelWriter.p(o10, parcel);
    }
}
