package com.bykv.vk.openvk.component.video.Qhi;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.Qhi.cJ;
import org.json.JSONObject;

/* compiled from: MediaConfig.java */
/* loaded from: classes.dex */
public class Qhi {
    public static int CJ = 10;
    public static int Qhi = 10;

    /* renamed from: ac  reason: collision with root package name */
    public static int f7114ac = 10;
    public static int cJ = 10;

    /* renamed from: fl  reason: collision with root package name */
    private static cJ f7115fl;

    public static int CJ() {
        return f7114ac;
    }

    public static void Qhi(Context context) {
        com.bykv.vk.openvk.component.video.api.Tgh.Qhi.Qhi(context);
    }

    public static int ac() {
        return cJ;
    }

    public static int cJ() {
        return Qhi;
    }

    public static int fl() {
        return CJ;
    }

    public static void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Qhi = jSONObject.optInt("splash", 10);
            cJ = jSONObject.optInt("reward", 10);
            f7114ac = jSONObject.optInt("brand", 10);
            int optInt = jSONObject.optInt("other", 10);
            CJ = optInt;
            if (Qhi < 0) {
                Qhi = 10;
            }
            if (cJ < 0) {
                cJ = 10;
            }
            if (f7114ac < 0) {
                f7114ac = 10;
            }
            if (optInt < 0) {
                CJ = 10;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static void Qhi(cJ cJVar) {
        f7115fl = cJVar;
    }

    public static void Qhi() {
        cJ cJVar = f7115fl;
        if (cJVar != null) {
            cJVar.CJ();
        }
    }
}
