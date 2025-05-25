package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultComponentBehavior.java */
/* loaded from: classes.dex */
public class Tgh implements ac {
    @Override // com.bytedance.adsdk.ugeno.core.ac
    public List<cJ> Qhi() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cJ("Text") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.1
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.cJ(context);
            }
        });
        arrayList.add(new cJ("Image") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.4
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.image.cJ(context);
            }
        });
        arrayList.add(new cJ("FlexLayout") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.5
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.flexbox.Tgh(context);
            }
        });
        arrayList.add(new cJ("FrameLayout") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.6
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.frame.Qhi(context);
            }
        });
        arrayList.add(new cJ("ScrollLayout") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.7
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.scroll.Qhi(context);
            }
        });
        arrayList.add(new cJ("RichText") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.8
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.Qhi(context);
            }
        });
        arrayList.add(new cJ("Input") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.9
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.input.Qhi(context);
            }
        });
        arrayList.add(new cJ("Dislike") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.10
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.dislike.Qhi(context);
            }
        });
        arrayList.add(new cJ("RatingBar") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.11
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.ratingbar.Qhi(context);
            }
        });
        arrayList.add(new cJ("UgenProgressView") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.2
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.Qhi(context);
            }
        });
        arrayList.add(new cJ("ProgressButton") { // from class: com.bytedance.adsdk.ugeno.core.Tgh.3
            @Override // com.bytedance.adsdk.ugeno.core.cJ
            public com.bytedance.adsdk.ugeno.component.cJ Qhi(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.Qhi(context);
            }
        });
        return arrayList;
    }
}
