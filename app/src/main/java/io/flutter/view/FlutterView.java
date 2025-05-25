package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import bb.k;
import gf.c;
import gf.l;
import io.flutter.embedding.android.f;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.mouse.a;
import io.flutter.plugin.platform.j;
import io.flutter.view.AccessibilityBridge;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

@Deprecated
/* loaded from: classes.dex */
public class FlutterView extends SurfaceView implements gf.c, d, a.b, f.d {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f18906n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final we.a f18907a;

    /* renamed from: b  reason: collision with root package name */
    public final ff.f f18908b;
    public final SettingsChannel c;

    /* renamed from: d  reason: collision with root package name */
    public final TextInputPlugin f18909d;

    /* renamed from: e  reason: collision with root package name */
    public final hf.a f18910e;

    /* renamed from: f  reason: collision with root package name */
    public final f f18911f;

    /* renamed from: g  reason: collision with root package name */
    public final io.flutter.embedding.android.a f18912g;

    /* renamed from: h  reason: collision with root package name */
    public AccessibilityBridge f18913h;

    /* renamed from: i  reason: collision with root package name */
    public final c f18914i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f18915j;

    /* renamed from: k  reason: collision with root package name */
    public final io.flutter.view.b f18916k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f18917l;

    /* renamed from: m  reason: collision with root package name */
    public final a f18918m;

    /* loaded from: classes.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    /* loaded from: classes.dex */
    public class a implements AccessibilityBridge.g {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public float f18921a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f18922b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f18923d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f18924e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f18925f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f18926g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f18927h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f18928i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f18929j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f18930k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f18931l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f18932m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f18933n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f18934o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f18935p = -1;
    }

    public FlutterView(Context context) {
        this(context, null);
    }

