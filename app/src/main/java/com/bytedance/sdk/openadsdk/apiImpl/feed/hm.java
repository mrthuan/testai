package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi;
import com.bytedance.sdk.openadsdk.core.hpZ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.aP;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.js;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: TTNativeAdImpl.java */
/* loaded from: classes.dex */
public class hm extends PAGNativeAd {
    protected Qhi CJ;
    protected hpZ Qhi;
    protected String ROR;
    private boolean Sf;
    protected int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected final Context f8609ac;
    protected final tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected int f8610fl;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8611hm;

    public hm(Context context, tP tPVar, int i10, boolean z10) {
        if (tPVar == null) {
            ABk.cJ("materialMeta can't been null");
        }
        this.cJ = tPVar;
        this.f8609ac = context;
        this.f8610fl = i10;
        this.Tgh = tPVar.Hy();
        String ac2 = js.ac(i10);
        this.ROR = ac2;
        if (z10) {
            this.CJ = new Qhi(context, tPVar, ac2);
            this.Qhi = new hpZ(context, this, tPVar, Qhi(i10), this.CJ);
        }
    }

    private String Qhi(int i10) {
        return i10 != 1 ? i10 != 2 ? "embeded_ad" : "interaction" : "banner_ad";
    }

    public boolean ROR() {
        tP tPVar = this.cJ;
        if (tPVar == null || tPVar.ip() == 5 || HzH.CJ().ac(this.Tgh) != 1) {
            return false;
        }
        return true;
    }

    public Qhi Sf() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        tP tPVar = this.cJ;
        if (tPVar != null && tPVar.Gy() != null) {
            try {
                return this.cJ.Gy().get(str);
            } catch (Throwable th2) {
                ABk.Qhi("TTNativeAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        tP tPVar = this.cJ;
        if (tPVar != null) {
            return tPVar.Gy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new fl(Sf());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.f8611hm) {
            aP.Qhi(this.cJ, d10, str, str2);
            this.f8611hm = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null) {
            ABk.cJ("container can't been null");
        } else if (list == null) {
            ABk.cJ("clickView can't been null");
        } else if (list.size() <= 0) {
            ABk.cJ("clickViews size must been more than 1");
        } else {
            Qhi(viewGroup, null, list, list2, view, new Sf(pAGNativeAdInteractionListener));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.Sf) {
            aP.Qhi(this.cJ, d10);
            this.Sf = true;
        }
    }

    private List<View> Qhi(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                linkedList.add(list.get(i10));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedList.add(list2.get(i11));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    public void Qhi(String str) {
        this.ROR = str;
    }

    public void Qhi(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final ROR ror) {
        if (viewGroup == null) {
            ABk.cJ("container can't been null");
        } else if (list2 == null) {
            ABk.cJ("clickView can't been null");
        } else if (list2.size() <= 0) {
            ABk.cJ("clickViews size must been more than 1");
        } else {
            if (ROR()) {
                list3 = Qhi(list2, list3);
            }
            List<View> list4 = list3;
            if (view != null && ror != null && ror.cJ()) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.hm.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        final String Qhi = bxS.Qhi();
                        TTDelegateActivity.Qhi(hm.this.cJ, Qhi, new Qhi.InterfaceC0119Qhi() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.hm.1.1
                            @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi.InterfaceC0119Qhi
                            public void Qhi() {
                                ror.Qhi();
                                com.bytedance.sdk.openadsdk.core.hm.cJ().Tgh(Qhi);
                                PAGMediaView Qhi2 = hm.this.Sf().Qhi();
                                if (Qhi2 != null) {
                                    Qhi2.close();
                                }
                            }
                        });
                    }
                });
            }
            this.Qhi.Qhi(viewGroup, list, list2, list4, view, ror);
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(viewGroup, this.cJ, null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }
}
