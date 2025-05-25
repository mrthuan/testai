package com.google.android.gms.ads.internal.client;

import a0.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzazs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbs extends zzaxm implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbeVar);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbhVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzqVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzcbVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzazsVar);
        zzdc(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzwVar);
        zzdc(39, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzciVar);
        zzdc(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z10) {
        Parcel zza = zza();
        int i10 = zzaxo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z10) {
        Parcel zza = zza();
        int i10 = zzaxo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzdgVar);
        zzdc(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfk zzfkVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzfkVar);
        zzdc(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzab(zzl zzlVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzlVar);
        Parcel zzdb = zzdb(4, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        Parcel zzdb = zzdb(12, zza());
        zzq zzqVar = (zzq) zzaxo.zza(zzdb, zzq.CREATOR);
        zzdb.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        zzbh zzbfVar;
        Parcel zzdb = zzdb(33, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzbh) {
                zzbfVar = (zzbh) queryLocalInterface;
            } else {
                zzbfVar = new zzbf(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        zzcb zzbzVar;
        Parcel zzdb = zzdb(32, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzcb) {
                zzbzVar = (zzcb) queryLocalInterface;
            } else {
                zzbzVar = new zzbz(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        zzdn zzdlVar;
        Parcel zzdb = zzdb(41, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzdn) {
                zzdlVar = (zzdn) queryLocalInterface;
            } else {
                zzdlVar = new zzdl(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzdlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        zzdq zzdoVar;
        Parcel zzdb = zzdb(26, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzdq) {
                zzdoVar = (zzdq) queryLocalInterface;
            } else {
                zzdoVar = new zzdo(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzdoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return a.d(zzdb(1, zza()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        Parcel zzdb = zzdb(31, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, zzbkVar);
        zzdc(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        zzdc(5, zza());
    }
}
