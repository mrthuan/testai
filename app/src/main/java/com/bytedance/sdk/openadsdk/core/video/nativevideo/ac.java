package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bykv.vk.openvk.component.video.api.Qhi;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.ROR.ROR;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.kYc;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.layout.TTVideoDetailLayout;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: NativeVideoController.java */
/* loaded from: classes.dex */
public class ac extends com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi {
    private int Dq;
    private WeakReference<fl.InterfaceC0061fl> FQ;
    private boolean Hf;
    private final boolean Jma;
    private cJ MND;
    private WeakReference<Qhi> PAe;
    private int Qe;
    private final Runnable YB;
    private final bxS.Qhi cjC;
    private final Qhi.InterfaceC0062Qhi dIT;
    private final boolean es;

    /* renamed from: ip  reason: collision with root package name */
    private int f9242ip;
    private Sf jPH;
    private final String js;
    private long lB;
    private long lG;
    private int xyz;
    private boolean yN;

    /* renamed from: zn  reason: collision with root package name */
    private final boolean f9243zn;

    /* compiled from: NativeVideoController.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(int i10);

        void Tgh();
    }

    public ac(Context context, ViewGroup viewGroup, tP tPVar, String str, boolean z10, boolean z11, boolean z12, Sf sf2) {
        super(context, tPVar, viewGroup);
        this.lB = 0L;
        this.lG = 0L;
        this.yN = true;
        this.f9242ip = 0;
        this.xyz = 0;
        this.dIT = new Qhi.InterfaceC0062Qhi() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1
            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void CJ(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf.cJP();
                if (cJP != null && cJP.Qhi() != null) {
                    cJP.Qhi().cJ(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9215hm);
                }
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, 3);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP.Qhi(0);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, 5);
                            if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP != null) {
                                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP.Qhi(9);
                            }
                        } catch (Exception unused) {
                        }
                        ac.this.js();
                    }
                });
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf.cJP() == null || ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf.cJP().Qhi() == null) {
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf.cJP().Qhi().CJ(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9215hm);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void cJ(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void fl(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf.cJP();
                if (cJP != null && cJP.Qhi() != null) {
                    cJP.Qhi().ac(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9215hm);
                }
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP.Qhi(1);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void cJ(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.removeCallbacks(ac.this.YB);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ac.this.FQ != null && ac.this.FQ.get() != null) {
                            ac.this.FQ.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.cJ();
                        }
                    }
                });
                if (ac.this.Jma) {
                    return;
                }
                ac acVar = ac.this;
                acVar.Qhi(acVar.jPH);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, long j10) {
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Dww = false;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.removeCallbacks(ac.this.YB);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.cJ();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).pA && ac.this.PAe != null && ac.this.PAe.get() != null) {
                            ((Qhi) ac.this.PAe.get()).Tgh();
                        }
                    }
                });
                ac.this.lB();
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, 0);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP.ac();
                }
                ac acVar = ac.this;
                acVar.Qhi(acVar.jPH);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, final com.bykv.vk.openvk.component.video.api.ac.Qhi qhi2) {
                String str2 = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Qhi;
                ABk.Qhi(str2, "onError: " + qhi2.Qhi() + ", " + qhi2.cJ() + ", " + qhi2.ac());
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int Qhi2 = qhi2.Qhi();
                        int cJ = qhi2.cJ();
                        if (ac.this.pM() && cJ != -1004) {
                            return;
                        }
                        if (ac.this.ac(Qhi2, cJ)) {
                            ABk.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Qhi, "Play video error，show result page、、、、、、、");
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.Qhi2(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, (WeakReference<Context>) null, false);
                            ac.this.ac(true);
                            ac.this.CJ();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.cJ();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Eh != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Eh.cJ(ac.this.lG, com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9215hm, ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).NFd));
                        }
                        if (ac.this.FQ != null && ac.this.FQ.get() != null && !ac.this.pM()) {
                            ((fl.InterfaceC0061fl) ac.this.FQ.get()).Qhi(Qhi2, cJ);
                        }
                    }
                });
                ac.this.Qhi(qhi2);
                com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf.cJP();
                if (cJP != null && cJP.Qhi() != null) {
                    cJP.Qhi().Qhi(com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, 6);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP.Qhi(14);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, boolean z13) {
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.cJ();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10, int i11) {
                com.bytedance.sdk.component.utils.Sf.Qhi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        ac.this.es();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10, int i11, int i12) {
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Dww = true;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.HzH();
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.postDelayed(ac.this.YB, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, 2);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP.Qhi(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10) {
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Dww = false;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.removeCallbacks(ac.this.YB);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.cJ();
                    }
                });
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, 0);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).aP.Qhi(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void ac(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, final long j10, final long j11) {
                if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9215hm) < 50) {
                    return;
                }
                ac acVar = ac.this;
                acVar.Qhi(acVar.jPH);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        ac.this.Qhi(j10, j11);
                        ac.this.cJ(j10, j11);
                    }
                });
            }
        };
        this.Qe = 0;
        this.YB = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.Qhi2(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Sf, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.cJ();
                    ac.this.ac(true);
                    ABk.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Qhi, "Show result page after error.......showAdCard");
                }
            }
        };
        this.cjC = new bxS.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.6
            @Override // com.bytedance.sdk.component.utils.bxS.Qhi
            public void Qhi(Context context2, Intent intent, boolean z13, final int i10) {
                lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ac.this.fl(i10);
                    }
                });
            }
        };
        this.Hf = false;
        this.Dq = hpZ.ac(context);
        Qhi(z10);
        this.js = str;
        try {
            this.f9242ip = viewGroup.getWidth();
            this.xyz = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        Qhi(context);
        this.Jma = true;
        this.f9243zn = z11;
        this.es = z12;
        if (sf2 != null) {
            this.jPH = sf2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ac(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (r1 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void es() {
        /*
            r8 = this;
            com.bykv.vk.openvk.component.video.api.renderview.cJ r0 = r8.yN()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6b
            com.bytedance.sdk.openadsdk.core.video.ac.ac r0 = r8.Tgh     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6b
            android.view.ViewGroup r1 = r8.CQU     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L10
            goto L6b
        L10:
            int r0 = r0.CJ()     // Catch: java.lang.Throwable -> L78
            com.bytedance.sdk.openadsdk.core.video.ac.ac r1 = r8.Tgh     // Catch: java.lang.Throwable -> L78
            int r1 = r1.fl()     // Catch: java.lang.Throwable -> L78
            android.view.ViewGroup r2 = r8.CQU     // Catch: java.lang.Throwable -> L78
            int r2 = r2.getWidth()     // Catch: java.lang.Throwable -> L78
            android.view.ViewGroup r3 = r8.CQU     // Catch: java.lang.Throwable -> L78
            int r3 = r3.getHeight()     // Catch: java.lang.Throwable -> L78
            if (r2 <= 0) goto L6a
            if (r3 <= 0) goto L6a
            if (r1 <= 0) goto L6a
            if (r0 > 0) goto L2f
            goto L6a
        L2f:
            if (r0 != r1) goto L38
            if (r2 <= r3) goto L35
            r0 = r3
            goto L36
        L35:
            r0 = r2
        L36:
            r1 = r0
            goto L54
        L38:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r1) goto L49
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L78
            float r0 = r0 * r6
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L78
            float r0 = r0 / r1
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L78
            double r6 = r6 * r4
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L78
            double r6 = r6 / r0
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L78
            r1 = r2
            goto L54
        L49:
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L78
            float r1 = r1 * r6
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L78
            float r1 = r1 / r0
            double r6 = (double) r3     // Catch: java.lang.Throwable -> L78
            double r6 = r6 * r4
            double r0 = (double) r1     // Catch: java.lang.Throwable -> L78
            double r6 = r6 / r0
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L78
            r1 = r0
            r0 = r3
        L54:
            if (r0 > r3) goto L5a
            if (r0 > 0) goto L59
            goto L5a
        L59:
            r3 = r0
        L5a:
            if (r1 > r2) goto L60
            if (r1 > 0) goto L5f
            goto L60
        L5f:
            r2 = r1
        L60:
            com.bytedance.sdk.component.utils.CQU r0 = r8.f9213ac     // Catch: java.lang.Throwable -> L78
            com.bytedance.sdk.openadsdk.core.video.nativevideo.ac$5 r1 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.ac$5     // Catch: java.lang.Throwable -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L78
            r0.post(r1)     // Catch: java.lang.Throwable -> L78
        L6a:
            return
        L6b:
            android.content.Context r0 = r8.Gm     // Catch: java.lang.Throwable -> L78
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L78
            com.bykv.vk.openvk.component.video.api.renderview.cJ r0 = r8.yN()     // Catch: java.lang.Throwable -> L78
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L78
            return
        L78:
            r0 = move-exception
            r0.toString()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.es():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fl(int i10) {
        CJ(i10);
        if (i10 == 4) {
            this.HzH = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void js() {
        this.Qe++;
        Tgh tgh = this.ROR;
        if (tgh == null) {
            return;
        }
        tgh.cJ();
        fl.Qhi qhi = this.Eh;
        if (qhi != null) {
            qhi.Qhi(this.lG, com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(this.f9215hm, this.NFd));
        }
        this.lG = System.currentTimeMillis() - this.lB;
        if (this.yN) {
            this.ROR.Qhi2(this.Sf, (WeakReference<Context>) null, true);
        }
        if (!this.qMt) {
            this.qMt = true;
            long j10 = this.NFd;
            cJ(j10, j10);
            long j11 = this.NFd;
            this.f9215hm = j11;
            this.WAv = j11;
            cJ(this.jPH);
        }
        if (!this.pA && this.tP) {
            fl(this.ROR, null);
        }
        this.iMK = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.component.video.api.renderview.cJ yN() {
        Tgh tgh;
        if (this.Gm.getResources().getConfiguration().orientation != 1 || (tgh = this.ROR) == null) {
            return null;
        }
        return tgh.ABk();
    }

    private void zn() {
        com.bytedance.sdk.openadsdk.core.video.ac.ac acVar = this.Tgh;
        if (acVar != null) {
            if (acVar.ROR()) {
                if (this.ABk) {
                    qMt();
                } else {
                    cJ(this.sDy);
                }
            } else {
                this.Tgh.Qhi(false, this.f9215hm, this.hpZ);
            }
        }
        if (this.MQ.get()) {
            Eh();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void CJ() {
        com.bytedance.sdk.openadsdk.core.video.ac.ac acVar = this.Tgh;
        if (acVar != null) {
            acVar.zc();
            this.Tgh = null;
        }
        if (this.yN) {
            if (!"embeded_ad".equals(this.js)) {
                this.ROR.Qhi2(this.Sf, (WeakReference<Context>) null, true);
            } else {
                this.ROR.MQ();
            }
            this.f9213ac.removeCallbacksAndMessages(null);
            this.f9216zc.clear();
            if (this.pA) {
                lG();
            }
        }
    }

    public void Jma() {
        ROR ror = this.aP;
        if (ror != null) {
            ror.Qhi(13);
        }
    }

    public void ROR(boolean z10) {
        this.yN = z10;
    }

    public void Sf(boolean z10) {
        Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.Qhi();
        }
        Tgh tgh2 = this.ROR;
        if (tgh2 != null && z10) {
            tgh2.kYc();
        }
        zn();
    }

    public void kYc() {
        if (this.Hf || !this.EBS) {
            return;
        }
        Context applicationContext = HzH.Qhi().getApplicationContext();
        this.Hf = true;
        bxS.Qhi(this.cjC, applicationContext);
    }

    public void lG() {
        if (this.Hf && this.EBS) {
            this.Hf = false;
            bxS.Qhi(this.cjC);
        }
    }

    private void ac(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        acVar.ac(0);
        this.Tgh.Qhi(acVar);
        this.lB = System.currentTimeMillis();
        this.ROR.ac(8);
        this.ROR.ac(0);
        Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Tgh == null) {
                    return;
                }
                ac.this.lB = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).ROR.CJ(0);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).Tgh.Qhi(true, ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).f9215hm, ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) ac.this).hpZ);
            }
        });
        if (this.pA) {
            kYc();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ() {
        Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.Qhi();
        }
        Tgh tgh2 = this.ROR;
        if (tgh2 != null) {
            tgh2.kYc();
        }
        zn();
    }

    public void Qhi(final NativeVideoTsView.Qhi qhi) {
        Tgh tgh;
        if (!this.pA || (tgh = this.ROR) == null) {
            return;
        }
        tgh.Qhi(new NativeVideoTsView.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.ac.2
            @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.Qhi
            public void Qhi(View view, int i10) {
                NativeVideoTsView.Qhi qhi2 = qhi;
                if (qhi2 != null) {
                    qhi2.Qhi(view, i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(long j10, long j11) {
        this.Sf.ac(j10);
        this.f9215hm = j10;
        this.NFd = j11;
        this.ROR.Qhi(j10, j11);
        this.ROR.Qhi(com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(j10, j11));
        try {
            fl.Qhi qhi = this.Eh;
            if (qhi != null) {
                qhi.Qhi(j10, j11);
            }
        } catch (Throwable th2) {
            ABk.Qhi(this.Qhi, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = this.Sf.cJP();
        if (cJP == null || cJP.Qhi() == null) {
            return;
        }
        cJP.Qhi().Qhi(j10, j11, this.aP);
    }

    public void Qhi(PAGNativeAd pAGNativeAd) {
        Tgh tgh;
        if (!this.pA || (tgh = this.ROR) == null) {
            return;
        }
        tgh.Qhi(pAGNativeAd);
    }

    private void CJ(int i10) {
        if (this.Dq == i10) {
            return;
        }
        this.Dq = i10;
        if (i10 != 4 && i10 != 0) {
            this.kYc = false;
        }
        if (!this.kYc && !pA() && this.f9243zn) {
            cJ(2, i10);
        }
        WeakReference<Qhi> weakReference = this.PAe;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.PAe.get().Qhi(this.Dq);
    }

    public void Qhi(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.f9242ip = i10;
        this.xyz = i11;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void ac() {
        Qhi(true, 3);
    }

    public void ac(int i10) {
        CJ(i10);
        if (i10 == 4) {
            this.HzH = false;
            cJ();
        }
    }

    public void Qhi(cJ cJVar) {
        this.MND = cJVar;
    }

    private void Qhi(Context context) {
        ViewGroup tTVideoDetailLayout;
        if (this.pA) {
            tTVideoDetailLayout = new TTVideoPlayLayoutForLiveLayout(context);
        } else {
            tTVideoDetailLayout = new TTVideoDetailLayout(context);
        }
        ViewGroup viewGroup = tTVideoDetailLayout;
        if (this.pA) {
            this.ROR = new Tgh(context, viewGroup, true, 17, this.Sf, this, bxS());
        } else {
            this.ROR = new fl(context, viewGroup, true, 17, this.Sf, this, false);
        }
        this.ROR.Qhi(this);
    }

    private boolean cJ(int i10, int i11) {
        if (i11 == 0) {
            Qhi();
            this.HzH = true;
            Tgh tgh = this.ROR;
            if (tgh != null) {
                tgh.Qhi2(this.Sf, (WeakReference<Context>) null, false);
            }
        }
        if (i11 != 4 && i11 != 0) {
            Tgh tgh2 = this.ROR;
            if (tgh2 != null) {
                tgh2.Qhi();
            }
            Qhi();
            this.HzH = true;
            this.kYc = false;
            Tgh tgh3 = this.ROR;
            if (tgh3 != null) {
                return tgh3.Qhi(i10, this.Sf.FQ(), this.es);
            }
        } else if (i11 == 4) {
            this.HzH = false;
            Tgh tgh4 = this.ROR;
            if (tgh4 != null) {
                tgh4.pA();
            }
        }
        return true;
    }

    public ROR Qhi(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (this.Sf.IC()) {
            if (this.aP == null) {
                this.aP = ROR.Qhi();
            }
            this.aP.Qhi(view, this.Sf.cJP().iMK());
            if (list != null && list.size() > 0) {
                for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                    if (pair != null) {
                        Object obj = pair.second;
                        this.aP.Qhi((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                    }
                }
            }
            return this.aP;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi, com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(fl.InterfaceC0061fl interfaceC0061fl) {
        this.FQ = new WeakReference<>(interfaceC0061fl);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        if (this.Tgh != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        } else if (TextUtils.isEmpty(acVar.ABk())) {
            ABk.Qhi(this.Qhi, "[video] play video stop , because no video info");
            return false;
        } else {
            ac(false);
            acVar.ABk();
            cJ(acVar);
            NFd();
            ROR ror = this.aP;
            if (ror != null) {
                ror.Qhi(false, 0.0f);
            }
            if (!kYc.cJ(this.js) || this.f9215hm <= 0) {
                this.f9215hm = acVar.ROR();
            }
            if (acVar.ROR() <= 0) {
                this.qMt = false;
                this.MQ.set(false);
            } else {
                long ROR = acVar.ROR();
                this.f9215hm = ROR;
                this.WAv = Math.max(this.WAv, ROR);
            }
            Tgh tgh = this.ROR;
            if (tgh != null) {
                tgh.Qhi();
                if (this.Qe == 0) {
                    this.ROR.ROR();
                }
                this.ROR.ac(acVar.fl(), acVar.Tgh());
                this.ROR.ac(this.CQU);
                this.ROR.Qhi(acVar.fl(), acVar.Tgh());
            }
            if (this.Tgh == null) {
                com.bytedance.sdk.openadsdk.core.video.ac.ac acVar2 = new com.bytedance.sdk.openadsdk.core.video.ac.ac();
                this.Tgh = acVar2;
                acVar2.Qhi(this.dIT);
            }
            tP();
            this.lG = 0L;
            try {
                ac(acVar);
                return true;
            } catch (Exception e10) {
                ABk.Qhi(this.Qhi, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e10)));
                return false;
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(boolean z10, int i10) {
        if (!this.qMt && this.MQ.get()) {
            if (z10) {
                hpZ.Qhi qhi = new hpZ.Qhi();
                qhi.Qhi(fl());
                qhi.ac(Sf());
                qhi.cJ(Tgh());
                qhi.ac(i10);
                qhi.CJ(ROR());
                com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(this.ROR, qhi, this.jPH);
                this.qMt = false;
            } else {
                aP();
            }
        }
        CJ();
        ROR ror = this.aP;
        if (ror != null) {
            ror.CJ();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view) {
        com.bytedance.sdk.openadsdk.core.video.ac.ac acVar2 = this.Tgh;
        if (acVar2 == null) {
            return;
        }
        if (acVar2.Tgh()) {
            Qhi();
            this.ROR.cJ(true, false);
            this.ROR.Tgh();
        } else if (!this.Tgh.ROR()) {
            Tgh tgh = this.ROR;
            if (tgh != null) {
                tgh.ac(this.CQU);
            }
            CJ(this.f9215hm);
            Tgh tgh2 = this.ROR;
            if (tgh2 != null) {
                tgh2.cJ(false, false);
            }
        } else {
            Sf(false);
            Tgh tgh3 = this.ROR;
            if (tgh3 != null) {
                tgh3.cJ(false, false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi
    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view, boolean z10) {
        Tgh(!this.tP);
        if (this.Gm instanceof Activity) {
            Tgh tgh = this.ROR;
            if (tgh != null) {
                tgh.cJ(this.CQU);
                this.ROR.ac(false);
            }
            Qhi(1);
            WeakReference<fl.cJ> weakReference = this.pM;
            fl.cJ cJVar = weakReference != null ? weakReference.get() : null;
            if (cJVar != null) {
                cJVar.Qhi(this.tP);
            }
        }
    }

    public void Qhi(Qhi qhi) {
        this.PAe = new WeakReference<>(qhi);
    }
}
