package pdf.pdfreader.viewer.editor.free.decrypt;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.h;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.ui.dialog.f0;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: DecryptAndCopyUIHelper.kt */
/* loaded from: classes3.dex */
public final class DecryptAndCopyUIHelper implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24217a;

    /* renamed from: b  reason: collision with root package name */
    public final List<PdfPreviewEntity> f24218b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final tf.c f24219d;

    /* renamed from: e  reason: collision with root package name */
    public final tf.c f24220e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, ReaderPDFCore> f24221f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f24222g;

    /* renamed from: h  reason: collision with root package name */
    public DecryptContainer f24223h;

    /* renamed from: i  reason: collision with root package name */
    public long f24224i;

    /* renamed from: j  reason: collision with root package name */
    public a f24225j;

    /* compiled from: DecryptAndCopyUIHelper.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: DecryptAndCopyUIHelper.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a(List<DecryptContainer> list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DecryptAndCopyUIHelper(Context context, List<? extends PdfPreviewEntity> list, b bVar) {
        kotlin.jvm.internal.g.e(context, ea.a.p("Mm8ldDJ4dA==", "ZqQKWLsn"));
        kotlin.jvm.internal.g.e(list, ea.a.p("Vm4_aQdpB3M=", "D00aq66x"));
        ea.a.p("P256bzpwGGU8ZQJMXXMjZVZlcg==", "pxP9WtFj");
        this.f24217a = context;
        this.f24218b = list;
        this.c = bVar;
        this.f24219d = kotlin.a.a(new cg.a<f0>() { // from class: pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper$inputPwdDialog$2
            {
                super(0);
            }

            @Override // cg.a
            public final f0 invoke() {
                DecryptAndCopyUIHelper decryptAndCopyUIHelper = DecryptAndCopyUIHelper.this;
                return new f0(decryptAndCopyUIHelper.f24217a, decryptAndCopyUIHelper);
            }
        });
        this.f24220e = kotlin.a.a(new cg.a<ReaderDecryptAndCopyExecutor>() { // from class: pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper$helper$2

            /* compiled from: DecryptAndCopyUIHelper.kt */
            /* loaded from: classes3.dex */
            public static final class a implements pdf.pdfreader.viewer.editor.free.decrypt.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ DecryptAndCopyUIHelper f24226a;

                public a(DecryptAndCopyUIHelper decryptAndCopyUIHelper) {
                    this.f24226a = decryptAndCopyUIHelper;
                }

                @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
                public final void a(DecryptContainer data) {
                    ViewGroup viewGroup;
                    kotlin.jvm.internal.g.e(data, "data");
                    DecryptAndCopyUIHelper decryptAndCopyUIHelper = this.f24226a;
                    decryptAndCopyUIHelper.f24223h = data;
                    DecryptAndCopyUIHelper.a aVar = decryptAndCopyUIHelper.f24225j;
                    if (aVar != null) {
                        aVar.a();
                    }
                    f0 e10 = decryptAndCopyUIHelper.e();
                    if (e10.f23531g) {
                        EditText editText = e10.f27550n;
                        if (editText != null) {
                            editText.setText("");
                        }
                        LinearLayout linearLayout = e10.f27552p;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                    }
                    f0 e11 = decryptAndCopyUIHelper.e();
                    Context context = decryptAndCopyUIHelper.f24217a;
                    String f10 = DecryptAndCopyUIHelper.f(context);
                    String name = data.getPdfPreviewEntity().getName();
                    kotlin.jvm.internal.g.d(name, ea.a.p("K2FFYVdwU2YKci92HGUfRVt0B3Q8LgthW2U=", "pKKd6hGx"));
                    e11.C(f10, DecryptAndCopyUIHelper.d(context, name), decryptAndCopyUIHelper.f24218b.size());
                    f0 e12 = decryptAndCopyUIHelper.e();
                    if (e12.isShowing()) {
                        e12.G = true;
                        if (e12.isShowing() && (viewGroup = e12.f27561y) != null && e12.f27560x != null) {
                            viewGroup.animate().cancel();
                            e12.f27560x.animate().cancel();
                            ValueAnimator valueAnimator = e12.I;
                            if (valueAnimator != null && valueAnimator.isRunning()) {
                                e12.I.cancel();
                            }
                            e12.f27561y.setAlpha(0.0f);
                            e12.f27560x.setAlpha(1.0f);
                            ViewParent parent = e12.s().getParent();
                            if (parent instanceof View) {
                                View view = (View) parent;
                                kotlin.jvm.internal.g.e(view, "<this>");
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = -2;
                                    view.setLayoutParams(layoutParams);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                            }
                            ViewGroup viewGroup2 = e12.f27560x;
                            kotlin.jvm.internal.g.e(viewGroup2, "<this>");
                            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.height = -2;
                                viewGroup2.setLayoutParams(layoutParams2);
                                TextView textView = e12.f27558v;
                                if (textView != null) {
                                    textView.setEnabled(true);
                                }
                                TextView textView2 = e12.f27559w;
                                if (textView2 != null) {
                                    textView2.setEnabled(true);
                                }
                                e12.J = false;
                                e12.K = false;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                        }
                        e12.g();
                    }
                }

                @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
                public final void b(int i10, int i11) {
                    TextView textView;
                    f0 e10 = this.f24226a.e();
                    if (e10.isShowing()) {
                        ProgressBar progressBar = e10.C;
                        if (progressBar != null) {
                            progressBar.setMax(i11);
                            e10.C.setProgress(i10);
                        }
                        TextView textView2 = e10.f27556t;
                        if (textView2 != null) {
                            textView2.setText(String.format(Locale.getDefault(), ea.a.p("amQUJQ==", "uNYF8lOl"), Integer.valueOf(i10)));
                        }
                        if (e10.E <= 90 && i10 >= 90 && (textView = e10.f27557u) != null) {
                            textView.setText(e10.getContext().getString(R.string.arg_res_0x7f130385));
                        }
                        e10.E = i10;
                    }
                }

                @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
                public final void c(ArrayList result) {
                    kotlin.jvm.internal.g.e(result, "result");
                    this.f24226a.e().A(result);
                }

                @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
                public final void d() {
                    this.f24226a.e().R0();
                }

                @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
                public final void onError(Throwable th2) {
                    DecryptAndCopyUIHelper decryptAndCopyUIHelper = this.f24226a;
                    f0 e10 = decryptAndCopyUIHelper.e();
                    if (e10.isShowing()) {
                        e10.B.removeCallbacksAndMessages(null);
                        e10.dismiss();
                    }
                    dp.a.a().getClass();
                    Context context = decryptAndCopyUIHelper.f24217a;
                    dp.a.d(context, th2);
                    j1.e(context, ea.a.p("V2UocgpwFiAUYV1sHHJl", "SsE1Usnv"), true, null, -1);
                    th2.printStackTrace();
                }
            }

            {
                super(0);
            }

            @Override // cg.a
            public final ReaderDecryptAndCopyExecutor invoke() {
                DecryptAndCopyUIHelper decryptAndCopyUIHelper = DecryptAndCopyUIHelper.this;
                Context context2 = decryptAndCopyUIHelper.f24217a;
                a aVar = new a(decryptAndCopyUIHelper);
                kotlin.jvm.internal.g.e(context2, "context");
                return new ReaderDecryptAndCopyExecutor(context2, aVar);
            }
        });
        this.f24221f = new HashMap<>();
        this.f24222g = new ArrayList();
    }

    public static SpannableString d(Context context, String str) {
        boolean z10;
        boolean z11;
        String concat = str.concat(".PDF");
        String string = context.getString(R.string.arg_res_0x7f1303c6);
        kotlin.jvm.internal.g.d(string, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpgYDsZRBfJ2E8c0ZvC2Rocj9xP2kHZQxfUWUdKQ==", "Xk2fcJbW"));
        String format = String.format(string, Arrays.copyOf(new Object[]{concat}, 1));
        int b10 = h.b("VW85bRJ0SnQaaUcsSSo3ciNzKQ==", "UStbOQf5", format);
        int i10 = 0;
        while (true) {
            if (i10 < b10) {
                char charAt = format.charAt(i10);
                kotlin.jvm.internal.g.e(concat, "<this>");
                if (concat.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (charAt == concat.charAt(0)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i10++;
                } else {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
            } else {
                i10 = -1;
                break;
            }
        }
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new TypefaceSpan(ea.a.p("GWEhcxVzPHIhZg==", "Q6jO8YHW")), i10, concat.length() + i10, 33);
        spannableString.setSpan(new StyleSpan(1), i10, concat.length() + i10, 33);
        spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(context, R.color.colorSurface)), i10, concat.length() + i10, 33);
        return spannableString;
    }

    public static String f(Context context) {
        String string = context.getString(R.string.arg_res_0x7f1303c5);
        kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpuIDsclxhVGVBXzthAHMVbwBka3IMcSNpNmVWKQ==", "ZJ90SxXl"));
        return string;
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.e
    public final void a(List<DecryptContainer> result) {
        kotlin.jvm.internal.g.e(result, "result");
        e().dismiss();
        this.c.a(result);
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.e
    public final void b() {
        tf.d dVar;
        Object obj;
        boolean z10;
        DecryptContainer decryptContainer = this.f24223h;
        if (decryptContainer != null) {
            ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) this.f24220e.getValue();
            long id2 = decryptContainer.getPdfPreviewEntity().getId();
            String B = e().B();
            kotlin.jvm.internal.g.d(B, ea.a.p("Wm47dQdQFWQ2aVVsBmd4YytuRmUodA==", "sQ45mWRv"));
            readerDecryptAndCopyExecutor.getClass();
            readerDecryptAndCopyExecutor.f24233h = true;
            Iterator it = readerDecryptAndCopyExecutor.f24230e.iterator();
            while (true) {
                dVar = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((DecryptContainer) obj).getPdfPreviewEntity().getId() == id2) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            DecryptContainer decryptContainer2 = (DecryptContainer) obj;
            if (decryptContainer2 != null) {
                decryptContainer2.setPassword(B);
                readerDecryptAndCopyExecutor.f24233h = false;
                dVar = tf.d.f30009a;
            }
            if (dVar == null) {
                readerDecryptAndCopyExecutor.w0(new IllegalArgumentException(ea.a.p("IW9FIB9pWWR6dCtyEmUcIHFlDXI8cBFDH24jYShuBnI=", "tMslpWAc")));
            }
        }
    }

    public final boolean c(String str, String str2) {
        HashMap<String, ReaderPDFCore> hashMap = this.f24221f;
        ReaderPDFCore readerPDFCore = hashMap.get(str);
        if (readerPDFCore != null) {
            return readerPDFCore.authenticatePassword(str2);
        }
        ReaderPDFCore readerPDFCore2 = new ReaderPDFCore(this.f24217a, str);
        hashMap.put(str, readerPDFCore2);
        return readerPDFCore2.authenticatePassword(str2);
    }

    public final f0 e() {
        return (f0) this.f24219d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        ArrayList arrayList;
        String str;
        Object obj;
        long j10;
        PdfPreviewEntity pdfPreviewEntity;
        PdfPreviewEntity pdfPreviewEntity2;
        boolean z10;
        boolean z11;
        EmptyList passwordList = EmptyList.INSTANCE;
        kotlin.jvm.internal.g.e(passwordList, "passwordList");
        List<PdfPreviewEntity> list = this.f24218b;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.f24222g;
                str = null;
                if (!hasNext) {
                    break;
                }
                PdfPreviewEntity pdfPreviewEntity3 = (PdfPreviewEntity) it.next();
                Iterator<E> it2 = passwordList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((DecryptContainer) next).getPdfPreviewEntity().getId() == pdfPreviewEntity3.getId()) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        str = next;
                        break;
                    }
                }
                DecryptContainer decryptContainer = (DecryptContainer) str;
                if (decryptContainer != null) {
                    try {
                        String path = pdfPreviewEntity3.getPath();
                        kotlin.jvm.internal.g.d(path, ea.a.p("Vm4_aQd5THATdGg=", "VVZajceg"));
                        if (c(path, decryptContainer.getPassword())) {
                            arrayList.add(new DecryptContainer(pdfPreviewEntity3, decryptContainer.getPassword(), null, 4, null));
                        } else {
                            arrayList.add(new DecryptContainer(pdfPreviewEntity3, null, null, 6, null));
                        }
                    } catch (Exception unused) {
                        arrayList.add(new DecryptContainer(pdfPreviewEntity3, null, null, 6, null));
                    }
                } else {
                    arrayList.add(new DecryptContainer(pdfPreviewEntity3, null, null, 6, null));
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (((DecryptContainer) obj).getPassword().length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            DecryptContainer decryptContainer2 = (DecryptContainer) obj;
            if (decryptContainer2 != null && (pdfPreviewEntity2 = decryptContainer2.getPdfPreviewEntity()) != null) {
                j10 = pdfPreviewEntity2.getId();
            } else {
                j10 = 0;
            }
            this.f24224i = j10;
            f0 e10 = e();
            pdf.pdfreader.viewer.editor.free.decrypt.b bVar = new pdf.pdfreader.viewer.editor.free.decrypt.b(this);
            e10.getClass();
            e10.f23532h = bVar;
            a aVar = this.f24225j;
            if (aVar != null) {
                aVar.b();
            }
            e().show();
            Context context = this.f24217a;
            if (decryptContainer2 == null) {
                f0 e11 = e();
                String f10 = f(context);
                DecryptContainer decryptContainer3 = (DecryptContainer) m.s0(arrayList);
                if (decryptContainer3 != null && (pdfPreviewEntity = decryptContainer3.getPdfPreviewEntity()) != null) {
                    str = pdfPreviewEntity.getName();
                }
                if (str == null) {
                    str = "";
                }
                e11.C(f10, d(context, str), list.size());
                ((ReaderDecryptAndCopyExecutor) this.f24220e.getValue()).a(arrayList);
            } else {
                f0 e12 = e();
                String f11 = f(context);
                String name = decryptContainer2.getPdfPreviewEntity().getName();
                kotlin.jvm.internal.g.d(name, ea.a.p("VWk5cwdOB2UWUFVzGnc5ciAuQmQgUDFlAGkqdxVuBGlHeWVuEm1l", "vOPpL577"));
                e12.C(f11, d(context, name), list.size());
            }
            w0.a().f28790a.execute(new androidx.activity.b(this, 26));
        }
    }
}
