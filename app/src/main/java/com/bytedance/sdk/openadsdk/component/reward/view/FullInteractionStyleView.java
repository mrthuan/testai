package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle001001Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016VLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009VLayout;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.List;

/* loaded from: classes.dex */
public class FullInteractionStyleView extends BackupView {
    private boolean ABk;
    private View HzH;
    private com.bytedance.sdk.openadsdk.core.cJ.Tgh MQ;
    private float Qhi;
    private int hpZ;
    private int iMK;
    private View kYc;
    private int pA;
    private FrameLayout tP;

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.hpZ = 1;
        this.cJ = context;
    }

    private void ABk() {
        TTInteractionStyle016009VLayout tTInteractionStyle016009VLayout = new TTInteractionStyle016009VLayout(this.cJ);
        this.HzH = tTInteractionStyle016009VLayout;
        cJ(tTInteractionStyle016009VLayout);
        CJ();
        Tgh();
    }

    private void Gm() {
        View tTInteractionStyle003002Layout = new TTInteractionStyle003002Layout(this.cJ);
        this.HzH = tTInteractionStyle003002Layout;
        cJ(tTInteractionStyle003002Layout);
        this.tP = (FrameLayout) this.HzH.findViewById(iMK.bM);
        ImageView imageView = (ImageView) this.HzH.findViewById(iMK.pF);
        TextView textView = (TextView) this.HzH.findViewById(iMK.wp);
        View findViewById = this.HzH.findViewById(520093739);
        Qhi(this.tP, imageView);
        textView.setText(getDescription());
        ac(this.tP);
        ac(imageView);
        ac(textView);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Qhi(((BackupView) FullInteractionStyleView.this).cJ, ((BackupView) FullInteractionStyleView.this).f9119ac, ((BackupView) FullInteractionStyleView.this).Tgh);
                } catch (Throwable th2) {
                    ABk.Qhi("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void ROR() {
        TTInteractionStyle002003HLayout tTInteractionStyle002003HLayout = new TTInteractionStyle002003HLayout(this.cJ);
        this.HzH = tTInteractionStyle002003HLayout;
        cJ(tTInteractionStyle002003HLayout);
        CJ();
        Tgh();
    }

    private void Sf() {
        TTInteractionStyle003002HLayout tTInteractionStyle003002HLayout = new TTInteractionStyle003002HLayout(this.cJ);
        this.HzH = tTInteractionStyle003002HLayout;
        cJ(tTInteractionStyle003002HLayout);
        CJ();
    }

    private void WAv() {
        TTInteractionStyle016009HLayout tTInteractionStyle016009HLayout = new TTInteractionStyle016009HLayout(this.cJ);
        this.HzH = tTInteractionStyle016009HLayout;
        cJ(tTInteractionStyle016009HLayout);
        CJ();
    }

    private float getHeightDp() {
        return zn.ac(this.cJ, zn.hm(this.cJ));
    }

    private float getWidthDp() {
        return zn.ac(this.cJ, zn.WAv(this.cJ));
    }

    private void hm() {
        TTInteractionStyle009016HLayout tTInteractionStyle009016HLayout = new TTInteractionStyle009016HLayout(this.cJ);
        this.HzH = tTInteractionStyle009016HLayout;
        cJ(tTInteractionStyle009016HLayout);
        CJ();
        Tgh();
    }

    private void zc() {
        TTInteractionStyle009016VLayout tTInteractionStyle009016VLayout = new TTInteractionStyle009016VLayout(this.cJ);
        this.HzH = tTInteractionStyle009016VLayout;
        cJ(tTInteractionStyle009016VLayout);
        CJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void Qhi(View view, int i10, pA pAVar) {
    }

    public FrameLayout getVideoContainer() {
        return this.tP;
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.cJ.Tgh tgh) {
        this.MQ = tgh;
    }

    public void setIsMute(boolean z10) {
        this.ABk = z10;
        View view = this.kYc;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z10);
        }
    }

    private void CJ() {
        this.tP = (FrameLayout) this.HzH.findViewById(iMK.bM);
        ImageView imageView = (ImageView) this.HzH.findViewById(iMK.gT);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.HzH.findViewById(iMK.XH);
        TextView textView = (TextView) this.HzH.findViewById(iMK.IC);
        TextView textView2 = (TextView) this.HzH.findViewById(iMK.HUk);
        View findViewById = this.HzH.findViewById(520093739);
        if (!TextUtils.isEmpty(this.f9119ac.ots())) {
            textView2.setText(this.f9119ac.ots());
        }
        Qhi(this.tP, imageView);
        if (this.f9119ac.dIT() != null && !TextUtils.isEmpty(this.f9119ac.dIT().Qhi())) {
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.f9119ac.dIT().Qhi(), this.f9119ac.dIT().cJ(), this.f9119ac.dIT().ac(), tTRoundRectImageView, this.f9119ac);
        }
        textView.setText(getTitle());
        ac(this.tP);
        ac(imageView);
        ac(tTRoundRectImageView);
        ac(textView);
        ac(textView2);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Qhi(((BackupView) FullInteractionStyleView.this).cJ, ((BackupView) FullInteractionStyleView.this).f9119ac, ((BackupView) FullInteractionStyleView.this).Tgh);
                } catch (Throwable th2) {
                    ABk.Qhi("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void Tgh() {
        TextView textView = (TextView) this.HzH.findViewById(iMK.cJP);
        if (textView != null) {
            textView.setText(getDescription());
            ac(textView);
        }
    }

    private void ac() {
        TTInteractionStyle001001Layout tTInteractionStyle001001Layout = new TTInteractionStyle001001Layout(this.cJ);
        this.HzH = tTInteractionStyle001001Layout;
        cJ(tTInteractionStyle001001Layout);
        CJ();
        Tgh();
    }

    private void cJ() {
        this.ROR = zn.cJ(this.cJ, this.iMK);
        this.Sf = zn.cJ(this.cJ, this.pA);
        int i10 = (int) (this.Qhi * 1000.0f);
        if (this.hpZ == 1) {
            if (i10 == 666) {
                fl();
            } else if (i10 == 1000) {
                ac();
            } else if (i10 == 1500) {
                Gm();
            } else if (i10 != 1777) {
                Qhi(0.562f);
                zc();
            } else {
                ABk();
            }
        } else if (i10 == 562) {
            hm();
        } else if (i10 == 666) {
            ROR();
        } else if (i10 == 1000) {
            ac();
        } else if (i10 != 1500) {
            Qhi(1.777f);
            WAv();
        } else {
            Sf();
        }
    }

    private void fl() {
        TTInteractionStyle002003Layout tTInteractionStyle002003Layout = new TTInteractionStyle002003Layout(this.cJ);
        this.HzH = tTInteractionStyle002003Layout;
        cJ(tTInteractionStyle002003Layout);
        CJ();
        Tgh();
    }

    public void Qhi(tP tPVar, float f10, int i10, int i11, int i12) {
        this.Qhi = f10;
        this.hpZ = i10;
        this.f9119ac = tPVar;
        this.Tgh = "fullscreen_interstitial_ad";
        this.iMK = i11;
        this.pA = i12;
        Qhi(this.f9121hm);
        cJ();
    }

    private void ac(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar = this.MQ;
        if (cJVar == null) {
            Context context = this.cJ;
            tP tPVar = this.f9119ac;
            String str = this.Tgh;
            cJVar = new com.bytedance.sdk.openadsdk.core.cJ.Qhi(context, tPVar, str, js.Qhi(str));
            cJVar.Qhi(Qhi(this.f9119ac, this.cJ));
        }
        view.setOnTouchListener(cJVar);
        view.setOnClickListener(cJVar);
    }

    private void Qhi(FrameLayout frameLayout, ImageView imageView) {
        tP tPVar = this.f9119ac;
        if (tPVar == null) {
            return;
        }
        boolean fl2 = tP.fl(tPVar);
        if (this.f9119ac.FQ() != null && fl2) {
            zn.Qhi((View) imageView, 8);
            zn.Qhi((View) frameLayout, 0);
            return;
        }
        Qhi(imageView);
        zn.Qhi((View) imageView, 0);
        zn.Qhi((View) frameLayout, 8);
    }

    private void cJ(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void Qhi(ImageView imageView) {
        List<hpZ> cjC;
        hpZ hpz;
        tP tPVar = this.f9119ac;
        if (tPVar == null || (cjC = tPVar.cjC()) == null || cjC.size() <= 0 || (hpz = cjC.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(hpz).ac(2).Qhi(com.bytedance.sdk.openadsdk.ROR.ac.Qhi(this.f9119ac, hpz.Qhi(), imageView));
    }

    private com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl Qhi(tP tPVar, Context context) {
        if (tPVar != null && tPVar.ip() == 4) {
            return new com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.ac(context, tPVar, this.Tgh);
        }
        return null;
    }

    public View getInteractionStyleRootView() {
        return this;
    }

    private void Qhi(float f10) {
        float min;
        float max;
        int max2;
        int i10;
        int i11;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.hpZ == 2) {
            min = Math.max(heightDp, widthDp);
            max = Math.min(heightDp, widthDp);
        } else {
            min = Math.min(heightDp, widthDp);
            max = Math.max(heightDp, widthDp);
        }
        if (this.hpZ != 2 && zn.ac((Activity) this.cJ)) {
            max -= zn.ac(this.cJ, zn.Qhi());
        }
        int i12 = 20;
        if (this.hpZ != 2) {
            if (f10 != 0.0f && f10 != 100.0f) {
                i11 = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f10)) / 2.0f, 0.0f);
                max2 = 20;
                i10 = 20;
                i12 = i11;
            }
            i12 = 0;
            i11 = 0;
            max2 = 0;
            i10 = 0;
        } else {
            if (f10 != 0.0f && f10 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f10)) / 2.0f, 0.0f);
                i10 = max2;
                i11 = 20;
            }
            i12 = 0;
            i11 = 0;
            max2 = 0;
            i10 = 0;
        }
        ((Activity) this.cJ).getWindow().getDecorView().setPadding(zn.cJ(this.cJ, max2), zn.cJ(this.cJ, i12), zn.cJ(this.cJ, i10), zn.cJ(this.cJ, i11));
    }
}
