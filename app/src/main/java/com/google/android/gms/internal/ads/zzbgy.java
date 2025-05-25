package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbgy extends zzaxm implements zzbha {
    public zzbgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzA() {
        zzdc(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzB(Bundle bundle) {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        zzdc(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzC() {
        zzdc(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzcsVar);
        zzdc(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzdgVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzF(zzbgx zzbgxVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbgxVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzG() {
        Parcel zzdb = zzdb(30, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzH() {
        Parcel zzdb = zzdb(24, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzI(Bundle bundle) {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        Parcel zzdb = zzdb(16, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final double zze() {
        Parcel zzdb = zzdb(8, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final Bundle zzf() {
        Parcel zzdb = zzdb(20, zza());
        Bundle bundle = (Bundle) zzaxo.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzdn zzg() {
        Parcel zzdb = zzdb(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Parcel zzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbew zzi() {
        zzbew zzbeuVar;
        Parcel zzdb = zzdb(14, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbeuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzbew) {
                zzbeuVar = (zzbew) queryLocalInterface;
            } else {
                zzbeuVar = new zzbeu(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbfa zzj() {
        zzbfa zzbeyVar;
        Parcel zzdb = zzdb(29, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbfd zzk() {
        zzbfd zzbfbVar;
        Parcel zzdb = zzdb(5, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper zzl() {
        return a0.a.d(zzdb(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper zzm() {
        return a0.a.d(zzdb(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzn() {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzo() {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzp() {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzq() {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzs() {
        Parcel zzdb = zzdb(10, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzt() {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List zzu() {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzaxo.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List zzv() {
        Parcel zzdb = zzdb(23, zza());
        ArrayList zzb = zzaxo.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzw() {
        zzdc(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzx() {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzcwVar);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzz(Bundle bundle) {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        zzdc(15, zza);
    }
}
