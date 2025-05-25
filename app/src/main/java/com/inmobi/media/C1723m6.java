package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import com.inmobi.media.C1723m6;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.m6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1723m6 extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final A4 f15306a;

    /* renamed from: b  reason: collision with root package name */
    public C1695k6 f15307b;
    public ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public InterfaceC1709l6 f15308d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15309e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference f15310f;

    /* renamed from: g  reason: collision with root package name */
    public int f15311g;

    /* renamed from: h  reason: collision with root package name */
    public String f15312h;

    /* renamed from: i  reason: collision with root package name */
    public String f15313i;

    /* renamed from: j  reason: collision with root package name */
    public int f15314j;

    /* renamed from: k  reason: collision with root package name */
    public int f15315k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1723m6(Activity activity, A4 a42) {
        super(activity);
        kotlin.jvm.internal.g.e(activity, "activity");
        this.f15306a = a42;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f15311g = 100;
        this.f15314j = -1;
        this.f15315k = 0;
        this.f15310f = new WeakReference(activity);
        Ha.a(activity, this);
    }

    public static final void a(C1723m6 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 a42 = this$0.f15306a;
        if (a42 != null) {
            ((B4) a42).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (this$0.f15307b == null) {
            C1695k6 c1695k6 = new C1695k6(this$0.getContext());
            this$0.f15307b = c1695k6;
            c1695k6.setAnchorView(this$0);
            this$0.setMediaController(this$0.f15307b);
            this$0.requestLayout();
            this$0.requestFocus();
        }
    }

    public final void b() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        A4 a42 = this.f15306a;
        if (a42 != null) {
            ((B4) a42).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup4 = this.c;
        if (viewGroup4 != null) {
            ViewParent parent = viewGroup4.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.c);
            }
            ViewParent parent2 = getParent();
            if (parent2 instanceof ViewGroup) {
                viewGroup3 = (ViewGroup) parent2;
            } else {
                viewGroup3 = null;
            }
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.c = null;
        }
        setMediaController(null);
        this.f15307b = null;
        InterfaceC1709l6 interfaceC1709l6 = this.f15308d;
        if (interfaceC1709l6 != null) {
            A4 a43 = ((C1865x6) interfaceC1709l6).f15634a.f15679b;
            if (a43 != null) {
                ((B4) a43).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                if (parent3 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent3;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.f15311g;
    }

    @Override // android.view.View
    public final String getId() {
        return this.f15312h;
    }

    public final InterfaceC1709l6 getListener() {
        return this.f15308d;
    }

    public final int getMCurrentPosition() {
        return this.f15315k;
    }

    public final String getPlaybackUrl() {
        return this.f15313i;
    }

    public final int getPreviousPosition() {
        return this.f15314j;
    }

    public final ViewGroup getViewContainer() {
        return this.c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        if (this.f15310f.get() != null && kotlin.jvm.internal.g.a(this.f15310f.get(), activity)) {
            this.f15309e = false;
            start();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        Activity activity2 = (Activity) this.f15310f.get();
        if (activity2 != null && kotlin.jvm.internal.g.a(activity2, activity)) {
            this.f15309e = true;
            if (getCurrentPosition() != 0) {
                this.f15315k = getCurrentPosition();
            }
            pause();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp2) {
        kotlin.jvm.internal.g.e(mp2, "mp");
        A4 a42 = this.f15306a;
        if (a42 != null) {
            ((B4) a42).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp2, int i10, int i11) {
        kotlin.jvm.internal.g.e(mp2, "mp");
        A4 a42 = this.f15306a;
        if (a42 != null) {
            ((B4) a42).b("MediaRenderView", ">>> onError (" + i10 + ", " + i11 + ')');
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp2) {
        A4 a42;
        kotlin.jvm.internal.g.e(mp2, "mp");
        A4 a43 = this.f15306a;
        if (a43 != null) {
            ((B4) a43).a("MediaRenderView", ">>> onPrepared");
        }
        mp2.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: qb.x0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                C1723m6.a(C1723m6.this, mediaPlayer, i10, i11);
            }
        });
        int i10 = this.f15315k;
        if (i10 < getDuration()) {
            this.f15315k = i10;
            seekTo(i10);
        }
        InterfaceC1709l6 interfaceC1709l6 = this.f15308d;
        if (interfaceC1709l6 != null && (a42 = ((C1865x6) interfaceC1709l6).f15634a.f15679b) != null) {
            ((B4) a42).a("MraidMediaProcessor", ">>> onPlayerPrepared");
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Context d10;
        kotlin.jvm.internal.g.e(view, "view");
        super.onVisibilityChanged(view, i10);
        A4 a42 = this.f15306a;
        if (a42 != null) {
            ((B4) a42).a("MediaRenderView", ">>> onVisibilityChanged (" + i10 + ')');
        }
        if (i10 == 0 && (d10 = Ha.d()) != null) {
            setBackground(new BitmapDrawable(d10.getResources(), (Bitmap) null));
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        A4 a42 = this.f15306a;
        if (a42 != null) {
            ((B4) a42).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i10 + ')');
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        A4 a42 = this.f15306a;
        if (a42 != null) {
            ((B4) a42).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setCurrentAudioVolume(int i10) {
        this.f15311g = i10;
    }

    public final void setId(String str) {
        this.f15312h = str;
    }

    public final void setListener(InterfaceC1709l6 interfaceC1709l6) {
        this.f15308d = interfaceC1709l6;
    }

    public final void setMCurrentPosition(int i10) {
        this.f15315k = i10;
    }

    public final void setPlaybackData(String url) {
        String str;
        kotlin.jvm.internal.g.e(url, "url");
        byte[] bytes = url.getBytes(kotlin.text.a.f19966b);
        kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if (((byte) (b10 & Byte.MIN_VALUE)) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[(byte) (b10 & 15)]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            String sb3 = sb2.toString();
            kotlin.jvm.internal.g.d(sb3, "toString(...)");
            byte[] bytes2 = sb3.getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
            str = new String(bytes2, kotlin.text.a.c);
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.f15313i = str;
        this.f15312h = "anonymous";
    }

    public final void setPlaybackUrl(String str) {
        this.f15313i = str;
    }

    public final void setPreviousPosition(int i10) {
        this.f15314j = i10;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f15309e) {
            return;
        }
        A4 a42 = this.f15306a;
        if (a42 != null) {
            ((B4) a42).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void a() {
        setVideoPath(this.f15313i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f15307b == null) {
            C1695k6 c1695k6 = new C1695k6(getContext());
            this.f15307b = c1695k6;
            c1695k6.setAnchorView(this);
            setMediaController(this.f15307b);
        }
    }

    public final void setAudioMuted(boolean z10) {
    }

    public final void setPlayerPrepared(boolean z10) {
    }
}
