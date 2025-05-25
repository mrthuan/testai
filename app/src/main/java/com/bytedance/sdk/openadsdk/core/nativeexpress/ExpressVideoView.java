package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {
    private boolean hpZ;

    public ExpressVideoView(Context context, tP tPVar, String str, com.bytedance.sdk.openadsdk.cJ.Sf sf2) {
        super(context, tPVar, false, str, false, false, sf2);
        this.hpZ = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    private void HzH() {
        zn.Qhi((View) this.ROR, 0);
        zn.Qhi((View) this.Sf, 0);
        zn.Qhi((View) this.WAv, 8);
    }

    private void kYc() {
        ROR();
        RelativeLayout relativeLayout = this.ROR;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            }
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.Qhi.FQ().WAv(), this.Qhi.FQ().ac(), this.Qhi.FQ().cJ(), this.Sf, this.Qhi);
        }
        HzH();
    }

    public void CJ() {
        ImageView imageView = this.WAv;
        if (imageView != null) {
            zn.Qhi((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void ac() {
        if (this.hpZ) {
            super.ac();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void cJ() {
        if (!this.f9231fl || !kYc.cJ(this.f9234zc)) {
            this.CJ = false;
        }
        super.cJ();
    }

    public void fl() {
        ROR();
        zn.Qhi((View) this.ROR, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.f9232hm;
        if (imageView != null && imageView.getVisibility() == 0) {
            zn.fl(this.ROR);
        }
        ac();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        ImageView imageView = this.f9232hm;
        if (imageView != null && imageView.getVisibility() == 0) {
            kYc();
        } else {
            super.onWindowFocusChanged(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.f9232hm;
        if (imageView != null && imageView.getVisibility() == 0) {
            kYc();
        } else {
            super.onWindowVisibilityChanged(i10);
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.hpZ = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.cJ;
        if (flVar != null) {
            flVar.fl(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        com.bykv.vk.openvk.component.video.api.CJ.ac ABk;
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.cJ;
        if (flVar != null && (ABk = flVar.ABk()) != null) {
            ABk.Qhi(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void Qhi(boolean z10) {
    }
}
