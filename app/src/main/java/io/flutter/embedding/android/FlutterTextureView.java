package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes.dex */
public class FlutterTextureView extends TextureView implements ef.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f18585a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18586b;
    public Surface c;

    public FlutterTextureView(Context context) {
        this(context, null);
    }

    public final void a() {
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }

    public FlutterRenderer getAttachedRenderer() {
        return null;
    }

    public void setRenderSurface(Surface surface) {
        this.c = surface;
    }

    public FlutterTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18585a = false;
        this.f18586b = false;
        setSurfaceTextureListener(new a());
    }

    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            FlutterTextureView flutterTextureView = FlutterTextureView.this;
            flutterTextureView.getClass();
            if (flutterTextureView.f18585a) {
                flutterTextureView.a();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            FlutterTextureView flutterTextureView = FlutterTextureView.this;
            flutterTextureView.getClass();
            if (!flutterTextureView.f18585a) {
                Surface surface = flutterTextureView.c;
                if (surface != null) {
                    surface.release();
                    flutterTextureView.c = null;
                    return true;
                }
                return true;
            }
            flutterTextureView.getClass();
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            FlutterTextureView flutterTextureView = FlutterTextureView.this;
            if (!flutterTextureView.f18585a) {
                return;
            }
            flutterTextureView.getClass();
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
