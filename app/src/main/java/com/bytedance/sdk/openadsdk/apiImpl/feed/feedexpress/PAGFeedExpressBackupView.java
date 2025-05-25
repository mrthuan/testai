package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* loaded from: classes.dex */
public class PAGFeedExpressBackupView extends BackupView {
    private com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi ABk;
    private NativeExpressView Qhi;

    public PAGFeedExpressBackupView(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void Qhi(View view, int i10, pA pAVar) {
        NativeExpressView nativeExpressView = this.Qhi;
        if (nativeExpressView != null) {
            nativeExpressView.Qhi(view, i10, pAVar);
        }
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi) {
        this.ABk = qhi;
    }

    public void Qhi(NativeExpressView nativeExpressView) {
        this.Qhi = nativeExpressView;
        nativeExpressView.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
