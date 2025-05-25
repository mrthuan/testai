package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.room.RoomDatabase;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o2.b;
import o2.h;
import p2.j;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x2.g;
import x2.i;
import x2.k;
import x2.l;
import x2.p;
import x2.q;
import x2.r;
import x2.t;
import x2.u;
import x2.v;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        h.e("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(k kVar, t tVar, x2.h hVar, ArrayList arrayList) {
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g a10 = ((i) hVar).a(pVar.f31558a);
            if (a10 != null) {
                num = Integer.valueOf(a10.f31546b);
            } else {
                num = null;
            }
            String str = pVar.f31558a;
            l lVar = (l) kVar;
            lVar.getClass();
            w1.h b10 = w1.h.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                b10.f(1);
            } else {
                b10.h(1, str);
            }
            RoomDatabase roomDatabase = lVar.f31551a;
            roomDatabase.b();
            Cursor i10 = roomDatabase.i(b10);
            try {
                ArrayList arrayList2 = new ArrayList(i10.getCount());
                while (i10.moveToNext()) {
                    arrayList2.add(i10.getString(0));
                }
                i10.close();
                b10.i();
                sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f31558a, pVar.c, num, pVar.f31559b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ((u) tVar).a(pVar.f31558a))));
            } catch (Throwable th2) {
                i10.close();
                b10.i();
                throw th2;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
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
        ArrayList arrayList;
        x2.h hVar2;
        k kVar;
        t tVar;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WorkDatabase workDatabase = j.e(getApplicationContext()).c;
        q p10 = workDatabase.p();
        k n10 = workDatabase.n();
        t q5 = workDatabase.q();
        x2.h m10 = workDatabase.m();
        r rVar = (r) p10;
        rVar.getClass();
        w1.h b10 = w1.h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        b10.d(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        RoomDatabase roomDatabase = rVar.f31577a;
        roomDatabase.b();
        Cursor i11 = roomDatabase.i(b10);
        try {
            N = t0.N(i11, "required_network_type");
            N2 = t0.N(i11, "requires_charging");
            N3 = t0.N(i11, "requires_device_idle");
            N4 = t0.N(i11, "requires_battery_not_low");
            N5 = t0.N(i11, "requires_storage_not_low");
            N6 = t0.N(i11, "trigger_content_update_delay");
            N7 = t0.N(i11, "trigger_max_content_delay");
            N8 = t0.N(i11, "content_uri_triggers");
            N9 = t0.N(i11, FacebookMediationAdapter.KEY_ID);
            N10 = t0.N(i11, "state");
            N11 = t0.N(i11, "worker_class_name");
            N12 = t0.N(i11, "input_merger_class_name");
            N13 = t0.N(i11, "input");
            N14 = t0.N(i11, "output");
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
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
            ArrayList arrayList2 = new ArrayList(i11.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!i11.moveToNext()) {
                    break;
                }
                String string = i11.getString(N9);
                String string2 = i11.getString(N11);
                int i13 = N11;
                b bVar = new b();
                int i14 = N;
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
                int i15 = N2;
                int i16 = N3;
                bVar.f22673f = i11.getLong(N6);
                bVar.f22674g = i11.getLong(N7);
                bVar.f22675h = v.a(i11.getBlob(N8));
                p pVar = new p(string, string2);
                pVar.f31559b = v.e(i11.getInt(N10));
                pVar.f31560d = i11.getString(N12);
                pVar.f31561e = androidx.work.b.a(i11.getBlob(N13));
                int i17 = i12;
                pVar.f31562f = androidx.work.b.a(i11.getBlob(i17));
                i12 = i17;
                int i18 = N12;
                int i19 = N15;
                pVar.f31563g = i11.getLong(i19);
                int i20 = N13;
                int i21 = N16;
                pVar.f31564h = i11.getLong(i21);
                int i22 = N10;
                int i23 = N17;
                pVar.f31565i = i11.getLong(i23);
                int i24 = N18;
                pVar.f31567k = i11.getInt(i24);
                int i25 = N19;
                pVar.f31568l = v.b(i11.getInt(i25));
                N17 = i23;
                int i26 = N20;
                pVar.f31569m = i11.getLong(i26);
                int i27 = N21;
                pVar.f31570n = i11.getLong(i27);
                N21 = i27;
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
                N25 = i31;
                N13 = i20;
                N2 = i15;
                N16 = i21;
                N18 = i24;
                N23 = i29;
                N24 = i30;
                N22 = i28;
                N15 = i19;
                N12 = i18;
                N3 = i16;
                N = i14;
                arrayList2 = arrayList;
                N11 = i13;
                N20 = i26;
                N10 = i22;
                N19 = i25;
            }
            i11.close();
            hVar.i();
            ArrayList d10 = rVar.d();
            ArrayList b11 = rVar.b();
            if (!arrayList.isEmpty()) {
                i10 = 0;
                h.c().d(new Throwable[0]);
                h c = h.c();
                hVar2 = m10;
                kVar = n10;
                tVar = q5;
                a(kVar, tVar, hVar2, arrayList);
                c.d(new Throwable[0]);
            } else {
                hVar2 = m10;
                kVar = n10;
                tVar = q5;
                i10 = 0;
            }
            if (!d10.isEmpty()) {
                h.c().d(new Throwable[i10]);
                h c10 = h.c();
                a(kVar, tVar, hVar2, d10);
                c10.d(new Throwable[i10]);
            }
            if (!b11.isEmpty()) {
                h.c().d(new Throwable[i10]);
                h c11 = h.c();
                a(kVar, tVar, hVar2, b11);
                c11.d(new Throwable[i10]);
            }
            return new ListenableWorker.a.c();
        } catch (Throwable th3) {
            th = th3;
            i11.close();
            hVar.i();
            throw th;
        }
    }
}
