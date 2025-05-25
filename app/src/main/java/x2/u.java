package x2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f31587a;

    /* renamed from: b  reason: collision with root package name */
    public final a f31588b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends w1.b<s> {
        @Override // w1.j
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // w1.b
        public final void d(b2.e eVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.f31585a;
            if (str == null) {
                eVar.d(1);
            } else {
                eVar.f(1, str);
            }
            String str2 = sVar2.f31586b;
            if (str2 == null) {
                eVar.d(2);
            } else {
                eVar.f(2, str2);
            }
        }
    }

    public u(RoomDatabase roomDatabase) {
        this.f31587a = roomDatabase;
        this.f31588b = new a(roomDatabase);
    }

    public final ArrayList a(String str) {
        w1.h b10 = w1.h.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f31587a;
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
}
