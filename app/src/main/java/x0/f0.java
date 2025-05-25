package x0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import pdf.pdfreader.viewer.editor.free.R;
import x0.a;
import x0.c;
import x0.f0;
import x0.s0;
import y0.f;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, n0> f31435a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f31436b;
    public static boolean c;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f31437d;

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f31438e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f31439f;

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f31441a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f31442b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f31443d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f31441a = i10;
            this.f31442b = cls;
            this.f31443d = i11;
            this.c = i12;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            boolean z10;
            boolean z11;
            if (bool != null && bool.booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
            return false;
        }

        public abstract T b(View view);

        public abstract void c(View view, T t4);

        public final T d(View view) {
            boolean z10;
            if (Build.VERSION.SDK_INT >= this.c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b(view);
            }
            T t4 = (T) view.getTag(this.f31441a);
            if (this.f31442b.isInstance(t4)) {
                return t4;
            }
            return null;
        }

        public final void e(View view, T t4) {
            boolean z10;
            x0.a aVar;
            if (Build.VERSION.SDK_INT >= this.c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(view, t4);
            } else if (f(d(view), t4)) {
                View.AccessibilityDelegate d10 = f0.d(view);
                if (d10 == null) {
                    aVar = null;
                } else if (d10 instanceof a.C0399a) {
                    aVar = ((a.C0399a) d10).f31418a;
                } else {
                    aVar = new x0.a(d10);
                }
                if (aVar == null) {
                    aVar = new x0.a();
                }
                f0.o(view, aVar);
                view.setTag(this.f31441a, t4);
                f0.i(view, this.f31443d);
            }
        }

        public abstract boolean f(T t4, T t10);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class i {

        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public s0 f31444a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f31445b;
            public final /* synthetic */ u c;

            public a(View view, u uVar) {
                this.f31445b = view;
                this.c = uVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                s0 i10 = s0.i(view, windowInsets);
                int i11 = Build.VERSION.SDK_INT;
                u uVar = this.c;
                if (i11 < 30) {
                    i.a(windowInsets, this.f31445b);
                    if (i10.equals(this.f31444a)) {
                        return uVar.m(view, i10).h();
                    }
                }
                this.f31444a = i10;
                s0 m10 = uVar.m(view, i10);
                if (i11 >= 30) {
                    return m10.h();
                }
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                h.c(view);
                return m10.h();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static s0 b(View view, s0 s0Var, Rect rect) {
            WindowInsets h10 = s0Var.h();
            if (h10 != null) {
                return s0.i(view, view.computeSystemWindowInsets(h10, rect));
            }
            rect.setEmpty();
            return s0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static s0 j(View view) {
            s0.e bVar;
            if (s0.a.f31501d && view.isAttachedToWindow()) {
                try {
                    Object obj = s0.a.f31499a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) s0.a.f31500b.get(obj);
                        Rect rect2 = (Rect) s0.a.c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                bVar = new s0.d();
                            } else if (i10 >= 29) {
                                bVar = new s0.c();
                            } else {
                                bVar = new s0.b();
                            }
                            bVar.e(o0.b.b(rect.left, rect.top, rect.right, rect.bottom));
                            bVar.g(o0.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            s0 b10 = bVar.b();
                            b10.f31498a.p(b10);
                            b10.f31498a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    e10.getMessage();
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, u uVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, uVar);
            }
            if (uVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, uVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class j {
        public static s0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            s0 i10 = s0.i(null, rootWindowInsets);
            s0.k kVar = i10.f31498a;
            kVar.p(i10);
            kVar.d(view.getRootView());
            return i10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class m {
        public static void a(View view, final r rVar) {
            y.i iVar = (y.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar == null) {
                iVar = new y.i();
                view.setTag(R.id.tag_unhandled_key_listeners, iVar);
            }
            Objects.requireNonNull(rVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: x0.g0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return f0.r.this.a();
                }
            };
            iVar.put(rVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            y.i iVar = (y.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static t0 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new t0(windowInsetsController);
            }
            return null;
        }

        public static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static x0.c b(View view, x0.c cVar) {
            ContentInfo c = cVar.f31421a.c();
            Objects.requireNonNull(c);
            ContentInfo d10 = com.google.android.gms.internal.ads.m.d(c);
            ContentInfo performReceiveContent = view.performReceiveContent(d10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == d10) {
                return cVar;
            }
            return new x0.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, v vVar) {
            if (vVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(vVar));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final v f31446a;

        public q(v vVar) {
            this.f31446a = vVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            x0.c cVar = new x0.c(new c.d(contentInfo));
            x0.c a10 = this.f31446a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo c = a10.f31421a.c();
            Objects.requireNonNull(c);
            return com.google.android.gms.internal.ads.m.d(c);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface r {
        boolean a();
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f31447d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f31448a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f31449b = null;
        public WeakReference<KeyEvent> c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f31448a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    do {
                        childCount--;
                        if (childCount >= 0) {
                            a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                        }
                    } while (a10 == null);
                    return a10;
                }
                if (b(view, keyEvent)) {
                    return view;
                }
                return null;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
        f31435a = null;
        c = false;
        f31437d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f31438e = new a0();
        f31439f = new a();
    }

    public static n0 a(View view) {
        if (f31435a == null) {
            f31435a = new WeakHashMap<>();
        }
        n0 n0Var = f31435a.get(view);
        if (n0Var == null) {
            n0 n0Var2 = new n0(view);
            f31435a.put(view, n0Var2);
            return n0Var2;
        }
        return n0Var;
    }

    public static s0 b(View view, s0 s0Var) {
        WindowInsets h10 = s0Var.h();
        if (h10 != null) {
            WindowInsets a10 = h.a(view, h10);
            if (!a10.equals(h10)) {
                return s0.i(view, a10);
            }
        }
        return s0Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f31447d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f31448a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f31447d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f31448a == null) {
                        sVar.f31448a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f31447d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f31448a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f31448a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f31449b == null) {
                    sVar.f31449b = new SparseArray<>();
                }
                sVar.f31449b.put(keyCode, new WeakReference<>(a10));
            }
        }
        if (a10 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (c) {
            return null;
        }
        if (f31436b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f31436b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = f31436b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        boolean z10;
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            tag = m.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] g(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static t0 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return new t0(window, view);
            }
        }
        return null;
    }

    public static void i(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 32;
        if (g.a(view) == 0 && !z10) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                g.g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i11 = 2048;
        }
        obtain2.setEventType(i11);
        g.g(obtain2, i10);
        if (z10) {
            obtain2.getText().add(e(view));
            if (d.c(view) == 0) {
                d.s(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (d.c((View) parent) == 4) {
                    d.s(view, 2);
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static s0 j(View view, s0 s0Var) {
        WindowInsets h10 = s0Var.h();
        if (h10 != null) {
            WindowInsets b10 = h.b(view, h10);
            if (!b10.equals(h10)) {
                return s0.i(view, b10);
            }
        }
        return s0Var;
    }

    public static x0.c k(View view, x0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(cVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        v vVar = (v) view.getTag(R.id.tag_on_receive_content_listener);
        w wVar = f31438e;
        if (vVar != null) {
            x0.c a10 = vVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof w) {
                wVar = (w) view;
            }
            return wVar.a(a10);
        }
        if (view instanceof w) {
            wVar = (w) view;
        }
        return wVar.a(cVar);
    }

    public static void l(View view, int i10) {
        ArrayList f10 = f(view);
        for (int i11 = 0; i11 < f10.size(); i11++) {
            if (((f.a) f10.get(i11)).a() == i10) {
                f10.remove(i11);
                return;
            }
        }
    }

    public static void m(View view, f.a aVar, String str, y0.j jVar) {
        x0.a aVar2;
        if (jVar == null && str == null) {
            l(view, aVar.a());
            i(view, 0);
            return;
        }
        f.a aVar3 = new f.a(null, aVar.f31965b, str, jVar, aVar.c);
        View.AccessibilityDelegate d10 = d(view);
        if (d10 == null) {
            aVar2 = null;
        } else if (d10 instanceof a.C0399a) {
            aVar2 = ((a.C0399a) d10).f31418a;
        } else {
            aVar2 = new x0.a(d10);
        }
        if (aVar2 == null) {
            aVar2 = new x0.a();
        }
        o(view, aVar2);
        l(view, aVar3.a());
        f(view).add(aVar3);
        i(view, 0);
    }

    public static void n(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void o(View view, x0.a aVar) {
        a.C0399a c0399a;
        if (aVar == null && (d(view) instanceof a.C0399a)) {
            aVar = new x0.a();
        }
        if (aVar == null) {
            c0399a = null;
        } else {
            c0399a = aVar.f31417b;
        }
        view.setAccessibilityDelegate(c0399a);
    }

    public static void p(View view, CharSequence charSequence) {
        boolean z10;
        new c0().e(view, charSequence);
        a aVar = f31439f;
        if (charSequence != null) {
            WeakHashMap<View, Boolean> weakHashMap = aVar.f31440a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        aVar.f31440a.remove(view);
        view.removeOnAttachStateChangeListener(aVar);
        d.o(view.getViewTreeObserver(), aVar);
    }

    public static void q(View view, y yVar) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            if (yVar != null) {
                pointerIcon = yVar.f31534a;
            } else {
                pointerIcon = null;
            }
            k.d(view, androidx.emoji2.text.s.e(pointerIcon));
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f31440a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z10;
            int i10;
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f31440a;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    if (key.isShown() && key.getWindowVisibility() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (booleanValue != z10) {
                        if (z10) {
                            i10 = 16;
                        } else {
                            i10 = 32;
                        }
                        f0.i(key, i10);
                        weakHashMap.put(key, Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
