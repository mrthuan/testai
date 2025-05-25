package lib.zj.office.officereader.beans;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.HashMap;
import lib.zj.office.system.f;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class AToolsbar extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20896a;

    /* renamed from: b  reason: collision with root package name */
    public int f20897b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f20898d;

    /* renamed from: e  reason: collision with root package name */
    public final f f20899e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f20900f;

    /* renamed from: g  reason: collision with root package name */
    public HashMap f20901g;

    public AToolsbar(Context context, p pVar) {
        super(context);
        this.f20899e = pVar;
        setAnimation(true);
        setVerticalFadingEdgeEnabled(false);
        setFadingEdgeLength(0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f20900f = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(getResources().getDisplayMetrics().widthPixels);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.drawable.sys_toolsbar_button_bg_normal, options);
        this.f20897b = options.outWidth;
        this.c = options.outHeight;
        linearLayout.setBackgroundResource(R.drawable.sys_toolsbar_button_bg_normal);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, this.c));
    }

    public final AImageButton a(int i10, int i11, int i12, int i13, boolean z10) {
        LinearLayout linearLayout;
        Context context = getContext();
        AImageButton aImageButton = new AImageButton(context, this.f20899e, context.getResources().getString(i12), i10, i11, i13);
        aImageButton.setNormalBgResID(R.drawable.sys_toolsbar_button_bg_normal);
        aImageButton.setPushBgResID(R.drawable.sys_toolsbar_button_bg_push);
        aImageButton.setLayoutParams(new FrameLayout.LayoutParams(this.f20897b, this.c));
        this.f20900f.addView(aImageButton);
        this.f20898d += this.f20897b;
        if (this.f20901g == null) {
            this.f20901g = new HashMap();
        }
        this.f20901g.put(Integer.valueOf(i13), Integer.valueOf(linearLayout.getChildCount() - 1));
        if (z10) {
            c();
        }
        return aImageButton;
    }

    public final void b(int i10, int i11, int i12, int i13, int i14, int i15) {
        LinearLayout linearLayout;
        Context context = getContext();
        Resources resources = context.getResources();
        AImageCheckButton aImageCheckButton = new AImageCheckButton(context, this.f20899e, resources.getString(i13), resources.getString(i14), i10, i11, i12, i15);
        aImageCheckButton.setNormalBgResID(R.drawable.sys_toolsbar_button_bg_normal);
        aImageCheckButton.setPushBgResID(R.drawable.sys_toolsbar_button_bg_push);
        aImageCheckButton.setLayoutParams(new FrameLayout.LayoutParams(this.f20897b, this.c));
        this.f20900f.addView(aImageCheckButton);
        this.f20898d += this.f20897b;
        if (this.f20901g == null) {
            this.f20901g = new HashMap();
        }
        this.f20901g.put(Integer.valueOf(i15), Integer.valueOf(linearLayout.getChildCount() - 1));
        c();
    }

    public final void c() {
        this.f20900f.addView(new AImageButton(getContext(), this.f20899e, "", R.drawable.sys_toolsbar_separated_horizontal, -1, -1), new FrameLayout.LayoutParams(1, this.c));
        this.f20898d++;
    }

    public void d() {
        HashMap hashMap = this.f20901g;
        if (hashMap != null) {
            hashMap.clear();
        }
        LinearLayout linearLayout = this.f20900f;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof AImageButton) {
                ((AImageButton) childAt).a();
            }
        }
    }

    public final void e(int i10, short s4) {
        int intValue = ((Integer) this.f20901g.get(Integer.valueOf(i10))).intValue();
        if (intValue >= 0) {
            LinearLayout linearLayout = this.f20900f;
            if (intValue < linearLayout.getChildCount() && (linearLayout.getChildAt(intValue) instanceof AImageCheckButton)) {
                ((AImageCheckButton) linearLayout.getChildAt(intValue)).setState(s4);
            }
        }
    }

    public final void f(int i10, boolean z10) {
        Integer num = (Integer) this.f20901g.get(Integer.valueOf(i10));
        if (num != null && num.intValue() >= 0) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.f20900f;
            if (intValue < linearLayout.getChildCount()) {
                linearLayout.getChildAt(num.intValue()).setEnabled(z10);
            }
        }
    }

    public int getButtonHeight() {
        return this.c;
    }

    public int getButtonWidth() {
        return this.f20897b;
    }

    public int getToolsbarWidth() {
        return this.f20898d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f20900f.setMinimumWidth(getResources().getDisplayMetrics().widthPixels);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f20896a) {
            setAnimation(false);
            if (this.f20900f.getWidth() > getResources().getDisplayMetrics().widthPixels) {
                scrollTo(this.f20897b * 3, 0);
            }
            fling(-4000);
        }
        super.onDraw(canvas);
    }

    public void setAnimation(boolean z10) {
        this.f20896a = z10;
    }

    public void setButtonHeight(int i10) {
        this.c = i10;
    }

    public void setButtonWidth(int i10) {
        this.f20897b = i10;
    }

    public void setToolsbarWidth(int i10) {
        this.f20898d = i10;
    }

    public AToolsbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void g() {
    }
}
