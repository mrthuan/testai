package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.embedding.android.f;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.mouse.a;
import java.util.HashSet;
import l.t;

/* loaded from: classes.dex */
public class FlutterView extends FrameLayout implements a.b, f.d {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f18588e = 0;

    /* renamed from: a  reason: collision with root package name */
    public ef.b f18589a;

    /* renamed from: b  reason: collision with root package name */
    public t f18590b;
    public final FlutterRenderer.c c;

    /* renamed from: d  reason: collision with root package name */
    public final b f18591d;

    /* loaded from: classes.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            super.onChange(z10);
            int i10 = FlutterView.f18588e;
            FlutterView.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class b implements w0.a<WindowLayoutInfo> {
        public b() {
        }

        @Override // w0.a
        public final void accept(WindowLayoutInfo windowLayoutInfo) {
            FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    public FlutterView(Context context) {
        this(context, null, new FlutterSurfaceView(context));
    }

    @TargetApi(20)
    public final int a(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        throw null;
    }

    @Override // io.flutter.plugin.mouse.a.b
    @TargetApi(24)
    public final PointerIcon c(int i10) {
        PointerIcon systemIcon;
        systemIcon = PointerIcon.getSystemIcon(getContext(), i10);
        return systemIcon;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        return super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // io.flutter.embedding.android.f.d
    public final void e(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // io.flutter.embedding.android.f.d
    public final boolean g(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return null;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return null;
    }

    @Override // io.flutter.embedding.android.f.d
    public gf.c getBinaryMessenger() {
        throw null;
    }

    public FlutterImageView getCurrentImageSurface() {
        return null;
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        Insets insets;
        int i13;
        int i14;
        int i15;
        int i16;
        int ime;
        Insets insets2;
        int systemGestures;
        Insets insets3;
        DisplayCutout displayCutout;
        Insets waterfallInsets;
        int i17;
        int safeInsetTop;
        int i18;
        int safeInsetRight;
        int i19;
        int safeInsetBottom;
        int i20;
        int safeInsetLeft;
        int statusBars;
        int navigationBars;
        Insets systemGestureInsets;
        int unused;
        int unused2;
        int unused3;
        int unused4;
        int unused5;
        int unused6;
        int unused7;
        int unused8;
        int unused9;
        int unused10;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i21 = Build.VERSION.SDK_INT;
        FlutterRenderer.c cVar = this.c;
        if (i21 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            unused = systemGestureInsets.top;
            cVar.getClass();
            unused2 = systemGestureInsets.right;
            cVar.getClass();
            unused3 = systemGestureInsets.left;
            cVar.getClass();
        }
        int i22 = 0;
        if ((getWindowSystemUiVisibility() & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((getWindowSystemUiVisibility() & 2) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i21 >= 30) {
            if (z11) {
                navigationBars = WindowInsets.Type.navigationBars();
                i22 = 0 | navigationBars;
            }
            if (z10) {
                statusBars = WindowInsets.Type.statusBars();
                i22 |= statusBars;
            }
            insets = windowInsets.getInsets(i22);
            i13 = insets.top;
            cVar.f18658a = i13;
            i14 = insets.right;
            cVar.f18659b = i14;
            i15 = insets.bottom;
            cVar.c = i15;
            i16 = insets.left;
            cVar.f18660d = i16;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            unused4 = insets2.top;
            unused5 = insets2.right;
            cVar.getClass();
            unused6 = insets2.bottom;
            cVar.getClass();
            unused7 = insets2.left;
            cVar.getClass();
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            unused8 = insets3.top;
            cVar.getClass();
            unused9 = insets3.right;
            cVar.getClass();
            unused10 = insets3.left;
            cVar.getClass();
            displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                int i23 = cVar.f18658a;
                i17 = waterfallInsets.top;
                int max = Math.max(i23, i17);
                safeInsetTop = displayCutout.getSafeInsetTop();
                cVar.f18658a = Math.max(max, safeInsetTop);
                int i24 = cVar.f18659b;
                i18 = waterfallInsets.right;
                int max2 = Math.max(i24, i18);
                safeInsetRight = displayCutout.getSafeInsetRight();
                cVar.f18659b = Math.max(max2, safeInsetRight);
                int i25 = cVar.c;
                i19 = waterfallInsets.bottom;
                int max3 = Math.max(i25, i19);
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                cVar.c = Math.max(max3, safeInsetBottom);
                int i26 = cVar.f18660d;
                i20 = waterfallInsets.left;
                int max4 = Math.max(i26, i20);
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                cVar.f18660d = Math.max(max4, safeInsetLeft);
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z11) {
                Context context = getContext();
                int i27 = context.getResources().getConfiguration().orientation;
                int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
                if (i27 == 2) {
                    if (rotation == 1) {
                        zeroSides = ZeroSides.RIGHT;
                    } else if (rotation == 3) {
                        zeroSides = ZeroSides.LEFT;
                    } else if (rotation == 0 || rotation == 2) {
                        zeroSides = ZeroSides.BOTH;
                    }
                }
            }
            if (z10) {
                i10 = windowInsets.getSystemWindowInsetTop();
            } else {
                i10 = 0;
            }
            cVar.f18658a = i10;
            if (zeroSides != ZeroSides.RIGHT && zeroSides != ZeroSides.BOTH) {
                i11 = windowInsets.getSystemWindowInsetRight();
            } else {
                i11 = 0;
            }
            cVar.f18659b = i11;
            if (z11 && a(windowInsets) == 0) {
                i12 = windowInsets.getSystemWindowInsetBottom();
            } else {
                i12 = 0;
            }
            cVar.c = i12;
            if (zeroSides != ZeroSides.LEFT && zeroSides != ZeroSides.BOTH) {
                i22 = windowInsets.getSystemWindowInsetLeft();
            }
            cVar.f18660d = i22;
            cVar.getClass();
            a(windowInsets);
            cVar.getClass();
            cVar.getClass();
        }
        int i28 = cVar.f18658a;
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t tVar;
        super.onAttachedToWindow();
        try {
            tVar = new t(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            tVar = null;
        }
        this.f18590b = tVar;
        Activity a10 = p001if.b.a(getContext());
        t tVar2 = this.f18590b;
        if (tVar2 != null && a10 != null) {
            ((WindowInfoTrackerCallbackAdapter) tVar2.f20374a).addWindowLayoutInfoListener(a10, androidx.core.content.a.getMainExecutor(getContext()), this.f18591d);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t tVar = this.f18590b;
        if (tVar != null) {
            ((WindowInfoTrackerCallbackAdapter) tVar.f20374a).removeWindowLayoutInfoListener(this.f18591d);
        }
        this.f18590b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ef.b bVar = this.f18589a;
        if (bVar instanceof FlutterSurfaceView) {
            ((FlutterSurfaceView) bVar).setVisibility(i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        r7 = r7.getDisplayCutout();
     */
    @android.annotation.TargetApi(28)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setWindowInfoListenerDisplayFeatures(androidx.window.layout.WindowLayoutInfo r7) {
        /*
            r6 = this;
            java.util.List r7 = r7.getDisplayFeatures()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r7.next()
            androidx.window.layout.DisplayFeature r1 = (androidx.window.layout.DisplayFeature) r1
            android.graphics.Rect r2 = r1.getBounds()
            r2.toString()
            boolean r2 = r1 instanceof androidx.window.layout.FoldingFeature
            if (r2 == 0) goto L59
            r2 = r1
            androidx.window.layout.FoldingFeature r2 = (androidx.window.layout.FoldingFeature) r2
            androidx.window.layout.FoldingFeature$OcclusionType r3 = r2.getOcclusionType()
            androidx.window.layout.FoldingFeature$OcclusionType r4 = androidx.window.layout.FoldingFeature.OcclusionType.FULL
            if (r3 != r4) goto L32
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureType r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.HINGE
            goto L34
        L32:
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureType r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.FOLD
        L34:
            androidx.window.layout.FoldingFeature$State r4 = r2.getState()
            androidx.window.layout.FoldingFeature$State r5 = androidx.window.layout.FoldingFeature.State.FLAT
            if (r4 != r5) goto L3f
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureState r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.POSTURE_FLAT
            goto L4c
        L3f:
            androidx.window.layout.FoldingFeature$State r2 = r2.getState()
            androidx.window.layout.FoldingFeature$State r4 = androidx.window.layout.FoldingFeature.State.HALF_OPENED
            if (r2 != r4) goto L4a
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureState r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED
            goto L4c
        L4a:
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureState r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.UNKNOWN
        L4c:
            io.flutter.embedding.engine.renderer.FlutterRenderer$b r4 = new io.flutter.embedding.engine.renderer.FlutterRenderer$b
            android.graphics.Rect r1 = r1.getBounds()
            r4.<init>(r1, r3, r2)
            r0.add(r4)
            goto Ld
        L59:
            io.flutter.embedding.engine.renderer.FlutterRenderer$b r2 = new io.flutter.embedding.engine.renderer.FlutterRenderer$b
            android.graphics.Rect r1 = r1.getBounds()
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureType r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.UNKNOWN
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureState r4 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.UNKNOWN
            r2.<init>(r1, r3, r4)
            r0.add(r2)
            goto Ld
        L6a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r7 < r1) goto L9e
            android.view.WindowInsets r7 = r6.getRootWindowInsets()
            if (r7 == 0) goto L9e
            android.view.DisplayCutout r7 = androidx.window.layout.e.f(r7)
            if (r7 == 0) goto L9e
            java.util.List r7 = androidx.window.layout.k.d(r7)
            java.util.Iterator r7 = r7.iterator()
        L84:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r7.next()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r1.toString()
            io.flutter.embedding.engine.renderer.FlutterRenderer$b r2 = new io.flutter.embedding.engine.renderer.FlutterRenderer$b
            io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureType r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.CUTOUT
            r2.<init>(r1, r3)
            r0.add(r2)
            goto L84
        L9e:
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r7 = r6.c
            r7.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterView.setWindowInfoListenerDisplayFeatures(androidx.window.layout.WindowLayoutInfo):void");
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    public FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        new HashSet();
        new HashSet();
        this.c = new FlutterRenderer.c();
        new a(new Handler(Looper.getMainLooper()));
        this.f18591d = new b();
        this.f18589a = flutterSurfaceView;
        addView(flutterSurfaceView);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }
}
