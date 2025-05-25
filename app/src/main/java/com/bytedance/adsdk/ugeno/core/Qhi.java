package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnimationSetModel.java */
/* loaded from: classes.dex */
public class Qhi {
    private long CJ;
    private String Qhi;
    private String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private List<C0076Qhi> f7922ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f7923fl;

    /* compiled from: AnimationSetModel.java */
    /* renamed from: com.bytedance.adsdk.ugeno.core.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0076Qhi {
        private long CJ;
        private long Qhi;
        private float ROR;
        private float[] Sf;
        private float Tgh;
        private String WAv;

        /* renamed from: ac  reason: collision with root package name */
        private String f7926ac;
        private float cJ;

        /* renamed from: fl  reason: collision with root package name */
        private String f7927fl;

        /* renamed from: hm  reason: collision with root package name */
        private String f7928hm;

        public long CJ() {
            return this.CJ;
        }

        public long Qhi() {
            return this.Qhi;
        }

        public float ROR() {
            return this.ROR;
        }

        public float[] Sf() {
            return this.Sf;
        }

        public float Tgh() {
            return this.Tgh;
        }

        public String WAv() {
            return this.WAv;
        }

        public String ac() {
            return this.f7926ac;
        }

        public float cJ() {
            return this.cJ;
        }

        public String fl() {
            return this.f7927fl;
        }

        public String hm() {
            return this.f7928hm;
        }

        public void CJ(String str) {
            this.f7928hm = str;
        }

        public void Qhi(long j10) {
            this.Qhi = j10;
        }

        public void ac(float f10) {
            this.ROR = f10;
        }

        public void cJ(long j10) {
            this.CJ = j10;
        }

        public void Qhi(float f10) {
            this.cJ = f10;
        }

        public void ac(String str) {
            this.WAv = str;
        }

        public void cJ(String str) {
            this.f7927fl = str;
        }

        public void Qhi(String str) {
            this.f7926ac = str;
        }

        public void cJ(float f10) {
            this.Tgh = f10;
        }

        public void Qhi(float[] fArr) {
            this.Sf = fArr;
        }

        public static C0076Qhi Qhi(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.cJ cJVar) {
            if (jSONObject == null) {
                return null;
            }
            C0076Qhi c0076Qhi = new C0076Qhi();
            c0076Qhi.Qhi(jSONObject.optLong("duration"));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0076Qhi.Qhi(-1.0f);
            } else {
                try {
                    c0076Qhi.Qhi(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0076Qhi.Qhi(0.0f);
                }
            }
            c0076Qhi.Qhi(jSONObject.optString("loopMode"));
            c0076Qhi.cJ(jSONObject.optString("type"));
            if (TextUtils.equals(c0076Qhi.fl(), "ripple")) {
                c0076Qhi.ac(jSONObject.optString("rippleColor"));
            }
            View hm2 = cJVar.hm();
            Context context = hm2 != null ? hm2.getContext() : null;
            if (TextUtils.equals(c0076Qhi.fl(), "backgroundColor")) {
                String Qhi = com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(jSONObject.optString("valueTo"), cJVar.WAv());
                int Qhi2 = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(jSONObject.optString("valueFrom"));
                int Qhi3 = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(Qhi);
                c0076Qhi.cJ(Qhi2);
                c0076Qhi.ac(Qhi3);
            } else if ((TextUtils.equals(c0076Qhi.fl(), "translateX") || TextUtils.equals(c0076Qhi.fl(), "translateY")) && context != null) {
                try {
                    float Qhi4 = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(context, (float) jSONObject.optDouble("valueFrom"));
                    float Qhi5 = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(context, (float) jSONObject.optDouble("valueTo"));
                    c0076Qhi.cJ(Qhi4);
                    c0076Qhi.ac(Qhi5);
                } catch (Exception unused2) {
                }
            } else {
                c0076Qhi.cJ((float) jSONObject.optDouble("valueFrom"));
                c0076Qhi.ac((float) jSONObject.optDouble("valueTo"));
            }
            c0076Qhi.CJ(jSONObject.optString("interpolator"));
            c0076Qhi.cJ(com.bytedance.adsdk.ugeno.cJ.ac.Qhi(com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(jSONObject.optString("startDelay"), cJVar.WAv()), 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0076Qhi.fl(), "translateX") || TextUtils.equals(c0076Qhi.fl(), "translateY")) && context != null) {
                    while (i10 < optJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(context, (float) optJSONArray.optDouble(i10));
                        i10++;
                    }
                } else {
                    while (i10 < optJSONArray.length()) {
                        fArr[i10] = (float) optJSONArray.optDouble(i10);
                        i10++;
                    }
                }
                c0076Qhi.Qhi(fArr);
            }
            return c0076Qhi;
        }
    }

    public long CJ() {
        return this.CJ;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public String Tgh() {
        return this.Tgh;
    }

    public List<C0076Qhi> ac() {
        return this.f7922ac;
    }

    public float cJ() {
        return this.cJ;
    }

    public long fl() {
        return this.f7923fl;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void cJ(long j10) {
        this.f7923fl = j10;
    }

    public void Qhi(float f10) {
        this.cJ = f10;
    }

    public void cJ(String str) {
        this.Tgh = str;
    }

    public void Qhi(List<C0076Qhi> list) {
        this.f7922ac = list;
    }

    public void Qhi(long j10) {
        this.CJ = j10;
    }

    public static Qhi Qhi(String str, com.bytedance.adsdk.ugeno.component.cJ cJVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Qhi(new JSONObject(str), cJVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Qhi Qhi(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.cJ cJVar) {
        return Qhi(jSONObject, null, cJVar);
    }

    public static Qhi Qhi(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.component.cJ cJVar) {
        if (jSONObject == null) {
            return null;
        }
        Qhi qhi = new Qhi();
        qhi.Qhi(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            qhi.Qhi(-1.0f);
        } else {
            try {
                qhi.Qhi(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                qhi.Qhi(0.0f);
            }
        }
        qhi.Qhi(jSONObject.optLong("duration", 0L));
        qhi.cJ(com.bytedance.adsdk.ugeno.cJ.ac.Qhi(com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(jSONObject.optString("startDelay"), cJVar.WAv()), 0L));
        qhi.cJ(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.cJ.cJ.Qhi(jSONObject2, optJSONObject);
                }
                arrayList.add(C0076Qhi.Qhi(optJSONObject, cJVar));
            }
            qhi.Qhi(arrayList);
        }
        return qhi;
    }
}
