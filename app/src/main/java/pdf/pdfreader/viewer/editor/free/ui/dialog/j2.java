package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import x0.d;
import x0.f0;

/* compiled from: PermissionRequiredDialog.java */
/* loaded from: classes3.dex */
public final class j2 extends oo.j implements View.OnClickListener {
    public final WeakReference<Context> c;

    /* renamed from: d  reason: collision with root package name */
    public int f27633d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f27634e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f27635f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f27636g;

    /* renamed from: h  reason: collision with root package name */
    public SpannableString f27637h;

    /* renamed from: i  reason: collision with root package name */
    public xn.b f27638i;

    /* compiled from: PermissionRequiredDialog.java */
    /* loaded from: classes3.dex */
    public class a implements x0.u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f27639a;

        public a(View view) {
            this.f27639a = view;
        }

        @Override // x0.u
        public final x0.s0 m(View view, x0.s0 s0Var) {
            List<Rect> emptyList;
            x0.d e10 = s0Var.f31498a.e();
            if (e10 != null) {
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.dp_20);
                if (Build.VERSION.SDK_INT >= 28) {
                    emptyList = d.a.b(e10.f31432a);
                } else {
                    emptyList = Collections.emptyList();
                }
                boolean isEmpty = emptyList.isEmpty();
                View view2 = this.f27639a;
                if (isEmpty) {
                    view2.setPadding(e10.a() + dimensionPixelSize, e10.c() + dimensionPixelSize, e10.b() + dimensionPixelSize, dimensionPixelSize);
                } else {
                    boolean z10 = false;
                    for (Rect rect : emptyList) {
                        if (rect.top == 0 && rect.bottom > 0) {
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(view.getContext())) {
                                if (rect.right < view.getContext().getResources().getDisplayMetrics().widthPixels / 2) {
                                    view2.setPadding(e10.a() + dimensionPixelSize, e10.c() + dimensionPixelSize, e10.b() + dimensionPixelSize, dimensionPixelSize);
                                }
                            } else if (rect.left > view.getContext().getResources().getDisplayMetrics().widthPixels / 2) {
                                view2.setPadding(e10.a() + dimensionPixelSize, e10.c() + dimensionPixelSize, e10.b() + dimensionPixelSize, dimensionPixelSize);
                            }
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        view2.setPadding(e10.a() + dimensionPixelSize, e10.c() + dimensionPixelSize, e10.b() + dimensionPixelSize, dimensionPixelSize);
                    }
                }
            }
            return s0Var;
        }
    }

    public j2(Context context) {
        super(context);
        this.f27633d = 0;
        this.f23548b = context;
        this.c = new WeakReference<>(context);
    }

    @Override // oo.j
    public final void a(View view) {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        wn.e.b(window);
        this.f27634e = (TextView) view.findViewById(R.id.tv_ok);
        this.f27635f = (TextView) view.findViewById(R.id.tv_sub);
        this.f27636g = (TextView) view.findViewById(R.id.tv_desc);
        this.f27634e.setOnClickListener(this);
        View findViewById = view.findViewById(R.id.tv_later);
        findViewById.setOnClickListener(this);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        d();
        if (window != null) {
            View decorView = window.getDecorView();
            a aVar = new a(findViewById);
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.u(decorView, aVar);
        }
    }

    public final void b() {
        View inflate = LayoutInflater.from(this.f23548b).inflate(R.layout.dialog_permission_required, (ViewGroup) null);
        this.f23547a = inflate;
        setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        a(this.f23547a);
    }

    public final void c(int i10) {
        this.f27633d = i10;
        if (this.f23547a != null) {
            d();
        }
    }

    public final void d() {
        if (this.f23548b == null) {
            WeakReference<Context> weakReference = this.c;
            if (weakReference != null && weakReference.get() != null) {
                this.f23548b = weakReference.get();
            } else {
                this.f23548b = getContext();
            }
        }
        if (this.f23548b == null) {
            cancel();
            return;
        }
        SpannableString spannableString = this.f27637h;
        if (spannableString == null || spannableString.length() <= 0) {
            String string = this.f23548b.getString(R.string.arg_res_0x7f13036c);
            String string2 = this.f23548b.getString(R.string.arg_res_0x7f130368, string);
            this.f27637h = new SpannableString(string2);
            int indexOf = string2.toString().indexOf(string);
            this.f27637h.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this.f23548b, R.color.colorAccent)), indexOf, string.length() + indexOf, 17);
        }
        int i10 = this.f27633d;
        if (i10 == 0) {
            this.f27636g.setVisibility(8);
            this.f27634e.setText(this.f23548b.getString(R.string.arg_res_0x7f130364));
            this.f27635f.setText(this.f27637h);
        } else if (i10 == 1) {
            this.f27636g.setVisibility(8);
            TextView textView = this.f27636g;
            Context context = this.f23548b;
            textView.setText(context.getString(R.string.arg_res_0x7f1303c8, context.getString(R.string.arg_res_0x7f13039d)));
            this.f27636g.setVisibility(0);
            this.f27634e.setText(this.f23548b.getString(R.string.arg_res_0x7f13039d));
            this.f27635f.setText(this.f27637h);
        } else if (i10 == 2) {
            this.f27636g.setVisibility(8);
            this.f27634e.setText(this.f23548b.getString(R.string.arg_res_0x7f130364));
            this.f27635f.setText(this.f27637h);
        }
    }

    @Override // oo.j, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            Window window = getWindow();
            if (window != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.i.e(window);
            }
        } catch (Exception unused) {
        }
        super.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.tv_later) {
            xn.b bVar = this.f27638i;
            if (bVar != null) {
                bVar.b();
            }
            cancel();
        } else if (view.getId() == R.id.tv_ok) {
            xn.b bVar2 = this.f27638i;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (!pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
                cancel();
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            wn.e.b(getWindow());
        }
    }

    @Override // oo.j, android.app.Dialog
    public final void show() {
        boolean z10;
        if (this.f23547a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.show();
        androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
        if (wn.b.f31388d) {
            EventCenter.c(getContext());
        }
        if (z10) {
            b();
        }
    }
}
