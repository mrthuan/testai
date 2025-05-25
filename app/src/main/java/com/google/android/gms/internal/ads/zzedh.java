package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzedh extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgcu zzb;

    public zzedh(Context context, zzgcu zzgcuVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhA)).intValue());
        this.zza = context;
        this.zzb = zzgcuVar;
    }

    public static /* synthetic */ Void zzb(com.google.android.gms.ads.internal.util.client.zzr zzrVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, zzrVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzr zzrVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzrVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzr zzrVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{InMobiNetworkValues.URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(InMobiNetworkValues.URL);
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                zzrVar.zza(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final Void zza(zzedj zzedjVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzedjVar.zza));
        contentValues.put("gws_query_id", zzedjVar.zzb);
        contentValues.put(InMobiNetworkValues.URL, zzedjVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzedjVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        com.google.android.gms.ads.internal.util.zzbr I = com.google.android.gms.ads.internal.util.zzt.I(this.zza);
        if (I != null) {
            try {
                I.zze(new ObjectWrapper(this.zza));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.i();
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfio(this) { // from class: com.google.android.gms.internal.ads.zzedf
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzedj zzedjVar) {
        zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.this.zza(zzedjVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzfio zzfioVar) {
        zzgcj.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedh.this.getWritableDatabase();
            }
        }), new zzedg(this, zzfioVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzede
            @Override // java.lang.Runnable
            public final void run() {
                zzedh.zzf(sQLiteDatabase, str, zzrVar);
            }
        });
    }

    public final void zzh(final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.this.zzg((SQLiteDatabase) obj, zzrVar, str);
                return null;
            }
        });
    }
}
