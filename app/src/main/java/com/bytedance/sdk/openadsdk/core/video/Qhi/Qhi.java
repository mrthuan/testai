package com.bytedance.sdk.openadsdk.core.video.Qhi;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.CJ.MQ;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.ROR.ROR;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.ac.ac;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh;
import com.bytedance.sdk.openadsdk.core.widget.Tgh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BaseController.java */
/* loaded from: classes.dex */
public abstract class Qhi implements fl, CQU.Qhi, com.bytedance.sdk.openadsdk.core.video.nativevideo.Qhi {
    protected SurfaceHolder CJ;
    protected final ViewGroup CQU;
    protected boolean Dww;
    protected fl.Qhi Eh;
    protected final Context Gm;
    protected long NFd;
    protected Tgh ROR;
    protected final tP Sf;
    protected ac Tgh;
    protected ROR aP;
    protected cJ bxS;

    /* renamed from: fl  reason: collision with root package name */
    protected SurfaceTexture f9214fl;
    protected boolean hpZ;
    private long lB;
    protected WeakReference<fl.cJ> pM;
    protected boolean qMt;
    protected String Qhi = "TTAD.VideoController";
    protected final int cJ = 100;

    /* renamed from: ac  reason: collision with root package name */
    protected final CQU f9213ac = new CQU(Looper.getMainLooper(), this);

    /* renamed from: hm  reason: collision with root package name */
    protected long f9215hm = 0;
    protected long WAv = 0;

