package o9;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22779a;

    public n(Context context) {
        this.f22779a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j10 += a(file2);
            }
        }
        return j10;
    }
}
