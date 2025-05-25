package com.bytedance.sdk.component.fl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;

/* compiled from: IImageLoader.java */
@ATSApi
/* loaded from: classes.dex */
public interface Gm {
    @ATSMethod(18)
    Gm CJ(int i10);

    @ATSMethod(10)
    Gm Qhi(int i10);

    @ATSMethod(9)
    Gm Qhi(Bitmap.Config config);

    @ATSMethod(8)
    Gm Qhi(ImageView.ScaleType scaleType);

    @ATSMethod(17)
    Gm Qhi(hm hmVar);

    @ATSMethod(13)
    Gm Qhi(qMt qmt);

    @ATSMethod(5)
    Gm Qhi(String str);

    @ATSMethod(15)
    Gm Qhi(boolean z10);

    @ATSMethod(3)
    WAv Qhi(ImageView imageView);

    @ATSMethod(2)
    WAv Qhi(HzH hzH);

    @ATSMethod(1)
    WAv Qhi(HzH hzH, int i10);

    @ATSMethod(12)
    Gm ac(int i10);

    @ATSMethod(11)
    Gm cJ(int i10);

    @ATSMethod(7)
    Gm cJ(String str);

    @ATSMethod(19)
    Gm fl(int i10);
}
