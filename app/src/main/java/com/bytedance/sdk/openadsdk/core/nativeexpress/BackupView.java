package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.CQU;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public abstract class BackupView extends PAGFrameLayout {
    protected com.bytedance.sdk.openadsdk.dislike.cJ CJ;
    protected boolean Gm;
    private com.bytedance.sdk.openadsdk.cJ.Sf Qhi;
    protected int ROR;
    protected int Sf;
    protected String Tgh;
    protected boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected tP f9119ac;
    protected Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected TTDislikeDialogAbstract f9120fl;

    /* renamed from: hm  reason: collision with root package name */
    protected int f9121hm;

    /* renamed from: zc  reason: collision with root package name */
    protected String f9122zc;

    public BackupView(Context context) {
        super(context);
        this.Tgh = "embeded_ad";
        this.WAv = true;
        this.Gm = true;
        setTag("tt_express_backup_fl_tag_26");
    }

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
            TTDelegateActivity.Qhi(this.f9119ac, (String) null);
        }
    }

    public abstract void Qhi(View view, int i10, com.bytedance.sdk.openadsdk.core.model.pA pAVar);

    public String getDescription() {
        if (!TextUtils.isEmpty(this.f9119ac.dVA())) {
            return this.f9119ac.dVA();
        }
        if (!TextUtils.isEmpty(this.f9119ac.zjb())) {
            return this.f9119ac.zjb();
        }
        return "";
    }

    public String getNameOrSource() {
        tP tPVar = this.f9119ac;
        if (tPVar == null) {
            return "";
        }
        if (tPVar.pv() != null && !TextUtils.isEmpty(this.f9119ac.pv().cJ())) {
            return this.f9119ac.pv().cJ();
        }
        if (TextUtils.isEmpty(this.f9119ac.PAe())) {
            return "";
        }
        return this.f9119ac.PAe();
    }

    public float getRealHeight() {
        return zn.ac(this.cJ, this.Sf);
    }

    public float getRealWidth() {
        return zn.ac(this.cJ, this.ROR);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        if (this.f9119ac.pv() != null && !TextUtils.isEmpty(this.f9119ac.pv().cJ())) {
            return this.f9119ac.pv().cJ();
        }
        if (!TextUtils.isEmpty(this.f9119ac.PAe())) {
            return this.f9119ac.PAe();
        }
        if (!TextUtils.isEmpty(this.f9119ac.dVA())) {
            return this.f9119ac.dVA();
        }
        return "";
    }

    public NativeVideoTsView getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        tP tPVar = this.f9119ac;
        if (tPVar != null && this.cJ != null) {
            if (tP.fl(tPVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.cJ, this.f9119ac, this.Tgh, true, false, this.Qhi);
                    nativeVideoTsView.setVideoCacheUrl(this.f9122zc);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.cJ() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.cJ
                        public void Qhi(boolean z10, long j10, long j11, long j12, boolean z11) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.WAv);
                    nativeVideoTsView.setIsQuiet(this.Gm);
                } catch (Throwable unused) {
                }
                if (!tP.fl(this.f9119ac) && nativeVideoTsView != null && nativeVideoTsView.Qhi(0L, true, false)) {
                    return nativeVideoTsView;
                }
            }
            nativeVideoTsView = null;
            if (!tP.fl(this.f9119ac)) {
            }
        }
        return null;
    }

    public void setDislikeInner(CQU cqu) {
        if (cqu instanceof com.bytedance.sdk.openadsdk.dislike.cJ) {
            this.CJ = (com.bytedance.sdk.openadsdk.dislike.cJ) cqu;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        tP tPVar;
        if (tTDislikeDialogAbstract != null && (tPVar = this.f9119ac) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(tPVar.EGK(), this.f9119ac.VnT());
        }
        this.f9120fl = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.Tgh = "embeded_ad";
        this.WAv = true;
        this.Gm = true;
        this.f9122zc = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void Qhi(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.cJ;
            tP tPVar = this.f9119ac;
            String str = this.Tgh;
            cJVar = new com.bytedance.sdk.openadsdk.core.cJ.Qhi(context, tPVar, str, js.Qhi(str));
        } else {
            Context context2 = this.cJ;
            tP tPVar2 = this.f9119ac;
            String str2 = this.Tgh;
            cJVar = new com.bytedance.sdk.openadsdk.core.cJ.cJ(context2, tPVar2, str2, js.Qhi(str2));
        }
        view.setOnTouchListener(cJVar);
        view.setOnClickListener(cJVar);
        cJVar.Qhi(new Qhi() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.Qhi
            public void Qhi(View view2, int i10, com.bytedance.sdk.openadsdk.core.model.pA pAVar) {
                BackupView.this.Qhi(view2, i10, pAVar);
            }
        });
    }

    public void Qhi(int i10) {
        this.Gm = com.bytedance.sdk.openadsdk.core.HzH.CJ().ac(String.valueOf(this.f9121hm));
        int cJ = com.bytedance.sdk.openadsdk.core.HzH.CJ().cJ(i10);
        if (3 == cJ) {
            this.WAv = false;
            return;
        }
        int ac2 = com.bytedance.sdk.component.utils.hpZ.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
        if (1 != cJ || !js.CJ(ac2)) {
            if (2 == cJ) {
                if (js.fl(ac2) || js.CJ(ac2) || js.Tgh(ac2)) {
                    this.WAv = true;
                    return;
                }
                return;
            } else if (5 != cJ) {
                return;
            } else {
                if (!js.CJ(ac2) && !js.Tgh(ac2)) {
                    return;
                }
            }
        }
        this.WAv = true;
    }

    public void Qhi(View view) {
        tP tPVar = this.f9119ac;
        if (tPVar == null || tPVar.FQ() == null || view == null) {
            return;
        }
        boolean z10 = true;
        Qhi(view, (this.f9119ac.Dww() == 1 && this.WAv) ? false : false);
    }
}
