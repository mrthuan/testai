package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import l.p;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final c K;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1869a;

    /* renamed from: b  reason: collision with root package name */
    public final p f1870b;
    public final Window c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1871d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1872e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1873f;

    /* renamed from: g  reason: collision with root package name */
    public RecycleListView f1874g;

    /* renamed from: h  reason: collision with root package name */
    public View f1875h;

    /* renamed from: i  reason: collision with root package name */
    public int f1876i;

    /* renamed from: k  reason: collision with root package name */
    public Button f1878k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1879l;

    /* renamed from: m  reason: collision with root package name */
    public Message f1880m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f1881n;

    /* renamed from: o  reason: collision with root package name */
    public Button f1882o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f1883p;

    /* renamed from: q  reason: collision with root package name */
    public Message f1884q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f1885r;

    /* renamed from: s  reason: collision with root package name */
    public Button f1886s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f1887t;

    /* renamed from: u  reason: collision with root package name */
    public Message f1888u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f1889v;

    /* renamed from: w  reason: collision with root package name */
    public NestedScrollView f1890w;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f1892y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f1893z;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1877j = false;

    /* renamed from: x  reason: collision with root package name */
    public int f1891x = 0;
    public int E = -1;
    public final a L = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        public final int f1894a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1895b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f19449v);
            this.f1895b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f1894a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f1878k && (message4 = alertController.f1880m) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f1882o && (message3 = alertController.f1884q) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f1886s && (message2 = alertController.f1888u) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            alertController.K.obtainMessage(1, alertController.f1870b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1897a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f1898b;
        public Drawable c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f1899d;

        /* renamed from: e  reason: collision with root package name */
        public View f1900e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f1901f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f1902g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f1903h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f1904i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f1905j;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnKeyListener f1907l;

        /* renamed from: m  reason: collision with root package name */
        public CharSequence[] f1908m;

        /* renamed from: n  reason: collision with root package name */
        public ListAdapter f1909n;

        /* renamed from: o  reason: collision with root package name */
        public DialogInterface.OnClickListener f1910o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1911p;

        /* renamed from: q  reason: collision with root package name */
        public int f1912q = -1;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1906k = true;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f1897a = contextThemeWrapper;
            this.f1898b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DialogInterface> f1913a;

        public c(DialogInterface dialogInterface) {
            this.f1913a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != -3 && i10 != -2 && i10 != -1) {
                if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.f1913a.get(), message.what);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, CharSequence[] charSequenceArr) {
            super(context, i10, 16908308, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.f1869a = context;
        this.f1870b = pVar;
        this.c = window;
        this.K = new c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, k.a.f19433f, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.f1871d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        pVar.p().x(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.K.obtainMessage(i10, onClickListener);
        } else {
            message = null;
        }
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 == -1) {
                    this.f1879l = charSequence;
                    this.f1880m = message;
                    this.f1881n = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1883p = charSequence;
            this.f1884q = message;
            this.f1885r = null;
            return;
        }
        this.f1887t = charSequence;
        this.f1888u = message;
        this.f1889v = null;
    }
}
