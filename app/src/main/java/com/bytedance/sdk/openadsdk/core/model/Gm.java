package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClickEventModel.java */
/* loaded from: classes.dex */
public class Gm {
    private final int ABk;
    private final int[] CJ;
    private final int Gm;
    private final JSONObject HzH;
    private final int[] Qhi;
    private final float ROR;
    private final float Sf;
    private final float Tgh;
    private final long WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final int[] f9063ac;
    private final int[] cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final float f9064fl;

    /* renamed from: hm  reason: collision with root package name */
    private final long f9065hm;
    private final int hpZ;
    private final int iMK;
    private final String kYc;
    private final SparseArray<ac.Qhi> pA;
    private final JSONObject tP;

    /* renamed from: zc  reason: collision with root package name */
    private final int f9066zc;

    /* compiled from: ClickEventModel.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private int[] ABk;
        private long CJ;
        private JSONObject EBS;
        private int[] Gm;
        private SparseArray<ac.Qhi> HzH;
        private int MQ;
        float Qhi;
        private float ROR;
        private float Sf;
        private float Tgh;
        private int[] WAv;

        /* renamed from: ac  reason: collision with root package name */
        float f9067ac;
        int cJ;

        /* renamed from: fl  reason: collision with root package name */
        private long f9068fl;

        /* renamed from: hm  reason: collision with root package name */
        private float f9069hm;
        private int hpZ;
        private int iMK;
        private int kYc;
        private int pA;
        private JSONObject qMt;
        private String tP;

        /* renamed from: zc  reason: collision with root package name */
        private int[] f9070zc;

        public Qhi CJ(float f10) {
            this.ROR = f10;
            return this;
        }

        public Qhi Qhi(int i10) {
            this.MQ = i10;
            return this;
        }

        public Qhi Tgh(float f10) {
            this.f9069hm = f10;
            return this;
        }

        public Qhi ac(int i10) {
            this.cJ = i10;
            return this;
        }

        public Qhi cJ(JSONObject jSONObject) {
            this.EBS = jSONObject;
            return this;
        }

        public Qhi fl(float f10) {
            this.Sf = f10;
            return this;
        }

        public Qhi CJ(int[] iArr) {
            this.ABk = iArr;
            return this;
        }

        public Qhi Qhi(JSONObject jSONObject) {
            this.qMt = jSONObject;
            return this;
        }

        public Qhi Tgh(int i10) {
            this.hpZ = i10;
            return this;
        }

        public Qhi ac(float f10) {
            this.Tgh = f10;
            return this;
        }

        public Qhi cJ(int i10) {
            this.kYc = i10;
            return this;
        }

        public Qhi fl(int i10) {
            this.pA = i10;
            return this;
        }

        public Qhi CJ(int i10) {
            this.iMK = i10;
            return this;
        }

        public Qhi Qhi(SparseArray<ac.Qhi> sparseArray) {
            this.HzH = sparseArray;
            return this;
        }

        public Qhi ac(int[] iArr) {
            this.f9070zc = iArr;
            return this;
        }

        public Qhi cJ(float f10) {
            this.f9067ac = f10;
            return this;
        }

        public Qhi Qhi(float f10) {
            this.Qhi = f10;
            return this;
        }

        public Qhi cJ(long j10) {
            this.f9068fl = j10;
            return this;
        }

        public Qhi Qhi(long j10) {
            this.CJ = j10;
            return this;
        }

        public Qhi cJ(int[] iArr) {
            this.Gm = iArr;
            return this;
        }

        public Qhi Qhi(int[] iArr) {
            this.WAv = iArr;
            return this;
        }

        public Qhi Qhi(String str) {
            this.tP = str;
            return this;
        }

        public Gm Qhi() {
            return new Gm(this);
        }
    }

    public JSONObject Qhi() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.tP;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.tP.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.Qhi;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.Qhi[1]));
            }
            int[] iArr2 = this.cJ;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt(InMobiNetworkValues.WIDTH, Integer.valueOf(iArr2[0])).putOpt(InMobiNetworkValues.HEIGHT, Integer.valueOf(this.cJ[1]));
            }
            int[] iArr3 = this.f9063ac;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.f9063ac[1]));
            }
            int[] iArr4 = this.CJ;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.CJ[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.f9064fl)).putOpt("down_y", Float.toString(this.Tgh)).putOpt("up_x", Float.toString(this.ROR)).putOpt("up_y", Float.toString(this.Sf)).putOpt("down_time", Long.valueOf(this.f9065hm)).putOpt("up_time", Long.valueOf(this.WAv)).putOpt("toolType", Integer.valueOf(this.Gm)).putOpt("deviceId", Integer.valueOf(this.f9066zc)).putOpt("source", Integer.valueOf(this.ABk)).putOpt("ft", Qhi(this.pA, this.iMK)).putOpt("click_area_type", this.kYc);
            int i10 = this.hpZ;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.HzH;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private Gm(Qhi qhi) {
        this.Qhi = qhi.Gm;
        this.cJ = qhi.f9070zc;
        this.CJ = qhi.ABk;
        this.f9063ac = qhi.WAv;
        this.f9064fl = qhi.f9069hm;
        this.Tgh = qhi.Sf;
        this.ROR = qhi.ROR;
        this.Sf = qhi.Tgh;
        this.f9065hm = qhi.f9068fl;
        this.WAv = qhi.CJ;
        this.Gm = qhi.iMK;
        this.f9066zc = qhi.pA;
        this.ABk = qhi.hpZ;
        this.iMK = qhi.kYc;
        this.pA = qhi.HzH;
        this.kYc = qhi.tP;
        this.hpZ = qhi.MQ;
        this.HzH = qhi.qMt;
        this.tP = qhi.EBS;
    }

    public static JSONObject Qhi(SparseArray<ac.Qhi> sparseArray, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    ac.Qhi valueAt = sparseArray.valueAt(i11);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.f9027ac)).putOpt("mr", Double.valueOf(valueAt.cJ)).putOpt("phase", Integer.valueOf(valueAt.Qhi)).putOpt("ts", Long.valueOf(valueAt.CJ));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
