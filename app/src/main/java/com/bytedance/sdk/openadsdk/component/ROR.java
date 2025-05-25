package com.bytedance.sdk.openadsdk.component;

import a6.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.fl.Qhi;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.CQU;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.qMt;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.utils.Jma;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.pA;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdCacheManager.java */
/* loaded from: classes.dex */
public class ROR {
    private static volatile ROR Qhi;
    private final Context CJ;

    /* renamed from: ac  reason: collision with root package name */
    private final tP<com.bytedance.sdk.openadsdk.cJ.Qhi> f8743ac;
    private final com.bytedance.sdk.openadsdk.Qhi.cJ cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final Map<String, AtomicInteger> f8744fl = new ConcurrentHashMap();

    /* compiled from: TTAppOpenAdCacheManager.java */
    /* loaded from: classes.dex */
    public class Qhi extends hm {
        private final com.bytedance.sdk.openadsdk.component.fl.Qhi cJ;

        public Qhi(com.bytedance.sdk.openadsdk.component.fl.Qhi qhi) {
            super("App Open Ad Write Cache");
            this.cJ = qhi;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String jSONObject = com.bytedance.sdk.component.utils.Qhi.Qhi(this.cJ.cJ().mZ()).toString();
                com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad_materialMeta", "material" + this.cJ.Qhi(), jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    /* loaded from: classes.dex */
    public interface ac {
        void Qhi();

        void Qhi(int i10, String str);
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    /* loaded from: classes.dex */
    public interface cJ {
        void Qhi();

        void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar);
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    /* loaded from: classes.dex */
    public interface fl {
        void Qhi(Bitmap bitmap);
    }

    private ROR(Context context) {
        if (context != null) {
            this.CJ = context.getApplicationContext();
        } else {
            this.CJ = HzH.Qhi();
        }
        this.cJ = new com.bytedance.sdk.openadsdk.Qhi.cJ(10, 8, true);
        this.f8743ac = HzH.ac();
    }

    public boolean CJ(int i10) {
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "image_has_cached".concat(String.valueOf(i10)), false);
    }

    public void ROR(int i10) {
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad_materialMeta", "material".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "material_expiration_time".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "video_has_cached".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "image_has_cached".concat(String.valueOf(i10)));
    }

    public com.bytedance.sdk.openadsdk.core.model.tP Tgh(int i10) {
        String str;
        String cJ2 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("tt_openad_materialMeta", "material".concat(String.valueOf(i10)), null);
        if (!TextUtils.isEmpty(cJ2)) {
            try {
                str = com.bytedance.sdk.component.utils.Qhi.ac(new JSONObject(cJ2).optString(PglCryptUtils.KEY_MESSAGE));
            } catch (JSONException e10) {
                ABk.Qhi("TTAppOpenAdCacheManager", e10.getMessage());
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    com.bytedance.sdk.openadsdk.core.model.tP Qhi2 = com.bytedance.sdk.openadsdk.core.cJ.Qhi(new JSONObject(str));
                    if (Qhi2 != null) {
                        return Qhi2;
                    }
                } catch (JSONException e11) {
                    ABk.Qhi("TTAppOpenAdCacheManager", e11.getMessage());
                }
            }
        }
        return null;
    }

    public void ac(int i10) {
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "image_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public com.bytedance.sdk.openadsdk.core.model.tP fl(int i10) {
        long Qhi2 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
        com.bytedance.sdk.openadsdk.core.model.tP Tgh = Tgh(i10);
        if (System.currentTimeMillis() / 1000 < Qhi2 && Tgh != null) {
            return Tgh;
        }
        if (Tgh != null || Qhi2 != -1) {
            ROR(i10);
            if (Tgh != null) {
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(Tgh);
                return null;
            }
            return null;
        }
        return null;
    }

    private int ac(AdSlot adSlot) {
        StringBuilder sb2 = new StringBuilder("material_expiration_time");
        sb2.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", sb2.toString(), -1L) == -1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.f8744fl.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.f8744fl.put(adSlot.getCodeId(), atomicInteger);
    }

