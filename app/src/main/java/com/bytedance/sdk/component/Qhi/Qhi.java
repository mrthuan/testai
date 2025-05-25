package com.bytedance.sdk.component.Qhi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.r;
import com.bytedance.component.sdk.annotation.AnyThread;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.Qhi.Sf;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AbstractBridge.java */
/* loaded from: classes.dex */
public abstract class Qhi {
    protected Context Qhi;
    Sf ROR;

    /* renamed from: ac  reason: collision with root package name */
    protected hm f7985ac;
    protected iMK cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected String f7986fl;
    protected Handler CJ = new Handler(Looper.getMainLooper());
    protected volatile boolean Tgh = false;
    private final Map<String, Sf> Sf = new HashMap();

    public abstract Context Qhi(Gm gm2);

    public abstract String Qhi();

    @AnyThread
    public abstract void Qhi(String str);

    public void cJ() {
        this.ROR.Qhi();
        for (Sf sf2 : this.Sf.values()) {
            sf2.Qhi();
        }
        this.CJ.removeCallbacksAndMessages(null);
        this.Tgh = true;
    }

    public abstract void cJ(Gm gm2);

    public void invokeMethod(final String str) {
        if (this.Tgh) {
            return;
        }
        this.CJ.post(new Runnable() { // from class: com.bytedance.sdk.component.Qhi.Qhi.1
            @Override // java.lang.Runnable
            public void run() {
                HzH hzH;
                if (!Qhi.this.Tgh) {
                    try {
                        hzH = Qhi.this.Qhi(new JSONObject(str));
                    } catch (Exception unused) {
                        hzH = null;
                    }
                    if (HzH.Qhi(hzH)) {
                        Objects.toString(hzH);
                        if (hzH != null) {
                            Qhi.this.cJ(CQU.Qhi(new tP(hzH.Qhi, "Failed to parse invocation.")), hzH);
                            return;
                        }
                        return;
                    }
                    Qhi.this.Qhi(hzH);
                }
            }
        });
    }

    public void Qhi(String str, HzH hzH) {
        Qhi(str);
    }

    @MainThread
    public final void Qhi(HzH hzH) {
        String Qhi;
        if (this.Tgh || (Qhi = Qhi()) == null) {
            return;
        }
        Sf cJ = cJ(hzH.ROR);
        if (cJ == null) {
            hzH.toString();
            if (this.cJ != null) {
                Qhi();
            }
            cJ(CQU.Qhi(new tP(-4, r.g(new StringBuilder("Namespace "), hzH.ROR, " unknown."))), hzH);
            return;
        }
        ROR ror = new ROR();
        ror.cJ = Qhi;
        ror.Qhi = this.Qhi;
        ror.f7987ac = cJ;
        try {
            Sf.Qhi Qhi2 = cJ.Qhi(hzH, ror);
            if (Qhi2 == null) {
                hzH.toString();
                if (this.cJ != null) {
                    Qhi();
                }
                cJ(CQU.Qhi(new tP(-2, "Function " + hzH.CJ + " is not registered.")), hzH);
                return;
            }
            if (Qhi2.Qhi) {
                cJ(Qhi2.cJ, hzH);
            }
            if (this.cJ != null) {
                Qhi();
            }
        } catch (Exception e10) {
            hzH.toString();
            cJ(CQU.Qhi(e10), hzH);
        }
    }

    public final void cJ(String str, HzH hzH) {
        JSONObject jSONObject;
        if (this.Tgh || TextUtils.isEmpty(hzH.Tgh)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            WAv.Qhi(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        Qhi(hpZ.Qhi().Qhi("__msg_type", "callback").Qhi("__callback_id", hzH.Tgh).Qhi("__params", jSONObject).cJ(), hzH);
    }

    private Sf cJ(String str) {
        if (!TextUtils.equals(str, this.f7986fl) && !TextUtils.isEmpty(str)) {
            return this.Sf.get(str);
        }
        return this.ROR;
    }

    public final void Qhi(Gm gm2, EBS ebs) {
        this.Qhi = Qhi(gm2);
        this.f7985ac = gm2.CJ;
        this.cJ = gm2.f7978hm;
        this.ROR = new Sf(gm2, this, ebs);
        this.f7986fl = gm2.Gm;
        cJ(gm2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HzH Qhi(JSONObject jSONObject) {
        String str;
        if (this.Tgh) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        if (Qhi() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String str2 = "";
            Object opt = jSONObject.opt("params");
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    str = String.valueOf((JSONObject) opt);
                    String string2 = jSONObject.getString("JSSDK");
                    String optString3 = jSONObject.optString("namespace");
                    return HzH.Qhi().Qhi(string2).cJ(string).ac(optString2).CJ(str).fl(optString).Tgh(optString3).ROR(jSONObject.optString("__iframe_url")).Qhi();
                } else if (opt instanceof String) {
                    str2 = (String) opt;
                } else {
                    str2 = String.valueOf(opt);
                }
            }
            str = str2;
            String string22 = jSONObject.getString("JSSDK");
            String optString32 = jSONObject.optString("namespace");
            return HzH.Qhi().Qhi(string22).cJ(string).ac(optString2).CJ(str).fl(optString).Tgh(optString32).ROR(jSONObject.optString("__iframe_url")).Qhi();
        } catch (JSONException unused) {
            return HzH.Qhi(optString, -1);
        }
    }
}
