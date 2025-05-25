package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.inmobi.media.Z6;

/* loaded from: classes2.dex */
public final class Z6 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14907a;

    /* renamed from: b  reason: collision with root package name */
    public final Y6 f14908b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14909d;

    /* renamed from: e  reason: collision with root package name */
    public final AudioAttributes f14910e;

    /* renamed from: f  reason: collision with root package name */
    public AudioFocusRequest f14911f;

    /* renamed from: g  reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f14912g;

    public Z6(Context context, Y6 audioFocusListener) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(audioFocusListener, "audioFocusListener");
        this.f14907a = context;
        this.f14908b = audioFocusListener;
        this.f14909d = new Object();
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        kotlin.jvm.internal.g.d(build, "build(...)");
        this.f14910e = build;
    }

    public final void a() {
        synchronized (this.f14909d) {
            Object systemService = this.f14907a.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f14911f;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    }
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f14912g;
                    if (onAudioFocusChangeListener != null) {
                        audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                    }
                }
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: qb.k0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Z6.a(Z6.this, i10);
            }
        };
    }

    public final void c() {
        AudioManager audioManager;
        int i10;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        synchronized (this.f14909d) {
            Object systemService = this.f14907a.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                audioManager = (AudioManager) systemService;
            } else {
                audioManager = null;
            }
            if (audioManager != null) {
                if (this.f14912g == null) {
                    this.f14912g = b();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f14911f == null) {
                        bb.g.l();
                        audioAttributes = c4.h.f().setAudioAttributes(this.f14910e);
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = this.f14912g;
                        kotlin.jvm.internal.g.b(onAudioFocusChangeListener2);
                        onAudioFocusChangeListener = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener2);
                        build = onAudioFocusChangeListener.build();
                        kotlin.jvm.internal.g.d(build, "build(...)");
                        this.f14911f = build;
                    }
                    AudioFocusRequest audioFocusRequest = this.f14911f;
                    kotlin.jvm.internal.g.b(audioFocusRequest);
                    i10 = audioManager.requestAudioFocus(audioFocusRequest);
                } else {
                    i10 = audioManager.requestAudioFocus(this.f14912g, 3, 2);
                }
            } else {
                i10 = 0;
            }
            tf.d dVar = tf.d.f30009a;
        }
        if (i10 == 1) {
            C1627f8 c1627f8 = (C1627f8) this.f14908b;
            c1627f8.i();
            Y7 y72 = c1627f8.f15063o;
            if (y72 != null && y72.f14876d != null) {
                y72.f14882j = false;
                y72.f14881i.removeView(y72.f14879g);
                y72.f14881i.removeView(y72.f14878f);
                y72.a();
                return;
            }
            return;
        }
        C1627f8 c1627f82 = (C1627f8) this.f14908b;
        c1627f82.h();
        Y7 y73 = c1627f82.f15063o;
        if (y73 != null && y73.f14876d != null) {
            y73.f14882j = true;
            y73.f14881i.removeView(y73.f14878f);
            y73.f14881i.removeView(y73.f14879g);
            y73.b();
        }
    }

    public static final void a(Z6 this$0, int i10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (i10 == -2) {
            synchronized (this$0.f14909d) {
                this$0.c = true;
                tf.d dVar = tf.d.f30009a;
            }
            C1627f8 c1627f8 = (C1627f8) this$0.f14908b;
            c1627f8.h();
            Y7 y72 = c1627f8.f15063o;
            if (y72 == null || y72.f14876d == null) {
                return;
            }
            y72.f14882j = true;
            y72.f14881i.removeView(y72.f14878f);
            y72.f14881i.removeView(y72.f14879g);
            y72.b();
        } else if (i10 == -1) {
            synchronized (this$0.f14909d) {
                this$0.c = false;
                tf.d dVar2 = tf.d.f30009a;
            }
            C1627f8 c1627f82 = (C1627f8) this$0.f14908b;
            c1627f82.h();
            Y7 y73 = c1627f82.f15063o;
            if (y73 == null || y73.f14876d == null) {
                return;
            }
            y73.f14882j = true;
            y73.f14881i.removeView(y73.f14878f);
            y73.f14881i.removeView(y73.f14879g);
            y73.b();
        } else if (i10 != 1) {
        } else {
            synchronized (this$0.f14909d) {
                if (this$0.c) {
                    C1627f8 c1627f83 = (C1627f8) this$0.f14908b;
                    if (c1627f83.isPlaying()) {
                        c1627f83.i();
                        Y7 y74 = c1627f83.f15063o;
                        if (y74 != null && y74.f14876d != null) {
                            y74.f14882j = false;
                            y74.f14881i.removeView(y74.f14879g);
                            y74.f14881i.removeView(y74.f14878f);
                            y74.a();
                        }
                    }
                }
                this$0.c = false;
                tf.d dVar3 = tf.d.f30009a;
            }
        }
    }
}
