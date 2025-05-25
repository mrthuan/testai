package com.bytedance.sdk.component.adexpress.Qhi.ac;

import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TempPkgModel.java */
/* loaded from: classes.dex */
public class Qhi {
    private List<C0084Qhi> CJ;
    private String Qhi;
    private Map<String, Qhi> Tgh = new ConcurrentHashMap();

    /* renamed from: ac  reason: collision with root package name */
    private String f8122ac;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private cJ f8123fl;

    /* compiled from: TempPkgModel.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0084Qhi {
        private String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private int f8124ac;
        private String cJ;

        public String Qhi() {
            return this.Qhi;
        }

        public int ac() {
            return this.f8124ac;
        }

        public String cJ() {
            return this.cJ;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0084Qhi) {
                String str2 = this.Qhi;
                if (str2 != null) {
                    C0084Qhi c0084Qhi = (C0084Qhi) obj;
                    if (str2.equals(c0084Qhi.Qhi()) && (str = this.cJ) != null && str.equals(c0084Qhi.cJ())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public void Qhi(String str) {
            this.Qhi = str;
        }

        public void cJ(String str) {
            this.cJ = str;
        }

        public void Qhi(int i10) {
            this.f8124ac = i10;
        }
    }

    /* compiled from: TempPkgModel.java */
    /* loaded from: classes.dex */
    public static class cJ {
        private String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private List<Pair<String, String>> f8125ac;
        private String cJ;

        public String Qhi() {
            return this.Qhi;
        }

        public void cJ(String str) {
            this.cJ = str;
        }

        public void Qhi(String str) {
            this.Qhi = str;
        }

        public List<Pair<String, String>> cJ() {
            return this.f8125ac;
        }

        public void Qhi(List<Pair<String, String>> list) {
            this.f8125ac = list;
        }
    }

    public String CJ() {
        return this.f8122ac;
    }

    public Map<String, Qhi> Qhi() {
        return this.Tgh;
    }

    public boolean ROR() {
        if (!TextUtils.isEmpty(CJ()) && !TextUtils.isEmpty(ac()) && !TextUtils.isEmpty(cJ())) {
            return true;
        }
        return false;
    }

    public JSONObject Sf() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(NamingTable.TAG, cJ());
            jSONObject.putOpt("version", ac());
            jSONObject.putOpt("main", CJ());
            JSONArray jSONArray = new JSONArray();
            if (Tgh() != null) {
                for (C0084Qhi c0084Qhi : Tgh()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt(InMobiNetworkValues.URL, c0084Qhi.Qhi());
                    jSONObject2.putOpt("md5", c0084Qhi.cJ());
                    jSONObject2.putOpt("level", Integer.valueOf(c0084Qhi.ac()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.Tgh.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.Tgh.keySet()) {
                    Qhi qhi = this.Tgh.get(str);
                    if (qhi != null) {
                        jSONObject3.put(str, qhi.Sf());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            cJ fl2 = fl();
            if (fl2 != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(InMobiNetworkValues.URL, fl2.Qhi);
                jSONObject4.put("md5", fl2.cJ);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> cJ2 = fl2.cJ();
                if (cJ2 != null) {
                    for (Pair<String, String> pair : cJ2) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<C0084Qhi> Tgh() {
        if (this.CJ == null) {
            this.CJ = new ArrayList();
        }
        return this.CJ;
    }

    public String ac() {
        return this.cJ;
    }

    public String cJ() {
        return this.Qhi;
    }

    public cJ fl() {
        return this.f8123fl;
    }

    public String hm() {
        JSONObject Sf;
        if (ROR() && (Sf = Sf()) != null) {
            return Sf.toString();
        }
        return null;
    }

    public static Qhi CJ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Qhi(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void ac(String str) {
        this.f8122ac = str;
    }

    public void cJ(String str) {
        this.cJ = str;
    }

    public void Qhi(cJ cJVar) {
        this.f8123fl = cJVar;
    }

    public void Qhi(List<C0084Qhi> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.CJ = list;
    }

    public static Qhi Qhi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        Qhi qhi = new Qhi();
        qhi.Qhi(jSONObject.optString(NamingTable.TAG));
        qhi.cJ(jSONObject.optString("version"));
        qhi.ac(jSONObject.optString("main"));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                C0084Qhi c0084Qhi = new C0084Qhi();
                c0084Qhi.Qhi(optJSONObject2.optString(InMobiNetworkValues.URL));
                c0084Qhi.cJ(optJSONObject2.optString("md5"));
                c0084Qhi.Qhi(optJSONObject2.optInt("level"));
                arrayList.add(c0084Qhi);
            }
        }
        qhi.Qhi(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Qhi Qhi = Qhi(optJSONObject3.optJSONObject(next));
                    if (Qhi != null) {
                        qhi.Qhi().put(next, Qhi);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            cJ cJVar = new cJ();
            cJVar.Qhi(optJSONObject.optString(InMobiNetworkValues.URL));
            cJVar.cJ(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    arrayList2.add(new Pair(next2, optJSONObject4.optString(next2)));
                }
                cJVar.Qhi(arrayList2);
            }
            qhi.Qhi(cJVar);
        }
        if (qhi.ROR()) {
            return qhi;
        }
        return null;
    }
}
