package com.bytedance.sdk.component.adexpress.dynamic.Qhi;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicClose;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislike;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislikeFeedBack;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLeisureWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoAd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoUnion;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLottie;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicMutedView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicPrivacyView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRoot;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDown;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownBtn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownContainer;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSplitLineView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicStarView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuter;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterContainerWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterRewardFullSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicUnKnowView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVideoView;
import com.bytedance.sdk.component.adexpress.fl;

/* compiled from: DynamicViewFactory.java */
/* loaded from: classes.dex */
public class cJ {
    public static DynamicBaseWidget Qhi(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        iMK renderRequest;
        if (context == null || dynamicRootView == null || hmVar == null || hmVar.WAv() == null) {
            return null;
        }
        switch (hmVar.WAv().Qhi()) {
            case -1:
                return new DynamicUnKnowView(context, dynamicRootView, hmVar);
            case 0:
                return new DynamicTextView(context, dynamicRootView, hmVar);
            case 1:
                return new DynamicImageView(context, dynamicRootView, hmVar);
            case 2:
                return new DynamicButton(context, dynamicRootView, hmVar);
            case 3:
                return new DynamicDislike(context, dynamicRootView, hmVar);
            case 4:
                return new DynamicLogoAd(context, dynamicRootView, hmVar);
            case 5:
                return new DynamicLogoUnion(context, dynamicRootView, hmVar);
            case 6:
            case 9:
            case 17:
                return new DynamicBaseWidgetImp(context, dynamicRootView, hmVar);
            case 7:
                return new DynamicVideoView(context, dynamicRootView, hmVar);
            case 8:
                return new DynamicRoot(context, dynamicRootView, hmVar);
            case 10:
                return new DynamicMutedView(context, dynamicRootView, hmVar);
            case 11:
                return new DynamicStarView(context, dynamicRootView, hmVar);
            case 12:
                return new DynamicDislikeFeedBack(context, dynamicRootView, hmVar);
            case 13:
                return new DynamicTimeOuter(context, dynamicRootView, hmVar);
            case 14:
                return new DynamicTimeOuterContainerWidgetImp(context, dynamicRootView, hmVar);
            case 15:
                if (fl.cJ()) {
                    return new DynamicTimeOuterRewardFullSkip(context, dynamicRootView, hmVar);
                }
                return new DynamicTimeOuterSkip(context, dynamicRootView, hmVar);
            case 16:
                return new DynamicImageView(context, dynamicRootView, hmVar);
            case 18:
                return new DynamicSplitLineView(context, dynamicRootView, hmVar);
            case 19:
                return new DynamicSkipCountDownContainer(context, dynamicRootView, hmVar);
            case 20:
                return new DynamicSkipCountDown(context, dynamicRootView, hmVar);
            case 21:
                return new DynamicSkipCountDownBtn(context, dynamicRootView, hmVar);
            case 22:
                return new DynamicClose(context, dynamicRootView, hmVar);
            case 23:
                return new DynamicPrivacyView(context, dynamicRootView, hmVar);
            case 24:
                return new DynamicBaseScrollWidgetImp(context, dynamicRootView, hmVar);
            case 25:
                return new DynamicLeisureWidget(context, dynamicRootView, hmVar);
            case 26:
                if ("vertical".equals(hmVar.WAv().fl().DaO())) {
                    return new DynamicVerticalScrollWidgetImp(context, dynamicRootView, hmVar);
                }
                return new DynamicBaseInternalScrollWidgetImp(context, dynamicRootView, hmVar);
            case 27:
                return new DynamicTimeOuterSkip(context, dynamicRootView, hmVar);
            case 28:
                if (!fl.cJ() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new DynamicLottie(context, dynamicRootView, hmVar, renderRequest.Dww());
            default:
                return null;
        }
    }
}
