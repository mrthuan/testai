package com.bytedance.sdk.openadsdk.component.cJ;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.Gm.ac;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.Sf;
import com.bytedance.sdk.openadsdk.core.model.cJ;
import com.bytedance.sdk.openadsdk.core.model.qMt;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Jma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FeedAdManager.java */
/* loaded from: classes.dex */
public class Qhi {
    private static volatile Qhi Qhi;
    private final tP cJ = HzH.ac();

    private Qhi() {
    }

    public static Qhi Qhi() {
        if (Qhi == null) {
            synchronized (Qhi.class) {
                if (Qhi == null) {
                    Qhi = new Qhi();
                }
            }
        }
        return Qhi;
    }

    public void Qhi(final Context context, final AdSlot adSlot, final fl flVar) {
        final Jma Qhi2 = Jma.Qhi();
        this.cJ.Qhi(adSlot, new qMt(), 5, new tP.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.cJ.Qhi.1
            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(int i10, String str) {
                flVar.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, cJ cJVar) {
                boolean z10;
                if (qhi.ac() != null && !qhi.ac().isEmpty()) {
                    List<com.bytedance.sdk.openadsdk.core.model.tP> ac2 = qhi.ac();
                    ArrayList arrayList = new ArrayList(ac2.size());
                    Iterator<com.bytedance.sdk.openadsdk.core.model.tP> it = ac2.iterator();
                    while (true) {
                        z10 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.openadsdk.core.model.tP next = it.next();
                        if (com.bytedance.sdk.openadsdk.core.model.tP.fl(next) || (next != null && next.DaO())) {
                            PAGNativeAd Qhi3 = Qhi(context, next, adSlot);
                            if (flVar instanceof PAGNativeAdLoadListener) {
                                arrayList.add(Qhi3);
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tP.fl(next) && next.FQ() != null && next.FQ().Gm() != null) {
                            if (HzH.CJ().fl(String.valueOf(next.Hy())) && HzH.CJ().NBs()) {
                                if (next.FQ() != null) {
                                    next.FQ().Tgh(1);
                                }
                                if (next.Ki() != null) {
                                    next.Ki().Tgh(1);
                                }
                                com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi4 = com.bytedance.sdk.openadsdk.core.model.tP.Qhi(CacheDirFactory.getICacheDir(next.zTC()).ac(), next);
                                Qhi4.Qhi("material_meta", next);
                                Qhi4.Qhi("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi4, null);
                            }
                            IPMiBroadcastReceiver.Qhi(context, next);
                        }
                    }
                    if (!(flVar instanceof PAGNativeAdLoadListener) || arrayList.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            ac.Qhi(ac2.get(0), Qhi2.ac());
                        }
                        fl flVar2 = flVar;
                        if (flVar2 instanceof PAGNativeAdLoadListener) {
                            ((PAGNativeAdLoadListener) flVar2).onAdLoaded(arrayList.get(0));
                        }
                        if (cJVar.fl() == null || cJVar.fl().isEmpty()) {
                            return;
                        }
                        cJ.Qhi(cJVar);
                        return;
                    }
                    flVar.onError(-4, Sf.Qhi(-4));
                    cJVar.Qhi(-4);
                    cJ.Qhi(cJVar);
                    return;
                }
                flVar.onError(-3, Sf.Qhi(-3));
                cJVar.Qhi(-3);
                cJ.Qhi(cJVar);
            }

            private PAGNativeAd Qhi(Context context2, com.bytedance.sdk.openadsdk.core.model.tP tPVar, AdSlot adSlot2) {
                if (tPVar.EBS() != 2) {
                    return new com.bytedance.sdk.openadsdk.apiImpl.feed.cJ(context2, tPVar, 5, adSlot2);
                }
                if (tPVar.FQ() != null) {
                    return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.Qhi(context2, tPVar, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ(context2, tPVar, adSlot2);
            }
        });
    }
}
