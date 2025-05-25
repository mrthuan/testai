package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EmptyView extends View implements CQU.Qhi {
    private final Runnable ABk;
    private View CJ;
    private ViewTreeObserver.OnGlobalLayoutListener Gm;
    private boolean Qhi;
    private boolean ROR;
    private int Sf;
    private List<View> Tgh;
    private final AtomicBoolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private Qhi f8909ac;
    private boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private List<View> f8910fl;

    /* renamed from: hm  reason: collision with root package name */
    private final Handler f8911hm;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f8912zc;

    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();

        void Qhi(View view);

        void Qhi(boolean z10);

        void cJ();
    }

    public EmptyView(Context context, View view) {
        super(HzH.Qhi());
        this.f8911hm = new com.bytedance.sdk.component.utils.CQU(iMK.cJ().getLooper(), this);
        this.WAv = new AtomicBoolean(true);
        this.f8912zc = false;
        this.ABk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.3
            @Override // java.lang.Runnable
            public void run() {
                if (EmptyView.this.f8909ac != null) {
                    EmptyView.this.f8909ac.Qhi(EmptyView.this.CJ);
                }
            }
        };
        this.CJ = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.Gm = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!EmptyView.this.f8912zc) {
                    EmptyView.this.fl();
                    EmptyView.this.CJ();
                }
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ROR = false;
        cJ();
        if (this.Gm != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.Gm);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fl();
        this.ROR = true;
        ac();
        Qhi(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        cJ();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        ac();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Qhi qhi = this.f8909ac;
        if (qhi != null) {
            qhi.Qhi(z10);
        }
    }

    public void setAdType(int i10) {
        this.Sf = i10;
    }

    public void setCallback(Qhi qhi) {
        this.f8909ac = qhi;
    }

    public void setNeedCheckingShow(boolean z10) {
        this.cJ = z10;
        if (!z10 && this.Qhi) {
            fl();
        } else if (z10 && !this.Qhi) {
            CJ();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.f8910fl = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.Tgh = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ() {
        if (!this.cJ || this.Qhi) {
            return;
        }
        this.Qhi = true;
        this.f8911hm.sendEmptyMessage(1);
    }

    private boolean Tgh() {
        View view = this.CJ;
        if (view instanceof NativeExpressView) {
            return ((NativeExpressView) view).pA();
        }
        return true;
    }

    private void ac() {
        Qhi qhi;
        if (this.WAv.getAndSet(true) || (qhi = this.f8909ac) == null) {
            return;
        }
        qhi.cJ();
    }

    private void cJ() {
        Qhi qhi;
        if (!this.WAv.getAndSet(false) || (qhi = this.f8909ac) == null) {
            return;
        }
        qhi.Qhi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fl() {
        if (this.Qhi) {
            this.f8911hm.removeCallbacksAndMessages(null);
            this.Qhi = false;
        }
    }

    public void Qhi() {
        Qhi(this.f8910fl, (com.bytedance.sdk.openadsdk.core.cJ.ac) null);
        Qhi(this.Tgh, (com.bytedance.sdk.openadsdk.core.cJ.ac) null);
    }

    public void Qhi(List<View> list, com.bytedance.sdk.openadsdk.core.cJ.ac acVar) {
        if (com.bytedance.sdk.component.utils.Gm.cJ(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(acVar);
                    view.setOnTouchListener(acVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        if (message.what == 1 && this.Qhi) {
            if (Tgh() && sDy.Qhi(this.CJ, 20, this.Sf)) {
                fl();
                this.f8912zc = true;
                iMK.ac().post(this.ABk);
                Qhi(true);
                return;
            }
            this.f8911hm.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void Qhi(final boolean z10) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.Sf.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (EmptyView.this.Gm != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(EmptyView.this.Gm);
                    } catch (Exception unused) {
                    }
                }
                if (z10) {
                    EmptyView.this.Gm = null;
                }
            }
        });
    }
}
