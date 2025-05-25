package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import com.inmobi.media.C1627f8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* renamed from: com.inmobi.media.f8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1627f8 extends TextureView implements MediaController.MediaPlayerControl, Y6 {
    public static final String D = "f8";
    public final MediaPlayer.OnBufferingUpdateListener A;
    public final MediaPlayer.OnErrorListener B;
    public final TextureView$SurfaceTextureListenerC1613e8 C;

    /* renamed from: a  reason: collision with root package name */
    public Uri f15050a;

    /* renamed from: b  reason: collision with root package name */
    public Map f15051b;
    public Surface c;

    /* renamed from: d  reason: collision with root package name */
    public A7 f15052d;

    /* renamed from: e  reason: collision with root package name */
    public int f15053e;

    /* renamed from: f  reason: collision with root package name */
    public int f15054f;

    /* renamed from: g  reason: collision with root package name */
    public int f15055g;

    /* renamed from: h  reason: collision with root package name */
    public int f15056h;

    /* renamed from: i  reason: collision with root package name */
    public int f15057i;

    /* renamed from: j  reason: collision with root package name */
    public InterfaceC1571b8 f15058j;

    /* renamed from: k  reason: collision with root package name */
    public InterfaceC1557a8 f15059k;

    /* renamed from: l  reason: collision with root package name */
    public Z7 f15060l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15061m;

    /* renamed from: n  reason: collision with root package name */
    public HandlerC1585c8 f15062n;

    /* renamed from: o  reason: collision with root package name */
    public Y7 f15063o;

    /* renamed from: p  reason: collision with root package name */
    public int f15064p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15065q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15066r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15067s;

    /* renamed from: t  reason: collision with root package name */
    public Handler f15068t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15069u;

    /* renamed from: v  reason: collision with root package name */
    public final Z6 f15070v;

    /* renamed from: w  reason: collision with root package name */
    public MediaPlayer.OnVideoSizeChangedListener f15071w;

    /* renamed from: x  reason: collision with root package name */
    public final C1599d8 f15072x;

    /* renamed from: y  reason: collision with root package name */
    public final MediaPlayer.OnCompletionListener f15073y;

    /* renamed from: z  reason: collision with root package name */
    public final MediaPlayer.OnInfoListener f15074z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627f8(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
        this.f15057i = SlideAtom.USES_MASTER_SLIDE_ID;
        Context context2 = getContext();
        kotlin.jvm.internal.g.d(context2, "getContext(...)");
        this.f15070v = new Z6(context2, this);
        requestLayout();
        invalidate();
        this.f15071w = new MediaPlayer.OnVideoSizeChangedListener() { // from class: qb.n0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                C1627f8.c(C1627f8.this, mediaPlayer, i10, i11);
            }
        };
        this.f15072x = new C1599d8(this);
        this.f15073y = new MediaPlayer.OnCompletionListener() { // from class: qb.o0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C1627f8.a(C1627f8.this, mediaPlayer);
            }
        };
        this.f15074z = new MediaPlayer.OnInfoListener() { // from class: qb.p0
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
                return C1627f8.b(C1627f8.this, mediaPlayer, i10, i11);
            }
        };
        this.A = new MediaPlayer.OnBufferingUpdateListener() { // from class: qb.q0
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
                C1627f8.a(C1627f8.this, mediaPlayer, i10);
            }
        };
        this.B = new MediaPlayer.OnErrorListener() { // from class: qb.r0
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                return C1627f8.a(C1627f8.this, mediaPlayer, i10, i11);
            }
        };
        this.C = new TextureView$SurfaceTextureListenerC1613e8(this);
    }

    public static final void a(C1627f8 this$0, MediaPlayer mediaPlayer) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.d();
        } catch (Exception e10) {
            String TAG = D;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public static final boolean b(C1627f8 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (3 == i10) {
            this$0.a(8, 8);
            return true;
        }
        return true;
    }

    public static final void c(C1627f8 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15054f = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this$0.f15055g = videoHeight;
        if (this$0.f15054f == 0 || videoHeight == 0) {
            return;
        }
        this$0.requestLayout();
    }

    private final void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    private final void setVideoURI(Uri uri) {
        this.f15050a = uri;
        this.f15051b = null;
        e();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.f15065q;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f15066r;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f15067s;
    }

    public final void d() {
        A7 a72 = this.f15052d;
        if (a72 != null) {
            a72.f14128a = 5;
        }
        if (a72 != null) {
            a72.f14129b = 5;
        }
        Y7 y72 = this.f15063o;
        if (y72 != null) {
            y72.c();
        }
        HandlerC1585c8 handlerC1585c8 = this.f15062n;
        if (handlerC1585c8 != null) {
            handlerC1585c8.removeMessages(1);
        }
        Object tag = getTag();
        if (tag instanceof W7) {
            W7 w7 = (W7) tag;
            Object obj = w7.f14804t.get("didCompleteQ4");
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) obj).booleanValue()) {
                w7.f14804t.put("didCompleteQ4", Boolean.TRUE);
                InterfaceC1571b8 interfaceC1571b8 = this.f15058j;
                if (interfaceC1571b8 != null) {
                    ((C1814t7) interfaceC1571b8).a((byte) 3);
                }
            }
            w7.f14804t.put("didSignalVideoCompleted", Boolean.TRUE);
            HashMap hashMap = w7.f14804t;
            if (hashMap != null) {
                Boolean bool = Boolean.FALSE;
                hashMap.put("didCompleteQ1", bool);
                hashMap.put("didCompleteQ2", bool);
                hashMap.put("didCompleteQ3", bool);
                hashMap.put("didPause", bool);
                hashMap.put("didStartPlaying", bool);
                hashMap.put("didQ4Fire", bool);
            }
            if (w7.B) {
                start();
                return;
            }
            this.f15070v.a();
            Object obj2 = w7.f14804t.get("isFullScreen");
            kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj2).booleanValue()) {
                a(8, 0);
            }
        }
    }

    public final void e() {
        A7 a72;
        Y7 mediaController;
        W7 w7;
        byte b10;
        A7 a10;
        if (this.f15050a != null && this.c != null) {
            if (this.f15052d == null) {
                Object tag = getTag();
                if (tag instanceof W7) {
                    w7 = (W7) tag;
                } else {
                    w7 = null;
                }
                if (w7 != null) {
                    Object obj = w7.f14804t.get("placementType");
                    kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Byte");
                    b10 = ((Byte) obj).byteValue();
                } else {
                    b10 = 1;
                }
                if (1 == b10) {
                    a10 = new A7();
                } else {
                    Object obj2 = A7.f14125d;
                    a10 = AbstractC1892z7.a();
                }
                this.f15052d = a10;
                int i10 = this.f15053e;
                if (i10 != 0) {
                    a10.setAudioSessionId(i10);
                } else {
                    this.f15053e = a10.getAudioSessionId();
                }
                try {
                    A7 a73 = this.f15052d;
                    if (a73 != null) {
                        Context applicationContext = getContext().getApplicationContext();
                        Uri uri = this.f15050a;
                        kotlin.jvm.internal.g.b(uri);
                        a73.setDataSource(applicationContext, uri, this.f15051b);
                    }
                } catch (IOException unused) {
                    A7 a74 = this.f15052d;
                    if (a74 != null) {
                        a74.f14128a = -1;
                    }
                    if (a74 != null) {
                        a74.f14129b = -1;
                        return;
                    }
                    return;
                }
            }
            try {
                A7 a75 = this.f15052d;
                if (a75 != null) {
                    a75.setOnPreparedListener(this.f15072x);
                    a75.setOnVideoSizeChangedListener(this.f15071w);
                    a75.setOnCompletionListener(this.f15073y);
                    a75.setOnErrorListener(this.B);
                    a75.setOnInfoListener(this.f15074z);
                    a75.setOnBufferingUpdateListener(this.A);
                    a75.setSurface(this.c);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    A7 a76 = this.f15052d;
                    if (a76 != null) {
                        a76.setAudioAttributes(this.f15070v.f14910e);
                    }
                } else {
                    A7 a77 = this.f15052d;
                    if (a77 != null) {
                        a77.setAudioStreamType(3);
                    }
                }
                A7 a78 = this.f15052d;
                if (a78 != null) {
                    a78.prepareAsync();
                }
                this.f15064p = 0;
                A7 a79 = this.f15052d;
                if (a79 != null) {
                    a79.f14128a = 1;
                }
                if (a79 != null && (mediaController = getMediaController()) != null) {
                    mediaController.setMediaPlayer(this);
                    mediaController.setEnabled(a());
                    mediaController.d();
                }
                Object tag2 = getTag();
                if (tag2 instanceof W7) {
                    Object obj3 = ((W7) tag2).f14804t.get("shouldAutoPlay");
                    kotlin.jvm.internal.g.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) obj3).booleanValue() && (a72 = this.f15052d) != null) {
                        a72.f14129b = 3;
                    }
                    Object obj4 = ((W7) tag2).f14804t.get("didCompleteQ4");
                    kotlin.jvm.internal.g.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) obj4).booleanValue()) {
                        a(8, 0);
                        return;
                    }
                }
                a(0, 0);
            } catch (Exception e10) {
                A7 a710 = this.f15052d;
                if (a710 != null) {
                    a710.f14128a = -1;
                }
                if (a710 != null) {
                    a710.f14129b = -1;
                }
                this.B.onError(a710, 1, 0);
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        }
    }

    public final void f() {
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        g();
    }

    public final void g() {
        A7 a72;
        HandlerC1585c8 handlerC1585c8 = this.f15062n;
        if (handlerC1585c8 != null) {
            handlerC1585c8.removeMessages(1);
        }
        Z6 z62 = this.f15070v;
        z62.a();
        if (Build.VERSION.SDK_INT >= 26) {
            z62.f14911f = null;
        }
        z62.f14912g = null;
        Object tag = getTag();
        boolean z10 = tag instanceof W7;
        if (z10) {
            ((W7) tag).f14804t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
        }
        A7 a73 = this.f15052d;
        if (a73 != null) {
            a73.f14128a = 0;
        }
        if (a73 != null) {
            a73.f14129b = 0;
        }
        if (a73 != null) {
            a73.reset();
        }
        A7 a74 = this.f15052d;
        if (a74 != null) {
            a74.setOnPreparedListener(null);
            a74.setOnVideoSizeChangedListener(null);
            a74.setOnCompletionListener(null);
            a74.setOnErrorListener(null);
            a74.setOnInfoListener(null);
            a74.setOnBufferingUpdateListener(null);
        }
        if (z10) {
            Object obj = ((W7) tag).f14804t.get("placementType");
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Byte");
            if (((Byte) obj).byteValue() == 0 && (a72 = this.f15052d) != null) {
                a72.a();
            }
        } else {
            A7 a75 = this.f15052d;
            if (a75 != null) {
                a75.a();
            }
        }
        String TAG = D;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        this.f15052d = null;
    }

    public final Z6 getAudioFocusManager$media_release() {
        return this.f15070v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f15053e == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f15053e = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f15053e;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f15052d != null) {
            return this.f15064p;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        A7 a72 = this.f15052d;
        if (a72 != null && a()) {
            return a72.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        A7 a72 = this.f15052d;
        if (a72 != null && a()) {
            return a72.getDuration();
        }
        return -1;
    }

    public final int getLastVolume() {
        return this.f15057i;
    }

    public final MediaPlayer.OnVideoSizeChangedListener getMSizeChangedListener() {
        return this.f15071w;
    }

    public final Y7 getMediaController() {
        return this.f15063o;
    }

    public final A7 getMediaPlayer() {
        return this.f15052d;
    }

    public final boolean getPauseScheduled() {
        return this.f15069u;
    }

    public final InterfaceC1557a8 getPlaybackEventListener() {
        return this.f15059k;
    }

    public final InterfaceC1571b8 getQuartileCompletedListener() {
        return this.f15058j;
    }

    public final int getState() {
        A7 a72 = this.f15052d;
        if (a72 != null) {
            return a72.f14128a;
        }
        return 0;
    }

    public final int getVideoVolume() {
        if (isPlaying()) {
            return this.f15056h;
        }
        return -1;
    }

    public final int getVolume() {
        if (a()) {
            return this.f15056h;
        }
        return -1;
    }

    public final void h() {
        A7 a72 = this.f15052d;
        if (a72 != null) {
            this.f15056h = 0;
            a72.setVolume(0.0f, 0.0f);
            Object tag = getTag();
            if (tag instanceof W7) {
                ((W7) tag).f14804t.put("currentMediaVolume", 0);
            }
        }
    }

    public final void i() {
        A7 a72 = this.f15052d;
        if (a72 != null) {
            this.f15056h = 1;
            a72.setVolume(1.0f, 1.0f);
            Object tag = getTag();
            if (tag instanceof W7) {
                ((W7) tag).f14804t.put("currentMediaVolume", 15);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        A7 a72;
        if (a() && (a72 = this.f15052d) != null && a72.isPlaying()) {
            return true;
        }
        return false;
    }

    public final void j() {
        A7 a72;
        if (a() && (a72 = this.f15052d) != null && a72.isPlaying()) {
            A7 a73 = this.f15052d;
            if (a73 != null) {
                a73.pause();
            }
            A7 a74 = this.f15052d;
            if (a74 != null) {
                a74.seekTo(0);
            }
            this.f15070v.a();
            Object tag = getTag();
            if (tag instanceof W7) {
                W7 w7 = (W7) tag;
                HashMap hashMap = w7.f14804t;
                Boolean bool = Boolean.TRUE;
                hashMap.put("didPause", bool);
                w7.f14804t.put("seekPosition", 0);
                w7.f14804t.put("didCompleteQ4", bool);
            }
            A7 a75 = this.f15052d;
            if (a75 != null) {
                a75.f14128a = 4;
            }
            InterfaceC1557a8 interfaceC1557a8 = this.f15059k;
            if (interfaceC1557a8 != null) {
                ((C1827u7) interfaceC1557a8).a((byte) 4);
            }
        }
        A7 a76 = this.f15052d;
        if (a76 != null) {
            a76.f14129b = 4;
        }
    }

    public final void k() {
        if (this.f15052d != null) {
            if (isPlaying()) {
                this.f15070v.c();
            } else {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f15054f     // Catch: java.lang.Exception -> L79
            int r0 = android.view.View.getDefaultSize(r0, r6)     // Catch: java.lang.Exception -> L79
            int r1 = r5.f15055g     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.getDefaultSize(r1, r7)     // Catch: java.lang.Exception -> L79
            int r2 = r5.f15054f     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r2 = r5.f15055g     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch: java.lang.Exception -> L79
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch: java.lang.Exception -> L79
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch: java.lang.Exception -> L79
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3b
            if (r1 != r2) goto L3b
            int r0 = r5.f15054f     // Catch: java.lang.Exception -> L79
            int r1 = r0 * r7
            int r2 = r5.f15055g     // Catch: java.lang.Exception -> L79
            int r3 = r6 * r2
            if (r1 >= r3) goto L36
            int r3 = r3 / r0
            goto L73
        L36:
            if (r1 <= r3) goto L59
            int r0 = r1 / r2
            goto L5c
        L3b:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L4d
            int r0 = r5.f15055g     // Catch: java.lang.Exception -> L79
            int r0 = r0 * r6
            int r2 = r5.f15054f     // Catch: java.lang.Exception -> L79
            int r0 = r0 / r2
            if (r1 != r3) goto L4a
            if (r0 <= r7) goto L4a
            goto L59
        L4a:
            r1 = r0
        L4b:
            r0 = r6
            goto L75
        L4d:
            if (r1 != r2) goto L5e
            int r1 = r5.f15054f     // Catch: java.lang.Exception -> L79
            int r1 = r1 * r7
            int r2 = r5.f15055g     // Catch: java.lang.Exception -> L79
            int r1 = r1 / r2
            if (r0 != r3) goto L5b
            if (r1 <= r6) goto L5b
        L59:
            r1 = r7
            goto L4b
        L5b:
            r0 = r1
        L5c:
            r1 = r7
            goto L75
        L5e:
            int r2 = r5.f15054f     // Catch: java.lang.Exception -> L79
            int r4 = r5.f15055g     // Catch: java.lang.Exception -> L79
            if (r1 != r3) goto L6a
            if (r4 <= r7) goto L6a
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6c
        L6a:
            r1 = r2
            r7 = r4
        L6c:
            if (r0 != r3) goto L5b
            if (r1 <= r6) goto L5b
            int r4 = r4 * r6
            int r3 = r4 / r2
        L73:
            r1 = r3
            goto L4b
        L75:
            r5.setMeasuredDimension(r0, r1)     // Catch: java.lang.Exception -> L79
            goto L80
        L79:
            java.lang.String r6 = com.inmobi.media.C1627f8.D
            java.lang.String r7 = "TAG"
            kotlin.jvm.internal.g.d(r6, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1627f8.onMeasure(int, int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        A7 a72;
        if (a() && (a72 = this.f15052d) != null && a72.isPlaying()) {
            A7 a73 = this.f15052d;
            if (a73 != null) {
                a73.pause();
            }
            A7 a74 = this.f15052d;
            if (a74 != null) {
                a74.f14128a = 4;
            }
            this.f15070v.a();
            Object tag = getTag();
            if (tag instanceof W7) {
                W7 w7 = (W7) tag;
                w7.f14804t.put("didPause", Boolean.TRUE);
                w7.f14804t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            InterfaceC1557a8 interfaceC1557a8 = this.f15059k;
            if (interfaceC1557a8 != null) {
                ((C1827u7) interfaceC1557a8).a((byte) 2);
            }
        }
        A7 a75 = this.f15052d;
        if (a75 != null) {
            a75.f14129b = 4;
        }
        this.f15069u = false;
    }

    public final void setIsLockScreen(boolean z10) {
        this.f15061m = z10;
    }

    public final void setLastVolume(int i10) {
        this.f15057i = i10;
    }

    public final void setMSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        kotlin.jvm.internal.g.e(onVideoSizeChangedListener, "<set-?>");
        this.f15071w = onVideoSizeChangedListener;
    }

    public final void setMediaController(Y7 y72) {
        Y7 mediaController;
        if (y72 != null) {
            this.f15063o = y72;
            if (this.f15052d != null && (mediaController = getMediaController()) != null) {
                mediaController.setMediaPlayer(this);
                mediaController.setEnabled(a());
                mediaController.d();
            }
        }
    }

    public final void setMediaErrorListener(Z7 z72) {
        this.f15060l = z72;
    }

    public final void setPlaybackEventListener(InterfaceC1557a8 interfaceC1557a8) {
        this.f15059k = interfaceC1557a8;
    }

    public final void setQuartileCompletedListener(InterfaceC1571b8 interfaceC1571b8) {
        this.f15058j = interfaceC1571b8;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.MediaController.MediaPlayerControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1627f8.start():void");
    }

    public final void b() {
        try {
            if (this.f15050a != null) {
                Ha.a(new androidx.appcompat.widget.z0(this, 10));
            }
        } catch (Exception unused) {
            String TAG = D;
            kotlin.jvm.internal.g.d(TAG, "TAG");
        }
    }

    public static final void b(C1627f8 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.pause();
    }

    public final void c() {
        if (this.f15052d != null) {
            this.f15070v.a();
            h();
        }
    }

    public static final void a(C1627f8 this$0, MediaPlayer mediaPlayer, int i10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15064p = i10;
    }

    public static final boolean a(C1627f8 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        String TAG = D;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        Z7 z72 = this$0.f15060l;
        if (z72 != null) {
            C1840v7 c1840v7 = (C1840v7) z72;
            M6 m62 = c1840v7.f15517a.f15636b;
            if (!m62.f14477s && (m62 instanceof U7)) {
                try {
                    ((U7) m62).a(c1840v7.f15518b, i10);
                } catch (Exception e10) {
                    C1866x7 c1866x7 = c1840v7.f15517a;
                    A4 a42 = c1866x7.f15639f;
                    if (a42 != null) {
                        String str = c1866x7.f15640g;
                        ((B4) a42).b(str, Cc.a(e10, A5.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoError event; ")));
                    }
                }
            }
        }
        A7 a72 = this$0.f15052d;
        if (a72 != null) {
            a72.f14128a = -1;
        }
        if (a72 != null) {
            a72.f14129b = -1;
        }
        Y7 y72 = this$0.f15063o;
        if (y72 != null) {
            y72.c();
        }
        this$0.b();
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
    }

    public static final void a(C1627f8 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        String valueOf = String.valueOf(this$0.f15050a);
        Q0 a10 = AbstractC1882ya.a();
        a10.getClass();
        ArrayList a11 = AbstractC1860x1.a(a10, "disk_uri=? ", new String[]{valueOf}, null, null, "created_ts DESC ", 1, 12);
        C1674j c1674j = a11.isEmpty() ? null : (C1674j) a11.get(0);
        int nextInt = Integer.MAX_VALUE & new Random().nextInt();
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        if (c1674j != null) {
            String url = c1674j.f15197b;
            kotlin.jvm.internal.g.e(url, "url");
            AbstractC1882ya.a().a(new C1674j(nextInt, url, null, 0, currentTimeMillis, currentTimeMillis2, System.currentTimeMillis(), 0L));
        }
    }

    public final boolean a() {
        A7 a72 = this.f15052d;
        if (a72 != null) {
            int i10 = a72.f14128a;
            return (i10 == -1 || i10 == 0 || i10 == 1) ? false : true;
        }
        return true;
    }

    public final void a(int i10) {
        if (this.f15069u || 4 == getState()) {
            return;
        }
        if (this.f15068t == null) {
            this.f15068t = new Handler(Looper.getMainLooper());
        }
        if (i10 > 0) {
            this.f15069u = true;
            c();
            Handler handler = this.f15068t;
            if (handler != null) {
                handler.postDelayed(new androidx.activity.i(this, 11), i10 * 1000);
                return;
            }
            return;
        }
        pause();
    }

    public final void a(int i10, int i11) {
        if (this.f15052d != null) {
            ViewParent parent = getParent();
            C1641g8 c1641g8 = parent instanceof C1641g8 ? (C1641g8) parent : null;
            ProgressBar progressBar = c1641g8 != null ? c1641g8.getProgressBar() : null;
            if (progressBar != null) {
                progressBar.setVisibility(i10);
            }
            ViewParent parent2 = getParent();
            C1641g8 c1641g82 = parent2 instanceof C1641g8 ? (C1641g8) parent2 : null;
            ImageView posterImage = c1641g82 != null ? c1641g82.getPosterImage() : null;
            if (posterImage == null) {
                return;
            }
            posterImage.setVisibility(i11);
        }
    }
}
