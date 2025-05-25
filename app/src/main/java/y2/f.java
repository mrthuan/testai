package y2;

import androidx.work.impl.WorkDatabase;

/* compiled from: IdGenerator.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final WorkDatabase f32000a;

    public f(WorkDatabase workDatabase) {
        this.f32000a = workDatabase;
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13;
        synchronized (f.class) {
            WorkDatabase workDatabase = this.f32000a;
            workDatabase.c();
            Long a10 = ((x2.f) workDatabase.l()).a("next_job_scheduler_id");
            i11 = 0;
            if (a10 != null) {
                i12 = a10.intValue();
            } else {
                i12 = 0;
            }
            if (i12 == Integer.MAX_VALUE) {
                i13 = 0;
            } else {
                i13 = i12 + 1;
            }
            ((x2.f) workDatabase.l()).b(new x2.d("next_job_scheduler_id", i13));
            workDatabase.j();
            workDatabase.g();
            if (i12 >= 0 && i12 <= i10) {
                i11 = i12;
            }
            ((x2.f) this.f32000a.l()).b(new x2.d("next_job_scheduler_id", 1));
        }
        return i11;
    }
}
