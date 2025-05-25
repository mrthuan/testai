package com.bytedance.adsdk.ugeno.core;

import androidx.activity.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: UGNodeTree.java */
/* loaded from: classes.dex */
public class ROR {
    private JSONObject CJ;
    private JSONObject Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private String f7930ac;
    private JSONObject cJ;

    /* compiled from: UGNodeTree.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private List<Qhi> CJ;
        private String Qhi;
        private String Tgh;

        /* renamed from: ac  reason: collision with root package name */
        private JSONObject f7931ac;
        private String cJ;

        /* renamed from: fl  reason: collision with root package name */
        private Qhi f7932fl;

        public JSONObject CJ() {
            return this.f7931ac;
        }

        public List<Qhi> fl() {
            return this.CJ;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UGNode{id='");
            sb2.append(this.Qhi);
            sb2.append("', name='");
            return r.g(sb2, this.cJ, "'}");
        }

        public String ac() {
            return this.cJ;
        }

        public String cJ() {
            return this.Tgh;
        }

        public String Qhi() {
            return this.Qhi;
        }

        public void Qhi(Qhi qhi) {
            if (this.CJ == null) {
                this.CJ = new ArrayList();
            }
            this.CJ.add(qhi);
        }
    }

    public ROR(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            this.Qhi = jSONObject.optJSONObject("main_template");
            this.cJ = jSONObject.optJSONObject("sub_templates");
            JSONObject optJSONObject = jSONObject.optJSONObject("template_info");
            if (optJSONObject != null) {
                this.f7930ac = optJSONObject.optString("sdk_version");
            }
            this.CJ = jSONObject2;
        }
    }

    public Qhi Qhi() {
        return Qhi(this.Qhi, null);
    }

    public List<Qhi> ac() {
        if (this.cJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.cJ.keys();
        while (keys.hasNext()) {
            Qhi Qhi2 = Qhi(this.cJ.optJSONObject(keys.next()), null);
            if (Qhi2 != null) {
                arrayList.add(Qhi2);
            }
        }
        return arrayList;
    }

    public String cJ() {
        return this.f7930ac;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.adsdk.ugeno.core.ROR.Qhi Qhi(org.json.JSONObject r10, com.bytedance.adsdk.ugeno.core.ROR.Qhi r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "name"
            java.lang.String r2 = r10.optString(r1)
            java.lang.String r3 = "id"
            java.lang.String r4 = r10.optString(r3)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.util.Iterator r6 = r10.keys()
        L19:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = "children"
            if (r7 == 0) goto L35
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.equals(r7, r8)
            if (r8 != 0) goto L19
            java.lang.Object r8 = r10.opt(r7)     // Catch: org.json.JSONException -> L19
            r5.put(r7, r8)     // Catch: org.json.JSONException -> L19
            goto L19
        L35:
            com.bytedance.adsdk.ugeno.core.ROR$Qhi r6 = new com.bytedance.adsdk.ugeno.core.ROR$Qhi
            r6.<init>()
            com.bytedance.adsdk.ugeno.core.ROR.Qhi.Qhi(r6, r4)
            com.bytedance.adsdk.ugeno.core.ROR.Qhi.cJ(r6, r2)
            com.bytedance.adsdk.ugeno.core.ROR.Qhi.Qhi(r6, r5)
            com.bytedance.adsdk.ugeno.core.ROR.Qhi.Qhi(r6, r11)
            java.lang.String r11 = r9.f7930ac
            com.bytedance.adsdk.ugeno.core.ROR.Qhi.ac(r6, r11)
            org.json.JSONArray r10 = r10.optJSONArray(r8)
            if (r10 == 0) goto L90
            int r11 = r10.length()
            if (r11 > 0) goto L58
            goto L90
        L58:
            r11 = 0
        L59:
            int r2 = r10.length()
            if (r11 >= r2) goto L90
            org.json.JSONObject r2 = r10.optJSONObject(r11)
            java.lang.String r4 = r2.optString(r1)
            java.lang.String r5 = r2.optString(r3)
            org.json.JSONObject r7 = r9.CJ
            java.lang.String r5 = com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(r5, r7)
            java.lang.String r7 = "Template"
            boolean r4 = android.text.TextUtils.equals(r4, r7)
            if (r4 == 0) goto L84
            org.json.JSONObject r2 = r9.cJ
            if (r2 == 0) goto L82
            org.json.JSONObject r2 = r2.optJSONObject(r5)
            goto L84
        L82:
            r2 = r0
            goto L88
        L84:
            com.bytedance.adsdk.ugeno.core.ROR$Qhi r2 = r9.Qhi(r2, r6)
        L88:
            if (r2 == 0) goto L8d
            r6.Qhi(r2)
        L8d:
            int r11 = r11 + 1
            goto L59
        L90:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.ROR.Qhi(org.json.JSONObject, com.bytedance.adsdk.ugeno.core.ROR$Qhi):com.bytedance.adsdk.ugeno.core.ROR$Qhi");
    }

    public static boolean Qhi(Qhi qhi) {
        return (qhi == null || qhi.f7931ac == null) ? false : true;
    }
}
