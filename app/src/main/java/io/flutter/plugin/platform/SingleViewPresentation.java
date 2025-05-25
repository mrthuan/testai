package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.view.AccessibilityBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import lib.zj.office.fc.hslf.record.SlideAtom;

@Keep
@TargetApi(17)
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final e state;
    private int viewId;

    /* loaded from: classes.dex */
    public static class a extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        public final io.flutter.plugin.platform.a f18785a;

        /* renamed from: b  reason: collision with root package name */
        public final View f18786b;

        public a(Context context, io.flutter.plugin.platform.a aVar, View view) {
            super(context);
            this.f18785a = aVar;
            this.f18786b = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityBridge accessibilityBridge = this.f18785a.f18796a;
            if (accessibilityBridge == null) {
                return false;
            }
            return accessibilityBridge.a(this.f18786b, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f18787a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f18788b;

        public b(Context context) {
            super(context);
            this.f18787a = new Rect();
            this.f18788b = new Rect();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f18787a.set(i10, i11, i12, i13);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f18787a, layoutParams.x, layoutParams.y, this.f18788b);
                Rect rect = this.f18788b;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), SlideAtom.USES_MASTER_SLIDE_ID), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), SlideAtom.USES_MASTER_SLIDE_ID));
            }
            super.onMeasure(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final InputMethodManager f18789a;

        public c(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f18789a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f18789a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if ("input_method".equals(str)) {
                return this.f18789a;
            }
            return super.getSystemService(str);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final f f18790a;

        /* renamed from: b  reason: collision with root package name */
        public WindowManager f18791b;
        public final Context c;

        public d(Context context, f fVar, Context context2) {
            super(context);
            this.f18790a = fVar;
            this.c = context2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            boolean z10;
            if ("window".equals(str)) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i10 = 0; i10 < stackTrace.length && i10 < 11; i10++) {
                    if (stackTrace[i10].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i10].getMethodName().equals("<init>")) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                if (z10) {
                    return this.c.getSystemService(str);
                }
                if (this.f18791b == null) {
                    f fVar = this.f18790a;
                    fVar.getClass();
                    this.f18791b = (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, fVar);
                }
                return this.f18791b;
            }
            return super.getSystemService(str);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public io.flutter.plugin.platform.e f18792a;

        /* renamed from: b  reason: collision with root package name */
        public f f18793b;
        public b c;
    }

    /* loaded from: classes.dex */
    public static class f implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final WindowManager f18794a;

        /* renamed from: b  reason: collision with root package name */
        public final b f18795b;

        public f(WindowManager windowManager, b bVar) {
            this.f18794a = windowManager;
            this.f18795b = bVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.getClass();
            char c = 65535;
            switch (name.hashCode()) {
                case -1148522778:
                    if (name.equals("addView")) {
                        c = 0;
                        break;
                    }
                    break;
                case 542766184:
                    if (name.equals("removeViewImmediate")) {
                        c = 1;
                        break;
                    }
                    break;
                case 931413976:
                    if (name.equals("updateViewLayout")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1098630473:
                    if (name.equals("removeView")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            b bVar = this.f18795b;
            switch (c) {
                case 0:
                    if (bVar != null) {
                        bVar.addView((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
                    }
                    return null;
                case 1:
                    if (bVar != null) {
                        View view = (View) objArr[0];
                        view.clearAnimation();
                        bVar.removeView(view);
                    }
                    return null;
                case 2:
                    if (bVar != null) {
                        bVar.updateViewLayout((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
                    }
                    return null;
                case 3:
                    if (bVar != null) {
                        bVar.removeView((View) objArr[0]);
                    }
                    return null;
                default:
                    try {
                        return method.invoke(this.f18794a, objArr);
                    } catch (InvocationTargetException e10) {
                        throw e10.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.e eVar, io.flutter.plugin.platform.a aVar, int i10, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i10;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar2 = new e();
        this.state = eVar2;
        eVar2.f18792a = eVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public io.flutter.plugin.platform.e getView() {
        io.flutter.plugin.platform.e eVar = this.state.f18792a;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        e eVar = this.state;
        if (eVar.c == null) {
            eVar.c = new b(getContext());
        }
        if (this.state.f18793b == null) {
            e eVar2 = this.state;
            eVar2.f18793b = new f((WindowManager) getContext().getSystemService("window"), eVar2.c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f18793b, this.outerContext);
        View view = this.state.f18792a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(dVar);
        }
        this.container.addView(view);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z10) {
        super(new c(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z10;
    }
}
