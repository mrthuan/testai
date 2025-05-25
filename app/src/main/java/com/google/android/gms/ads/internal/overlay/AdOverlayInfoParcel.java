package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzcej;
import com.google.android.gms.internal.ads.zzcxd;
import com.google.android.gms.internal.ads.zzdeq;
import com.google.android.gms.internal.ads.zzdgm;
import com.google.android.gms.internal.ads.zzeds;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final zzc f10269a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.client.zza f10270b;
    @SafeParcelable.Field
    public final zzp c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final zzcej f10271d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final zzbhp f10272e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f10273f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10274g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final String f10275h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final zzaa f10276i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final int f10277j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final int f10278k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    public final String f10279l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    public final VersionInfoParcel f10280m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    public final String f10281n;
    @SafeParcelable.Field

    /* renamed from: o  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.zzk f10282o;
    @SafeParcelable.Field

    /* renamed from: p  reason: collision with root package name */
    public final zzbhn f10283p;
    @SafeParcelable.Field

    /* renamed from: q  reason: collision with root package name */
    public final String f10284q;
    @SafeParcelable.Field

    /* renamed from: r  reason: collision with root package name */
    public final String f10285r;
    @SafeParcelable.Field

    /* renamed from: s  reason: collision with root package name */
    public final String f10286s;
    @SafeParcelable.Field

    /* renamed from: t  reason: collision with root package name */
    public final zzcxd f10287t;
    @SafeParcelable.Field

    /* renamed from: u  reason: collision with root package name */
    public final zzdeq f10288u;
    @SafeParcelable.Field

    /* renamed from: v  reason: collision with root package name */
    public final zzbsg f10289v;
    @SafeParcelable.Field

    /* renamed from: w  reason: collision with root package name */
    public final boolean f10290w;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzbhn zzbhnVar, zzbhp zzbhpVar, zzaa zzaaVar, zzcej zzcejVar, boolean z10, int i10, String str, VersionInfoParcel versionInfoParcel, zzdeq zzdeqVar, zzeds zzedsVar, boolean z11) {
        this.f10269a = null;
        this.f10270b = zzaVar;
        this.c = zzpVar;
        this.f10271d = zzcejVar;
        this.f10283p = zzbhnVar;
        this.f10272e = zzbhpVar;
        this.f10273f = null;
        this.f10274g = z10;
        this.f10275h = null;
        this.f10276i = zzaaVar;
        this.f10277j = i10;
        this.f10278k = 3;
        this.f10279l = str;
        this.f10280m = versionInfoParcel;
        this.f10281n = null;
        this.f10282o = null;
        this.f10284q = null;
        this.f10285r = null;
        this.f10286s = null;
        this.f10287t = null;
        this.f10288u = zzdeqVar;
        this.f10289v = zzedsVar;
        this.f10290w = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 2, this.f10269a, i10);
        SafeParcelWriter.e(parcel, 3, new ObjectWrapper(this.f10270b).asBinder());
        SafeParcelWriter.e(parcel, 4, new ObjectWrapper(this.c).asBinder());
        SafeParcelWriter.e(parcel, 5, new ObjectWrapper(this.f10271d).asBinder());
        SafeParcelWriter.e(parcel, 6, new ObjectWrapper(this.f10272e).asBinder());
        SafeParcelWriter.j(parcel, 7, this.f10273f);
        SafeParcelWriter.a(parcel, 8, this.f10274g);
        SafeParcelWriter.j(parcel, 9, this.f10275h);
        SafeParcelWriter.e(parcel, 10, new ObjectWrapper(this.f10276i).asBinder());
        SafeParcelWriter.f(parcel, 11, this.f10277j);
        SafeParcelWriter.f(parcel, 12, this.f10278k);
        SafeParcelWriter.j(parcel, 13, this.f10279l);
        SafeParcelWriter.i(parcel, 14, this.f10280m, i10);
        SafeParcelWriter.j(parcel, 16, this.f10281n);
        SafeParcelWriter.i(parcel, 17, this.f10282o, i10);
        SafeParcelWriter.e(parcel, 18, new ObjectWrapper(this.f10283p).asBinder());
        SafeParcelWriter.j(parcel, 19, this.f10284q);
        SafeParcelWriter.j(parcel, 24, this.f10285r);
        SafeParcelWriter.j(parcel, 25, this.f10286s);
        SafeParcelWriter.e(parcel, 26, new ObjectWrapper(this.f10287t).asBinder());
        SafeParcelWriter.e(parcel, 27, new ObjectWrapper(this.f10288u).asBinder());
        SafeParcelWriter.e(parcel, 28, new ObjectWrapper(this.f10289v).asBinder());
        SafeParcelWriter.a(parcel, 29, this.f10290w);
        SafeParcelWriter.p(o10, parcel);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzbhn zzbhnVar, zzbhp zzbhpVar, zzaa zzaaVar, zzcej zzcejVar, boolean z10, int i10, String str, String str2, VersionInfoParcel versionInfoParcel, zzdeq zzdeqVar, zzeds zzedsVar) {
        this.f10269a = null;
        this.f10270b = zzaVar;
        this.c = zzpVar;
        this.f10271d = zzcejVar;
        this.f10283p = zzbhnVar;
        this.f10272e = zzbhpVar;
        this.f10273f = str2;
        this.f10274g = z10;
        this.f10275h = str;
        this.f10276i = zzaaVar;
        this.f10277j = i10;
        this.f10278k = 3;
        this.f10279l = null;
        this.f10280m = versionInfoParcel;
        this.f10281n = null;
        this.f10282o = null;
        this.f10284q = null;
        this.f10285r = null;
        this.f10286s = null;
        this.f10287t = null;
        this.f10288u = zzdeqVar;
        this.f10289v = zzedsVar;
        this.f10290w = false;
    }

    public AdOverlayInfoParcel(zzdgm zzdgmVar, zzcej zzcejVar, int i10, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzk zzkVar, String str2, String str3, String str4, zzcxd zzcxdVar, zzeds zzedsVar) {
        this.f10269a = null;
        this.f10270b = null;
        this.c = zzdgmVar;
        this.f10271d = zzcejVar;
        this.f10283p = null;
        this.f10272e = null;
        this.f10274g = false;
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzaA)).booleanValue()) {
            this.f10273f = null;
            this.f10275h = null;
        } else {
            this.f10273f = str2;
            this.f10275h = str3;
        }
        this.f10276i = null;
        this.f10277j = i10;
        this.f10278k = 1;
        this.f10279l = null;
        this.f10280m = versionInfoParcel;
        this.f10281n = str;
        this.f10282o = zzkVar;
        this.f10284q = null;
        this.f10285r = null;
        this.f10286s = str4;
        this.f10287t = zzcxdVar;
        this.f10288u = null;
        this.f10289v = zzedsVar;
        this.f10290w = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, zzcej zzcejVar, boolean z10, int i10, VersionInfoParcel versionInfoParcel, zzdeq zzdeqVar, zzeds zzedsVar) {
        this.f10269a = null;
        this.f10270b = zzaVar;
        this.c = zzpVar;
        this.f10271d = zzcejVar;
        this.f10283p = null;
        this.f10272e = null;
        this.f10273f = null;
        this.f10274g = z10;
        this.f10275h = null;
        this.f10276i = zzaaVar;
        this.f10277j = i10;
        this.f10278k = 2;
        this.f10279l = null;
        this.f10280m = versionInfoParcel;
        this.f10281n = null;
        this.f10282o = null;
        this.f10284q = null;
        this.f10285r = null;
        this.f10286s = null;
        this.f10287t = null;
        this.f10288u = zzdeqVar;
        this.f10289v = zzedsVar;
        this.f10290w = false;
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param zzc zzcVar, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2, @SafeParcelable.Param IBinder iBinder3, @SafeParcelable.Param IBinder iBinder4, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z10, @SafeParcelable.Param String str2, @SafeParcelable.Param IBinder iBinder5, @SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str3, @SafeParcelable.Param VersionInfoParcel versionInfoParcel, @SafeParcelable.Param String str4, @SafeParcelable.Param com.google.android.gms.ads.internal.zzk zzkVar, @SafeParcelable.Param IBinder iBinder6, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param IBinder iBinder7, @SafeParcelable.Param IBinder iBinder8, @SafeParcelable.Param IBinder iBinder9, @SafeParcelable.Param boolean z11) {
        this.f10269a = zzcVar;
        this.f10270b = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder));
        this.c = (zzp) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder2));
        this.f10271d = (zzcej) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder3));
        this.f10283p = (zzbhn) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder6));
        this.f10272e = (zzbhp) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder4));
        this.f10273f = str;
        this.f10274g = z10;
        this.f10275h = str2;
        this.f10276i = (zzaa) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder5));
        this.f10277j = i10;
        this.f10278k = i11;
        this.f10279l = str3;
        this.f10280m = versionInfoParcel;
        this.f10281n = str4;
        this.f10282o = zzkVar;
        this.f10284q = str5;
        this.f10285r = str6;
        this.f10286s = str7;
        this.f10287t = (zzcxd) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder7));
        this.f10288u = (zzdeq) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder8));
        this.f10289v = (zzbsg) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder9));
        this.f10290w = z11;
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, VersionInfoParcel versionInfoParcel, zzcej zzcejVar, zzdeq zzdeqVar) {
        this.f10269a = zzcVar;
        this.f10270b = zzaVar;
        this.c = zzpVar;
        this.f10271d = zzcejVar;
        this.f10283p = null;
        this.f10272e = null;
        this.f10273f = null;
        this.f10274g = false;
        this.f10275h = null;
        this.f10276i = zzaaVar;
        this.f10277j = -1;
        this.f10278k = 4;
        this.f10279l = null;
        this.f10280m = versionInfoParcel;
        this.f10281n = null;
        this.f10282o = null;
        this.f10284q = null;
        this.f10285r = null;
        this.f10286s = null;
        this.f10287t = null;
        this.f10288u = zzdeqVar;
        this.f10289v = null;
        this.f10290w = false;
    }

    public AdOverlayInfoParcel(zzp zzpVar, zzcej zzcejVar, VersionInfoParcel versionInfoParcel) {
        this.c = zzpVar;
        this.f10271d = zzcejVar;
        this.f10277j = 1;
        this.f10280m = versionInfoParcel;
        this.f10269a = null;
        this.f10270b = null;
        this.f10283p = null;
        this.f10272e = null;
        this.f10273f = null;
        this.f10274g = false;
        this.f10275h = null;
        this.f10276i = null;
        this.f10278k = 1;
        this.f10279l = null;
        this.f10281n = null;
        this.f10282o = null;
        this.f10284q = null;
        this.f10285r = null;
        this.f10286s = null;
        this.f10287t = null;
        this.f10288u = null;
        this.f10289v = null;
        this.f10290w = false;
    }

    public AdOverlayInfoParcel(zzcej zzcejVar, VersionInfoParcel versionInfoParcel, String str, String str2, zzeds zzedsVar) {
        this.f10269a = null;
        this.f10270b = null;
        this.c = null;
        this.f10271d = zzcejVar;
        this.f10283p = null;
        this.f10272e = null;
        this.f10273f = null;
        this.f10274g = false;
        this.f10275h = null;
        this.f10276i = null;
        this.f10277j = 14;
        this.f10278k = 5;
        this.f10279l = null;
        this.f10280m = versionInfoParcel;
        this.f10281n = null;
        this.f10282o = null;
        this.f10284q = str;
        this.f10285r = str2;
        this.f10286s = null;
        this.f10287t = null;
        this.f10288u = null;
        this.f10289v = zzedsVar;
        this.f10290w = false;
    }
}
