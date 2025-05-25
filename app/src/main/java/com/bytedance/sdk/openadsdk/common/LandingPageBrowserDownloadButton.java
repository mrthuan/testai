package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class LandingPageBrowserDownloadButton extends Button {
    public LandingPageBrowserDownloadButton(Context context) {
        super(context);
        Qhi();
    }

    private void Qhi() {
        setId(iMK.SL);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, zn.cJ(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.hm.Qhi(context, "tt_browser_download_selector"));
        setText(MQ.cJ(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
