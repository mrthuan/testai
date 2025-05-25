package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbes extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbes> CREATOR = new zzbet();
    @SafeParcelable.Field
    public final int zza;
    @SafeParcelable.Field
    public final boolean zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final boolean zzd;
    @SafeParcelable.Field
    public final int zze;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzfk zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public final int zzh;
    @SafeParcelable.Field
    public final int zzi;
    @SafeParcelable.Field
    public final boolean zzj;
    @SafeParcelable.Field
    public final int zzk;

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbes(com.google.android.gms.ads.formats.NativeAdOptions r13) {
        /*
            r12 = this;
            boolean r2 = r13.f10076a
            int r3 = r13.f10077b
            boolean r4 = r13.f10078d
            int r5 = r13.f10079e
            com.google.android.gms.ads.VideoOptions r0 = r13.f10080f
            if (r0 == 0) goto L13
            com.google.android.gms.ads.internal.client.zzfk r1 = new com.google.android.gms.ads.internal.client.zzfk
            r1.<init>(r0)
            r6 = r1
            goto L15
        L13:
            r0 = 0
            r6 = r0
        L15:
            r1 = 4
            boolean r7 = r13.f10081g
            int r8 = r13.c
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbes.<init>(com.google.android.gms.ads.formats.NativeAdOptions):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r1 == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(com.google.android.gms.internal.ads.zzbes r5) {
        /*
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.a()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L42
            r3 = 3
            if (r1 == r3) goto L37
            r4 = 4
            if (r1 == r4) goto L18
            goto L46
        L18:
            boolean r1 = r5.zzg
            r0.f10611f = r1
            int r1 = r5.zzh
            r0.f10608b = r1
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.f10612g = r4
            r0.f10613h = r1
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L2f
        L2d:
            r2 = r4
            goto L35
        L2f:
            if (r1 != r2) goto L33
            r2 = r3
            goto L35
        L33:
            if (r1 != r4) goto L2d
        L35:
            r0.f10614i = r2
        L37:
            com.google.android.gms.ads.internal.client.zzfk r1 = r5.zzf
            if (r1 == 0) goto L42
            com.google.android.gms.ads.VideoOptions r2 = new com.google.android.gms.ads.VideoOptions
            r2.<init>(r1)
            r0.f10609d = r2
        L42:
            int r1 = r5.zze
            r0.f10610e = r1
        L46:
            boolean r1 = r5.zzb
            r0.f10607a = r1
            boolean r5 = r5.zzd
            r0.c = r5
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbes.zza(com.google.android.gms.internal.ads.zzbes):com.google.android.gms.ads.nativead.NativeAdOptions");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.a(parcel, 2, this.zzb);
        SafeParcelWriter.f(parcel, 3, this.zzc);
        SafeParcelWriter.a(parcel, 4, this.zzd);
        SafeParcelWriter.f(parcel, 5, this.zze);
        SafeParcelWriter.i(parcel, 6, this.zzf, i10);
        SafeParcelWriter.a(parcel, 7, this.zzg);
        SafeParcelWriter.f(parcel, 8, this.zzh);
        SafeParcelWriter.f(parcel, 9, this.zzi);
        SafeParcelWriter.a(parcel, 10, this.zzj);
        SafeParcelWriter.f(parcel, 11, this.zzk);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzbes(@SafeParcelable.Param int i10, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int i12, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzfk zzfkVar, @SafeParcelable.Param boolean z12, @SafeParcelable.Param int i13, @SafeParcelable.Param int i14, @SafeParcelable.Param boolean z13, @SafeParcelable.Param int i15) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = i11;
        this.zzd = z11;
        this.zze = i12;
        this.zzf = zzfkVar;
        this.zzg = z12;
        this.zzh = i13;
        this.zzj = z13;
        this.zzi = i14;
        this.zzk = i15;
    }
}
