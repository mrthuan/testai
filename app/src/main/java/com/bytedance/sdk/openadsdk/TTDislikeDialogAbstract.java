package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog {
    private String CJ;
    private View Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private List<FilterWord> f8512ac;
    private String cJ;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
    }

    private void Qhi() {
        if (this.f8512ac == null || this.Qhi == null) {
            return;
        }
        int[] tTDislikeListViewIds = getTTDislikeListViewIds();
        if (tTDislikeListViewIds != null && tTDislikeListViewIds.length > 0) {
            for (int i10 : tTDislikeListViewIds) {
                View findViewById = this.Qhi.findViewById(i10);
                if (findViewById != null) {
                    if (findViewById instanceof TTDislikeListView) {
                        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById;
                        tTDislikeListView.setMaterialMeta(this.cJ);
                        tTDislikeListView.setDislikeSource(this.CJ);
                    } else {
                        throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id , please check");
                    }
                } else {
                    throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id,please check");
                }
            }
            return;
        }
        throw new IllegalArgumentException("The options list of dislike is empty, please set TTDislikeListView");
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public abstract int[] getTTDislikeListViewIds();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.Qhi = layoutView;
        if (layoutView != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            View view = this.Qhi;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            setContentView(view, layoutParams);
            Qhi();
            return;
        }
        throw new IllegalArgumentException("getLayoutView,layout  may be abnormal, please check");
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.cJ = str;
        this.f8512ac = list;
        Qhi();
    }

    public TTDislikeDialogAbstract(Context context, int i10, String str) {
        super(context, i10);
        this.CJ = str;
    }
}
