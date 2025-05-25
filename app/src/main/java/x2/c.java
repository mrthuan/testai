package x2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f31539a;

    /* renamed from: b  reason: collision with root package name */
    public final a f31540b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends w1.b<x2.a> {
        @Override // w1.j
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // w1.b
        public final void d(b2.e eVar, x2.a aVar) {
            x2.a aVar2 = aVar;
            String str = aVar2.f31537a;
            if (str == null) {
                eVar.d(1);
            } else {
                eVar.f(1, str);
            }
            String str2 = aVar2.f31538b;
            if (str2 == null) {
                eVar.d(2);
            } else {
                eVar.f(2, str2);
            }
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f31539a = roomDatabase;
        this.f31540b = new a(roomDatabase);
    }

    public final ArrayList a(String str) {
        w1.h b10 = w1.h.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31539a;
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

    public final boolean b(String str) {
        boolean z10 = true;
        w1.h b10 = w1.h.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31539a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            boolean z11 = false;
            if (i10.moveToFirst()) {
                if (i10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            i10.close();
            b10.i();
        }
    }
}