    @Override // gf.c
    public final void a(String str, ByteBuffer byteBuffer, c.b bVar) {
        if (!j()) {
            return;
        }
        this.f18916k.a(str, byteBuffer, bVar);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.b.a aVar;
        TextInputChannel.b.a aVar2;
        CharSequence textValue;
        int i10 = Build.VERSION.SDK_INT;
        TextInputPlugin textInputPlugin = this.f18909d;
        if (i10 < 26) {
            textInputPlugin.getClass();
            return;
        }
        TextInputChannel.b bVar = textInputPlugin.f18734f;
        if (bVar != null && textInputPlugin.f18735g != null && (aVar = bVar.f18717j) != null) {
            HashMap hashMap = new HashMap();
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                TextInputChannel.b bVar2 = textInputPlugin.f18735g.get(sparseArray.keyAt(i11));
                if (bVar2 != null && (aVar2 = bVar2.f18717j) != null) {
                    textValue = k.g(sparseArray.valueAt(i11)).getTextValue();
                    String charSequence = textValue.toString();
                    TextInputChannel.d dVar = new TextInputChannel.d(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    String str = aVar.f18720a;
                    String str2 = aVar2.f18720a;
                    if (str2.equals(str)) {
                        textInputPlugin.f18736h.e(dVar);
                    } else {
                        hashMap.put(str2, dVar);
                    }
                }
            }
            int i12 = textInputPlugin.f18733e.f18744b;
            TextInputChannel textInputChannel = textInputPlugin.f18732d;
            textInputChannel.getClass();
            String.valueOf(hashMap.size());
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                TextInputChannel.d dVar2 = (TextInputChannel.d) entry.getValue();
                hashMap2.put((String) entry.getKey(), TextInputChannel.a(dVar2.f18725a, dVar2.f18726b, dVar2.c, -1, -1));
            }
            textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i12), hashMap2), "TextInputClient.updateEditingStateWithTag");
        }
    }

    @Override // gf.c
    public final c.InterfaceC0236c b() {
        return null;
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
        j jVar = this.f18916k.f18938a.c;
        if (view == null) {
            jVar.getClass();
            return false;
        }
        HashMap<Context, View> hashMap = jVar.f18819i;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @Override // gf.c
    public final void d(String str, c.a aVar, c.InterfaceC0236c interfaceC0236c) {
        this.f18916k.d(str, aVar, interfaceC0236c);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.toString();
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((j() && this.f18911f.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // io.flutter.embedding.android.f.d
    public final void e(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // gf.c
    public final void f(String str, c.a aVar) {
        this.f18916k.f(str, aVar);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // io.flutter.embedding.android.f.d
    public final boolean g(KeyEvent keyEvent) {
        InputConnection inputConnection;
        TextInputPlugin textInputPlugin = this.f18909d;
        if (!textInputPlugin.f18731b.isAcceptingText() || (inputConnection = textInputPlugin.f18738j) == null) {
            return false;
        }
        if (inputConnection instanceof io.flutter.plugin.editing.d) {
            io.flutter.plugin.editing.d dVar = (io.flutter.plugin.editing.d) inputConnection;
            int action = keyEvent.getAction();
            io.flutter.plugin.editing.f fVar = dVar.f18749d;
            if (action == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    return dVar.d(true, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 22) {
                    return dVar.d(false, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 19) {
                    return dVar.e(true, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 20) {
                    return dVar.e(false, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                    EditorInfo editorInfo = dVar.f18750e;
                    if ((editorInfo.inputType & 131072) == 0) {
                        dVar.performEditorAction(editorInfo.imeOptions & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    }
                }
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                int unicodeChar = keyEvent.getUnicodeChar();
                if (selectionStart < 0 || selectionEnd < 0 || unicodeChar == 0) {
                    return false;
                }
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                dVar.beginBatchEdit();
                if (min != max) {
                    fVar.delete(min, max);
                }
                fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i10 = min + 1;
                dVar.setSelection(i10, i10);
                dVar.endBatchEdit();
            } else if (keyEvent.getAction() != 1) {
                return false;
            } else {
                if (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60) {
                    return false;
                }
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                dVar.setSelection(selectionEnd2, selectionEnd2);
            }
            return true;
        }
        return inputConnection.sendKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.f18913h;
        if (accessibilityBridge != null && accessibilityBridge.c.isEnabled()) {
            return this.f18913h;
        }
        return null;
    }

    public Bitmap getBitmap() {
        h();
        return this.f18916k.f18940d.getBitmap();
    }

    public we.a getDartExecutor() {
        return this.f18907a;
    }

    public float getDevicePixelRatio() {
        return this.f18914i.f18921a;
    }

    public io.flutter.view.b getFlutterNativeView() {
        return this.f18916k;
    }

    public ue.a getPluginRegistry() {
        return this.f18916k.f18938a;
    }

    public final void h() {
        if (j()) {
            return;
        }
        throw new AssertionError("Platform view is not attached");
    }

    @TargetApi(20)
    public final int i(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    public final boolean j() {
        io.flutter.view.b bVar = this.f18916k;
        if (bVar != null && bVar.f18940d.isAttached()) {
            return true;
        }
        return false;
    }

    public final void k() {
        boolean z10;
        SettingsChannel.PlatformBrightness platformBrightness;
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            platformBrightness = SettingsChannel.PlatformBrightness.dark;
        } else {
            platformBrightness = SettingsChannel.PlatformBrightness.light;
        }
        gf.b<Object> bVar = this.c.f18702a;
        HashMap hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        hashMap.put("platformBrightness", platformBrightness.name);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        bVar.a(hashMap, null);
    }

    public final void l() {
        if (!j()) {
            return;
        }
        FlutterJNI flutterJNI = this.f18916k.f18940d;
        c cVar = this.f18914i;
        flutterJNI.setViewportMetrics(cVar.f18921a, cVar.f18922b, cVar.c, cVar.f18923d, cVar.f18924e, cVar.f18925f, cVar.f18926g, cVar.f18927h, cVar.f18928i, cVar.f18929j, cVar.f18930k, cVar.f18931l, cVar.f18932m, cVar.f18933n, cVar.f18934o, cVar.f18935p, new int[0], new int[0], new int[0]);
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
        int i13;
        Insets insets;
        int i14;
        int i15;
        int i16;
        int i17;
        int ime;
        Insets insets2;
        int i18;
        int i19;
        int i20;
        int i21;
        int systemGestures;
        Insets insets3;
        int i22;
        int i23;
        int i24;
        int i25;
        DisplayCutout displayCutout;
        Insets waterfallInsets;
        int i26;
        int safeInsetTop;
        int i27;
        int safeInsetRight;
        int i28;
        int safeInsetBottom;
        int i29;
        int safeInsetLeft;
        int statusBars;
        int navigationBars;
        Insets systemGestureInsets;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34 = Build.VERSION.SDK_INT;
        c cVar = this.f18914i;
        if (i34 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i30 = systemGestureInsets.top;
            cVar.f18931l = i30;
            i31 = systemGestureInsets.right;
            cVar.f18932m = i31;
            i32 = systemGestureInsets.bottom;
            cVar.f18933n = i32;
            i33 = systemGestureInsets.left;
            cVar.f18934o = i33;
        }
        int i35 = 0;
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
        if (i34 >= 30) {
            if (z11) {
                navigationBars = WindowInsets.Type.navigationBars();
                i35 = 0 | navigationBars;
            }
            if (z10) {
                statusBars = WindowInsets.Type.statusBars();
                i35 |= statusBars;
            }
            insets = windowInsets.getInsets(i35);
            i14 = insets.top;
            cVar.f18923d = i14;
            i15 = insets.right;
            cVar.f18924e = i15;
            i16 = insets.bottom;
            cVar.f18925f = i16;
            i17 = insets.left;
            cVar.f18926g = i17;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i18 = insets2.top;
            cVar.f18927h = i18;
            i19 = insets2.right;
            cVar.f18928i = i19;
            i20 = insets2.bottom;
            cVar.f18929j = i20;
            i21 = insets2.left;
            cVar.f18930k = i21;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i22 = insets3.top;
            cVar.f18931l = i22;
            i23 = insets3.right;
            cVar.f18932m = i23;
            i24 = insets3.bottom;
            cVar.f18933n = i24;
            i25 = insets3.left;
            cVar.f18934o = i25;
            displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                int i36 = cVar.f18923d;
                i26 = waterfallInsets.top;
                int max = Math.max(i36, i26);
                safeInsetTop = displayCutout.getSafeInsetTop();
                cVar.f18923d = Math.max(max, safeInsetTop);
                int i37 = cVar.f18924e;
                i27 = waterfallInsets.right;
                int max2 = Math.max(i37, i27);
                safeInsetRight = displayCutout.getSafeInsetRight();
                cVar.f18924e = Math.max(max2, safeInsetRight);
                int i38 = cVar.f18925f;
                i28 = waterfallInsets.bottom;
                int max3 = Math.max(i38, i28);
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                cVar.f18925f = Math.max(max3, safeInsetBottom);
                int i39 = cVar.f18926g;
                i29 = waterfallInsets.left;
                int max4 = Math.max(i39, i29);
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                cVar.f18926g = Math.max(max4, safeInsetLeft);
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z11) {
                Context context = getContext();
                int i40 = context.getResources().getConfiguration().orientation;
                int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
                if (i40 == 2) {
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
            cVar.f18923d = i10;
            if (zeroSides != ZeroSides.RIGHT && zeroSides != ZeroSides.BOTH) {
                i11 = windowInsets.getSystemWindowInsetRight();
            } else {
                i11 = 0;
            }
            cVar.f18924e = i11;
            if (z11 && i(windowInsets) == 0) {
                i12 = windowInsets.getSystemWindowInsetBottom();
            } else {
                i12 = 0;
            }
            cVar.f18925f = i12;
            if (zeroSides != ZeroSides.LEFT && zeroSides != ZeroSides.BOTH) {
                i13 = windowInsets.getSystemWindowInsetLeft();
            } else {
                i13 = 0;
            }
            cVar.f18926g = i13;
            cVar.f18927h = 0;
            cVar.f18928i = 0;
            cVar.f18929j = i(windowInsets);
            cVar.f18930k = 0;
        }
        l();
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, new ff.a(this.f18907a, getFlutterNativeView().f18940d), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), getPluginRegistry().c);
        this.f18913h = accessibilityBridge;
        accessibilityBridge.f18851s = this.f18918m;
        boolean isEnabled = accessibilityBridge.c.isEnabled();
        boolean isTouchExplorationEnabled = this.f18913h.c.isTouchExplorationEnabled();
        boolean z10 = false;
        if (!this.f18917l) {
            if (!isEnabled && !isTouchExplorationEnabled) {
                z10 = true;
            }
            setWillNotDraw(z10);
            return;
        }
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18910e.a(configuration);
        k();
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f18909d.c(this, this.f18911f, editorInfo);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AccessibilityBridge accessibilityBridge = this.f18913h;
        if (accessibilityBridge != null) {
            accessibilityBridge.f18853u = true;
            ((j) accessibilityBridge.f18837e).f18817g.f18796a = null;
            accessibilityBridge.f18851s = null;
            AccessibilityManager accessibilityManager = accessibilityBridge.c;
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityBridge.f18855w);
            accessibilityManager.removeTouchExplorationStateChangeListener(accessibilityBridge.f18856x);
            accessibilityBridge.f18838f.unregisterContentObserver(accessibilityBridge.f18857y);
            ff.a aVar = accessibilityBridge.f18835b;
            aVar.f17272b = null;
            aVar.f17271a.setAccessibilityDelegate(null);
            this.f18913h = null;
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j()) {
            io.flutter.embedding.android.a aVar = this.f18912g;
            aVar.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 8) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (isFromSource && z10) {
                int b10 = io.flutter.embedding.android.a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                aVar.a(motionEvent, motionEvent.getActionIndex(), b10, 0, io.flutter.embedding.android.a.f18610e, allocateDirect);
                if (allocateDirect.position() % 280 == 0) {
                    aVar.f18611a.f18652a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                    z11 = true;
                } else {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
            } else {
                z11 = false;
            }
            if (z11) {
                z12 = true;
            }
        }
        if (z12) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (!j()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f18913h.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        boolean z10;
        AutofillId autofillId;
        AutofillValue forText;
        Rect rect;
        AutofillValue forText2;
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        int i11 = Build.VERSION.SDK_INT;
        TextInputPlugin textInputPlugin = this.f18909d;
        if (i11 >= 26) {
            if (textInputPlugin.f18735g != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String str = textInputPlugin.f18734f.f18717j.f18720a;
                autofillId = viewStructure.getAutofillId();
                for (int i12 = 0; i12 < textInputPlugin.f18735g.size(); i12++) {
                    int keyAt = textInputPlugin.f18735g.keyAt(i12);
                    TextInputChannel.b.a aVar = textInputPlugin.f18735g.valueAt(i12).f18717j;
                    if (aVar != null) {
                        viewStructure.addChildCount(1);
                        ViewStructure newChild = viewStructure.newChild(i12);
                        newChild.setAutofillId(autofillId, keyAt);
                        String[] strArr = aVar.f18721b;
                        if (strArr.length > 0) {
                            newChild.setAutofillHints(strArr);
                        }
                        newChild.setAutofillType(1);
                        newChild.setVisibility(0);
                        String str2 = aVar.f18722d;
                        if (str2 != null) {
                            newChild.setHint(str2);
                        }
                        if (str.hashCode() == keyAt && (rect = textInputPlugin.f18740l) != null) {
                            newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), textInputPlugin.f18740l.height());
                            forText2 = AutofillValue.forText(textInputPlugin.f18736h);
                            newChild.setAutofillValue(forText2);
                        } else {
                            newChild.setDimens(0, 0, 0, 0, 1, 1);
                            forText = AutofillValue.forText(aVar.c.f18725a);
                            newChild.setAutofillValue(forText);
                        }
                    }
                }
                return;
            }
            return;
        }
        textInputPlugin.getClass();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        c cVar = this.f18914i;
        cVar.f18922b = i10;
        cVar.c = i11;
        l();
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f18912g.c(motionEvent, io.flutter.embedding.android.a.f18610e);
        return true;
    }

    public void setInitialRoute(String str) {
        this.f18908b.f17281a.a(str, "setInitialRoute");
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new AtomicLong(0L);
        this.f18917l = false;
        this.f18918m = new a();
        Activity a10 = p001if.b.a(getContext());
        if (a10 != null) {
            io.flutter.view.b bVar = new io.flutter.view.b(a10.getApplicationContext());
            this.f18916k = bVar;
            we.a aVar = bVar.f18939b;
            this.f18907a = aVar;
            FlutterJNI flutterJNI = bVar.f18940d;
            FlutterRenderer flutterRenderer = new FlutterRenderer(flutterJNI);
            this.f18917l = flutterJNI.getIsSoftwareRenderingEnabled();
            c cVar = new c();
            this.f18914i = cVar;
            cVar.f18921a = context.getResources().getDisplayMetrics().density;
            cVar.f18935p = ViewConfiguration.get(context).getScaledTouchSlop();
            setFocusable(true);
            setFocusableInTouchMode(true);
            bVar.c = this;
            ue.a aVar2 = bVar.f18938a;
            aVar2.f30364a = a10;
            we.a dartExecutor = getDartExecutor();
            j jVar = aVar2.c;
            if (jVar.c == null) {
                jVar.c = a10;
                jVar.f18814d = this;
                PlatformViewsChannel platformViewsChannel = new PlatformViewsChannel(dartExecutor);
                jVar.f18816f = platformViewsChannel;
                platformViewsChannel.f18680b = jVar.f18828r;
                getHolder().addCallback(new io.flutter.view.c(this));
                ArrayList arrayList = new ArrayList();
                this.f18915j = new ArrayList();
                this.f18908b = new ff.f(aVar);
                Charset charset = l.f17804a;
                ff.d dVar = new ff.d(aVar);
                PlatformChannel platformChannel = new PlatformChannel(aVar);
                this.c = new SettingsChannel(aVar);
                new io.flutter.plugin.platform.b(a10, platformChannel);
                arrayList.add(new aj.b());
                InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                j jVar2 = aVar2.c;
                TextInputPlugin textInputPlugin = new TextInputPlugin(this, new TextInputChannel(aVar), jVar2);
                this.f18909d = textInputPlugin;
                this.f18911f = new f(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    new io.flutter.plugin.mouse.a(this, new ff.e(aVar));
                }
                hf.a aVar3 = new hf.a(context, dVar);
                this.f18910e = aVar3;
                this.f18912g = new io.flutter.embedding.android.a(flutterRenderer, false);
                jVar2.f18813b = new io.flutter.embedding.android.a(flutterRenderer, true);
                aVar2.c.f18815e = textInputPlugin;
                flutterJNI.setLocalizationPlugin(aVar3);
                aVar3.a(getResources().getConfiguration());
                k();
                return;
            }
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        throw new IllegalArgumentException("Bad context");
    }

    @Override // io.flutter.embedding.android.f.d
    public gf.c getBinaryMessenger() {
        return this;
    }
}
