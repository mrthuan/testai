package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@VisibleForTesting
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    @SafeParcelable.Field
    private final String zza;
    @SafeParcelable.Field
    private final long zzb;
    @SafeParcelable.Field
    private final short zzc;
    @SafeParcelable.Field
    private final double zzd;
    @SafeParcelable.Field
    private final double zze;
    @SafeParcelable.Field
    private final float zzf;
    @SafeParcelable.Field
    private final int zzg;
    @SafeParcelable.Field
    private final int zzh;
    @SafeParcelable.Field
    private final int zzi;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param short s4, @SafeParcelable.Param double d10, @SafeParcelable.Param double d11, @SafeParcelable.Param float f10, @SafeParcelable.Param long j10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f10 > 0.0f) {
                if (d10 <= 90.0d && d10 >= -90.0d) {
                    if (d11 <= 180.0d && d11 >= -180.0d) {
                        int i13 = i10 & 7;
                        if (i13 != 0) {
                            this.zzc = s4;
                            this.zza = str;
                            this.zzd = d10;
                            this.zze = d11;
                            this.zzf = f10;
                            this.zzb = j10;
                            this.zzg = i13;
                            this.zzh = i11;
                            this.zzi = i12;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("No supported transition specified: ");
                        sb2.append(i10);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(43);
                    sb3.append("invalid longitude: ");
                    sb3.append(d11);
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(42);
                sb4.append("invalid latitude: ");
                sb4.append(d10);
                throw new IllegalArgumentException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(31);
            sb5.append("invalid radius: ");
            sb5.append(f10);
            throw new IllegalArgumentException(sb5.toString());
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(valueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s4 = this.zzc;
        if (s4 != -1) {
            if (s4 != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        objArr[0] = str;
        objArr[1] = this.zza.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.zzg);
        objArr[3] = Double.valueOf(this.zzd);
        objArr[4] = Double.valueOf(this.zze);
        objArr[5] = Float.valueOf(this.zzf);
        objArr[6] = Integer.valueOf(this.zzh / 1000);
        objArr[7] = Integer.valueOf(this.zzi);
        objArr[8] = Long.valueOf(this.zzb);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.zza);
        SafeParcelWriter.g(parcel, 2, this.zzb);
        short s4 = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(s4);
        double d10 = this.zzd;
        parcel.writeInt(524292);
        parcel.writeDouble(d10);
        double d11 = this.zze;
        parcel.writeInt(524293);
        parcel.writeDouble(d11);
        SafeParcelWriter.d(parcel, 6, this.zzf);
        SafeParcelWriter.f(parcel, 7, this.zzg);
        SafeParcelWriter.f(parcel, 8, this.zzh);
        SafeParcelWriter.f(parcel, 9, this.zzi);
        SafeParcelWriter.p(o10, parcel);
    }
}
