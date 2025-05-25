package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.Lifecycle;

@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final Lifecycle lifecycle;

    public HiddenLifecycleReference(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
