package p2;

import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class h extends RoomDatabase.b {
    @Override // androidx.room.RoomDatabase.b
    public final void a(b2.a aVar) {
        aVar.a();
        try {
            int i10 = WorkDatabase.f4913k;
            aVar.c("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f4912j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.h();
        } finally {
            aVar.b();
        }
    }
}
