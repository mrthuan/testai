package com.scwang.smart.refresh.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import pdf.pdfreader.viewer.editor.free.R;
import yb.b;
import yb.d;
import yb.e;

/* loaded from: classes2.dex */
public class ClassicsFooter extends ClassicsAbstract<ClassicsFooter> implements b {

    /* renamed from: q  reason: collision with root package name */
    public final String f15881q;

    /* renamed from: r  reason: collision with root package name */
    public final String f15882r;

    /* renamed from: s  reason: collision with root package name */
    public final String f15883s;

    /* renamed from: t  reason: collision with root package name */
    public final String f15884t;

    /* renamed from: u  reason: collision with root package name */
    public final String f15885u;

    /* renamed from: v  reason: collision with root package name */
    public final String f15886v;

    /* renamed from: w  reason: collision with root package name */
    public final String f15887w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15888x;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15889a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f15889a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15889a[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15889a[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15889a[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15889a[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15889a[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.b
    public final boolean a(boolean z10) {
        if (this.f15888x != z10) {
            this.f15888x = z10;
            ImageView imageView = this.f15869e;
            if (z10) {
                this.f15868d.setText(this.f15887w);
                imageView.setVisibility(8);
                return true;
            }
            this.f15868d.setText(this.f15881q);
            imageView.setVisibility(0);
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, bc.f
    public final void g(e eVar, RefreshState refreshState, RefreshState refreshState2) {
        ImageView imageView = this.f15869e;
        if (!this.f15888x) {
            switch (a.f15889a[refreshState2.ordinal()]) {
                case 1:
                    imageView.setVisibility(0);
                    break;
                case 2:
                    break;
                case 3:
                case 4:
                    imageView.setVisibility(8);
                    this.f15868d.setText(this.f15883s);
                    return;
                case 5:
                    this.f15868d.setText(this.f15882r);
                    imageView.animate().rotation(0.0f);
                    return;
                case 6:
                    this.f15868d.setText(this.f15884t);
                    imageView.setVisibility(8);
                    return;
                default:
                    return;
            }
            this.f15868d.setText(this.f15881q);
            imageView.animate().rotation(180.0f);
        }
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public final int i(e eVar, boolean z10) {
        String str;
        super.i(eVar, z10);
        if (!this.f15888x) {
            TextView textView = this.f15868d;
            if (z10) {
                str = this.f15885u;
            } else {
                str = this.f15886v;
            }
            textView.setText(str);
            return this.f15877m;
        }
        return 0;
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    @Deprecated
    public void setPrimaryColors(int... iArr) {
        if (this.f15972b == zb.b.f32340e) {
            super.setPrimaryColors(iArr);
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15888x = false;
        View.inflate(context, R.layout.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(R.id.srl_classics_arrow);
        this.f15869e = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.srl_classics_progress);
        this.f15870f = imageView2;
        this.f15868d = (TextView) findViewById(R.id.srl_classics_title);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vb.a.f30801a);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, dc.b.c(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(3, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(3, layoutParams.height);
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(6, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(6, layoutParams2.height);
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams.height);
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams2.height);
        this.f15877m = obtainStyledAttributes.getInt(8, this.f15877m);
        this.f15972b = zb.b.f32343h[obtainStyledAttributes.getInt(1, this.f15972b.f32344a)];
        if (obtainStyledAttributes.hasValue(2)) {
            this.f15869e.setImageDrawable(obtainStyledAttributes.getDrawable(2));
        } else if (this.f15869e.getDrawable() == null) {
            ub.a aVar = new ub.a();
            this.f15872h = aVar;
            aVar.a(-10066330);
            this.f15869e.setImageDrawable(this.f15872h);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.f15870f.setImageDrawable(obtainStyledAttributes.getDrawable(5));
        } else if (this.f15870f.getDrawable() == null) {
            tb.b bVar = new tb.b();
            this.f15873i = bVar;
            bVar.a(-10066330);
            this.f15870f.setImageDrawable(this.f15873i);
        }
        if (obtainStyledAttributes.hasValue(17)) {
            this.f15868d.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(17, dc.b.c(16.0f)));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            int color = obtainStyledAttributes.getColor(9, 0);
            this.f15875k = true;
            this.f15876l = color;
            d dVar = this.f15871g;
            if (dVar != null) {
                ((SmartRefreshLayout.h) dVar).c(this, color);
            }
        }
        if (obtainStyledAttributes.hasValue(0)) {
            j(obtainStyledAttributes.getColor(0, 0));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.f15881q = obtainStyledAttributes.getString(14);
        } else {
            this.f15881q = context.getString(R.string.arg_res_0x7f13048e);
        }
        if (obtainStyledAttributes.hasValue(16)) {
            this.f15882r = obtainStyledAttributes.getString(16);
        } else {
            this.f15882r = context.getString(R.string.arg_res_0x7f130490);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.f15883s = obtainStyledAttributes.getString(12);
        } else {
            this.f15883s = context.getString(R.string.arg_res_0x7f13048c);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.f15884t = obtainStyledAttributes.getString(15);
        } else {
            this.f15884t = context.getString(R.string.arg_res_0x7f13048f);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f15885u = obtainStyledAttributes.getString(11);
        } else {
            this.f15885u = context.getString(R.string.arg_res_0x7f13048b);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            this.f15886v = obtainStyledAttributes.getString(10);
        } else {
            this.f15886v = context.getString(R.string.arg_res_0x7f13048a);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.f15887w = obtainStyledAttributes.getString(13);
        } else {
            this.f15887w = context.getString(R.string.arg_res_0x7f13048d);
        }
        obtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f15868d.setText(isInEditMode() ? this.f15883s : this.f15881q);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
