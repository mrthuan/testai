package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.view.AccessibilityBridge;

/* compiled from: AccessibilityBridge.java */
/* loaded from: classes.dex */
public final class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f18936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AccessibilityBridge f18937b;

    public a(AccessibilityBridge accessibilityBridge, AccessibilityManager accessibilityManager) {
        this.f18937b = accessibilityBridge;
        this.f18936a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        AccessibilityBridge accessibilityBridge = this.f18937b;
        if (accessibilityBridge.f18853u) {
            return;
        }
        boolean z11 = false;
        if (!z10) {
            accessibilityBridge.i(false);
            AccessibilityBridge.h hVar = accessibilityBridge.f18847o;
            if (hVar != null) {
                accessibilityBridge.g(hVar.f18873b, 256);
                accessibilityBridge.f18847o = null;
            }
        }
        AccessibilityBridge.g gVar = accessibilityBridge.f18851s;
        if (gVar != null) {
            boolean isEnabled = this.f18936a.isEnabled();
            int i10 = FlutterView.f18906n;
            FlutterView flutterView = FlutterView.this;
            if (!flutterView.f18917l) {
                if (!isEnabled && !z10) {
                    z11 = true;
                }
                flutterView.setWillNotDraw(z11);
                return;
            }
            flutterView.setWillNotDraw(false);
        }
    }
}
