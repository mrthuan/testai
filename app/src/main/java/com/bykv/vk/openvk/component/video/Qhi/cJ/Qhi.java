package com.bykv.vk.openvk.component.video.Qhi.cJ;

import com.bykv.vk.openvk.component.video.Qhi.cJ.ABk;
import com.bykv.vk.openvk.component.video.Qhi.cJ.WAv;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsTask.java */
/* loaded from: classes.dex */
public abstract class Qhi implements zc {
    private static final AtomicLong ABk = new AtomicLong();
    protected volatile com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi Qhi;
    protected volatile String ROR;
    protected volatile String Sf;
    protected volatile List<WAv.cJ> Tgh;
    protected volatile ABk WAv;
    protected final com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected com.bykv.vk.openvk.component.video.Qhi.cJ.CJ.Tgh f7131fl;

    /* renamed from: hm  reason: collision with root package name */
    protected volatile WAv f7132hm;

    /* renamed from: ac  reason: collision with root package name */
    protected final AtomicInteger f7130ac = new AtomicInteger();
    protected final AtomicLong CJ = new AtomicLong();
    protected volatile boolean Gm = false;

    /* renamed from: zc  reason: collision with root package name */
    public final long f7133zc = ABk.incrementAndGet();
    private final AtomicInteger iMK = new AtomicInteger(0);
    private int pA = -1;

    public Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi qhi, com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac acVar) {
        this.Qhi = qhi;
        this.cJ = acVar;
    }

    public boolean CJ() {
        if (this.iMK.get() == 2) {
            return true;
        }
        return false;
    }

    public boolean ROR() {
        if (Tgh() == 1) {
            return true;
        }
        return false;
    }

    public int Tgh() {
        if (this.f7132hm != null) {
            return this.f7132hm.f7151ac.Qhi;
        }
        if (this.Qhi instanceof com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.cJ) {
            return 1;
        }
        return 0;
    }

    public void ac() {
        this.iMK.compareAndSet(0, 2);
    }

    public boolean cJ() {
        if (this.iMK.get() == 1) {
            return true;
        }
        return false;
    }

    public void fl() {
        if (!cJ()) {
            return;
        }
        throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.Qhi();
    }

    public void Qhi() {
        this.iMK.compareAndSet(0, 1);
    }

    public com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi Qhi(ABk.Qhi qhi, int i10, int i11, String str) {
        com.bykv.vk.openvk.component.video.Qhi.cJ.fl.cJ cJ = com.bykv.vk.openvk.component.video.Qhi.cJ.fl.ac.Qhi().cJ();
        com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Tgh tgh = new com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Tgh();
        HashMap hashMap = new HashMap();
        tgh.cJ = qhi.Qhi;
        tgh.Qhi = 0;
        if ("HEAD".equalsIgnoreCase(str)) {
            tgh.Qhi = 4;
        }
        List<WAv.cJ> list = this.Tgh;
        if (list != null && !list.isEmpty()) {
            for (WAv.cJ cJVar : list) {
                if (!"Range".equalsIgnoreCase(cJVar.Qhi) && !"Connection".equalsIgnoreCase(cJVar.Qhi) && !"Proxy-Connection".equalsIgnoreCase(cJVar.Qhi) && !"Host".equalsIgnoreCase(cJVar.Qhi)) {
                    hashMap.put(cJVar.Qhi, cJVar.cJ);
                }
            }
        }
        String Qhi = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(i10, i11);
        if (Qhi != null) {
            hashMap.put("Range", Qhi);
        }
        if (Tgh.Tgh) {
            hashMap.put("Cache-Control", "no-cache");
        }
        fl ac2 = fl.ac();
        ROR Qhi2 = ROR.Qhi();
        boolean z10 = this.f7132hm == null;
        ac Qhi3 = z10 ? ac2.Qhi() : Qhi2.cJ();
        ac cJ2 = z10 ? ac2.cJ() : Qhi2.ac();
        if (Qhi3 != null || cJ2 != null) {
            if (Qhi3 != null) {
                throw null;
            }
            if (cJ2 != null) {
                throw null;
            }
        }
        tgh.f7171fl = hashMap;
        if (this.Gm) {
            this.Gm = false;
            return null;
        }
        return cJ.Qhi(tgh);
    }

    public void Qhi(int i10, int i11) {
        if (i10 <= 0 || i11 < 0) {
            return;
        }
        int i12 = Tgh.ROR;
        int Tgh = Tgh();
        if (i12 == 1 || (i12 == 2 && Tgh == 1)) {
            int i13 = (int) ((i11 / i10) * 100.0f);
            if (i13 > 100) {
                i13 = 100;
            }
            synchronized (this) {
                if (i13 <= this.pA) {
                    return;
                }
                this.pA = i13;
                com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Qhi qhi = Qhi.this;
                        if (qhi.f7131fl != null) {
                            ABk aBk = qhi.WAv;
                            int unused = Qhi.this.pA;
                        }
                    }
                });
            }
        }
    }
}
