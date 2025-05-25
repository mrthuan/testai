package com.bytedance.sdk.component.adexpress.Qhi.cJ;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.CJ.Eh;
import com.bytedance.sdk.component.adexpress.CJ.qMt;
import com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi;
import com.bytedance.sdk.component.utils.ABk;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TTDynamic.java */
/* loaded from: classes.dex */
public class cJ {
    static Object Qhi = new Object();

    public static com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi CJ() {
        return Tgh.cJ().Tgh();
    }

    public static void Qhi() {
        Tgh.cJ();
    }

    private static File ROR(String str) {
        List<Pair<String, String>> cJ;
        Qhi.cJ fl2 = CJ().fl();
        if (fl2 == null || (cJ = fl2.cJ()) == null || cJ.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : cJ) {
            Object obj = pair.second;
            if (obj != null && ((String) obj).equals(str)) {
                return new File(Tgh.Sf(), (String) pair.first);
            }
        }
        return null;
    }

    @Deprecated
    private static String Tgh() {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi CJ = CJ();
        if (CJ == null) {
            return null;
        }
        return CJ.CJ();
    }

    public static String ac() {
        return ROR.ac();
    }

    public static void cJ() {
        try {
            hm.CJ();
            File Sf = Tgh.Sf();
            if (Sf == null || !Sf.exists()) {
                return;
            }
            if (Sf.getParentFile() != null) {
                com.bytedance.sdk.component.utils.ROR.ac(Sf.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.ROR.ac(Sf);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean fl() {
        return Tgh.cJ().fl();
    }

    public static String CJ(String str) {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi;
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi CJ = CJ();
        if (CJ == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi> Qhi2 = CJ.Qhi();
            if (Qhi2 == null || Qhi2.size() <= 0 || (qhi = Qhi2.get(str)) == null) {
                return null;
            }
            return qhi.CJ();
        }
        return Tgh();
    }

    public static com.bytedance.sdk.component.adexpress.Qhi.ac.cJ Qhi(String str) {
        return Sf.Qhi().Qhi(str);
    }

    public static com.bytedance.sdk.component.adexpress.Qhi.ac.cJ ac(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.Qhi.ac.cJ Qhi2 = Sf.Qhi().Qhi(str);
        if (Qhi2 != null) {
            Qhi2.Qhi(Long.valueOf(System.currentTimeMillis()));
            Qhi(Qhi2);
        }
        return Qhi2;
    }

    private static boolean fl(String str) {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi CJ;
        List<Qhi.C0084Qhi> Tgh;
        if (!fl() || (CJ = CJ()) == null || (Tgh = CJ.Tgh()) == null) {
            return false;
        }
        for (Qhi.C0084Qhi c0084Qhi : Tgh) {
            if (c0084Qhi != null && TextUtils.equals(str, c0084Qhi.Qhi())) {
                return true;
            }
        }
        return false;
    }

    public static void Qhi(com.bytedance.sdk.component.adexpress.Qhi.ac.fl flVar) {
        Sf.Qhi().Qhi(flVar, flVar.Tgh);
    }

    private static File Tgh(String str) {
        if (fl()) {
            for (Qhi.C0084Qhi c0084Qhi : CJ().Tgh()) {
                if (c0084Qhi.Qhi() != null && c0084Qhi.Qhi().equals(str)) {
                    File file = new File(Tgh.Sf(), com.bytedance.sdk.component.utils.Tgh.Qhi(c0084Qhi.Qhi()));
                    String Qhi2 = com.bytedance.sdk.component.utils.Tgh.Qhi(file);
                    if (c0084Qhi.cJ() == null || !c0084Qhi.cJ().equals(Qhi2)) {
                        return null;
                    }
                    return file;
                }
            }
            return null;
        }
        return null;
    }

    private static void Qhi(final com.bytedance.sdk.component.adexpress.Qhi.ac.cJ cJVar) {
        qMt.Qhi(new com.bytedance.sdk.component.Sf.hm("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (cJ.Qhi) {
                    ROR.Qhi().Qhi(cJVar, true);
                }
            }
        }, 10);
    }

    public static Qhi Qhi(String str, Eh.Qhi qhi, String str2, String str3) {
        File file;
        Qhi qhi2 = new Qhi();
        if (TextUtils.isEmpty(str3)) {
            file = null;
        } else {
            file = cJ(str3, str);
            if (file != null) {
                qhi2.Qhi(1);
            }
        }
        if (file == null && (file = ROR(str)) != null) {
            qhi2.Qhi(3);
        }
        if (file == null && (file = Tgh(str)) != null) {
            qhi2.Qhi(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!Qhi(str, str3)) {
                qhi2.Qhi(4);
            }
        } else if (!fl(str)) {
            qhi2.Qhi(6);
        }
        qhi2.cJ();
        if (file != null) {
            try {
                qhi2.Qhi(new WebResourceResponse(qhi.Qhi(), "utf-8", new FileInputStream(file)));
            } catch (Throwable th2) {
                ABk.Qhi("TTDynamic", "get html WebResourceResponse error", th2);
            }
        }
        return qhi2;
    }

    public static Set<String> cJ(String str) {
        return Sf.Qhi().cJ(str);
    }

    private static File cJ(String str, String str2) {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi;
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi CJ = CJ();
        if (CJ == null || !fl()) {
            return null;
        }
        Map<String, com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi> Qhi2 = CJ.Qhi();
        if (Qhi2.size() == 0 || (qhi = Qhi2.get(str)) == null) {
            return null;
        }
        for (Qhi.C0084Qhi c0084Qhi : qhi.Tgh()) {
            if (c0084Qhi.Qhi() != null && c0084Qhi.Qhi().equals(str2)) {
                File file = new File(Tgh.Sf(), com.bytedance.sdk.component.utils.Tgh.Qhi(c0084Qhi.Qhi()));
                String Qhi3 = com.bytedance.sdk.component.utils.Tgh.Qhi(file);
                if (c0084Qhi.cJ() == null || !c0084Qhi.cJ().equals(Qhi3)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean cJ(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject == null || (opt = optJSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean Qhi(String str, String str2) {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi CJ;
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi;
        if (!fl() || (CJ = CJ()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi> Qhi2 = CJ.Qhi();
        if (Qhi2.size() == 0 || (qhi = Qhi2.get(str2)) == null) {
            return false;
        }
        for (Qhi.C0084Qhi c0084Qhi : qhi.Tgh()) {
            if (c0084Qhi != null && TextUtils.equals(str, c0084Qhi.Qhi())) {
                return true;
            }
        }
        return false;
    }

    public static boolean Qhi(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }
}
