package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: WindowInfoTracker.kt */
/* loaded from: classes.dex */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowInfoTracker.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = kotlin.jvm.internal.i.a(WindowInfoTracker.class).b();
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            kotlin.jvm.internal.g.e(context, "context");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        public final void overrideDecorator(WindowInfoTrackerDecorator overridingDecorator) {
            kotlin.jvm.internal.g.e(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        public final WindowBackend windowBackend$window_release(Context context) {
            kotlin.jvm.internal.g.e(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
            }
            if (extensionWindowLayoutInfoBackend == null) {
                return SidecarWindowBackend.Companion.getInstance(context);
            }
            return extensionWindowLayoutInfoBackend;
        }
    }

    kotlinx.coroutines.flow.c<WindowLayoutInfo> windowLayoutInfo(Activity activity);
}
