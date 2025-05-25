package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.CQU;
import com.bytedance.sdk.openadsdk.dislike.Tgh;
import com.bytedance.sdk.openadsdk.dislike.ac;
import java.util.List;

/* compiled from: TTAdDislikeImpl.java */
/* loaded from: classes.dex */
public class cJ implements CQU {
    private boolean CJ;
    public Tgh Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private ac f9308ac;
    private final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private CQU.Qhi f9309fl;

    public cJ(Context context, String str, List<FilterWord> list, String str2, String str3) {
        if (!(context instanceof Activity)) {
            ABk.cJ("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.cJ = context;
        Qhi(str, list, str2, str3);
    }

    private void Qhi(String str, List<FilterWord> list, String str2, String str3) {
        this.f9308ac = new ac(this.cJ, str, list, str3);
        Tgh tgh = new Tgh(this.cJ);
        this.Qhi = tgh;
        tgh.Qhi(str, str2);
        this.Qhi.Qhi(str3);
        this.Qhi.Qhi(new Tgh.Qhi() { // from class: com.bytedance.sdk.openadsdk.dislike.cJ.1
            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void Qhi() {
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void ac() {
                cJ.this.Qhi();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void cJ() {
                cJ.this.Qhi();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void Qhi(int i10, FilterWord filterWord) {
                if (cJ.this.f9309fl != null) {
                    cJ.this.f9309fl.Qhi(i10, filterWord.getName());
                }
                if (cJ.this.f9309fl != null) {
                    cJ.this.f9309fl.Qhi();
                }
            }
        });
        this.f9308ac.Qhi(new ac.Qhi() { // from class: com.bytedance.sdk.openadsdk.dislike.cJ.2
            @Override // com.bytedance.sdk.openadsdk.dislike.ac.Qhi
            public void Qhi() {
                cJ.this.Qhi(true);
                if (cJ.this.f9308ac != null && cJ.this.f9308ac.isShowing()) {
                    cJ.this.f9308ac.dismiss();
                }
                cJ.this.ac();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.ac.Qhi
            public void ac() {
                ABk.Qhi("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.ac.Qhi
            public void cJ() {
                ABk.Qhi("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (cJ.this.f9309fl != null) {
                        cJ.this.f9309fl.Qhi();
                    }
                } catch (Throwable th2) {
                    ABk.Qhi("TTAdDislikeImpl", "dislike callback cancel error: ", th2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.ac.Qhi
            public void Qhi(int i10, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && cJ.this.f9309fl != null) {
                        cJ.this.f9309fl.Qhi(i10, filterWord.getName());
                    }
                    ABk.Qhi("TTAdDislikeImpl", "onDislikeSelected: " + i10 + ", " + filterWord.getName());
                } catch (Throwable th2) {
                    ABk.Qhi("TTAdDislikeImpl", "dislike callback selected error: ", th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        Context context = this.cJ;
        if ((context instanceof Activity) && (!((Activity) context).isFinishing()) && !this.Qhi.isShowing()) {
            this.Qhi.show();
        }
    }

    public boolean cJ() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.CQU
    public void Qhi() {
        Context context = this.cJ;
        if (!((context instanceof Activity) && !((Activity) context).isFinishing()) || this.f9308ac.isShowing()) {
            return;
        }
        this.f9308ac.show();
    }

    public void Qhi(String str, List<FilterWord> list) {
        this.f9308ac.Qhi(str, list);
    }

    @Override // com.bytedance.sdk.openadsdk.core.CQU
    public void Qhi(CQU.Qhi qhi) {
        this.f9309fl = qhi;
    }

    public void Qhi(String str) {
        ac acVar = this.f9308ac;
        if (acVar != null) {
            acVar.Qhi(str);
        }
    }

    public void Qhi(boolean z10) {
        this.CJ = z10;
    }
}
