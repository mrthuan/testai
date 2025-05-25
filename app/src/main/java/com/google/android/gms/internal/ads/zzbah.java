package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbah> CREATOR = new zzbai();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final long zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final String zze;
    @SafeParcelable.Field
    public final Bundle zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public long zzh;
    @SafeParcelable.Field
    public String zzi;
    @SafeParcelable.Field
    public int zzj;

    @SafeParcelable.Constructor
    public zzbah(@SafeParcelable.Param String str, @SafeParcelable.Param long j10, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param boolean z10, @SafeParcelable.Param long j11, @SafeParcelable.Param String str5, @SafeParcelable.Param int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z10;
        this.zzh = j11;
        this.zzi = str5;
        this.zzj = i10;
    }

    public static zzbah zza(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                com.google.android.gms.ads.internal.util.client.zzm.e("Expected 2 path parts for namespace and id, found :" + size);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(InMobiNetworkValues.URL);
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j10 = parseLong;
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbah(queryParameter, j10, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, str);
        SafeParcelWriter.g(parcel, 3, this.zzb);
        SafeParcelWriter.j(parcel, 4, this.zzc);
        SafeParcelWriter.j(parcel, 5, this.zzd);
        SafeParcelWriter.j(parcel, 6, this.zze);
        SafeParcelWriter.b(parcel, 7, this.zzf);
        SafeParcelWriter.a(parcel, 8, this.zzg);
        SafeParcelWriter.g(parcel, 9, this.zzh);
        SafeParcelWriter.j(parcel, 10, this.zzi);
        SafeParcelWriter.f(parcel, 11, this.zzj);
        SafeParcelWriter.p(o10, parcel);
    }
}
