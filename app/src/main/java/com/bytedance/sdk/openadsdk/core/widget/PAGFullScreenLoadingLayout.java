package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class PAGFullScreenLoadingLayout extends PAGRelativeLayout {
    private PAGTextView CJ;
    private TTRoundRectImageView Qhi;
    private boolean ROR;
    private boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private PAGLoadingBar f9252ac;
    private PAGTextView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private PAGImageView f9253fl;

    public PAGFullScreenLoadingLayout(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (Qhi()) {
            cJ();
        }
    }

    public boolean Qhi() {
        return true;
    }

    public void cJ() {
        if (this.Tgh) {
            return;
        }
        this.Tgh = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.Qhi = tTRoundRectImageView;
        tTRoundRectImageView.setId(520093745);
        int cJ = zn.cJ(context, 64.0f);
        this.Qhi.setLayoutParams(new RelativeLayout.LayoutParams(cJ, cJ));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.cJ = pAGTextView;
        pAGTextView.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(zn.cJ(context, 219.0f), -2);
        layoutParams2.topMargin = zn.cJ(context, 16.0f);
        this.cJ.setLayoutParams(layoutParams2);
        this.cJ.setEllipsize(TextUtils.TruncateAt.END);
        this.cJ.setGravity(17);
        this.cJ.setMaxWidth(zn.cJ(context, 150.0f));
        this.cJ.setMaxLines(2);
        this.cJ.setTextColor(-1);
        this.cJ.setTextSize(1, 16.0f);
        PAGLoadingBar pAGLoadingBar = new PAGLoadingBar(context);
        this.f9252ac = pAGLoadingBar;
        pAGLoadingBar.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(zn.cJ(context, 219.0f), zn.cJ(context, 6.0f));
        layoutParams3.topMargin = zn.cJ(context, 24.0f);
        this.f9252ac.setLayoutParams(layoutParams3);
        this.CJ = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(zn.cJ(context, 138.0f), zn.cJ(context, 42.0f));
        layoutParams4.topMargin = zn.cJ(context, 48.0f);
        this.CJ.setLayoutParams(layoutParams4);
        this.CJ.setTextColor(-1);
        this.CJ.setTextSize(16.0f);
        this.CJ.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.CJ.setBackground(gradientDrawable);
        linearLayout.addView(this.Qhi);
        linearLayout.addView(this.cJ);
        linearLayout.addView(this.f9252ac);
        linearLayout.addView(this.CJ);
        Qhi(context);
        addView(linearLayout);
        addView(this.f9253fl);
    }

    public PAGTextView getDownloadButton() {
        return this.CJ;
    }

    public PAGLoadingBar getLoadingProgressBar() {
        return this.f9252ac;
    }

    public void setProgress(int i10) {
        PAGLoadingBar pAGLoadingBar = this.f9252ac;
        if (pAGLoadingBar != null) {
            pAGLoadingBar.setProgress(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.tP r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.Tgh
            if (r0 == 0) goto Le0
            if (r9 == 0) goto Le0
            boolean r0 = r8.ROR
            if (r0 == 0) goto Lc
            goto Le0
        Lc:
            r0 = 1
            r8.ROR = r0
            boolean r1 = r9.jPH()
            r2 = 8
            if (r1 != 0) goto L4b
            com.bytedance.sdk.openadsdk.core.model.hpZ r3 = r9.dIT()
            if (r3 == 0) goto L4b
            com.bytedance.sdk.openadsdk.core.model.hpZ r3 = r9.dIT()
            java.lang.String r3 = r3.Qhi()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L4b
            com.bytedance.sdk.openadsdk.core.model.hpZ r3 = r9.dIT()     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.component.fl.Gm r3 = com.bytedance.sdk.openadsdk.ROR.fl.Qhi(r3)     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.ROR.cJ r4 = new com.bytedance.sdk.openadsdk.ROR.cJ     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.core.model.hpZ r5 = r9.dIT()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r5.Qhi()     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.utils.pM r6 = new com.bytedance.sdk.openadsdk.utils.pM     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView r7 = r8.Qhi     // Catch: java.lang.Throwable -> L4b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r9, r5, r6)     // Catch: java.lang.Throwable -> L4b
            r3.Qhi(r4)     // Catch: java.lang.Throwable -> L4b
            goto L50
        L4b:
            com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView r3 = r8.Qhi
            r3.setVisibility(r2)
        L50:
            if (r1 == 0) goto L5a
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r1 = r8.cJ
            java.lang.String r2 = "Loading"
            r1.setText(r2)
            goto L73
        L5a:
            java.lang.String r1 = r9.dVA()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6e
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r1 = r8.cJ
            java.lang.String r2 = r9.dVA()
            r1.setText(r2)
            goto L73
        L6e:
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r1 = r8.cJ
            r1.setVisibility(r2)
        L73:
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r1 = r8.CJ
            if (r1 == 0) goto L7e
            java.lang.String r2 = r9.ots()
            r1.setText(r2)
        L7e:
            com.bytedance.sdk.openadsdk.core.customview.PAGImageView r1 = r8.f9253fl
            if (r1 == 0) goto Le0
            com.bytedance.sdk.openadsdk.core.widget.PAGFullScreenLoadingLayout$1 r2 = new com.bytedance.sdk.openadsdk.core.widget.PAGFullScreenLoadingLayout$1
            r2.<init>()
            r1.setOnClickListener(r2)
            com.bytedance.sdk.openadsdk.core.customview.PAGImageView r9 = r8.f9253fl
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            r1 = 1103101952(0x41c00000, float:24.0)
            if (r10 != r0) goto Lb9
            android.content.Context r10 = r8.getContext()
            r0 = 1115684864(0x42800000, float:64.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.zn.cJ(r10, r0)
            r9.width = r10
            android.content.Context r10 = r8.getContext()
            int r10 = com.bytedance.sdk.openadsdk.utils.zn.cJ(r10, r1)
            r9.height = r10
            android.content.Context r10 = r8.getContext()
            r0 = 1114636288(0x42700000, float:60.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.zn.cJ(r10, r0)
            r9.bottomMargin = r10
            goto Ldb
        Lb9:
            android.content.Context r10 = r8.getContext()
            r0 = 1109655552(0x42240000, float:41.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.zn.cJ(r10, r0)
            r9.width = r10
            android.content.Context r10 = r8.getContext()
            r0 = 1097859072(0x41700000, float:15.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.zn.cJ(r10, r0)
            r9.height = r10
            android.content.Context r10 = r8.getContext()
            int r10 = com.bytedance.sdk.openadsdk.utils.zn.cJ(r10, r1)
            r9.bottomMargin = r10
        Ldb:
            com.bytedance.sdk.openadsdk.core.customview.PAGImageView r10 = r8.f9253fl
            r10.setLayoutParams(r9)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.PAGFullScreenLoadingLayout.Qhi(com.bytedance.sdk.openadsdk.core.model.tP, int):void");
    }

    public void Qhi(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        this.f9253fl = pAGImageView;
        pAGImageView.setImageDrawable(MQ.ac(context, "tt_ad_logo_big"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zn.cJ(context, 64.0f), zn.cJ(context, 24.0f));
        layoutParams.bottomMargin = zn.cJ(context, 60.0f);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.f9253fl.setLayoutParams(layoutParams);
    }
}
