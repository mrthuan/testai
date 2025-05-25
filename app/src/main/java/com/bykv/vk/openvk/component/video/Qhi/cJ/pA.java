package com.bykv.vk.openvk.component.video.Qhi.CJ;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.component.video.api.ac;
import com.bykv.vk.openvk.component.video.api.cJ;
import com.bytedance.component.sdk.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: AndroidMediaPlayer.java */
/* loaded from: classes.dex */
public class pA extends iMK {
    private com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi CJ;
    private volatile boolean ROR;
    private final Object Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final Qhi f7112ac;
    private final MediaPlayer cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Surface f7113fl;

    /* compiled from: AndroidMediaPlayer.java */
    /* loaded from: classes.dex */
    public static class Qhi implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<pA> Qhi;

        public Qhi(pA pAVar) {
            this.Qhi = new WeakReference<>(pAVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                pA pAVar = this.Qhi.get();
                if (pAVar != null) {
                    pAVar.Qhi(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                pA pAVar = this.Qhi.get();
                if (pAVar != null) {
                    pAVar.ac();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                pA pAVar = this.Qhi.get();
                if (pAVar == null) {
                    return false;
                }
                if (!pAVar.Qhi(i10, i11)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                pA pAVar = this.Qhi.get();
                if (pAVar == null) {
                    return false;
                }
                if (!pAVar.cJ(i10, i11)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                pA pAVar = this.Qhi.get();
                if (pAVar != null) {
                    pAVar.cJ();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                pA pAVar = this.Qhi.get();
                if (pAVar != null) {
                    pAVar.CJ();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                pA pAVar = this.Qhi.get();
                if (pAVar != null) {
                    pAVar.Qhi(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public pA() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.Tgh = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.cJ = mediaPlayer;
        }
        Qhi(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f7112ac = new Qhi(this);
        hpZ();
    }

    private void HzH() {
        try {
            Surface surface = this.f7113fl;
            if (surface != null) {
                surface.release();
                this.f7113fl = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void Qhi(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(ac.Qhi(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, new Handler());
            declaredField.setAccessible(false);
            mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
        } catch (Throwable unused) {
        }
    }

    private void hpZ() {
        this.cJ.setOnPreparedListener(this.f7112ac);
        this.cJ.setOnBufferingUpdateListener(this.f7112ac);
        this.cJ.setOnCompletionListener(this.f7112ac);
        this.cJ.setOnSeekCompleteListener(this.f7112ac);
        this.cJ.setOnVideoSizeChangedListener(this.f7112ac);
        this.cJ.setOnErrorListener(this.f7112ac);
        this.cJ.setOnInfoListener(this.f7112ac);
    }

    private void pA() {
        com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi qhi = this.CJ;
        if (qhi != null) {
            try {
                qhi.close();
            } catch (Throwable unused) {
            }
            this.CJ = null;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public int ABk() {
        MediaPlayer mediaPlayer = this.cJ;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void CJ(boolean z10) {
        MediaPlayer mediaPlayer = this.cJ;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Gm() {
        synchronized (this.Tgh) {
            if (!this.ROR) {
                this.cJ.release();
                this.ROR = true;
                HzH();
                pA();
                Qhi();
                hpZ();
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void ROR() {
        this.cJ.pause();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Sf() {
        MediaPlayer mediaPlayer = this.cJ;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Tgh() {
        this.cJ.stop();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public long WAv() {
        try {
            return this.cJ.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void ac(boolean z10) {
        this.cJ.setLooping(z10);
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void cJ(boolean z10) {
        this.cJ.setScreenOnWhilePlaying(z10);
    }

    public void finalize() {
        super.finalize();
        HzH();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void fl() {
        this.cJ.start();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public long hm() {
        try {
            return this.cJ.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public int iMK() {
        MediaPlayer mediaPlayer = this.cJ;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void zc() {
        try {
            this.cJ.reset();
        } catch (Throwable unused) {
        }
        pA();
        Qhi();
        hpZ();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Qhi(SurfaceHolder surfaceHolder) {
        synchronized (this.Tgh) {
            try {
                if (!this.ROR && surfaceHolder != null && surfaceHolder.getSurface() != null && this.Qhi) {
                    this.cJ.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    @TargetApi(14)
    public void Qhi(Surface surface) {
        HzH();
        this.f7113fl = surface;
        this.cJ.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    @RequiresApi(api = 23)
    public void Qhi(cJ cJVar) {
        this.cJ.setPlaybackParams(this.cJ.getPlaybackParams().setSpeed(cJVar.Qhi()));
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Qhi(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.cJ.setDataSource(parse.getPath());
        } else {
            this.cJ.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Qhi(FileDescriptor fileDescriptor) {
        this.cJ.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    @RequiresApi(api = 23)
    public synchronized void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        this.CJ = com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.Qhi(ac.Qhi(), acVar);
        com.bykv.vk.openvk.component.video.Qhi.Qhi.cJ.ac.Qhi(acVar);
        this.cJ.setDataSource(this.CJ);
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Qhi(long j10, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            this.cJ.seekTo((int) j10);
        } else if (i10 == 0) {
            this.cJ.seekTo((int) j10, 0);
        } else if (i10 == 1) {
            this.cJ.seekTo((int) j10, 1);
        } else if (i10 == 2) {
            this.cJ.seekTo((int) j10, 2);
        } else if (i10 == 3) {
            this.cJ.seekTo((int) j10, 3);
        } else {
            this.cJ.seekTo((int) j10);
        }
    }
}
