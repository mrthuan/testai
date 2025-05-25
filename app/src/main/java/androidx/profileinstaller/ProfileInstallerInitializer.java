package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements c2.b<c> {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: u1.e
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    @Override // c2.b
    public final List<Class<? extends c2.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // c2.b
    public final c create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        a.a(new l1.a(1, this, context.getApplicationContext()));
        return new c();
    }
}
