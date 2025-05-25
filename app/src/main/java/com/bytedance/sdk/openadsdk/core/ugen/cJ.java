package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGenInitHelper.java */
/* loaded from: classes.dex */
public class cJ {
    public static void Qhi(Context context) {
        fl.Qhi().Qhi(context, new com.bytedance.adsdk.ugeno.core.ac() { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.1
            @Override // com.bytedance.adsdk.ugeno.core.ac
            public List<com.bytedance.adsdk.ugeno.core.cJ> Qhi() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.bytedance.adsdk.ugeno.core.cJ("Gif") { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.1.1
                    @Override // com.bytedance.adsdk.ugeno.core.cJ
                    public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.cJ(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.cJ("Lottie") { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.1.2
                    @Override // com.bytedance.adsdk.ugeno.core.cJ
                    public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context2) {
                        return new com.bytedance.adsdk.cJ.Qhi(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.cJ("Logo") { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.1.3
                    @Override // com.bytedance.adsdk.ugeno.core.cJ
                    public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.ac(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.cJ("CommentNum") { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.1.4
                    @Override // com.bytedance.adsdk.ugeno.core.cJ
                    public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.Qhi(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.cJ("Video") { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.1.5
                    @Override // com.bytedance.adsdk.ugeno.core.cJ
                    public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.video.Qhi(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.cJ("Swiper") { // from class: com.bytedance.sdk.openadsdk.core.ugen.cJ.1.6
                    @Override // com.bytedance.adsdk.ugeno.core.cJ
                    public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context2) {
                        return new com.bytedance.adsdk.ugeno.cJ(context2);
                    }
                });
                return arrayList;
            }
        }, new Qhi());
    }
}
