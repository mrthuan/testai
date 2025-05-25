package x2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f31547a;

    /* renamed from: b  reason: collision with root package name */
    public final a f31548b;
    public final b c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends w1.b<g> {
        @Override // w1.j
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // w1.b
        public final void d(b2.e eVar, g gVar) {
            g gVar2 = gVar;
            String str = gVar2.f31545a;
            if (str == null) {
                eVar.d(1);
            } else {
                eVar.f(1, str);
            }
            eVar.c(2, gVar2.f31546b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends w1.j {
        @Override // w1.j
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(RoomDatabase roomDatabase) {
        this.f31547a = roomDatabase;
        this.f31548b = new a(roomDatabase);
        this.c = new b(roomDatabase);
    }

    public final g a(String str) {
        g gVar;
        w1.h b10 = w1.h.b(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31547a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            int N = t0.N(i10, "work_spec_id");
            int N2 = t0.N(i10, "system_id");
            if (i10.moveToFirst()) {
                gVar = new g(i10.getString(N), i10.getInt(N2));
            } else {
                gVar = null;
            }
            return gVar;
        } finally {
            i10.close();
            b10.i();
        }
    }

    public final void b(String str) {
        RoomDatabase roomDatabase = this.f31547a;
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
}
