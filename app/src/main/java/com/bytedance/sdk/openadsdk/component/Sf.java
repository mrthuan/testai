package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.ROR;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.qMt;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.utils.Jma;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: TTAppOpenAdLoadManager.java */
/* loaded from: classes.dex */
public class Sf implements CQU.Qhi {
    private boolean Gm;
    private final Context Qhi;
    private PAGAppOpenAdLoadListener ROR;
    private int Sf;
    private AdSlot Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final ROR f8754ac;
    private final tP<com.bytedance.sdk.openadsdk.cJ.Qhi> cJ;
    private final AtomicBoolean CJ = new AtomicBoolean(false);

    /* renamed from: fl  reason: collision with root package name */
    private int f8755fl = 0;

    /* renamed from: hm  reason: collision with root package name */
    private volatile int f8756hm = 0;
    private final com.bytedance.sdk.openadsdk.core.model.CQU WAv = new com.bytedance.sdk.openadsdk.core.model.CQU();

    public Sf(Context context) {
        if (context != null) {
            this.Qhi = context.getApplicationContext();
        } else {
            this.Qhi = HzH.Qhi();
        }
        this.cJ = HzH.ac();
        this.f8754ac = ROR.Qhi(this.Qhi);
    }

    private void cJ(final AdSlot adSlot) {
        final Jma Qhi = Jma.Qhi();
        this.f8756hm = 1;
        qMt qmt = new qMt();
        qmt.WAv = this.WAv;
        qmt.CJ = 1;
        qmt.Sf = 2;
        this.cJ.Qhi(adSlot, qmt, 3, new tP.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.Sf.1
            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(int i10, String str) {
                Sf.this.f8756hm = 3;
                Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
                Sf.this.f8756hm = 2;
                if (qhi == null || qhi.ac() == null || qhi.ac().size() == 0) {
                    Sf.this.f8756hm = 3;
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(2, 100, 20001, com.bytedance.sdk.openadsdk.core.Sf.Qhi(20001)));
                    cJVar.Qhi(-3);
                    com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                    return;
                }
                final com.bytedance.sdk.openadsdk.core.model.tP tPVar = qhi.ac().get(0);
                long iMK = tPVar.iMK();
                Sf.this.WAv.cJ = iMK;
                if (tPVar.czB()) {
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 100, tPVar));
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.tP.fl(tPVar)) {
                    int zc2 = HzH.CJ().zc();
                    if (zc2 == 1 || zc2 == 3) {
                        Sf.this.WAv.cJ = -1L;
                        Sf.this.WAv.Qhi(3);
                        Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 100, tPVar));
                        Sf.this.Qhi(tPVar, adSlot, false);
                        return;
                    }
                    Sf sf2 = Sf.this;
                    sf2.Qhi(tPVar, adSlot, !sf2.WAv.Qhi);
                } else if (HzH.CJ().Gm() == 1) {
                    Sf.this.WAv.cJ = -1L;
                    Sf.this.WAv.Qhi(3);
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 100, tPVar));
                    Sf.this.Qhi(tPVar, false);
                    return;
                } else {
                    Sf sf3 = Sf.this;
                    sf3.Qhi(tPVar, !sf3.WAv.Qhi);
                }
                if (Sf.this.WAv.Qhi) {
                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi(tPVar, Qhi.ac());
                    if (iMK == 0) {
                        Sf.this.WAv.Qhi(2);
                        Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 100, tPVar));
                        return;
                    }
                    iMK.cJ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.Sf.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Sf.this.WAv.Qhi(2);
                            Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 100, tPVar));
                        }
                    }, iMK);
                }
            }
        });
    }

    public static Sf Qhi(Context context) {
        return new Sf(context);
    }

    public void Qhi(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.fl flVar, int i10) {
        if (flVar == null) {
            return;
        }
        if (i10 <= 0) {
            i10 = 3500;
        }
        this.Tgh = adSlot;
        this.WAv.Qhi = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (flVar instanceof PAGAppOpenAdLoadListener) {
            this.ROR = (PAGAppOpenAdLoadListener) flVar;
        }
        this.f8755fl = Qhi(this.Tgh);
        this.Sf = i10;
        this.WAv.Qhi(Jma.Qhi());
        if (this.WAv.Qhi || com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CQU(this.Tgh.getCodeId()) == 0) {
            cJ(this.Tgh);
        }
        if (this.WAv.Qhi) {
            return;
        }
        new CQU(iMK.cJ().getLooper(), this).sendEmptyMessageDelayed(1, i10);
        Qhi();
    }

    private void Qhi() {
        lG.cJ(new hm("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.Sf.2
            @Override // java.lang.Runnable
            public void run() {
                int zc2;
                com.bytedance.sdk.openadsdk.core.model.tP fl2 = Sf.this.f8754ac.fl(Sf.this.f8755fl);
                if (fl2 == null) {
                    Sf.this.Qhi(false);
                    return;
                }
                boolean fl3 = com.bytedance.sdk.openadsdk.core.model.tP.fl(fl2);
                if (fl2.czB()) {
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 101, fl2));
                } else if (!fl3 && HzH.CJ().Gm() == 1) {
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 101, fl2));
                } else if (fl3 && ((zc2 = HzH.CJ().zc()) == 2 || zc2 == 3)) {
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 101, fl2));
                } else if (!Sf.this.f8754ac.cJ(Sf.this.f8755fl) && !Sf.this.f8754ac.CJ(Sf.this.f8755fl)) {
                    Sf.this.Qhi(true);
                } else {
                    if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CQU(Sf.this.Tgh.getCodeId()) == 0) {
                        Sf.this.f8754ac.ROR(Sf.this.f8755fl);
                    }
                    if (fl3) {
                        if (!TextUtils.isEmpty(Sf.this.f8754ac.Qhi(fl2))) {
                            Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 101, fl2));
                            return;
                        }
                        Sf.this.Qhi(false);
                        com.bytedance.sdk.openadsdk.component.CJ.cJ.cJ(fl2);
                    } else if (Sf.this.f8754ac.cJ(fl2)) {
                        Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 101, fl2));
                    } else {
                        Sf.this.Qhi(false);
                        com.bytedance.sdk.openadsdk.component.CJ.cJ.cJ(fl2);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(boolean z10) {
        if (z10) {
            this.f8754ac.ROR(this.f8755fl);
        }
        if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CQU(this.Tgh.getCodeId()) == 1) {
            cJ(this.Tgh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.tP tPVar, AdSlot adSlot, final boolean z10) {
        this.f8754ac.Qhi(tPVar, adSlot, this.WAv, new ROR.ac() { // from class: com.bytedance.sdk.openadsdk.component.Sf.3
            @Override // com.bytedance.sdk.openadsdk.component.ROR.ac
            public void Qhi() {
                if (z10) {
                    Sf.this.f8756hm = 4;
                    com.bytedance.sdk.openadsdk.component.fl.cJ cJVar = new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 100, tPVar);
                    cJVar.Qhi(true);
                    Sf.this.Qhi(cJVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ROR.ac
            public void Qhi(int i10, String str) {
                if (z10) {
                    Sf.this.f8756hm = 5;
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(2, 100, Constants.CP_MAC_KOREAN, com.bytedance.sdk.openadsdk.core.Sf.Qhi(Constants.CP_MAC_KOREAN)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.tP tPVar, final boolean z10) {
        this.f8754ac.Qhi(tPVar, this.WAv, new ROR.cJ() { // from class: com.bytedance.sdk.openadsdk.component.Sf.4
            @Override // com.bytedance.sdk.openadsdk.component.ROR.cJ
            public void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar) {
                if (z10) {
                    Sf.this.f8756hm = 4;
                    com.bytedance.sdk.openadsdk.component.fl.cJ cJVar2 = new com.bytedance.sdk.openadsdk.component.fl.cJ(1, 100, tPVar);
                    cJVar2.Qhi(true);
                    Sf.this.Qhi(cJVar2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ROR.cJ
            public void Qhi() {
                if (z10) {
                    Sf.this.f8756hm = 5;
                    Sf.this.Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(2, 100, Constants.CP_MAC_KOREAN, com.bytedance.sdk.openadsdk.core.Sf.Qhi(Constants.CP_MAC_KOREAN)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bytedance.sdk.openadsdk.component.fl.cJ cJVar) {
        int cJ = cJVar.cJ();
        int ac2 = cJVar.ac();
        if (this.CJ.get()) {
            if (cJ == 1 && ac2 == 100 && cJVar.Qhi()) {
                ROR.Qhi(HzH.Qhi()).Qhi(new com.bytedance.sdk.openadsdk.component.fl.Qhi(this.f8755fl, cJVar.CJ()));
                if (this.Gm) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(cJVar.CJ(), 1, this.WAv);
            }
        } else if (cJ != 1) {
            if (cJ == 2 || cJ == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.ROR;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(cJVar.fl(), cJVar.Tgh());
                }
                this.CJ.set(true);
                if (cJ == 3) {
                    com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(this.f8756hm, this.Sf);
                }
            }
        } else {
            if (this.ROR != null) {
                this.ROR.onAdLoaded(new fl(this.Qhi, cJVar.CJ(), ac2 == 101, this.Tgh));
            }
            this.CJ.set(true);
            if (ac2 == 101) {
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(cJVar.CJ(), this.WAv.Qhi().ac());
            } else if (ac2 == 100) {
                com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(cJVar.CJ(), 0, this.WAv);
                this.Gm = true;
                if (this.WAv.Qhi) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CQU(this.Tgh.getCodeId()) == 0) {
                    this.f8754ac.Qhi(this.Tgh);
                } else {
                    this.f8754ac.Qhi(new com.bytedance.sdk.openadsdk.component.fl.Qhi(this.f8755fl, cJVar.CJ()));
                }
            }
        }
    }

    public int Qhi(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        if (message.what != 1 || this.CJ.get()) {
            return;
        }
        Qhi(new com.bytedance.sdk.openadsdk.component.fl.cJ(3, 102, Constants.CP_MAC_CHINESE_TRADITIONAL, com.bytedance.sdk.openadsdk.core.Sf.Qhi(Constants.CP_MAC_CHINESE_TRADITIONAL)));
    }
}
