package x2;

import androidx.room.RoomDatabase;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f31551a;

    /* renamed from: b  reason: collision with root package name */
    public final a f31552b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends w1.b<j> {
        @Override // w1.j
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // w1.b
        public final void d(b2.e eVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.f31549a;
            if (str == null) {
                eVar.d(1);
            } else {
                eVar.f(1, str);
            }
            String str2 = jVar2.f31550b;
            if (str2 == null) {
                eVar.d(2);
            } else {
                eVar.f(2, str2);
            }
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.f31551a = roomDatabase;
        this.f31552b = new a(roomDatabase);
    }
}
