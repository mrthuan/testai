package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: RewardVideoCache.java */
/* loaded from: classes.dex */
public class zc {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile zc Qhi;
    private final Map<tP, Long> CJ = Collections.synchronizedMap(new HashMap());

    /* renamed from: ac  reason: collision with root package name */
    private final iMK f8888ac;
    private final Context cJ;

    /* compiled from: RewardVideoCache.java */
    /* loaded from: classes.dex */
    public interface Qhi<T> {
        void Qhi(boolean z10, T t4);
    }

    private zc(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = HzH.Qhi();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.cJ = applicationContext;
        this.f8888ac = new iMK("sp_reward_video");
    }

    private boolean cJ(tP tPVar) {
        if (tPVar != null) {
            if (bxS.Gm(tPVar) || tPVar.FQ() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void Qhi(String str, tP tPVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String cJ = this.f8888ac.cJ(str);
        String jWV = tPVar != null ? tPVar.jWV() : "";
        if (TextUtils.isEmpty(cJ) || TextUtils.isEmpty(jWV) || cJ.equals(jWV)) {
            this.f8888ac.ROR(str);
        }
    }

    public void Qhi() {
        File[] listFiles;
        File file;
        File[] listFiles2;
        File dataDir;
        try {
            int i10 = Build.VERSION.SDK_INT;
            boolean ROR = com.bytedance.sdk.openadsdk.core.hm.ROR("sp_reward_video");
            String str = ROR ? "files" : "shared_prefs";
            if (i10 >= 24) {
                dataDir = this.cJ.getDataDir();
                file = new File(dataDir, str);
            } else {
                file = new File(this.cJ.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (listFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.zc.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_reward_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : listFiles2) {
                    if (ROR) {
                        try {
                            com.bytedance.sdk.component.utils.ROR.ac(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String replace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.cJ.deleteSharedPreferences(replace);
                        } else {
                            this.cJ.getSharedPreferences(replace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.ROR.ac(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.cJ.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.zc.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("reward_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.ROR.ac(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void Qhi(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
        if (qhi == null || qhi.hm() || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String Qhi2 = qhi.Qhi();
        synchronized (qhi) {
            if (!qhi.hm()) {
                this.f8888ac.Qhi(adSlot.getCodeId(), qhi.zc().toString(), Qhi2);
            }
        }
    }

    public static zc Qhi(Context context) {
        if (Qhi == null) {
            synchronized (zc.class) {
                if (Qhi == null) {
                    Qhi = new zc(context);
                }
            }
        }
        return Qhi;
    }

    public String Qhi(tP tPVar) {
        if (tPVar == null || tPVar.FQ() == null || TextUtils.isEmpty(tPVar.FQ().Gm())) {
            return null;
        }
        return Qhi(tPVar.FQ().Gm(), tPVar.FQ().iMK(), tPVar.zTC());
    }

    public String Qhi(String str, String str2, int i10) {
        File Qhi2;
        if (!TextUtils.isEmpty(str) && (Qhi2 = Qhi(str2, i10)) != null && Qhi2.exists() && Qhi2.isFile() && Qhi2.length() > 0) {
            return Qhi2.getAbsolutePath();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.model.Qhi Qhi(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.Qhi qhi;
        long ac2 = this.f8888ac.ac(str);
        boolean CJ = this.f8888ac.CJ(str);
        boolean Tgh = this.f8888ac.Tgh(str);
        int cJ = Tgh.cJ();
        if ((System.currentTimeMillis() - ac2 < 10500000) && !CJ && (!z10 || cJ != 2 || !Tgh)) {
            try {
                String Qhi2 = this.f8888ac.Qhi(str);
                if (!TextUtils.isEmpty(Qhi2)) {
                    JSONObject jSONObject = new JSONObject(Qhi2);
                    if (jSONObject.has("creatives")) {
                        qhi = com.bytedance.sdk.openadsdk.core.model.Qhi.cJ(jSONObject);
                    } else {
                        tP Qhi3 = com.bytedance.sdk.openadsdk.core.cJ.Qhi(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.Qhi qhi2 = new com.bytedance.sdk.openadsdk.core.model.Qhi();
                        qhi2.Qhi(Qhi3);
                        qhi = qhi2;
                    }
                    if (qhi != null && qhi.CJ()) {
                        Iterator<tP> it = qhi.ac().iterator();
                        while (it.hasNext()) {
                            if (!cJ(it.next())) {
                                it.remove();
                            }
                        }
                        if (qhi.CJ()) {
                            return qhi;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final boolean z10, final tP tPVar, final long j10, String str) {
        Long remove = this.CJ.remove(tPVar);
        final long elapsedRealtime = remove == null ? 0L : SystemClock.elapsedRealtime() - remove.longValue();
        final String str2 = z10 ? "load_video_success" : "load_video_error";
        final String str3 = (z10 || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi(str2, false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.zc.3
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi(str2).cJ(js.Qhi(z10, tPVar, elapsedRealtime, j10, str3).toString());
            }
        });
    }

    public void Qhi(final tP tPVar, final Qhi<Object> qhi) {
        this.CJ.put(tPVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (tPVar != null && tPVar.FQ() != null && !TextUtils.isEmpty(tPVar.FQ().Gm())) {
            String Gm = tPVar.FQ().Gm();
            File Qhi2 = Qhi(tPVar.FQ().iMK(), tPVar.zTC());
            com.bytedance.sdk.component.ROR.cJ.Qhi CJ = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().CJ();
            CJ.cJ(Gm);
            CJ.Qhi(Qhi2.getParent(), Qhi2.getName());
            CJ.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.zc.4
                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                    if (cJVar.Tgh() && cJVar.fl() != null && cJVar.fl().exists()) {
                        Qhi qhi2 = qhi;
                        if (qhi2 != null) {
                            qhi2.Qhi(true, null);
                        }
                        zc.this.Qhi(true, tPVar, cJVar.Qhi(), cJVar.cJ());
                        return;
                    }
                    Qhi qhi3 = qhi;
                    if (qhi3 != null) {
                        qhi3.Qhi(false, null);
                    }
                    zc.this.Qhi(false, tPVar, cJVar.Qhi(), cJVar.cJ());
                }

                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                    Qhi qhi2 = qhi;
                    if (qhi2 != null) {
                        qhi2.Qhi(false, null);
                    }
                    zc.this.Qhi(false, tPVar, -2L, iOException.getMessage());
                }
            });
            return;
        }
        if (qhi != null) {
            qhi.Qhi(false, null);
        }
        Qhi(false, tPVar, -1L, null);
    }

    private File Qhi(String str, int i10) {
        return new File(CacheDirFactory.getICacheDir(i10).Qhi(), str);
    }

    public void Qhi(String str) {
        this.f8888ac.fl(str);
    }
}
