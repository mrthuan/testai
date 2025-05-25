package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* compiled from: VsyncWaiter.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static e f18945e;

    /* renamed from: f  reason: collision with root package name */
    public static b f18946f;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f18948b;

    /* renamed from: a  reason: collision with root package name */
    public long f18947a = -1;
    public c c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    public final a f18949d = new a();

    /* compiled from: VsyncWaiter.java */
    /* loaded from: classes.dex */
    public class a implements FlutterJNI.b {
        public a() {
        }
    }

    /* compiled from: VsyncWaiter.java */
    /* loaded from: classes.dex */
    public class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public long f18953a;

        public c(long j10) {
            this.f18953a = j10;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            long j11;
            long nanoTime = System.nanoTime() - j10;
            if (nanoTime < 0) {
                j11 = 0;
            } else {
                j11 = nanoTime;
            }
            e eVar = e.this;
            eVar.f18948b.onVsync(j11, eVar.f18947a, this.f18953a);
            eVar.c = this;
        }
    }

    public e(FlutterJNI flutterJNI) {
        this.f18948b = flutterJNI;
    }

    @TargetApi(17)
    public static e a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f18945e == null) {
            f18945e = new e(flutterJNI);
        }
        if (f18946f == null) {
            e eVar = f18945e;
            Objects.requireNonNull(eVar);
            b bVar = new b(displayManager);
            f18946f = bVar;
            displayManager.registerDisplayListener(bVar, null);
        }
        if (f18945e.f18947a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f18945e.f18947a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f18945e;
    }

    /* compiled from: VsyncWaiter.java */
    @TargetApi(17)
    /* loaded from: classes.dex */
    public class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayManager f18951a;

        public b(DisplayManager displayManager) {
            this.f18951a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            if (i10 == 0) {
                float refreshRate = this.f18951a.getDisplay(0).getRefreshRate();
                e eVar = e.this;
                eVar.f18947a = (long) (1.0E9d / refreshRate);
                eVar.f18948b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }
}
