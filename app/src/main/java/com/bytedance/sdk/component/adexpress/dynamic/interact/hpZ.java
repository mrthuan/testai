package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import org.json.JSONObject;

/* compiled from: ShakeInteract.java */
/* loaded from: classes.dex */
public class hpZ implements hm<ShakeAnimationView> {
    private com.bytedance.sdk.component.adexpress.dynamic.ac.Sf CJ;
    private ShakeAnimationView Qhi;
    private int ROR;
    private int Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private DynamicBaseWidget f8242ac;
    private Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f8243fl;

    /* renamed from: hm  reason: collision with root package name */
    private JSONObject f8244hm;

    public hpZ(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2, String str, int i10, int i11, int i12, JSONObject jSONObject) {
        this.cJ = context;
        this.f8242ac = dynamicBaseWidget;
        this.CJ = sf2;
        this.f8243fl = str;
        this.Tgh = i10;
        this.ROR = i11;
        this.Sf = i12;
        this.f8244hm = jSONObject;
        fl();
    }

    private void fl() {
        final com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi dynamicClickListener = this.f8242ac.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.f8243fl)) {
            Context context = this.cJ;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, com.bytedance.sdk.component.adexpress.ac.Qhi.hm(context), this.Tgh, this.ROR, this.Sf, this.f8244hm);
            this.Qhi = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.Qhi.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.cJ;
            this.Qhi = new ShakeAnimationView(context2, com.bytedance.sdk.component.adexpress.ac.Qhi.Sf(context2), this.Tgh, this.ROR, this.Sf, this.f8244hm);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.Qhi.setGravity(17);
        layoutParams.gravity = 17;
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setTranslationY(CQU.Qhi(this.cJ, this.CJ.ReL()));
        this.Qhi.setShakeText(this.CJ.Dq());
        this.Qhi.setClipChildren(false);
        this.Qhi.setOnShakeViewListener(new ShakeAnimationView.Qhi() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.hpZ.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    /* renamed from: CJ */
    public ShakeAnimationView ac() {
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
