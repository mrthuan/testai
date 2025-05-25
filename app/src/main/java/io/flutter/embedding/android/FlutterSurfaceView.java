package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes.dex */
public class FlutterSurfaceView extends SurfaceView implements ef.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f18581a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18582b;

    /* loaded from: classes.dex */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            FlutterSurfaceView flutterSurfaceView = FlutterSurfaceView.this;
            if (!flutterSurfaceView.f18582b) {
                return;
            }
            flutterSurfaceView.getClass();
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            FlutterSurfaceView flutterSurfaceView = FlutterSurfaceView.this;
            flutterSurfaceView.getClass();
            if (flutterSurfaceView.f18582b) {
                flutterSurfaceView.a();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            FlutterSurfaceView flutterSurfaceView = FlutterSurfaceView.this;
            flutterSurfaceView.getClass();
            if (!flutterSurfaceView.f18582b) {
                return;
            }
            flutterSurfaceView.getClass();
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
    }

    public FlutterSurfaceView(Context context) {
        this(context, null, 0);
    }

    public final void a() {
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], (getRight() + i10) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public FlutterRenderer getAttachedRenderer() {
        return null;
    }

    public FlutterSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlutterSurfaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f18581a = false;
        this.f18582b = false;
        a aVar = new a();
        new b();
        getHolder().addCallback(aVar);
        setAlpha(0.0f);
    }

    /* loaded from: classes.dex */
    public class b implements ef.a {
        public b() {
        }

        @Override // ef.a
        public final void b() {
            FlutterSurfaceView flutterSurfaceView = FlutterSurfaceView.this;
            flutterSurfaceView.setAlpha(1.0f);
            flutterSurfaceView.getClass();
        }

        @Override // ef.a
        public final void a() {
        }
    }
}
