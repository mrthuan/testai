package com.bytedance.sdk.component.fl.ac;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.adjust.sdk.network.ErrorCodes;
import com.bytedance.sdk.component.fl.CJ.iMK;
import com.bytedance.sdk.component.fl.CJ.pA;
import com.bytedance.sdk.component.fl.Gm;
import com.bytedance.sdk.component.fl.HzH;
import com.bytedance.sdk.component.fl.WAv;
import com.bytedance.sdk.component.fl.qMt;
import com.bytedance.sdk.component.fl.zc;
import com.facebook.ads.AdError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: ImageRequest.java */
/* loaded from: classes.dex */
public class ac implements WAv {
    private volatile boolean ABk;
    private String CJ;
    private com.bytedance.sdk.component.fl.cJ CQU;
    private com.bytedance.sdk.component.fl.ac.Qhi Dww;
    private int EBS;
    private int Eh;
    private int Gm;
    private int HzH;
    private boolean MQ;
    private ExecutorService NFd;
    Future<?> Qhi;
    private Bitmap.Config ROR;
    private int Sf;
    private ImageView.ScaleType Tgh;
    private com.bytedance.sdk.component.fl.hm WAv;
    private boolean aP;

    /* renamed from: ac  reason: collision with root package name */
    private String f8402ac;
    private ROR bxS;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private HzH f8403fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8404hm;
    private qMt hpZ;
    private boolean iMK;
    private Queue<pA> kYc;
    private com.bytedance.sdk.component.fl.pA lB;
    private boolean pA;
    private int pM;
    private com.bytedance.sdk.component.fl.Sf qMt;
    private boolean sDy;
    private final Handler tP;

    /* renamed from: zc  reason: collision with root package name */
    private WeakReference<ImageView> f8405zc;

    /* compiled from: ImageRequest.java */
    /* loaded from: classes.dex */
    public class Qhi implements HzH {
        private HzH cJ;

        public Qhi(HzH hzH) {
            this.cJ = hzH;
        }

