package com.afollestad.materialdialogs;

import a6.h;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c3.d;
import com.afollestad.materialdialogs.a;
import com.afollestad.materialdialogs.internal.MDButton;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.NumberFormat;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public final class MaterialDialog extends b3.a implements View.OnClickListener, a.c {
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f5930d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f5931e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f5932f;

    /* renamed from: g  reason: collision with root package name */
    public EditText f5933g;

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f5934h;

    /* renamed from: i  reason: collision with root package name */
    public View f5935i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f5936j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f5937k;

    /* renamed from: l  reason: collision with root package name */
    public CheckBox f5938l;

    /* renamed from: m  reason: collision with root package name */
    public MDButton f5939m;

    /* renamed from: n  reason: collision with root package name */
    public MDButton f5940n;

    /* renamed from: o  reason: collision with root package name */
    public MDButton f5941o;

    /* renamed from: p  reason: collision with root package name */
    public ListType f5942p;

    /* loaded from: classes.dex */
    public static class DialogException extends WindowManager.BadTokenException {
        public DialogException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public enum ListType {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(ListType listType) {
            int i10 = a.f5945b[listType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return R.layout.md_listitem_multichoice;
                    }
                    throw new IllegalArgumentException("Not a valid list type");
                }
                return R.layout.md_listitem_singlechoice;
            }
            return R.layout.md_listitem;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5944a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5945b;

        static {
            int[] iArr = new int[ListType.values().length];
            f5945b = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5945b[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5945b[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            f5944a = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5944a[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5944a[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public boolean A;
        public boolean B;
        public boolean C;

        /* renamed from: a  reason: collision with root package name */
        public final Context f5946a;

        /* renamed from: b  reason: collision with root package name */
        public GravityEnum f5947b;
        public GravityEnum c;

        /* renamed from: d  reason: collision with root package name */
        public GravityEnum f5948d;

        /* renamed from: e  reason: collision with root package name */
        public GravityEnum f5949e;

        /* renamed from: f  reason: collision with root package name */
        public GravityEnum f5950f;

        /* renamed from: g  reason: collision with root package name */
        public final int f5951g;

        /* renamed from: h  reason: collision with root package name */
        public int f5952h;

        /* renamed from: i  reason: collision with root package name */
        public int f5953i;

        /* renamed from: j  reason: collision with root package name */
        public View f5954j;

        /* renamed from: k  reason: collision with root package name */
        public int f5955k;

        /* renamed from: l  reason: collision with root package name */
        public ColorStateList f5956l;

        /* renamed from: m  reason: collision with root package name */
        public ColorStateList f5957m;

        /* renamed from: n  reason: collision with root package name */
        public ColorStateList f5958n;

        /* renamed from: o  reason: collision with root package name */
        public ColorStateList f5959o;

        /* renamed from: p  reason: collision with root package name */
        public Theme f5960p;

        /* renamed from: q  reason: collision with root package name */
        public int f5961q;

        /* renamed from: r  reason: collision with root package name */
        public Typeface f5962r;

        /* renamed from: s  reason: collision with root package name */
        public Typeface f5963s;

        /* renamed from: t  reason: collision with root package name */
        public com.afollestad.materialdialogs.a f5964t;

        /* renamed from: u  reason: collision with root package name */
        public LinearLayoutManager f5965u;

        /* renamed from: v  reason: collision with root package name */
        public DialogInterface.OnDismissListener f5966v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f5967w;

        /* renamed from: x  reason: collision with root package name */
        public int f5968x;

        /* renamed from: y  reason: collision with root package name */
        public int f5969y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f5970z;

        public b(Context context) {
            GravityEnum gravityEnum = GravityEnum.START;
            this.f5947b = gravityEnum;
            this.c = gravityEnum;
            this.f5948d = GravityEnum.END;
            this.f5949e = gravityEnum;
            this.f5950f = gravityEnum;
            this.f5951g = 0;
            this.f5952h = -1;
            this.f5953i = -1;
            Theme theme = Theme.LIGHT;
            this.f5960p = theme;
            this.f5961q = -1;
            this.f5970z = false;
            this.A = false;
            this.B = false;
            this.C = false;
            this.f5946a = context;
            int g10 = d3.b.g(context, R.attr.colorAccent, androidx.core.content.a.getColor(context, R.color.md_material_blue_600));
            this.f5955k = g10;
            int g11 = d3.b.g(context, 16843829, g10);
            this.f5955k = g11;
            this.f5956l = d3.b.c(context, g11);
            this.f5957m = d3.b.c(context, this.f5955k);
            this.f5958n = d3.b.c(context, this.f5955k);
            this.f5959o = d3.b.c(context, d3.b.g(context, R.attr.md_link_color, this.f5955k));
            this.f5951g = d3.b.g(context, R.attr.md_btn_ripple_color, d3.b.g(context, R.attr.colorControlHighlight, d3.b.g(context, 16843820, 0)));
            NumberFormat.getPercentInstance();
            this.f5960p = d3.b.d(d3.b.g(context, 16842806, 0)) ? theme : Theme.DARK;
            d dVar = d.f5514f;
            if (dVar != null) {
                if (dVar == null) {
                    d.f5514f = new d();
                }
                d dVar2 = d.f5514f;
                dVar2.getClass();
                this.f5947b = dVar2.f5515a;
                this.c = dVar2.f5516b;
                this.f5948d = dVar2.c;
                this.f5949e = dVar2.f5517d;
                this.f5950f = dVar2.f5518e;
            }
            this.f5947b = d3.b.i(context, R.attr.md_title_gravity, this.f5947b);
            this.c = d3.b.i(context, R.attr.md_content_gravity, this.c);
            this.f5948d = d3.b.i(context, R.attr.md_btnstacked_gravity, this.f5948d);
            this.f5949e = d3.b.i(context, R.attr.md_items_gravity, this.f5949e);
            this.f5950f = d3.b.i(context, R.attr.md_buttons_gravity, this.f5950f);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.md_medium_font, typedValue, true);
            String str = (String) typedValue.string;
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.md_regular_font, typedValue2, true);
            try {
                a(str, (String) typedValue2.string);
            } catch (Throwable unused) {
            }
            if (this.f5963s == null) {
                try {
                    this.f5963s = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.f5963s = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f5962r == null) {
                try {
                    this.f5962r = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f5962r = typeface;
                    if (typeface == null) {
                        this.f5962r = Typeface.DEFAULT;
                    }
                }
            }
        }

        public final void a(String str, String str2) {
            Context context = this.f5946a;
            if (str != null && !str.trim().isEmpty()) {
                Typeface a10 = d3.c.a(context, str);
                this.f5963s = a10;
                if (a10 == null) {
                    throw new IllegalArgumentException(h.d("No font asset found for \"", str, OperatorName.SHOW_TEXT_LINE_AND_SPACE));
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface a11 = d3.c.a(context, str2);
                this.f5962r = a11;
                if (a11 == null) {
                    throw new IllegalArgumentException(h.d("No font asset found for \"", str2, OperatorName.SHOW_TEXT_LINE_AND_SPACE));
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialDialog(com.afollestad.materialdialogs.MaterialDialog.b r18) {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.MaterialDialog.<init>(com.afollestad.materialdialogs.MaterialDialog$b):void");
    }

    public static void e(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    public final Drawable c(DialogAction dialogAction, boolean z10) {
        b bVar = this.c;
        if (z10) {
            bVar.getClass();
            Drawable h10 = d3.b.h(bVar.f5946a, R.attr.md_btn_stacked_selector);
            if (h10 != null) {
                return h10;
            }
            return d3.b.h(getContext(), R.attr.md_btn_stacked_selector);
        }
        int i10 = a.f5944a[dialogAction.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                bVar.getClass();
                Drawable h11 = d3.b.h(bVar.f5946a, R.attr.md_btn_positive_selector);
                if (h11 != null) {
                    return h11;
                }
                Drawable h12 = d3.b.h(getContext(), R.attr.md_btn_positive_selector);
                if (h12 instanceof RippleDrawable) {
                    ((RippleDrawable) h12).setColor(ColorStateList.valueOf(bVar.f5951g));
                }
                return h12;
            }
            bVar.getClass();
            Drawable h13 = d3.b.h(bVar.f5946a, R.attr.md_btn_negative_selector);
            if (h13 != null) {
                return h13;
            }
            Drawable h14 = d3.b.h(getContext(), R.attr.md_btn_negative_selector);
            if (h14 instanceof RippleDrawable) {
                ((RippleDrawable) h14).setColor(ColorStateList.valueOf(bVar.f5951g));
            }
            return h14;
        }
        bVar.getClass();
        Drawable h15 = d3.b.h(bVar.f5946a, R.attr.md_btn_neutral_selector);
        if (h15 != null) {
            return h15;
        }
        Drawable h16 = d3.b.h(getContext(), R.attr.md_btn_neutral_selector);
        if (h16 instanceof RippleDrawable) {
            ((RippleDrawable) h16).setColor(ColorStateList.valueOf(bVar.f5951g));
        }
        return h16;
    }

    public final boolean d(View view, int i10, boolean z10) {
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.f5942p;
        b bVar = this.c;
        if (listType != null && listType != ListType.REGULAR) {
            if (listType == ListType.MULTI) {
                if (!((CheckBox) view.findViewById(R.id.md_control)).isEnabled()) {
                    return false;
                }
                throw null;
            } else if (listType == ListType.SINGLE) {
                if (!((RadioButton) view.findViewById(R.id.md_control)).isEnabled()) {
                    return false;
                }
                int i11 = bVar.f5961q;
                dismiss();
                bVar.f5961q = i10;
                bVar.getClass();
                return true;
            } else {
                return true;
            }
        }
        bVar.getClass();
        dismiss();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        EditText editText = this.f5933g;
        if (editText != null && editText != null && (inputMethodManager = (InputMethodManager) this.c.f5946a.getSystemService("input_method")) != null) {
            View currentFocus = getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = this.f5321a;
            }
            IBinder windowToken = currentFocus.getWindowToken();
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        super.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = a.f5944a[((DialogAction) view.getTag()).ordinal()];
        b bVar = this.c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    bVar.getClass();
                    bVar.getClass();
                    bVar.getClass();
                    dismiss();
                }
            } else {
                bVar.getClass();
                cancel();
            }
        } else {
            bVar.getClass();
            dismiss();
        }
        bVar.getClass();
    }

    @Override // b3.a, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        EditText editText = this.f5933g;
        if (editText != null) {
            if (editText != null) {
                editText.post(new d3.a(this, this.c));
            }
            if (this.f5933g.getText().length() > 0) {
                EditText editText2 = this.f5933g;
                editText2.setSelection(editText2.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f5931e.setText(charSequence);
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        setTitle(this.c.f5946a.getString(i10));
    }
}
