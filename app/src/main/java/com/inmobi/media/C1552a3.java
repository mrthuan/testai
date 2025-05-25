package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.a3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1552a3 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1552a3 f14931a = new C1552a3();

    public C1552a3() {
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
            i10 = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = 15;
        }
        return Integer.valueOf(i10);
    }
}
