package x2;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f31543a;

    /* renamed from: b  reason: collision with root package name */
    public final a f31544b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends w1.b<d> {
        @Override // w1.j
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // w1.b
        public final void d(b2.e eVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.f31541a;
            if (str == null) {
                eVar.d(1);
            } else {
                eVar.f(1, str);
            }
            Long l10 = dVar2.f31542b;
            if (l10 == null) {
                eVar.d(2);
            } else {
                eVar.c(2, l10.longValue());
            }
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f31543a = roomDatabase;
        this.f31544b = new a(roomDatabase);
    }

    public final Long a(String str) {
        Long l10;
        w1.h b10 = w1.h.b(1, "SELECT long_value FROM Preference where `key`=?");
        b10.h(1, str);
        RoomDatabase roomDatabase = this.f31543a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            if (i10.moveToFirst() && !i10.isNull(0)) {
                l10 = Long.valueOf(i10.getLong(0));
                return l10;
            }
            l10 = null;
            return l10;
        } finally {
            i10.close();
            b10.i();
        }
    }

    public final void b(d dVar) {
        RoomDatabase roomDatabase = this.f31543a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f31544b.e(dVar);
            roomDatabase.j();
        } finally {
            roomDatabase.g();
        }
    }
}
