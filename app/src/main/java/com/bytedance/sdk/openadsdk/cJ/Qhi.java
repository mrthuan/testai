package com.bytedance.sdk.openadsdk.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CJ.MQ;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEvent.java */
/* loaded from: classes.dex */
public class Qhi implements com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.ac {
    private static final Set<String> WAv = new HashSet(Arrays.asList("insight_log"));
    private String ABk;
    private long CJ;
    private int EBS;
    private final AtomicBoolean Gm;
    private String HzH;
    private String MQ;
    public final String Qhi;
    private int ROR;
    private int Sf;
    private final String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8635ac;
    private String bxS;
    protected final JSONObject cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f8636fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8637hm;
    private String hpZ;
    private String iMK;
    private String kYc;
    private String pA;
    private String qMt;
    private com.bytedance.sdk.openadsdk.cJ.cJ.Qhi tP;

    /* renamed from: zc  reason: collision with root package name */
    private JSONObject f8638zc;

    /* compiled from: AdEvent.java */
    /* renamed from: com.bytedance.sdk.openadsdk.cJ.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0109Qhi {
        private String ABk;
        private String CJ;
        private String Gm;
        private int HzH;
        private String MQ;
        public int Qhi;
        private String ROR;
        private String Sf;
        private String Tgh;
        private JSONObject WAv;

        /* renamed from: ac  reason: collision with root package name */
        private String f8643ac;
        private String cJ;

        /* renamed from: fl  reason: collision with root package name */
        private String f8644fl;

        /* renamed from: hm  reason: collision with root package name */
        private String f8645hm;
        private final long hpZ;
        private com.bytedance.sdk.openadsdk.cJ.cJ.cJ iMK;
        private int kYc;
        private com.bytedance.sdk.openadsdk.cJ.cJ.Qhi pA;
        private boolean tP;

        /* renamed from: zc  reason: collision with root package name */
        private final int f8646zc;

        public C0109Qhi(long j10, tP tPVar) {
            this.HzH = -1;
            this.kYc = -1;
            this.Qhi = -1;
            if (tPVar != null) {
                this.tP = bxS.cJ(tPVar);
                this.HzH = tPVar.HzH();
                this.kYc = tPVar.hpZ();
                this.Qhi = tPVar.gga();
            }
            this.hpZ = j10;
            this.f8646zc = com.bytedance.sdk.component.utils.hpZ.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
        }

        public C0109Qhi CJ(String str) {
            this.f8644fl = str;
            return this;
        }

        public C0109Qhi ROR(String str) {
            this.ROR = str;
            return this;
        }

        public C0109Qhi Sf(String str) {
            this.MQ = str;
            return this;
        }

        public C0109Qhi Tgh(String str) {
            this.f8645hm = str;
            return this;
        }

        public C0109Qhi ac(String str) {
            this.CJ = str;
            return this;
        }

        public C0109Qhi cJ(String str) {
            this.f8643ac = str;
            return this;
        }

        public C0109Qhi fl(String str) {
            this.Sf = str;
            return this;
        }

        public C0109Qhi Qhi(String str) {
            this.ABk = str;
            return this;
        }

        public C0109Qhi Qhi(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.WAv = jSONObject;
            return this;
        }

