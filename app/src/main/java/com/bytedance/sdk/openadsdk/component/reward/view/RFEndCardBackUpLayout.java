package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class RFEndCardBackUpLayout extends PAGFrameLayout {
    private TextView CJ;
    private boolean Qhi;
    private PAGTextView ROR;
    private PAGLogoView Sf;
    private PAGTextView Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private TTRoundRectImageView f8876ac;
    private com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private TTRatingBar2 f8877fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8878hm;

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(iMK.rB);
    }

    private void CJ() {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        if (this.cJ.cJ.SL() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        setBackgroundColor(-16777216);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        if (z10) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(zn.cJ(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int cJ = zn.cJ(context, 24.0f);
        layoutParams.rightMargin = cJ;
        layoutParams.leftMargin = cJ;
        addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.f8876ac = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(zn.cJ(context, 80.0f), zn.cJ(context, 80.0f));
        layoutParams2.bottomMargin = zn.cJ(context, 12.0f);
        pAGLinearLayout.addView(this.f8876ac, layoutParams2);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.CJ = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.CJ.setGravity(17);
        this.CJ.setMaxLines(2);
        this.CJ.setMaxWidth(zn.cJ(context, 180.0f));
        this.CJ.setTextColor(-1);
        this.CJ.setTextSize(2, 24.0f);
        pAGLinearLayout.addView(this.CJ, new LinearLayout.LayoutParams(-1, -2));
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.Tgh = pAGTextView2;
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.Tgh.setGravity(17);
        this.Tgh.setMaxLines(2);
        this.Tgh.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.Tgh.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = zn.cJ(context, 8.0f);
        pAGLinearLayout.addView(this.Tgh, layoutParams3);
        this.f8877fl = new TTRatingBar2(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, zn.cJ(context, 16.0f));
        layoutParams4.topMargin = zn.cJ(context, 12.0f);
        this.f8877fl.setVisibility(8);
        pAGLinearLayout.addView(this.f8877fl, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.ROR = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.ROR.setGravity(17);
        this.ROR.setText(MQ.cJ(context, "tt_video_download_apk"));
        this.ROR.setTextColor(-1);
        this.ROR.setTextSize(2, 16.0f);
        this.ROR.setBackground(hm.Qhi(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, zn.cJ(context, 44.0f));
        layoutParams5.topMargin = zn.cJ(context, 54.0f);
        pAGLinearLayout.addView(this.ROR, layoutParams5);
        this.Sf = new PAGLogoView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, zn.cJ(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = zn.cJ(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = zn.cJ(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = zn.cJ(context, 24.0f);
        }
        addView(this.Sf, layoutParams6);
    }

    private void ac() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(iMK.Sf);
        pAGImageView.setVisibility(8);
        addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView = new SSWebView(context, true);
        sSWebView.setVisibility(8);
        sSWebView.setId(iMK.f9380hm);
        addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
    }

    private void cJ() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(zn.cJ(context, 16.0f), 0, zn.cJ(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        if (this.cJ.Dq == 2) {
            PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
            pAGLinearLayout2.setOrientation(0);
            pAGLinearLayout.addView(pAGLinearLayout2, new FrameLayout.LayoutParams(-1, -2));
            Qhi(pAGLinearLayout2, this.f8878hm);
        } else if (this.f8878hm == 2) {
            cJ(pAGLinearLayout);
        } else {
            Qhi(pAGLinearLayout);
        }
        View pAGLogoView = new PAGLogoView(this.cJ.FQ);
        pAGLogoView.setId(520093757);
        pAGLinearLayout.addView(pAGLogoView);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.Qhi(RFEndCardBackUpLayout.this.cJ.FQ, RFEndCardBackUpLayout.this.cJ.cJ, RFEndCardBackUpLayout.this.cJ.f8798fl);
            }
        });
    }

    public void setShownAdCount(int i10) {
        this.f8878hm = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            Qhi();
        }
    }

    public void Qhi(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.cJ = qhi;
        if (qhi.cJ.IC()) {
            Qhi();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Qhi() {
        if (this.Qhi) {
            return;
        }
        this.Qhi = true;
        if (this.cJ.cJ.hU() && this.f8878hm > 1) {
            cJ();
            return;
        }
        tP tPVar = this.cJ.cJ;
        if (tPVar.IC()) {
            ac();
            return;
        }
        CJ();
        Qhi(tPVar, this.ROR);
    }

    private void Qhi(tP tPVar, PAGTextView pAGTextView) {
        Qhi(pAGTextView, tPVar, -1);
        Qhi(this.f8876ac, tPVar);
        TTRoundRectImageView tTRoundRectImageView = this.f8876ac;
        if (tTRoundRectImageView != null) {
            tTRoundRectImageView.setOnClickListener(this.cJ.aP.fl());
        }
        TTRatingBar2 tTRatingBar2 = this.f8877fl;
        if (tTRatingBar2 != null) {
            zn.Qhi((TextView) null, tTRatingBar2, tPVar);
            if (tPVar.pv() != null) {
                this.f8877fl.setVisibility(0);
            }
            this.f8877fl.setOnClickListener(this.cJ.aP.fl());
        }
        if (this.CJ != null) {
            if (tPVar.pv() != null && !TextUtils.isEmpty(tPVar.pv().cJ())) {
                this.CJ.setText(tPVar.pv().cJ());
            } else if (!TextUtils.isEmpty(tPVar.PAe())) {
                this.CJ.setText(tPVar.PAe());
            } else {
                this.CJ.setVisibility(8);
            }
            this.CJ.setOnClickListener(this.cJ.aP.fl());
        }
        if (this.Tgh != null) {
            String dVA = tPVar.dVA();
            if (!TextUtils.isEmpty(dVA)) {
                this.Tgh.setText(dVA);
            } else {
                this.Tgh.setVisibility(8);
            }
            this.Tgh.setOnClickListener(this.cJ.aP.fl());
        }
        this.Sf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Qhi(RFEndCardBackUpLayout.this.cJ.FQ, RFEndCardBackUpLayout.this.cJ.cJ, RFEndCardBackUpLayout.this.cJ.f8798fl);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void cJ(PAGLinearLayout pAGLinearLayout) {
        tP tPVar = this.cJ.cJ;
        if (tPVar instanceof com.bytedance.sdk.openadsdk.core.model.MQ) {
            List<tP> ac2 = ((com.bytedance.sdk.openadsdk.core.model.MQ) tPVar).XJ().ac();
            for (int i10 = 0; i10 < ac2.size() && i10 < 2; i10++) {
                cJ(pAGLinearLayout, ac2.get(i10), i10);
            }
        }
    }

    private void cJ(PAGLinearLayout pAGLinearLayout, tP tPVar, int i10) {
        Context context = getContext();
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10 > 0 ? zn.cJ(context, 12.0f) : 0, 0, 0);
        pAGLinearLayout2.setBackground(new Qhi(context));
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(zn.cJ(context, 70.0f), zn.cJ(context, 63.0f));
        layoutParams2.setMargins(0, zn.cJ(context, 24.0f), 0, zn.cJ(context, 12.0f));
        pAGLinearLayout2.addView(tTRoundRectImageView, layoutParams2);
        Qhi(tTRoundRectImageView, tPVar);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setTextSize(18.0f);
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setGravity(17);
        pAGTextView.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(zn.cJ(context, 56.0f), 0, zn.cJ(context, 56.0f), 0);
        pAGLinearLayout2.addView(pAGTextView, layoutParams3);
        Qhi(pAGTextView, tPVar, tPVar.PAe());
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setSingleLine(true);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setTextSize(16.0f);
        pAGTextView2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(zn.cJ(context, 56.0f), zn.cJ(context, 4.0f), zn.cJ(context, 56.0f), 0);
        pAGLinearLayout2.addView(pAGTextView2, layoutParams4);
        Qhi(pAGTextView2, tPVar);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setOrientation(0);
        pAGLinearLayout3.setGravity(16);
        pAGLinearLayout2.addView(pAGLinearLayout3, new FrameLayout.LayoutParams(-2, -2));
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setTextSize(16.0f);
        pAGTextView3.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout3.addView(pAGTextView3, new ViewGroup.LayoutParams(-2, -2));
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = zn.cJ(context, 8.0f);
        pAGLinearLayout3.addView(tTRatingBar2, layoutParams5);
        zn.Qhi(pAGTextView3, tTRatingBar2, tPVar, 18);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        pAGTextView4.setGravity(17);
        pAGTextView4.setId(520093707);
        pAGTextView4.setText(MQ.cJ(context, "tt_video_download_apk"));
        pAGTextView4.setTextColor(-1);
        pAGTextView4.setTextSize(2, 16.0f);
        pAGTextView4.setBackground(hm.Qhi(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, zn.cJ(context, 36.0f));
        layoutParams6.setMargins(zn.cJ(context, 20.0f), zn.cJ(context, 36.0f), zn.cJ(context, 20.0f), zn.cJ(context, 20.0f));
        pAGLinearLayout2.addView(pAGTextView4, layoutParams6);
        Qhi(pAGTextView4, tPVar, i10);
    }

    /* loaded from: classes.dex */
    public static final class Qhi extends Drawable {
        Path Qhi = new Path();

        /* renamed from: ac  reason: collision with root package name */
        private final int f8879ac;
        private final Drawable cJ;

        public Qhi(Context context) {
            this.cJ = MQ.ac(context, "tt_ad_bg_header_gradient");
            this.f8879ac = zn.cJ(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.Qhi);
            canvas.drawColor(-1);
            this.cJ.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13);
            float f10 = i12;
            this.cJ.setBounds(i10, i11, i12, (int) (((1.0f * f10) / this.cJ.getIntrinsicWidth()) * this.cJ.getIntrinsicHeight()));
            this.Qhi.reset();
            Path path = this.Qhi;
            RectF rectF = new RectF(0.0f, 0.0f, f10, i13);
            int i14 = this.f8879ac;
            path.addRoundRect(rectF, i14, i14, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    private void Qhi(PAGImageView pAGImageView, tP tPVar) {
        if (pAGImageView == null || tPVar.dIT() == null || TextUtils.isEmpty(tPVar.dIT().Qhi())) {
            return;
        }
        com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(tPVar.dIT(), pAGImageView, tPVar);
    }

    private void Qhi(TextView textView, tP tPVar, String str) {
        if (textView != null) {
            if (tPVar.pv() != null && !TextUtils.isEmpty(tPVar.pv().cJ())) {
                textView.setText(tPVar.pv().cJ());
            } else {
                textView.setText(str);
            }
        }
    }

    private void Qhi(PAGLinearLayout pAGLinearLayout, int i10) {
        tP tPVar = this.cJ.cJ;
        if (tPVar instanceof com.bytedance.sdk.openadsdk.core.model.MQ) {
            List<tP> ac2 = ((com.bytedance.sdk.openadsdk.core.model.MQ) tPVar).XJ().ac();
            for (int i11 = 0; i11 < ac2.size() && i11 < i10 && i11 < 3; i11++) {
                Qhi(pAGLinearLayout, ac2.get(i11), i11, i10);
            }
        }
    }

    private void Qhi(PAGLinearLayout pAGLinearLayout, tP tPVar, int i10, int i11) {
        Context context = getContext();
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i10 > 0) {
            layoutParams.setMargins(zn.cJ(context, 12.0f), 0, 0, 0);
        }
        pAGLinearLayout2.setBackground(new Qhi(context));
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setOrientation(0);
        pAGLinearLayout3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = zn.cJ(context, 20.0f);
        layoutParams2.leftMargin = zn.cJ(context, 17.0f);
        layoutParams2.rightMargin = zn.cJ(context, 30.0f);
        pAGLinearLayout2.addView(pAGLinearLayout3, layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        pAGLinearLayout3.addView(tTRoundRectImageView, new FrameLayout.LayoutParams(zn.cJ(context, 44.0f), zn.cJ(context, 44.0f)));
        Qhi(tTRoundRectImageView, tPVar);
        PAGLinearLayout pAGLinearLayout4 = new PAGLinearLayout(context);
        pAGLinearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = zn.cJ(context, 7.0f);
        pAGLinearLayout3.addView(pAGLinearLayout4, layoutParams3);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setTextSize(18.0f);
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setGravity(8388611);
        pAGTextView.setTypeface(null, 1);
        pAGLinearLayout4.addView(pAGTextView, new FrameLayout.LayoutParams(-1, -2));
        Qhi(pAGTextView, tPVar, tPVar.PAe());
        PAGLinearLayout pAGLinearLayout5 = new PAGLinearLayout(context);
        pAGLinearLayout5.setOrientation(0);
        pAGLinearLayout5.setGravity(16);
        pAGLinearLayout4.addView(pAGLinearLayout5, new FrameLayout.LayoutParams(-2, -2));
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setTextSize(16.0f);
        pAGTextView2.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout5.addView(pAGTextView2, new ViewGroup.LayoutParams(-2, -2));
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = zn.cJ(context, 8.0f);
        pAGLinearLayout5.addView(tTRatingBar2, layoutParams4);
        zn.Qhi(pAGTextView2, tTRatingBar2, tPVar, 18);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        if (i11 == 2) {
            pAGTextView3.setSingleLine(true);
        } else {
            pAGTextView3.setLines(2);
        }
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setTextSize(16.0f);
        pAGTextView3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i12 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i12;
        layoutParams5.leftMargin = i12;
        layoutParams5.topMargin = zn.cJ(context, 12.0f);
        pAGLinearLayout2.addView(pAGTextView3, layoutParams5);
        Qhi(pAGTextView3, tPVar);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        pAGTextView4.setGravity(17);
        pAGTextView4.setId(520093707);
        pAGTextView4.setText(MQ.cJ(context, "tt_video_download_apk"));
        pAGTextView4.setTextColor(-1);
        pAGTextView4.setTextSize(2, 16.0f);
        pAGTextView4.setBackground(hm.Qhi(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, zn.cJ(context, 36.0f));
        layoutParams6.setMargins(zn.cJ(context, 20.0f), zn.cJ(context, 22.0f), zn.cJ(context, 20.0f), zn.cJ(context, 20.0f));
        pAGLinearLayout2.addView(pAGTextView4, layoutParams6);
        Qhi(pAGTextView4, tPVar, i10);
    }

    private void Qhi(PAGLinearLayout pAGLinearLayout) {
        tP tPVar = this.cJ.cJ;
        if (tPVar instanceof com.bytedance.sdk.openadsdk.core.model.MQ) {
            List<tP> ac2 = ((com.bytedance.sdk.openadsdk.core.model.MQ) tPVar).XJ().ac();
            for (int i10 = 0; i10 < ac2.size() && i10 < 3; i10++) {
                Qhi(pAGLinearLayout, ac2.get(i10), i10);
            }
        }
    }

    private void Qhi(PAGLinearLayout pAGLinearLayout, tP tPVar, int i10) {
        Context context = getContext();
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10 > 0 ? zn.cJ(context, 12.0f) : 0, 0, 0);
        pAGLinearLayout2.setBackground(new Qhi(context));
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setOrientation(0);
        pAGLinearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = zn.cJ(context, 20.0f);
        layoutParams2.leftMargin = zn.cJ(context, 17.0f);
        layoutParams2.rightMargin = zn.cJ(context, 30.0f);
        pAGLinearLayout2.addView(pAGLinearLayout3, layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        pAGLinearLayout3.addView(tTRoundRectImageView, new FrameLayout.LayoutParams(zn.cJ(context, 70.0f), zn.cJ(context, 63.0f)));
        Qhi(tTRoundRectImageView, tPVar);
        PAGLinearLayout pAGLinearLayout4 = new PAGLinearLayout(context);
        pAGLinearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = zn.cJ(context, 7.0f);
        pAGLinearLayout3.addView(pAGLinearLayout4, layoutParams3);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setTextSize(18.0f);
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setGravity(8388611);
        pAGTextView.setTypeface(null, 1);
        pAGLinearLayout4.addView(pAGTextView, new FrameLayout.LayoutParams(-1, -2));
        Qhi(pAGTextView, tPVar, tPVar.PAe());
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setSingleLine(true);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setTextSize(16.0f);
        pAGTextView2.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout4.addView(pAGTextView2, new FrameLayout.LayoutParams(-1, -2));
        Qhi(pAGTextView2, tPVar);
        PAGLinearLayout pAGLinearLayout5 = new PAGLinearLayout(context);
        pAGLinearLayout5.setOrientation(0);
        pAGLinearLayout5.setGravity(16);
        pAGLinearLayout4.addView(pAGLinearLayout5, new FrameLayout.LayoutParams(-2, -2));
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setTextSize(16.0f);
        pAGTextView3.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout5.addView(pAGTextView3, new ViewGroup.LayoutParams(-2, -2));
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = zn.cJ(context, 8.0f);
        pAGLinearLayout5.addView(tTRatingBar2, layoutParams4);
        zn.Qhi(pAGTextView3, tTRatingBar2, tPVar, 18);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        pAGTextView4.setGravity(17);
        pAGTextView4.setId(520093707);
        pAGTextView4.setText(MQ.cJ(context, "tt_video_download_apk"));
        pAGTextView4.setTextColor(-1);
        pAGTextView4.setTextSize(2, 16.0f);
        pAGTextView4.setBackground(hm.Qhi(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, zn.cJ(context, 36.0f));
        layoutParams5.setMargins(zn.cJ(context, 20.0f), zn.cJ(context, 22.0f), zn.cJ(context, 20.0f), zn.cJ(context, 20.0f));
        pAGLinearLayout2.addView(pAGTextView4, layoutParams5);
        Qhi(pAGTextView4, tPVar, i10);
    }

    private void Qhi(PAGTextView pAGTextView, tP tPVar) {
        if (pAGTextView == null) {
            return;
        }
        String zjb = tPVar.zjb();
        if (TextUtils.isEmpty(zjb)) {
            return;
        }
        pAGTextView.setText(zjb);
    }

    private void Qhi(PAGTextView pAGTextView, tP tPVar, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        com.bytedance.sdk.openadsdk.core.cJ.Tgh Qhi2 = qhi.aP.Qhi(qhi, tPVar);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
        Qhi2.Qhi(com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(qhi2.FQ, tPVar, qhi2.f8798fl));
        if (i10 != -1) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_order", Integer.valueOf(i10 + 1));
            Qhi2.Qhi(hashMap);
        }
        pAGTextView.setOnClickListener(Qhi2);
        pAGTextView.setOnTouchListener(Qhi2);
        CharSequence ots = tPVar.ots();
        if (TextUtils.isEmpty(ots)) {
            return;
        }
        pAGTextView.setText(ots);
    }
}