        @Override // com.bytedance.sdk.component.fl.HzH
        public void Qhi(final zc zcVar) {
            Bitmap Qhi;
            final ImageView imageView = (ImageView) ac.this.f8405zc.get();
            if (imageView != null && ac.this.Gm != 3 && Qhi(imageView) && (zcVar.cJ() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) zcVar.cJ();
                ac.this.tP.post(new Runnable() { // from class: com.bytedance.sdk.component.fl.ac.ac.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (ac.this.WAv != null && (zcVar.cJ() instanceof Bitmap) && (Qhi = ac.this.WAv.Qhi((Bitmap) zcVar.cJ())) != null) {
                    zcVar.Qhi(Qhi);
                }
            } catch (Throwable unused) {
            }
            if (ac.this.HzH == 5) {
                ac.this.tP.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fl.ac.ac.Qhi.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Qhi.this.cJ != null) {
                            Qhi.this.cJ.Qhi(zcVar);
                        }
                    }
                });
                return;
            }
            HzH hzH = this.cJ;
            if (hzH != null) {
                hzH.Qhi(zcVar);
            }
        }

        private boolean Qhi(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(ac.this.f8402ac)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.fl.HzH
        public void Qhi(final int i10, final String str, final Throwable th2) {
            if (ac.this.HzH == 5) {
                ac.this.tP.post(new Runnable() { // from class: com.bytedance.sdk.component.fl.ac.ac.Qhi.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Qhi.this.cJ != null) {
                            Qhi.this.cJ.Qhi(i10, str, th2);
                        }
                    }
                });
                return;
            }
            HzH hzH = this.cJ;
            if (hzH != null) {
                hzH.Qhi(i10, str, th2);
            }
        }
    }

    /* compiled from: ImageRequest.java */
    /* loaded from: classes.dex */
    public static class cJ implements Gm {
        private boolean ABk;
        private String CJ;
        private boolean EBS;
        private qMt Gm;
        private com.bytedance.sdk.component.fl.hm HzH;
        private boolean MQ;
        private HzH Qhi;
        private int ROR;
        private int Sf;
        private Bitmap.Config Tgh;

        /* renamed from: ac  reason: collision with root package name */
        private String f8408ac;
        private com.bytedance.sdk.component.fl.pA bxS;
        private ImageView cJ;

        /* renamed from: fl  reason: collision with root package name */
        private ImageView.ScaleType f8409fl;
        private ROR hpZ;
        private String iMK;
        private int kYc;
        private com.bytedance.sdk.component.fl.cJ pA;
        private ExecutorService qMt;
        private int tP;

        /* renamed from: zc  reason: collision with root package name */
        private boolean f8411zc;

        /* renamed from: hm  reason: collision with root package name */
        private int f8410hm = 1;
        private int WAv = 5;

        public cJ(ROR ror) {
            this.hpZ = ror;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm CJ(int i10) {
            this.kYc = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm Qhi(String str) {
            this.f8408ac = str;
            return this;
        }

        public Gm ac(String str) {
            this.CJ = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm cJ(int i10) {
            this.Sf = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm fl(int i10) {
            this.tP = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm Qhi(ImageView.ScaleType scaleType) {
            this.f8409fl = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm ac(int i10) {
            this.f8410hm = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm cJ(String str) {
            this.iMK = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm Qhi(Bitmap.Config config) {
            this.Tgh = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm Qhi(int i10) {
            this.ROR = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm Qhi(qMt qmt) {
            this.Gm = qmt;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm Qhi(boolean z10) {
            this.ABk = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public WAv Qhi(HzH hzH, int i10) {
            this.WAv = i10;
            return Qhi(hzH);
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public WAv Qhi(HzH hzH) {
            this.Qhi = hzH;
            return new ac(this).Dww();
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public WAv Qhi(ImageView imageView) {
            this.cJ = imageView;
            return new ac(this).Dww();
        }

        @Override // com.bytedance.sdk.component.fl.Gm
        public Gm Qhi(com.bytedance.sdk.component.fl.hm hmVar) {
            this.HzH = hmVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WAv Dww() {
        ROR ror;
        ExecutorService executorService;
        try {
            ror = this.bxS;
            executorService = null;
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (ror == null) {
            HzH hzH = this.f8403fl;
            if (hzH != null) {
                hzH.Qhi(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, "not init !", null);
            }
            return this;
        }
        if (this.NFd == null) {
            executorService = ror.Tgh();
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fl.ac.ac.1
            @Override // java.lang.Runnable
            public void run() {
                pA pAVar;
                while (!ac.this.ABk && (pAVar = (pA) ac.this.kYc.poll()) != null) {
                    try {
                        if (ac.this.hpZ != null) {
                            ac.this.hpZ.Qhi(pAVar.Qhi(), ac.this);
                        }
                        pAVar.Qhi(ac.this);
                        if (ac.this.hpZ != null) {
                            ac.this.hpZ.cJ(pAVar.Qhi(), ac.this);
                        }
                    } catch (Throwable th2) {
                        ac.this.Qhi(AdError.SERVER_ERROR_CODE, th2.getMessage(), th2);
                        if (ac.this.hpZ != null) {
                            ac.this.hpZ.cJ("exception", ac.this);
                            return;
                        }
                        return;
                    }
                }
                if (ac.this.ABk) {
                    ac.this.Qhi(ErrorCodes.MALFORMED_URL_EXCEPTION, "canceled", null);
                }
            }
        };
        if (this.sDy) {
            runnable.run();
        } else {
            ExecutorService executorService2 = this.NFd;
            if (executorService2 != null) {
                this.Qhi = executorService2.submit(runnable);
            } else if (executorService != null) {
                this.Qhi = executorService.submit(runnable);
            }
        }
        return this;
    }

    public boolean ABk() {
        return this.iMK;
    }

    public com.bytedance.sdk.component.fl.pA EBS() {
        return this.lB;
    }

    public Bitmap.Config Gm() {
        return this.ROR;
    }

    public int HzH() {
        return this.EBS;
    }

    public com.bytedance.sdk.component.fl.cJ MQ() {
        return this.CQU;
    }

    public String bxS() {
        return fl() + zc();
    }

    public com.bytedance.sdk.component.fl.Sf hpZ() {
        return this.qMt;
    }

    public boolean iMK() {
        return this.pA;
    }

    public com.bytedance.sdk.component.fl.ac.Qhi kYc() {
        return this.Dww;
    }

    public boolean pA() {
        return this.MQ;
    }

    public boolean qMt() {
        return this.aP;
    }

    public ROR tP() {
        return this.bxS;
    }

    public int zc() {
        return this.Gm;
    }

    private ac(cJ cJVar) {
        this.kYc = new LinkedBlockingQueue();
        this.tP = new Handler(Looper.getMainLooper());
        this.MQ = true;
        this.cJ = cJVar.CJ;
        this.f8403fl = new Qhi(cJVar.Qhi);
        this.f8405zc = new WeakReference<>(cJVar.cJ);
        this.Tgh = cJVar.f8409fl;
        this.ROR = cJVar.Tgh;
        this.Sf = cJVar.ROR;
        this.f8404hm = cJVar.Sf;
        this.Gm = cJVar.f8410hm;
        this.HzH = cJVar.WAv;
        this.hpZ = cJVar.Gm;
        this.CQU = Qhi(cJVar);
        if (!TextUtils.isEmpty(cJVar.f8408ac)) {
            cJ(cJVar.f8408ac);
            Qhi(cJVar.f8408ac);
        }
        this.iMK = cJVar.f8411zc;
        this.pA = cJVar.ABk;
        this.bxS = cJVar.hpZ;
        this.WAv = cJVar.HzH;
        this.Eh = cJVar.tP;
        this.pM = cJVar.kYc;
        this.NFd = cJVar.qMt;
        this.aP = cJVar.MQ;
        this.sDy = cJVar.EBS;
        this.lB = cJVar.bxS;
        this.kYc.add(new com.bytedance.sdk.component.fl.CJ.hm());
    }

    @Override // com.bytedance.sdk.component.fl.WAv
    public ImageView.ScaleType CJ() {
        return this.Tgh;
    }

    public int ROR() {
        return this.pM;
    }

    public int Sf() {
        return this.Eh;
    }

    @Override // com.bytedance.sdk.component.fl.WAv
    public Bitmap.Config Tgh() {
        return this.ROR;
    }

    public String WAv() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.component.fl.WAv
    public int ac() {
        return this.f8404hm;
    }

    public void cJ(String str) {
        WeakReference<ImageView> weakReference = this.f8405zc;
        if (weakReference != null && weakReference.get() != null) {
            this.f8405zc.get().setTag(1094453505, str);
        }
        this.f8402ac = str;
    }

    @Override // com.bytedance.sdk.component.fl.WAv
    public String fl() {
        return this.f8402ac;
    }

    public HzH hm() {
        return this.f8403fl;
    }

    private com.bytedance.sdk.component.fl.cJ Qhi(cJ cJVar) {
        if (cJVar.pA != null) {
            return cJVar.pA;
        }
        if (!TextUtils.isEmpty(cJVar.iMK)) {
            return com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi(new File(cJVar.iMK));
        }
        return com.bytedance.sdk.component.fl.ac.Qhi.Qhi.ROR();
    }

    @Override // com.bytedance.sdk.component.fl.WAv
    public int cJ() {
        return this.Sf;
    }

    @Override // com.bytedance.sdk.component.fl.WAv
    public String Qhi() {
        return this.cJ;
    }

    public void Qhi(String str) {
        this.CJ = str;
    }

    public void Qhi(boolean z10) {
        this.MQ = z10;
    }

    public void Qhi(com.bytedance.sdk.component.fl.Sf sf2) {
        this.qMt = sf2;
    }

    public void Qhi(int i10) {
        this.EBS = i10;
    }

    public void Qhi(com.bytedance.sdk.component.fl.ac.Qhi qhi) {
        this.Dww = qhi;
    }

    public boolean Qhi(pA pAVar) {
        if (this.ABk) {
            return false;
        }
        return this.kYc.add(pAVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(int i10, String str, Throwable th2) {
        new iMK(i10, str, th2).Qhi(this);
        this.kYc.clear();
    }
}
