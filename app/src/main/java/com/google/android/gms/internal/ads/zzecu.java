package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbc;
import java.util.ArrayList;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzecu {
    private final zzbav zza;
    private final Context zzb;
    private final zzebz zzc;
    private final VersionInfoParcel zzd;

    public zzecu(Context context, VersionInfoParcel versionInfoParcel, zzbav zzbavVar, zzebz zzebzVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbavVar;
        this.zzc = zzebzVar;
    }

    public final Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) {
        int i10;
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbbc.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyn e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.c("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.c(e10.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbbc.zzaf.zzc zzi = zzbbc.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzeco.zza(sQLiteDatabase, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzeco.zza(sQLiteDatabase, 1));
            zzi.zzx(zzeco.zza(sQLiteDatabase, 3));
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzi.zzF(System.currentTimeMillis());
            zzi.zzB(zzeco.zzb(sQLiteDatabase, 2));
            final zzbbc.zzaf zzbr = zzi.zzbr();
            int size = arrayList.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                zzbbc.zzaf.zza zzaVar = (zzbbc.zzaf.zza) arrayList.get(i11);
                if (zzaVar.zzk() == zzbbc.zzq.ENUM_TRUE && zzaVar.zze() > j10) {
                    j10 = zzaVar.zze();
                }
            }
            if (j10 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j10));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzecs
                @Override // com.google.android.gms.internal.ads.zzbau
                public final void zza(zzbbc.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzbbc.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbbc.zzar.zza zzd = zzbbc.zzar.zzd();
            zzd.zzg(versionInfoParcel.f10346b);
            zzd.zzi(this.zzd.c);
            if (true != this.zzd.f10347d) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            zzd.zzh(i10);
            final zzbbc.zzar zzbr2 = zzd.zzbr();
            this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzect
                @Override // com.google.android.gms.internal.ads.zzbau
                public final void zza(zzbbc.zzt.zza zzaVar2) {
                    zzbbc.zzm.zza zzbM = zzaVar2.zzg().zzbM();
                    zzbM.zzw(zzbbc.zzar.this);
                    zzaVar2.zzK(zzbM);
                }
            });
            this.zza.zzc(Constants.CP_MAC_ARABIC);
            zzeco.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzfio() { // from class: com.google.android.gms.internal.ads.zzecr
                @Override // com.google.android.gms.internal.ads.zzfio
                public final Object zza(Object obj) {
                    zzecu.this.zza(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
