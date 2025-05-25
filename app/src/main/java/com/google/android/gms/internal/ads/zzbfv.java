package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbfv extends zzaxm implements zzbfx {
    public zzbfv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfa zzf() {
        zzbfa zzbeyVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbeyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbfa) {
                zzbeyVar = (zzbfa) queryLocalInterface;
            } else {
                zzbeyVar = new zzbey(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfd zzg(String str) {
        zzbfd zzbfbVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbfd) {
                zzbfbVar = (zzbfd) queryLocalInterface;
            } else {
                zzbfbVar = new zzbfb(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final IObjectWrapper zzh() {
        return a0.a.d(zzdb(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzi() {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzj(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(1, zza);
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final List zzk() {
        Parcel zzdb = zzdb(3, zza());
        ArrayList<String> createStringArrayList = zzdb.createStringArrayList();
        zzdb.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzl() {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzm() {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzn(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzo() {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzp(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzq() {
        Parcel zzdb = zzdb(12, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(10, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzt() {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
