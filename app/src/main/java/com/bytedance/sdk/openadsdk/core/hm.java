package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.js;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GlobalInfo.java */
/* loaded from: classes.dex */
public class hm {
    public static ABk Qhi = null;
    public static final Set<String> cJ = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.hm.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean kYc = false;
    private boolean ABk;
    private String CJ;
    private com.bytedance.sdk.openadsdk.core.video.cJ.ac EBS;
    private int Gm;
    private Integer HzH;
    private boolean MQ;
    private int ROR;
    private boolean Sf;
    private String Tgh;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f9038ac;
    private volatile ConcurrentHashMap<String, Qhi.InterfaceC0119Qhi> bxS;

    /* renamed from: fl  reason: collision with root package name */
    private String f9039fl;

    /* renamed from: hm  reason: collision with root package name */
    private String f9040hm;
    private Integer hpZ;
    private Bitmap iMK;
    private Integer pA;
    private String qMt;
    private int tP;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f9041zc;

    /* compiled from: GlobalInfo.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private static final hm Qhi = new hm();
    }

    public static boolean EBS() {
        return kYc;
    }

    public static void bxS() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            kYc = true;
        }
    }

    public String ABk() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("sp_global_file", "extra_data", null);
        }
        return this.WAv;
    }

    public String CJ() {
        if (TextUtils.isEmpty(this.CJ)) {
            String Qhi2 = Qhi("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(Qhi2)) {
                this.CJ = Qhi2;
            }
        }
        return this.CJ;
    }

    public boolean Gm() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_file", "is_paid", false);
        }
        return this.Sf;
    }

    public boolean HzH() {
        return cJ.contains(this.CJ);
    }

    public int MQ() {
        Integer num = this.HzH;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "global_ccpa", -1);
    }

    public int ROR() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_icon_id", "icon_id", 0);
        }
        return this.ROR;
    }

    public int Sf() {
        Integer num = this.pA;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "sdk_coppa", -1);
    }

    public String Tgh() {
        if (TextUtils.isEmpty(this.Tgh)) {
            this.Tgh = Qhi(HzH.Qhi());
        }
        return this.Tgh;
    }

    public int WAv() {
        int Qhi2 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "global_coppa", -99);
        this.tP = Qhi2;
        if (Qhi2 == -99) {
            this.tP = Sf();
        }
        return this.tP;
    }

    public String fl() {
        String str = this.f9039fl;
        if (str != null) {
            return str;
        }
        String Qhi2 = Qhi("mediation_info", Long.MAX_VALUE);
        this.f9039fl = Qhi2;
        if (Qhi2 == null) {
            this.f9039fl = "";
        }
        return this.f9039fl;
    }

    public int hm() {
        Integer num = this.hpZ;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "tt_gdpr", -1);
    }

    public Bitmap hpZ() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return com.bytedance.sdk.component.utils.fl.Qhi(com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("sp_global_file", "pause_icon", null));
        }
        return this.iMK;
    }

    public com.bytedance.sdk.openadsdk.core.video.cJ.ac iMK() {
        if (this.EBS == null) {
            this.EBS = new com.bytedance.sdk.openadsdk.core.video.cJ.ac(10, 8);
        }
        return this.EBS;
    }

    public boolean kYc() {
        return "com.union_test.internationad".equals(js.fl());
    }

    public boolean pA() {
        return true;
    }

    public void qMt() {
        try {
            if (this.bxS != null && this.bxS.size() == 0) {
                this.bxS = null;
            }
        } catch (NullPointerException e10) {
            e10.getMessage();
        }
    }

    public String tP() {
        if (!TextUtils.isEmpty(this.qMt)) {
            return this.qMt;
        }
        String Qhi2 = com.bytedance.sdk.openadsdk.utils.WAv.Qhi();
        this.qMt = Qhi2;
        if (!TextUtils.isEmpty(Qhi2)) {
            return this.qMt;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.WAv.Qhi(valueOf);
        this.qMt = valueOf;
        return valueOf;
    }

    public String zc() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("sp_global_file", "keywords", null);
        }
        return this.f9040hm;
    }

    private hm() {
        this.f9038ac = false;
        this.Gm = 0;
        this.f9041zc = true;
        this.ABk = false;
        this.iMK = null;
        this.pA = null;
        this.hpZ = null;
        this.HzH = null;
        this.tP = 0;
        this.bxS = null;
        try {
            com.bykv.vk.openvk.component.video.api.Tgh.Qhi.Qhi(HzH.Qhi());
        } catch (Throwable unused) {
        }
    }

    public static void Qhi(ABk aBk) {
        Qhi = aBk;
    }

    public static hm cJ() {
        return Qhi.Qhi;
    }

    public boolean ac() {
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_file", "sdk_activate_init", true);
    }

    public boolean Qhi() {
        return this.MQ;
    }

    public void ac(final int i10) {
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.hpZ;
            if (num == null || num.intValue() != i10) {
                this.hpZ = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.lG.fl()) {
                    cJ(num, i10);
                } else {
                    iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hm.3
                        @Override // java.lang.Runnable
                        public void run() {
                            hm.this.cJ(num, i10);
                        }
                    });
                }
            }
        }
    }

    public void cJ(boolean z10) {
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_file", "sdk_activate_init", Boolean.valueOf(z10));
    }

    public static boolean ROR(String str) {
        return (!com.bytedance.sdk.openadsdk.utils.Dww.Qhi || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    private static void Sf(String str) {
        ABk aBk;
        if (TextUtils.isEmpty(str) && (aBk = Qhi) != null) {
            aBk.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static JSONObject WAv(String str) {
        String cJ2 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("sp_global_file", str, null);
        if (TextUtils.isEmpty(cJ2)) {
            return null;
        }
        try {
            return new JSONObject(cJ2);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private static void hm(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        ABk aBk = Qhi;
        if (aBk != null) {
            aBk.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public void Qhi(boolean z10) {
        this.MQ = z10;
    }

    public void Tgh(final int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.HzH;
            if (num == null || num.intValue() != i10) {
                this.HzH = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.lG.fl()) {
                    ac(num, i10);
                } else {
                    iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hm.5
                        @Override // java.lang.Runnable
                        public void run() {
                            hm.this.ac(num, i10);
                        }
                    });
                }
            }
        }
    }

    public void cJ(String str) {
        this.f9039fl = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Qhi("mediation_info", str);
    }

    public void Qhi(String str) {
        Sf(str);
        this.CJ = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Qhi("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CJ(7);
    }

    public void fl(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        this.Gm = i10;
    }

    public void CJ(int i10) {
        if (i10 != 0 && i10 != 1) {
            i10 = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "global_coppa", Integer.valueOf(i10));
        this.tP = i10;
    }

    public void cJ(final int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.pA;
            if (num == null || num.intValue() != i10) {
                this.pA = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.lG.fl()) {
                    Qhi(num, i10);
                } else {
                    iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hm.2
                        @Override // java.lang.Runnable
                        public void run() {
                            hm.this.Qhi(num, i10);
                        }
                    });
                }
            }
        }
    }

    public static Pair<String, Long> CJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject WAv = WAv(str);
            if (WAv == null) {
                return null;
            }
            return new Pair<>(WAv.getString("value"), Long.valueOf(WAv.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public Qhi.InterfaceC0119Qhi fl(String str) {
        if (this.bxS == null || str == null) {
            return null;
        }
        return this.bxS.get(str);
    }

    public void ac(final String str) {
        hm(str);
        if (com.bytedance.sdk.openadsdk.utils.lG.fl()) {
            iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hm.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_file", "extra_data", str);
        }
        this.WAv = str;
    }

    private String Qhi(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public void Tgh(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            TTDislikeListView.Qhi(6, str);
        } else if (this.bxS != null) {
            this.bxS.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(Integer num, int i10) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "tt_gdpr", -1) != i10) {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
                com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(4, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(4, true);
    }

    public void Qhi(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_icon_id", "icon_id", Integer.valueOf(i10));
        }
        this.ROR = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(Integer num, int i10) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "global_ccpa", -1) != i10) {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "global_ccpa", Integer.valueOf(i10));
                com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(5, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "global_ccpa", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(5, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(Integer num, int i10) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "sdk_coppa", -1) != i10) {
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "sdk_coppa", Integer.valueOf(i10));
                com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(3, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_privacy", "sdk_coppa", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(3, true);
    }

    public void ac(boolean z10) {
        this.f9038ac = z10;
    }

    public static void Qhi(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String Qhi(String str, long j10) {
        JSONObject WAv;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            WAv = WAv(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.GlobalInfo", e10.getMessage());
        }
        if (WAv == null) {
            return null;
        }
        if (System.currentTimeMillis() - WAv.getLong("time") <= j10) {
            return WAv.getString("value");
        }
        return null;
    }

    public void Qhi(String str, Qhi.InterfaceC0119Qhi interfaceC0119Qhi) {
        if (TextUtils.isEmpty(str) || interfaceC0119Qhi == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            TTDislikeListView.Qhi(6, str, interfaceC0119Qhi);
            return;
        }
        if (this.bxS == null) {
            synchronized (hm.class) {
                if (this.bxS == null) {
                    this.bxS = new ConcurrentHashMap<>();
                }
            }
        }
        if (this.bxS != null) {
            this.bxS.put(str, interfaceC0119Qhi);
        }
    }
}
