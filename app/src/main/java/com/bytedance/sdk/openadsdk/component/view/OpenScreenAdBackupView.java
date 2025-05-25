package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* loaded from: classes.dex */
public class OpenScreenAdBackupView extends BackupView {
    private NativeExpressView Qhi;

    public OpenScreenAdBackupView(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void Qhi(View view, int i10, pA pAVar) {
        NativeExpressView nativeExpressView = this.Qhi;
        if (nativeExpressView != null) {
            nativeExpressView.Qhi(view, i10, pAVar);
        }
    }

    public void Qhi(NativeExpressView nativeExpressView) {
        this.Qhi = nativeExpressView;
        nativeExpressView.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
