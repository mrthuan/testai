package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0027a f4923a = new C0027a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f4924b = new b();
    public static final c c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final d f4925d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final e f4926e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final f f4927f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final g f4928g = new g();

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0027a extends x1.a {
        public C0027a() {
            super(1, 2);
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.c("DROP TABLE IF EXISTS alarmInfo");
            aVar.c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class b extends x1.a {
        public b() {
            super(3, 4);
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class c extends x1.a {
        public c() {
            super(4, 5);
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar.c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class d extends x1.a {
        public d() {
            super(6, 7);
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class e extends x1.a {
        public e() {
            super(7, 8);
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class f extends x1.a {
        public f() {
            super(8, 9);
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class g extends x1.a {
        public g() {
            super(11, 12);
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class h extends x1.a {
        public final Context c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.c = context;
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            if (this.f31536b >= 10) {
                aVar.f5307a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class i extends x1.a {
        public final Context c;

        public i(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // x1.a
        public final void a(b2.a aVar) {
            aVar.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            boolean contains = sharedPreferences.contains("reschedule_needed");
            SQLiteDatabase sQLiteDatabase = aVar.f5307a;
            if (contains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j10 = 0;
                long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j10 = 1;
                }
                aVar.a();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                    sharedPreferences.edit().clear().apply();
                    aVar.h();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar.a();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                    sharedPreferences2.edit().clear().apply();
                    aVar.h();
                } finally {
                }
            }
        }
    }
}
