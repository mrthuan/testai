package com.bykv.vk.openvk.component.video.Qhi.CJ;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ;
import com.bykv.vk.openvk.component.video.api.Qhi;
import com.bykv.vk.openvk.component.video.api.ac.ac;
import com.bykv.vk.openvk.component.video.api.cJ;
import com.bytedance.sdk.component.Sf.WAv;
import com.bytedance.sdk.component.utils.CQU;
import com.google.android.gms.common.api.Api;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SSMediaPlayerWrapper.java */
/* loaded from: classes.dex */
public class HzH implements hpZ.Qhi, hpZ.ROR, hpZ.Sf, hpZ.Tgh, hpZ.ac, hpZ.cJ, hpZ.fl, com.bykv.vk.openvk.component.video.api.Qhi, CQU.Qhi {
    private static final SparseIntArray Dww = new SparseIntArray();
    private CQU ABk;
    private int CJ;
    private boolean CQU;
    private boolean MQ;
    private SurfaceTexture Qhi;
    private boolean WAv;
    private SurfaceHolder cJ;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f7106hm;
    private ArrayList<Runnable> qMt;

    /* renamed from: zn  reason: collision with root package name */
    private volatile boolean f7108zn;

    /* renamed from: ac  reason: collision with root package name */
    private int f7104ac = 0;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f7105fl = false;
    private volatile hpZ Tgh = null;
    private final boolean ROR = false;
    private boolean Sf = false;
    private volatile int Gm = 201;

