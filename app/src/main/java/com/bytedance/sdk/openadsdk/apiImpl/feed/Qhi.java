package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PAGExtraFuncationHelper.java */
/* loaded from: classes.dex */
public class Qhi {
    private boolean ABk = false;
    private boolean CJ;
    private com.bytedance.sdk.openadsdk.core.cJ.Qhi Gm;
    protected final tP Qhi;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ ROR;
    private PAGMediaView Sf;
    private cJ Tgh;
    private PAGMediaView WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final String f8599ac;
    private final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private WeakReference<NativeVideoTsView> f8600fl;

    /* renamed from: hm  reason: collision with root package name */
    private NativeExpressView f8601hm;
    private WeakReference<com.bytedance.sdk.openadsdk.core.ROR.ROR> iMK;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.cJ.cJ f8602zc;

    public Qhi(Context context, tP tPVar, String str) {
        this.cJ = context;
        this.Qhi = tPVar;
        this.f8599ac = str;
    }

    private String iMK() {
        hpZ hpz;
        List<hpZ> cjC = this.Qhi.cjC();
        if (cjC.isEmpty() || (hpz = cjC.get(0)) == null) {
            return null;
        }
        return hpz.Qhi();
    }

    private PAGMediaView pA() {
        if (tP.fl(this.Qhi)) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ cJVar = this.ROR;
            if (cJVar != null && (cJVar instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.Qhi)) {
                NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) cJVar.CJ();
                nativeExpressVideoView.setTag(520093762, Boolean.TRUE);
                if (!this.ABk) {
                    this.ROR.fl();
                }
                this.ABk = true;
                return Qhi(nativeExpressVideoView);
            }
            return null;
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ cJVar2 = this.ROR;
        if (cJVar2 != null) {
            NativeExpressView CJ = cJVar2.CJ();
            CJ.setTag(520093762, Boolean.TRUE);
            if (!this.ABk) {
                this.ROR.fl();
            }
            this.ABk = true;
            return Qhi(CJ);
        }
        return null;
    }

    public void ABk() {
        com.bytedance.sdk.openadsdk.core.ROR.ROR ror;
        WeakReference<com.bytedance.sdk.openadsdk.core.ROR.ROR> weakReference = this.iMK;
        if (weakReference != null && (ror = weakReference.get()) != null) {
            ror.Qhi(13);
        }
    }

    public String CJ() {
        tP tPVar = this.Qhi;
        if (tPVar != null) {
            return tPVar.dVA();
        }
        return null;
    }

    public View Gm() {
        tP tPVar;
        if (HzH.Qhi() != null && (tPVar = this.Qhi) != null) {
            if (!tPVar.IC() || !this.Qhi.Sf()) {
                return null;
            }
            ImageView imageView = new ImageView(HzH.Qhi());
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi((int) zn.Qhi(HzH.Qhi(), 14.0f, true), imageView, this.Qhi);
            return imageView;
        }
        ABk.Qhi("TTNativeAdImpl", "getAdChoicesView mContext == null");
        return null;
    }

    public void Qhi(cJ cJVar) {
        this.Tgh = cJVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView ROR() {
        PAGMediaView hm2;
        com.bytedance.sdk.openadsdk.utils.cJ.Qhi(this.Qhi);
        if (this.Qhi.EBS() == 2) {
            hm2 = pA();
            Qhi(hm2);
        } else {
            hm2 = hm();
        }
        if (hm2 != null) {
            hm2.setMrcTrackerKey(com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.cJ(this.Qhi));
        } else {
            hm2 = new PAGMediaView(this.cJ) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.ac.Qhi(this, Qhi.this.Qhi);
                }
            };
        }
        if (hm2 instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) hm2).setMaterialMeta(this.Qhi);
        }
        this.WAv = hm2;
        return hm2;
    }

    public PAGMediaView Sf() {
        return this.WAv;
    }

    public String Tgh() {
        tP tPVar = this.Qhi;
        if (tPVar != null) {
            return tPVar.ots();
        }
        return null;
    }

    public View WAv() {
        if (HzH.Qhi() == null) {
            ABk.Qhi("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(HzH.Qhi());
        imageView.setImageResource(MQ.CJ(HzH.Qhi(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Qhi.this.zc();
            }
        });
        return imageView;
    }

    public PAGImageItem ac() {
        tP tPVar = this.Qhi;
        if (tPVar != null && tPVar.dIT() != null) {
            return new PAGImageItem(this.Qhi.dIT().ac(), this.Qhi.dIT().cJ(), this.Qhi.dIT().Qhi(), (float) this.Qhi.dIT().CJ());
        }
        return null;
    }

    public NativeExpressView cJ() {
        return this.f8601hm;
    }

    public String fl() {
        tP tPVar = this.Qhi;
        if (tPVar != null) {
            return tPVar.zjb();
        }
        return null;
    }

    public PAGMediaView hm() {
        if (tP.fl(this.Qhi)) {
            cJ cJVar = this.Tgh;
            if (cJVar != null) {
                View fl2 = cJVar.fl();
                if (fl2 != null) {
                    if (fl2.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fl2.getParent()).removeView(fl2);
                    }
                    PAGMediaView pAGMediaView = this.Sf;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.Sf.setOnTouchListener(null);
                    }
                    PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.cJ, fl2, this);
                    pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
                    if (this.Gm != null && com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CJ(String.valueOf(this.Qhi.Hy()))) {
                        pAGVideoMediaView.setOnClickListener(this.Gm);
                        pAGVideoMediaView.setOnTouchListener(this.Gm);
                    } else {
                        com.bytedance.sdk.openadsdk.core.cJ.ac acVar = new com.bytedance.sdk.openadsdk.core.cJ.ac() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi.4
                            @Override // com.bytedance.sdk.openadsdk.core.cJ.ac
                            public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
                                try {
                                    ((PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(acVar);
                        pAGVideoMediaView.setOnTouchListener(acVar);
                    }
                    this.Sf = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List<hpZ> cjC = this.Qhi.cjC();
        if (cjC != null && !cjC.isEmpty()) {
            ImageView imageView = new ImageView(this.cJ);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            hpZ hpz = cjC.get(0);
            if (hpz != null) {
                com.bytedance.sdk.openadsdk.ROR.fl.Qhi(hpz).ac(2).Qhi(com.bytedance.sdk.openadsdk.ROR.ac.Qhi(this.Qhi, hpz.Qhi(), imageView));
            }
            PAGMediaView Qhi = Qhi(imageView);
            if (this.Gm != null && com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CJ(String.valueOf(this.Qhi.Hy()))) {
                Qhi.setOnClickListener(this.Gm);
                Qhi.setOnTouchListener(this.Gm);
            } else {
                Qhi.setOnClickListener(null);
                Qhi.setOnTouchListener(null);
            }
            Qhi.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView2 = this.Sf;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.Sf.setOnTouchListener(null);
            }
            this.Sf = Qhi;
            return Qhi;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    public void zc() {
        Context context = this.cJ;
        if (context != null) {
            TTWebsiteActivity.Qhi(context, this.Qhi, this.f8599ac);
        }
    }

    private ac cJ(final PAGVideoAdListener pAGVideoAdListener) {
        return new ac() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi.7
            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ac
            public void Qhi(int i10, int i11) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ac
            public void ac(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ac
            public void cJ(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ac
            public void Qhi(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    public void Qhi(com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ cJVar) {
        this.ROR = cJVar;
    }

    public void Qhi(NativeVideoTsView nativeVideoTsView) {
        this.f8600fl = new WeakReference<>(nativeVideoTsView);
    }

    public void Qhi(boolean z10) {
        this.CJ = z10;
    }

    public PAGMediaView Qhi() {
        return this.Sf;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi) {
        this.Gm = qhi;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar) {
        this.f8602zc = cJVar;
    }

    private void Qhi(final PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            String iMK = iMK();
            if (TextUtils.isEmpty(iMK)) {
                return;
            }
            com.bytedance.sdk.openadsdk.ROR.fl.Qhi(iMK).Qhi(200).cJ(200).fl(zn.CJ(HzH.Qhi())).CJ(zn.ac(HzH.Qhi())).ac(2).Qhi(new com.bytedance.sdk.component.fl.hm() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi.3
                @Override // com.bytedance.sdk.component.fl.hm
                public Bitmap Qhi(Bitmap bitmap) {
                    return kYc.Qhi(HzH.Qhi(), bitmap, 25);
                }
            }).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(this.Qhi, iMK, new com.bytedance.sdk.component.fl.HzH<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi.2
                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(int i10, String str, Throwable th2) {
                }

                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(zc<Bitmap> zcVar) {
                    if (zcVar == null || zcVar.cJ() == null || zcVar.ac() == null) {
                        return;
                    }
                    pAGMediaView.setBackground(new BitmapDrawable(zcVar.cJ()));
                }
            }));
        } catch (Exception unused) {
        }
    }

    private PAGMediaView Qhi(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        NativeExpressView nativeExpressView = this.f8601hm;
        if (nativeExpressView != null) {
            nativeExpressView.setClickListener(null);
            this.f8601hm.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar = this.f8602zc;
        if (cJVar != null && (cJVar instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.Sf) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.Sf) cJVar);
        }
        com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi = this.Gm;
        if (qhi != null && (qhi instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.ROR) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.ROR) qhi);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.cJ) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi.5
            private void Qhi(boolean z10) {
                int i11;
                Integer num = this.Qhi;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.MQ.Qhi.cJ Qhi = com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(num);
                    if (z10) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(Qhi, i11);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.ac.Qhi(this, Qhi.this.Qhi);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (!(view instanceof NativeExpressView)) {
                    Qhi(z10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                Qhi.this.Qhi(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof NativeExpressView) {
            this.f8601hm = (NativeExpressView) view;
        }
        return pAGMediaView;
    }

    public void Qhi(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ cJVar;
        if (this.Qhi.EBS() == 2 && tP.fl(this.Qhi) && (cJVar = this.ROR) != null && (cJVar instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.Qhi)) {
            NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) cJVar.CJ();
            if (nativeExpressVideoView != null) {
                nativeExpressVideoView.setVideoAdListener(cJ(pAGVideoAdListener));
                return;
            }
            return;
        }
        cJ cJVar2 = this.Tgh;
        if (cJVar2 != null) {
            cJVar2.Qhi(cJ(pAGVideoAdListener));
        }
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.ROR.ROR ror) {
        this.iMK = new WeakReference<>(ror);
    }
}
