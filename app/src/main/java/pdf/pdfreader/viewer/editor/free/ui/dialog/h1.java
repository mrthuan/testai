package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: PdfListSortDialog.java */
/* loaded from: classes3.dex */
public final class h1 extends oo.g implements View.OnClickListener {
    public AppCompatImageView A;
    public AppCompatImageView B;
    public AppCompatImageView C;
    public AppCompatImageView D;
    public AppCompatImageView E;
    public AppCompatImageView F;
    public no.e G;
    public final Locale H;

    /* renamed from: y  reason: collision with root package name */
    public final WeakReference<Context> f27614y;

    /* renamed from: z  reason: collision with root package name */
    public final a f27615z;

    /* compiled from: PdfListSortDialog.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    static {
        ea.a.p("Y2QtTBpzFlMdckBEAGE6b2c=", "5B7wMLIs");
    }

    public h1(Context context, a aVar, int i10, no.e eVar) {
        super(context);
        this.H = pdf.pdfreader.viewer.editor.free.utils.a0.d(context);
        this.f27615z = aVar;
        this.f27614y = new WeakReference<>(context);
        no.e eVar2 = new no.e();
        this.G = eVar2;
        eVar2.f22616a = eVar.a();
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    public final void H(no.e eVar) {
        Context context;
        WeakReference<Context> weakReference = this.f27614y;
        if (weakReference != null && weakReference.get() != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        if (context == null) {
            return;
        }
        int a10 = eVar.a();
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        switch (a10) {
            case 11:
                this.C.setVisibility(0);
                return;
            case 12:
                this.D.setVisibility(0);
                return;
            case 13:
                this.B.setVisibility(0);
                return;
            case 14:
                this.A.setVisibility(0);
                return;
            case 15:
                this.E.setVisibility(0);
                return;
            case 16:
                this.F.setVisibility(0);
                return;
            default:
                return;
        }
    }

    public final void I(int i10, no.e eVar) {
        Locale locale;
        LocaleList locales;
        if (this.G == null) {
            this.G = new no.e();
        }
        this.G.f22616a = eVar.a();
        Context context = this.f27614y.get();
        String[] strArr = pdf.pdfreader.viewer.editor.free.utils.a0.f28530a;
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            Locale locale2 = this.H;
            if (locale2 != locale) {
                if (locale != null) {
                    String p10 = ea.a.p("f2ElZwZhBWUndF1scw==", "MSSBMgtT");
                    o9.d.s(p10, ea.a.p("LGhUYxJBWWQIZTllAUwGZw8g", "uCbwQuUU") + locale2.getDisplayName() + ea.a.p("by0g", "iMkmYn4T") + locale.getDisplayName());
                }
                pdf.pdfreader.viewer.editor.free.utils.a0.a(context, false);
            }
        }
        if (this.f23541s) {
            H(this.G);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String p10;
        switch (view.getId()) {
            case R.id.dia_main_sort_cancel /* 2131362436 */:
                cancel();
                return;
            case R.id.dia_main_sort_ok /* 2131362437 */:
                a aVar = this.f27615z;
                if (aVar != null) {
                    no.e eVar = this.G;
                    ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) aVar;
                    if (no.f.b(readerHomeActivity).f22632f.a() != eVar.a()) {
                        no.e eVar2 = no.f.b(readerHomeActivity).f22632f;
                        eVar2.getClass();
                        eVar2.f22616a = eVar.a();
                        no.f.b(readerHomeActivity).i(readerHomeActivity);
                        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar2 = readerHomeActivity.M;
                        if (aVar2 != null) {
                            aVar2.H0();
                            pdf.pdfreader.viewer.editor.free.ui.frag.n F0 = readerHomeActivity.M.F0();
                            if (F0 != null) {
                                F0.b1();
                            }
                        }
                    }
                    if (readerHomeActivity.M != null) {
                        switch (eVar.a()) {
                            case 11:
                                p10 = ea.a.p("IWFcZSZheg==", "48M8QgM2");
                                break;
                            case 12:
                                p10 = ea.a.p("XWEmZSx6YQ==", "Tdt79V5c");
                                break;
                            case 13:
                                p10 = ea.a.p("X2E4dCxvbg==", "Q5lm7bxU");
                                break;
                            case 14:
                                p10 = ea.a.p("I2FCdCZubw==", "mUe2dKEo");
                                break;
                            case 15:
                                p10 = ea.a.p("QGkxZSxscw==", "h5dHD7Y4");
                                break;
                            case 16:
                                p10 = ea.a.p("FGkvZRdzbA==", "tNgUHos7");
                                break;
                            default:
                                p10 = "";
                                break;
                        }
                        String p11 = ea.a.p("QG85dA==", "icbayLdO");
                        String p12 = ea.a.p("QG85dCxvCV8RbF1jaw==", "42A5Q1C8");
                        StringBuilder k10 = a0.a.k(p10);
                        k10.append(ea.a.p("Xw==", "EW13bQ36"));
                        k10.append(aj.b.t(readerHomeActivity.M.f28014t0));
                        tn.a.d(readerHomeActivity, p11, p12, k10.toString(), false);
                    }
                }
                cancel();
                return;
            case R.id.last_modified_new_to_old /* 2131363025 */:
                if (this.G.a() != 14) {
                    no.e eVar3 = this.G;
                    eVar3.f22616a = 14;
                    H(eVar3);
                    return;
                }
                return;
            case R.id.last_modified_old_to_new /* 2131363026 */:
                if (this.G.a() != 13) {
                    no.e eVar4 = this.G;
                    eVar4.f22616a = 13;
                    H(eVar4);
                    return;
                }
                return;
            case R.id.name_a_z /* 2131363295 */:
                if (this.G.a() != 11) {
                    no.e eVar5 = this.G;
                    eVar5.f22616a = 11;
                    H(eVar5);
                    return;
                }
                return;
            case R.id.name_z_a /* 2131363297 */:
                if (this.G.a() != 12) {
                    no.e eVar6 = this.G;
                    eVar6.f22616a = 12;
                    H(eVar6);
                    return;
                }
                return;
            case R.id.size_large_to_small /* 2131364037 */:
                if (this.G.a() != 15) {
                    no.e eVar7 = this.G;
                    eVar7.f22616a = 15;
                    H(eVar7);
                    return;
                }
                return;
            case R.id.size_small_to_large /* 2131364039 */:
                if (this.G.a() != 16) {
                    no.e eVar8 = this.G;
                    eVar8.f22616a = 16;
                    H(eVar8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.pdf_list_sort_dialog;
    }

    @Override // oo.g
    public final void z() {
        Context context;
        View x4 = x();
        this.A = (AppCompatImageView) x4.findViewById(R.id.select_new_to_old);
        this.B = (AppCompatImageView) x4.findViewById(R.id.select_old_to_new);
        this.C = (AppCompatImageView) x4.findViewById(R.id.select_name_a_z);
        this.D = (AppCompatImageView) x4.findViewById(R.id.select_z_a);
        this.E = (AppCompatImageView) x4.findViewById(R.id.select_size_large_to_small);
        this.F = (AppCompatImageView) x4.findViewById(R.id.select_size_small_to_large);
        TextView textView = (TextView) x4.findViewById(R.id.tv_new_to_old_bottom);
        TextView textView2 = (TextView) x4.findViewById(R.id.tv_old_to_new_bottom);
        TextView textView3 = (TextView) x4.findViewById(R.id.tv_a_z_bottom);
        TextView textView4 = (TextView) x4.findViewById(R.id.tv_z_a_bottom);
        TextView textView5 = (TextView) x4.findViewById(R.id.tv_size_large_to_small_bottom);
        TextView textView6 = (TextView) x4.findViewById(R.id.tv_size_small_to_large_bottom);
        WeakReference<Context> weakReference = this.f27614y;
        if (weakReference != null && weakReference.get() != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        if (context != null) {
            String p10 = ea.a.p("KA==", "8Aiamjri");
            String p11 = ea.a.p("KQ==", "pgsIob7q");
            StringBuilder sb2 = new StringBuilder(p10);
            sb2.append(context.getResources().getString(R.string.arg_res_0x7f130398));
            sb2.append(p11);
            textView.setText(sb2.toString());
            sb2.delete(0, sb2.length());
            sb2.append(p10);
            sb2.append(context.getResources().getString(R.string.arg_res_0x7f130399));
            sb2.append(p11);
            textView2.setText(sb2.toString());
            sb2.delete(0, sb2.length());
            sb2.append(p10);
            sb2.append(context.getResources().getString(R.string.arg_res_0x7f1303f3));
            sb2.append(p11);
            textView3.setText(sb2.toString());
            sb2.delete(0, sb2.length());
            sb2.append(p10);
            sb2.append(context.getResources().getString(R.string.arg_res_0x7f1303f5));
            sb2.append(p11);
            textView4.setText(sb2.toString());
            sb2.delete(0, sb2.length());
            sb2.append(p10);
            sb2.append(context.getResources().getString(R.string.arg_res_0x7f1303f6));
            sb2.append(p11);
            textView5.setText(sb2.toString());
            sb2.delete(0, sb2.length());
            sb2.append(p10);
            sb2.append(context.getResources().getString(R.string.arg_res_0x7f1303f7));
            sb2.append(p11);
            textView6.setText(sb2.toString());
        }
        View x10 = x();
        x10.findViewById(R.id.last_modified_new_to_old).setOnClickListener(this);
        x10.findViewById(R.id.last_modified_old_to_new).setOnClickListener(this);
        x10.findViewById(R.id.name_a_z).setOnClickListener(this);
        x10.findViewById(R.id.name_z_a).setOnClickListener(this);
        x10.findViewById(R.id.dia_main_sort_cancel).setOnClickListener(this);
        x10.findViewById(R.id.dia_main_sort_ok).setOnClickListener(this);
        H(this.G);
        x10.findViewById(R.id.size_large_to_small).setOnClickListener(this);
        x10.findViewById(R.id.size_small_to_large).setOnClickListener(this);
    }
}
