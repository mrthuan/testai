package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* compiled from: SidecarWindowBackend.kt */
/* loaded from: classes.dex */
public final class SidecarWindowBackend implements WindowBackend {
    public static final boolean DEBUG = false;
    private static final String TAG = "WindowServer";
    private static volatile SidecarWindowBackend globalInstance;
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* compiled from: SidecarWindowBackend.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        public final SidecarWindowBackend getInstance(Context context) {
            kotlin.jvm.internal.g.e(context, "context");
            if (SidecarWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = SidecarWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (SidecarWindowBackend.globalInstance == null) {
                        SidecarWindowBackend.globalInstance = new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension(context));
                    }
                    tf.d dVar = tf.d.f30009a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            SidecarWindowBackend sidecarWindowBackend = SidecarWindowBackend.globalInstance;
            kotlin.jvm.internal.g.b(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        public final ExtensionInterfaceCompat initAndVerifyExtension(Context context) {
            kotlin.jvm.internal.g.e(context, "context");
            try {
                if (!isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.validateExtensionInterface()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean isSidecarVersionSupported(Version version) {
            if (version == null || version.compareTo(Version.Companion.getVERSION_0_1()) < 0) {
                return false;
            }
            return true;
        }

        public final void resetInstance() {
            SidecarWindowBackend.globalInstance = null;
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    /* loaded from: classes.dex */
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ SidecarWindowBackend this$0;

        public ExtensionListenerImpl(SidecarWindowBackend this$0) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo newLayout) {
            kotlin.jvm.internal.g.e(activity, "activity");
            kotlin.jvm.internal.g.e(newLayout, "newLayout");
            Iterator<WindowLayoutChangeCallbackWrapper> it = this.this$0.getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (kotlin.jvm.internal.g.a(next.getActivity(), activity)) {
                    next.accept(newLayout);
                }
            }
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    /* loaded from: classes.dex */
    public static final class WindowLayoutChangeCallbackWrapper {
        private final Activity activity;
        private final w0.a<WindowLayoutInfo> callback;
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(Activity activity, Executor executor, w0.a<WindowLayoutInfo> callback) {
            kotlin.jvm.internal.g.e(activity, "activity");
            kotlin.jvm.internal.g.e(executor, "executor");
            kotlin.jvm.internal.g.e(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        public static /* synthetic */ void a(WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
            m6accept$lambda0(windowLayoutChangeCallbackWrapper, windowLayoutInfo);
        }

        /* renamed from: accept$lambda-0 */
        public static final void m6accept$lambda0(WindowLayoutChangeCallbackWrapper this$0, WindowLayoutInfo newLayoutInfo) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            kotlin.jvm.internal.g.e(newLayoutInfo, "$newLayoutInfo");
            this$0.getCallback().accept(newLayoutInfo);
        }

        public final void accept(WindowLayoutInfo newLayoutInfo) {
            kotlin.jvm.internal.g.e(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new androidx.fragment.app.g(2, this, newLayoutInfo));
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final w0.a<WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    public SidecarWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 != null) {
            extensionInterfaceCompat2.setExtensionCallback(new ExtensionListenerImpl(this));
        }
    }

    private final void callbackRemovedForActivity(Activity activity) {
        ExtensionInterfaceCompat extensionInterfaceCompat;
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        boolean z10 = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (kotlin.jvm.internal.g.a(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (!z10 && (extensionInterfaceCompat = this.windowExtension) != null) {
            extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
        }
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : copyOnWriteArrayList) {
            if (kotlin.jvm.internal.g.a(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, w0.a<WindowLayoutInfo> callback) {
        WindowLayoutInfo windowLayoutInfo;
        Object obj;
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(executor, "executor");
        kotlin.jvm.internal.g.e(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.accept(new WindowLayoutInfo(EmptyList.INSTANCE));
                return;
            }
            boolean isActivityRegistered = isActivityRegistered(activity);
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, callback);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (!isActivityRegistered) {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            } else {
                Iterator<T> it = getWindowLayoutChangeCallbacks().iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.g.a(activity, ((WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
            tf.d dVar = tf.d.f30009a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(w0.a<WindowLayoutInfo> callback) {
        kotlin.jvm.internal.g.e(callback, "callback");
        synchronized (globalLock) {
            if (getWindowExtension() == null) {
                return;
            }
            ArrayList<WindowLayoutChangeCallbackWrapper> arrayList = new ArrayList();
            Iterator<WindowLayoutChangeCallbackWrapper> it = getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (next.getCallback() == callback) {
                    arrayList.add(next);
                }
            }
            getWindowLayoutChangeCallbacks().removeAll(arrayList);
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : arrayList) {
                callbackRemovedForActivity(windowLayoutChangeCallbackWrapper.getActivity());
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }
}
