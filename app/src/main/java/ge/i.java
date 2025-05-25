package ge;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VoiceUtils.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: g  reason: collision with root package name */
    public static i f17779g;

    /* renamed from: a  reason: collision with root package name */
    public int f17780a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f17781b = 9;
    public int c = 21;

    /* renamed from: d  reason: collision with root package name */
    public int f17782d = 30;

    /* renamed from: e  reason: collision with root package name */
    public int f17783e = 10;

    /* renamed from: f  reason: collision with root package name */
    public int f17784f = -1;

    public static synchronized i b() {
        i iVar;
        synchronized (i.class) {
            if (f17779g == null) {
                f17779g = new i();
            }
            iVar = f17779g;
        }
        return iVar;
    }

    public static boolean c(Context context) {
        try {
            return ((AudioManager) context.getSystemService("audio")).isMusicActive();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public final boolean a() {
        try {
            String h10 = de.e.h("ad_voice_config", "");
            if (!TextUtils.isEmpty(h10)) {
                JSONObject jSONObject = new JSONObject(h10);
                if (jSONObject.optInt("isOpen", 1) != 1) {
                    return false;
                }
                this.f17781b = jSONObject.optInt("dayStartTime", 9);
                this.c = jSONObject.optInt("dayEndTime", 21);
                this.f17782d = jSONObject.optInt("dayVoice", 30);
                this.f17783e = jSONObject.optInt("nightVoice", 10);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return true;
    }

    public final void d(Context context) {
        int i10;
        if (!a()) {
            return;
        }
        boolean z10 = true;
        if (de.e.d(context, null, "isMuted", 0) != 1) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager.isMusicActive()) {
                return;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            fe.a.a().b("MaxVolume:" + streamMaxVolume + " CurrentVolume:" + streamVolume);
            int i11 = Calendar.getInstance().get(11);
            if (i11 >= this.f17781b && i11 < this.c) {
                i10 = this.f17782d;
            } else {
                i10 = this.f17783e;
            }
            int i12 = (int) ((streamMaxVolume * i10) / 100.0f);
            if (streamVolume > i12) {
                this.f17780a = streamVolume;
                this.f17784f = i12;
                audioManager.setStreamVolume(3, i12, 0);
                fe.a.a().b("Reduce audio volume to " + this.f17784f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e(Context context) {
        if (!a()) {
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            int i10 = this.f17780a;
            if (i10 != -1 && i10 != streamVolume && this.f17784f == streamVolume) {
                audioManager.setStreamVolume(3, i10, 0);
                fe.a a10 = fe.a.a();
                a10.b("Resume audio volume to " + this.f17780a);
            }
            this.f17780a = -1;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
