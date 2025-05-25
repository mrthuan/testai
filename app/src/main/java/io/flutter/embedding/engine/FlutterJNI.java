package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import gf.c;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.PlatformOverlayView;
import io.flutter.plugin.platform.j;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import we.c;
import we.d;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate = null;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static String observatoryUri = null;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private a accessibilityDelegate;
    private xe.a deferredComponentManager;
    private hf.a localizationPlugin;
    private Long nativeShellHolderId;
    private d platformMessageHandler;
    private j platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<ef.a> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    private static void asyncWaitForVsync(long j10) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar != null) {
            e.a aVar = (e.a) bVar;
            aVar.getClass();
            Choreographer choreographer = Choreographer.getInstance();
            e eVar = e.this;
            e.c cVar = eVar.c;
            if (cVar != null) {
                cVar.f18953a = j10;
                eVar.c = null;
            } else {
                cVar = new e.c(j10);
            }
            choreographer.postFrameCallback(cVar);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ve.b] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j10) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: ve.b
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j10, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    private void handlePlatformMessageResponse(int i10, ByteBuffer byteBuffer) {
        c.b bVar;
        d dVar = this.platformMessageHandler;
        if (dVar != null && (bVar = (c.b) ((we.c) dVar).f31195f.remove(Integer.valueOf(i10))) != null) {
            try {
                bVar.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Error e10) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.getUncaughtExceptionHandler() != null) {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e10);
                    return;
                }
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j10, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j10, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j10);

    private native void nativeDeferredComponentInstallFailure(int i10, String str, boolean z10);

    private native void nativeDestroy(long j10);

    private native void nativeDispatchEmptyPlatformMessage(long j10, String str, int i10);

    private native void nativeDispatchPlatformMessage(long j10, String str, ByteBuffer byteBuffer, int i10, int i11);

    private native void nativeDispatchPointerDataPacket(long j10, ByteBuffer byteBuffer, int i10);

    private native void nativeDispatchSemanticsAction(long j10, int i10, int i11, ByteBuffer byteBuffer, int i12);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i10);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i10);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i10);

    private native Bitmap nativeGetBitmap(long j10);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j10, int i10, int i11);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j10);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j10, int i10);

    private native void nativeInvokePlatformMessageResponseCallback(long j10, int i10, ByteBuffer byteBuffer, int i11);

    private native void nativeLoadDartDeferredLibrary(long j10, int i10, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j10);

    private native void nativeMarkTextureFrameAvailable(long j10, long j11);

    private native void nativeNotifyLowMemoryWarning(long j10);

    private native void nativeOnVsync(long j10, long j11, long j12);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterTexture(long j10, long j11, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j10, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeSetAccessibilityFeatures(long j10, int i10);

    private native void nativeSetSemanticsEnabled(long j10, boolean z10);

    private native void nativeSetViewportMetrics(long j10, float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j10, String str, String str2, String str3, List<String> list);

    private native void nativeSurfaceChanged(long j10, int i10, int i11);

    private native void nativeSurfaceCreated(long j10, Surface surface);

    private native void nativeSurfaceDestroyed(long j10);

    private native void nativeSurfaceWindowChanged(long j10, Surface surface);

    private native void nativeUnregisterTexture(long j10, long j11);

    private native void nativeUpdateJavaAssetManager(long j10, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f10);

    private void onPreEngineRestart() {
        for (a.b bVar : this.engineLifecycleListeners) {
            bVar.a();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            AccessibilityBridge.a aVar2 = (AccessibilityBridge.a) aVar;
            aVar2.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
            accessibilityBridge.getClass();
            while (byteBuffer.hasRemaining()) {
                AccessibilityBridge.e b10 = accessibilityBridge.b(byteBuffer.getInt());
                b10.c = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                String str2 = null;
                if (i10 == -1) {
                    str = null;
                } else {
                    str = strArr[i10];
                }
                b10.f18869d = str;
                int i11 = byteBuffer.getInt();
                if (i11 != -1) {
                    str2 = strArr[i11];
                }
                b10.f18870e = str2;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            ((AccessibilityBridge.a) aVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public void addEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(ef.a aVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(aVar);
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j10) {
        nativeCleanupMessageData(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
        if (r4.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0148, code lost:
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
        if (r4.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0167, code lost:
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016a, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0196, code lost:
        r10 = r3;
     */
    /* JADX WARN: Incorrect condition in loop: B:41:0x010d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        jVar.getClass();
        throw null;
    }

    public void deferredComponentInstallFailure(int i10, String str, boolean z10) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i10, str, z10);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray<PlatformOverlayView> sparseArray = jVar.f18822l;
                if (i10 < sparseArray.size()) {
                    PlatformOverlayView valueAt = sparseArray.valueAt(i10);
                    valueAt.b();
                    valueAt.f18573a.close();
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i10);
        }
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i10, int i11) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i10, i11);
        }
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i10);
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i10, action, null);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i10, long j10) {
        c.d dVar;
        boolean z10;
        d dVar2 = this.platformMessageHandler;
        if (dVar2 != null) {
            we.c cVar = (we.c) dVar2;
            synchronized (cVar.f31193d) {
                dVar = (c.d) cVar.f31192b.get(str);
                if (cVar.f31194e.get() && dVar == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (!cVar.c.containsKey(str)) {
                        cVar.c.put(str, new LinkedList());
                    }
                    ((List) cVar.c.get(str)).add(new c.a(j10, byteBuffer, i10));
                }
            }
            if (!z10) {
                cVar.c(i10, j10, dVar, str, byteBuffer);
                return;
            }
            return;
        }
        nativeCleanupMessageData(j10);
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j10) {
        nativeInit(context, strArr, str, str2, str3, j10);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i10) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i10);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i10, ByteBuffer byteBuffer, int i11) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i10, byteBuffer, i11);
                }
                return;
            } finally {
                this.shellHolderLock.readLock().unlock();
            }
        }
        throw new IllegalArgumentException("Expected a direct ByteBuffer.");
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int i10) {
        return nativeFlutterTextUtilsIsEmoji(i10);
    }

    public boolean isCodePointEmojiModifier(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifier(i10);
    }

    public boolean isCodePointEmojiModifierBase(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i10);
    }

    public boolean isCodePointRegionalIndicator(int i10) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i10);
    }

    public boolean isCodePointVariantSelector(int i10) {
        return nativeFlutterTextUtilsIsVariationSelector(i10);
    }

    public void loadDartDeferredLibrary(int i10, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i10, strArr);
    }

    public void loadLibrary() {
        System.loadLibrary("flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j10);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.f18825o.clear();
            jVar.f18826p.clear();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i10, int i11, int i12, int i13, int i14) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            SparseArray<PlatformOverlayView> sparseArray = jVar.f18822l;
            if (sparseArray.get(i10) != null) {
                if (!jVar.f18824n) {
                    PlatformOverlayView platformOverlayView = sparseArray.get(i10);
                    platformOverlayView.getParent().getClass();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
                    layoutParams.leftMargin = i11;
                    layoutParams.topMargin = i12;
                    platformOverlayView.setLayoutParams(layoutParams);
                    platformOverlayView.setVisibility(0);
                    platformOverlayView.bringToFront();
                    jVar.f18825o.add(Integer.valueOf(i10));
                    return;
                }
                throw null;
            }
            throw new IllegalStateException(a0.a.g("The overlay surface (id:", i10, ") doesn't exist"));
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(final int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        final j jVar = this.platformViewsController;
        if (jVar != null) {
            if (!jVar.f18824n) {
                SparseArray<io.flutter.plugin.platform.e> sparseArray = jVar.f18820j;
                io.flutter.plugin.platform.e eVar = sparseArray.get(i10);
                if (eVar != null) {
                    SparseArray<FlutterMutatorView> sparseArray2 = jVar.f18821k;
                    if (sparseArray2.get(i10) != null) {
                        FlutterMutatorView flutterMutatorView = sparseArray2.get(i10);
                        flutterMutatorView.f18643a = flutterMutatorsStack;
                        flutterMutatorView.c = i11;
                        flutterMutatorView.f18645d = i12;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
                        layoutParams.leftMargin = i11;
                        layoutParams.topMargin = i12;
                        flutterMutatorView.setLayoutParams(layoutParams);
                        flutterMutatorView.setWillNotDraw(false);
                        flutterMutatorView.setVisibility(0);
                        flutterMutatorView.bringToFront();
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i15, i16);
                        View view = sparseArray.get(i10).getView();
                        if (view != null) {
                            view.setLayoutParams(layoutParams2);
                            view.bringToFront();
                        }
                        jVar.f18826p.add(Integer.valueOf(i10));
                        return;
                    }
                    View view2 = eVar.getView();
                    if (view2 != null) {
                        if (view2.getParent() != null) {
                            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                        }
                        Context context = jVar.c;
                        FlutterMutatorView flutterMutatorView2 = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, jVar.f18813b);
                        flutterMutatorView2.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.i
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view3, boolean z10) {
                                j jVar2 = j.this;
                                int i17 = i10;
                                if (z10) {
                                    gf.h hVar = jVar2.f18816f.f18679a;
                                    if (hVar != null) {
                                        hVar.a(Integer.valueOf(i17), "viewFocused");
                                        return;
                                    }
                                    return;
                                }
                                TextInputPlugin textInputPlugin = jVar2.f18815e;
                                if (textInputPlugin != null) {
                                    textInputPlugin.b(i17);
                                }
                            }
                        });
                        sparseArray2.put(i10, flutterMutatorView2);
                        view2.setImportantForAccessibility(4);
                        flutterMutatorView2.addView(view2);
                        throw null;
                    }
                    throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                }
                throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
            }
            throw null;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray<PlatformOverlayView> sparseArray = jVar.f18822l;
                if (i10 < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i10);
                    PlatformOverlayView valueAt = sparseArray.valueAt(i10);
                    if (!jVar.f18825o.contains(Integer.valueOf(keyAt))) {
                        valueAt.b();
                        valueAt.setVisibility(8);
                        i10++;
                    } else {
                        throw null;
                    }
                } else {
                    int i11 = 0;
                    while (true) {
                        SparseArray<FlutterMutatorView> sparseArray2 = jVar.f18821k;
                        if (i11 < sparseArray2.size()) {
                            int keyAt2 = sparseArray2.keyAt(i11);
                            FlutterMutatorView flutterMutatorView = sparseArray2.get(keyAt2);
                            if (jVar.f18826p.contains(Integer.valueOf(keyAt2)) && !jVar.f18824n) {
                                flutterMutatorView.setVisibility(0);
                            } else {
                                flutterMutatorView.setVisibility(8);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (ef.a aVar : this.flutterUiDisplayListeners) {
            aVar.b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (ef.a aVar : this.flutterUiDisplayListeners) {
            aVar.a();
        }
    }

    public void onSurfaceChanged(int i10, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i10, i11);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j10, long j11, long j12) {
        nativeOnVsync(j10, j11, j12);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerTexture(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(ef.a aVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(aVar);
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i10);
    }

    public void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public void setDeferredComponentManager(xe.a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(hf.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(d dVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = dVar;
    }

    public void setPlatformViewsController(j jVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = jVar;
    }

    public void setRefreshRateFPS(float f10) {
        refreshRateFPS = f10;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z10);
    }

    public void setViewportMetrics(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f10, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        boolean z10;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l10 = nativeSpawn.nativeShellHolderId;
        if (l10 != null && l10.longValue() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void unregisterTexture(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j10);
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateRefreshRate(refreshRateFPS);
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i11;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = gf.j.f17801a.a(obj);
            i11 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i11 = 0;
        }
        dispatchSemanticsAction(i10, action.value, byteBuffer, i11);
    }

    public void dispatchSemanticsAction(int i10, int i11, ByteBuffer byteBuffer, int i12) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i10, i11, byteBuffer, i12);
    }

    public void requestDartDeferredLibrary(int i10) {
    }
}
