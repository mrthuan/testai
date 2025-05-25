package com.bytedance.sdk.component.fl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;

/* compiled from: IImageHandler.java */
@ATSApi
/* loaded from: classes.dex */
public interface WAv {
    @ATSMethod(5)
    ImageView.ScaleType CJ();

    @ATSMethod(2)
    String Qhi();

    @ATSMethod(8)
    Bitmap.Config Tgh();

    @ATSMethod(4)
    int ac();

    @ATSMethod(3)
    int cJ();

    @ATSMethod(7)
    String fl();
}
