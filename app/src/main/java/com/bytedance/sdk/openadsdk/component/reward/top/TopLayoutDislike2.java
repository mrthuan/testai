package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.PAGCloseButton;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TopLayoutDislike2 extends PAGLinearLayout implements Qhi<TopLayoutDislike2> {
    private boolean ABk;
    private TextView CJ;
    private boolean Gm;
    private View Qhi;
    private boolean ROR;
    private boolean Sf;
    private int Tgh;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private ImageView f8866ac;
    private ImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8867fl;

    /* renamed from: hm  reason: collision with root package name */
    private cJ f8868hm;
    private PAGImageView iMK;

    /* renamed from: zc  reason: collision with root package name */
    private CharSequence f8869zc;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private void ROR() {
        int cJ = zn.cJ(getContext(), 16.0f);
        int cJ2 = zn.cJ(getContext(), 20.0f);
        int cJ3 = zn.cJ(getContext(), 28.0f);
        this.f8866ac = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cJ3, cJ3);
        layoutParams.leftMargin = cJ;
        layoutParams.topMargin = cJ2;
        this.f8866ac.setLayoutParams(layoutParams);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.Qhi = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(cJ3, cJ3);
        layoutParams2.topMargin = cJ2;
        layoutParams2.leftMargin = cJ;
        this.Qhi.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        PAGTextView pAGTextView = new PAGTextView(getContext());
        this.CJ = pAGTextView;
        pAGTextView.setBackground(com.bytedance.sdk.openadsdk.core.widget.cJ.cJ());
        this.CJ.setId(520093714);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, zn.cJ(getContext(), 28.0f));
        layoutParams4.topMargin = zn.cJ(getContext(), 20.0f);
        int cJ4 = zn.cJ(getContext(), 16.0f);
        layoutParams2.rightMargin = cJ4;
        layoutParams4.rightMargin = cJ4;
        int cJ5 = zn.cJ(getContext(), 12.0f);
        zn.cJ(getContext(), 5.0f);
        this.CJ.setPadding(cJ5, 0, cJ5, 0);
        this.CJ.setLayoutParams(layoutParams4);
        this.CJ.setGravity(17);
        this.CJ.setTextColor(-1);
        this.CJ.setTextSize(14.0f);
        this.CJ.setVisibility(8);
        this.cJ = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(cJ3, cJ3);
        layoutParams5.topMargin = cJ2;
        layoutParams5.rightMargin = cJ;
        this.cJ.setLayoutParams(layoutParams5);
        this.cJ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        PAGImageView cJ6 = PAGCloseButton.cJ(getContext());
        this.iMK = cJ6;
        cJ6.setId(520093708);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388661;
        layoutParams6.topMargin = zn.cJ(getContext(), 20.0f);
        layoutParams6.rightMargin = zn.cJ(getContext(), 24.0f);
        this.iMK.setLayoutParams(layoutParams6);
        this.iMK.setContentDescription(MQ.Qhi(getContext(), "tt_ad_close_text"));
        this.iMK.setVisibility(8);
        addView(this.f8866ac);
        addView(this.Qhi);
        addView(view);
        addView(this.CJ);
        addView(this.cJ);
        addView(this.iMK);
    }

    private void Sf() {
        View view = this.Qhi;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.f8868hm != null) {
                        TopLayoutDislike2.this.f8868hm.ac(view2);
                    }
                }
            });
        }
        ImageView imageView = this.f8866ac;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable Qhi;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    topLayoutDislike2.Sf = !topLayoutDislike2.Sf;
                    if (TopLayoutDislike2.this.cJ != null) {
                        if (TopLayoutDislike2.this.Sf) {
                            Qhi = MQ.ac(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute");
                        } else {
                            Qhi = MQ.ac(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                        }
                    } else if (TopLayoutDislike2.this.Sf) {
                        Qhi = hm.Qhi(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper");
                    } else {
                        Qhi = hm.Qhi(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.f8866ac.setImageDrawable(Qhi);
                    if (TopLayoutDislike2.this.f8866ac.getDrawable() != null) {
                        TopLayoutDislike2.this.f8866ac.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.f8868hm != null) {
                        TopLayoutDislike2.this.f8868hm.cJ(view2);
                    }
                }
            });
        }
        ImageView imageView2 = this.cJ;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.f8868hm != null) {
                        TopLayoutDislike2.this.f8868hm.Qhi(view2);
                    }
                }
            });
        } else {
            TextView textView = this.CJ;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.f8868hm != null) {
                            TopLayoutDislike2.this.f8868hm.Qhi(view2);
                        }
                    }
                });
            }
        }
        PAGImageView pAGImageView = this.iMK;
        if (pAGImageView != null) {
            pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.f8868hm != null) {
                        TopLayoutDislike2.this.f8868hm.CJ(view2);
                    }
                }
            });
        }
    }

    private ImageView getCommonRingBGImageView() {
        PAGImageView pAGImageView = new PAGImageView(getContext());
        int cJ = zn.cJ(getContext(), 5.0f);
        pAGImageView.setPadding(cJ, cJ, cJ, cJ);
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView.setBackground(com.bytedance.sdk.openadsdk.core.widget.cJ.Qhi());
        return pAGImageView;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void Tgh() {
        ac();
        this.cJ.setVisibility(8);
        this.iMK.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void fl() {
        ImageView imageView = this.cJ;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.CJ.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public View getCloseButton() {
        return this.iMK;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setListener(cJ cJVar) {
        this.f8868hm = cJVar;
    }

    public void setShouldShowSkipTime(boolean z10) {
        this.WAv = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setShowDislike(boolean z10) {
        int i10;
        View view = this.Qhi;
        if (view != null && !this.ROR) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setShowSkip(boolean z10) {
        int i10;
        TextView textView = this.CJ;
        if (textView == null) {
            return;
        }
        if (!z10) {
            textView.setText("");
        }
        if (this.cJ.getVisibility() == 4) {
            return;
        }
        this.Gm = !z10;
        ImageView imageView = this.cJ;
        int i11 = 0;
        if (z10 && this.ABk) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        boolean z11 = z10 & (!TextUtils.isEmpty(this.CJ.getText()));
        TextView textView2 = this.CJ;
        if (!z11) {
            i11 = 8;
        }
        textView2.setVisibility(i11);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setShowSound(boolean z10) {
        int i10;
        ImageView imageView = this.f8866ac;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setSkipEnable(boolean z10) {
        ImageView imageView = this.cJ;
        if (imageView != null) {
            imageView.setEnabled(z10);
            this.cJ.setClickable(z10);
            return;
        }
        TextView textView = this.CJ;
        if (textView != null) {
            textView.setEnabled(z10);
            this.CJ.setClickable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.CJ.setText(charSequence);
        if (this.CJ.getVisibility() != 0) {
            this.CJ.setVisibility(0);
        }
        ImageView imageView = this.cJ;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setSoundMute(boolean z10) {
        Drawable Qhi;
        this.Sf = z10;
        if (this.cJ != null) {
            if (z10) {
                Qhi = MQ.ac(getContext(), "tt_reward_full_mute");
            } else {
                Qhi = MQ.ac(getContext(), "tt_reward_full_unmute");
            }
        } else if (z10) {
            Qhi = hm.Qhi(getContext(), "tt_mute_wrapper");
        } else {
            Qhi = hm.Qhi(getContext(), "tt_unmute_wrapper");
        }
        this.f8866ac.setImageDrawable(Qhi);
        if (this.f8866ac.getDrawable() != null) {
            this.f8866ac.getDrawable().setAutoMirrored(true);
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void CJ() {
        this.CJ.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void ac() {
        this.CJ.setWidth(20);
        this.CJ.setVisibility(4);
        this.cJ.setVisibility(4);
        this.Gm = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void cJ() {
        ImageView imageView = this.f8866ac;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8869zc = "";
        setOrientation(0);
    }

    public TopLayoutDislike2 Qhi(tP tPVar) {
        ROR();
        this.Qhi.setVisibility(0);
        ((ImageView) this.Qhi).setImageResource(MQ.CJ(HzH.Qhi(), "tt_reward_full_feedback"));
        this.cJ.setImageResource(MQ.CJ(HzH.Qhi(), "tt_skip_btn"));
        if (this.cJ.getDrawable() != null) {
            this.cJ.getDrawable().setAutoMirrored(true);
        }
        this.cJ.setVisibility(8);
        this.f8867fl = tPVar.FQ() == null ? 0 : tPVar.FQ().EBS() * ((int) tPVar.FQ().Tgh());
        if (com.bytedance.sdk.openadsdk.core.model.HzH.ac(tPVar) && tPVar.hm() != null) {
            this.f8867fl = (int) tPVar.hm().cJ();
        } else if (com.bytedance.sdk.openadsdk.core.model.HzH.CJ(tPVar) && tPVar.hm() != null) {
            this.f8867fl = (int) tPVar.hm().CJ();
        }
        if (this.f8867fl <= 0) {
            this.f8867fl = 10;
        }
        if (tPVar.sqa() == 8 && tPVar.lB() != null) {
            this.Tgh = HzH.CJ().tP(tPVar.lB().getCodeId());
        } else {
            this.Tgh = HzH.CJ().WAv(tPVar.lB().getCodeId());
        }
        if (bxS.Gm(tPVar)) {
            this.Tgh = HzH.CJ().Qhi(String.valueOf(tPVar.Hy()), tPVar.LpL());
            this.f8867fl = tPVar.TKG();
        }
        int i10 = this.Tgh;
        this.WAv = i10 == -1 || i10 >= this.f8867fl;
        if (tPVar.IC()) {
            this.Qhi.setVisibility(8);
            this.ROR = true;
        }
        this.CJ.setVisibility(4);
        this.CJ.setText("");
        this.CJ.setEnabled(false);
        this.CJ.setClickable(false);
        Sf();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    @SuppressLint({"SetTextI18n"})
    public void Qhi(CharSequence charSequence, CharSequence charSequence2) {
        int parseInt;
        if (!TextUtils.isEmpty(charSequence)) {
            this.f8869zc = charSequence;
        }
        if (this.cJ == null) {
            return;
        }
        this.ABk = true;
        if (this.WAv) {
            TextView textView = this.CJ;
            textView.setText(((Object) this.f8869zc) + "s");
            Qhi(false);
            return;
        }
        String str = (String) this.f8869zc;
        try {
            int i10 = this.Tgh;
            if (i10 == 0) {
                parseInt = Integer.parseInt(str);
            } else {
                parseInt = i10 - (this.f8867fl - Integer.parseInt(str));
            }
            if (parseInt > 0) {
                if (this.Tgh == 0) {
                    Qhi(false);
                    return;
                }
                TextView textView2 = this.CJ;
                textView2.setText(parseInt + "s");
                Qhi(true);
                return;
            }
            TextView textView3 = this.CJ;
            textView3.setText(((Object) this.f8869zc) + "s");
            Qhi(false);
        } catch (Exception unused) {
        }
    }

    private void Qhi(boolean z10) {
        if (this.Gm) {
            return;
        }
        if (this.WAv) {
            this.cJ.setVisibility(8);
            this.CJ.setVisibility(0);
        } else if (z10) {
            this.CJ.setVisibility(0);
            this.cJ.setVisibility(8);
        } else {
            this.CJ.setVisibility(8);
            this.cJ.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void Qhi() {
        ImageView imageView = this.cJ;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.CJ;
        if (textView != null) {
            textView.performClick();
        }
    }
}
