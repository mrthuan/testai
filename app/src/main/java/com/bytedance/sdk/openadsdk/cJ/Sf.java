package com.bytedance.sdk.openadsdk.cJ;

import org.json.JSONObject;

/* compiled from: AdShowTime.java */
/* loaded from: classes.dex */
public class Sf {
    private long CJ;
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private long f8659ac;
    private long cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f8660fl;

    public void CJ(long j10) {
        if (this.CJ <= 0) {
            this.CJ = j10;
        }
    }

    public void Qhi(long j10) {
        if (this.Qhi <= 0) {
            this.Qhi = j10;
        }
    }

    public void ac(long j10) {
        if (this.f8659ac <= 0) {
            this.f8659ac = j10;
        }
    }

    public void cJ(long j10) {
        if (this.cJ <= 0) {
            this.cJ = j10;
        }
    }

    public void fl(long j10) {
        if (this.f8660fl <= 0) {
            this.f8660fl = j10;
        }
    }

    public boolean Qhi() {
        return this.Qhi > 0;
    }

    public JSONObject cJ() {
        return Qhi((JSONObject) null);
    }

    public void Qhi(long j10, float f10) {
        if (f10 > 0.0f) {
            Qhi(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            Qhi(j10);
            cJ(j10);
        }
        if (d10 >= 0.5d) {
            Qhi(j10);
            cJ(j10);
            ac(j10);
        }
        if (d10 >= 0.75d) {
            Qhi(j10);
            cJ(j10);
            ac(j10);
            CJ(j10);
        }
        if (f10 >= 1.0f) {
            Qhi(j10);
            cJ(j10);
            ac(j10);
            CJ(j10);
            fl(j10);
        }
    }

    public JSONObject Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j10 = this.Qhi;
        if (j10 > 0) {
            jSONObject.put("show_start", j10);
            long j11 = this.cJ;
            if (j11 > 0) {
                jSONObject.put("show_firstQuartile", j11);
                long j12 = this.f8659ac;
                if (j12 > 0) {
                    jSONObject.put("show_mid", j12);
                    long j13 = this.CJ;
                    if (j13 > 0) {
                        jSONObject.put("show_thirdQuartile", j13);
                        long j14 = this.f8660fl;
                        if (j14 > 0) {
                            jSONObject.put("show_full", j14);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
