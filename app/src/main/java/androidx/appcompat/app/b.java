package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import l.p;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class b extends p implements DialogInterface {

    /* renamed from: f  reason: collision with root package name */
    public final AlertController f1917f;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f1918a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1919b;

        public a(Context context) {
            this(context, b.r(context, 0));
        }

        public final b a() {
            int i10;
            AlertController.b bVar = this.f1918a;
            b bVar2 = new b(bVar.f1897a, this.f1919b);
            View view = bVar.f1900e;
            AlertController alertController = bVar2.f1917f;
            if (view != null) {
                alertController.C = view;
            } else {
                CharSequence charSequence = bVar.f1899d;
                if (charSequence != null) {
                    alertController.f1872e = charSequence;
                    TextView textView = alertController.A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.f1892y = drawable;
                    alertController.f1891x = 0;
                    ImageView imageView = alertController.f1893z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f1893z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f1901f;
            if (charSequence2 != null) {
                alertController.f1873f = charSequence2;
                TextView textView2 = alertController.B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f1902g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar.f1903h);
            }
            CharSequence charSequence4 = bVar.f1904i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar.f1905j);
            }
            if (bVar.f1908m != null || bVar.f1909n != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f1898b.inflate(alertController.G, (ViewGroup) null);
                if (bVar.f1911p) {
                    i10 = alertController.H;
                } else {
                    i10 = alertController.I;
                }
                ListAdapter listAdapter = bVar.f1909n;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f1897a, i10, bVar.f1908m);
                }
                alertController.D = listAdapter;
                alertController.E = bVar.f1912q;
                if (bVar.f1910o != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar, alertController));
                }
                if (bVar.f1911p) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f1874g = recycleListView;
            }
            bVar2.setCancelable(bVar.f1906k);
            if (bVar.f1906k) {
                bVar2.setCanceledOnTouchOutside(true);
            }
            bVar2.setOnCancelListener(null);
            bVar2.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = bVar.f1907l;
            if (onKeyListener != null) {
                bVar2.setOnKeyListener(onKeyListener);
            }
            return bVar2;
        }

        public a(Context context, int i10) {
            this.f1918a = new AlertController.b(new ContextThemeWrapper(context, b.r(context, i10)));
            this.f1919b = i10;
        }
    }

    public b(Context context, int i10) {
        super(context, r(context, i10));
        this.f1917f = new AlertController(getContext(), this, getWindow());
    }

    public static int r(Context context, int i10) {
        if (((i10 >>> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // l.p, androidx.activity.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        View view;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        ListAdapter listAdapter;
        int i11;
        int i12;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.f1917f;
        alertController.f1870b.setContentView(alertController.F);
        Window window = alertController.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view2 = alertController.f1875h;
        int i13 = 0;
        Context context = alertController.f1869a;
        if (view2 == null) {
            if (alertController.f1876i != 0) {
                view2 = LayoutInflater.from(context).inflate(alertController.f1876i, viewGroup, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !AlertController.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f1877j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f1874g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c = AlertController.c(findViewById7, findViewById4);
        ViewGroup c10 = AlertController.c(findViewById8, findViewById5);
        ViewGroup c11 = AlertController.c(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.f1890w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f1890w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c10.findViewById(16908299);
        alertController.B = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f1873f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f1890w.removeView(alertController.B);
                if (alertController.f1874g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f1890w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f1890w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f1874g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c10.setVisibility(8);
                }
            }
        }
        Button button = (Button) c11.findViewById(16908313);
        alertController.f1878k = button;
        AlertController.a aVar = alertController.L;
        button.setOnClickListener(aVar);
        boolean isEmpty = TextUtils.isEmpty(alertController.f1879l);
        int i14 = alertController.f1871d;
        if (isEmpty && alertController.f1881n == null) {
            alertController.f1878k.setVisibility(8);
            z11 = false;
        } else {
            alertController.f1878k.setText(alertController.f1879l);
            Drawable drawable = alertController.f1881n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i14, i14);
                alertController.f1878k.setCompoundDrawables(alertController.f1881n, null, null, null);
            }
            alertController.f1878k.setVisibility(0);
            z11 = true;
        }
        Button button2 = (Button) c11.findViewById(16908314);
        alertController.f1882o = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f1883p) && alertController.f1885r == null) {
            alertController.f1882o.setVisibility(8);
        } else {
            alertController.f1882o.setText(alertController.f1883p);
            Drawable drawable2 = alertController.f1885r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i14, i14);
                alertController.f1882o.setCompoundDrawables(alertController.f1885r, null, null, null);
            }
            alertController.f1882o.setVisibility(0);
            z11 |= true;
        }
        Button button3 = (Button) c11.findViewById(16908315);
        alertController.f1886s = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f1887t) && alertController.f1889v == null) {
            alertController.f1886s.setVisibility(8);
            view = null;
        } else {
            alertController.f1886s.setText(alertController.f1887t);
            Drawable drawable3 = alertController.f1889v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i14, i14);
                view = null;
                alertController.f1886s.setCompoundDrawables(alertController.f1889v, null, null, null);
            } else {
                view = null;
            }
            alertController.f1886s.setVisibility(0);
            z11 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z11) {
                AlertController.b(alertController.f1878k);
            } else if (z11) {
                AlertController.b(alertController.f1882o);
            } else if (z11) {
                AlertController.b(alertController.f1886s);
            }
        }
        if (z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            c11.setVisibility(8);
        }
        if (alertController.C != null) {
            c.addView(alertController.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f1893z = (ImageView) window.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f1872e)) && alertController.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.A = textView2;
                textView2.setText(alertController.f1872e);
                int i15 = alertController.f1891x;
                if (i15 != 0) {
                    alertController.f1893z.setImageResource(i15);
                } else {
                    Drawable drawable4 = alertController.f1892y;
                    if (drawable4 != null) {
                        alertController.f1893z.setImageDrawable(drawable4);
                    } else {
                        alertController.A.setPadding(alertController.f1893z.getPaddingLeft(), alertController.f1893z.getPaddingTop(), alertController.f1893z.getPaddingRight(), alertController.f1893z.getPaddingBottom());
                        alertController.f1893z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.f1893z.setVisibility(8);
                c.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c != null && c.getVisibility() != 8) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (c11.getVisibility() != 8) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15 && (findViewById2 = c10.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f1890w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f1873f == null && alertController.f1874g == null) {
                findViewById = view;
            } else {
                findViewById = c.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = c10.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f1874g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z15 || i10 == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i10 != 0) {
                    i11 = recycleListView.getPaddingTop();
                } else {
                    i11 = recycleListView.f1894a;
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (z15) {
                    i12 = recycleListView.getPaddingBottom();
                } else {
                    i12 = recycleListView.f1895b;
                }
                recycleListView.setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
        if (!z14) {
            View view3 = alertController.f1874g;
            if (view3 == null) {
                view3 = alertController.f1890w;
            }
            if (view3 != null) {
                if (z15) {
                    i13 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.j.d(view3, i10 | i13, 3);
                if (findViewById11 != null) {
                    c10.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c10.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f1874g;
        if (recycleListView2 != null && (listAdapter = alertController.D) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i16 = alertController.E;
            if (i16 > -1) {
                recycleListView2.setItemChecked(i16, true);
                recycleListView2.setSelection(i16);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f1917f.f1890w;
        if (nestedScrollView != null && nestedScrollView.d(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f1917f.f1890w;
        if (nestedScrollView != null && nestedScrollView.d(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // l.p, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f1917f;
        alertController.f1872e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