    /* renamed from: zc  reason: collision with root package name */
    protected final List<Runnable> f9216zc = new ArrayList();
    protected boolean ABk = false;
    protected boolean iMK = false;
    protected boolean pA = true;
    protected boolean HzH = false;
    protected boolean kYc = false;
    protected boolean tP = false;
    protected AtomicBoolean MQ = new AtomicBoolean(false);
    protected boolean EBS = true;
    protected Runnable sDy = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z10 = Qhi.this.ABk;
            Qhi.this.qMt();
        }
    };
    private long lG = 0;
    private boolean Jma = true;
    private int js = 1;

    /* renamed from: zn  reason: collision with root package name */
    private final AtomicBoolean f9217zn = new AtomicBoolean(false);

    /* compiled from: BaseController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[Tgh.Qhi.values().length];
            Qhi = iArr;
            try {
                iArr[Tgh.Qhi.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[Tgh.Qhi.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[Tgh.Qhi.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Qhi(Context context, tP tPVar, ViewGroup viewGroup) {
        this.Sf = tPVar;
        this.Gm = context;
        this.CQU = viewGroup;
        this.Qhi += hashCode();
    }

    private boolean kYc() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            return tgh.ABk() instanceof SSRenderTextureView;
        }
        return false;
    }

    private void lG() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.CJ(0);
            this.ROR.Qhi(false, false);
            this.ROR.ac(false);
            this.ROR.fl();
            this.ROR.ROR();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final void CJ(boolean z10) {
        this.Jma = z10;
    }

    public final boolean CQU() {
        ac acVar = this.Tgh;
        if (acVar != null && !acVar.cJ()) {
            return false;
        }
        return true;
    }

    public boolean Dww() {
        return this.Jma;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    /* renamed from: EBS */
    public final com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh ABk() {
        return this.ROR;
    }

    public final void Eh() {
        hpZ.Qhi qhi = new hpZ.Qhi();
        qhi.Qhi(fl());
        qhi.ac(Sf() / sDy());
        qhi.cJ(Tgh());
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.cJ(ABk(), qhi);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean Gm() {
        return this.HzH;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean HzH() {
        return true;
    }

    public void MQ() {
        if (this.f9216zc.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.f9216zc).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f9216zc.clear();
    }

    public final void NFd() {
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(this.Sf, this.ROR, this.bxS);
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final int ROR() {
        ac acVar = this.Tgh;
        if (acVar == null) {
            return 0;
        }
        return acVar.pA();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final long Sf() {
        ac acVar = this.Tgh;
        if (acVar == null) {
            return 0L;
        }
        return acVar.hpZ();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final long Tgh() {
        ac acVar = this.Tgh;
        if (acVar == null) {
            return 0L;
        }
        return acVar.iMK();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final int WAv() {
        return com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(this.WAv, this.NFd);
    }

    public final void aP() {
        hpZ.Qhi qhi = new hpZ.Qhi();
        qhi.Qhi(fl());
        qhi.ac(Sf() / sDy());
        qhi.cJ(Tgh());
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(this.ROR, qhi);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void ac(long j10) {
        this.NFd = j10;
    }

    public boolean bxS() {
        return this.pA;
    }

    public void cJ(Runnable runnable) {
        this.f9216zc.add(runnable);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public long fl() {
        return this.f9215hm;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final long hm() {
        return Tgh() + fl();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final boolean hpZ() {
        return this.Dww;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean iMK() {
        return this.hpZ;
    }

    public final void lB() {
        com.bytedance.sdk.openadsdk.cJ.Qhi.fl.Qhi(com.bytedance.sdk.openadsdk.MQ.Qhi.Qhi(this.Sf.dI(), true, this.Sf), 5, this.Sf.HLI());
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean pA() {
        return this.iMK;
    }

    public final boolean pM() {
        ac acVar = this.Tgh;
        if (acVar != null && acVar.Tgh()) {
            return true;
        }
        return false;
    }

    public void qMt() {
        this.f9213ac.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                Qhi qhi = Qhi.this;
                if (qhi.Tgh != null) {
                    boolean z10 = qhi.ABk;
                    Qhi.this.Tgh.WAv();
                }
            }
        });
    }

    public int sDy() {
        return this.js;
    }

    public void tP() {
        if (this.Tgh == null) {
            return;
        }
        if (kYc()) {
            SurfaceTexture surfaceTexture = this.f9214fl;
            if (surfaceTexture != null && surfaceTexture != this.Tgh.tP()) {
                this.Tgh.Qhi(this.f9214fl);
                return;
            }
            return;
        }
        SurfaceHolder surfaceHolder = this.CJ;
        if (surfaceHolder != null && surfaceHolder != this.Tgh.kYc()) {
            this.Tgh.Qhi(this.CJ);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public com.bykv.vk.openvk.component.video.api.Qhi zc() {
        return this.Tgh;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void CJ(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view) {
        if (this.tP) {
            Tgh(false);
            com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
            if (tgh != null) {
                tgh.cJ(this.CQU);
            }
            Qhi(1);
            return;
        }
        Qhi(true, 3);
    }

    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view, boolean z10) {
    }

    public void Tgh(boolean z10) {
        this.tP = z10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final void ac(boolean z10) {
        this.iMK = z10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public void cJ(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, SurfaceHolder surfaceHolder) {
        this.ABk = false;
        this.CJ = null;
        ac acVar2 = this.Tgh;
        if (acVar2 != null) {
            acVar2.Qhi(false);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void fl(boolean z10) {
        this.EBS = z10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(fl.InterfaceC0061fl interfaceC0061fl) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void ac(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view) {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.hm();
        }
        Qhi(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void fl(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view) {
        Qhi(acVar, view, false);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(long j10) {
        this.f9215hm = j10;
        this.WAv = Math.max(this.WAv, j10);
    }

    private boolean ac(int i10) {
        return this.ROR.cJ(i10);
    }

    public void Qhi(Runnable runnable) {
        if (this.ROR.EBS() && this.ABk) {
            runnable.run();
        } else {
            cJ(runnable);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public void cJ(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, SurfaceTexture surfaceTexture) {
        this.ABk = false;
        ac acVar2 = this.Tgh;
        if (acVar2 != null) {
            acVar2.Qhi(false);
        }
        this.f9214fl = null;
        MQ();
    }

    public final void CJ(long j10) {
        this.f9215hm = j10;
        this.WAv = Math.max(this.WAv, j10);
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.Qhi();
        }
        ac acVar = this.Tgh;
        if (acVar != null) {
            acVar.Qhi(true, this.f9215hm, this.hpZ);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, SurfaceHolder surfaceHolder) {
        this.ABk = true;
        this.CJ = surfaceHolder;
        ac acVar2 = this.Tgh;
        if (acVar2 == null) {
            return;
        }
        acVar2.Qhi(surfaceHolder);
        MQ();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ(long j10) {
        this.lG = j10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final void cJ(final boolean z10) {
        this.hpZ = z10;
        ac acVar = this.Tgh;
        if (acVar != null) {
            acVar.cJ(z10);
        }
        if (this.aP != null) {
            if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
                this.aP.Qhi(z10);
            } else {
                this.f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Qhi.this.aP.Qhi(z10);
                    }
                });
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, SurfaceTexture surfaceTexture) {
        this.ABk = true;
        this.f9214fl = surfaceTexture;
        ac acVar2 = this.Tgh;
        if (acVar2 != null) {
            acVar2.Qhi(surfaceTexture);
            this.Tgh.Qhi(this.ABk);
        }
        MQ();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        cJ cJVar = (cJ) acVar;
        this.bxS = cJVar;
        this.hpZ = cJVar.Sf();
        acVar.CJ(String.valueOf(this.Sf.Hy()));
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(boolean z10) {
        this.pA = z10;
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.CJ(z10);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void cJ(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view) {
        cJ(acVar, view, false, false);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final void Qhi(fl.cJ cJVar) {
        this.pM = new WeakReference<>(cJVar);
    }

    public final void cJ(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view, boolean z10, boolean z11) {
        Tgh(!this.tP);
        Context context = this.Gm;
        if (context != null && (context instanceof Activity)) {
            if (this.tP) {
                Qhi(z10 ? 8 : 0);
                com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
                if (tgh != null) {
                    tgh.Qhi(this.CQU);
                    this.ROR.ac(false);
                }
            } else {
                Qhi(1);
                com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh2 = this.ROR;
                if (tgh2 != null) {
                    tgh2.cJ(this.CQU);
                    this.ROR.ac(false);
                }
            }
            WeakReference<fl.cJ> weakReference = this.pM;
            fl.cJ cJVar = weakReference != null ? weakReference.get() : null;
            if (cJVar != null) {
                cJVar.Qhi(this.tP);
            }
        }
    }

    public final void Qhi(int i10) {
        Context context = this.Gm;
        if (context == null) {
            return;
        }
        boolean z10 = i10 == 0 || i10 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
            if (!z10) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view, boolean z10, boolean z11) {
        if (this.pA) {
            Qhi();
        }
        if (z10 && !this.pA && !CQU()) {
            this.ROR.cJ(!pM(), false);
            this.ROR.Qhi(z11, true, false);
        }
        ac acVar2 = this.Tgh;
        if (acVar2 != null && acVar2.Tgh()) {
            this.ROR.Tgh();
            this.ROR.fl();
            return;
        }
        this.ROR.Tgh();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void cJ(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, int i10) {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.Tgh();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, int i10, boolean z10) {
        if (this.Gm == null) {
            return;
        }
        long j10 = this.NFd;
        long j11 = (((float) (i10 * j10)) * 1.0f) / 100.0f;
        if (j10 > 0) {
            this.lB = (int) j11;
        } else {
            this.lB = 0L;
        }
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.Qhi(this.lB);
        }
    }

    public final void cJ(Sf sf2) {
        hpZ.Qhi qhi = new hpZ.Qhi();
        qhi.Qhi(fl());
        qhi.ac(Sf() / sDy());
        qhi.cJ(Tgh());
        qhi.CJ(ROR());
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.cJ(this.ROR, qhi, sf2);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public final void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, int i10) {
        if (this.Tgh == null) {
            return;
        }
        Qhi(this.lB, ac(i10));
    }

    public void cJ(int i10) {
        this.js = i10;
    }

    private void Qhi(long j10, boolean z10) {
        if (this.Tgh == null) {
            return;
        }
        if (z10) {
            lG();
        }
        this.Tgh.Qhi(j10);
    }

    public final void Qhi(Sf sf2) {
        if (this.MQ.compareAndSet(false, true)) {
            ROR ror = this.aP;
            if (ror != null) {
                ror.Qhi(Sf(), iMK());
            }
            hpZ.Qhi qhi = new hpZ.Qhi();
            qhi.Qhi(Dww());
            qhi.ac(Sf());
            com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(HzH.Qhi(), this.ROR, qhi, sf2);
        }
    }

    public final void Qhi(com.bykv.vk.openvk.component.video.api.ac.Qhi qhi) {
        hpZ.Qhi qhi2 = new hpZ.Qhi();
        qhi2.cJ(Tgh());
        qhi2.ac(Sf() / sDy());
        qhi2.Qhi(fl());
        qhi2.Qhi(qhi);
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.ac(ABk(), qhi2);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final void Qhi(fl.Qhi qhi) {
        this.Eh = qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Qhi
    public final void Qhi(Tgh.Qhi qhi, String str) {
        int i10 = AnonymousClass4.Qhi[qhi.ordinal()];
        if (i10 == 1) {
            Qhi();
        } else if (i10 == 2) {
            ac();
        } else if (i10 != 3) {
        } else {
            cJ();
            this.HzH = false;
            this.kYc = true;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public final void Qhi() {
        ac acVar = this.Tgh;
        if (acVar != null) {
            acVar.Gm();
        }
        if (this.qMt || !this.MQ.get()) {
            return;
        }
        aP();
    }

    public void Qhi(long j10, long j11) {
        if (!this.f9217zn.get() && com.bytedance.sdk.openadsdk.CJ.tP.Qhi().ac() && (j10 * 1.0d) / j11 > 0.3d) {
            this.f9217zn.set(true);
            MQ.Qhi().Qhi("videoPercent30", this.Sf);
        }
    }
}
