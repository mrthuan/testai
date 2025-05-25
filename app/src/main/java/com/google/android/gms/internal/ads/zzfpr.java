package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzfpr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpr> CREATOR = new zzfps();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    private zzasj zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfpr(@SafeParcelable.Param int i10, @SafeParcelable.Param byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzasj zzasjVar = this.zzb;
        if (zzasjVar != null || this.zzc == null) {
            if (zzasjVar != null && this.zzc == null) {
                return;
            }
            if (zzasjVar != null && this.zzc != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (zzasjVar == null && this.zzc == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
            throw new IllegalStateException("Impossible");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaV();
        }
        SafeParcelWriter.c(parcel, 2, bArr);
        SafeParcelWriter.p(o10, parcel);
    }

    public final zzasj zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzasj.zze(this.zzc, zzgxi.zza());
                this.zzc = null;
            } catch (zzgyn | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
