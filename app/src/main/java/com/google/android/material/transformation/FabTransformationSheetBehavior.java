package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.android.play.core.assetpacks.b1;
import f8.h;
import java.util.HashMap;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public HashMap f13148i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void s(View view, View view2, boolean z10, boolean z11) {
        boolean z12;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f13148i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f3487a instanceof FabTransformationScrimBehavior)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (childAt != view2 && !z12) {
                    if (!z10) {
                        HashMap hashMap = this.f13148i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f13148i.get(childAt)).intValue();
                            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                            f0.d.s(childAt, intValue);
                        }
                    } else {
                        this.f13148i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                        f0.d.s(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f13148i = null;
            }
        }
        super.s(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final FabTransformationBehavior.b z(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i10 = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f13143a = h.b(context, i10);
        bVar.f13144b = new b1();
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
