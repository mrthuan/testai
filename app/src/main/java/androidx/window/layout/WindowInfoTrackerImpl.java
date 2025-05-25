package androidx.window.layout;

import android.app.Activity;
import kotlinx.coroutines.flow.t;

/* compiled from: WindowInfoTrackerImpl.kt */
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* compiled from: WindowInfoTrackerImpl.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        kotlin.jvm.internal.g.e(windowMetricsCalculator, "windowMetricsCalculator");
        kotlin.jvm.internal.g.e(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public kotlinx.coroutines.flow.c<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        return new t(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}
