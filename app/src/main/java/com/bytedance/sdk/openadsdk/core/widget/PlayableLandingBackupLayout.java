package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class PlayableLandingBackupLayout extends FrameLayout {
    private TTRatingBar2 CJ;
    private boolean Qhi;
    private PAGTextView ROR;
    private tP Sf;
    private PAGLogoView Tgh;
    private com.bytedance.sdk.openadsdk.core.cJ.Qhi WAv;

    /* renamed from: ac  reason: collision with root package name */
    private TextView f9258ac;
    private TTRoundRectImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private TextView f9259fl;

    /* renamed from: hm  reason: collision with root package name */
    private String f9260hm;

    public PlayableLandingBackupLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(iMK.rB);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            Qhi();
        }
    }

    private void cJ() {
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        boolean z10 = this.Sf.SL() == 1;
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
        this.cJ = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(zn.cJ(context, 80.0f), zn.cJ(context, 80.0f));
        layoutParams2.bottomMargin = zn.cJ(context, 12.0f);
        pAGLinearLayout.addView(this.cJ, layoutParams2);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.f9258ac = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.f9258ac.setGravity(17);
        this.f9258ac.setMaxLines(2);
        this.f9258ac.setMaxWidth(zn.cJ(context, 180.0f));
        this.f9258ac.setTextColor(-1);
        this.f9258ac.setTextSize(2, 24.0f);
        pAGLinearLayout.addView(this.f9258ac, new LinearLayout.LayoutParams(-1, -2));
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.ROR = pAGTextView2;
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.ROR.setGravity(17);
        this.ROR.setMaxLines(2);
        this.ROR.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.ROR.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = zn.cJ(context, 8.0f);
        pAGLinearLayout.addView(this.ROR, layoutParams3);
        this.CJ = new TTRatingBar2(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, zn.cJ(context, 16.0f));
        layoutParams4.topMargin = zn.cJ(context, 12.0f);
        this.CJ.setVisibility(8);
        pAGLinearLayout.addView(this.CJ, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.f9259fl = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.f9259fl.setGravity(17);
        this.f9259fl.setText(MQ.cJ(context, "tt_video_download_apk"));
        this.f9259fl.setTextColor(-1);
        this.f9259fl.setTextSize(2, 16.0f);
        this.f9259fl.setBackground(hm.Qhi(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, zn.cJ(context, 44.0f));
        layoutParams5.topMargin = zn.cJ(context, 54.0f);
        pAGLinearLayout.addView(this.f9259fl, layoutParams5);
        this.Tgh = new PAGLogoView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, zn.cJ(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = zn.cJ(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = zn.cJ(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = zn.cJ(context, 24.0f);
        }
        addView(this.Tgh, layoutParams6);
    }

    public void Qhi(tP tPVar, String str, com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi) {
        this.Sf = tPVar;
        this.f9260hm = str;
        this.WAv = qhi;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Qhi() {
        if (this.Qhi) {
            return;
        }
        this.Qhi = true;
        cJ();
        this.f9259fl.setOnClickListener(this.WAv);
        this.f9259fl.setOnTouchListener(this.WAv);
        String ots = this.Sf.ots();
        if (!TextUtils.isEmpty(ots)) {
            this.f9259fl.setText(ots);
        }
        if (this.cJ != null && this.Sf.dIT() != null && !TextUtils.isEmpty(this.Sf.dIT().Qhi())) {
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.Sf.dIT(), this.cJ, this.Sf);
        }
        TTRatingBar2 tTRatingBar2 = this.CJ;
        if (tTRatingBar2 != null) {
            zn.Qhi((TextView) null, tTRatingBar2, this.Sf);
            if (this.Sf.pv() != null) {
                this.CJ.setVisibility(0);
            }
        }
        if (this.f9258ac != null) {
            if (this.Sf.pv() != null && !TextUtils.isEmpty(this.Sf.pv().cJ())) {
                this.f9258ac.setText(this.Sf.pv().cJ());
            } else if (!TextUtils.isEmpty(this.Sf.PAe())) {
                this.f9258ac.setText(this.Sf.PAe());
            } else {
                this.f9258ac.setVisibility(8);
            }
        }
        if (this.ROR != null) {
            String dVA = this.Sf.dVA();
            if (!TextUtils.isEmpty(dVA)) {
                this.ROR.setText(dVA);
            } else {
                this.ROR.setVisibility(8);
            }
        }
        this.Tgh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.PlayableLandingBackupLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Qhi(PlayableLandingBackupLayout.this.getContext(), PlayableLandingBackupLayout.this.Sf, PlayableLandingBackupLayout.this.f9260hm);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
