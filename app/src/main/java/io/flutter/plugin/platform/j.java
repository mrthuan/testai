package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.v;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import gf.h;
import io.flutter.embedding.android.g;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PlatformViewsController.java */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    public io.flutter.embedding.android.a f18813b;
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public io.flutter.view.d f18814d;

    /* renamed from: e  reason: collision with root package name */
    public TextInputPlugin f18815e;

    /* renamed from: f  reason: collision with root package name */
    public PlatformViewsChannel f18816f;

    /* renamed from: q  reason: collision with root package name */
    public final io.flutter.embedding.android.g f18827q;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18824n = true;

    /* renamed from: r  reason: collision with root package name */
    public final a f18828r = new a();

    /* renamed from: a  reason: collision with root package name */
    public final v f18812a = new v(1);

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<Integer, k> f18818h = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final io.flutter.plugin.platform.a f18817g = new io.flutter.plugin.platform.a();

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<Context, View> f18819i = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray<PlatformOverlayView> f18822l = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    public final HashSet<Integer> f18825o = new HashSet<>();

    /* renamed from: p  reason: collision with root package name */
    public final HashSet<Integer> f18826p = new HashSet<>();

    /* renamed from: m  reason: collision with root package name */
    public final SparseArray<g> f18823m = new SparseArray<>();

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray<e> f18820j = new SparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray<FlutterMutatorView> f18821k = new SparseArray<>();

    /* compiled from: PlatformViewsController.java */
    /* loaded from: classes.dex */
    public class a implements PlatformViewsChannel.d {
        public a() {
        }

        public static void c(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            int i10 = platformViewCreationRequest.f18682b;
            boolean z10 = true;
            if (i10 != 0 && i10 != 1) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            throw new IllegalStateException(a6.h.g(androidx.appcompat.view.menu.d.e("Trying to create a view with unknown direction value: ", i10, "(view id: "), platformViewCreationRequest.f18681a, ")"));
        }

        @TargetApi(20)
        public final long a(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            c(platformViewCreationRequest);
            j jVar = j.this;
            SparseArray<g> sparseArray = jVar.f18823m;
            int i10 = platformViewCreationRequest.f18681a;
            if (sparseArray.get(i10) == null) {
                if (jVar.f18814d != null) {
                    throw new IllegalStateException(b.a.c("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i10));
                }
                throw new IllegalStateException(b.a.c("Texture registry is null. This means that platform views controller was detached, view id: ", i10));
            }
            throw new IllegalStateException(b.a.c("Trying to create an already created platform view, view id: ", i10));
        }

        public final void b(int i10) {
            FlutterMutatorView.a aVar;
            j jVar = j.this;
            e eVar = jVar.f18820j.get(i10);
            if (eVar == null) {
                return;
            }
            jVar.f18820j.remove(i10);
            try {
                eVar.dispose();
            } catch (RuntimeException unused) {
            }
            if (jVar.d(i10)) {
                HashMap<Integer, k> hashMap = jVar.f18818h;
                View a10 = hashMap.get(Integer.valueOf(i10)).a();
                if (a10 != null) {
                    jVar.f18819i.remove(a10.getContext());
                }
                hashMap.remove(Integer.valueOf(i10));
                return;
            }
            SparseArray<g> sparseArray = jVar.f18823m;
            g gVar = sparseArray.get(i10);
            if (gVar != null) {
                gVar.removeAllViews();
                gVar.c = null;
                Surface surface = gVar.f18809d;
                if (surface != null) {
                    surface.release();
                    gVar.f18809d = null;
                }
                if (gVar.getViewTreeObserver().isAlive()) {
                    gVar.getClass();
                }
                ViewGroup viewGroup = (ViewGroup) gVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(gVar);
                }
                sparseArray.remove(i10);
                return;
            }
            SparseArray<FlutterMutatorView> sparseArray2 = jVar.f18821k;
            FlutterMutatorView flutterMutatorView = sparseArray2.get(i10);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                ViewTreeObserver viewTreeObserver = flutterMutatorView.getViewTreeObserver();
                if (viewTreeObserver.isAlive() && (aVar = flutterMutatorView.f18649h) != null) {
                    flutterMutatorView.f18649h = null;
                    viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
                }
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                sparseArray2.remove(i10);
            }
        }

        public final void d(PlatformViewsChannel.c cVar) {
            View view;
            j jVar = j.this;
            float f10 = jVar.c.getResources().getDisplayMetrics().density;
            int i10 = cVar.f18687a;
            if (jVar.d(i10)) {
                jVar.c(f10, cVar, true);
                jVar.f18818h.get(Integer.valueOf(i10)).getClass();
                return;
            }
            e eVar = jVar.f18820j.get(i10);
            if (eVar == null || (view = eVar.getView()) == null) {
                return;
            }
            view.dispatchTouchEvent(jVar.c(f10, cVar, false));
        }

        public final void e(PlatformViewsChannel.b bVar, h5.a aVar) {
            j jVar = j.this;
            int round = (int) Math.round(bVar.f18686b * jVar.a());
            int round2 = (int) Math.round(bVar.c * jVar.a());
            int i10 = bVar.f18685a;
            if (jVar.d(i10)) {
                jVar.a();
                k kVar = jVar.f18818h.get(Integer.valueOf(i10));
                TextInputPlugin textInputPlugin = jVar.f18815e;
                if (textInputPlugin != null) {
                    textInputPlugin.d();
                    kVar.getClass();
                }
                kVar.a().isFocused();
                kVar.getClass();
                throw null;
            }
            e eVar = jVar.f18820j.get(i10);
            g gVar = jVar.f18823m.get(i10);
            if (eVar != null && gVar != null) {
                if (round > gVar.f18807a || round2 > gVar.f18808b) {
                    gVar.f18807a = round;
                    gVar.f18808b = round2;
                    SurfaceTexture surfaceTexture = gVar.c;
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(round, round2);
                    }
                }
                ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                layoutParams.width = round;
                layoutParams.height = round2;
                gVar.setLayoutParams(layoutParams);
                View view = eVar.getView();
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    layoutParams2.width = round;
                    layoutParams2.height = round2;
                    view.setLayoutParams(layoutParams2);
                }
                HashMap hashMap = new HashMap();
                hashMap.put(InMobiNetworkValues.WIDTH, Double.valueOf((int) Math.round(gVar.f18807a / jVar.a())));
                hashMap.put(InMobiNetworkValues.HEIGHT, Double.valueOf((int) Math.round(gVar.f18808b / jVar.a())));
                ((gf.g) ((h.c) aVar.f18008b)).c(hashMap);
            }
        }

        @TargetApi(17)
        public final void f(int i10, int i11) {
            View view;
            boolean z10 = true;
            if (i11 != 0 && i11 != 1) {
                z10 = false;
            }
            if (z10) {
                j jVar = j.this;
                if (jVar.d(i10)) {
                    view = jVar.f18818h.get(Integer.valueOf(i10)).a();
                } else {
                    e eVar = jVar.f18820j.get(i10);
                    if (eVar == null) {
                        return;
                    }
                    view = eVar.getView();
                }
                if (view == null) {
                    return;
                }
                view.setLayoutDirection(i11);
                return;
            }
            throw new IllegalStateException(androidx.activity.f.k("Trying to set unknown direction value: ", i11, "(view id: ", i10, ")"));
        }
    }

    public j() {
        if (io.flutter.embedding.android.g.c == null) {
            io.flutter.embedding.android.g.c = new io.flutter.embedding.android.g();
        }
        this.f18827q = io.flutter.embedding.android.g.c;
    }

    public final float a() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    public final View b(int i10) {
        if (d(i10)) {
            return this.f18818h.get(Integer.valueOf(i10)).a();
        }
        e eVar = this.f18820j.get(i10);
        if (eVar == null) {
            return null;
        }
        return eVar.getView();
    }

    public final MotionEvent c(float f10, PlatformViewsChannel.c cVar, boolean z10) {
        PriorityQueue<Long> priorityQueue;
        LongSparseArray<MotionEvent> longSparseArray;
        long j10;
        g.a aVar = new g.a(cVar.f18701p);
        while (true) {
            io.flutter.embedding.android.g gVar = this.f18827q;
            priorityQueue = gVar.f18633b;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = gVar.f18632a;
            j10 = aVar.f18635a;
            if (isEmpty || priorityQueue.peek().longValue() >= j10) {
                break;
            }
            longSparseArray.remove(priorityQueue.poll().longValue());
        }
        if (!priorityQueue.isEmpty() && priorityQueue.peek().longValue() == j10) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = longSparseArray.get(j10);
        longSparseArray.remove(j10);
        ArrayList arrayList = new ArrayList();
        for (List list : (List) cVar.f18691f) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list.get(1)).intValue();
            arrayList.add(pointerProperties);
        }
        int i10 = cVar.f18690e;
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) arrayList.toArray(new MotionEvent.PointerProperties[i10]);
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : (List) cVar.f18692g) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            pointerCoords.toolMajor = ((float) ((Double) list2.get(3)).doubleValue()) * f10;
            pointerCoords.toolMinor = ((float) ((Double) list2.get(4)).doubleValue()) * f10;
            pointerCoords.touchMajor = ((float) ((Double) list2.get(5)).doubleValue()) * f10;
            pointerCoords.touchMinor = ((float) ((Double) list2.get(6)).doubleValue()) * f10;
            pointerCoords.x = ((float) ((Double) list2.get(7)).doubleValue()) * f10;
            pointerCoords.y = ((float) ((Double) list2.get(8)).doubleValue()) * f10;
            arrayList2.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList2.toArray(new MotionEvent.PointerCoords[i10]);
        if (!z10 && motionEvent != null) {
            return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), cVar.f18689d, cVar.f18690e, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        }
        return MotionEvent.obtain(cVar.f18688b.longValue(), cVar.c.longValue(), cVar.f18689d, cVar.f18690e, pointerPropertiesArr, pointerCoordsArr, cVar.f18693h, cVar.f18694i, cVar.f18695j, cVar.f18696k, cVar.f18697l, cVar.f18698m, cVar.f18699n, cVar.f18700o);
    }

    public final boolean d(int i10) {
        return this.f18818h.containsKey(Integer.valueOf(i10));
    }
}
