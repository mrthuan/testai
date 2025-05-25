package p2;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* compiled from: WorkDatabasePathHelper.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f23623a;

    static {
        o2.h.e("WrkDbPathHelper");
        f23623a = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void a(Context context) {
        File databasePath;
        File file;
        String[] strArr;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            o2.h.c().a(new Throwable[0]);
            HashMap hashMap = new HashMap();
            hashMap.put(context.getDatabasePath("androidx.work.workdb"), new File(context.getNoBackupFilesDir(), "androidx.work.workdb"));
            for (String str : f23623a) {
                hashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        String.format("Over-writing contents of %s", file3);
                        o2.h.c().f(new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        String.format("Migrated %s to %s", file2, file3);
                    } else {
                        String.format("Renaming %s to %s failed", file2, file3);
                    }
                    o2.h.c().a(new Throwable[0]);
                }
            }
        }
    }
}
