package androidx.window.layout;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import cg.l;

/* compiled from: WindowMetricsCalculator.kt */
/* loaded from: classes.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowMetricsCalculator.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static l<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = new l<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @Override // cg.l
            public final WindowMetricsCalculator invoke(WindowMetricsCalculator it) {
                kotlin.jvm.internal.g.e(it, "it");
                return it;
            }
        };

        private Companion() {
        }

        public final WindowMetricsCalculator getOrCreate() {
            return decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @ExperimentalWindowApi
        public final void overrideDecorator(WindowMetricsCalculatorDecorator overridingDecorator) {
            kotlin.jvm.internal.g.e(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @ExperimentalWindowApi
        public final void reset() {
            decorator = new l<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$reset$1
                @Override // cg.l
                public final WindowMetricsCalculator invoke(WindowMetricsCalculator it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    return it;
                }
            };
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);
}
