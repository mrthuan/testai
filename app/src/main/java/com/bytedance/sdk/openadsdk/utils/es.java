package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class es {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public class Qhi implements ViewTreeObserver.OnGlobalLayoutListener {
        View Qhi = null;
        final /* synthetic */ ViewGroup cJ;

        public Qhi(ViewGroup viewGroup) {
            this.cJ = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                cJ cJVar = (cJ) this.cJ.getTag(520093765);
                if (this.Qhi != null) {
                    Rect rect = new Rect();
                    this.Qhi.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.cJ.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (cJVar != null) {
                            cJVar.Qhi(this.cJ, false);
                        }
                        this.cJ.setTag(520093763, Boolean.FALSE);
                        return;
                    }
                    if (cJVar != null) {
                        cJVar.Qhi(this.cJ, true);
                    }
                    this.cJ.setTag(520093763, Boolean.TRUE);
                    return;
                }
                ViewGroup viewGroup = this.cJ;
                es.cJ(viewGroup, cJVar, (Integer) viewGroup.getTag(520093766));
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.cJ.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public interface cJ {
        void Qhi();

        void Qhi(View view, boolean z10);

        void Qhi(boolean z10);

        void cJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(View view, cJ cJVar, Integer num) {
        if (cJVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (Qhi(view, num.intValue())) {
            cJVar.Qhi(view, true);
        }
    }

    public static void Qhi(final ViewGroup viewGroup, boolean z10, int i10, cJ cJVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, cJVar);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final Qhi qhi = new Qhi(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.es.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        Qhi.this.Qhi = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        Qhi.this.Qhi = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(qhi);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.es.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        ViewGroup viewGroup2 = viewGroup;
                        es.cJ(viewGroup2, (cJ) viewGroup.getTag(520093765), (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.es.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z11) {
                try {
                    cJ cJVar2 = (cJ) viewGroup.getTag(520093765);
                    if (cJVar2 != null) {
                        cJVar2.Qhi(z11);
                        ViewGroup viewGroup2 = viewGroup;
                        es.cJ(viewGroup2, cJVar2, (Integer) viewGroup2.getTag(520093766));
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.es.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                cJ cJVar2 = (cJ) viewGroup.getTag(520093765);
                if (cJVar2 != null) {
                    cJVar2.Qhi();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                cJ cJVar2 = (cJ) viewGroup.getTag(520093765);
                if (cJVar2 != null) {
                    cJVar2.cJ();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean Qhi(View view, int i10) {
        return com.bytedance.sdk.openadsdk.core.sDy.Qhi(view, 20, i10);
    }
}
