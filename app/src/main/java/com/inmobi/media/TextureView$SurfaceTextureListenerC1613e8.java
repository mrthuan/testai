package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: com.inmobi.media.e8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureView$SurfaceTextureListenerC1613e8 implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1627f8 f15027a;

    public TextureView$SurfaceTextureListenerC1613e8(C1627f8 c1627f8) {
        this.f15027a = c1627f8;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture texture, int i10, int i11) {
        kotlin.jvm.internal.g.e(texture, "texture");
        this.f15027a.c = new Surface(texture);
        this.f15027a.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture texture) {
        kotlin.jvm.internal.g.e(texture, "texture");
        Surface surface = this.f15027a.c;
        if (surface != null) {
            surface.release();
        }
        C1627f8 c1627f8 = this.f15027a;
        c1627f8.c = null;
        Y7 y72 = c1627f8.f15063o;
        if (y72 != null) {
            y72.c();
        }
        this.f15027a.g();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        boolean z10;
        A7 a72;
        kotlin.jvm.internal.g.e(surface, "surface");
        A7 mediaPlayer = this.f15027a.getMediaPlayer();
        boolean z11 = true;
        if (mediaPlayer != null && mediaPlayer.f14129b == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 <= 0 || i11 <= 0) {
            z11 = false;
        }
        if (z10 && z11) {
            Object tag = this.f15027a.getTag();
            if (tag instanceof W7) {
                Object obj = ((W7) tag).f14804t.get("seekPosition");
                kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                if (intValue != 0) {
                    C1627f8 c1627f8 = this.f15027a;
                    if (c1627f8.a() && (a72 = c1627f8.f15052d) != null) {
                        a72.seekTo(intValue);
                    }
                }
            }
            this.f15027a.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture texture) {
        kotlin.jvm.internal.g.e(texture, "texture");
    }
}
