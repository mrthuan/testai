package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import r7.f;
import r7.g;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f11404a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final f f11405b;
    @SafeParcelable.Field
    public final boolean c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11406d;

    public zzs(String str, f fVar, boolean z10, boolean z11) {
        this.f11404a = str;
        this.f11405b = fVar;
        this.c = z10;
        this.f11406d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f11404a);
        f fVar = this.f11405b;
        if (fVar == null) {
            fVar = null;
        }
        SafeParcelWriter.e(parcel, 2, fVar);
        SafeParcelWriter.a(parcel, 3, this.c);
        SafeParcelWriter.a(parcel, 4, this.f11406d);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param String str, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.f11404a = str;
        g gVar = null;
        if (iBinder != null) {
            try {
                int i10 = zzz.f11310a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper zzd = (queryLocalInterface instanceof com.google.android.gms.common.internal.zzaa ? (com.google.android.gms.common.internal.zzaa) queryLocalInterface : new zzy(iBinder)).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) ObjectWrapper.L0(zzd);
                if (bArr != null) {
                    gVar = new g(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f11405b = gVar;
        this.c = z10;
        this.f11406d = z11;
    }
}