    public static ROR Qhi(Context context) {
        if (Qhi == null) {
            synchronized (ROR.class) {
                if (Qhi == null) {
                    Qhi = new ROR(context);
                }
            }
        }
        return Qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(final com.bytedance.sdk.openadsdk.core.model.tP tPVar, final AdSlot adSlot, final CQU cqu) {
        final int Hy = tPVar.Hy();
        Qhi(tPVar, cqu, new cJ() { // from class: com.bytedance.sdk.openadsdk.component.ROR.5
            @Override // com.bytedance.sdk.openadsdk.component.ROR.cJ
            public void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar) {
                com.bytedance.sdk.openadsdk.component.fl.Qhi qhi = new com.bytedance.sdk.openadsdk.component.fl.Qhi(Hy, tPVar);
                ROR.this.Qhi(qhi);
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(qhi.cJ(), 1, cqu);
                ROR.this.cJ(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ROR.cJ
            public void Qhi() {
                ROR.this.cJ(adSlot);
            }
        });
    }

    public boolean cJ(int i10) {
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "video_has_cached".concat(String.valueOf(i10)), false);
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, fl flVar) {
        Qhi(tPVar, flVar, 0);
    }

    private void cJ(com.bytedance.sdk.openadsdk.component.fl.Qhi qhi) {
        lG.Qhi(new Qhi(qhi), 5);
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, final fl flVar, final int i10) {
        String WAv = tPVar.FQ().WAv();
        if (TextUtils.isEmpty(WAv)) {
            return;
        }
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(WAv).Qhi(tPVar.FQ().ac()).cJ(tPVar.FQ().cJ()).fl(zn.CJ(HzH.Qhi())).CJ(zn.ac(HzH.Qhi())).ac(2).Qhi(new com.bytedance.sdk.component.fl.hm() { // from class: com.bytedance.sdk.openadsdk.component.ROR.2
            @Override // com.bytedance.sdk.component.fl.hm
            public Bitmap Qhi(Bitmap bitmap) {
                if (i10 <= 0) {
                    return bitmap;
                }
                return kYc.Qhi(HzH.Qhi(), bitmap, i10);
            }
        }).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(tPVar, WAv, new com.bytedance.sdk.component.fl.HzH<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.ROR.1
            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(int i11, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(zc<Bitmap> zcVar) {
                fl flVar2;
                if (zcVar == null || zcVar.cJ() == null || zcVar.ac() == null || (flVar2 = fl.this) == null) {
                    return;
                }
                flVar2.Qhi(zcVar.cJ());
            }
        }));
    }

    public boolean cJ(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar == null || tPVar.cjC() == null || tPVar.cjC().size() == 0 || TextUtils.isEmpty(tPVar.cjC().get(0).Qhi())) {
            return false;
        }
        hpZ hpz = tPVar.cjC().get(0);
        return Qhi(hpz.Qhi(), hpz.ROR());
    }

