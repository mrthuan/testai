package p2;

import android.content.Context;
import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import x2.o;
import x2.p;
import x2.q;
import x2.r;
import x2.t;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f23639t = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23640a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23641b;
    public final List<d> c;

    /* renamed from: d  reason: collision with root package name */
    public final WorkerParameters.a f23642d;

    /* renamed from: e  reason: collision with root package name */
    public p f23643e;

    /* renamed from: g  reason: collision with root package name */
    public final z2.a f23645g;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.work.a f23647i;

    /* renamed from: j  reason: collision with root package name */
    public final w2.a f23648j;

    /* renamed from: k  reason: collision with root package name */
    public final WorkDatabase f23649k;

    /* renamed from: l  reason: collision with root package name */
    public final q f23650l;

    /* renamed from: m  reason: collision with root package name */
    public final x2.b f23651m;

    /* renamed from: n  reason: collision with root package name */
    public final t f23652n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f23653o;

    /* renamed from: p  reason: collision with root package name */
    public String f23654p;

    /* renamed from: s  reason: collision with root package name */
    public volatile boolean f23657s;

    /* renamed from: h  reason: collision with root package name */
    public ListenableWorker.a f23646h = new ListenableWorker.a.C0025a();

    /* renamed from: q  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<Boolean> f23655q = new androidx.work.impl.utils.futures.a<>();

    /* renamed from: r  reason: collision with root package name */
    public y9.a<ListenableWorker.a> f23656r = null;

    /* renamed from: f  reason: collision with root package name */
    public ListenableWorker f23644f = null;

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f23658a;

        /* renamed from: b  reason: collision with root package name */
        public final w2.a f23659b;
        public final z2.a c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.work.a f23660d;

        /* renamed from: e  reason: collision with root package name */
        public final WorkDatabase f23661e;

        /* renamed from: f  reason: collision with root package name */
        public final String f23662f;

        /* renamed from: g  reason: collision with root package name */
        public List<d> f23663g;

        /* renamed from: h  reason: collision with root package name */
        public WorkerParameters.a f23664h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, z2.a aVar2, w2.a aVar3, WorkDatabase workDatabase, String str) {
            this.f23658a = context.getApplicationContext();
            this.c = aVar2;
            this.f23659b = aVar3;
            this.f23660d = aVar;
            this.f23661e = workDatabase;
            this.f23662f = str;
        }
    }

    static {
        o2.h.e("WorkerWrapper");
    }

    public m(a aVar) {
        this.f23640a = aVar.f23658a;
        this.f23645g = aVar.c;
        this.f23648j = aVar.f23659b;
        this.f23641b = aVar.f23662f;
        this.c = aVar.f23663g;
        this.f23642d = aVar.f23664h;
        this.f23647i = aVar.f23660d;
        WorkDatabase workDatabase = aVar.f23661e;
        this.f23649k = workDatabase;
        this.f23650l = workDatabase.p();
        this.f23651m = workDatabase.k();
        this.f23652n = workDatabase.q();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            o2.h c = o2.h.c();
            String.format("Worker result SUCCESS for %s", this.f23654p);
            c.d(new Throwable[0]);
            if (this.f23643e.c()) {
                e();
                return;
            }
            x2.b bVar = this.f23651m;
            String str = this.f23641b;
            q qVar = this.f23650l;
            WorkDatabase workDatabase = this.f23649k;
            workDatabase.c();
            try {
                ((r) qVar).n(WorkInfo$State.SUCCEEDED, str);
                ((r) qVar).l(str, ((ListenableWorker.a.c) this.f23646h).f4885a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((x2.c) bVar).a(str).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (((r) qVar).f(str2) == WorkInfo$State.BLOCKED && ((x2.c) bVar).b(str2)) {
                        o2.h c10 = o2.h.c();
                        String.format("Setting status to enqueued for %s", str2);
                        c10.d(new Throwable[0]);
                        ((r) qVar).n(WorkInfo$State.ENQUEUED, str2);
                        ((r) qVar).m(currentTimeMillis, str2);
                    }
                }
                workDatabase.j();
            } finally {
                workDatabase.g();
                f(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            o2.h c11 = o2.h.c();
            String.format("Worker result RETRY for %s", this.f23654p);
            c11.d(new Throwable[0]);
            d();
        } else {
            o2.h c12 = o2.h.c();
            String.format("Worker result FAILURE for %s", this.f23654p);
            c12.d(new Throwable[0]);
            if (this.f23643e.c()) {
                e();
            } else {
                h();
            }
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            r rVar = (r) this.f23650l;
            if (rVar.f(str2) != WorkInfo$State.CANCELLED) {
                rVar.n(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(((x2.c) this.f23651m).a(str2));
        }
    }

    public final void c() {
        boolean i10 = i();
        String str = this.f23641b;
        WorkDatabase workDatabase = this.f23649k;
        if (!i10) {
            workDatabase.c();
            try {
                WorkInfo$State f10 = ((r) this.f23650l).f(str);
                o oVar = (o) workDatabase.o();
                RoomDatabase roomDatabase = oVar.f31555a;
                roomDatabase.b();
                o.b bVar = oVar.c;
                b2.e a10 = bVar.a();
                if (str == null) {
                    a10.d(1);
                } else {
                    a10.f(1, str);
                }
                roomDatabase.c();
                a10.h();
                roomDatabase.j();
                roomDatabase.g();
                bVar.c(a10);
                if (f10 == null) {
                    f(false);
                } else if (f10 == WorkInfo$State.RUNNING) {
                    a(this.f23646h);
                } else if (!f10.isFinished()) {
                    d();
                }
                workDatabase.j();
            } finally {
                workDatabase.g();
            }
        }
        List<d> list = this.c;
        if (list != null) {
            for (d dVar : list) {
                dVar.c(str);
            }
            e.a(this.f23647i, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f23641b;
        q qVar = this.f23650l;
        WorkDatabase workDatabase = this.f23649k;
        workDatabase.c();
        try {
            ((r) qVar).n(WorkInfo$State.ENQUEUED, str);
            ((r) qVar).m(System.currentTimeMillis(), str);
            ((r) qVar).k(-1L, str);
            workDatabase.j();
        } finally {
            workDatabase.g();
            f(true);
        }
    }

    public final void e() {
        String str = this.f23641b;
        q qVar = this.f23650l;
        WorkDatabase workDatabase = this.f23649k;
        workDatabase.c();
        try {
            ((r) qVar).m(System.currentTimeMillis(), str);
            ((r) qVar).n(WorkInfo$State.ENQUEUED, str);
            r rVar = (r) qVar;
            RoomDatabase roomDatabase = rVar.f31577a;
            roomDatabase.b();
            r.f fVar = rVar.f31582g;
            b2.e a10 = fVar.a();
            if (str == null) {
                a10.d(1);
            } else {
                a10.f(1, str);
            }
            roomDatabase.c();
            a10.h();
            roomDatabase.j();
            roomDatabase.g();
            fVar.c(a10);
            ((r) qVar).k(-1L, str);
            workDatabase.j();
        } finally {
            workDatabase.g();
            f(false);
        }
    }

    public final void f(boolean z10) {
        boolean z11;
        ListenableWorker listenableWorker;
        this.f23649k.c();
        try {
            r rVar = (r) this.f23649k.p();
            rVar.getClass();
            w1.h b10 = w1.h.b(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            RoomDatabase roomDatabase = rVar.f31577a;
            roomDatabase.b();
            Cursor i10 = roomDatabase.i(b10);
            if (i10.moveToFirst() && i10.getInt(0) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            i10.close();
            b10.i();
            if (!z11) {
                y2.g.a(this.f23640a, RescheduleReceiver.class, false);
            }
            if (z10) {
                ((r) this.f23650l).n(WorkInfo$State.ENQUEUED, this.f23641b);
                ((r) this.f23650l).k(-1L, this.f23641b);
            }
            if (this.f23643e != null && (listenableWorker = this.f23644f) != null && listenableWorker.isRunInForeground()) {
                w2.a aVar = this.f23648j;
                String str = this.f23641b;
                c cVar = (c) aVar;
                synchronized (cVar.f23610k) {
                    cVar.f23605f.remove(str);
                    cVar.i();
                }
            }
            this.f23649k.j();
            this.f23649k.g();
            this.f23655q.h(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f23649k.g();
            throw th2;
        }
    }

    public final void g() {
        String str = this.f23641b;
        WorkInfo$State f10 = ((r) this.f23650l).f(str);
        if (f10 == WorkInfo$State.RUNNING) {
            o2.h c = o2.h.c();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str);
            c.a(new Throwable[0]);
            f(true);
            return;
        }
        o2.h c10 = o2.h.c();
        String.format("Status for %s is %s; not doing any work", str, f10);
        c10.a(new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f23641b;
        WorkDatabase workDatabase = this.f23649k;
        workDatabase.c();
        try {
            b(str);
            ((r) this.f23650l).l(str, ((ListenableWorker.a.C0025a) this.f23646h).f4884a);
            workDatabase.j();
        } finally {
            workDatabase.g();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f23657s) {
            return false;
        }
        o2.h c = o2.h.c();
        String.format("Work interrupted for %s", this.f23654p);
        c.a(new Throwable[0]);
        WorkInfo$State f10 = ((r) this.f23650l).f(this.f23641b);
        if (f10 == null) {
            f(false);
        } else {
            f(!f10.isFinished());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r0 != false) goto L100;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.m.run():void");
    }
}
