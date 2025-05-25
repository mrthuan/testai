package com.bytedance.sdk.component.adexpress.Qhi.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.CJ.qMt;
import com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.kYc;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TemplateManager.java */
/* loaded from: classes.dex */
public class Tgh extends ac {
    private static File Qhi;
    private static volatile Tgh cJ;

    /* renamed from: ac  reason: collision with root package name */
    private AtomicBoolean f8135ac = new AtomicBoolean(true);
    private AtomicBoolean CJ = new AtomicBoolean(false);

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8136fl = false;
    private AtomicBoolean Tgh = new AtomicBoolean(false);
    private AtomicInteger ROR = new AtomicInteger(0);
    private AtomicLong Sf = new AtomicLong();

    private Tgh() {
        WAv();
    }

    private void Gm() {
        if (this.ROR.getAndSet(0) > 0 && System.currentTimeMillis() - this.Sf.get() > TTAdConstant.AD_MAX_EVENT_TIME) {
            ROR();
        }
    }

    public static File Sf() {
        if (Qhi == null) {
            try {
                File file = new File(new File(fl.Qhi(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                Qhi = file;
            } catch (Throwable th2) {
                ABk.Qhi("TemplateManager", "getTemplateDir error", th2);
            }
        }
        return Qhi;
    }

    private void WAv() {
        qMt.cJ(new com.bytedance.sdk.component.Sf.hm("init") { // from class: com.bytedance.sdk.component.adexpress.Qhi.cJ.Tgh.1
            @Override // java.lang.Runnable
            public void run() {
                hm.Qhi();
                Tgh.this.f8135ac.set(false);
                Tgh.this.CJ();
                Tgh.this.ROR();
                if (com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac() != null && kYc.Qhi(com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().cJ())) {
                    com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().ac().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Qhi.cJ.Tgh.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac() != null) {
                                com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().CJ();
                            }
                        }
                    });
                }
            }
        }, 10);
    }

    public static Tgh cJ() {
        if (cJ == null) {
            synchronized (Tgh.class) {
                if (cJ == null) {
                    cJ = new Tgh();
                }
            }
        }
        return cJ;
    }

    public void CJ() {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi cJ2 = hm.cJ();
        if (cJ2 != null && cJ2.ROR()) {
            boolean Qhi2 = Qhi(cJ2);
            if (!Qhi2) {
                hm.CJ();
            }
            this.f8136fl = Qhi2;
        }
    }

    public void ROR() {
        Qhi(false);
    }

    public com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi Tgh() {
        return hm.cJ();
    }

    public void ac() {
        WAv();
    }

    public boolean fl() {
        return this.f8136fl;
    }

    public void hm() {
        this.Tgh.set(true);
        this.f8136fl = false;
        this.CJ.set(false);
    }

    public boolean Qhi(com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi) {
        if (qhi == null) {
            return false;
        }
        return Qhi(qhi.Qhi()) || Qhi(qhi.fl()) || Qhi(qhi.Tgh());
    }

    @Override // com.bytedance.sdk.component.adexpress.Qhi.cJ.ac
    public File Qhi() {
        return Sf();
    }

    public void Qhi(boolean z10) {
        List<Qhi.C0084Qhi> list;
        boolean z11;
        if (this.f8135ac.get()) {
            return;
        }
        try {
            if (this.CJ.get()) {
                if (z10) {
                    this.ROR.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z12 = true;
            this.CJ.set(true);
            com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi fl2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().fl();
            com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi cJ2 = hm.cJ();
            if (fl2 != null && fl2.ROR()) {
                if (!hm.cJ(fl2)) {
                    this.CJ.set(false);
                    this.Sf.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac() != null) {
                    com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac().ac().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Qhi.cJ.Tgh.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.fl.Tgh.Qhi().cJ();
                        }
                    });
                }
                hm.Qhi(fl2);
                boolean Qhi2 = (fl2.fl() == null || TextUtils.isEmpty(fl2.fl().Qhi())) ? false : Qhi(fl2.fl().Qhi());
                if (fl2.Qhi().size() != 0) {
                    list = Qhi(fl2, cJ2);
                    z11 = list != null;
                } else {
                    list = null;
                    z11 = Qhi2;
                }
                if (!Qhi2) {
                    List<Qhi.C0084Qhi> cJ3 = cJ(fl2, cJ2);
                    if (list == null || cJ3 == null) {
                        list = cJ3;
                    } else {
                        list.addAll(cJ3);
                    }
                    if (cJ3 == null) {
                        z12 = false;
                    }
                    if (cJ3 == null) {
                        this.CJ.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && Qhi(fl2)) {
                    hm.Qhi(fl2);
                    hm.ac();
                    cJ(list);
                }
                CJ();
                this.CJ.set(false);
                this.Sf.set(System.currentTimeMillis());
                Gm();
                return;
            }
            this.CJ.set(false);
            Qhi(109);
        } catch (Throwable unused) {
        }
    }

    public void cJ(boolean z10) {
        this.Tgh.set(z10);
    }
}
