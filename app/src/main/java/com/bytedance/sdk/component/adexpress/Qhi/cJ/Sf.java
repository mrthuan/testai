package com.bytedance.sdk.component.adexpress.Qhi.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.CJ.qMt;
import com.bytedance.sdk.component.utils.ABk;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: TmplDiffManager.java */
/* loaded from: classes.dex */
public class Sf {
    private static volatile Sf Qhi;
    private AtomicBoolean cJ = new AtomicBoolean(false);

    private Sf() {
    }

    private JSONObject ac(String str) {
        com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac ac2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac();
        if (ac2 == null) {
            return null;
        }
        com.bytedance.sdk.component.ROR.cJ.cJ ROR = ac2.ROR();
        ROR.cJ(str);
        com.bytedance.sdk.component.ROR.cJ Qhi2 = ROR.Qhi();
        if (Qhi2 != null) {
            try {
                if (Qhi2.Tgh() && Qhi2.CJ() != null) {
                    return new JSONObject(Qhi2.CJ());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> cJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ROR.Qhi().cJ(str);
    }

    public static Sf Qhi() {
        if (Qhi == null) {
            synchronized (Sf.class) {
                if (Qhi == null) {
                    Qhi = new Sf();
                }
            }
        }
        return Qhi;
    }

    private void cJ() {
        if (com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac() == null) {
            return;
        }
        int Qhi2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().Qhi();
        if (Qhi2 <= 0) {
            Qhi2 = 100;
        }
        List<com.bytedance.sdk.component.adexpress.Qhi.ac.cJ> cJ = ROR.Qhi().cJ();
        if (cJ == null || cJ.isEmpty() || Qhi2 >= cJ.size()) {
            if (cJ == null) {
                return;
            }
            cJ.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.Qhi.ac.cJ cJVar : cJ) {
            treeMap.put(cJVar.ROR(), cJVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (cJ.size() - (Qhi2 * 0.75f));
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                ((Long) entry.getKey()).longValue();
                com.bytedance.sdk.component.adexpress.Qhi.ac.cJ cJVar2 = (com.bytedance.sdk.component.adexpress.Qhi.ac.cJ) entry.getValue();
                if (cJVar2 != null) {
                    hashSet.add(cJVar2.cJ());
                }
            }
        }
        Qhi(hashSet);
        this.cJ.set(false);
    }

    public com.bytedance.sdk.component.adexpress.Qhi.ac.cJ Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ROR.Qhi().Qhi(str);
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.Qhi.ac.fl flVar, String str) {
        if (flVar == null) {
            ABk.Qhi("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = flVar.Qhi;
        final String str3 = flVar.f8129ac;
        final String str4 = flVar.cJ;
        final String str5 = flVar.CJ;
        final String str6 = flVar.f8130fl;
        final String Sf = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac() != null ? com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().Sf() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            ABk.Qhi("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            qMt.Qhi(new com.bytedance.sdk.component.Sf.hm("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.Qhi.cJ.Sf.1
                @Override // java.lang.Runnable
                public void run() {
                    Sf.this.Qhi(str2, str3, str4, str5, str6, Sf);
                }
            }, 10);
        }
    }

    private void cJ(String str, String str2, String str3, String str4, String str5, String str6) {
        ROR.Qhi().Qhi(new com.bytedance.sdk.component.adexpress.Qhi.ac.cJ().Qhi(str).cJ(str2).ac(str3).CJ(str4).fl(str5).Tgh(str6).Qhi(Long.valueOf(System.currentTimeMillis())), false);
        cJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Qhi(String str, String str2, String str3, String str4, String str5, String str6) {
        if (Qhi(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                cJ(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4)) {
            Qhi(str2, str6, str);
        } else if (TextUtils.isEmpty(str3)) {
            Qhi(str2, str6, str);
        } else {
            cJ(str6, str, str3, str2, str4, str5);
        }
        boolean Qhi2 = hm.Qhi(str5);
        if (!cJ.fl() || Qhi2) {
            Tgh.cJ().Qhi(true);
        }
    }

    private void Qhi(String str, String str2, String str3) {
        JSONObject ac2;
        if (TextUtils.isEmpty(str) || (ac2 = ac(str)) == null) {
            return;
        }
        String optString = ac2.optString("md5");
        String optString2 = ac2.optString("version");
        String optString3 = ac2.optString("data");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.Qhi.ac.cJ Qhi2 = new com.bytedance.sdk.component.adexpress.Qhi.ac.cJ().Qhi(str2).cJ(str3).ac(optString).CJ(str).fl(optString3).Tgh(optString2).Qhi(Long.valueOf(System.currentTimeMillis()));
        ROR.Qhi().Qhi(Qhi2, false);
        cJ();
        if (hm.Qhi(optString2)) {
            Qhi2.Tgh(optString2);
            Tgh.cJ().Qhi(true);
        }
    }

    public void Qhi(Set<String> set) {
        try {
            ROR.Qhi().Qhi(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
