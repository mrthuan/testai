package x2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.WorkInfo$State;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x2.p;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f31577a;

    /* renamed from: b  reason: collision with root package name */
    public final a f31578b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final c f31579d;

    /* renamed from: e  reason: collision with root package name */
    public final d f31580e;

    /* renamed from: f  reason: collision with root package name */
    public final e f31581f;

    /* renamed from: g  reason: collision with root package name */
    public final f f31582g;

    /* renamed from: h  reason: collision with root package name */
    public final g f31583h;

    /* renamed from: i  reason: collision with root package name */
    public final h f31584i;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends w1.b<p> {
        @Override // w1.j
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01bc -> B:104:0x01bf). Please submit an issue!!! */
        @Override // w1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(b2.e r19, x2.p r20) {
            /*
                Method dump skipped, instructions count: 528
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x2.r.a.d(b2.e, java.lang.Object):void");
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends w1.j {
        @Override // w1.j
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends w1.j {
        @Override // w1.j
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class d extends w1.j {
        @Override // w1.j
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class e extends w1.j {
        @Override // w1.j
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class f extends w1.j {
        @Override // w1.j
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class g extends w1.j {
        @Override // w1.j
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class h extends w1.j {
        @Override // w1.j
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public r(RoomDatabase roomDatabase) {
        this.f31577a = roomDatabase;
        this.f31578b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.f31579d = new c(roomDatabase);
        this.f31580e = new d(roomDatabase);
        this.f31581f = new e(roomDatabase);
        this.f31582g = new f(roomDatabase);
        this.f31583h = new g(roomDatabase);
        this.f31584i = new h(roomDatabase);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        b bVar = this.c;
        b2.e a10 = bVar.a();
        if (str == null) {
            a10.d(1);
        } else {
            a10.f(1, str);
        }
        roomDatabase.c();
        try {
            a10.h();
            roomDatabase.j();
        } finally {
            roomDatabase.g();
            bVar.c(a10);
        }
    }

    public final ArrayList b() {
        w1.h hVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        w1.h b10 = w1.h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        b10.d(1, 200);
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            int N = t0.N(i10, "required_network_type");
            int N2 = t0.N(i10, "requires_charging");
            int N3 = t0.N(i10, "requires_device_idle");
            int N4 = t0.N(i10, "requires_battery_not_low");
            int N5 = t0.N(i10, "requires_storage_not_low");
            int N6 = t0.N(i10, "trigger_content_update_delay");
            int N7 = t0.N(i10, "trigger_max_content_delay");
            int N8 = t0.N(i10, "content_uri_triggers");
            int N9 = t0.N(i10, FacebookMediationAdapter.KEY_ID);
            int N10 = t0.N(i10, "state");
            int N11 = t0.N(i10, "worker_class_name");
            int N12 = t0.N(i10, "input_merger_class_name");
            int N13 = t0.N(i10, "input");
            int N14 = t0.N(i10, "output");
            hVar = b10;
            try {
                int N15 = t0.N(i10, "initial_delay");
                int N16 = t0.N(i10, "interval_duration");
                int N17 = t0.N(i10, "flex_duration");
                int N18 = t0.N(i10, "run_attempt_count");
                int N19 = t0.N(i10, "backoff_policy");
                int N20 = t0.N(i10, "backoff_delay_duration");
                int N21 = t0.N(i10, "period_start_time");
                int N22 = t0.N(i10, "minimum_retention_duration");
                int N23 = t0.N(i10, "schedule_requested_at");
                int N24 = t0.N(i10, "run_in_foreground");
                int N25 = t0.N(i10, "out_of_quota_policy");
                int i11 = N14;
                ArrayList arrayList = new ArrayList(i10.getCount());
                while (i10.moveToNext()) {
                    String string = i10.getString(N9);
                    int i12 = N9;
                    String string2 = i10.getString(N11);
                    int i13 = N11;
                    o2.b bVar = new o2.b();
                    int i14 = N;
                    bVar.f22669a = v.c(i10.getInt(N));
                    if (i10.getInt(N2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f22670b = z10;
                    if (i10.getInt(N3) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.c = z11;
                    if (i10.getInt(N4) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar.f22671d = z12;
                    if (i10.getInt(N5) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bVar.f22672e = z13;
                    int i15 = N2;
                    int i16 = N3;
                    bVar.f22673f = i10.getLong(N6);
                    bVar.f22674g = i10.getLong(N7);
                    bVar.f22675h = v.a(i10.getBlob(N8));
                    p pVar = new p(string, string2);
                    pVar.f31559b = v.e(i10.getInt(N10));
                    pVar.f31560d = i10.getString(N12);
                    pVar.f31561e = androidx.work.b.a(i10.getBlob(N13));
                    int i17 = i11;
                    pVar.f31562f = androidx.work.b.a(i10.getBlob(i17));
                    int i18 = N13;
                    int i19 = N15;
                    pVar.f31563g = i10.getLong(i19);
                    int i20 = N4;
                    int i21 = N16;
                    pVar.f31564h = i10.getLong(i21);
                    int i22 = N17;
                    pVar.f31565i = i10.getLong(i22);
                    int i23 = N18;
                    pVar.f31567k = i10.getInt(i23);
                    int i24 = N19;
                    pVar.f31568l = v.b(i10.getInt(i24));
                    int i25 = N20;
                    pVar.f31569m = i10.getLong(i25);
                    int i26 = N21;
                    pVar.f31570n = i10.getLong(i26);
                    int i27 = N22;
                    pVar.f31571o = i10.getLong(i27);
                    int i28 = N23;
                    pVar.f31572p = i10.getLong(i28);
                    int i29 = N24;
                    if (i10.getInt(i29) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f31573q = z14;
                    int i30 = N25;
                    pVar.f31574r = v.d(i10.getInt(i30));
                    pVar.f31566j = bVar;
                    arrayList.add(pVar);
                    i11 = i17;
                    N2 = i15;
                    N15 = i19;
                    N16 = i21;
                    N20 = i25;
                    N21 = i26;
                    N24 = i29;
                    N11 = i13;
                    N = i14;
                    N25 = i30;
                    N23 = i28;
                    N13 = i18;
                    N9 = i12;
                    N3 = i16;
                    N22 = i27;
                    N4 = i20;
                    N17 = i22;
                    N18 = i23;
                    N19 = i24;
                }
                i10.close();
                hVar.i();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                i10.close();
                hVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = b10;
        }
    }

    public final ArrayList c(int i10) {
        w1.h hVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        w1.h b10 = w1.h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        b10.d(1, i10);
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i11 = roomDatabase.i(b10);
        try {
            int N = t0.N(i11, "required_network_type");
            int N2 = t0.N(i11, "requires_charging");
            int N3 = t0.N(i11, "requires_device_idle");
            int N4 = t0.N(i11, "requires_battery_not_low");
            int N5 = t0.N(i11, "requires_storage_not_low");
            int N6 = t0.N(i11, "trigger_content_update_delay");
            int N7 = t0.N(i11, "trigger_max_content_delay");
            int N8 = t0.N(i11, "content_uri_triggers");
            int N9 = t0.N(i11, FacebookMediationAdapter.KEY_ID);
            int N10 = t0.N(i11, "state");
            int N11 = t0.N(i11, "worker_class_name");
            int N12 = t0.N(i11, "input_merger_class_name");
            int N13 = t0.N(i11, "input");
            int N14 = t0.N(i11, "output");
            hVar = b10;
            try {
                int N15 = t0.N(i11, "initial_delay");
                int N16 = t0.N(i11, "interval_duration");
                int N17 = t0.N(i11, "flex_duration");
                int N18 = t0.N(i11, "run_attempt_count");
                int N19 = t0.N(i11, "backoff_policy");
                int N20 = t0.N(i11, "backoff_delay_duration");
                int N21 = t0.N(i11, "period_start_time");
                int N22 = t0.N(i11, "minimum_retention_duration");
                int N23 = t0.N(i11, "schedule_requested_at");
                int N24 = t0.N(i11, "run_in_foreground");
                int N25 = t0.N(i11, "out_of_quota_policy");
                int i12 = N14;
                ArrayList arrayList = new ArrayList(i11.getCount());
                while (i11.moveToNext()) {
                    String string = i11.getString(N9);
                    int i13 = N9;
                    String string2 = i11.getString(N11);
                    int i14 = N11;
                    o2.b bVar = new o2.b();
                    int i15 = N;
                    bVar.f22669a = v.c(i11.getInt(N));
                    if (i11.getInt(N2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f22670b = z10;
                    if (i11.getInt(N3) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.c = z11;
                    if (i11.getInt(N4) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar.f22671d = z12;
                    if (i11.getInt(N5) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bVar.f22672e = z13;
                    int i16 = N2;
                    int i17 = N3;
                    bVar.f22673f = i11.getLong(N6);
                    bVar.f22674g = i11.getLong(N7);
                    bVar.f22675h = v.a(i11.getBlob(N8));
                    p pVar = new p(string, string2);
                    pVar.f31559b = v.e(i11.getInt(N10));
                    pVar.f31560d = i11.getString(N12);
                    pVar.f31561e = androidx.work.b.a(i11.getBlob(N13));
                    int i18 = i12;
                    pVar.f31562f = androidx.work.b.a(i11.getBlob(i18));
                    int i19 = N15;
                    int i20 = N13;
                    pVar.f31563g = i11.getLong(i19);
                    int i21 = N4;
                    int i22 = N16;
                    pVar.f31564h = i11.getLong(i22);
                    int i23 = N17;
                    pVar.f31565i = i11.getLong(i23);
                    int i24 = N18;
                    pVar.f31567k = i11.getInt(i24);
                    int i25 = N19;
                    pVar.f31568l = v.b(i11.getInt(i25));
                    int i26 = N20;
                    pVar.f31569m = i11.getLong(i26);
                    int i27 = N21;
                    pVar.f31570n = i11.getLong(i27);
                    int i28 = N22;
                    pVar.f31571o = i11.getLong(i28);
                    int i29 = N23;
                    pVar.f31572p = i11.getLong(i29);
                    int i30 = N24;
                    if (i11.getInt(i30) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f31573q = z14;
                    int i31 = N25;
                    pVar.f31574r = v.d(i11.getInt(i31));
                    pVar.f31566j = bVar;
                    arrayList.add(pVar);
                    i12 = i18;
                    N2 = i16;
                    N24 = i30;
                    N9 = i13;
                    N11 = i14;
                    N = i15;
                    N25 = i31;
                    N13 = i20;
                    N15 = i19;
                    N16 = i22;
                    N20 = i26;
                    N21 = i27;
                    N23 = i29;
                    N3 = i17;
                    N22 = i28;
                    N4 = i21;
                    N17 = i23;
                    N18 = i24;
                    N19 = i25;
                }
                i11.close();
                hVar.i();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                i11.close();
                hVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = b10;
        }
    }

    public final ArrayList d() {
        w1.h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        int N11;
        int N12;
        int N13;
        int N14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        w1.h b10 = w1.h.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            N = t0.N(i10, "required_network_type");
            N2 = t0.N(i10, "requires_charging");
            N3 = t0.N(i10, "requires_device_idle");
            N4 = t0.N(i10, "requires_battery_not_low");
            N5 = t0.N(i10, "requires_storage_not_low");
            N6 = t0.N(i10, "trigger_content_update_delay");
            N7 = t0.N(i10, "trigger_max_content_delay");
            N8 = t0.N(i10, "content_uri_triggers");
            N9 = t0.N(i10, FacebookMediationAdapter.KEY_ID);
            N10 = t0.N(i10, "state");
            N11 = t0.N(i10, "worker_class_name");
            N12 = t0.N(i10, "input_merger_class_name");
            N13 = t0.N(i10, "input");
            N14 = t0.N(i10, "output");
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N15 = t0.N(i10, "initial_delay");
            int N16 = t0.N(i10, "interval_duration");
            int N17 = t0.N(i10, "flex_duration");
            int N18 = t0.N(i10, "run_attempt_count");
            int N19 = t0.N(i10, "backoff_policy");
            int N20 = t0.N(i10, "backoff_delay_duration");
            int N21 = t0.N(i10, "period_start_time");
            int N22 = t0.N(i10, "minimum_retention_duration");
            int N23 = t0.N(i10, "schedule_requested_at");
            int N24 = t0.N(i10, "run_in_foreground");
            int N25 = t0.N(i10, "out_of_quota_policy");
            int i11 = N14;
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                String string = i10.getString(N9);
                int i12 = N9;
                String string2 = i10.getString(N11);
                int i13 = N11;
                o2.b bVar = new o2.b();
                int i14 = N;
                bVar.f22669a = v.c(i10.getInt(N));
                if (i10.getInt(N2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.f22670b = z10;
                if (i10.getInt(N3) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.c = z11;
                if (i10.getInt(N4) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar.f22671d = z12;
                if (i10.getInt(N5) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar.f22672e = z13;
                int i15 = N2;
                int i16 = N3;
                bVar.f22673f = i10.getLong(N6);
                bVar.f22674g = i10.getLong(N7);
                bVar.f22675h = v.a(i10.getBlob(N8));
                p pVar = new p(string, string2);
                pVar.f31559b = v.e(i10.getInt(N10));
                pVar.f31560d = i10.getString(N12);
                pVar.f31561e = androidx.work.b.a(i10.getBlob(N13));
                int i17 = i11;
                pVar.f31562f = androidx.work.b.a(i10.getBlob(i17));
                int i18 = N13;
                int i19 = N15;
                pVar.f31563g = i10.getLong(i19);
                int i20 = N4;
                int i21 = N16;
                pVar.f31564h = i10.getLong(i21);
                int i22 = N17;
                pVar.f31565i = i10.getLong(i22);
                int i23 = N18;
                pVar.f31567k = i10.getInt(i23);
                int i24 = N19;
                pVar.f31568l = v.b(i10.getInt(i24));
                int i25 = N20;
                pVar.f31569m = i10.getLong(i25);
                int i26 = N21;
                pVar.f31570n = i10.getLong(i26);
                int i27 = N22;
                pVar.f31571o = i10.getLong(i27);
                int i28 = N23;
                pVar.f31572p = i10.getLong(i28);
                int i29 = N24;
                if (i10.getInt(i29) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f31573q = z14;
                int i30 = N25;
                pVar.f31574r = v.d(i10.getInt(i30));
                pVar.f31566j = bVar;
                arrayList.add(pVar);
                i11 = i17;
                N2 = i15;
                N15 = i19;
                N16 = i21;
                N20 = i25;
                N21 = i26;
                N24 = i29;
                N11 = i13;
                N = i14;
                N25 = i30;
                N23 = i28;
                N13 = i18;
                N9 = i12;
                N3 = i16;
                N22 = i27;
                N4 = i20;
                N17 = i22;
                N18 = i23;
                N19 = i24;
            }
            i10.close();
            hVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            i10.close();
            hVar.i();
            throw th;
        }
    }

    public final ArrayList e() {
        w1.h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        int N11;
        int N12;
        int N13;
        int N14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        w1.h b10 = w1.h.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            N = t0.N(i10, "required_network_type");
            N2 = t0.N(i10, "requires_charging");
            N3 = t0.N(i10, "requires_device_idle");
            N4 = t0.N(i10, "requires_battery_not_low");
            N5 = t0.N(i10, "requires_storage_not_low");
            N6 = t0.N(i10, "trigger_content_update_delay");
            N7 = t0.N(i10, "trigger_max_content_delay");
            N8 = t0.N(i10, "content_uri_triggers");
            N9 = t0.N(i10, FacebookMediationAdapter.KEY_ID);
            N10 = t0.N(i10, "state");
            N11 = t0.N(i10, "worker_class_name");
            N12 = t0.N(i10, "input_merger_class_name");
            N13 = t0.N(i10, "input");
            N14 = t0.N(i10, "output");
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N15 = t0.N(i10, "initial_delay");
            int N16 = t0.N(i10, "interval_duration");
            int N17 = t0.N(i10, "flex_duration");
            int N18 = t0.N(i10, "run_attempt_count");
            int N19 = t0.N(i10, "backoff_policy");
            int N20 = t0.N(i10, "backoff_delay_duration");
            int N21 = t0.N(i10, "period_start_time");
            int N22 = t0.N(i10, "minimum_retention_duration");
            int N23 = t0.N(i10, "schedule_requested_at");
            int N24 = t0.N(i10, "run_in_foreground");
            int N25 = t0.N(i10, "out_of_quota_policy");
            int i11 = N14;
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                String string = i10.getString(N9);
                int i12 = N9;
                String string2 = i10.getString(N11);
                int i13 = N11;
                o2.b bVar = new o2.b();
                int i14 = N;
                bVar.f22669a = v.c(i10.getInt(N));
                if (i10.getInt(N2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.f22670b = z10;
                if (i10.getInt(N3) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.c = z11;
                if (i10.getInt(N4) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar.f22671d = z12;
                if (i10.getInt(N5) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar.f22672e = z13;
                int i15 = N2;
                int i16 = N3;
                bVar.f22673f = i10.getLong(N6);
                bVar.f22674g = i10.getLong(N7);
                bVar.f22675h = v.a(i10.getBlob(N8));
                p pVar = new p(string, string2);
                pVar.f31559b = v.e(i10.getInt(N10));
                pVar.f31560d = i10.getString(N12);
                pVar.f31561e = androidx.work.b.a(i10.getBlob(N13));
                int i17 = i11;
                pVar.f31562f = androidx.work.b.a(i10.getBlob(i17));
                int i18 = N13;
                int i19 = N15;
                pVar.f31563g = i10.getLong(i19);
                int i20 = N4;
                int i21 = N16;
                pVar.f31564h = i10.getLong(i21);
                int i22 = N17;
                pVar.f31565i = i10.getLong(i22);
                int i23 = N18;
                pVar.f31567k = i10.getInt(i23);
                int i24 = N19;
                pVar.f31568l = v.b(i10.getInt(i24));
                int i25 = N20;
                pVar.f31569m = i10.getLong(i25);
                int i26 = N21;
                pVar.f31570n = i10.getLong(i26);
                int i27 = N22;
                pVar.f31571o = i10.getLong(i27);
                int i28 = N23;
                pVar.f31572p = i10.getLong(i28);
                int i29 = N24;
                if (i10.getInt(i29) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f31573q = z14;
                int i30 = N25;
                pVar.f31574r = v.d(i10.getInt(i30));
                pVar.f31566j = bVar;
                arrayList.add(pVar);
                i11 = i17;
                N2 = i15;
                N15 = i19;
                N16 = i21;
                N20 = i25;
                N21 = i26;
                N24 = i29;
                N11 = i13;
                N = i14;
                N25 = i30;
                N23 = i28;
                N13 = i18;
                N9 = i12;
                N3 = i16;
                N22 = i27;
                N4 = i20;
                N17 = i22;
                N18 = i23;
                N19 = i24;
            }
            i10.close();
            hVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            i10.close();
            hVar.i();
            throw th;
        }
    }

    public final WorkInfo$State f(String str) {
        WorkInfo$State workInfo$State;
        w1.h b10 = w1.h.b(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            if (i10.moveToFirst()) {
                workInfo$State = v.e(i10.getInt(0));
            } else {
                workInfo$State = null;
            }
            return workInfo$State;
        } finally {
            i10.close();
            b10.i();
        }
    }

    public final ArrayList g(String str) {
        w1.h b10 = w1.h.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                arrayList.add(i10.getString(0));
            }
            return arrayList;
        } finally {
            i10.close();
            b10.i();
        }
    }

    public final ArrayList h(String str) {
        w1.h b10 = w1.h.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                arrayList.add(i10.getString(0));
            }
            return arrayList;
        } finally {
            i10.close();
            b10.i();
        }
    }

    public final p i(String str) {
        w1.h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        int N11;
        int N12;
        int N13;
        int N14;
        p pVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        w1.h b10 = w1.h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            N = t0.N(i10, "required_network_type");
            N2 = t0.N(i10, "requires_charging");
            N3 = t0.N(i10, "requires_device_idle");
            N4 = t0.N(i10, "requires_battery_not_low");
            N5 = t0.N(i10, "requires_storage_not_low");
            N6 = t0.N(i10, "trigger_content_update_delay");
            N7 = t0.N(i10, "trigger_max_content_delay");
            N8 = t0.N(i10, "content_uri_triggers");
            N9 = t0.N(i10, FacebookMediationAdapter.KEY_ID);
            N10 = t0.N(i10, "state");
            N11 = t0.N(i10, "worker_class_name");
            N12 = t0.N(i10, "input_merger_class_name");
            N13 = t0.N(i10, "input");
            N14 = t0.N(i10, "output");
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N15 = t0.N(i10, "initial_delay");
            int N16 = t0.N(i10, "interval_duration");
            int N17 = t0.N(i10, "flex_duration");
            int N18 = t0.N(i10, "run_attempt_count");
            int N19 = t0.N(i10, "backoff_policy");
            int N20 = t0.N(i10, "backoff_delay_duration");
            int N21 = t0.N(i10, "period_start_time");
            int N22 = t0.N(i10, "minimum_retention_duration");
            int N23 = t0.N(i10, "schedule_requested_at");
            int N24 = t0.N(i10, "run_in_foreground");
            int N25 = t0.N(i10, "out_of_quota_policy");
            if (i10.moveToFirst()) {
                String string = i10.getString(N9);
                String string2 = i10.getString(N11);
                o2.b bVar = new o2.b();
                bVar.f22669a = v.c(i10.getInt(N));
                if (i10.getInt(N2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.f22670b = z10;
                if (i10.getInt(N3) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.c = z11;
                if (i10.getInt(N4) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar.f22671d = z12;
                if (i10.getInt(N5) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar.f22672e = z13;
                bVar.f22673f = i10.getLong(N6);
                bVar.f22674g = i10.getLong(N7);
                bVar.f22675h = v.a(i10.getBlob(N8));
                pVar = new p(string, string2);
                pVar.f31559b = v.e(i10.getInt(N10));
                pVar.f31560d = i10.getString(N12);
                pVar.f31561e = androidx.work.b.a(i10.getBlob(N13));
                pVar.f31562f = androidx.work.b.a(i10.getBlob(N14));
                pVar.f31563g = i10.getLong(N15);
                pVar.f31564h = i10.getLong(N16);
                pVar.f31565i = i10.getLong(N17);
                pVar.f31567k = i10.getInt(N18);
                pVar.f31568l = v.b(i10.getInt(N19));
                pVar.f31569m = i10.getLong(N20);
                pVar.f31570n = i10.getLong(N21);
                pVar.f31571o = i10.getLong(N22);
                pVar.f31572p = i10.getLong(N23);
                if (i10.getInt(N24) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f31573q = z14;
                pVar.f31574r = v.d(i10.getInt(N25));
                pVar.f31566j = bVar;
            } else {
                pVar = null;
            }
            i10.close();
            hVar.i();
            return pVar;
        } catch (Throwable th3) {
            th = th3;
            i10.close();
            hVar.i();
            throw th;
        }
    }

    public final ArrayList j(String str) {
        w1.h b10 = w1.h.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            int N = t0.N(i10, FacebookMediationAdapter.KEY_ID);
            int N2 = t0.N(i10, "state");
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                p.a aVar = new p.a();
                aVar.f31575a = i10.getString(N);
                aVar.f31576b = v.e(i10.getInt(N2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            i10.close();
            b10.i();
        }
    }

    public final int k(long j10, String str) {
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        g gVar = this.f31583h;
        b2.e a10 = gVar.a();
        a10.c(1, j10);
        if (str == null) {
            a10.d(2);
        } else {
            a10.f(2, str);
        }
        roomDatabase.c();
        try {
            int h10 = a10.h();
            roomDatabase.j();
            return h10;
        } finally {
            roomDatabase.g();
            gVar.c(a10);
        }
    }

    public final void l(String str, androidx.work.b bVar) {
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        c cVar = this.f31579d;
        b2.e a10 = cVar.a();
        byte[] c10 = androidx.work.b.c(bVar);
        if (c10 == null) {
            a10.d(1);
        } else {
            a10.a(1, c10);
        }
        if (str == null) {
            a10.d(2);
        } else {
            a10.f(2, str);
        }
        roomDatabase.c();
        try {
            a10.h();
            roomDatabase.j();
        } finally {
            roomDatabase.g();
            cVar.c(a10);
        }
    }

    public final void m(long j10, String str) {
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        d dVar = this.f31580e;
        b2.e a10 = dVar.a();
        a10.c(1, j10);
        if (str == null) {
            a10.d(2);
        } else {
            a10.f(2, str);
        }
        roomDatabase.c();
        try {
            a10.h();
            roomDatabase.j();
        } finally {
            roomDatabase.g();
            dVar.c(a10);
        }
    }

    public final int n(WorkInfo$State workInfo$State, String... strArr) {
        RoomDatabase roomDatabase = this.f31577a;
        roomDatabase.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE workspec SET state=? WHERE id IN (");
        b.b.i(sb2, strArr.length);
        sb2.append(")");
        b2.e d10 = roomDatabase.d(sb2.toString());
        d10.c(1, v.f(workInfo$State));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.d(i10);
            } else {
                d10.f(i10, str);
            }
            i10++;
        }
        roomDatabase.c();
        try {
            int h10 = d10.h();
            roomDatabase.j();
            return h10;
        } finally {
            roomDatabase.g();
        }
    }
}
