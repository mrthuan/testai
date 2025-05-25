package de;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.inmobi.media.C1646h;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdAnalytics.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static a f16189g;

    /* renamed from: a  reason: collision with root package name */
    public int f16190a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f16191b = -1;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f16192d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f16193e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16194f = true;

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (f16189g == null) {
                f16189g = new a();
            }
            aVar = f16189g;
        }
        return aVar;
    }

    public static void c(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Bundle bundle = new Bundle();
            bundle.putString("ad_event", str2);
            bundle.putString(str2, str);
            ge.a.T(context, "ad_android", bundle, true);
        }
    }

    public final void a() {
        int i10;
        boolean z10 = this.f16194f;
        this.f16190a = z10 ? 1 : 0;
        this.f16191b = z10 ? 1 : 0;
        this.c = z10 ? 1 : 0;
        this.f16192d = 1;
        this.f16193e = 1;
        String h10 = e.h("ad_analytics", "");
        if (!TextUtils.isEmpty(h10)) {
            try {
                JSONObject jSONObject = new JSONObject(h10);
                int i11 = 0;
                if (this.f16194f) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                this.f16190a = jSONObject.optInt("request", i10);
                if (this.f16194f) {
                    i11 = 1;
                }
                this.f16191b = jSONObject.optInt("loaded", i11);
                this.c = jSONObject.optInt("impression", this.f16194f ? 1 : 0);
                this.f16192d = jSONObject.optInt(C1646h.CLICK_BEACON, 1);
                this.f16193e = jSONObject.optInt("failed", 1);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }
}
