package b2;

import android.database.sqlite.SQLiteStatement;

/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b  reason: collision with root package name */
    public final SQLiteStatement f5320b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f5320b = sQLiteStatement;
    }

    public final int h() {
        return this.f5320b.executeUpdateDelete();
    }
}
