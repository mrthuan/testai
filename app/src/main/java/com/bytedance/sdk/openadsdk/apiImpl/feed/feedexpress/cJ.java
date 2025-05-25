package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.cJ.ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.apiImpl.feed.hm;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: PAGFeedExpressView.java */
/* loaded from: classes.dex */
public class cJ extends hm {
    protected String Gm;
    protected final Context Sf;
    protected NativeExpressView WAv;

    /* renamed from: hm  reason: collision with root package name */
    protected AdSlot f8607hm;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f8608zc;

    public cJ(Context context, tP tPVar, AdSlot adSlot) {
        super(context, tPVar, 5, true);
        this.Gm = "embeded_ad";
        this.f8608zc = false;
        this.cJ.Sf(1);
        this.CJ.Qhi(this);
        this.Sf = context;
        this.f8607hm = adSlot;
        Qhi();
        cJ();
    }

    private void cJ() {
        NativeExpressView nativeExpressView = this.WAv;
        if (nativeExpressView != null) {
            nativeExpressView.setBackupListener(new ac() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ.1
                @Override // com.bytedance.sdk.component.adexpress.cJ.ac
                public boolean Qhi(ViewGroup viewGroup, int i10) {
                    PAGFeedExpressBackupView pAGFeedExpressBackupView = new PAGFeedExpressBackupView(cJ.this.WAv.getContext());
                    pAGFeedExpressBackupView.setExtraFuncationHelper(((hm) cJ.this).CJ);
                    pAGFeedExpressBackupView.Qhi(cJ.this.WAv);
                    return true;
                }
            });
        }
    }

    public NativeExpressView CJ() {
        return this.WAv;
    }

    public void ac() {
        NativeExpressView nativeExpressView = this.WAv;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    if (!cJ.this.WAv.ABk()) {
                        cJ.this.Qhi(f10, f11);
                        if (cJ.this.f8608zc) {
                            cJ.this.WAv.Sf();
                            return;
                        }
                        return;
                    }
                    cJ cJVar = cJ.this;
                    Context context = cJVar.Sf;
                    tP tPVar = ((hm) cJVar).cJ;
                    cJ cJVar2 = cJ.this;
                    com.bytedance.sdk.openadsdk.apiImpl.feed.cJ cJVar3 = new com.bytedance.sdk.openadsdk.apiImpl.feed.cJ(context, tPVar, 5, cJVar2.f8607hm, ((hm) cJVar2).CJ, ((hm) cJ.this).Qhi);
                    cJ cJVar4 = cJ.this;
                    if (cJVar4 instanceof Qhi) {
                        cJVar3.Qhi(((NativeExpressVideoView) cJVar4.CJ()).getVideoAdListener());
                    }
                    ((hm) cJ.this).CJ.Qhi((com.bytedance.sdk.openadsdk.core.cJ.Qhi) cJ.this.WAv.getClickCreativeListener());
                    PAGMediaView hm2 = ((hm) cJ.this).CJ.hm();
                    if (hm2 == null) {
                        hm2 = new PAGMediaView(cJ.this.Sf);
                    }
                    cJ.this.WAv.addView(hm2);
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                }
            });
        }
    }

    public void fl() {
        NativeExpressView nativeExpressView = this.WAv;
        if (nativeExpressView != null) {
            nativeExpressView.hm();
        }
    }

    public void Qhi() {
        this.WAv = new NativeExpressView(this.Sf, this.cJ, this.f8607hm, this.Gm);
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(float f10, float f11) {
        int cJ = zn.cJ(this.Sf, f10);
        int cJ2 = zn.cJ(this.Sf, f11);
        ViewGroup.LayoutParams layoutParams = this.WAv.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(cJ, cJ2);
        }
        layoutParams.width = cJ;
        layoutParams.height = cJ2;
        this.WAv.setLayoutParams(layoutParams);
    }

    public void Qhi(boolean z10) {
        this.f8608zc = z10;
    }
}