    /* renamed from: zc  reason: collision with root package name */
    private long f7107zc = -1;
    private boolean iMK = false;
    private long pA = 0;
    private long hpZ = Long.MIN_VALUE;
    private long HzH = 0;
    private long kYc = 0;
    private long tP = 0;
    private int EBS = 0;
    private String bxS = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
    private final List<WeakReference<Qhi.InterfaceC0062Qhi>> pM = new CopyOnWriteArrayList();
    private ac Eh = null;
    private boolean aP = false;
    private CountDownLatch NFd = new CountDownLatch(1);
    private volatile int sDy = 200;
    private AtomicBoolean lB = new AtomicBoolean(false);
    private Surface lG = null;
    private final Runnable Jma = new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.1
        @Override // java.lang.Runnable
        public void run() {
            if (HzH.this.Tgh == null) {
                return;
            }
            long HzH = HzH.this.HzH();
            if (HzH > 0 && HzH.this.Tgh() && HzH.this.hpZ != Long.MIN_VALUE) {
                try {
                    if (HzH.this.hpZ == HzH) {
                        if (!HzH.this.iMK && HzH.this.HzH >= 400) {
                            HzH.this.cJ(701, (int) OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD);
                            HzH.this.iMK = true;
                        }
                        HzH.this.HzH += HzH.this.sDy;
                    } else {
                        if (HzH.this.iMK) {
                            HzH.this.pA += HzH.this.HzH;
                            HzH.this.cJ(702, (int) OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD);
                            long unused = HzH.this.pA;
                            int unused2 = HzH.this.f7104ac;
                        }
                        HzH.this.HzH = 0L;
                        HzH.this.iMK = false;
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            if (HzH.this.hpZ() > 0) {
                if (HzH.this.hpZ != HzH) {
                    if (com.bykv.vk.openvk.component.video.api.ac.fl()) {
                        long unused3 = HzH.this.hpZ;
                    }
                    HzH hzH = HzH.this;
                    hzH.Qhi(HzH, hzH.hpZ());
                }
                HzH.this.hpZ = HzH;
            }
            if (!HzH.this.cJ()) {
                if (HzH.this.ABk != null) {
                    HzH.this.ABk.postDelayed(this, HzH.this.sDy);
                    return;
                }
                return;
            }
            HzH hzH2 = HzH.this;
            hzH2.Qhi(hzH2.hpZ(), HzH.this.hpZ());
        }
    };
    private final Qhi js = new Qhi();
    private long es = 0;
    private long yN = 0;
    private boolean FQ = false;

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    public class Qhi implements Runnable {

        /* renamed from: ac  reason: collision with root package name */
        private boolean f7109ac;
        private long cJ;

        public Qhi() {
        }

        public void Qhi(boolean z10) {
            this.f7109ac = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HzH.this.Tgh != null) {
                try {
                    if (!this.f7109ac) {
                        long hm2 = HzH.this.Tgh.hm();
                        HzH.this.f7107zc = Math.max(this.cJ, hm2);
                    }
                    long unused = HzH.this.f7107zc;
                } catch (Throwable th2) {
                    th2.toString();
                }
            }
            if (HzH.this.ABk != null) {
                HzH.this.ABk.sendEmptyMessageDelayed(100, 0L);
            }
        }

        public void Qhi(long j10) {
            this.cJ = j10;
        }
    }

    public HzH() {
        Qhi("SSMediaPlayerWrapper");
    }

    private void CQU() {
        SparseIntArray sparseIntArray = Dww;
        Integer valueOf = Integer.valueOf(sparseIntArray.get(this.EBS));
        if (valueOf == null) {
            sparseIntArray.put(this.EBS, 1);
        } else {
            sparseIntArray.put(this.EBS, valueOf.intValue() + 1);
        }
    }

    private void Dww() {
        CQU cqu = this.ABk;
        if (cqu != null && cqu.getLooper() != null) {
            this.ABk.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.6
                @Override // java.lang.Runnable
                public void run() {
                    if (HzH.this.ABk != null && HzH.this.ABk.getLooper() != null) {
                        try {
                            com.bytedance.sdk.component.Sf.Qhi.Qhi.Qhi().Qhi(HzH.this.ABk);
                            HzH.this.ABk = null;
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    private void EBS() {
        cJ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.14
            @Override // java.lang.Runnable
            public void run() {
                if (HzH.this.ABk != null) {
                    HzH.this.ABk.sendEmptyMessage(104);
                }
            }
        });
    }

    private void Eh() {
        CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        HzH.this.Tgh.ROR();
                        HzH.this.Gm = 207;
                        HzH.this.f7108zn = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void MQ() {
        this.pA = 0L;
        this.f7104ac = 0;
        this.HzH = 0L;
        this.iMK = false;
        this.hpZ = Long.MIN_VALUE;
    }

    private void NFd() {
        boolean z10;
        ArrayList<Runnable> arrayList = this.qMt;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        aP();
    }

    private boolean Qhi(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    private void aP() {
        if (this.f7106hm) {
            return;
        }
        this.f7106hm = true;
        Iterator it = new ArrayList(this.qMt).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.qMt.clear();
        this.f7106hm = false;
    }

    private void bxS() {
        if (this.Tgh == null) {
            return;
        }
        try {
            this.Tgh.zc();
        } catch (Throwable unused) {
        }
        this.Tgh.Qhi((hpZ.cJ) null);
        this.Tgh.Qhi((hpZ.Sf) null);
        this.Tgh.Qhi((hpZ.Qhi) null);
        this.Tgh.Qhi((hpZ.fl) null);
        this.Tgh.Qhi((hpZ.ac) null);
        this.Tgh.Qhi((hpZ.Tgh) null);
        this.Tgh.Qhi((hpZ.ROR) null);
        try {
            this.Tgh.Gm();
        } catch (Throwable unused2) {
        }
    }

    private void pM() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.tP;
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Qhi(this, elapsedRealtime);
            }
        }
        this.f7105fl = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qMt() {
        CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.10
                @Override // java.lang.Runnable
                public void run() {
                    if (HzH.this.Tgh == null) {
                        try {
                            HzH.this.Tgh = new pA();
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                        if (HzH.this.Tgh != null) {
                            hpZ unused = HzH.this.Tgh;
                            HzH.this.bxS = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                            HzH.this.Tgh.Qhi((hpZ.Tgh) HzH.this);
                            HzH.this.Tgh.Qhi((hpZ.cJ) HzH.this);
                            HzH.this.Tgh.Qhi((hpZ.ac) HzH.this);
                            HzH.this.Tgh.Qhi((hpZ.Qhi) HzH.this);
                            HzH.this.Tgh.Qhi((hpZ.ROR) HzH.this);
                            HzH.this.Tgh.Qhi((hpZ.fl) HzH.this);
                            HzH.this.Tgh.Qhi((hpZ.Sf) HzH.this);
                            try {
                                HzH.this.Tgh.ac(false);
                            } catch (Throwable unused2) {
                            }
                            HzH.this.Sf = false;
                        }
                    }
                }
            });
        }
    }

    private void sDy() {
        ArrayList<Runnable> arrayList = this.qMt;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.qMt.clear();
        }
    }

    public boolean ABk() {
        if (this.Gm == 205) {
            return true;
        }
        return false;
    }

    public long HzH() {
        if (Sf()) {
            return 0L;
        }
        if (this.Gm == 206 || this.Gm == 207) {
            try {
                return this.Tgh.hm();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public long hpZ() {
        long j10 = this.kYc;
        if (j10 != 0) {
            return j10;
        }
        if (this.Gm == 206 || this.Gm == 207) {
            try {
                this.kYc = this.Tgh.WAv();
            } catch (Throwable unused) {
            }
        }
        return this.kYc;
    }

    public long iMK() {
        if (this.iMK) {
            long j10 = this.HzH;
            if (j10 > 0) {
                return this.pA + j10;
            }
        }
        return this.pA;
    }

    public SurfaceHolder kYc() {
        return this.cJ;
    }

    public int pA() {
        return this.f7104ac;
    }

    public SurfaceTexture tP() {
        return this.Qhi;
    }

    public void zc() {
        if (Sf()) {
            return;
        }
        this.WAv = true;
        sDy();
        CQU cqu = this.ABk;
        if (cqu != null) {
            try {
                cqu.removeCallbacksAndMessages(null);
                if (this.Tgh != null) {
                    this.ABk.sendEmptyMessage(103);
                }
                Dww();
            } catch (Throwable unused) {
                Dww();
            }
        }
    }

    public void Gm() {
        CQU cqu;
        if (Sf() || (cqu = this.ABk) == null) {
            return;
        }
        cqu.removeMessages(100);
        this.f7108zn = true;
        if (!this.FQ) {
            if (!this.MQ && !cJ(this.Eh)) {
                Qhi(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (HzH.this.ABk != null) {
                            HzH.this.ABk.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            CQU cqu2 = this.ABk;
            if (cqu2 != null) {
                cqu2.sendEmptyMessage(101);
            }
        } else if (!this.f7105fl && !cJ(this.Eh)) {
            Qhi(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.13
                @Override // java.lang.Runnable
                public void run() {
                    if (HzH.this.ABk != null) {
                        HzH.this.ABk.sendEmptyMessage(101);
                    }
                }
            });
        } else {
            CQU cqu3 = this.ABk;
            if (cqu3 != null) {
                cqu3.sendEmptyMessage(101);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public boolean ROR() {
        CQU cqu;
        return ((this.Gm != 207 && !this.f7108zn) || (cqu = this.ABk) == null || cqu.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public boolean Sf() {
        return this.WAv;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public boolean Tgh() {
        CQU cqu;
        return (this.Gm == 206 || ((cqu = this.ABk) != null && cqu.hasMessages(100))) && !this.f7108zn;
    }

    public void WAv() {
        if (Sf() || this.ABk == null) {
            return;
        }
        this.lB.set(true);
        this.ABk.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.11
            @Override // java.lang.Runnable
            public void run() {
                if (HzH.this.ROR() && HzH.this.Tgh != null) {
                    try {
                        HzH.this.Tgh.fl();
                        for (WeakReference weakReference : HzH.this.pM) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((Qhi.InterfaceC0062Qhi) weakReference.get()).fl(HzH.this);
                            }
                        }
                        HzH.this.Gm = 206;
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public int fl() {
        if (this.Tgh == null || Sf()) {
            return 0;
        }
        return this.Tgh.iMK();
    }

    public void hm() {
        if (Sf() || this.Tgh == null) {
            return;
        }
        this.lB.set(true);
        if (this.Gm != 206) {
            MQ();
            this.f7108zn = false;
            this.js.Qhi(true);
            cJ(0L);
            CQU cqu = this.ABk;
            if (cqu != null) {
                cqu.removeCallbacks(this.Jma);
                this.ABk.postDelayed(this.Jma, this.sDy);
            }
        }
        this.NFd.countDown();
    }

    private void cJ(long j10) {
        this.js.Qhi(j10);
        if (this.CQU) {
            cJ(this.js);
        } else if (cJ(this.Eh)) {
            cJ(this.js);
        } else {
            Qhi(this.js);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public int CJ() {
        if (this.Tgh == null || Sf()) {
            return 0;
        }
        return this.Tgh.ABk();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public boolean ac() {
        return ABk() || Tgh() || ROR();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ.ROR
    public void ac(hpZ hpz) {
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Qhi((com.bykv.vk.openvk.component.video.api.Qhi) this, true);
            }
        }
    }

    private boolean cJ(ac acVar) {
        return acVar != null && acVar.CJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(long j10, long j11) {
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Qhi(this, j10, j11);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public boolean cJ() {
        return this.Gm == 209;
    }

    private void cJ(String str) {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.Tgh.Qhi(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void Qhi(String str) {
        this.EBS = 0;
        this.ABk = com.bytedance.sdk.component.Sf.Qhi.Qhi.Qhi().Qhi(this, WAv.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.FQ = true;
        qMt();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ.fl
    public boolean cJ(hpZ hpz, int i10, int i11) {
        if (this.Tgh != hpz) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.component.video.api.ac.Qhi qhi = new com.bykv.vk.openvk.component.video.api.ac.Qhi(i10, i11);
            for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().Qhi(this, qhi);
                }
            }
        }
        cJ(i10, i11);
        return false;
    }

    public void Qhi(final boolean z10) {
        if (Sf()) {
            return;
        }
        this.CQU = z10;
        if (this.Tgh != null) {
            this.Tgh.Qhi(z10);
            return;
        }
        CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.9
                @Override // java.lang.Runnable
                public void run() {
                    if (HzH.this.Tgh != null) {
                        HzH.this.Tgh.Qhi(z10);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(int i10, int i11) {
        if (i10 == 701) {
            this.es = SystemClock.elapsedRealtime();
            this.f7104ac++;
            for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().Qhi(this, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
                }
            }
        } else if (i10 == 702) {
            if (this.es > 0) {
                this.yN = (SystemClock.elapsedRealtime() - this.es) + this.yN;
                this.es = 0L;
            }
            for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference2 : this.pM) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().Qhi((com.bykv.vk.openvk.component.video.api.Qhi) this, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            }
        } else if (this.FQ && i10 == 3) {
            NFd();
            pM();
            cJ(this.aP);
        }
    }

    public void Qhi(boolean z10, long j10, boolean z11) {
        if (Sf()) {
            return;
        }
        qMt();
        this.aP = z11;
        this.lB.set(true);
        this.f7108zn = false;
        cJ(z11);
        if (z10) {
            this.f7107zc = j10;
            EBS();
        } else {
            cJ(j10);
        }
        CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.removeCallbacks(this.Jma);
            this.ABk.postDelayed(this.Jma, this.sDy);
        }
        this.NFd.countDown();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ.Tgh
    public void cJ(hpZ hpz) {
        if (Sf()) {
            return;
        }
        this.Gm = 205;
        try {
            ac acVar = this.Eh;
            if (acVar != null) {
                float zc2 = acVar.zc();
                if (zc2 > 0.0f) {
                    cJ cJVar = new cJ();
                    cJVar.Qhi(zc2);
                    this.Tgh.Qhi(cJVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.ABk != null) {
            if (this.f7108zn) {
                Eh();
            } else {
                CQU cqu = this.ABk;
                cqu.sendMessage(cqu.obtainMessage(100, -1, -1));
            }
        }
        Dww.delete(this.EBS);
        boolean z10 = this.FQ;
        boolean z11 = this.MQ;
        if (!z10 && !z11) {
            pM();
            this.MQ = true;
        }
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().cJ(this);
            }
        }
    }

    public void Qhi(final long j10) {
        if (Sf()) {
            return;
        }
        if (this.Gm == 207 || this.Gm == 206 || this.Gm == 209) {
            cJ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.2
                @Override // java.lang.Runnable
                public void run() {
                    if (HzH.this.ABk != null) {
                        HzH.this.ABk.obtainMessage(106, Long.valueOf(j10)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Qhi
    public boolean Qhi() {
        return this.f7105fl;
    }

    public void Qhi(final SurfaceTexture surfaceTexture) {
        if (Sf()) {
            return;
        }
        this.Qhi = surfaceTexture;
        Qhi(true);
        cJ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.3
            @Override // java.lang.Runnable
            public void run() {
                HzH.this.qMt();
                if (HzH.this.ABk != null) {
                    HzH.this.ABk.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void Qhi(final SurfaceHolder surfaceHolder) {
        if (Sf()) {
            return;
        }
        this.cJ = surfaceHolder;
        Qhi(true);
        cJ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.4
            @Override // java.lang.Runnable
            public void run() {
                HzH.this.qMt();
                if (HzH.this.ABk != null) {
                    HzH.this.ABk.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void Qhi(final ac acVar) {
        if (Sf()) {
            return;
        }
        this.Eh = acVar;
        if (acVar != null) {
            this.FQ = this.FQ && !acVar.CJ();
        }
        cJ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.5
            @Override // java.lang.Runnable
            public void run() {
                HzH.this.qMt();
                if (HzH.this.ABk != null) {
                    HzH.this.ABk.obtainMessage(107, acVar).sendToTarget();
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.Qhi(android.os.Message):void");
    }

    private void cJ(Runnable runnable) {
        if (runnable == null || Sf()) {
            return;
        }
        if (!this.WAv) {
            runnable.run();
        } else {
            Qhi(runnable);
        }
    }

    public void cJ(final boolean z10) {
        CQU cqu;
        if (Sf() || (cqu = this.ABk) == null) {
            return;
        }
        cqu.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.CJ.HzH.8
            @Override // java.lang.Runnable
            public void run() {
                if (!HzH.this.Sf() && HzH.this.Tgh != null) {
                    try {
                        HzH.this.aP = z10;
                        HzH.this.Tgh.CJ(z10);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public void cJ(int i10) {
        this.CJ = i10;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ.Qhi
    public void Qhi(hpZ hpz, int i10) {
        if (this.Tgh != hpz) {
            return;
        }
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().cJ(this, i10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ.cJ
    public void Qhi(hpZ hpz) {
        this.Gm = 209;
        Dww.delete(this.EBS);
        CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.removeCallbacks(this.Jma);
        }
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Qhi(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ.ac
    public boolean Qhi(hpZ hpz, int i10, int i11) {
        CQU();
        this.Gm = 200;
        CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.removeCallbacks(this.Jma);
        }
        if (Qhi(i10, i11)) {
            Dww();
        }
        if (this.lB.get()) {
            this.lB.set(false);
            com.bykv.vk.openvk.component.video.api.ac.Qhi qhi = new com.bykv.vk.openvk.component.video.api.ac.Qhi(i10, i11);
            for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().Qhi(this, qhi);
                }
            }
            return true;
        }
        return true;
    }

    private void Qhi(Runnable runnable) {
        try {
            if (this.qMt == null) {
                this.qMt = new ArrayList<>();
            }
            this.qMt.add(runnable);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ.Sf
    public void Qhi(hpZ hpz, int i10, int i11, int i12, int i13) {
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Qhi((com.bykv.vk.openvk.component.video.api.Qhi) this, i10, i11);
            }
        }
    }

    public void Qhi(Qhi.InterfaceC0062Qhi interfaceC0062Qhi) {
        if (interfaceC0062Qhi == null) {
            return;
        }
        for (WeakReference<Qhi.InterfaceC0062Qhi> weakReference : this.pM) {
            if (weakReference != null && weakReference.get() == interfaceC0062Qhi) {
                return;
            }
        }
        this.pM.add(new WeakReference<>(interfaceC0062Qhi));
    }

    public void Qhi(int i10) {
        if (Sf()) {
            return;
        }
        this.sDy = i10;
    }
}
