package com.inmobi.media;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
public final class A7 extends MediaPlayer {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f14125d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static A7 f14126e;

    /* renamed from: f  reason: collision with root package name */
    public static int f14127f;

    /* renamed from: a  reason: collision with root package name */
    public int f14128a;

    /* renamed from: b  reason: collision with root package name */
    public int f14129b;
    public A7 c;

    public final void a() {
        if (3 == this.f14128a) {
            return;
        }
        synchronized (f14125d) {
            int i10 = f14127f;
            if (i10 < 5) {
                this.c = f14126e;
                f14126e = this;
                f14127f = i10 + 1;
            }
            tf.d dVar = tf.d.f30009a;
        }
    }
}
