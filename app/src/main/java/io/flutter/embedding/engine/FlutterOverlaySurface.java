package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class FlutterOverlaySurface {

    /* renamed from: id  reason: collision with root package name */
    private final int f18636id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface) {
        this.f18636id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.f18636id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
