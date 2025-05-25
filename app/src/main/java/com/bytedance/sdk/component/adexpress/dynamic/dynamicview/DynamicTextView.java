package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import a0.d;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ABk;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.MQ;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.Sf += 6;
        if (this.f8210zc.yN()) {
            AnimationText animationText = new AnimationText(context, this.f8210zc.ROR(), this.f8210zc.fl(), 1, this.f8210zc.Sf());
            this.pA = animationText;
            animationText.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.pA = textView;
            textView.setIncludeFontPadding(false);
        }
        this.pA.setTag(Integer.valueOf(getClickArea()));
        addView(this.pA, getWidgetLayoutParams());
    }

    private void Gm() {
        if (!(this.pA instanceof AnimationText)) {
            return;
        }
        String text = getText();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(text);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.optString(i10));
            }
        } catch (JSONException unused) {
            arrayList.add(text);
        }
        ((AnimationText) this.pA).setMaxLines(1);
        ((AnimationText) this.pA).setTextColor(this.f8210zc.ROR());
        ((AnimationText) this.pA).setTextSize(this.f8210zc.fl());
        ((AnimationText) this.pA).setAnimationText(arrayList);
        ((AnimationText) this.pA).setAnimationType(this.f8210zc.PAe());
        ((AnimationText) this.pA).setAnimationDuration(this.f8210zc.FQ() * 1000);
        ((AnimationText) this.pA).Qhi();
    }

    private boolean Qhi() {
        DynamicRootView dynamicRootView = this.iMK;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.iMK.getRenderRequest().WAv() == 4) ? false : true;
    }

    private void WAv() {
        int Qhi;
        if (d.j(this.ABk, "source") || d.j(this.ABk, InMobiNetworkValues.TITLE) || d.j(this.ABk, "text_star")) {
            int[] cJ = ABk.cJ(this.f8210zc.Tgh(), this.f8210zc.fl(), true);
            int Qhi2 = (int) CQU.Qhi(getContext(), this.f8210zc.cJ());
            int Qhi3 = (int) CQU.Qhi(getContext(), this.f8210zc.ac());
            int Qhi4 = (int) CQU.Qhi(getContext(), this.f8210zc.CJ());
            int Qhi5 = (int) CQU.Qhi(getContext(), this.f8210zc.Qhi());
            int min = Math.min(Qhi2, Qhi5);
            if (d.j(this.ABk, "source") && (Qhi = ((this.Sf - ((int) CQU.Qhi(getContext(), this.f8210zc.fl()))) - Qhi2) - Qhi5) > 1 && Qhi <= min * 2) {
                int i10 = Qhi / 2;
                this.pA.setPadding(Qhi3, Qhi2 - i10, Qhi4, Qhi5 - (Qhi - i10));
                return;
            }
            int i11 = (((cJ[1] + Qhi2) + Qhi5) - this.Sf) - 2;
            if (i11 <= 1) {
                return;
            }
            if (i11 <= min * 2) {
                int i12 = i11 / 2;
                this.pA.setPadding(Qhi3, Qhi2 - i12, Qhi4, Qhi5 - (i11 - i12));
            } else if (i11 <= Qhi2 + Qhi5) {
                if (Qhi2 > Qhi5) {
                    this.pA.setPadding(Qhi3, Qhi2 - (i11 - min), Qhi4, Qhi5 - min);
                } else {
                    this.pA.setPadding(Qhi3, Qhi2 - min, Qhi4, Qhi5 - (i11 - min));
                }
            } else {
                final int i13 = (i11 - Qhi2) - Qhi5;
                this.pA.setPadding(Qhi3, 0, Qhi4, 0);
                if (i13 <= ((int) CQU.Qhi(getContext(), 1.0f)) + 1) {
                    ((TextView) this.pA).setTextSize(this.f8210zc.fl() - 1.0f);
                } else if (i13 <= (((int) CQU.Qhi(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.pA).setTextSize(this.f8210zc.fl() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = DynamicTextView.this.pA.getLayoutParams();
                                DynamicTextView dynamicTextView = DynamicTextView.this;
                                layoutParams.height = dynamicTextView.Sf + i13;
                                dynamicTextView.pA.setLayoutParams(layoutParams);
                                DynamicTextView.this.pA.setTranslationY(-i13);
                                ((ViewGroup) DynamicTextView.this.pA.getParent()).setClipChildren(false);
                                ((ViewGroup) DynamicTextView.this.pA.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            }
        }
        if (d.j(this.ABk, "fillButton")) {
            this.pA.setTextAlignment(2);
            ((TextView) this.pA).setGravity(17);
        }
    }

    public String getText() {
        String Tgh = this.f8210zc.Tgh();
        if (TextUtils.isEmpty(Tgh)) {
            if (!com.bytedance.sdk.component.adexpress.fl.cJ() && d.j(this.ABk, "text_star")) {
                Tgh = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.fl.cJ() && d.j(this.ABk, "score-count")) {
                Tgh = "6870";
            }
        }
        if (d.j(this.ABk, InMobiNetworkValues.TITLE) || d.j(this.ABk, "subtitle")) {
            return Tgh.replace("\n", "");
        }
        return Tgh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        int i10;
        double d10;
        super.hm();
        if (TextUtils.isEmpty(getText())) {
            this.pA.setVisibility(4);
            return true;
        } else if (this.f8210zc.yN()) {
            Gm();
            return true;
        } else {
            ((TextView) this.pA).setText(this.f8210zc.Tgh());
            ((TextView) this.pA).setTextDirection(5);
            this.pA.setTextAlignment(this.f8210zc.Sf());
            ((TextView) this.pA).setTextColor(this.f8210zc.ROR());
            ((TextView) this.pA).setTextSize(this.f8210zc.fl());
            if (!this.f8210zc.EBS()) {
                ((TextView) this.pA).setMaxLines(1);
                ((TextView) this.pA).setGravity(17);
                ((TextView) this.pA).setEllipsize(TextUtils.TruncateAt.END);
            } else {
                int bxS = this.f8210zc.bxS();
                if (bxS > 0) {
                    ((TextView) this.pA).setLines(bxS);
                    ((TextView) this.pA).setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            hm hmVar = this.ABk;
            if (hmVar != null && hmVar.WAv() != null) {
                if (com.bytedance.sdk.component.adexpress.fl.cJ() && Qhi() && (d.j(this.ABk, "text_star") || d.j(this.ABk, "score-count") || d.j(this.ABk, "score-count-type-1") || d.j(this.ABk, "score-count-type-2"))) {
                    setVisibility(8);
                    return true;
                }
                if (!d.j(this.ABk, "score-count") && !d.j(this.ABk, "score-count-type-2")) {
                    if (d.j(this.ABk, "text_star")) {
                        try {
                            d10 = Double.parseDouble(getText());
                        } catch (Exception e10) {
                            com.bytedance.sdk.component.utils.ABk.Qhi("DynamicStarView applyNativeStyle", e10.toString());
                            d10 = -1.0d;
                        }
                        if (d10 < 0.0d || d10 > 5.0d) {
                            if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                                setVisibility(8);
                                return true;
                            }
                            this.pA.setVisibility(0);
                        }
                        ((TextView) this.pA).setIncludeFontPadding(false);
                        ((TextView) this.pA).setText(String.format("%.1f", Double.valueOf(d10)));
                    } else if (TextUtils.equals("privacy-detail", this.ABk.WAv().cJ())) {
                        ((TextView) this.pA).setText("Permission list | Privacy policy");
                    } else if (d.j(this.ABk, "development-name")) {
                        ((TextView) this.pA).setText(MQ.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), "tt_text_privacy_development") + getText());
                    } else if (d.j(this.ABk, "app-version")) {
                        ((TextView) this.pA).setText(MQ.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), "tt_text_privacy_app_version") + getText());
                    } else {
                        ((TextView) this.pA).setText(getText());
                    }
                } else {
                    try {
                        try {
                            i10 = Integer.parseInt(getText());
                        } catch (Exception unused) {
                        }
                    } catch (NumberFormatException unused2) {
                        i10 = -1;
                    }
                    if (i10 < 0) {
                        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                            setVisibility(8);
                            return true;
                        }
                        this.pA.setVisibility(0);
                    }
                    if (TextUtils.equals(this.ABk.WAv().cJ(), "score-count-type-2")) {
                        ((TextView) this.pA).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                        ((TextView) this.pA).setGravity(17);
                        return true;
                    }
                    Qhi((TextView) this.pA, i10, getContext(), "tt_comment_num");
                }
                this.pA.setTextAlignment(this.f8210zc.Sf());
                ((TextView) this.pA).setGravity(this.f8210zc.hm());
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    WAv();
                }
            }
            return true;
        }
    }

    public void Qhi(TextView textView, int i10, Context context, String str) {
        String format = String.format(MQ.Qhi(context, str), Integer.valueOf(i10));
        textView.setText("(" + format + ")");
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }
}
