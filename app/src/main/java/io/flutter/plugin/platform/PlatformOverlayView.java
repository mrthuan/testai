package io.flutter.plugin.platform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.view.AccessibilityBridge;

/* loaded from: classes.dex */
public class PlatformOverlayView extends FlutterImageView {

    /* renamed from: f  reason: collision with root package name */
    public final a f18784f;

    public PlatformOverlayView(Context context, int i10) {
        super(context, 1, 1, FlutterImageView.SurfaceKind.overlay);
        this.f18784f = null;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean e10;
        a aVar = this.f18784f;
        if (aVar != null) {
            AccessibilityBridge accessibilityBridge = aVar.f18796a;
            if (accessibilityBridge == null) {
                e10 = false;
            } else {
                e10 = accessibilityBridge.e(motionEvent, true);
            }
            if (e10) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public PlatformOverlayView(Context context) {
        this(context, 0);
    }

    public PlatformOverlayView(Context context, AttributeSet attributeSet) {
        this(context, 0);
    }
}
