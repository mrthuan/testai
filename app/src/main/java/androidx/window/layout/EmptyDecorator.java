package androidx.window.layout;

/* compiled from: WindowInfoTracker.kt */
/* loaded from: classes.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker tracker) {
        kotlin.jvm.internal.g.e(tracker, "tracker");
        return tracker;
    }
}
