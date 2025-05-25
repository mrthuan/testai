package x2;

import androidx.room.RoomDatabase;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f31555a;

    /* renamed from: b  reason: collision with root package name */
    public final a f31556b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final c f31557d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends w1.b<m> {
        @Override // w1.j
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // w1.b
        public final void d(b2.e eVar, m mVar) {
            m mVar2 = mVar;
            String str = mVar2.f31553a;
            if (str == null) {
                eVar.d(1);
            } else {
                eVar.f(1, str);
            }
            byte[] c = androidx.work.b.c(mVar2.f31554b);
            if (c == null) {
                eVar.d(2);
            } else {
                eVar.a(2, c);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends w1.j {
        @Override // w1.j
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends w1.j {
        @Override // w1.j
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(RoomDatabase roomDatabase) {
        this.f31555a = roomDatabase;
        this.f31556b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.f31557d = new c(roomDatabase);
    }
}
