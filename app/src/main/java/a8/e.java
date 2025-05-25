package a8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzlo;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class e extends c2 {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f135f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f136g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f137h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f138i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f139j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f140k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f141l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f142m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    public final d f143d;

    /* renamed from: e  reason: collision with root package name */
    public final z1 f144e;

    public e(zzlg zzlgVar) {
        super(zzlgVar);
        this.f144e = new z1(((zzge) this.f3529a).f11785n);
        ((zzge) this.f3529a).getClass();
        this.f143d = new d(this, ((zzge) this.f3529a).f11773a);
    }

    public static final void z(ContentValues contentValues, Object obj) {
        Preconditions.f("value");
        Preconditions.j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final long A(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = F().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.c(str, "Database error", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void B(String str, String str2) {
        Preconditions.f(str);
        Preconditions.f(str2);
        m();
        n();
        try {
            F().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzge zzgeVar = (zzge) this.f3529a;
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.d("Error deleting conditional property", zzeu.v(str), zzgeVar.f11784m.f(str2), e10);
        }
    }

    public final long C(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = F().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    cursor.close();
                    return j11;
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.c(str, "Database error", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @VisibleForTesting
    public final long D(String str) {
        long C;
        Object obj = this.f3529a;
        Preconditions.f(str);
        Preconditions.f("first_open_count");
        m();
        n();
        SQLiteDatabase F = F();
        F.beginTransaction();
        long j10 = 0;
        try {
            try {
                C = C("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (C == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (F.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzeu zzeuVar = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar);
                        zzeuVar.f11712f.c(zzeu.v(str), "Failed to insert column (got -1). appId", "first_open_count");
                        return -1L;
                    }
                    C = 0;
                }
            } catch (SQLiteException e10) {
                e = e10;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + C));
                if (F.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    zzeu zzeuVar2 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.c(zzeu.v(str), "Failed to update column (got 0). appId", "first_open_count");
                    return -1L;
                }
                F.setTransactionSuccessful();
                return C;
            } catch (SQLiteException e11) {
                e = e11;
                j10 = C;
                zzeu zzeuVar3 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11712f.d("Error inserting column. appId", zzeu.v(str), "first_open_count", e);
                F.endTransaction();
                return j10;
            }
        } finally {
            F.endTransaction();
        }
    }

    public final long E(String str) {
        Preconditions.f(str);
        return C("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    public final SQLiteDatabase F() {
        m();
        try {
            return this.f143d.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0326: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:82:0x0326 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b9 A[Catch: SQLiteException -> 0x02b3, all -> 0x0325, TryCatch #0 {all -> 0x0325, blocks: (B:4:0x00ea, B:8:0x00f4, B:10:0x0155, B:15:0x015f, B:19:0x01a8, B:23:0x01be, B:25:0x01ed, B:30:0x01f7, B:34:0x0208, B:38:0x0225, B:40:0x0230, B:41:0x0242, B:43:0x0252, B:46:0x027b, B:48:0x028b, B:50:0x0293, B:54:0x029c, B:58:0x02ad, B:61:0x02b5, B:63:0x02c5, B:67:0x02dd, B:68:0x02e2, B:70:0x02f2, B:45:0x025f, B:37:0x0221, B:22:0x01b9, B:77:0x030d), top: B:86:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0221 A[Catch: SQLiteException -> 0x02b3, all -> 0x0325, TryCatch #0 {all -> 0x0325, blocks: (B:4:0x00ea, B:8:0x00f4, B:10:0x0155, B:15:0x015f, B:19:0x01a8, B:23:0x01be, B:25:0x01ed, B:30:0x01f7, B:34:0x0208, B:38:0x0225, B:40:0x0230, B:41:0x0242, B:43:0x0252, B:46:0x027b, B:48:0x028b, B:50:0x0293, B:54:0x029c, B:58:0x02ad, B:61:0x02b5, B:63:0x02c5, B:67:0x02dd, B:68:0x02e2, B:70:0x02f2, B:45:0x025f, B:37:0x0221, B:22:0x01b9, B:77:0x030d), top: B:86:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0230 A[Catch: SQLiteException -> 0x02b3, all -> 0x0325, TryCatch #0 {all -> 0x0325, blocks: (B:4:0x00ea, B:8:0x00f4, B:10:0x0155, B:15:0x015f, B:19:0x01a8, B:23:0x01be, B:25:0x01ed, B:30:0x01f7, B:34:0x0208, B:38:0x0225, B:40:0x0230, B:41:0x0242, B:43:0x0252, B:46:0x027b, B:48:0x028b, B:50:0x0293, B:54:0x029c, B:58:0x02ad, B:61:0x02b5, B:63:0x02c5, B:67:0x02dd, B:68:0x02e2, B:70:0x02f2, B:45:0x025f, B:37:0x0221, B:22:0x01b9, B:77:0x030d), top: B:86:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0252 A[Catch: SQLiteException -> 0x02b3, all -> 0x0325, TryCatch #0 {all -> 0x0325, blocks: (B:4:0x00ea, B:8:0x00f4, B:10:0x0155, B:15:0x015f, B:19:0x01a8, B:23:0x01be, B:25:0x01ed, B:30:0x01f7, B:34:0x0208, B:38:0x0225, B:40:0x0230, B:41:0x0242, B:43:0x0252, B:46:0x027b, B:48:0x028b, B:50:0x0293, B:54:0x029c, B:58:0x02ad, B:61:0x02b5, B:63:0x02c5, B:67:0x02dd, B:68:0x02e2, B:70:0x02f2, B:45:0x025f, B:37:0x0221, B:22:0x01b9, B:77:0x030d), top: B:86:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x028b A[Catch: SQLiteException -> 0x02b3, all -> 0x0325, TryCatch #0 {all -> 0x0325, blocks: (B:4:0x00ea, B:8:0x00f4, B:10:0x0155, B:15:0x015f, B:19:0x01a8, B:23:0x01be, B:25:0x01ed, B:30:0x01f7, B:34:0x0208, B:38:0x0225, B:40:0x0230, B:41:0x0242, B:43:0x0252, B:46:0x027b, B:48:0x028b, B:50:0x0293, B:54:0x029c, B:58:0x02ad, B:61:0x02b5, B:63:0x02c5, B:67:0x02dd, B:68:0x02e2, B:70:0x02f2, B:45:0x025f, B:37:0x0221, B:22:0x01b9, B:77:0x030d), top: B:86:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c5 A[Catch: SQLiteException -> 0x02b3, all -> 0x0325, TryCatch #0 {all -> 0x0325, blocks: (B:4:0x00ea, B:8:0x00f4, B:10:0x0155, B:15:0x015f, B:19:0x01a8, B:23:0x01be, B:25:0x01ed, B:30:0x01f7, B:34:0x0208, B:38:0x0225, B:40:0x0230, B:41:0x0242, B:43:0x0252, B:46:0x027b, B:48:0x028b, B:50:0x0293, B:54:0x029c, B:58:0x02ad, B:61:0x02b5, B:63:0x02c5, B:67:0x02dd, B:68:0x02e2, B:70:0x02f2, B:45:0x025f, B:37:0x0221, B:22:0x01b9, B:77:0x030d), top: B:86:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f2 A[Catch: SQLiteException -> 0x02b3, all -> 0x0325, TRY_LEAVE, TryCatch #0 {all -> 0x0325, blocks: (B:4:0x00ea, B:8:0x00f4, B:10:0x0155, B:15:0x015f, B:19:0x01a8, B:23:0x01be, B:25:0x01ed, B:30:0x01f7, B:34:0x0208, B:38:0x0225, B:40:0x0230, B:41:0x0242, B:43:0x0252, B:46:0x027b, B:48:0x028b, B:50:0x0293, B:54:0x029c, B:58:0x02ad, B:61:0x02b5, B:63:0x02c5, B:67:0x02dd, B:68:0x02e2, B:70:0x02f2, B:45:0x025f, B:37:0x0221, B:22:0x01b9, B:77:0x030d), top: B:86:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a8.n0 G(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.G(java.lang.String):a8.n0");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x014a: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:33:0x014a */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzac H(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.H(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final zzak I(long j10, String str, boolean z10, boolean z11) {
        return J(j10, str, 1L, false, false, z10, false, z11);
    }

    public final zzak J(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Object obj = this.f3529a;
        Preconditions.f(str);
        m();
        n();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase F = F();
                Cursor query = F.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        zzeu zzeuVar = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar);
                        zzeuVar.f11715i.b(zzeu.v(str), "Not updating daily counts, app is not known. appId");
                        query.close();
                        return zzakVar;
                    }
                    if (query.getLong(0) == j10) {
                        zzakVar.f11533b = query.getLong(1);
                        zzakVar.f11532a = query.getLong(2);
                        zzakVar.c = query.getLong(3);
                        zzakVar.f11534d = query.getLong(4);
                        zzakVar.f11535e = query.getLong(5);
                    }
                    if (z10) {
                        zzakVar.f11533b += j11;
                    }
                    if (z11) {
                        zzakVar.f11532a += j11;
                    }
                    if (z12) {
                        zzakVar.c += j11;
                    }
                    if (z13) {
                        zzakVar.f11534d += j11;
                    }
                    if (z14) {
                        zzakVar.f11535e += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.f11532a));
                    contentValues.put("daily_events_count", Long.valueOf(zzakVar.f11533b));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.f11534d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.f11535e));
                    F.update("apps", contentValues, "app_id=?", strArr);
                    query.close();
                    return zzakVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = query;
                    zzeu zzeuVar2 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.c(zzeu.v(str), "Error updating daily counts. appId", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzakVar;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a8.g K(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.K(java.lang.String, java.lang.String):a8.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a8.i2 L(java.lang.String r16, java.lang.String r17) {
        /*
            r15 = this;
            r1 = r15
            java.lang.Object r2 = r1.f3529a
            com.google.android.gms.common.internal.Preconditions.f(r16)
            com.google.android.gms.common.internal.Preconditions.f(r17)
            r15.m()
            r15.n()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r15.F()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r5 = "user_attributes"
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r0 = "set_timestamp"
            r12 = 0
            r6[r12] = r0     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r0 = "value"
            r13 = 1
            r6[r13] = r0     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r0 = "origin"
            r14 = 2
            r6[r14] = r0     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r7 = "app_id=? and name=?"
            java.lang.String[] r8 = new java.lang.String[]{r16, r17}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            boolean r0 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            if (r0 != 0) goto L3f
            r4.close()
            return r3
        L3f:
            long r9 = r4.getLong(r12)     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            java.lang.Object r11 = r15.M(r4, r13)     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            if (r11 != 0) goto L4d
            r4.close()
            return r3
        L4d:
            java.lang.String r7 = r4.getString(r14)     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            a8.i2 r0 = new a8.i2     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            r5 = r0
            r6 = r16
            r8 = r17
            r5.<init>(r6, r7, r8, r9, r11)     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            boolean r5 = r4.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            if (r5 == 0) goto L74
            r5 = r2
            com.google.android.gms.measurement.internal.zzge r5 = (com.google.android.gms.measurement.internal.zzge) r5     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzeu r5 = r5.f11780i     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzge.f(r5)     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzes r5 = r5.f11712f     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            java.lang.String r6 = "Got multiple records for user property, expected one. appId"
            a8.o r7 = com.google.android.gms.measurement.internal.zzeu.v(r16)     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
            r5.b(r7, r6)     // Catch: android.database.sqlite.SQLiteException -> L78 java.lang.Throwable -> La1
        L74:
            r4.close()
            return r0
        L78:
            r0 = move-exception
            goto L7e
        L7a:
            r0 = move-exception
            goto La3
        L7c:
            r0 = move-exception
            r4 = r3
        L7e:
            r5 = r2
            com.google.android.gms.measurement.internal.zzge r5 = (com.google.android.gms.measurement.internal.zzge) r5     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzeu r5 = r5.f11780i     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzge.f(r5)     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzes r5 = r5.f11712f     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = "Error querying user property. appId"
            a8.o r7 = com.google.android.gms.measurement.internal.zzeu.v(r16)     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzge r2 = (com.google.android.gms.measurement.internal.zzge) r2     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.zzep r2 = r2.f11784m     // Catch: java.lang.Throwable -> La1
            r8 = r17
            java.lang.String r2 = r2.f(r8)     // Catch: java.lang.Throwable -> La1
            r5.d(r6, r7, r2, r0)     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto La0
            r4.close()
        La0:
            return r3
        La1:
            r0 = move-exception
            r3 = r4
        La3:
            if (r3 == 0) goto La8
            r3.close()
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.L(java.lang.String, java.lang.String):a8.i2");
    }

    @VisibleForTesting
    public final Object M(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        Object obj = this.f3529a;
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            zzeu zzeuVar = ((zzge) obj).f11780i;
                            zzge.f(zzeuVar);
                            zzeuVar.f11712f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        zzeu zzeuVar2 = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11712f.a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i10);
                }
                return Double.valueOf(cursor.getDouble(i10));
            }
            return Long.valueOf(cursor.getLong(i10));
        }
        zzeu zzeuVar3 = ((zzge) obj).f11780i;
        zzge.f(zzeuVar3);
        zzeuVar3.f11712f.a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String N() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.F()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3b
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3b
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3f
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            java.lang.Object r3 = r6.f3529a     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.measurement.internal.zzge r3 = (com.google.android.gms.measurement.internal.zzge) r3     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.measurement.internal.zzeu r3 = r3.f11780i     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.measurement.internal.zzge.f(r3)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.measurement.internal.zzes r3 = r3.f11712f     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3a
            r0.close()
        L3a:
            return r1
        L3b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3f:
            if (r1 == 0) goto L44
            r1.close()
        L44:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.N():java.lang.String");
    }

    public final List O(String str, String str2, String str3) {
        Preconditions.f(str);
        m();
        n();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return P(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0095, code lost:
        r0 = ((com.google.android.gms.measurement.internal.zzge) r2).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r0);
        r0 = r0.f11712f;
        ((com.google.android.gms.measurement.internal.zzge) r2).getClass();
        r0.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List P(java.lang.String r44, java.lang.String[] r45) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.P(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List Q(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = r1.f3529a
            com.google.android.gms.common.internal.Preconditions.f(r18)
            r17.m()
            r17.n()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r11 = "1000"
            android.database.sqlite.SQLiteDatabase r3 = r17.F()     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r4 = "user_attributes"
            r5 = 4
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r6 = "name"
            r13 = 0
            r5[r13] = r6     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r6 = "origin"
            r14 = 1
            r5[r14] = r6     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r6 = "set_timestamp"
            r15 = 2
            r5[r15] = r6     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r6 = "value"
            r10 = 3
            r5[r10] = r6     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r18}     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r16 = "rowid"
            r8 = r2
            com.google.android.gms.measurement.internal.zzge r8 = (com.google.android.gms.measurement.internal.zzge) r8     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            r8.getClass()     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            r8 = 0
            r9 = 0
            r12 = r10
            r10 = r16
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9b
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r4 == 0) goto L8e
        L4e:
            java.lang.String r8 = r3.getString(r13)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            java.lang.String r4 = r3.getString(r14)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r4 != 0) goto L5a
            java.lang.String r4 = ""
        L5a:
            r7 = r4
            long r9 = r3.getLong(r15)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            java.lang.Object r11 = r1.M(r3, r12)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r11 != 0) goto L79
            r4 = r2
            com.google.android.gms.measurement.internal.zzge r4 = (com.google.android.gms.measurement.internal.zzge) r4     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            com.google.android.gms.measurement.internal.zzeu r4 = r4.f11780i     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            com.google.android.gms.measurement.internal.zzge.f(r4)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            com.google.android.gms.measurement.internal.zzes r4 = r4.f11712f     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            a8.o r6 = com.google.android.gms.measurement.internal.zzeu.v(r18)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r4.b(r6, r5)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            goto L84
        L79:
            a8.i2 r4 = new a8.i2     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r5 = r4
            r6 = r18
            r5.<init>(r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r0.add(r4)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
        L84:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r4 != 0) goto L4e
            r3.close()
            return r0
        L8e:
            r3.close()
            return r0
        L92:
            r0 = move-exception
            r12 = r3
            goto Lba
        L95:
            r0 = move-exception
            r12 = r3
            goto L9d
        L98:
            r0 = move-exception
            r12 = 0
            goto Lba
        L9b:
            r0 = move-exception
            r12 = 0
        L9d:
            com.google.android.gms.measurement.internal.zzge r2 = (com.google.android.gms.measurement.internal.zzge) r2     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.zzeu r2 = r2.f11780i     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.zzge.f(r2)     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.zzes r2 = r2.f11712f     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = "Error querying user properties. appId"
            a8.o r4 = com.google.android.gms.measurement.internal.zzeu.v(r18)     // Catch: java.lang.Throwable -> Lb9
            r2.c(r4, r3, r0)     // Catch: java.lang.Throwable -> Lb9
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lb9
            if (r12 == 0) goto Lb8
            r12.close()
        Lb8:
            return r0
        Lb9:
            r0 = move-exception
        Lba:
            if (r12 == 0) goto Lbf
            r12.close()
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.Q(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
        r0 = ((com.google.android.gms.measurement.internal.zzge) r2).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r0);
        r0 = r0.f11712f;
        ((com.google.android.gms.measurement.internal.zzge) r2).getClass();
        r0.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List R(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.R(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void S() {
        n();
        F().beginTransaction();
    }

    public final void T() {
        n();
        F().endTransaction();
    }

    @VisibleForTesting
    public final void U(List list) {
        m();
        n();
        if (list.size() != 0) {
            if (!u()) {
                return;
            }
            String d10 = a6.h.d("(", TextUtils.join(",", list), ")");
            int i10 = (A("SELECT COUNT(1) FROM queue WHERE rowid IN " + d10 + " AND retry_count =  2147483647 LIMIT 1", null) > 0L ? 1 : (A("SELECT COUNT(1) FROM queue WHERE rowid IN " + d10 + " AND retry_count =  2147483647 LIMIT 1", null) == 0L ? 0 : -1));
            Object obj = this.f3529a;
            if (i10 > 0) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase F = F();
                F.execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + d10 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e10) {
                zzeu zzeuVar2 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.b(e10, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final void V() {
        m();
        n();
        if (u()) {
            zzlg zzlgVar = this.f117b;
            long a10 = zzlgVar.f11890i.f11865e.a();
            zzge zzgeVar = (zzge) this.f3529a;
            zzgeVar.f11785n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a10);
            zzgeVar.getClass();
            if (abs > ((Long) zzeh.f11689z.a(null)).longValue()) {
                zzlgVar.f11890i.f11865e.b(elapsedRealtime);
                m();
                n();
                if (u()) {
                    SQLiteDatabase F = F();
                    zzgeVar.f11785n.getClass();
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    zzgeVar.getClass();
                    int delete = F.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(((Long) zzeh.E.a(null)).longValue())});
                    if (delete > 0) {
                        zzeu zzeuVar = zzgeVar.f11780i;
                        zzge.f(zzeuVar);
                        zzeuVar.f11720n.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void q(String str, String str2) {
        Preconditions.f(str);
        Preconditions.f(str2);
        m();
        n();
        try {
            F().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzge zzgeVar = (zzge) this.f3529a;
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.d("Error deleting user property. appId", zzeu.v(str), zzgeVar.f11784m.f(str2), e10);
        }
    }

    public final void r() {
        n();
        F().setTransactionSuccessful();
    }

    public final void s(n0 n0Var) {
        m();
        n();
        String E = n0Var.E();
        Preconditions.j(E);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", E);
        contentValues.put("app_instance_id", n0Var.F());
        contentValues.put("gmp_app_id", n0Var.I());
        zzge zzgeVar = n0Var.f239a;
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        contentValues.put("resettable_device_id_hash", n0Var.f242e);
        zzgb zzgbVar2 = zzgeVar.f11781j;
        zzge.f(zzgbVar2);
        zzgbVar2.m();
        contentValues.put("last_bundle_index", Long.valueOf(n0Var.f244g));
        zzgb zzgbVar3 = zzgeVar.f11781j;
        zzge.f(zzgbVar3);
        zzgbVar3.m();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(n0Var.f245h));
        zzgb zzgbVar4 = zzgeVar.f11781j;
        zzge.f(zzgbVar4);
        zzgbVar4.m();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(n0Var.f246i));
        contentValues.put("app_version", n0Var.G());
        zzgb zzgbVar5 = zzgeVar.f11781j;
        zzge.f(zzgbVar5);
        zzgbVar5.m();
        contentValues.put("app_store", n0Var.f249l);
        zzgb zzgbVar6 = zzgeVar.f11781j;
        zzge.f(zzgbVar6);
        zzgbVar6.m();
        contentValues.put("gmp_version", Long.valueOf(n0Var.f250m));
        zzgb zzgbVar7 = zzgeVar.f11781j;
        zzge.f(zzgbVar7);
        zzgbVar7.m();
        contentValues.put("dev_cert_hash", Long.valueOf(n0Var.f251n));
        zzgb zzgbVar8 = zzgeVar.f11781j;
        zzge.f(zzgbVar8);
        zzgbVar8.m();
        contentValues.put("measurement_enabled", Boolean.valueOf(n0Var.f252o));
        zzgb zzgbVar9 = zzgeVar.f11781j;
        zzge.f(zzgbVar9);
        zzgbVar9.m();
        contentValues.put("day", Long.valueOf(n0Var.f261x));
        zzgb zzgbVar10 = zzgeVar.f11781j;
        zzge.f(zzgbVar10);
        zzgbVar10.m();
        contentValues.put("daily_public_events_count", Long.valueOf(n0Var.f262y));
        zzge.f(zzgbVar10);
        zzgbVar10.m();
        contentValues.put("daily_events_count", Long.valueOf(n0Var.f263z));
        zzge.f(zzgbVar10);
        zzgbVar10.m();
        contentValues.put("daily_conversions_count", Long.valueOf(n0Var.A));
        zzgb zzgbVar11 = zzgeVar.f11781j;
        zzge.f(zzgbVar11);
        zzgbVar11.m();
        contentValues.put("config_fetched_time", Long.valueOf(n0Var.F));
        zzgb zzgbVar12 = zzgeVar.f11781j;
        zzge.f(zzgbVar12);
        zzgbVar12.m();
        contentValues.put("failed_config_fetch_time", Long.valueOf(n0Var.G));
        contentValues.put("app_version_int", Long.valueOf(n0Var.A()));
        contentValues.put("firebase_instance_id", n0Var.H());
        zzge.f(zzgbVar10);
        zzgbVar10.m();
        contentValues.put("daily_error_events_count", Long.valueOf(n0Var.B));
        zzge.f(zzgbVar10);
        zzgbVar10.m();
        contentValues.put("daily_realtime_events_count", Long.valueOf(n0Var.C));
        zzge.f(zzgbVar10);
        zzgbVar10.m();
        contentValues.put("health_monitor_sample", n0Var.D);
        zzgb zzgbVar13 = zzgeVar.f11781j;
        zzge.f(zzgbVar13);
        zzgbVar13.m();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(n0Var.y()));
        contentValues.put("admob_app_id", n0Var.C());
        contentValues.put("dynamite_version", Long.valueOf(n0Var.B()));
        zzgb zzgbVar14 = zzgeVar.f11781j;
        zzge.f(zzgbVar14);
        zzgbVar14.m();
        contentValues.put("session_stitching_token", n0Var.f258u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(n0Var.z()));
        zzgb zzgbVar15 = zzgeVar.f11781j;
        zzge.f(zzgbVar15);
        zzgbVar15.m();
        contentValues.put("target_os_version", Long.valueOf(n0Var.f260w));
        zzgb zzgbVar16 = zzgeVar.f11781j;
        zzge.f(zzgbVar16);
        zzgbVar16.m();
        ArrayList arrayList = n0Var.f257t;
        Object obj = this.f3529a;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.b(E, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        zzop.zzc();
        zzge zzgeVar2 = (zzge) obj;
        if (zzgeVar2.f11778g.v(null, zzeh.f11654h0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase F = F();
            if (F.update("apps", contentValues, "app_id = ?", new String[]{E}) == 0 && F.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzeu zzeuVar2 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.b(zzeu.v(E), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            zzeu zzeuVar3 = zzgeVar2.f11780i;
            zzge.f(zzeuVar3);
            zzeuVar3.f11712f.c(zzeu.v(E), "Error storing app. appId", e10);
        }
    }

    public final void t(g gVar) {
        Long l10;
        Object obj = this.f3529a;
        Preconditions.j(gVar);
        m();
        n();
        ContentValues contentValues = new ContentValues();
        String str = gVar.f163a;
        contentValues.put("app_id", str);
        contentValues.put(NamingTable.TAG, gVar.f164b);
        contentValues.put("lifetime_count", Long.valueOf(gVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(gVar.f165d));
        contentValues.put("last_fire_timestamp", Long.valueOf(gVar.f167f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(gVar.f168g));
        contentValues.put("last_bundled_day", gVar.f169h);
        contentValues.put("last_sampled_complex_event_id", gVar.f170i);
        contentValues.put("last_sampling_rate", gVar.f171j);
        contentValues.put("current_session_count", Long.valueOf(gVar.f166e));
        Boolean bool = gVar.f172k;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (F().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(zzeu.v(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.c(zzeu.v(str), "Error storing event aggregates. appId", e10);
        }
    }

    @VisibleForTesting
    public final boolean u() {
        Object obj = this.f3529a;
        Context context = ((zzge) obj).f11773a;
        ((zzge) obj).getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void v(String str, Long l10, long j10, zzft zzftVar) {
        m();
        n();
        Preconditions.j(zzftVar);
        Preconditions.f(str);
        byte[] zzbx = zzftVar.zzbx();
        Object obj = this.f3529a;
        zzge zzgeVar = (zzge) obj;
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.c(zzgeVar.f11784m.d(str), "Saving complex main event, appId, data size", Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbx);
        try {
            if (F().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzeu zzeuVar2 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.b(zzeu.v(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            zzeu zzeuVar3 = zzgeVar.f11780i;
            zzge.f(zzeuVar3);
            zzeuVar3.f11712f.c(zzeu.v(str), "Error storing complex main event. appId", e10);
        }
    }

    public final boolean w(zzac zzacVar) {
        m();
        n();
        String str = zzacVar.f11516a;
        Preconditions.j(str);
        i2 L = L(str, zzacVar.c.f11910b);
        Object obj = this.f3529a;
        if (L == null) {
            long A = A("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ((zzge) obj).getClass();
            if (A >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.f11517b);
        contentValues.put(NamingTable.TAG, zzacVar.c.f11910b);
        Object d10 = zzacVar.c.d();
        Preconditions.j(d10);
        z(contentValues, d10);
        contentValues.put("active", Boolean.valueOf(zzacVar.f11519e));
        contentValues.put("trigger_event_name", zzacVar.f11520f);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.f11522h));
        zzge zzgeVar = (zzge) obj;
        zzlo zzloVar = zzgeVar.f11783l;
        zzge.d(zzloVar);
        zzloVar.getClass();
        contentValues.put("timed_out_event", zzlo.f0(zzacVar.f11521g));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.f11518d));
        zzlo zzloVar2 = zzgeVar.f11783l;
        zzge.d(zzloVar2);
        zzaw zzawVar = zzacVar.f11523i;
        zzloVar2.getClass();
        contentValues.put("triggered_event", zzlo.f0(zzawVar));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.f11524j));
        zzlo zzloVar3 = zzgeVar.f11783l;
        zzge.d(zzloVar3);
        zzloVar3.getClass();
        contentValues.put("expired_event", zzlo.f0(zzacVar.f11525k));
        try {
            if (F().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(zzeu.v(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            zzeu zzeuVar2 = zzgeVar.f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.c(zzeu.v(str), "Error storing conditional user property", e10);
            return true;
        }
    }

    public final boolean x(i2 i2Var) {
        m();
        n();
        String str = i2Var.f199a;
        String str2 = i2Var.c;
        i2 L = L(str, str2);
        Object obj = this.f3529a;
        String str3 = i2Var.f200b;
        if (L == null) {
            if (zzlo.b0(str2)) {
                if (A("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= ((zzge) obj).f11778g.q(str, zzeh.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long A = A("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                ((zzge) obj).getClass();
                if (A >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put(NamingTable.TAG, str2);
        contentValues.put("set_timestamp", Long.valueOf(i2Var.f201d));
        z(contentValues, i2Var.f202e);
        try {
            if (F().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(zzeu.v(str), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.c(zzeu.v(str), "Error storing user property. appId", e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(long r22, long r24, a8.g2 r26) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.y(long, long, a8.g2):void");
    }

    @Override // a8.c2
    public final void p() {
    }
}
