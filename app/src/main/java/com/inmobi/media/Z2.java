package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Z2 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final Z2 f14901a = new Z2();

    public Z2() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        Object obj;
        int i10;
        Context d10 = Ha.d();
        AudioManager audioManager = null;
        if (d10 != null) {
            obj = d10.getSystemService("audio");
        } else {
            obj = null;
        }
        if (obj instanceof AudioManager) {
            audioManager = (AudioManager) obj;
        }
        if (audioManager != null) {
            i10 = audioManager.getStreamVolume(3);
        } else {
            i10 = 0;
        }
        return Integer.valueOf(i10);
    }
}
