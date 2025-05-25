package com.scwang.smart.refresh.header;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.g0;
import androidx.fragment.app.u;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import dc.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import yb.c;
import yb.d;
import yb.e;

/* loaded from: classes2.dex */
public class ClassicsHeader extends ClassicsAbstract<ClassicsHeader> implements c {
    public final String A;
    public final String B;
    public final String C;
    public final String D;

    /* renamed from: q  reason: collision with root package name */
    public final String f15890q;

    /* renamed from: r  reason: collision with root package name */
    public Date f15891r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f15892s;

    /* renamed from: t  reason: collision with root package name */
    public final SharedPreferences f15893t;

    /* renamed from: u  reason: collision with root package name */
    public final SimpleDateFormat f15894u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f15895v;

    /* renamed from: w  reason: collision with root package name */
    public final String f15896w;

    /* renamed from: x  reason: collision with root package name */
    public final String f15897x;

    /* renamed from: y  reason: collision with root package name */
    public final String f15898y;

    /* renamed from: z  reason: collision with root package name */
    public final String f15899z;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15900a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f15900a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15900a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15900a[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15900a[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15900a[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15900a[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15900a[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, bc.f
    public final void g(e eVar, RefreshState refreshState, RefreshState refreshState2) {
        ImageView imageView = this.f15869e;
        int i10 = a.f15900a[refreshState2.ordinal()];
        boolean z10 = this.f15895v;
        int i11 = 8;
        TextView textView = this.f15892s;
        switch (i10) {
            case 1:
                if (z10) {
                    i11 = 0;
                }
                textView.setVisibility(i11);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f15868d.setText(this.f15897x);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f15868d.setText(this.f15899z);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f15868d.setText(this.D);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                if (z10) {
                    i11 = 4;
                }
                textView.setVisibility(i11);
                this.f15868d.setText(this.f15898y);
                return;
            default:
                return;
        }
        this.f15868d.setText(this.f15896w);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public final int i(e eVar, boolean z10) {
        if (z10) {
            this.f15868d.setText(this.A);
            if (this.f15891r != null) {
                k(new Date());
            }
        } else {
            this.f15868d.setText(this.B);
        }
        return super.i(eVar, z10);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract
    public final void j(int i10) {
        this.f15892s.setTextColor((16777215 & i10) | (-872415232));
        super.j(i10);
    }

    public final void k(Date date) {
        this.f15891r = date;
        this.f15892s.setText(this.f15894u.format(date));
        SharedPreferences sharedPreferences = this.f15893t;
        if (sharedPreferences != null && !isInEditMode()) {
            sharedPreferences.edit().putLong(this.f15890q, date.getTime()).apply();
        }
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g0 supportFragmentManager;
        this.f15890q = "LAST_UPDATE_TIME";
        this.f15895v = true;
        View.inflate(context, R.layout.srl_classics_header, this);
        ImageView imageView = (ImageView) findViewById(R.id.srl_classics_arrow);
        this.f15869e = imageView;
        TextView textView = (TextView) findViewById(R.id.srl_classics_update);
        this.f15892s = textView;
        ImageView imageView2 = (ImageView) findViewById(R.id.srl_classics_progress);
        this.f15870f = imageView2;
        this.f15868d = (TextView) findViewById(R.id.srl_classics_title);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wb.a.f31071a);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = obtainStyledAttributes.getDimensionPixelSize(20, b.c(0.0f));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, b.c(20.0f));
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
        this.f15877m = obtainStyledAttributes.getInt(9, this.f15877m);
        boolean z10 = obtainStyledAttributes.getBoolean(8, true);
        this.f15895v = z10;
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
        if (obtainStyledAttributes.hasValue(19)) {
            this.f15868d.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(19, b.c(16.0f)));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            textView.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(18, b.c(12.0f)));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            int color = obtainStyledAttributes.getColor(10, 0);
            this.f15875k = true;
            this.f15876l = color;
            d dVar = this.f15871g;
            if (dVar != null) {
                ((SmartRefreshLayout.h) dVar).c(this, color);
            }
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int color2 = obtainStyledAttributes.getColor(0, 0);
            textView.setTextColor((16777215 & color2) | (-872415232));
            super.j(color2);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.f15896w = obtainStyledAttributes.getString(14);
        } else {
            this.f15896w = context.getString(R.string.arg_res_0x7f130494);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.f15898y = obtainStyledAttributes.getString(13);
        } else {
            this.f15898y = context.getString(R.string.arg_res_0x7f130493);
        }
        if (obtainStyledAttributes.hasValue(16)) {
            this.f15899z = obtainStyledAttributes.getString(16);
        } else {
            this.f15899z = context.getString(R.string.arg_res_0x7f130496);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.A = obtainStyledAttributes.getString(12);
        } else {
            this.A = context.getString(R.string.arg_res_0x7f130492);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.B = obtainStyledAttributes.getString(11);
        } else {
            this.B = context.getString(R.string.arg_res_0x7f130491);
        }
        if (obtainStyledAttributes.hasValue(17)) {
            this.D = obtainStyledAttributes.getString(17);
        } else {
            this.D = context.getString(R.string.arg_res_0x7f130497);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.f15897x = obtainStyledAttributes.getString(15);
        } else {
            this.f15897x = context.getString(R.string.arg_res_0x7f130495);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.C = obtainStyledAttributes.getString(21);
        } else {
            this.C = context.getString(R.string.arg_res_0x7f130498);
        }
        this.f15894u = new SimpleDateFormat(this.C, Locale.getDefault());
        obtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(z10 ? 0 : 8);
        this.f15868d.setText(isInEditMode() ? this.f15897x : this.f15896w);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
        try {
            if ((context instanceof u) && (supportFragmentManager = ((u) context).getSupportFragmentManager()) != null && supportFragmentManager.H().size() > 0) {
                k(new Date());
                return;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        String str = this.f15890q + context.getClass().getName();
        this.f15890q = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ClassicsHeader", 0);
        this.f15893t = sharedPreferences;
        k(new Date(sharedPreferences.getLong(str, System.currentTimeMillis())));
    }
}
