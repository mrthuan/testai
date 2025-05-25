package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbae> CREATOR = new zzbaf();
    @SafeParcelable.Field
    private ParcelFileDescriptor zza;
    @SafeParcelable.Field
    private final boolean zzb;
    @SafeParcelable.Field
    private final boolean zzc;
    @SafeParcelable.Field
    private final long zzd;
    @SafeParcelable.Field
    private final boolean zze;

    public zzbae() {
        this(null, false, false, 0L, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 2, zzb(), i10);
        SafeParcelWriter.a(parcel, 3, zzd());
        SafeParcelWriter.a(parcel, 4, zzf());
        SafeParcelWriter.g(parcel, 5, zza());
        SafeParcelWriter.a(parcel, 6, zzg());
        SafeParcelWriter.p(o10, parcel);
    }

    public final synchronized long zza() {
        return this.zzd;
    }

    public final synchronized ParcelFileDescriptor zzb() {
        return this.zza;
    }

    public final synchronized InputStream zzc() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        if (this.zza != null) {
            return true;
        }
        return false;
    }

    public final synchronized boolean zzf() {
        return this.zzc;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public zzbae(@SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param long j10, @SafeParcelable.Param boolean z12) {
        this.zza = parcelFileDescriptor;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j10;
        this.zze = z12;
    }
}
