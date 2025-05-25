package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: WindowBackend.kt */
/* loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, w0.a<WindowLayoutInfo> aVar);

    void unregisterLayoutChangeCallback(w0.a<WindowLayoutInfo> aVar);
}
