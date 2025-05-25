package com.bytedance.sdk.openadsdk.Gm.Qhi;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.sdk.component.cJ.Qhi.pA;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: RequestMonitor.java */
/* loaded from: classes.dex */
public class Tgh {
    public static int Qhi = -10;
    private long CJ;
    private int Gm;
    private int ROR;
    private int Sf;
    private long Tgh;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private String f8480ac;
    private final int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f8481fl;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8482hm;

    public Tgh(int i10) {
        this.cJ = i10;
    }

    public Tgh CJ(String str) {
        this.WAv = str;
        return this;
    }

    public Tgh Qhi(String str) {
        this.f8480ac = str;
        return this;
    }

    public Tgh ac(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.Sf = bytes.length;
        }
        return this;
    }

    public Tgh cJ(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.ROR = bytes.length;
        }
        return this;
    }

    public static void CJ() {
        synchronized (Tgh.class) {
            long Qhi2 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
            if (Qhi2 <= 0) {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (System.currentTimeMillis() - Qhi2 >= 86400000) {
                String cJ = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("tt_sdk_req_monitor", "req_monitor_data", null);
                if (!TextUtils.isEmpty(cJ)) {
                    com.bytedance.sdk.openadsdk.Gm.ac.ac(cJ);
                    com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sdk_req_monitor");
                    com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public Tgh Qhi(pA pAVar) {
        byte[] bArr;
        if (pAVar != null) {
            if (pAVar.Tgh == pA.Qhi.STRING_TYPE && !TextUtils.isEmpty(pAVar.Qhi())) {
                this.ROR = pAVar.Qhi().getBytes().length;
            }
            if (pAVar.Tgh == pA.Qhi.BYTE_ARRAY_TYPE && (bArr = pAVar.f8361fl) != null) {
                this.ROR = bArr.length;
            }
        }
        return this;
    }

    public void ac() {
        this.f8481fl = SystemClock.elapsedRealtime() - this.CJ;
        lG.ac().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                Qhi qhi;
                Qhi qhi2;
                synchronized (Tgh.class) {
                    String cJ = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("tt_sdk_req_monitor", "req_monitor_data", null);
                    try {
                        if (TextUtils.isEmpty(cJ)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(cJ);
                        }
                    } catch (Exception e10) {
                        ABk.cJ(e10.getMessage());
                    }
                    if (jSONObject.has(Tgh.this.f8480ac)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(Tgh.this.f8480ac);
                        if (optJSONObject != null) {
                            qhi2 = Qhi.Qhi(optJSONObject);
                            qhi2.Qhi(Tgh.this.f8482hm, Tgh.this.f8481fl, Tgh.this.ROR, Tgh.this.Sf, Tgh.this.Gm);
                            jSONObject.put(Tgh.this.f8480ac, qhi2.Qhi());
                            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                        } else {
                            qhi = new Qhi(Tgh.this.cJ, Tgh.this.f8482hm, Tgh.this.f8481fl, Tgh.this.ROR, Tgh.this.Sf, Tgh.this.Gm);
                        }
                    } else {
                        qhi = new Qhi(Tgh.this.cJ, Tgh.this.f8482hm, Tgh.this.f8481fl, Tgh.this.ROR, Tgh.this.Sf, Tgh.this.Gm);
                    }
                    qhi2 = qhi;
                    jSONObject.put(Tgh.this.f8480ac, qhi2.Qhi());
                    com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                }
            }
        });
    }

    public void cJ() {
        this.Tgh = SystemClock.elapsedRealtime() - this.CJ;
    }

    /* compiled from: RequestMonitor.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private long CJ;
        private int Qhi;
        private int ROR;
        private final SparseIntArray Sf;
        private int Tgh;

        /* renamed from: ac  reason: collision with root package name */
        private int f8483ac;
        private int cJ;

        /* renamed from: fl  reason: collision with root package name */
        private long f8484fl;

        public Qhi() {
            this.Qhi = 0;
            this.cJ = 0;
            this.f8483ac = 0;
            this.CJ = 0L;
            this.f8484fl = 0L;
            this.Tgh = 0;
            this.ROR = 0;
            this.Sf = new SparseIntArray();
        }

        public void Qhi(boolean z10, long j10, int i10, int i11, int i12) {
            if (!z10) {
                this.Sf.put(i12, this.Sf.get(i12) + 1);
            }
            int i13 = this.cJ;
            int i14 = this.f8483ac;
            int i15 = i13 + i14;
            int i16 = (this.Tgh * i15) + i10;
            int i17 = i15 + 1;
            this.Tgh = i16 / i17;
            this.ROR = ((this.ROR * i15) + i11) / i17;
            if (z10) {
                int i18 = i13 + 1;
                this.cJ = i18;
                this.CJ = ((this.CJ * i13) + j10) / i18;
                return;
            }
            int i19 = i14 + 1;
            this.f8483ac = i19;
            this.f8484fl = ((this.f8484fl * i14) + j10) / i19;
        }

        public static Qhi Qhi(JSONObject jSONObject) {
            Qhi qhi = new Qhi();
            qhi.Qhi = jSONObject.optInt("type", 0);
            qhi.cJ = jSONObject.optInt("suc_times", 0);
            qhi.f8483ac = jSONObject.optInt("fail_times", 0);
            qhi.CJ = jSONObject.optLong("suc_duration", 0L);
            qhi.f8484fl = jSONObject.optLong("fail_duration", 0L);
            qhi.Tgh = jSONObject.optInt("req_size", 0);
            qhi.ROR = jSONObject.optInt("res_size", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("codes");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    qhi.Sf.put(Integer.parseInt(next), optJSONObject.optInt(next));
                }
            }
            return qhi;
        }

        public Qhi(int i10, boolean z10, long j10, int i11, int i12, int i13) {
            this.Qhi = 0;
            this.cJ = 0;
            this.f8483ac = 0;
            this.CJ = 0L;
            this.f8484fl = 0L;
            this.Tgh = 0;
            this.ROR = 0;
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.Sf = sparseIntArray;
            this.Qhi = i10;
            if (z10) {
                this.cJ++;
                this.CJ = j10;
            } else {
                this.f8483ac++;
                this.f8484fl = j10;
                sparseIntArray.put(i13, 1);
            }
            this.Tgh = i11;
            this.ROR = i12;
        }

        public JSONObject Qhi() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.Qhi);
                jSONObject.put("suc_times", this.cJ);
                jSONObject.put("fail_times", this.f8483ac);
                jSONObject.put("suc_duration", this.CJ);
                jSONObject.put("fail_duration", this.f8484fl);
                jSONObject.put("req_size", this.Tgh);
                jSONObject.put("res_size", this.ROR);
                JSONObject jSONObject2 = new JSONObject();
                for (int i10 = 0; i10 < this.Sf.size(); i10++) {
                    jSONObject2.put(String.valueOf(this.Sf.keyAt(i10)), this.Sf.valueAt(i10));
                }
                jSONObject.put("codes", jSONObject2);
            } catch (Exception e10) {
                ABk.cJ(e10.getMessage());
            }
            return jSONObject;
        }
    }

    public void Qhi() {
        this.CJ = SystemClock.elapsedRealtime();
    }

    public Tgh Qhi(int i10) {
        this.Gm = i10;
        return this;
    }

    public Tgh Qhi(boolean z10) {
        this.f8482hm = z10;
        return this;
    }
}
