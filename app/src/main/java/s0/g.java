package s0;

import android.os.Handler;
import android.os.Looper;

/* compiled from: HandlerCompat.java */
/* loaded from: classes.dex */
public final class g {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
