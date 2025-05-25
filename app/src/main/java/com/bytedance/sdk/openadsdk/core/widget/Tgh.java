package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.layout.TTVideoTrafficTipsLayout;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: VideoTrafficTipLayout.java */
/* loaded from: classes.dex */
public class Tgh {
    private com.bytedance.sdk.openadsdk.core.video.nativevideo.Qhi CJ;
    private View Qhi;
    private com.bykv.vk.openvk.component.video.api.ac.cJ ROR;
    private ViewGroup Sf;
    private boolean Tgh = false;

    /* renamed from: ac  reason: collision with root package name */
    private Context f9288ac;
    private TextView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private cJ f9289fl;

    /* compiled from: VideoTrafficTipLayout.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* compiled from: VideoTrafficTipLayout.java */
    /* loaded from: classes.dex */
    public interface cJ {
        void Gm();

        boolean WAv();
    }

    private void CJ() {
        View view = this.Qhi;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (this.f9288ac == null) {
            return;
        }
        CJ();
    }

    private void cJ() {
        this.ROR = null;
    }

    public void Qhi(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.Sf = viewGroup;
        this.f9288ac = HzH.Qhi().getApplicationContext();
    }

    private void Qhi(Context context, View view, boolean z10) {
        ViewGroup.LayoutParams Qhi2;
        if (context == null || view == null || this.Qhi != null || (Qhi2 = Qhi(this.Sf)) == null) {
            return;
        }
        TTVideoTrafficTipsLayout tTVideoTrafficTipsLayout = new TTVideoTrafficTipsLayout(context);
        this.Qhi = tTVideoTrafficTipsLayout;
        tTVideoTrafficTipsLayout.setLayoutParams(Qhi2);
        this.Sf.addView(this.Qhi);
        this.cJ = (TextView) this.Qhi.findViewById(iMK.Hy);
        View findViewById = this.Qhi.findViewById(iMK.yBk);
        if (z10) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Tgh.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Tgh.this.ac();
                    if (Tgh.this.CJ != null) {
                        Tgh.this.CJ.Qhi(Qhi.START_VIDEO, (String) null);
                    }
                }
            });
            return;
        }
        findViewById.setOnClickListener(null);
        findViewById.setClickable(false);
    }

    private ViewGroup.LayoutParams Qhi(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.video.nativevideo.Qhi qhi, cJ cJVar) {
        this.f9289fl = cJVar;
        this.CJ = qhi;
    }

    public boolean Qhi(int i10, com.bykv.vk.openvk.component.video.api.ac.cJ cJVar, boolean z10) {
        Context context = this.f9288ac;
        if (context == null || cJVar == null) {
            return true;
        }
        Qhi(context, this.Sf, z10);
        this.ROR = cJVar;
        if (i10 == 1 || i10 == 2) {
            return Qhi(i10);
        }
        return true;
    }

    private boolean Qhi(int i10) {
        cJ cJVar;
        if (Qhi() || this.Tgh) {
            return true;
        }
        if (this.CJ != null && (cJVar = this.f9289fl) != null) {
            if (cJVar.WAv()) {
                this.CJ.fl(null, null);
            }
            this.CJ.Qhi(Qhi.PAUSE_VIDEO, (String) null);
        }
        Qhi(this.ROR, true);
        return false;
    }

    public void Qhi(boolean z10) {
        if (z10) {
            cJ();
        }
        CJ();
    }

    public boolean Qhi() {
        View view = this.Qhi;
        return view != null && view.getVisibility() == 0;
    }

    private void Qhi(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar, boolean z10) {
        View view;
        String str;
        View view2;
        if (cJVar == null || (view = this.Qhi) == null || this.f9288ac == null || view.getVisibility() == 0) {
            return;
        }
        cJ cJVar2 = this.f9289fl;
        if (cJVar2 != null) {
            cJVar2.Gm();
        }
        double ceil = Math.ceil((cJVar.fl() * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(MQ.Qhi(this.f9288ac, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = MQ.Qhi(this.f9288ac, "tt_video_without_wifi_tips") + MQ.Qhi(this.f9288ac, "tt_video_bytesize");
        }
        zn.Qhi(this.Qhi, 0);
        zn.Qhi(this.cJ, str);
        if (!zn.CJ(this.Qhi) || (view2 = this.Qhi) == null) {
            return;
        }
        view2.bringToFront();
    }
}
