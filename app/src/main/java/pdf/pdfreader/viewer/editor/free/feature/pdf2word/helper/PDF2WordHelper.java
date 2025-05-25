package pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.appcompat.libconvert.c;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.lifecycle.w;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import tf.d;

/* compiled from: PDF2WordHelper.kt */
/* loaded from: classes3.dex */
public final class PDF2WordHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f25574a;

    /* renamed from: b  reason: collision with root package name */
    public static int f25575b;
    public static b c;

    /* renamed from: d  reason: collision with root package name */
    public static int f25576d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f25577e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicBoolean f25578f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f25579g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f25580h;

    /* renamed from: i  reason: collision with root package name */
    public static OperatePdfFailedDialog f25581i;

    /* compiled from: PDF2WordHelper.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static void a(final Activity activity) {
            if (activity != null) {
                Companion companion = PDF2WordHelper.f25574a;
                String string = activity.getString(R.string.arg_res_0x7f1302ce);
                g.d(string, ea.a.p("EW88dFJ4Pi4vZRJTQHI-bl8oAC46dERpGmdfbj50HWUcbydnX185cCljAyk=", "N8rR7JAX"));
                String string2 = activity.getString(R.string.arg_res_0x7f13010a);
                g.d(string2, ea.a.p("MW8ldAp4GC4vZRJTQHI-bl8oAC46dERpGmdfZD53LGw9YS9fCWEFbC1kOWRRcyk=", "u6RKolqf"));
                cg.a<d> aVar = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion$showMemoryLowDialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        h1.h(activity);
                    }
                };
                companion.getClass();
                f(activity, string, string2, aVar);
            }
        }

        public static final void b(Companion companion, Activity activity, String str, String str2) {
            companion.getClass();
            if (activity != null && str != null && str2 != null) {
                String r4 = v.r(v.p(str));
                File file = new File(v.E());
                bg.b.z0(file);
                file.mkdirs();
                File file2 = new File(a0.a.j(file.getAbsoluteFile().toString(), File.separator, r4, ".docx"));
                if (file2.exists()) {
                    file2.delete();
                }
                ea.a.p("H0R3Mi5vRWQSZSZwEHJZMQ==", "TKjcx1zd");
                NativeSoLoaderHelper.f1946o.get();
                file2.toString();
                c.c(activity).convert(str, file2.getAbsolutePath(), str2, new pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.b(activity, file2));
            }
        }

        public static void c(Context context) {
            PDF2WordHelper.f25577e = true;
            NativeSoLoaderHelper.f1944m.set(true);
            if (context != null) {
                c.c(context).cancelForce();
                PDF2WordHelper.f25574a.getClass();
            }
            PDF2WordHelper.c = null;
            PDF2WordHelper.f25579g.removeCallbacksAndMessages(null);
        }

        public static void d(Activity activity, cg.a aVar, cg.a downloading, cg.a err, NativeSoLoaderHelper.DownloadSource from) {
            g.e(activity, "activity");
            g.e(downloading, "downloading");
            g.e(err, "err");
            g.e(from, "from");
            w<Integer> wVar = NativeSoLoaderHelper.f1942k;
            Integer d10 = wVar.d();
            if (d10 != null && d10.intValue() == 1) {
                if (PDF2WordHelper.f25580h) {
                    j1.d(activity, activity.getString(R.string.arg_res_0x7f13010b), null);
                }
                PDF2WordHelper.f25580h = true;
                wVar.k(Integer.valueOf(NativeSoLoaderHelper.f1935d));
                g(activity, downloading, err, from);
            } else if (d10 != null && d10.intValue() == 2) {
                PDF2WordHelper.f25580h = true;
                aVar.invoke();
            } else {
                PDF2WordHelper.f25580h = true;
                g(activity, downloading, err, from);
            }
        }

        public static void e(jl.a aVar, String str, String str2) {
            if (com.google.android.play.core.assetpacks.c.W(aVar) && !TextUtils.isEmpty(str) && str2 != null) {
                PDF2WordHelper.f25576d = 0;
                System.currentTimeMillis();
                PDF2WordHelper.f25577e = false;
                PDF2WordHelper.f25578f.set(false);
                t0.d0(x.a(j0.f20207b), null, null, new PDF2WordHelper$Companion$convertPDF2Word$1(aVar, str, str2, null), 3);
            }
        }

        public static void f(Activity activity, String str, String str2, final cg.a aVar) {
            OperatePdfFailedDialog operatePdfFailedDialog = PDF2WordHelper.f25581i;
            if (operatePdfFailedDialog != null) {
                operatePdfFailedDialog.cancel();
            }
            OperatePdfFailedDialog operatePdfFailedDialog2 = new OperatePdfFailedDialog(activity, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion$showErrDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    aVar.invoke();
                }
            });
            PDF2WordHelper.f25581i = operatePdfFailedDialog2;
            operatePdfFailedDialog2.H(str, str2);
            OperatePdfFailedDialog operatePdfFailedDialog3 = PDF2WordHelper.f25581i;
            if (operatePdfFailedDialog3 != null) {
                operatePdfFailedDialog3.show();
            }
        }

        public static void g(final Activity activity, cg.a aVar, cg.a aVar2, NativeSoLoaderHelper.DownloadSource downloadSource) {
            boolean z10;
            if (!cl.b.b(activity)) {
                String string = activity.getString(R.string.arg_res_0x7f1302af);
                g.d(string, ea.a.p("UmM_aQVpFnlcZ1F0OnQkaSpnGlJoczdyK240LltlOHdcciBfFnIQbwAp", "BS5Lb3IG"));
                String string2 = activity.getString(R.string.arg_res_0x7f130575);
                g.d(string2, ea.a.p("IGMNaTxpGnlmZwN0Z3QlaVZnelJnc0JyHW4WLidpJmUuXx1vPW4CbylkOWZVaTtlXCk=", "sCAyJn9v"));
                f(activity, string, string2, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion$startDownloading$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }
                });
                NativeSoLoaderHelper.f1942k.k(Integer.valueOf(NativeSoLoaderHelper.f1937f));
                ReaderPdfApplication.f23866r = downloadSource;
                NativeSoLoaderHelper.a aVar3 = NativeSoLoaderHelper.f1947p;
                if (aVar3 != null) {
                    ((ReaderPdfApplication.d) aVar3).b();
                }
                aVar2.invoke();
                return;
            }
            if (f0.a() > 50) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                String string3 = activity.getString(R.string.arg_res_0x7f1302ce);
                g.d(string3, ea.a.p("LmNFaQ9pQ3l0Zy90JnQaaVtnRlJrcxFyLG4fLgxvGV8qbl51HmhocyphKWUp", "GymKExbm"));
                String string4 = activity.getString(R.string.arg_res_0x7f13010a);
                g.d(string4, ea.a.p("UmM_aQVpFnlcZ1F0OnQkaSpnGlJoczdyEG4zLgVvPW5fbypkLGYDaR5lUF8NZSUp", "yTaJ6vms"));
                f(activity, string3, string4, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion$startDownloading$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        h1.h(activity);
                    }
                });
                NativeSoLoaderHelper.f1942k.k(Integer.valueOf(NativeSoLoaderHelper.f1937f));
                ReaderPdfApplication.f23866r = downloadSource;
                NativeSoLoaderHelper.a aVar4 = NativeSoLoaderHelper.f1947p;
                if (aVar4 != null) {
                    ((ReaderPdfApplication.d) aVar4).b();
                }
                aVar2.invoke();
                return;
            }
            String str = NativeSoLoaderHelper.f1933a;
            NativeSoLoaderHelper.Companion.f(activity, false, downloadSource);
            aVar.invoke();
        }
    }

    /* compiled from: PDF2WordHelper.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            PdfPreviewEntity pdfPreviewEntity;
            g.e(msg, "msg");
            super.handleMessage(msg);
            Companion companion = PDF2WordHelper.f25574a;
            companion.getClass();
            if (PDF2WordHelper.f25577e) {
                return;
            }
            int i10 = msg.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    int i11 = -200;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                companion.getClass();
                                b bVar = PDF2WordHelper.c;
                                if (bVar != null) {
                                    bVar.e();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        companion.getClass();
                        Object obj = msg.obj;
                        if (obj instanceof Integer) {
                            g.c(obj, ea.a.p("F3UdbHljJ24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiANeQFleWspdCRpCC59bnQ=", "DyyqYFfC"));
                            i11 = ((Integer) obj).intValue();
                        }
                        companion.getClass();
                        b bVar2 = PDF2WordHelper.c;
                        if (bVar2 != null) {
                            bVar2.a(i11);
                            return;
                        }
                        return;
                    }
                    companion.getClass();
                    Object obj2 = msg.obj;
                    if (obj2 instanceof Integer) {
                        g.c(obj2, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuCG5bbh5sHyA7eUFlWWtYdDZpJC48bnQ=", "BvJsgvks"));
                        i11 = ((Integer) obj2).intValue();
                    }
                    companion.getClass();
                    b bVar3 = PDF2WordHelper.c;
                    if (bVar3 != null) {
                        bVar3.b(i11);
                        return;
                    }
                    return;
                }
                companion.getClass();
                companion.getClass();
                b bVar4 = PDF2WordHelper.c;
                if (bVar4 != null) {
                    companion.getClass();
                    bVar4.d(PDF2WordHelper.f25576d);
                    return;
                }
                return;
            }
            companion.getClass();
            Object obj3 = msg.obj;
            if (obj3 instanceof PdfPreviewEntity) {
                pdfPreviewEntity = (PdfPreviewEntity) obj3;
            } else {
                pdfPreviewEntity = null;
            }
            companion.getClass();
            b bVar5 = PDF2WordHelper.c;
            if (bVar5 != null) {
                bVar5.c(pdfPreviewEntity);
            }
            companion.getClass();
        }
    }

    /* compiled from: PDF2WordHelper.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10);

        void b(int i10);

        void c(PdfPreviewEntity pdfPreviewEntity);

        void d(int i10);

        void e();
    }

    static {
        ea.a.p("EUQBMmBvI2QAZQpwUXJpPj4=", "hXAG7Qc4");
        f25574a = new Companion();
        f25578f = new AtomicBoolean(false);
        f25579g = new a(Looper.getMainLooper());
    }
}
