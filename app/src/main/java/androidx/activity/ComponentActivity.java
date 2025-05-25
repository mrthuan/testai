package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.b0;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import j.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k0.b;
import k0.v;
import k0.w;
import k0.y;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x0.l;

/* loaded from: classes.dex */
public class ComponentActivity extends k0.j implements p0, androidx.lifecycle.j, z1.c, q, androidx.activity.result.g, androidx.core.content.c, androidx.core.content.d, v, w, x0.i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.f mActivityResultRegistry;
    private int mContentLayoutId;
    final i.a mContextAwareHelper;
    private m0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final m mFullyDrawnReporter;
    private final androidx.lifecycle.q mLifecycleRegistry;
    private final x0.l mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<w0.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<w0.a<k0.k>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<w0.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<w0.a<y>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<w0.a<Integer>> mOnTrimMemoryListeners;
    final e mReportFullyDrawnExecutor;
    final z1.b mSavedStateRegistryController;
    private o0 mViewModelStore;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    return;
                }
                throw e10;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.f {
        public b() {
            ComponentActivity.this = r1;
        }

        @Override // androidx.activity.result.f
        public final void b(int i10, j.a aVar, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0256a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new g(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                k0.b.a(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.h hVar = (androidx.activity.result.h) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = hVar.f1845a;
                    Intent intent = hVar.f1846b;
                    int i11 = hVar.c;
                    int i12 = hVar.f1847d;
                    int i13 = k0.b.f19457a;
                    b.a.c(componentActivity, intentSender, i10, intent, i11, i12, 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new h(this, i10, e10));
                }
            } else {
                int i14 = k0.b.f19457a;
                b.a.b(componentActivity, a10, i10, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public Object f1779a;

        /* renamed from: b */
        public o0 f1780b;
    }

    /* loaded from: classes.dex */
    public interface e extends Executor {
        void m(View view);
    }

    /* loaded from: classes.dex */
    public class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b */
        public Runnable f1782b;

        /* renamed from: a */
        public final long f1781a = SystemClock.uptimeMillis() + 10000;
        public boolean c = false;

        public f() {
            ComponentActivity.this = r5;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f1782b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (this.c) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new i(this, 0));
        }

        @Override // androidx.activity.ComponentActivity.e
        public final void m(View view) {
            if (!this.c) {
                this.c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f1782b;
            if (runnable != null) {
                runnable.run();
                this.f1782b = null;
                m mVar = ComponentActivity.this.mFullyDrawnReporter;
                synchronized (mVar.c) {
                    z10 = mVar.f1818d;
                }
                if (z10) {
                    this.c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f1781a) {
                this.c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new i.a();
        this.mMenuHostHelper = new x0.l(new androidx.activity.b(this, 0));
        this.mLifecycleRegistry = new androidx.lifecycle.q(this);
        z1.b bVar = new z1.b(this);
        this.mSavedStateRegistryController = bVar;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        e createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new m(createFullyDrawnExecutor, new androidx.activity.c(this, 0));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i10 = Build.VERSION.SDK_INT;
            getLifecycle().a(new androidx.lifecycle.n() { // from class: androidx.activity.ComponentActivity.3
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.n
                public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
                    View view;
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.n() { // from class: androidx.activity.ComponentActivity.4
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.n
                public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f18401b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                        f fVar = (f) ComponentActivity.this.mReportFullyDrawnExecutor;
                        ComponentActivity componentActivity = ComponentActivity.this;
                        componentActivity.getWindow().getDecorView().removeCallbacks(fVar);
                        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(fVar);
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.n() { // from class: androidx.activity.ComponentActivity.5
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.n
                public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().c(this);
                }
            });
            bVar.a();
            SavedStateHandleSupport.b(this);
            if (i10 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new androidx.activity.d(this, 0));
            addOnContextAvailableListener(new i.b() { // from class: androidx.activity.e
                @Override // i.b
                public final void a(Context context) {
                    ComponentActivity.this.lambda$new$2(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private e createFullyDrawnExecutor() {
        return new f();
    }

    private void initViewTreeOwners() {
        t0.q0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.g.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        t0.r0(getWindow().getDecorView(), this);
        s.t0(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.g.e(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
    }

    public /* synthetic */ tf.d lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    public Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        androidx.activity.result.f fVar = this.mActivityResultRegistry;
        fVar.getClass();
        HashMap hashMap = fVar.c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fVar.f1837e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) fVar.f1840h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", fVar.f1834a);
        return bundle;
    }

    public void lambda$new$2(Context context) {
        Bundle a10 = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            androidx.activity.result.f fVar = this.mActivityResultRegistry;
            fVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                fVar.f1837e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                fVar.f1834a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = fVar.f1840h;
                bundle2.putAll(bundle);
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    HashMap hashMap = fVar.c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = fVar.f1835b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i10).intValue();
                    String str2 = stringArrayList.get(i10);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.m(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // x0.i
    public void addMenuProvider(x0.n nVar) {
        x0.l lVar = this.mMenuHostHelper;
        lVar.f31462b.add(nVar);
        lVar.f31461a.run();
    }

    @Override // androidx.core.content.c
    public final void addOnConfigurationChangedListener(w0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(i.b listener) {
        i.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        kotlin.jvm.internal.g.e(listener, "listener");
        Context context = aVar.f18401b;
        if (context != null) {
            listener.a(context);
        }
        aVar.f18400a.add(listener);
    }

    @Override // k0.v
    public final void addOnMultiWindowModeChangedListener(w0.a<k0.k> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(w0.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // k0.w
    public final void addOnPictureInPictureModeChangedListener(w0.a<y> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // androidx.core.content.d
    public final void addOnTrimMemoryListener(w0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f1780b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new o0();
            }
        }
    }

    @Override // androidx.activity.result.g
    public final androidx.activity.result.f getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.j
    public n1.a getDefaultViewModelCreationExtras() {
        n1.c cVar = new n1.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f22313a;
        if (application != null) {
            linkedHashMap.put(l0.f4062a, getApplication());
        }
        linkedHashMap.put(SavedStateHandleSupport.f4016a, this);
        linkedHashMap.put(SavedStateHandleSupport.f4017b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(SavedStateHandleSupport.c, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.j
    public m0.b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new g0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    public m getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f1779a;
        }
        return null;
    }

    @Override // k0.j, androidx.lifecycle.p
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.q
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // z1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f32217b;
    }

    @Override // androidx.lifecycle.p0
    public o0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.mActivityResultRegistry.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<w0.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        i.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        aVar.f18401b = this;
        Iterator it = aVar.f18400a.iterator();
        while (it.hasNext()) {
            ((i.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = b0.f4028b;
        b0.b.b(this);
        if (s0.a.b()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.mOnBackPressedDispatcher;
            OnBackInvokedDispatcher invoker = c.a(this);
            onBackPressedDispatcher.getClass();
            kotlin.jvm.internal.g.e(invoker, "invoker");
            onBackPressedDispatcher.f1791e = invoker;
            onBackPressedDispatcher.d();
        }
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            x0.l lVar = this.mMenuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator<x0.n> it = lVar.f31462b.iterator();
            while (it.hasNext()) {
                it.next().c(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<x0.n> it = this.mMenuHostHelper.f31462b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<w0.a<k0.k>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new k0.k(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<w0.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<x0.n> it = this.mMenuHostHelper.f31462b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<w0.a<y>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator<x0.n> it = this.mMenuHostHelper.f31462b.iterator();
            while (it.hasNext()) {
                it.next().d(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        o0 o0Var = this.mViewModelStore;
        if (o0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            o0Var = dVar.f1780b;
        }
        if (o0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f1779a = onRetainCustomNonConfigurationInstance;
        dVar2.f1780b = o0Var;
        return dVar2;
    }

    @Override // k0.j, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.q) {
            ((androidx.lifecycle.q) lifecycle).h(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<w0.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f18401b;
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(j.a<I, O> aVar, androidx.activity.result.f fVar, androidx.activity.result.b<O> bVar) {
        return fVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    @Override // x0.i
    public void removeMenuProvider(x0.n nVar) {
        this.mMenuHostHelper.a(nVar);
    }

    @Override // androidx.core.content.c
    public final void removeOnConfigurationChangedListener(w0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(i.b listener) {
        i.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        kotlin.jvm.internal.g.e(listener, "listener");
        aVar.f18400a.remove(listener);
    }

    @Override // k0.v
    public final void removeOnMultiWindowModeChangedListener(w0.a<k0.k> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(w0.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // k0.w
    public final void removeOnPictureInPictureModeChangedListener(w0.a<y> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // androidx.core.content.d
    public final void removeOnTrimMemoryListener(w0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (e2.a.b()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.m(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<w0.a<k0.k>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new k0.k(z10, 0));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<w0.a<y>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new y(z10, 0));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(j.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.m(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final x0.n nVar, androidx.lifecycle.p pVar) {
        final x0.l lVar = this.mMenuHostHelper;
        lVar.f31462b.add(nVar);
        lVar.f31461a.run();
        Lifecycle lifecycle = pVar.getLifecycle();
        HashMap hashMap = lVar.c;
        l.a aVar = (l.a) hashMap.remove(nVar);
        if (aVar != null) {
            aVar.f31463a.c(aVar.f31464b);
            aVar.f31464b = null;
        }
        hashMap.put(nVar, new l.a(lifecycle, new androidx.lifecycle.n() { // from class: x0.j
            @Override // androidx.lifecycle.n
            public final void d(androidx.lifecycle.p pVar2, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_DESTROY;
                l lVar2 = l.this;
                if (event == event2) {
                    lVar2.a(nVar);
                } else {
                    lVar2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.m(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final x0.n nVar, androidx.lifecycle.p pVar, final Lifecycle.State state) {
        final x0.l lVar = this.mMenuHostHelper;
        lVar.getClass();
        Lifecycle lifecycle = pVar.getLifecycle();
        HashMap hashMap = lVar.c;
        l.a aVar = (l.a) hashMap.remove(nVar);
        if (aVar != null) {
            aVar.f31463a.c(aVar.f31464b);
            aVar.f31464b = null;
        }
        hashMap.put(nVar, new l.a(lifecycle, new androidx.lifecycle.n() { // from class: x0.k
            @Override // androidx.lifecycle.n
            public final void d(androidx.lifecycle.p pVar2, Lifecycle.Event event) {
                l lVar2 = l.this;
                lVar2.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event upTo = Lifecycle.Event.upTo(state2);
                Runnable runnable = lVar2.f31461a;
                CopyOnWriteArrayList<n> copyOnWriteArrayList = lVar2.f31462b;
                n nVar2 = nVar;
                if (event == upTo) {
                    copyOnWriteArrayList.add(nVar2);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    lVar2.a(nVar2);
                } else if (event == Lifecycle.Event.downFrom(state2)) {
                    copyOnWriteArrayList.remove(nVar2);
                    runnable.run();
                }
            }
        }));
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
