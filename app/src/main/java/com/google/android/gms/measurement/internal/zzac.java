package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public String f11516a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public String f11517b;
    @SafeParcelable.Field
    public zzlj c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public long f11518d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public boolean f11519e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public String f11520f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final zzaw f11521g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public long f11522h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public zzaw f11523i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final long f11524j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final zzaw f11525k;

    public zzac(zzac zzacVar) {
        Preconditions.j(zzacVar);
        this.f11516a = zzacVar.f11516a;
        this.f11517b = zzacVar.f11517b;
        this.c = zzacVar.c;
        this.f11518d = zzacVar.f11518d;
        this.f11519e = zzacVar.f11519e;
        this.f11520f = zzacVar.f11520f;
        this.f11521g = zzacVar.f11521g;
        this.f11522h = zzacVar.f11522h;
        this.f11523i = zzacVar.f11523i;
        this.f11524j = zzacVar.f11524j;
        this.f11525k = zzacVar.f11525k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, this.f11516a);
        SafeParcelWriter.j(parcel, 3, this.f11517b);
        SafeParcelWriter.i(parcel, 4, this.c, i10);
        SafeParcelWriter.g(parcel, 5, this.f11518d);
        SafeParcelWriter.a(parcel, 6, this.f11519e);
        SafeParcelWriter.j(parcel, 7, this.f11520f);
        SafeParcelWriter.i(parcel, 8, this.f11521g, i10);
        SafeParcelWriter.g(parcel, 9, this.f11522h);
        SafeParcelWriter.i(parcel, 10, this.f11523i, i10);
        SafeParcelWriter.g(parcel, 11, this.f11524j);
        SafeParcelWriter.i(parcel, 12, this.f11525k, i10);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zzlj zzljVar, @SafeParcelable.Param long j10, @SafeParcelable.Param boolean z10, @SafeParcelable.Param String str3, @SafeParcelable.Param zzaw zzawVar, @SafeParcelable.Param long j11, @SafeParcelable.Param zzaw zzawVar2, @SafeParcelable.Param long j12, @SafeParcelable.Param zzaw zzawVar3) {
        this.f11516a = str;
        this.f11517b = str2;
        this.c = zzljVar;
        this.f11518d = j10;
        this.f11519e = z10;
        this.f11520f = str3;
        this.f11521g = zzawVar;
        this.f11522h = j11;
        this.f11523i = zzawVar2;
        this.f11524j = j12;
        this.f11525k = zzawVar3;
    }
}
