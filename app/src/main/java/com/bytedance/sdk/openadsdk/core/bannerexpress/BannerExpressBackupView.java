package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.ROR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.iMK;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.List;

/* loaded from: classes.dex */
public class BannerExpressBackupView extends BackupView {
    public static iMK[] Qhi = {new iMK(1, 6.4f, 320, 50), new iMK(4, 1.2f, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 250)};
    private Qhi ABk;
    private PAGBannerAdWrapperListener hpZ;
    private NativeExpressView iMK;
    private String pA;

    public BannerExpressBackupView(Context context) {
        super(context);
        this.cJ = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.hpZ = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.pA = str;
    }

    private void CJ() {
        TextView textView;
        tP tPVar = this.f9119ac;
        if (tPVar != null) {
            int gga = tPVar.gga();
            float cJ = (this.Sf * 1.0f) / zn.cJ(this.cJ, 250.0f);
            if (this.f9119ac.FQ() == null) {
                Qhi Tgh = Tgh();
                this.ABk = Tgh;
                RatioImageView ratioImageView = Tgh.Qhi;
                ImageView imageView = Tgh.f8995ac;
                TextView textView2 = Tgh.cJ;
                TextView textView3 = Tgh.ROR;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (zn.cJ(this.cJ, 45.0f) * cJ);
                    layoutParams.height = (int) (zn.cJ(this.cJ, 45.0f) * cJ);
                }
                textView2.setTextSize(2, zn.Qhi(this.cJ, textView2.getTextSize()) * cJ);
                textView3.setTextSize(2, zn.Qhi(this.cJ, textView3.getTextSize()) * cJ);
                View view = this.ABk.Tgh;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.Qhi(((BackupView) BannerExpressBackupView.this).cJ, ((BackupView) BannerExpressBackupView.this).f9119ac, ((BackupView) BannerExpressBackupView.this).Tgh);
                        }
                    });
                }
                if (gga == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    ratioImageView.setRatio(1.91f);
                }
                List<hpZ> cjC = this.f9119ac.cjC();
                if (cjC != null && !cjC.isEmpty()) {
                    com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(cjC.get(0), ratioImageView, this.f9119ac);
                    com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(cjC.get(0).Qhi(), this.ABk.f8996fl);
                }
                if (this.f9119ac.dIT() == null || TextUtils.isEmpty(this.f9119ac.dIT().Qhi())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.f9119ac.dIT().Qhi(), this.f9119ac.dIT().cJ(), this.f9119ac.dIT().ac(), imageView, this.f9119ac);
                }
                textView.setText(this.f9119ac.dVA());
                if (!TextUtils.isEmpty(this.f9119ac.ots())) {
                    textView3.setText(this.f9119ac.ots());
                } else {
                    textView3.setVisibility(8);
                }
                zn.Qhi((TextView) null, this.ABk.CJ, this.f9119ac);
                Qhi((View) ratioImageView, true);
                ratioImageView.setTag(520093762, Boolean.TRUE);
                Qhi((View) this, true);
                Qhi((View) textView3, true);
                return;
            }
            Qhi ROR = ROR();
            this.ABk = ROR;
            TextView textView4 = ROR.cJ;
            TextView textView5 = ROR.ROR;
            RatioFrameLayout ratioFrameLayout = ROR.Sf;
            textView4.setTextSize(2, zn.Qhi(this.cJ, textView4.getTextSize()) * cJ);
            textView5.setTextSize(2, zn.Qhi(this.cJ, textView5.getTextSize()) * cJ);
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.f9119ac.FQ().WAv(), this.ABk.f8996fl);
            View view2 = this.ABk.Tgh;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.Qhi(((BackupView) BannerExpressBackupView.this).cJ, ((BackupView) BannerExpressBackupView.this).f9119ac, ((BackupView) BannerExpressBackupView.this).Tgh);
                    }
                });
            }
            if (gga == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (gga == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            NativeVideoTsView videoView = getVideoView();
            if (videoView != null) {
                NativeExpressView nativeExpressView = this.iMK;
                if (nativeExpressView instanceof NativeExpressVideoView) {
                    videoView.setVideoAdInteractionListener((NativeExpressVideoView) nativeExpressView);
                }
                ratioFrameLayout.addView(videoView, layoutParams2);
                videoView.setAdCreativeClickListener(new NativeVideoTsView.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.4
                    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.Qhi
                    public void Qhi(View view3, int i10) {
                        if (BannerExpressBackupView.this.hpZ != null) {
                            BannerExpressBackupView.this.hpZ.onAdClicked();
                        }
                    }
                });
                ROR clickCreativeListener = this.iMK.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.Qhi(videoView.getNativeVideoController());
                }
            }
            if (this.f9119ac.dIT() != null && !TextUtils.isEmpty(this.f9119ac.dIT().Qhi())) {
                com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.f9119ac.dIT().Qhi(), this.f9119ac.dIT().cJ(), this.f9119ac.dIT().ac(), this.ABk.f8995ac, this.f9119ac);
            }
            textView4.setText(this.f9119ac.dVA());
            zn.Qhi((TextView) null, this.ABk.CJ, this.f9119ac);
            if (!TextUtils.isEmpty(this.f9119ac.ots())) {
                textView5.setText(this.f9119ac.ots());
            } else {
                textView5.setVisibility(8);
            }
            Qhi((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            Qhi((View) this, true);
            Qhi((View) textView5, true);
            Qhi(ratioFrameLayout);
        }
    }

    private Qhi ROR() {
        int cJ = zn.cJ(this.cJ, 8.0f);
        int cJ2 = zn.cJ(this.cJ, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.cJ);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(cJ, cJ, cJ, cJ2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.cJ);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this.cJ);
        tTRoundRectImageView.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(zn.cJ(this.cJ, 52.0f), zn.cJ(this.cJ, 52.0f));
        tTRoundRectImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tTRoundRectImageView.setLayoutParams(layoutParams3);
        linearLayout.addView(tTRoundRectImageView);
        LinearLayout linearLayout2 = new LinearLayout(this.cJ);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = cJ;
        layoutParams4.rightMargin = cJ;
        layoutParams4.setMarginStart(cJ);
        layoutParams4.setMarginEnd(cJ);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.cJ);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(this.cJ);
        tTRatingBar2.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = zn.cJ(this.cJ, 4.0f);
        linearLayout2.addView(tTRatingBar2, layoutParams6);
        TextView textView2 = new TextView(this.cJ);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(zn.cJ(this.cJ, 76.0f), zn.cJ(this.cJ, 36.0f));
        textView2.setBackground(hm.Qhi(this.cJ, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(MQ.Qhi(this.cJ, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.cJ);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = cJ2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        RatioFrameLayout ratioFrameLayout = new RatioFrameLayout(this.cJ);
        ratioFrameLayout.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        ratioFrameLayout.setLayoutParams(layoutParams9);
        frameLayout.addView(ratioFrameLayout);
        View pAGLogoView = new PAGLogoView(this.cJ);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(cJ, cJ, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams10);
        relativeLayout.addView(pAGLogoView);
        return new Qhi(tTRoundRectImageView, pAGLogoView, textView2, textView, ratioFrameLayout, tTRatingBar2, frameLayout);
    }

    private Qhi Tgh() {
        int cJ = zn.cJ(this.cJ, 8.0f);
        int cJ2 = zn.cJ(this.cJ, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.cJ);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(cJ, cJ, cJ, cJ2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.cJ);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this.cJ);
        tTRoundRectImageView.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(zn.cJ(this.cJ, 52.0f), zn.cJ(this.cJ, 52.0f));
        tTRoundRectImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tTRoundRectImageView.setLayoutParams(layoutParams3);
        linearLayout.addView(tTRoundRectImageView);
        LinearLayout linearLayout2 = new LinearLayout(this.cJ);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = cJ;
        layoutParams4.rightMargin = cJ;
        layoutParams4.setMarginStart(cJ);
        layoutParams4.setMarginEnd(cJ);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.cJ);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(this.cJ);
        tTRatingBar2.setId(520093735);
        linearLayout2.addView(tTRatingBar2, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.cJ);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(zn.cJ(this.cJ, 76.0f), zn.cJ(this.cJ, 36.0f));
        textView2.setBackground(hm.Qhi(this.cJ, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(MQ.Qhi(this.cJ, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.cJ);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = cJ2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        RatioImageView ratioImageView = new RatioImageView(this.cJ);
        ratioImageView.setId(520093736);
        ratioImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(ratioImageView, layoutParams8);
        View pAGLogoView = new PAGLogoView(this.cJ);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(cJ, cJ, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams9);
        relativeLayout.addView(pAGLogoView);
        return new Qhi(tTRoundRectImageView, pAGLogoView, textView2, textView, ratioImageView, tTRatingBar2, frameLayout);
    }

    private void ac() {
        float cJ = (this.Sf * 1.0f) / zn.cJ(this.cJ, 50.0f);
        int i10 = this.ROR;
        if ((this.Sf * 1.0f) / i10 > 0.21875f) {
            cJ = (i10 * 1.0f) / zn.cJ(this.cJ, 320.0f);
        }
        Qhi fl2 = fl();
        this.ABk = fl2;
        ImageView imageView = fl2.f8995ac;
        TextView textView = fl2.cJ;
        TTRatingBar2 tTRatingBar2 = fl2.CJ;
        TextView textView2 = fl2.ROR;
        textView.setTextSize(2, zn.Qhi(this.cJ, textView.getTextSize()) * cJ);
        textView2.setTextSize(2, zn.Qhi(this.cJ, textView2.getTextSize()) * cJ);
        View view = this.ABk.Tgh;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.Qhi(((BackupView) BannerExpressBackupView.this).cJ, ((BackupView) BannerExpressBackupView.this).f9119ac, ((BackupView) BannerExpressBackupView.this).Tgh);
                }
            });
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (zn.cJ(this.cJ, 38.0f) * cJ);
            layoutParams.height = (int) (zn.cJ(this.cJ, 38.0f) * cJ);
        }
        if (this.f9119ac.dIT() != null && !TextUtils.isEmpty(this.f9119ac.dIT().Qhi())) {
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.f9119ac.dIT().Qhi(), this.f9119ac.dIT().cJ(), this.f9119ac.dIT().ac(), imageView, this.f9119ac);
        }
        textView.setText(this.f9119ac.dVA());
        if (!TextUtils.isEmpty(this.f9119ac.ots())) {
            textView2.setText(this.f9119ac.ots());
        } else {
            textView2.setVisibility(8);
        }
        zn.Qhi((TextView) null, tTRatingBar2, this.f9119ac);
        Qhi((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        Qhi((View) this, true);
        Qhi((View) textView2, true);
    }

    private void cJ() {
        iMK Qhi2 = Qhi(this.iMK.getExpectExpressWidth(), this.iMK.getExpectExpressHeight());
        if (this.iMK.getExpectExpressWidth() > 0 && this.iMK.getExpectExpressHeight() > 0) {
            this.ROR = zn.cJ(this.cJ, this.iMK.getExpectExpressWidth());
            this.Sf = zn.cJ(this.cJ, this.iMK.getExpectExpressHeight());
        } else {
            int ac2 = zn.ac(this.cJ);
            this.ROR = ac2;
            this.Sf = Float.valueOf(ac2 / Qhi2.cJ).intValue();
        }
        int i10 = this.ROR;
        if (i10 > 0 && i10 > zn.ac(this.cJ)) {
            float ac3 = zn.ac(this.cJ) / this.ROR;
            this.ROR = zn.ac(this.cJ);
            this.Sf = Float.valueOf(this.Sf * ac3).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.ROR, this.Sf);
        }
        layoutParams.width = this.ROR;
        layoutParams.height = this.Sf;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (Qhi2.Qhi == 1) {
            ac();
        } else {
            CJ();
        }
    }

    private Qhi fl() {
        int cJ = zn.cJ(this.cJ, 38.0f);
        int cJ2 = (int) (zn.cJ(this.cJ, 25.0f) / 5.0d);
        int cJ3 = zn.cJ(this.cJ, 10.0f);
        int cJ4 = zn.cJ(this.cJ, 2.0f);
        int cJ5 = zn.cJ(this.cJ, 6.0f);
        int cJ6 = zn.cJ(this.cJ, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.cJ);
        addView(relativeLayout, -1, -1);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this.cJ);
        tTRoundRectImageView.setId(520093738);
        TextView textView = new TextView(this.cJ);
        textView.setId(520093730);
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(this.cJ);
        tTRatingBar2.setId(520093735);
        View pAGLogoView = new PAGLogoView(this.cJ);
        pAGLogoView.setId(520093739);
        TextView textView2 = new TextView(this.cJ);
        textView2.setId(520093703);
        Qhi qhi = new Qhi(tTRoundRectImageView, textView, tTRatingBar2, pAGLogoView, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(cJ, cJ);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(cJ5);
        layoutParams.setMargins(cJ5, 0, 0, 0);
        tTRoundRectImageView.setLayoutParams(layoutParams);
        tTRoundRectImageView.setBackgroundColor(-1);
        tTRoundRectImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(tTRoundRectImageView);
        LinearLayout linearLayout = new LinearLayout(this.cJ);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, tTRoundRectImageView.getId());
        layoutParams2.setMarginStart(cJ6);
        layoutParams2.setMarginEnd(cJ6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, tTRoundRectImageView.getId());
        layoutParams2.setMargins(cJ6, 0, cJ6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = cJ4;
        tTRatingBar2.setLayoutParams(layoutParams4);
        linearLayout.addView(tTRatingBar2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        pAGLogoView.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoView);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(cJ5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = cJ5;
        textView2.setBackground(hm.Qhi(this.cJ, 12));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(cJ3, cJ2, cJ3, cJ2);
        textView2.setText(MQ.Qhi(this.cJ, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void Qhi(View view, int i10, pA pAVar) {
        NativeExpressView nativeExpressView = this.iMK;
        if (nativeExpressView != null) {
            nativeExpressView.Qhi(view, i10, pAVar);
        }
    }

    public void Qhi(tP tPVar, NativeExpressView nativeExpressView, fl flVar) {
        setBackgroundColor(-1);
        this.f9119ac = tPVar;
        this.iMK = nativeExpressView;
        this.Tgh = "banner_ad";
        nativeExpressView.addView(this, new ViewGroup.LayoutParams(-2, -2));
        cJ();
    }

    /* loaded from: classes.dex */
    public static class Qhi {
        TTRatingBar2 CJ;
        public RatioImageView Qhi;
        TextView ROR;
        private RatioFrameLayout Sf;
        View Tgh;

        /* renamed from: ac  reason: collision with root package name */
        ImageView f8995ac;
        public TextView cJ;

        /* renamed from: fl  reason: collision with root package name */
        FrameLayout f8996fl;

        public Qhi(ImageView imageView, TextView textView, TTRatingBar2 tTRatingBar2, View view, TextView textView2) {
            this.f8995ac = imageView;
            this.cJ = textView;
            this.CJ = tTRatingBar2;
            this.Tgh = view;
            this.ROR = textView2;
        }

        public Qhi(ImageView imageView, View view, TextView textView, TextView textView2, RatioImageView ratioImageView, TTRatingBar2 tTRatingBar2, FrameLayout frameLayout) {
            this.f8995ac = imageView;
            this.Tgh = view;
            this.ROR = textView;
            this.cJ = textView2;
            this.Qhi = ratioImageView;
            this.CJ = tTRatingBar2;
            this.f8996fl = frameLayout;
        }

        public Qhi(ImageView imageView, View view, TextView textView, TextView textView2, RatioFrameLayout ratioFrameLayout, TTRatingBar2 tTRatingBar2, FrameLayout frameLayout) {
            this.f8995ac = imageView;
            this.Tgh = view;
            this.ROR = textView;
            this.cJ = textView2;
            this.Sf = ratioFrameLayout;
            this.CJ = tTRatingBar2;
            this.f8996fl = frameLayout;
        }
    }

    public static iMK Qhi(int i10, int i11) {
        try {
            return ((double) i11) >= Math.floor((((double) i10) * 450.0d) / 600.0d) ? Qhi[1] : Qhi[0];
        } catch (Throwable unused) {
            return Qhi[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void Qhi() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f9120fl;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.cJ cJVar = this.CJ;
        if (cJVar != null) {
            cJVar.Qhi();
        } else {
            TTDelegateActivity.Qhi(this.f9119ac, this.pA);
        }
    }
}
