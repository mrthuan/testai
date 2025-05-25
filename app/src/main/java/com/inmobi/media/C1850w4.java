package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.w4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1850w4 extends AbstractC1847w1 {
    public static final C1850w4 c = new C1850w4();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f15577d = new AtomicBoolean(true);

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f15577d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (!atomicBoolean.get()) {
            return jSONObject;
        }
        long j10 = this.f15548a / 1000;
        if (j10 != 0) {
            jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
        }
        int i10 = this.f15549b;
        if (i10 > 0) {
            jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
        }
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            int i11 = AbstractC1838v5.a(d10, "banner_audio_pref_file").f15579a.getInt("user_mute_count", -1);
            if (i11 > 0) {
                jSONObject.put("a-b-umc", String.valueOf(i11));
            }
        }
        return jSONObject;
    }
}
