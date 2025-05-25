package y2;

import androidx.room.RoomDatabase;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UUID f32028a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.work.b f32029b;
    public final /* synthetic */ androidx.work.impl.utils.futures.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f32030d;

    public q(r rVar, UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.a aVar) {
        this.f32030d = rVar;
        this.f32028a = uuid;
        this.f32029b = bVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x2.p i10;
        androidx.work.impl.utils.futures.a aVar = this.c;
        UUID uuid = this.f32028a;
        String uuid2 = uuid.toString();
        o2.h c = o2.h.c();
        int i11 = r.c;
        androidx.work.b bVar = this.f32029b;
        String.format("Updating progress for %s (%s)", uuid, bVar);
        c.a(new Throwable[0]);
        r rVar = this.f32030d;
        WorkDatabase workDatabase = rVar.f32031a;
        WorkDatabase workDatabase2 = rVar.f32031a;
        workDatabase.c();
        try {
            i10 = ((x2.r) workDatabase2.p()).i(uuid2);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (i10 != null) {
            if (i10.f31559b == WorkInfo$State.RUNNING) {
                x2.m mVar = new x2.m(uuid2, bVar);
                x2.o oVar = (x2.o) workDatabase2.o();
                RoomDatabase roomDatabase = oVar.f31555a;
                roomDatabase.b();
                roomDatabase.c();
                oVar.f31556b.e(mVar);
                roomDatabase.j();
                roomDatabase.g();
            } else {
                o2.h c10 = o2.h.c();
                String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid2);
                c10.f(new Throwable[0]);
            }
            aVar.h(null);
            workDatabase2.j();
            return;
        }
        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}
