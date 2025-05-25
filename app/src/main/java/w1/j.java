package w1;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f30932a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final RoomDatabase f30933b;
    public volatile b2.e c;

    public j(RoomDatabase roomDatabase) {
        this.f30933b = roomDatabase;
    }

    public final b2.e a() {
        this.f30933b.a();
        if (this.f30932a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.f30933b.d(b());
            }
            return this.c;
        }
        return this.f30933b.d(b());
    }

    public abstract String b();

    public final void c(b2.e eVar) {
        if (eVar == this.c) {
            this.f30932a.set(false);
        }
    }
}
