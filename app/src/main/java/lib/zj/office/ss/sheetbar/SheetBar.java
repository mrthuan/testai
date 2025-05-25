package lib.zj.office.ss.sheetbar;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.Vector;
import li.a;
import lib.zj.office.system.f;
import pdf.pdfreader.viewer.editor.free.R;
import rg.c;

/* loaded from: classes3.dex */
public class SheetBar extends HorizontalScrollView implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f20963a;

    /* renamed from: b  reason: collision with root package name */
    public int f20964b;
    public SheetButton c;

    /* renamed from: d  reason: collision with root package name */
    public final f f20965d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f20966e;

    public SheetBar(Context context) {
        super(context);
    }

    public final void a(int i10, boolean z10) {
        if (this.c.getSheetIndex() == i10 && !z10) {
            return;
        }
        int childCount = this.f20966e.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f20966e.getChildAt(i11);
            if (childAt instanceof SheetButton) {
                SheetButton sheetButton = (SheetButton) childAt;
                if (sheetButton.getSheetIndex() == i10) {
                    this.c = sheetButton;
                    sheetButton.a(true);
                } else {
                    sheetButton.a(false);
                }
            } else if (c.c) {
                childAt.setBackgroundColor(-13356242);
            } else {
                childAt.setBackgroundColor(-3420975);
            }
        }
        SheetButton sheetButton2 = this.c;
        int width = this.f20965d.m().getWindowManager().getDefaultDisplay().getWidth();
        int width2 = this.f20966e.getWidth();
        if (width2 > width) {
            int left = sheetButton2.getLeft();
            int right = left - ((width - (sheetButton2.getRight() - left)) / 2);
            if (right < 0) {
                right = 0;
            } else if (right + width > width2) {
                right = width2 - width;
            }
            scrollTo(right, 0);
        }
    }

    public int getSheetbarHeight() {
        return this.f20964b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.a(false);
        SheetButton sheetButton = (SheetButton) view;
        sheetButton.a(true);
        this.c = sheetButton;
        this.f20965d.r(1073741825, Integer.valueOf(sheetButton.getSheetIndex()));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LinearLayout linearLayout = this.f20966e;
        int i10 = this.f20963a;
        if (i10 == -1) {
            i10 = getResources().getDisplayMetrics().widthPixels;
        }
        linearLayout.setMinimumWidth(i10);
    }

    public SheetBar(Context context, f fVar, int i10) {
        super(context);
        this.f20965d = fVar;
        setVerticalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setFadingEdgeLength(0);
        if (i10 == getResources().getDisplayMetrics().widthPixels) {
            this.f20963a = -1;
        } else {
            this.f20963a = i10;
        }
        Context context2 = getContext();
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f20966e = linearLayout;
        linearLayout.setGravity(80);
        if (c.c) {
            this.f20966e.setBackground(getResources().getDrawable(R.drawable.lib_wps_shape_sheet_bar_dark));
        } else {
            this.f20966e.setBackground(getResources().getDrawable(R.drawable.lib_wps_shape_sheet_bar));
        }
        new a(context2);
        this.f20966e.setOrientation(0);
        LinearLayout linearLayout2 = this.f20966e;
        int i11 = this.f20963a;
        linearLayout2.setMinimumWidth(i11 == -1 ? getResources().getDisplayMetrics().widthPixels : i11);
        this.f20964b = context2.getResources().getDimensionPixelOffset(R.dimen.dp_36);
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.dp_1);
        Vector vector = (Vector) fVar.w(1073741826);
        int size = vector.size();
        for (int i12 = 0; i12 < size; i12++) {
            SheetButton sheetButton = new SheetButton(context2, (String) vector.get(i12), i12);
            if (this.c == null) {
                this.c = sheetButton;
                sheetButton.a(true);
            }
            sheetButton.setOnClickListener(this);
            this.f20966e.addView(sheetButton, new FrameLayout.LayoutParams(-2, this.f20964b));
            View view = new View(context2);
            if (c.c) {
                view.setBackgroundColor(-13356242);
            } else {
                view.setBackgroundColor(-3420975);
            }
            this.f20966e.addView(view, new FrameLayout.LayoutParams(dimensionPixelOffset, this.f20964b));
        }
        addView(this.f20966e, new FrameLayout.LayoutParams(-2, this.f20964b));
    }
}
