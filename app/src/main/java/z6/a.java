package z6;

import android.os.Build;
import android.util.Log;

/* compiled from: Logging.java */
/* loaded from: classes.dex */
public final class a {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable(b(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static String b(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }
}
