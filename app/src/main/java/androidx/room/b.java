package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;

/* compiled from: Room.java */
/* loaded from: classes.dex */
public final class b {
    public static <T extends RoomDatabase> RoomDatabase.a<T> a(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new RoomDatabase.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
