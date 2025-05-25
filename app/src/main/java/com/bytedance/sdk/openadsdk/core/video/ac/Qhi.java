package com.bytedance.sdk.openadsdk.core.video.ac;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.core.ROR.ROR;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.model.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.ac.ac;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Objects;

/* compiled from: BaseVideoController.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi {
    private final int FQ;
    final ac.cJ Jma;
    private final Runnable PAe;
    private long es;

    /* renamed from: ip  reason: collision with root package name */
    private InterfaceC0130Qhi f9219ip;
    private final Sf js;
    protected long lB;
    protected boolean lG;
    private boolean yN;

    /* renamed from: zn  reason: collision with root package name */
    private long f9220zn;

    /* compiled from: BaseVideoController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.ac.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0130Qhi {
        void Qhi(int i10);
    }

    public Qhi(Context context, ViewGroup viewGroup, tP tPVar, Sf sf2) {
        super(context, tPVar, viewGroup);
        this.f9220zn = 0L;
        this.es = 0L;
        this.yN = false;
        this.lB = 0L;
        this.lG = false;
        this.Jma = new ac.cJ() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1
            private boolean cJ = true;

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void CJ(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf.cJP();
                if (cJP != null && cJP.Qhi() != null) {
                    cJP.Qhi().cJ(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9215hm);
                }
                Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf, 3);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP.Qhi(0);
                }
                if (Qhi.this.f9219ip != null) {
                    Qhi.this.f9219ip.Qhi(2);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP.Qhi(9);
                            } catch (Exception unused2) {
                            }
                        }
                        Qhi.this.PAe();
                    }
                });
                com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf.cJP();
                if (cJP != null && cJP.Qhi() != null) {
                    long fl2 = Qhi.this.fl();
                    cJP.Qhi().CJ(fl2);
                    cJP.Qhi().fl(fl2);
                }
                Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf, 5);
                if (Qhi.this.f9219ip != null) {
                    Qhi.this.f9219ip.Qhi(3);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void ac(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void cJ(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void fl(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf, 0);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP.Qhi(1);
                }
                if (Qhi.this.f9219ip != null) {
                    Qhi.this.f9219ip.Qhi(1);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void cJ(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.removeCallbacks(Qhi.this.PAe);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.cJ();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, long j10) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Dww = false;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.removeCallbacks(Qhi.this.PAe);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.cJ();
                        }
                    }
                });
                if (!((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).MQ.get()) {
                    Qhi qhi2 = Qhi.this;
                    qhi2.lB = j10;
                    qhi2.Qhi(qhi2.js);
                    Qhi.this.lB();
                }
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP.ac();
                }
                Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf, 0);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, com.bykv.vk.openvk.component.video.api.ac.Qhi qhi2) {
                String str = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ABk.Qhi(str, "onError: " + qhi2.Qhi() + "," + qhi2.cJ() + "," + qhi2.ac());
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.removeCallbacks(Qhi.this.PAe);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.cJ();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Eh != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Eh.cJ(Qhi.this.es, com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9215hm, ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).NFd));
                        }
                    }
                });
                Qhi.this.Qhi(qhi2);
                Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf, 6);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP.Qhi(14);
                }
                if (Qhi.this.f9219ip != null) {
                    Qhi.this.f9219ip.Qhi(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, boolean z10) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.removeCallbacks(Qhi.this.PAe);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.cJ();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10, int i11) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Qhi.this.ip()) {
                            Qhi.this.xyz();
                        } else if (!HzH.cJ(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf) && ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).bxS.f9218fl != 4) {
                            if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf.aP() == 3) {
                                Qhi.this.ROR(true);
                            } else if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf.aP() == 0) {
                                Qhi.this.dIT();
                            } else {
                                Qhi.this.MND();
                            }
                        } else {
                            Qhi.this.ROR(true);
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10, int i11, int i12) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Dww = true;
                Qhi.this.FQ();
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.HzH();
                        }
                    }
                });
                Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf, 3);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP.Qhi(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Dww = false;
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.removeCallbacks(Qhi.this.PAe);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.cJ();
                        }
                    }
                });
                Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf, 0);
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP.Qhi(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, long j10, long j11) {
                if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9215hm) < 50) {
                    return;
                }
                Qhi qhi2 = Qhi.this;
                qhi2.Qhi(qhi2.js);
                Qhi.this.Qhi(j10, j11);
                Qhi.this.cJ(j10, j11);
                com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Sf.cJP();
                if (cJP != null && cJP.Qhi() != null) {
                    cJP.Qhi().Qhi(j10, j11, ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).aP);
                }
                if (!this.cJ || j11 - j10 >= 500) {
                    return;
                }
                this.cJ = false;
                Qhi(qhi);
            }

            @Override // com.bytedance.sdk.openadsdk.core.video.ac.ac.cJ
            public void Qhi(int i10, int i11) {
                Qhi qhi = Qhi.this;
                qhi.cJ(qhi.js);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).bxS.CJ = ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Tgh.MQ();
                Qhi.this.NFd();
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).MQ.set(false);
                Qhi qhi2 = Qhi.this;
                qhi2.Qhi(qhi2.js);
            }
        };
        this.PAe = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Eh != null) {
                    Qhi.this.kYc();
                    ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Eh.Qhi();
                }
            }
        };
        this.js = sf2;
        this.FQ = tPVar.Hy();
        if (tPVar.IC() && tPVar.cJP() != null && this.CQU != null) {
            if (this.aP == null) {
                this.aP = ROR.Qhi();
            }
            this.aP.Qhi(this.CQU, tPVar.cJP().iMK());
        }
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = new com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh(context.getApplicationContext(), new TTVideoPlayLayoutForLiveLayout(context), true, 17, this.Sf, this);
        this.ROR = tgh;
        tgh.Qhi(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi
    public boolean Dww() {
        return true;
    }

    public void kYc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FQ() {
        int xyz;
        int i10 = this.bxS.f9218fl;
        if (i10 != 2 && i10 != 1) {
            xyz = i10 == 4 ? com.bytedance.sdk.openadsdk.core.HzH.CJ().hm(String.valueOf(this.FQ)) : 5000;
        } else {
            xyz = com.bytedance.sdk.openadsdk.core.HzH.CJ().xyz() * 1000;
        }
        this.f9213ac.removeCallbacks(this.PAe);
        this.f9213ac.postDelayed(this.PAe, xyz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MND() {
        try {
            Objects.toString(this.Sf.lB());
            if (jPH()) {
                return;
            }
            int[] cJ = zn.cJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            boolean z10 = false;
            boolean z11 = this.Sf.SL() == 1;
            float f10 = cJ[0];
            float f11 = cJ[1];
            float CJ = this.Tgh.CJ();
            float fl2 = this.Tgh.fl();
            if (z11) {
                if (CJ > fl2) {
                    Qhi(f10, f11, CJ, fl2, true);
                    return;
                }
            } else if (CJ < fl2) {
                Qhi(f10, f11, CJ, fl2, false);
                return;
            }
            float f12 = CJ / fl2;
            float f13 = f10 / f11;
            if (z11) {
                if (f13 < 0.5625f && f12 == 0.5625f) {
                    CJ = (9.0f * f11) / 16.0f;
                    z10 = true;
                    fl2 = f11;
                }
            } else if (f13 > 1.7777778f && f12 == 1.7777778f) {
                fl2 = (9.0f * f10) / 16.0f;
                z10 = true;
                CJ = f10;
            }
            if (z10) {
                f10 = CJ;
                f11 = fl2;
            }
            int i10 = (int) f10;
            int i11 = (int) f11;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(13);
            if (js() != null) {
                if (js() instanceof TextureView) {
                    ((TextureView) js()).setLayoutParams(layoutParams);
                } else if (js() instanceof SurfaceView) {
                    ((SurfaceView) js()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.CQU.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i11;
                    layoutParams2.width = i10;
                    this.CQU.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th2) {
            ABk.Qhi(this.Qhi, "changeSize error", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void PAe() {
        if (this.ROR == null) {
            return;
        }
        this.f9213ac.removeCallbacks(this.PAe);
        this.ROR.cJ();
        this.es = System.currentTimeMillis() - this.f9220zn;
        if (!this.yN) {
            this.yN = true;
            long j10 = this.NFd;
            cJ(j10, j10);
            long j11 = this.NFd;
            this.f9215hm = j11;
            this.WAv = j11;
            cJ(this.js);
        }
        fl.Qhi qhi = this.Eh;
        if (qhi != null) {
            qhi.Qhi(this.es, com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(this.f9215hm, this.NFd));
        }
        this.iMK = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dIT() {
        try {
            if (js() != null && this.Tgh != null) {
                boolean z10 = this.Sf.SL() == 1;
                int[] cJ = zn.cJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
                Qhi(cJ[0], cJ[1], this.Tgh.CJ(), this.Tgh.fl(), z10);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ip() {
        return this.Sf.Oy() == 100.0f;
    }

    private boolean jPH() {
        return js() == null || this.Tgh == null || this.Sf.es() != null || this.Sf.NFd() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xyz() {
        ViewGroup viewGroup;
        try {
            if (js() != null && this.Tgh != null && (viewGroup = this.CQU) != null) {
                int width = viewGroup.getWidth();
                int height = this.CQU.getHeight();
                float CJ = this.Tgh.CJ();
                float fl2 = this.Tgh.fl();
                float f10 = width;
                float f11 = height;
                if (CJ / (f10 * 1.0f) <= fl2 / (1.0f * f11)) {
                    f10 = (f11 / fl2) * CJ;
                } else {
                    f11 = (f10 / CJ) * fl2;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
                layoutParams.addRule(13);
                if (js() instanceof TextureView) {
                    ((TextureView) js()).setLayoutParams(layoutParams);
                } else if (js() instanceof SurfaceView) {
                    ((SurfaceView) js()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th2) {
            ABk.Qhi(this.Qhi, "changeVideoSizeSupportInteraction error", th2);
        }
    }

    private void yN() {
        this.Tgh.ac(sDy());
        this.Tgh.Qhi(this.bxS);
        this.f9220zn = System.currentTimeMillis();
        this.ROR.ac(8);
        this.ROR.ac(0);
        Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Tgh == null) {
                    return;
                }
                Qhi.this.f9220zn = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.CJ(0);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Tgh.Qhi(true, ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).f9215hm, ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).hpZ);
            }
        });
    }

    public void Jma() {
        if (this.yN || !this.MQ.get()) {
            return;
        }
        Eh();
        com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = this.Sf.cJP();
        if (cJP == null || cJP.Qhi() == null) {
            return;
        }
        cJP.Qhi().ac(fl());
    }

    public void ROR(boolean z10) {
        try {
            Objects.toString(this.Sf.lB());
            if (!jPH() || z10) {
                float CJ = this.Tgh.CJ();
                float fl2 = this.Tgh.fl();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) CJ, (int) fl2);
                layoutParams.addRule(13);
                if (js() != null) {
                    if (js() instanceof TextureView) {
                        ((TextureView) js()).setLayoutParams(layoutParams);
                    } else if (js() instanceof SurfaceView) {
                        ((SurfaceView) js()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.CQU.getLayoutParams();
                    if (this.CQU.getHeight() > 0) {
                        float min = Math.min(this.CQU.getWidth() / CJ, this.CQU.getHeight() / fl2);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (CJ * min);
                            layoutParams.height = (int) (fl2 * min);
                            if (js() instanceof TextureView) {
                                ((TextureView) js()).setLayoutParams(layoutParams);
                            } else if (js() instanceof SurfaceView) {
                                ((SurfaceView) js()).setLayoutParams(layoutParams);
                            }
                            if (this.bxS.f9218fl == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.CQU.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            ABk.Qhi(this.Qhi, "changeSize error", th2);
        }
    }

    public void es() {
        ROR ror = this.aP;
        if (ror != null) {
            ror.Qhi(13);
        }
    }

    public com.bykv.vk.openvk.component.video.api.renderview.cJ js() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            return tgh.ABk();
        }
        return null;
    }

    public void lG() {
        this.Jma.Qhi((com.bykv.vk.openvk.component.video.api.Qhi) null, 0, 0);
    }

    public void zn() {
        ROR ror = this.aP;
        if (ror != null) {
            ror.Qhi(2);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void CJ() {
        ac();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void ac() {
        ac acVar = this.Tgh;
        if (acVar == null) {
            return;
        }
        acVar.zc();
        this.Tgh = null;
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.hm();
        }
        this.f9213ac.removeCallbacks(this.PAe);
        this.f9213ac.removeCallbacksAndMessages(null);
        ROR ror = this.aP;
        if (ror != null) {
            ror.CJ();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.Qhi();
            this.ROR.pA();
            this.ROR.kYc();
        }
        ac acVar = this.Tgh;
        if (acVar != null) {
            if (acVar.ROR()) {
                if (this.ABk) {
                    if (hm.EBS()) {
                        this.Tgh.cJ(3);
                        ac acVar2 = this.Tgh;
                        acVar2.Qhi(false, acVar2.HzH(), this.hpZ);
                    } else {
                        qMt();
                    }
                } else {
                    cJ(this.sDy);
                }
            } else {
                this.Tgh.Qhi(false, this.f9215hm, this.hpZ);
            }
        }
        if (this.yN || !this.MQ.get()) {
            return;
        }
        Eh();
        com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP = this.Sf.cJP();
        if (cJP == null || cJP.Qhi() == null) {
            return;
        }
        cJP.Qhi().ac(fl());
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        int tP;
        View view;
        if (this.Tgh != null) {
            ABk.Qhi(this.Qhi, "playVideoUrl: already invoked");
            return false;
        }
        acVar.ABk();
        if (TextUtils.isEmpty(acVar.ABk())) {
            ABk.Qhi(this.Qhi, "No video info");
            return false;
        }
        cJ(acVar);
        acVar.ac(1);
        this.lG = !acVar.ABk().startsWith("http");
        if (this.aP != null) {
            if (this.bxS.f9218fl == 1) {
                tP = com.bytedance.sdk.openadsdk.core.HzH.CJ().WAv(String.valueOf(this.FQ));
            } else {
                tP = com.bytedance.sdk.openadsdk.core.HzH.CJ().tP(String.valueOf(this.FQ));
            }
            ViewGroup viewGroup = this.CQU;
            if (viewGroup != null && (view = (View) viewGroup.getParent()) != null) {
                try {
                    View findViewById = view.findViewById(iMK.f9385zc);
                    View findViewById2 = view.findViewById(iMK.XyJ);
                    ROR ror = this.aP;
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    ror.Qhi(findViewById2, friendlyObstructionPurpose);
                    this.aP.Qhi(findViewById, friendlyObstructionPurpose);
                } catch (Throwable unused) {
                }
            }
            this.aP.Qhi(tP > 0, tP / 1000.0f);
        }
        NFd();
        if (acVar.ROR() > 0) {
            long ROR = acVar.ROR();
            this.f9215hm = ROR;
            this.WAv = Math.max(this.WAv, ROR);
        }
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
        if (tgh != null) {
            tgh.Qhi();
            this.ROR.ROR();
            this.ROR.ac(acVar.fl(), acVar.Tgh());
            this.ROR.ac(this.CQU);
        }
        ac acVar2 = new ac();
        this.Tgh = acVar2;
        acVar2.Qhi(this.Jma);
        tP();
        this.es = 0L;
        yN();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(final long j10, final long j11) {
        this.Sf.ac(j10);
        this.f9215hm = j10;
        this.NFd = j11;
        final int Qhi = com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(j10, j11);
        this.f9213ac.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.ac.Qhi.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.Qhi(j10, j11);
                ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).ROR.Qhi(Qhi);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Eh != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Eh.Qhi(j10, j11);
                    }
                } catch (Throwable th2) {
                    ABk.Qhi(((com.bytedance.sdk.openadsdk.core.video.Qhi.Qhi) Qhi.this).Qhi, "onProgressUpdate error: ", th2);
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(boolean z10, int i10) {
        ac();
    }

    private void Qhi(float f10, float f11, float f12, float f13, boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        if (f12 <= 0.0f || f13 <= 0.0f) {
            try {
                f12 = this.Sf.FQ().ac();
                f13 = this.Sf.FQ().cJ();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f13 > 0.0f && f12 > 0.0f) {
            if (z10) {
                if (f12 < f13) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
            } else if (f12 > f13) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
            }
            layoutParams.addRule(13);
            if (js() != null) {
                if (js() instanceof TextureView) {
                    ((TextureView) js()).setLayoutParams(layoutParams);
                } else if (js() instanceof SurfaceView) {
                    ((SurfaceView) js()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.CQU.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.CJ.tP.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi()) || this.CQU.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.CQU.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.cJ
    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.ac acVar, View view) {
        ac acVar2 = this.Tgh;
        if (acVar2 == null) {
            return;
        }
        if (acVar2.Tgh()) {
            Qhi();
            this.ROR.cJ(true, false);
            this.ROR.Tgh();
        } else if (!this.Tgh.ROR()) {
            com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh = this.ROR;
            if (tgh != null) {
                tgh.ac(this.CQU);
            }
            CJ(this.f9215hm);
            com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh2 = this.ROR;
            if (tgh2 != null) {
                tgh2.cJ(false, false);
            }
        } else {
            cJ();
            com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh tgh3 = this.ROR;
            if (tgh3 != null) {
                tgh3.cJ(false, false);
            }
        }
    }

    public void Qhi(InterfaceC0130Qhi interfaceC0130Qhi) {
        this.f9219ip = interfaceC0130Qhi;
    }
}
