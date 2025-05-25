package ra;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final File f29495a;

    /* renamed from: b  reason: collision with root package name */
    public final File f29496b;
    public final File c;

    /* renamed from: d  reason: collision with root package name */
    public final File f29497d;

    /* renamed from: e  reason: collision with root package name */
    public final File f29498e;

    /* renamed from: f  reason: collision with root package name */
    public final File f29499f;

    public d(Context context) {
        boolean z10;
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.f29495a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder(".com.google.firebase.crashlytics.files.v2");
            sb2.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb2.append(processName.replaceAll("[^a-zA-Z0-9.]", "_"));
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        d(file);
        this.f29496b = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.c = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.f29497d = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.f29498e = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.f29499f = file5;
    }

    public static void a(File file) {
        if (file.exists() && e(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public static synchronized void d(File file) {
        synchronized (d.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                file.delete();
            }
            if (!file.mkdirs()) {
                file.toString();
            }
        }
    }

    public static boolean e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                e(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> f(T[] tArr) {
        if (tArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    public final File b(String str) {
        File file = new File(this.c, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public final File c(String str, String str2) {
        File file = new File(this.c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
