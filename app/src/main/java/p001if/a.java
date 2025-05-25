package p001if;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* compiled from: PathUtils.java */
/* renamed from: if.a  reason: invalid package */
/* loaded from: classes.dex */
public final class a {
    public static String a(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT >= 24) {
            dataDir = context.getDataDir();
            return dataDir.getPath();
        }
        return context.getApplicationInfo().dataDir;
    }
}
