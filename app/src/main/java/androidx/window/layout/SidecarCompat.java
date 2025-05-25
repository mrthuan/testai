package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SidecarCompat.kt */
/* loaded from: classes.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SidecarCompat";
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    private final SidecarAdapter sidecarAdapter;
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    /* compiled from: SidecarCompat.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.Companion.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    /* loaded from: classes.dex */
    public static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final ReentrantLock lock;

        public DistinctElementCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            kotlin.jvm.internal.g.e(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo newLayout) {
            kotlin.jvm.internal.g.e(activity, "activity");
            kotlin.jvm.internal.g.e(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (kotlin.jvm.internal.g.a(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    /* loaded from: classes.dex */
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        private final SidecarInterface.SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;
        private final ReentrantLock lock;
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter, SidecarInterface.SidecarCallback callbackInterface) {
            kotlin.jvm.internal.g.e(sidecarAdapter, "sidecarAdapter");
            kotlin.jvm.internal.g.e(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            kotlin.jvm.internal.g.e(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                tf.d dVar = tf.d.f30009a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder token, SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.g.e(token, "token");
            kotlin.jvm.internal.g.e(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    /* loaded from: classes.dex */
    public static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        private final WeakReference<Activity> activityWeakReference;
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(SidecarCompat sidecarCompat, Activity activity) {
            kotlin.jvm.internal.g.e(sidecarCompat, "sidecarCompat");
            kotlin.jvm.internal.g.e(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            kotlin.jvm.internal.g.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            kotlin.jvm.internal.g.e(view, "view");
        }
    }

    /* compiled from: SidecarCompat.kt */
    /* loaded from: classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat this$0) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.this$0 = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            kotlin.jvm.internal.g.e(newDeviceState, "newDeviceState");
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : this.this$0.windowListenerRegisteredContexts.values()) {
                IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState deviceState;
            kotlin.jvm.internal.g.e(windowToken, "windowToken");
            kotlin.jvm.internal.g.e(newLayout, "newLayout");
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity != null) {
                SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
                SidecarInterface sidecar = this.this$0.getSidecar();
                if (sidecar == null) {
                    deviceState = null;
                } else {
                    deviceState = sidecar.getDeviceState();
                }
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                WindowLayoutInfo translate = sidecarAdapter.translate(newLayout, deviceState);
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
                }
            }
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, SidecarAdapter sidecarAdapter) {
        kotlin.jvm.internal.g.e(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration newConfig) {
                    kotlin.jvm.internal.g.e(newConfig, "newConfig");
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface != null) {
                        Activity activity2 = activity;
                        extensionCallbackInterface.onWindowLayoutChanged(activity2, SidecarCompat.this.getWindowLayoutInfo(activity2));
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    public final WindowLayoutInfo getWindowLayoutInfo(Activity activity) {
        SidecarWindowLayoutInfo windowLayoutInfo;
        kotlin.jvm.internal.g.e(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(ge.a.v());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarDeviceState sidecarDeviceState = null;
        if (sidecarInterface == null) {
            windowLayoutInfo = null;
        } else {
            windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        }
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, sidecarDeviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        boolean z10;
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.g.e(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        if (this.windowListenerRegisteredContexts.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (z10 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    public final void register(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.g.e(windowToken, "windowToken");
        kotlin.jvm.internal.g.e(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        kotlin.jvm.internal.g.e(extensionCallback, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    @Override // androidx.window.layout.ExtensionInterfaceCompat
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean validateExtensionInterface() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(SidecarProvider.getSidecarImpl(context.getApplicationContext()), new SidecarAdapter());
        kotlin.jvm.internal.g.e(context, "context");
    }
}