        public void Qhi(com.bytedance.sdk.openadsdk.cJ.cJ.Qhi qhi) {
            MQ.Qhi().Qhi(this.CJ, this.MQ, this.ROR, this.WAv);
            this.pA = qhi;
            final Qhi qhi2 = new Qhi(this);
            try {
                com.bytedance.sdk.openadsdk.cJ.cJ.cJ cJVar = this.iMK;
                if (cJVar != null) {
                    cJVar.Qhi(qhi2.cJ, this.hpZ);
                } else {
                    new com.bytedance.sdk.openadsdk.cJ.cJ.ac().Qhi(qhi2.cJ, this.hpZ);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                lG.ac(new com.bytedance.sdk.component.Sf.hm("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.cJ.Qhi.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.cJ.Qhi.fl.Qhi(qhi2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.cJ.Qhi.fl.Qhi(qhi2);
            }
        }
    }

    public Qhi(String str, JSONObject jSONObject) {
        this.Tgh = "adiff";
        this.Gm = new AtomicBoolean(false);
        this.f8638zc = new JSONObject();
        this.Qhi = str;
        this.cJ = jSONObject;
    }

    private boolean Qhi(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES) || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case 111399750:
                if (str2.equals("umeng")) {
                    c = 0;
                    break;
                }
                break;
            case 278118976:
                if (str2.equals("event_v1")) {
                    c = 1;
                    break;
                }
                break;
            case 278118978:
                if (str2.equals("event_v3")) {
                    c = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str2.equals("app_union")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    private void ROR() {
        this.cJ.putOpt("app_log_url", this.bxS);
        this.cJ.putOpt("tag", this.ABk);
        this.cJ.putOpt("label", this.iMK);
        this.cJ.putOpt("category", this.pA);
        if (!TextUtils.isEmpty(this.hpZ)) {
            try {
                this.cJ.putOpt("value", Long.valueOf(Long.parseLong(this.hpZ)));
            } catch (NumberFormatException unused) {
                this.cJ.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.kYc)) {
            try {
                this.cJ.putOpt("ext_value", Long.valueOf(Long.parseLong(this.kYc)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.qMt)) {
            this.cJ.putOpt("log_extra", this.qMt);
        }
        if (!TextUtils.isEmpty(this.MQ)) {
            try {
                this.cJ.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.MQ)));
            } catch (NumberFormatException unused3) {
            }
        }
        Qhi(this.cJ, this.iMK);
        try {
            this.cJ.putOpt("nt", Integer.valueOf(this.EBS));
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.f8638zc.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.cJ.putOpt(next, this.f8638zc.opt(next));
        }
    }

    private void Tgh() {
        JSONObject jSONObject = this.f8638zc;
        if (jSONObject == null) {
            if (!Qhi(this.hpZ, this.pA, this.qMt)) {
                return;
            }
        } else {
            String optString = jSONObject.optString("value");
            String optString2 = this.f8638zc.optString("category");
            String optString3 = this.f8638zc.optString("log_extra");
            if (Qhi(this.hpZ, this.pA, this.qMt)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !cJ(optString2)) {
                    return;
                }
            } else if ((!TextUtils.isEmpty(optString) && !TextUtils.equals(optString, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) || (!TextUtils.isEmpty(this.hpZ) && !TextUtils.equals(this.hpZ, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES))) {
                if ((!TextUtils.isEmpty(this.pA) && cJ(this.pA)) || (!TextUtils.isEmpty(optString2) && cJ(optString2))) {
                    if (TextUtils.isEmpty(this.qMt) && TextUtils.isEmpty(optString3)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.CJ = com.bytedance.sdk.openadsdk.cJ.Qhi.fl.Qhi.incrementAndGet();
    }

    private boolean cJ(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 111399750:
                if (str.equals("umeng")) {
                    c = 0;
                    break;
                }
                break;
            case 278118976:
                if (str.equals("event_v1")) {
                    c = 1;
                    break;
                }
                break;
            case 278118978:
                if (str.equals("event_v3")) {
                    c = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str.equals("app_union")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public String CJ() {
        return this.Qhi;
    }

    public JSONObject ac() {
        if (this.Gm.get()) {
            return this.cJ;
        }
        try {
            ROR();
        } catch (Throwable unused) {
        }
        if (this.cJ.has("ad_extra_data")) {
            Object opt = this.cJ.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        com.bytedance.sdk.component.utils.ABk.Qhi("AdEvent", "ad_extra_data is JSONObject");
                        this.cJ.put("ad_extra_data", Qhi((JSONObject) opt).toString());
                    } else if (opt instanceof String) {
                        this.cJ.put("ad_extra_data", Qhi(new JSONObject((String) opt)).toString());
                    }
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("AdEvent", "json error", e10.getMessage());
                }
            }
            this.Gm.set(true);
            return this.cJ;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adiff", this.Qhi);
            if (this.f8635ac) {
                jSONObject.put("interaction_method", this.ROR);
                jSONObject.put("real_interaction_method", this.Sf);
                jSONObject.put("image_mode", this.f8637hm);
            }
            this.cJ.put("ad_extra_data", jSONObject.toString());
        } catch (JSONException e11) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdEvent", "json error", e11.getMessage());
        }
        this.Gm.set(true);
        return this.cJ;
        return this.cJ;
    }

    public boolean fl() {
        Set<String> iMK;
        if (this.cJ == null || (iMK = com.bytedance.sdk.openadsdk.core.HzH.CJ().iMK()) == null) {
            return false;
        }
        String optString = this.cJ.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.iMK)) {
                return false;
            }
            return iMK.contains(this.iMK);
        }
        return iMK.contains(optString);
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.ac
    public long cJ() {
        return this.CJ;
    }

    private JSONObject Qhi(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.Qhi);
            }
            if (this.f8635ac) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.ROR);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.Sf);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.f8637hm);
                }
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.Qhi + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    public Qhi(C0109Qhi c0109Qhi) {
        this.Tgh = "adiff";
        this.Gm = new AtomicBoolean(false);
        this.f8638zc = new JSONObject();
        if (!TextUtils.isEmpty(c0109Qhi.cJ)) {
            this.Qhi = c0109Qhi.cJ;
        } else {
            this.Qhi = com.bytedance.sdk.openadsdk.utils.bxS.Qhi();
        }
        this.tP = c0109Qhi.pA;
        this.qMt = c0109Qhi.Tgh;
        this.ABk = c0109Qhi.f8643ac;
        this.iMK = c0109Qhi.CJ;
        if (!TextUtils.isEmpty(c0109Qhi.f8644fl)) {
            this.pA = c0109Qhi.f8644fl;
        } else {
            this.pA = "app_union";
        }
        this.MQ = c0109Qhi.Gm;
        this.hpZ = c0109Qhi.Sf;
        this.kYc = c0109Qhi.f8645hm;
        this.HzH = c0109Qhi.ROR;
        this.EBS = c0109Qhi.f8646zc;
        this.bxS = c0109Qhi.ABk;
        this.f8638zc = c0109Qhi.WAv = c0109Qhi.WAv != null ? c0109Qhi.WAv : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.cJ = jSONObject;
        if (!TextUtils.isEmpty(c0109Qhi.ABk)) {
            try {
                jSONObject.put("app_log_url", c0109Qhi.ABk);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("AdEvent", e10.getMessage());
            }
        }
        this.ROR = c0109Qhi.HzH;
        this.Sf = c0109Qhi.kYc;
        this.f8637hm = c0109Qhi.Qhi;
        this.f8635ac = c0109Qhi.tP;
        this.f8636fl = System.currentTimeMillis();
        Tgh();
    }

    public JSONObject Qhi(boolean z10) {
        JSONObject ac2 = ac();
        try {
            if (z10) {
                JSONObject jSONObject = new JSONObject(ac2.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                if (optJSONObject != null) {
                    optJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(ac2.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdEvent", e10.getMessage());
            return ac2;
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.ac
    public JSONObject Qhi(String str) {
        return ac();
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.ac
    public long Qhi() {
        return this.f8636fl;
    }

    private static void Qhi(JSONObject jSONObject, String str) {
        try {
            Set<String> set = WAv;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdEvent", th2);
        }
    }
}
