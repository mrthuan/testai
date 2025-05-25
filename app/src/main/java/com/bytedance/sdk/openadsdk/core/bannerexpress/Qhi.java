package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.CQU;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.cJ.cJ;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.ROR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Sf;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Tgh;
import com.bytedance.sdk.openadsdk.core.sDy;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl;
import com.bytedance.sdk.openadsdk.utils.aP;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.es;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PAGBannerAdImpl.java */
/* loaded from: classes.dex */
public class Qhi extends PAGBannerAd implements CQU.Qhi {
    private CQU ABk;
    protected AdSlot CJ;
    private com.bytedance.sdk.openadsdk.dislike.cJ Gm;
    private boolean HzH;
    protected BannerExpressView Qhi;
    private final boolean ROR;
    private PAGBannerAdWrapperListener Sf;

    /* renamed from: ac  reason: collision with root package name */
    protected tP f9000ac;
    protected final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    TTDislikeDialogAbstract f9001fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f9002hm;
    private boolean hpZ;
    private CQU.Qhi iMK;
    private boolean qMt;
    private NativeExpressView tP;

    /* renamed from: zc  reason: collision with root package name */
    private fl f9003zc;
    private int WAv = 0;
    private final Queue<Long> pA = new LinkedList();
    private String kYc = "banner_ad";
    private final AtomicBoolean MQ = new AtomicBoolean(false);
    protected final View.OnAttachStateChangeListener Tgh = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (!Qhi.this.qMt) {
                Qhi qhi = Qhi.this;
                qhi.Qhi(qhi.Qhi.getCurView(), Qhi.this.f9000ac);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Qhi.this.Qhi.ac();
        }
    };

    /* compiled from: PAGBannerAdImpl.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0119Qhi {
        void Qhi();
    }

    /* compiled from: PAGBannerAdImpl.java */
    /* loaded from: classes.dex */
    public static class cJ extends hm {
        boolean Qhi;

        /* renamed from: ac  reason: collision with root package name */
        WeakReference<Qhi> f9009ac;
        tP cJ;

        public cJ(boolean z10, tP tPVar, Qhi qhi) {
            super("ReportWindowFocusChangedAdShow");
            this.Qhi = z10;
            this.cJ = tPVar;
            this.f9009ac = new WeakReference<>(qhi);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<Qhi> weakReference = this.f9009ac;
            if (weakReference != null && weakReference.get() != null) {
                this.f9009ac.get().cJ(this.Qhi, this.cJ);
            }
        }
    }

    public Qhi(Context context, tP tPVar, AdSlot adSlot) {
        this.cJ = context;
        this.f9000ac = tPVar;
        this.CJ = adSlot;
        Qhi(context, tPVar, adSlot);
        this.ROR = false;
        this.qMt = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        BannerExpressView bannerExpressView = this.Qhi;
        if (bannerExpressView != null) {
            try {
                bannerExpressView.ac();
                this.Qhi.removeOnAttachStateChangeListener(this.Tgh);
            } catch (Throwable unused) {
            }
        }
        fl();
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.cJ.Qhi(this.f9000ac);
        IPMiBroadcastReceiver.Qhi(this.cJ, this.f9000ac);
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        tP tPVar = this.f9000ac;
        if (tPVar != null && tPVar.Gy() != null) {
            try {
                return this.f9000ac.Gy().get(str);
            } catch (Throwable th2) {
                ABk.Qhi("PAGBannerAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        tP tPVar = this.f9000ac;
        if (tPVar != null) {
            return tPVar.Gy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.HzH) {
            aP.Qhi(this.f9000ac, d10, str, str2);
            this.HzH = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.cJ cJVar = new com.bytedance.sdk.openadsdk.core.bannerexpress.cJ(pAGBannerAdInteractionCallback);
        this.Sf = cJVar;
        this.Qhi.setExpressInteractionListener(cJVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.cJ cJVar = new com.bytedance.sdk.openadsdk.core.bannerexpress.cJ(pAGBannerAdInteractionListener);
        this.Sf = cJVar;
        this.Qhi.setExpressInteractionListener(cJVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.hpZ) {
            aP.Qhi(this.f9000ac, d10);
            this.hpZ = true;
        }
    }

    private void CJ() {
        Tgh.Qhi(this.cJ).Qhi(this.CJ, 1, null, new Tgh.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.8
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.Tgh.Qhi
            public void Qhi(List<tP> list) {
                if (list == null || list.isEmpty()) {
                    Qhi.this.Tgh();
                    return;
                }
                tP tPVar = list.get(0);
                Qhi qhi = Qhi.this;
                qhi.Qhi.Qhi(tPVar, qhi.CJ);
                Qhi.this.ac(tPVar);
                Qhi.this.Qhi.CJ();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.Tgh.Qhi
            public void Qhi() {
                Qhi.this.Tgh();
            }
        }, 5000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tgh() {
        com.bytedance.sdk.component.utils.CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.removeCallbacksAndMessages(null);
            this.ABk.sendEmptyMessageDelayed(112202, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        cJ();
        Tgh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fl() {
        com.bytedance.sdk.component.utils.CQU cqu = this.ABk;
        if (cqu != null) {
            cqu.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(boolean z10, tP tPVar) {
        Long poll;
        try {
            if (z10) {
                this.pA.offer(Long.valueOf(System.currentTimeMillis()));
            } else if (this.pA.size() <= 0 || this.tP == null || (poll = this.pA.poll()) == null) {
            } else {
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(String.valueOf(System.currentTimeMillis() - poll.longValue()), tPVar, this.kYc, this.tP.getAdShowTime());
            }
        } catch (Exception e10) {
            ABk.Qhi("PAGBannerAdImpl", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(tP tPVar) {
        if (this.Qhi.getNextView() == null || !this.Qhi.Tgh()) {
            return;
        }
        cJ(this.Qhi.getNextView(), tPVar);
        Qhi(this.Qhi.getNextView(), tPVar);
    }

    public void Qhi(Context context, tP tPVar, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, tPVar, adSlot);
        this.Qhi = bannerExpressView;
        bannerExpressView.addOnAttachStateChangeListener(this.Tgh);
    }

    private void cJ(tP tPVar) {
        Queue<Long> queue = this.pA;
        if (queue == null || queue.size() <= 0 || tPVar == null) {
            return;
        }
        try {
            long longValue = this.pA.poll().longValue();
            if (longValue <= 0 || this.tP == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(String.valueOf(System.currentTimeMillis() - longValue), tPVar, this.kYc, this.tP.getAdShowTime());
        } catch (Exception e10) {
            ABk.Qhi("PAGBannerAdImpl", e10.getMessage());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Qhi(final NativeExpressView nativeExpressView, final tP tPVar) {
        final EmptyView emptyView;
        if (nativeExpressView == null || tPVar == null) {
            return;
        }
        this.f9000ac = tPVar;
        this.f9003zc = Qhi(tPVar);
        this.tP = nativeExpressView;
        final String Qhi = bxS.Qhi();
        final InterfaceC0119Qhi Qhi2 = Qhi();
        nativeExpressView.setClosedListenerKey(Qhi);
        nativeExpressView.setBannerClickClosedListener(Qhi2);
        nativeExpressView.setBackupListener(new com.bytedance.sdk.component.adexpress.cJ.ac() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.2
            @Override // com.bytedance.sdk.component.adexpress.cJ.ac
            public boolean Qhi(ViewGroup viewGroup, int i10) {
                try {
                    nativeExpressView.zc();
                    if (Qhi.this.f9000ac.IC()) {
                        VastBannerBackupView vastBannerBackupView = new VastBannerBackupView(nativeExpressView.getContext());
                        vastBannerBackupView.setClosedListenerKey(Qhi);
                        Qhi qhi = Qhi.this;
                        vastBannerBackupView.Qhi(qhi.f9000ac, nativeExpressView, qhi.f9003zc);
                        vastBannerBackupView.setDislikeInner(Qhi.this.Gm);
                        vastBannerBackupView.setDislikeOuter(Qhi.this.f9001fl);
                        vastBannerBackupView.setAdInteractionListener(Qhi.this.Sf);
                        nativeExpressView.setVastVideoHelper(vastBannerBackupView);
                        return true;
                    }
                    BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                    bannerExpressBackupView.setClosedListenerKey(Qhi);
                    Qhi qhi2 = Qhi.this;
                    bannerExpressBackupView.Qhi(qhi2.f9000ac, nativeExpressView, qhi2.f9003zc);
                    bannerExpressBackupView.setDislikeInner(Qhi.this.Gm);
                    bannerExpressBackupView.setDislikeOuter(Qhi.this.f9001fl);
                    bannerExpressBackupView.setAdInteractionListener(Qhi.this.Sf);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.ROR) {
            EmptyView Qhi3 = Qhi(nativeExpressView);
            if (Qhi3 == null) {
                Qhi3 = new EmptyView(this.cJ, nativeExpressView);
                nativeExpressView.addView(Qhi3);
            }
            emptyView = Qhi3;
            emptyView.setCallback(new EmptyView.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.3
                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
                public void Qhi(boolean z10) {
                    Qhi.this.Qhi(z10, tPVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
                public void cJ() {
                    Qhi.this.Qhi(emptyView, false, tPVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
                public void Qhi() {
                    Qhi.this.ac();
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
                public void Qhi(View view) {
                    if (Qhi.this.MQ.compareAndSet(false, true)) {
                        Qhi.this.Qhi(view, nativeExpressView, tPVar, Qhi, Qhi2);
                    }
                }
            });
        } else {
            es.Qhi(nativeExpressView, true, 1, new es.cJ() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.4
                @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
                public void Qhi(boolean z10) {
                    Qhi.this.Qhi(z10, tPVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
                public void cJ() {
                    Qhi.this.Qhi((EmptyView) null, true, tPVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
                public void Qhi() {
                    Qhi.this.ac();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
                public void Qhi(View view, boolean z10) {
                    if (z10 && Qhi.this.MQ.compareAndSet(false, true)) {
                        Qhi.this.Qhi(view, nativeExpressView, tPVar, Qhi, Qhi2);
                    }
                }
            }, null);
            emptyView = null;
        }
        Context Qhi4 = com.bytedance.sdk.component.utils.cJ.Qhi(nativeExpressView);
        if (Qhi4 == null) {
            Qhi4 = this.cJ;
        }
        Sf sf2 = new Sf(Qhi4, tPVar, this.kYc, 2);
        sf2.Qhi(nativeExpressView);
        sf2.Qhi(this);
        sf2.Qhi(this.f9003zc);
        sf2.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.5
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view, int i10) {
                if (Qhi.this.Sf != null) {
                    Qhi.this.Sf.onAdClicked();
                }
            }
        });
        nativeExpressView.setClickListener(sf2);
        ROR ror = new ROR(this.cJ, tPVar, this.kYc, 2);
        ror.Qhi((View) nativeExpressView);
        ror.Qhi(this);
        ror.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.6
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view, int i10) {
                if (Qhi.this.Sf != null) {
                    Qhi.this.Sf.onAdClicked();
                }
            }
        });
        NativeExpressView nativeExpressView2 = this.tP;
        if (nativeExpressView2 instanceof NativeExpressVideoView) {
            ror.Qhi(((NativeExpressVideoView) nativeExpressView2).getVideoController());
        }
        ror.Qhi(this.f9003zc);
        nativeExpressView.setClickCreativeListener(ror);
        if (this.ROR) {
            return;
        }
        emptyView.setNeedCheckingShow(true);
    }

    private void cJ(NativeExpressView nativeExpressView, tP tPVar) {
        if (nativeExpressView == null || tPVar == null) {
            return;
        }
        if (this.iMK != null) {
            this.Gm.Qhi(tPVar.EGK(), tPVar.VnT());
            nativeExpressView.setDislike(this.Gm);
        }
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f9001fl;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(tPVar.EGK(), tPVar.VnT());
            nativeExpressView.setOuterDislike(this.f9001fl);
        }
    }

    public void cJ() {
        this.f9000ac.Qhi(SystemClock.elapsedRealtime());
        this.Qhi.cJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(boolean z10, tP tPVar) {
        if (z10) {
            if (this.f9000ac.qb() && !this.f9000ac.ZRq()) {
                this.f9000ac.ROR(true);
                tP tPVar2 = this.f9000ac;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar2, this.kYc, tPVar2.up());
            }
            Tgh();
        } else {
            fl();
        }
        lG.cJ(new cJ(z10, tPVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(EmptyView emptyView, boolean z10, tP tPVar) {
        BannerExpressView bannerExpressView = this.Qhi;
        if (bannerExpressView != null) {
            if (!z10 && emptyView != null && emptyView == Qhi(bannerExpressView.getCurView())) {
                fl();
            } else if (z10) {
                fl();
            }
        }
        cJ(tPVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(View view, NativeExpressView nativeExpressView, tP tPVar, String str, InterfaceC0119Qhi interfaceC0119Qhi) {
        com.bytedance.sdk.openadsdk.core.hm.cJ().Qhi(str, interfaceC0119Qhi);
        Queue<Long> queue = this.pA;
        if (queue != null) {
            queue.offer(Long.valueOf(System.currentTimeMillis()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (nativeExpressView != null) {
                jSONObject.put("dynamic_show_type", nativeExpressView.getDynamicShowType());
                nativeExpressView.Qhi(jSONObject, tPVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(InMobiNetworkValues.WIDTH, view.getWidth());
                    jSONObject2.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, this.kYc, jSONObject);
        } catch (JSONException unused2) {
            ABk.Qhi("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.Sf;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, tPVar.ip());
        }
        if (tPVar.PER()) {
            js.Qhi(tPVar, view);
        }
        Tgh();
        BannerExpressView bannerExpressView = this.Qhi;
        if (bannerExpressView == null || bannerExpressView.getCurView() == null) {
            return;
        }
        this.Qhi.getCurView().WAv();
        this.Qhi.getCurView().Sf();
    }

    private fl Qhi(tP tPVar) {
        if (tPVar.ip() == 4) {
            return com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(this.cJ, tPVar, this.kYc);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EmptyView Qhi(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public InterfaceC0119Qhi Qhi() {
        return new InterfaceC0119Qhi() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.7
            @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.InterfaceC0119Qhi
            public void Qhi() {
                EmptyView emptyView;
                int width = Qhi.this.tP.getWidth();
                int height = Qhi.this.tP.getHeight();
                View Qhi = Qhi(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                Qhi.this.tP.iMK();
                if (Qhi.this.ROR) {
                    emptyView = null;
                } else {
                    Qhi qhi = Qhi.this;
                    emptyView = qhi.Qhi(qhi.tP);
                }
                Qhi.this.tP.removeAllViews();
                Qhi.this.tP.addView(Qhi, new ViewGroup.LayoutParams(width, height));
                Qhi.this.tP.setClickCreativeListener(null);
                Qhi.this.tP.setClickListener(null);
                if (HzH.CJ().lB() == 1) {
                    Qhi.this.fl();
                } else if (Qhi.this.f9002hm != 0 && !Qhi.this.ROR && emptyView != null) {
                    Qhi.this.tP.addView(emptyView);
                }
                if (Qhi.this.Sf != null) {
                    Qhi.this.Sf.onAdDismissed();
                }
                Qhi.this.qMt = true;
            }

            private View Qhi(boolean z10) {
                PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(Qhi.this.cJ);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                pAGFrameLayout.setBackgroundColor(-1);
                pAGFrameLayout.setLayoutParams(layoutParams);
                View view = new View(Qhi.this.cJ);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                pAGFrameLayout.addView(view, layoutParams2);
                PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(Qhi.this.cJ);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z10) {
                    pAGFrameLayout2.setBackground(MQ.ac(Qhi.this.cJ, "tt_ad_closed_background_300_250"));
                } else {
                    pAGFrameLayout2.setBackground(MQ.ac(Qhi.this.cJ, "tt_ad_closed_background_320_50"));
                }
                pAGFrameLayout.addView(pAGFrameLayout2, layoutParams3);
                PAGImageView pAGImageView = new PAGImageView(Qhi.this.cJ);
                pAGImageView.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z10) {
                    int cJ2 = zn.cJ(Qhi.this.cJ, 16.0f);
                    layoutParams4.width = zn.cJ(Qhi.this.cJ, 77.0f);
                    layoutParams4.height = zn.cJ(Qhi.this.cJ, 14.0f);
                    layoutParams4.leftMargin = cJ2;
                    layoutParams4.topMargin = cJ2;
                } else {
                    int cJ3 = zn.cJ(Qhi.this.cJ, 8.0f);
                    layoutParams4.width = zn.cJ(Qhi.this.cJ, 45.0f);
                    layoutParams4.height = zn.cJ(Qhi.this.cJ, 8.18f);
                    layoutParams4.leftMargin = cJ3;
                    layoutParams4.topMargin = cJ3;
                }
                pAGImageView.setImageResource(MQ.CJ(Qhi.this.cJ, "tt_ad_closed_logo_red"));
                pAGFrameLayout2.addView(pAGImageView, layoutParams4);
                PAGTextView pAGTextView = new PAGTextView(Qhi.this.cJ);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                pAGTextView.setAlpha(0.5f);
                pAGTextView.setLines(1);
                pAGTextView.setText(MQ.Qhi(Qhi.this.cJ, "tt_ad_is_closed"));
                if (z10) {
                    pAGTextView.setTextSize(18.0f);
                } else {
                    pAGTextView.setTextSize(12.0f);
                }
                pAGFrameLayout2.addView(pAGTextView, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Qhi qhi = Qhi.this;
                        TTWebsiteActivity.Qhi(qhi.cJ, qhi.f9000ac, qhi.kYc);
                    }
                };
                pAGImageView.setOnClickListener(onClickListener);
                pAGTextView.setOnClickListener(onClickListener);
                return pAGFrameLayout;
            }
        };
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        if (message.what == 112202) {
            if (sDy.Qhi(this.Qhi, 50, 1)) {
                this.WAv += 1000;
            }
            if (this.WAv >= this.f9002hm) {
                CJ();
                AdSlot adSlot = this.CJ;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.WAv = 0;
                fl();
                return;
            }
            Tgh();
        }
    }
}
