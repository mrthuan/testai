package com.google.android.gms.measurement.internal;

import a8.m;
import a8.s;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzen extends s {
    public final m c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11703d;

    public zzen(zzge zzgeVar) {
        super(zzgeVar);
        zzge zzgeVar2 = (zzge) this.f3529a;
        Context context = zzgeVar2.f11773a;
        zzgeVar2.getClass();
        this.c = new m(this, context);
    }

    @Override // a8.s
    public final boolean p() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase q() {
        if (this.f11703d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f11703d = true;
            return null;
        }
        return writableDatabase;
    }

    public final void r() {
        int delete;
        Object obj = this.f3529a;
        m();
        try {
            SQLiteDatabase q5 = q();
            if (q5 != null && (delete = q5.delete("messages", null, null)) > 0) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11720n.b(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e10) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.b(e10, "Error resetting local analytics data. error");
        }
    }

    public final void s() {
        m();
        if (this.f11703d) {
            return;
        }
        Object obj = this.f3529a;
        zzge zzgeVar = (zzge) obj;
        Context context = zzgeVar.f11773a;
        zzgeVar.getClass();
        if (context.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase q5 = q();
                        if (q5 == null) {
                            this.f11703d = true;
                            return;
                        }
                        q5.beginTransaction();
                        q5.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        q5.setTransactionSuccessful();
                        q5.endTransaction();
                        q5.close();
                        return;
                    } catch (SQLiteFullException e10) {
                        zzeu zzeuVar = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar);
                        zzeuVar.f11712f.b(e10, "Error deleting app launch break from local database");
                        this.f11703d = true;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteException e11) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        zzeu zzeuVar2 = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11712f.b(e11, "Error deleting app launch break from local database");
                        this.f11703d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            zzeu zzeuVar3 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar3);
            zzeuVar3.f11715i.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: all -> 0x004e, SQLiteException -> 0x0050, SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, TRY_ENTER, TryCatch #9 {SQLiteDatabaseLockedException -> 0x00be, SQLiteFullException -> 0x0052, SQLiteException -> 0x0050, all -> 0x004e, blocks: (B:14:0x0043, B:16:0x0049, B:27:0x0060, B:29:0x0086, B:32:0x00a5), top: B:99:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014c  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzen.t(int, byte[]):boolean");
    }
}
