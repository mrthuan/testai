package androidx.work.impl;

import a2.c;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.c;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import w1.g;
import x2.b;
import x2.c;
import x2.e;
import x2.f;
import x2.h;
import x2.i;
import x2.k;
import x2.l;
import x2.n;
import x2.o;
import x2.q;
import x2.r;
import x2.t;
import x2.u;
import y1.c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f4914s = 0;

    /* renamed from: l  reason: collision with root package name */
    public volatile r f4915l;

    /* renamed from: m  reason: collision with root package name */
    public volatile c f4916m;

    /* renamed from: n  reason: collision with root package name */
    public volatile u f4917n;

    /* renamed from: o  reason: collision with root package name */
    public volatile i f4918o;

    /* renamed from: p  reason: collision with root package name */
    public volatile l f4919p;

    /* renamed from: q  reason: collision with root package name */
    public volatile o f4920q;

    /* renamed from: r  reason: collision with root package name */
    public volatile f f4921r;

    @Override // androidx.room.RoomDatabase
    public final g e() {
        return new g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final a2.c f(androidx.room.a aVar) {
        androidx.room.c cVar = new androidx.room.c(aVar, new a(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = aVar.f4645b;
        if (context != null) {
            return aVar.f4644a.a(new c.b(context, aVar.c, cVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b k() {
        x2.c cVar;
        if (this.f4916m != null) {
            return this.f4916m;
        }
        synchronized (this) {
            if (this.f4916m == null) {
                this.f4916m = new x2.c(this);
            }
            cVar = this.f4916m;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        f fVar;
        if (this.f4921r != null) {
            return this.f4921r;
        }
        synchronized (this) {
            if (this.f4921r == null) {
                this.f4921r = new f(this);
            }
            fVar = this.f4921r;
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h m() {
        i iVar;
        if (this.f4918o != null) {
            return this.f4918o;
        }
        synchronized (this) {
            if (this.f4918o == null) {
                this.f4918o = new i(this);
            }
            iVar = this.f4918o;
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k n() {
        l lVar;
        if (this.f4919p != null) {
            return this.f4919p;
        }
        synchronized (this) {
            if (this.f4919p == null) {
                this.f4919p = new l(this);
            }
            lVar = this.f4919p;
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n o() {
        o oVar;
        if (this.f4920q != null) {
            return this.f4920q;
        }
        synchronized (this) {
            if (this.f4920q == null) {
                this.f4920q = new o(this);
            }
            oVar = this.f4920q;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q p() {
        r rVar;
        if (this.f4915l != null) {
            return this.f4915l;
        }
        synchronized (this) {
            if (this.f4915l == null) {
                this.f4915l = new r(this);
            }
            rVar = this.f4915l;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t q() {
        u uVar;
        if (this.f4917n != null) {
            return this.f4917n;
        }
        synchronized (this) {
            if (this.f4917n == null) {
                this.f4917n = new u(this);
            }
            uVar = this.f4917n;
        }
        return uVar;
    }

    /* loaded from: classes.dex */
    public class a extends c.a {
        public a() {
            super(12);
        }

        @Override // androidx.room.c.a
        public final void a(b2.a aVar) {
            aVar.c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.c("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.c("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.c.a
        public final void b(b2.a aVar) {
            aVar.c("DROP TABLE IF EXISTS `Dependency`");
            aVar.c("DROP TABLE IF EXISTS `WorkSpec`");
            aVar.c("DROP TABLE IF EXISTS `WorkTag`");
            aVar.c("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.c("DROP TABLE IF EXISTS `WorkName`");
            aVar.c("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.c("DROP TABLE IF EXISTS `Preference`");
            int i10 = WorkDatabase_Impl.f4914s;
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<RoomDatabase.b> list = workDatabase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    workDatabase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void c() {
            int i10 = WorkDatabase_Impl.f4914s;
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<RoomDatabase.b> list = workDatabase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    workDatabase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void d(b2.a aVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f4914s;
            workDatabase_Impl.f4622a = aVar;
            aVar.c("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.h(aVar);
            List<RoomDatabase.b> list = WorkDatabase_Impl.this.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.f4627g.get(i11).a(aVar);
                }
            }
        }

        @Override // androidx.room.c.a
        public final void f(b2.a aVar) {
            y1.b.a(aVar);
        }

        @Override // androidx.room.c.a
        public final c.b g(b2.a aVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new c.a(1, "work_spec_id", 1, true, "TEXT", null));
            hashMap.put("prerequisite_id", new c.a(2, "prerequisite_id", 1, true, "TEXT", null));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new c.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
            hashSet2.add(new c.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
            y1.c cVar = new y1.c("Dependency", hashMap, hashSet, hashSet2);
            y1.c a10 = y1.c.a(aVar, "Dependency");
            if (!cVar.equals(a10)) {
                return new c.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + cVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(FacebookMediationAdapter.KEY_ID, new c.a(1, FacebookMediationAdapter.KEY_ID, 1, true, "TEXT", null));
            hashMap2.put("state", new c.a(0, "state", 1, true, "INTEGER", null));
            hashMap2.put("worker_class_name", new c.a(0, "worker_class_name", 1, true, "TEXT", null));
            hashMap2.put("input_merger_class_name", new c.a(0, "input_merger_class_name", 1, false, "TEXT", null));
            hashMap2.put("input", new c.a(0, "input", 1, true, "BLOB", null));
            hashMap2.put("output", new c.a(0, "output", 1, true, "BLOB", null));
            hashMap2.put("initial_delay", new c.a(0, "initial_delay", 1, true, "INTEGER", null));
            hashMap2.put("interval_duration", new c.a(0, "interval_duration", 1, true, "INTEGER", null));
            hashMap2.put("flex_duration", new c.a(0, "flex_duration", 1, true, "INTEGER", null));
            hashMap2.put("run_attempt_count", new c.a(0, "run_attempt_count", 1, true, "INTEGER", null));
            hashMap2.put("backoff_policy", new c.a(0, "backoff_policy", 1, true, "INTEGER", null));
            hashMap2.put("backoff_delay_duration", new c.a(0, "backoff_delay_duration", 1, true, "INTEGER", null));
            hashMap2.put("period_start_time", new c.a(0, "period_start_time", 1, true, "INTEGER", null));
            hashMap2.put("minimum_retention_duration", new c.a(0, "minimum_retention_duration", 1, true, "INTEGER", null));
            hashMap2.put("schedule_requested_at", new c.a(0, "schedule_requested_at", 1, true, "INTEGER", null));
            hashMap2.put("run_in_foreground", new c.a(0, "run_in_foreground", 1, true, "INTEGER", null));
            hashMap2.put("out_of_quota_policy", new c.a(0, "out_of_quota_policy", 1, true, "INTEGER", null));
            hashMap2.put("required_network_type", new c.a(0, "required_network_type", 1, false, "INTEGER", null));
            hashMap2.put("requires_charging", new c.a(0, "requires_charging", 1, true, "INTEGER", null));
            hashMap2.put("requires_device_idle", new c.a(0, "requires_device_idle", 1, true, "INTEGER", null));
            hashMap2.put("requires_battery_not_low", new c.a(0, "requires_battery_not_low", 1, true, "INTEGER", null));
            hashMap2.put("requires_storage_not_low", new c.a(0, "requires_storage_not_low", 1, true, "INTEGER", null));
            hashMap2.put("trigger_content_update_delay", new c.a(0, "trigger_content_update_delay", 1, true, "INTEGER", null));
            hashMap2.put("trigger_max_content_delay", new c.a(0, "trigger_max_content_delay", 1, true, "INTEGER", null));
            hashMap2.put("content_uri_triggers", new c.a(0, "content_uri_triggers", 1, false, "BLOB", null));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new c.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
            hashSet4.add(new c.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
            y1.c cVar2 = new y1.c("WorkSpec", hashMap2, hashSet3, hashSet4);
            y1.c a11 = y1.c.a(aVar, "WorkSpec");
            if (!cVar2.equals(a11)) {
                return new c.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + cVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new c.a(1, "tag", 1, true, "TEXT", null));
            hashMap3.put("work_spec_id", new c.a(2, "work_spec_id", 1, true, "TEXT", null));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new c.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
            y1.c cVar3 = new y1.c("WorkTag", hashMap3, hashSet5, hashSet6);
            y1.c a12 = y1.c.a(aVar, "WorkTag");
            if (!cVar3.equals(a12)) {
                return new c.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + cVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new c.a(1, "work_spec_id", 1, true, "TEXT", null));
            hashMap4.put("system_id", new c.a(0, "system_id", 1, true, "INTEGER", null));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            y1.c cVar4 = new y1.c("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            y1.c a13 = y1.c.a(aVar, "SystemIdInfo");
            if (!cVar4.equals(a13)) {
                return new c.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + cVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(NamingTable.TAG, new c.a(1, NamingTable.TAG, 1, true, "TEXT", null));
            hashMap5.put("work_spec_id", new c.a(2, "work_spec_id", 1, true, "TEXT", null));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new c.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
            y1.c cVar5 = new y1.c("WorkName", hashMap5, hashSet8, hashSet9);
            y1.c a14 = y1.c.a(aVar, "WorkName");
            if (!cVar5.equals(a14)) {
                return new c.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + cVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new c.a(1, "work_spec_id", 1, true, "TEXT", null));
            hashMap6.put("progress", new c.a(0, "progress", 1, true, "BLOB", null));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            y1.c cVar6 = new y1.c("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            y1.c a15 = y1.c.a(aVar, "WorkProgress");
            if (!cVar6.equals(a15)) {
                return new c.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + cVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new c.a(1, "key", 1, true, "TEXT", null));
            hashMap7.put("long_value", new c.a(0, "long_value", 1, false, "INTEGER", null));
            y1.c cVar7 = new y1.c("Preference", hashMap7, new HashSet(0), new HashSet(0));
            y1.c a16 = y1.c.a(aVar, "Preference");
            if (!cVar7.equals(a16)) {
                return new c.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + cVar7 + "\n Found:\n" + a16);
            }
            return new c.b(true, null);
        }

        @Override // androidx.room.c.a
        public final void e() {
        }
    }
}