    public String cJ() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return h.c(name, "/openad_image_cache/");
        }
        return h.c(name, "//openad_image_cache/");
    }

    public void Qhi(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.f8744fl.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (atomicInteger.get() + ac(adSlot) > 0) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f8744fl.put(adSlot.getCodeId(), atomicInteger);
        final CQU cqu = new CQU();
        cqu.Qhi(Jma.Qhi());
        qMt qmt = new qMt();
        qmt.WAv = cqu;
        qmt.CJ = 2;
        qmt.Sf = 2;
        this.f8743ac.Qhi(adSlot, qmt, 3, new tP.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.ROR.3
            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(int i10, String str) {
                ROR.this.cJ(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
                if (qhi != null && qhi.ac() != null && qhi.ac().size() != 0) {
                    com.bytedance.sdk.openadsdk.core.model.tP tPVar = qhi.ac().get(0);
                    if (tPVar != null && tPVar.czB()) {
                        com.bytedance.sdk.openadsdk.component.fl.Qhi qhi2 = new com.bytedance.sdk.openadsdk.component.fl.Qhi(tPVar.Hy(), tPVar);
                        ROR.this.Qhi(qhi2);
                        com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(qhi2.cJ(), 1, cqu);
                        ROR.this.cJ(adSlot);
                        return;
                    } else if (!com.bytedance.sdk.openadsdk.core.model.tP.fl(tPVar)) {
                        ROR.this.cJ(tPVar, adSlot, cqu);
                        return;
                    } else {
                        ROR.this.Qhi(tPVar, adSlot, cqu);
                        return;
                    }
                }
                cJVar.Qhi(-3);
                com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.tP tPVar, final AdSlot adSlot, final CQU cqu) {
        final int Hy = tPVar.Hy();
        Qhi(tPVar, adSlot, cqu, new ac() { // from class: com.bytedance.sdk.openadsdk.component.ROR.4
            @Override // com.bytedance.sdk.openadsdk.component.ROR.ac
            public void Qhi() {
                com.bytedance.sdk.openadsdk.component.fl.Qhi qhi = new com.bytedance.sdk.openadsdk.component.fl.Qhi(Hy, tPVar);
                ROR.this.Qhi(qhi);
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(qhi.cJ(), 1, cqu);
                ROR.this.cJ(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ROR.ac
            public void Qhi(int i10, String str) {
                ROR.this.cJ(adSlot);
            }
        });
    }

    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.tP tPVar, AdSlot adSlot, final CQU cqu, final ac acVar) {
        final Jma Qhi2 = Jma.Qhi();
        final int Hy = tPVar.Hy();
        com.bykv.vk.openvk.component.video.api.ac.cJ FQ = tPVar.FQ();
        String Gm = FQ.Gm();
        String iMK = FQ.iMK();
        if (TextUtils.isEmpty(iMK)) {
            iMK = com.bytedance.sdk.component.utils.Tgh.Qhi(Gm);
        }
        final File Qhi3 = com.bytedance.sdk.openadsdk.component.ROR.Qhi.Qhi(iMK);
        if (Qhi3.exists()) {
            com.bytedance.sdk.openadsdk.component.ROR.Qhi.Qhi(Qhi3);
            Qhi(Hy);
            long ac2 = Qhi2.ac();
            if (cqu != null) {
                cqu.Qhi(ac2);
                cqu.Qhi(1);
            }
            acVar.Qhi();
            Qhi(tPVar, (fl) null);
        } else if (HzH.CJ().pM(String.valueOf(Hy)) && !com.bytedance.sdk.component.utils.hpZ.CJ(HzH.Qhi())) {
            acVar.Qhi(100, "OnlyWifi");
        } else {
            com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi4 = com.bytedance.sdk.openadsdk.core.model.tP.Qhi(Qhi3.getParent(), tPVar);
            Qhi4.Qhi("material_meta", tPVar);
            Qhi4.Qhi("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi4, new Qhi.InterfaceC0063Qhi() { // from class: com.bytedance.sdk.openadsdk.component.ROR.6
                @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar2, int i10) {
                    ROR.this.Qhi(Hy);
                    long ac3 = Qhi2.ac();
                    com.bytedance.sdk.openadsdk.component.CJ.cJ.cJ(tPVar, ac3, true);
                    CQU cqu2 = cqu;
                    if (cqu2 != null) {
                        cqu2.Qhi(ac3);
                        cqu.Qhi(2);
                    }
                    acVar.Qhi();
                    ROR.Qhi(tPVar, (fl) null);
                }

                @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar2, int i10, String str) {
                    long ac3 = Qhi2.ac();
                    com.bytedance.sdk.openadsdk.component.CJ.cJ.cJ(tPVar, ac3, false);
                    CQU cqu2 = cqu;
                    if (cqu2 != null) {
                        cqu2.Qhi(ac3);
                    }
                    acVar.Qhi(i10, str);
                    try {
                        if (Qhi3.exists() && Qhi3.isFile()) {
                            com.bytedance.sdk.component.utils.ROR.ac(Qhi3);
                        }
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                public void cJ(com.bykv.vk.openvk.component.video.api.ac.ac acVar2, int i10) {
                }
            });
        }
    }

    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.tP tPVar, final CQU cqu, final cJ cJVar) {
        final Jma Qhi2 = Jma.Qhi();
        final int Hy = tPVar.Hy();
        hpZ hpz = tPVar.cjC().get(0);
        String ROR = hpz.ROR();
        String Qhi3 = hpz.Qhi();
        int cJ2 = hpz.cJ();
        int ac2 = hpz.ac();
        String Qhi4 = TextUtils.isEmpty(ROR) ? com.bytedance.sdk.component.utils.Tgh.Qhi(Qhi3) : ROR;
        if (TextUtils.isEmpty(Qhi4)) {
            if (cJVar != null) {
                cJVar.Qhi();
                return;
            }
            return;
        }
        File cJ3 = com.bytedance.sdk.openadsdk.component.ROR.Qhi.cJ(Qhi4);
        if (Qhi(Qhi3, ROR)) {
            ac(Hy);
            long ac3 = Qhi2.ac();
            if (cqu != null) {
                cqu.Qhi(ac3);
                cqu.Qhi(1);
            }
            cJVar.Qhi(null);
            return;
        }
        pA.Qhi(new com.bytedance.sdk.openadsdk.iMK.Qhi(Qhi3, hpz.ROR()), cJ2, ac2, new pA.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.ROR.7
            @Override // com.bytedance.sdk.openadsdk.utils.pA.Qhi
            public void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar2) {
                if (cJVar2.CJ()) {
                    ROR.this.ac(Hy);
                    long ac4 = Qhi2.ac();
                    com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(tPVar, ac4, true);
                    CQU cqu2 = cqu;
                    if (cqu2 != null) {
                        cqu2.Qhi(ac4);
                        cqu.Qhi(2);
                    }
                    cJVar.Qhi(cJVar2);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(tPVar, Qhi2.ac(), false);
                cJVar.Qhi();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.pA.Qhi
            public void Qhi() {
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(tPVar, Qhi2.ac(), false);
                cJVar.Qhi();
            }
        }, cJ3.getParent());
    }

    public void Qhi(int i10) {
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "video_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public void Qhi(com.bytedance.sdk.openadsdk.component.fl.Qhi qhi) {
        if (qhi.cJ() != null) {
            long Ura = qhi.cJ().Ura();
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad", "material_expiration_time" + qhi.Qhi(), Long.valueOf(Ura));
            cJ(qhi);
        }
    }

    public String Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar != null && tPVar.FQ() != null && !TextUtils.isEmpty(tPVar.FQ().Gm())) {
            String Gm = tPVar.FQ().Gm();
            String iMK = tPVar.FQ().iMK();
            if (TextUtils.isEmpty(iMK)) {
                iMK = com.bytedance.sdk.component.utils.Tgh.Qhi(Gm);
            }
            File Qhi2 = com.bytedance.sdk.openadsdk.component.ROR.Qhi.Qhi(iMK);
            if (Qhi2.exists() && Qhi2.isFile()) {
                return Qhi2.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean Qhi(String str, String str2) {
        boolean z10;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.Tgh.Qhi(str);
            }
            File cJ2 = com.bytedance.sdk.openadsdk.component.ROR.Qhi.cJ(str2);
            InputStream Qhi2 = com.bytedance.sdk.openadsdk.ROR.fl.Qhi(str, str2);
            if (Qhi2 != null) {
                try {
                    Qhi2.close();
                } catch (IOException e10) {
                    ABk.Qhi("TTAppOpenAdCacheManager", e10.getMessage());
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (com.bytedance.sdk.openadsdk.ROR.fl.Qhi(str, str2, cJ2.getParent())) {
                    return true;
                }
                if (new File(cJ2.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z10;
        } catch (Exception e11) {
            ABk.Qhi("TTAppOpenAdCacheManager", e11.getMessage());
            return false;
        }
    }

    public void Qhi(File file) {
        try {
            this.cJ.Qhi(file);
        } catch (IOException e10) {
            ABk.Qhi("TTAppOpenAdCacheManager", "trimFileCache fail", e10);
        }
    }

    public void Qhi() {
        File[] listFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.CJ.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.ROR.8
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    if (!name.contains("openad_image_cache") && !name.contains("openad_video_cache")) {
                        return false;
                    }
                    return true;
                }
            })) == null) {
                return;
            }
            for (File file : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.ROR.ac(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
