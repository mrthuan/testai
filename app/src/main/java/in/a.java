package in;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: RawVideoPlayer.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f18557a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f18558b;
    public final TextureView c;

    /* renamed from: d  reason: collision with root package name */
    public int f18559d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18560e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18561f = false;

    /* compiled from: RawVideoPlayer.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f18563a;

        public b(SurfaceTexture surfaceTexture) {
            this.f18563a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SurfaceTexture surfaceTexture = this.f18563a;
            if (surfaceTexture != null) {
                a aVar = a.this;
                if (aVar.f18561f) {
                    try {
                        aVar.f18557a = new MediaPlayer();
                        MediaPlayer mediaPlayer = aVar.f18557a;
                        Context context = aVar.f18558b;
                        mediaPlayer.setDataSource(context, Uri.parse(ea.a.p("Lm5VchZpUy4oZTlvAHILZQ8vLw==", "KgtORzFC") + aVar.f18558b.getPackageName() + ea.a.p("Lw==", "z1EZ8JhD") + aVar.f18559d));
                        aVar.f18557a.setSurface(new Surface(surfaceTexture));
                        aVar.f18557a.setLooping(true);
                        aVar.f18557a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: in.b
                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public final void onPrepared(MediaPlayer mediaPlayer2) {
                                a aVar2 = a.this;
                                aVar2.f18560e = true;
                                aVar2.f18557a.start();
                            }
                        });
                        aVar.f18557a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: in.c
                            @Override // android.media.MediaPlayer.OnCompletionListener
                            public final void onCompletion(MediaPlayer mediaPlayer2) {
                                a.this.getClass();
                            }
                        });
                        aVar.f18557a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: in.d
                            @Override // android.media.MediaPlayer.OnErrorListener
                            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                                a.this.getClass();
                                return true;
                            }
                        });
                        aVar.f18557a.prepareAsync();
                    } catch (Exception unused) {
                        aVar.getClass();
                    }
                }
            }
        }
    }

    public a(Context context, TextureView textureView) {
        this.f18558b = context;
        this.c = textureView;
        textureView.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC0250a());
    }

    public final void a(SurfaceTexture surfaceTexture) {
        MediaPlayer mediaPlayer = this.f18557a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
                this.f18557a = null;
            } catch (Exception unused) {
            }
            this.f18560e = false;
        }
        w0.a().c.execute(new b(surfaceTexture));
    }

    /* compiled from: RawVideoPlayer.java */
    /* renamed from: in.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class TextureView$SurfaceTextureListenerC0250a implements TextureView.SurfaceTextureListener {
        public TextureView$SurfaceTextureListenerC0250a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            a aVar = a.this;
            aVar.f18561f = true;
            if (aVar.f18559d != 0) {
                aVar.a(surfaceTexture);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            a aVar = a.this;
            aVar.f18561f = false;
            MediaPlayer mediaPlayer = aVar.f18557a;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.release();
                    aVar.f18557a = null;
                } catch (Exception unused) {
                }
                aVar.f18560e = false;
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }
    }
}
