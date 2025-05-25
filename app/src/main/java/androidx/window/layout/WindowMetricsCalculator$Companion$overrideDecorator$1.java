package androidx.window.layout;

import cg.l;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WindowMetricsCalculator.kt */
/* loaded from: classes.dex */
public /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements l<WindowMetricsCalculator, WindowMetricsCalculator> {
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // cg.l
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator p02) {
        kotlin.jvm.internal.g.e(p02, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p02);
    }
}
