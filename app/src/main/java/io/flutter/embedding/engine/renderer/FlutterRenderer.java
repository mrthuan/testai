package io.flutter.embedding.engine.renderer;

import android.graphics.Rect;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class FlutterRenderer implements d {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f18652a;

    /* renamed from: b  reason: collision with root package name */
    public Surface f18653b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final a f18654d;

    /* loaded from: classes.dex */
    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        
        public final int encodedValue;

        DisplayFeatureState(int i10) {
            this.encodedValue = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        
        public final int encodedValue;

        DisplayFeatureType(int i10) {
            this.encodedValue = i10;
        }
    }

    /* loaded from: classes.dex */
    public class a implements ef.a {
        public a() {
        }

        @Override // ef.a
        public final void a() {
            FlutterRenderer.this.c = false;
        }

        @Override // ef.a
        public final void b() {
            FlutterRenderer.this.c = true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
        }

        public b(Rect rect, DisplayFeatureType displayFeatureType) {
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public int f18658a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f18659b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f18660d = 0;

        public c() {
            new ArrayList();
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.c = false;
        new Handler();
        new HashSet();
        a aVar = new a();
        this.f18654d = aVar;
        this.f18652a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public final void a() {
        this.f18652a.onSurfaceDestroyed();
        this.f18653b = null;
        if (this.c) {
            this.f18654d.a();
        }
        this.c = false;
    }
}
