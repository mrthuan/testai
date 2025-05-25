package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TTDislikeListView extends ListView {
    private String CJ;
    protected IListenerManager Qhi;
    private final AdapterView.OnItemClickListener Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private String f9298ac;
    private AdapterView.OnItemClickListener cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f9299fl;

    public TTDislikeListView(Context context) {
        super(context);
        this.Tgh = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                if (TTDislikeListView.this.getAdapter() != null && TTDislikeListView.this.getAdapter().getItem(i10) != null && (TTDislikeListView.this.getAdapter().getItem(i10) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i10);
                    if (!filterWord.hasSecondOptions()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(filterWord);
                        if (!TextUtils.isEmpty(TTDislikeListView.this.f9298ac)) {
                            Qhi.Qhi().Qhi(TTDislikeListView.this.f9298ac, arrayList, TTDislikeListView.this.CJ);
                        }
                        if (!TextUtils.isEmpty(TTDislikeListView.this.f9299fl)) {
                            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                                TTDislikeListView.this.Qhi("onItemClickClosed");
                            } else {
                                Qhi.InterfaceC0119Qhi fl2 = hm.cJ().fl(TTDislikeListView.this.f9299fl);
                                if (fl2 != null) {
                                    fl2.Qhi();
                                    hm.cJ().Tgh(TTDislikeListView.this.f9299fl);
                                }
                            }
                        }
                    }
                    try {
                        if (TTDislikeListView.this.cJ != null) {
                            TTDislikeListView.this.cJ.onItemClick(adapterView, view, i10, j10);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
        };
        Qhi();
    }

    public void setClosedListenerKey(String str) {
        this.f9299fl = str;
    }

    public void setDislikeSource(String str) {
        this.CJ = str;
    }

    public void setMaterialMeta(String str) {
        this.f9298ac = str;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.cJ = onItemClickListener;
    }

    private void Qhi() {
        super.setOnItemClickListener(this.Tgh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final String str) {
        lG.ac(new com.bytedance.sdk.component.Sf.hm("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!TextUtils.isEmpty(TTDislikeListView.this.f9299fl)) {
                        TTDislikeListView.this.Qhi(6).executeDisLikeClosedCallback(TTDislikeListView.this.f9299fl, str);
                    }
                } catch (Throwable th2) {
                    ABk.Qhi("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public IListenerManager Qhi(int i10) {
        if (this.Qhi == null) {
            this.Qhi = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().Qhi(i10));
        }
        return this.Qhi;
    }

    public static void Qhi(final int i10, final String str, final Qhi.InterfaceC0119Qhi interfaceC0119Qhi) {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            lG.ac(new com.bytedance.sdk.component.Sf.hm("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Qhi Qhi = com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi();
                    if (i10 == 6 && interfaceC0119Qhi != null) {
                        try {
                            com.bytedance.sdk.openadsdk.multipro.aidl.cJ.cJ cJVar = new com.bytedance.sdk.openadsdk.multipro.aidl.cJ.cJ(str, interfaceC0119Qhi);
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(Qhi.Qhi(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, cJVar);
                            }
                        } catch (RemoteException e10) {
                            ABk.Qhi("TTDislikeListView", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static void Qhi(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            lG.ac(new com.bytedance.sdk.component.Sf.hm("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Qhi Qhi = com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi();
                    if (i10 == 6) {
                        try {
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(Qhi.Qhi(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }
}
