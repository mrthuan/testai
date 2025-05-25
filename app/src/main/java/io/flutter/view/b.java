package io.flutter.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityEvent;
import gf.c;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.j;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FlutterNativeView.java */
@Deprecated
/* loaded from: classes.dex */
public final class b implements gf.c {

    /* renamed from: a  reason: collision with root package name */
    public final ue.a f18938a;

    /* renamed from: b  reason: collision with root package name */
    public final we.a f18939b;
    public FlutterView c;

    /* renamed from: d  reason: collision with root package name */
    public final FlutterJNI f18940d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f18941e;

    /* compiled from: FlutterNativeView.java */
    /* renamed from: io.flutter.view.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0255b implements a.b {
        public C0255b() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public final void a() {
            AccessibilityBridge accessibilityBridge;
            b bVar = b.this;
            FlutterView flutterView = bVar.c;
            if (flutterView != null && (accessibilityBridge = flutterView.f18913h) != null) {
                accessibilityBridge.f18839g.clear();
                AccessibilityBridge.h hVar = accessibilityBridge.f18841i;
                if (hVar != null) {
                    accessibilityBridge.g(hVar.f18873b, 65536);
                }
                accessibilityBridge.f18841i = null;
                accessibilityBridge.f18847o = null;
                AccessibilityEvent d10 = accessibilityBridge.d(0, 2048);
                d10.setContentChangeTypes(1);
                accessibilityBridge.h(d10);
            }
            ue.a aVar = bVar.f18938a;
            if (aVar == null) {
                return;
            }
            while (true) {
                j jVar = aVar.c;
                SparseArray<io.flutter.plugin.platform.e> sparseArray = jVar.f18820j;
                if (sparseArray.size() > 0) {
                    jVar.f18828r.b(sparseArray.keyAt(0));
                } else {
                    return;
                }
            }
        }
    }

    public b(Context context) {
        a aVar = new a();
        this.f18941e = context;
        this.f18938a = new ue.a(context);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f18940d = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        we.a aVar2 = new we.a(flutterJNI, context.getAssets());
        this.f18939b = aVar2;
        flutterJNI.addEngineLifecycleListener(new C0255b());
        flutterJNI.attachToNative();
        flutterJNI.setPlatformMessageHandler(aVar2.c);
        if (flutterJNI.isAttached()) {
            return;
        }
        throw new AssertionError("Platform view is not attached");
    }

    @Override // gf.c
    public final void a(String str, ByteBuffer byteBuffer, c.b bVar) {
        if (!this.f18940d.isAttached()) {
            return;
        }
        this.f18939b.f31180d.a(str, byteBuffer, bVar);
    }

    @Override // gf.c
    public final c.InterfaceC0236c b() {
        return c(new c.d());
    }

    public final c.InterfaceC0236c c(c.d dVar) {
        return this.f18939b.f31180d.c(dVar);
    }

    @Override // gf.c
    public final void d(String str, c.a aVar, c.InterfaceC0236c interfaceC0236c) {
        this.f18939b.f31180d.d(str, aVar, interfaceC0236c);
    }

    @Override // gf.c
    public final void f(String str, c.a aVar) {
        this.f18939b.f31180d.f(str, aVar);
    }

    /* compiled from: FlutterNativeView.java */
    /* loaded from: classes.dex */
    public class a implements ef.a {
        public a() {
        }

        @Override // ef.a
        public final void b() {
            FlutterView flutterView = b.this.c;
            if (flutterView == null) {
                return;
            }
            Iterator it = new ArrayList(flutterView.f18915j).iterator();
            while (it.hasNext()) {
                ((FlutterView.b) it.next()).a();
            }
        }

        @Override // ef.a
        public final void a() {
        }
    }
}
