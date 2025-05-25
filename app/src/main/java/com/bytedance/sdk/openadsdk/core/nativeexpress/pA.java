package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeRender.java */
/* loaded from: classes.dex */
public class pA extends com.bytedance.sdk.component.adexpress.cJ.Qhi<BackupView> {
    private com.bytedance.sdk.component.adexpress.cJ.ac CJ;
    AtomicBoolean Qhi = new AtomicBoolean(false);
    private final com.bytedance.sdk.component.adexpress.cJ.iMK Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final View f9153ac;
    private BackupView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.cJ.Sf f9154fl;

    public pA(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.cJ.iMK imk) {
        this.f9153ac = view;
        this.Tgh = imk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ() {
        float realWidth;
        if (this.Qhi.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.cJ.ac acVar = this.CJ;
        boolean z10 = false;
        if (acVar != null && acVar.Qhi((NativeExpressView) this.f9153ac, 0)) {
            z10 = true;
        }
        if (!z10) {
            this.f9154fl.Qhi(107, "backup false");
            return;
        }
        this.Tgh.fl().ROR();
        BackupView backupView = (BackupView) this.f9153ac.findViewWithTag("tt_express_backup_fl_tag_26");
        this.cJ = backupView;
        if (backupView != null) {
            com.bytedance.sdk.component.adexpress.cJ.pA pAVar = new com.bytedance.sdk.component.adexpress.cJ.pA();
            BackupView backupView2 = this.cJ;
            float f10 = 0.0f;
            if (backupView2 == null) {
                realWidth = 0.0f;
            } else {
                realWidth = backupView2.getRealWidth();
            }
            BackupView backupView3 = this.cJ;
            if (backupView3 != null) {
                f10 = backupView3.getRealHeight();
            }
            pAVar.Qhi(true);
            pAVar.Qhi(realWidth);
            pAVar.cJ(f10);
            this.f9154fl.Qhi(this.cJ, pAVar);
            return;
        }
        this.f9154fl.Qhi(107, "backupview is null");
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.Sf sf2) {
        this.f9154fl = sf2;
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.pA.1
            @Override // java.lang.Runnable
            public void run() {
                pA.this.cJ();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    /* renamed from: Qhi */
    public BackupView fl() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Qhi
    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.ac acVar) {
        this.CJ = acVar;
    }
}
