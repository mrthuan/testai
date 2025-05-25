package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import org.json.JSONObject;

/* compiled from: WriggleGuideInteract.java */
/* loaded from: classes.dex */
public class qMt implements hm<WriggleGuideAnimationView> {
    private com.bytedance.sdk.component.adexpress.dynamic.ac.Sf CJ;
    private WriggleGuideAnimationView Qhi;
    private com.bytedance.sdk.component.adexpress.dynamic.ac.Gm Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private DynamicBaseWidget f8246ac;
    private Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f8247fl;

    public qMt(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2, String str, com.bytedance.sdk.component.adexpress.dynamic.ac.Gm gm2) {
        this.cJ = context;
        this.f8246ac = dynamicBaseWidget;
        this.CJ = sf2;
        this.f8247fl = str;
        this.Tgh = gm2;
        fl();
    }

    private void fl() {
        int dIT = this.CJ.dIT();
        final com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi dynamicClickListener = this.f8246ac.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.f8247fl)) {
            Context context = this.cJ;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, com.bytedance.sdk.component.adexpress.ac.Qhi.WAv(context), this.Tgh);
            this.Qhi = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.Qhi.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.Qhi.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.CJ.EGK())) {
                    this.Qhi.getTopTextView().setText(com.bytedance.sdk.component.utils.MQ.cJ(this.cJ, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.Qhi.getTopTextView().setText(this.CJ.EGK());
                }
            }
        } else {
            Context context2 = this.cJ;
            this.Qhi = new WriggleGuideAnimationView(context2, com.bytedance.sdk.component.adexpress.ac.Qhi.WAv(context2), this.Tgh);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.Qhi.setTranslationY(-((int) CQU.Qhi(this.cJ, dIT)));
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setShakeText(this.CJ.Dq());
        this.Qhi.setClipChildren(false);
        final View wriggleProgressIv = this.Qhi.getWriggleProgressIv();
        this.Qhi.setOnShakeViewListener(new WriggleGuideAnimationView.Qhi() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.qMt.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    /* renamed from: CJ */
    public WriggleGuideAnimationView ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        this.Qhi.Qhi();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        this.Qhi.clearAnimation();
    }
}
