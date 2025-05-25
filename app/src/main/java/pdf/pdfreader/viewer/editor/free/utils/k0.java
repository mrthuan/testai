package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import en.a;
import java.io.File;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;

/* compiled from: NavigateUtil.java */
/* loaded from: classes3.dex */
public final class k0 {
    public static void a(Activity activity, Intent intent, ThirdOpenBean thirdOpenBean, String str) {
        Class cls;
        String str2;
        String str3;
        ReaderPdfApplication.k().g(null);
        String stringExtra = intent.getStringExtra(ea.a.p("I2VKX1JpFGUXcAd0aA==", "PpH34x92"));
        Intent intent2 = new Intent(activity, ReaderHomeActivity.class);
        String p10 = ea.a.p("Q2EsZSxoDW0XX0djG2UzbhtwQGUwaSZ3", "I0TbFfKM");
        if (!TextUtils.isEmpty(stringExtra) && new File(stringExtra).exists()) {
            File file = new File(stringExtra);
            boolean N = com.google.android.play.core.assetpacks.b1.N(file);
            if (N) {
                cls = ReaderPreviewActivity.class;
            } else {
                cls = OfficeReaderActivity.class;
            }
            Intent intent3 = new Intent(activity, cls);
            if (N) {
                str2 = "PWEVZTpwMGU-aQN3a3AzZg==";
                str3 = "l4MreBoH";
            } else {
                str2 = "Q2EsZSxwEGUEaVF3Nm8wZi1jZQ==";
                str3 = "L1o85o45";
            }
            p10 = ea.a.p(str2, str3);
            intent3.putExtra(ea.a.p("KWldZSZwVnRo", "JyXObLiw"), stringExtra);
            intent3.setData(Uri.fromFile(file));
            intent2 = intent3;
        }
        intent2.setAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJDVc=", "Hky135UV"));
        intent2.putExtra(ea.a.p("WGUyXwBlDmURdGt0CGIJcCtzW3Qvb24=", "ze0Pbckr"), 0);
        intent2.putExtra(ea.a.p("VXIkbQ==", "6C0QfWsC"), ea.a.p("P2FWZSZ3XmQ9ZXQ=", "K2n2EUZx"));
        intent2.putExtra(ea.a.p("WGUyXwdoC3IWX0doCHJl", "as80H10r"), thirdOpenBean);
        intent2.putExtra(ea.a.p("WGUyXwdoC3IWX0doCHIzXzFpbXMyYTdl", "PyI50tes"), !ReaderHomeActivity.Z1);
        intent2.putExtra(ea.a.p("R3k7ZTdlEWMmZUx0", "qPlSsXbc"), str);
        intent2.putExtra(ea.a.p("P2FWZSZ0bw==", "njgdVdU3"), p10);
        activity.startActivity(intent2);
        if (activity instanceof ReaderSplashActivity) {
            activity.finish();
        }
    }

    public static void b(Activity activity, Intent intent, ThirdOpenBean thirdOpenBean, String str, boolean z10) {
        Object p10;
        String str2;
        boolean z11;
        String str3;
        String y10;
        int Y;
        String str4;
        Class cls;
        String str5;
        String str6;
        String p11;
        Intent intent2;
        ComponentName component;
        String className;
        ComponentName component2;
        ComponentName component3;
        ComponentName component4;
        String str7;
        Uri uri = thirdOpenBean.getUri();
        ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
        dp.a a10 = dp.a.a();
        if (uri != null) {
            p10 = uri;
        } else {
            p10 = ea.a.p("XXUnbA==", "QYkaw4b8");
        }
        if (intent != null) {
            str2 = intent.getType();
        } else {
            str2 = null;
        }
        a10.getClass();
        dp.a.c("third open file, getFileType uri == " + p10 + "  mineType == " + str2);
        if (uri == null) {
            if (intent != null) {
                str7 = intent.getType();
            } else {
                str7 = null;
            }
            y10 = ge.a.y(str7);
        } else {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null && !kotlin.text.j.H(lastPathSegment)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 && (Y = kotlin.text.k.Y(lastPathSegment, ea.a.p("Lg==", "VqQ6TcDd"), 6)) != -1) {
                y10 = lastPathSegment.substring(Y);
                kotlin.jvm.internal.g.d(y10, ea.a.p("IWgGc2NhOyAiYRBhGmw2bl8uAXQ7aVhnXS4CdTNzNnI8bggoMHQpcjxJCGRReCk=", "ibUoCHfg"));
                if (!aj.b.H(y10)) {
                    dp.a a11 = dp.a.a();
                    String concat = "type is no support, type is ".concat(y10);
                    a11.getClass();
                    dp.a.c(concat);
                    if (intent != null) {
                        str4 = intent.getType();
                    } else {
                        str4 = null;
                    }
                    y10 = ge.a.y(str4);
                }
            } else {
                dp.a.a().getClass();
                dp.a.c("lastPathSegment is " + lastPathSegment);
                if (intent != null) {
                    str3 = intent.getType();
                } else {
                    str3 = null;
                }
                y10 = ge.a.y(str3);
            }
        }
        boolean equalsIgnoreCase = ea.a.p("TXA8Zg==", "V3cXtqB6").equalsIgnoreCase(y10);
        ip.b.f18964a.getClass();
        String str8 = "";
        if (kotlin.text.j.F((intent == null || (component4 = intent.getComponent()) == null || (r6 = component4.getClassName()) == null) ? "" : "", ea.a.p("HWVQZBxyYGU2YyVtEEELdFx2B3Q8MTE=", "sEXrYZRp"), false)) {
            intent2 = new Intent(activity, Word2PDFConvertActivity.class);
            p11 = ea.a.p("IGENZR53HXIsXxJva3AzZg==", "kCPjArqF");
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("NTISX1ZuPGU6XwVsXWNr", "ucBb3Hzs"));
        } else {
            if (kotlin.text.j.F((intent == null || (component3 = intent.getComponent()) == null || (r6 = component3.getClassName()) == null) ? "" : "", ea.a.p("HWVQZBxyYGU2YyVtEEELdFx2B3Q8MTI=", "DJQ2jNzp"), false)) {
                androidx.lifecycle.w<ArrayList<bn.a>> wVar = en.a.f16815a;
                a.C0215a.a();
                intent2 = new Intent(activity, Pdf2ImagePicPreviewActivity.class);
                intent2.putExtra(ea.a.p("JnNubBZuUF8zbStnZQ==", "UzVY8DlK"), false);
                p11 = ea.a.p("Q2EsZSxwBmYtdFtfAG03Z2U=", "OoEVzN0m");
            } else {
                if (kotlin.text.j.F((intent == null || (component2 = intent.getComponent()) == null || (r6 = component2.getClassName()) == null) ? "" : "", ea.a.p("HWVQZBxyYGU2YyVtEEELdFx2B3Q8MTM=", "VekARAGm"), false)) {
                    androidx.lifecycle.w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                    a.C0215a.a();
                    intent2 = new Intent(activity, Pdf2ImagePicPreviewActivity.class);
                    intent2.putExtra(ea.a.p("JnNubBZuUF8zbStnZQ==", "xUDEJP6x"), true);
                    p11 = ea.a.p("P2FWZSZwU2YFdCVfGW8GZ2ppA2EiZQ==", "ufOrpipw");
                } else {
                    if (intent != null && (component = intent.getComponent()) != null && (className = component.getClassName()) != null) {
                        str8 = className;
                    }
                    if (kotlin.text.j.F(str8, ea.a.p("HWVQZBxyYGU2YyVtEEELdFx2B3Q8MTQ=", "doxQVwPV"), false)) {
                        intent2 = new Intent(activity, ReaderConvertPreviewActivity.class);
                        p11 = ea.a.p("P2FWZSZwU2YFdCVfAm8aZA==", "x1EDDxcu");
                        AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
                        AppCoreFilterEvent.g(ea.a.p("QzI8XxZuFmUAX1dsAGNr", "070b1ITb"));
                    } else {
                        if (equalsIgnoreCase) {
                            cls = ReaderPreviewActivity.class;
                        } else {
                            cls = OfficeReaderActivity.class;
                        }
                        Intent intent3 = new Intent(activity, cls);
                        if (equalsIgnoreCase) {
                            str5 = "Q2EsZSxwEGUEaVF3NnAyZg==";
                            str6 = "XRNGalq5";
                        } else {
                            str5 = "Q2EsZSxwEGUEaVF3Nm8wZi1jZQ==";
                            str6 = "SQlS6yKh";
                        }
                        p11 = ea.a.p(str5, str6);
                        intent2 = intent3;
                    }
                }
            }
        }
        intent2.setAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJAFc=", "EQicoaBq"));
        intent2.putExtra(ea.a.p("WGUyXwdoC3IWX0doCHJl", "bCkF50yO"), thirdOpenBean);
        intent2.putExtra(ea.a.p("KWUVXzxoHHIsXxVoVXIyX01pDXM9YUJl", "8KBlHut6"), true);
        intent2.putExtra(ea.a.p("KXJebQ==", "F6mpuTME"), ea.a.p("CVJ-TSZUf0kIRA==", "sQEVrBcl"));
        intent2.putExtra(ea.a.p("R3k7ZTdlEWMmZUx0", "8bShl2z3"), str);
        if (z10) {
            i.a aVar = pdf.pdfreader.viewer.editor.free.feature.billing.ui.i.f24934a;
            String p12 = ea.a.p("R2gicmQ=", "Su5IPC9r");
            aVar.getClass();
            i.a.b(activity, intent2, p12, null);
            intent2.setClass(activity, LanguageChooseActivity.class);
            intent2.putExtra(ea.a.p("P2FWZSZ0bw==", "6mBRKMlo"), p11);
        } else {
            c1 c1Var = c1.f28564a;
            String p13 = ea.a.p("Tg==", "m9qHdMew");
            no.f.b(activity).getClass();
            if (no.f.e(activity)) {
                tn.a.d(activity, ea.a.p("IWVGZhVvdw==", "IfeYgd86"), ea.a.p("X2ElZwZhBWUtbVV0Cmg=", "sFdx5dEe"), p13, false);
            }
            q0.y(true);
        }
        ComponentName component5 = intent2.getComponent();
        if (component5 != null && TextUtils.equals(component5.getClassName(), Word2PDFConvertActivity.class.getName())) {
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSx3Fm9w", "bzgU403B"));
        } else if (component5 != null && TextUtils.equals(component5.getClassName(), ReaderConvertPreviewActivity.class.getName())) {
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZwQ293", "u6r1TsNF"));
        } else if (component5 != null && TextUtils.equals(component5.getClassName(), Pdf2ImagePicPreviewActivity.class.getName())) {
            if (TextUtils.equals(p11, ea.a.p("OGEPZWhwC2YXdAlfWG85Z2dpP2EuZQ==", "JHHh7oUD"))) {
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZwQ29s", "kwBUxgAr"));
            } else {
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("Lm9LZQpwMW9p", "wyM9UEZe"));
            }
        }
        activity.startActivity(intent2);
        if (activity instanceof ReaderSplashActivity) {
            ((ReaderSplashActivity) activity).x1(false);
        }
    }

    public static void c(Context context, String str, PdfPreviewEntity pdfPreviewEntity, String str2, String str3) {
        d(context, str, pdfPreviewEntity, false, 0, str2, str3, null);
    }

    public static void d(Context context, String str, PdfPreviewEntity pdfPreviewEntity, boolean z10, int i10, String str2, String str3, h0 h0Var) {
        int i11;
        int i12;
        if (pdfPreviewEntity != null) {
            Intent intent = null;
            ReaderPdfApplication.k().g(null);
            String otherStrOne = pdfPreviewEntity.getOtherStrOne();
            if (ea.a.p("H0RG", "uwOz2U3O").equals(otherStrOne)) {
                if (context != null && !TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    long length = file.length();
                    if (file.exists() && length >= 0) {
                        if (i12 == 0) {
                            j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130148), true, null, -1);
                        } else {
                            dp.a a10 = dp.a.a();
                            String p10 = ea.a.p("AWFHaR5hQ2UPdCNsVXYBZUJFCmkxUAFm", "FZnjvD3K");
                            a10.getClass();
                            dp.a.b(context, p10);
                            intent = new Intent(context, ReaderPreviewActivity.class);
                            intent.setAction(ea.a.p("B249clhpDC4hbhJlWnR5YVt0O28nLmBJMVc=", "izfY7h98"));
                            intent.setData(Uri.fromFile(file));
                            intent.putExtra(ea.a.p("QGgkdyxwBmY=", "wRzK0LUI"), pdfPreviewEntity);
                            intent.putExtra(ea.a.p("VmQidA==", "18iOkk40"), z10);
                            intent.putExtra(ea.a.p("UmQCdDp5OGU=", "Hd7knHFM"), i10);
                            intent.putExtra(ea.a.p("PmEHcy1vCmQ=", "prNtZx49"), str2);
                            intent.putExtra(ea.a.p("IHIFbQ==", "7EFjDUgi"), str3);
                            intent.putExtra(ea.a.p("Q2EsZSx0bw==", "6UIu5xSq"), ea.a.p("JWE1ZTpwFGU-aQN3a3AzZg==", "9FURef21"));
                            if (!(context instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                        }
                    } else {
                        j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130393), true, null, -1);
                    }
                }
                if (intent != null) {
                    try {
                        context.startActivity(intent);
                        if (h0Var != null) {
                            h0Var.b();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        t1.c(ea.a.p("RWkudzZkC3QiZGY=", "p7adCypU"), e10);
                        dp.a.a().getClass();
                        dp.a.d(context, e10);
                    }
                }
                ea.a.p("Y2QtUhZhBmUARkZhDm0zbjAgVmk1cCJ0LmgudFBtC2xaYyA6U3AGZl4gW3QBZSRTMHJ9biMgfiA=", "Mg5HsYw3");
                String str4 = n0.f28727a;
                t1.b(ea.a.p("H2RXUhxhU2UoRjhhEm0NbkEgCmk2cAR0E2gzdFZtNWwmY1o6WXBTZnYgJXQdZRpTQXIhbiAgWCA=", "3yAvpz3v") + otherStrOne);
                return;
            }
            if (context != null && !TextUtils.isEmpty(str)) {
                File file2 = new File(str);
                long length2 = file2.length();
                if (file2.exists() && length2 >= 0) {
                    if (i11 == 0) {
                        j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130148), true, null, -1);
                    } else {
                        dp.a a11 = dp.a.a();
                        String p11 = ea.a.p("fWE9aRRhFmUndF1sSXY_ZTNFVmkyTyVmOmNl", "SQbQESyO");
                        a11.getClass();
                        dp.a.b(context, p11);
                        intent = new Intent(context, OfficeReaderActivity.class);
                        intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJJ1c=", "IlwPbo6l"));
                        intent.setData(Uri.fromFile(file2));
                        intent.putExtra(ea.a.p("QGgkdyxwBmY=", "bb1znC0G"), pdfPreviewEntity);
                        intent.putExtra(ea.a.p("KmRYdA==", "gI8iCrFi"), z10);
                        intent.putExtra(ea.a.p("VXIkbQ==", "vasg4lsI"), str3);
                        intent.putExtra(ea.a.p("P2FWZSZ0bw==", "V6vrMojA"), ea.a.p("SWEqZThwF2U-aQN3a28xZlFjZQ==", "Eu9MgeBY"));
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                    }
                } else {
                    j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130393), true, null, -1);
                }
            }
            if (intent != null) {
                try {
                    context.startActivity(intent);
                    if (h0Var != null) {
                        h0Var.b();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    t1.c(ea.a.p("RWkudzZkC3Q9ZlJpCmU=", "aWLjaecC"), e11);
                    dp.a.a().getClass();
                    dp.a.d(context, e11);
                }
            }
            ea.a.p("Y2QtUhZhBmUARkZhDm0zbjAgVmk1cCJ0C2gEdFVtLGxaYyA6U24NdFJwUGZFIDl0LGVAUzJyDG4NIHAg", "hM0oN1nX");
            String str5 = n0.f28727a;
            t1.b(ea.a.p("H2RXUhxhU2UoRjhhEm0NbkEgCmk2cAR0E2gddDxtEmwmY1o6WW5YdHpwLmZZIAd0XWUcUzFyKm4VIGkg", "2R1WpTYQ") + otherStrOne);
        }
    }

    public static void e(Activity activity, Intent intent) {
        ReaderPdfApplication.k().g(null);
        String stringExtra = intent.getStringExtra(ea.a.p("P2FWZSZ0bw==", "AOVVjZMw"));
        Intent intent2 = new Intent(activity, ReaderHomeActivity.class);
        FlutterEncryptConfig.f25878a.getClass();
        boolean c = FlutterEncryptConfig.c();
        intent2.putExtra(ea.a.p("VXIebQ==", "pr3qqWf3"), ea.a.p("JGFeZQt3EWQvZXQ=", "AmT9Txqz"));
        intent2.putExtra(ea.a.p("U2UIX0ZoBXIsXxVoVXIyX01pDXM9YUJl", "7M8q2lUN"), false);
        intent2.putExtra(ea.a.p("NmEWZW50bw==", "MoFq1rrx"), stringExtra);
        if (c) {
            i.a aVar = pdf.pdfreader.viewer.editor.free.feature.billing.ui.i.f24934a;
            String p10 = ea.a.p("O2hYcmQ=", "tyzWjDXr");
            aVar.getClass();
            i.a.b(activity, intent2, p10, null);
            intent2.setClass(activity, LanguageChooseActivity.class);
        } else {
            c1 c1Var = c1.f28564a;
            String p11 = ea.a.p("Tg==", "S7lcehdC");
            i.a aVar2 = pdf.pdfreader.viewer.editor.free.feature.billing.ui.i.f24934a;
            String p12 = ea.a.p("O2hYcmQ=", "XkZKYfjD");
            aVar2.getClass();
            i.a.b(activity, intent2, p12, SubscriptionDarkTestFActivity.class);
            no.f.b(activity).getClass();
            if (no.f.e(activity)) {
                tn.a.d(activity, ea.a.p("XWU8Zh9vdw==", "QxP7P6aU"), ea.a.p("I2FfZwxhUGUFbSt0Fmg=", "fcByzR1m"), p11, false);
            }
            q0.y(true);
        }
        activity.startActivity(intent2);
        String p13 = ea.a.p("BWkNZxR0KnQpZw==", "THriquGh");
        o9.d.s(p13, ea.a.p("K2lCcBh0VGgNaS5nEHQncFBuJ24xZQt0VCA=", "A4punzOB") + intent2 + ea.a.p("E3AqZxZUDSA=", "6YIvTdY5") + stringExtra);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(r0) == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(int r11, android.content.Context r12, java.lang.String r13, java.lang.String r14, pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r15, androidx.privacysandbox.ads.adservices.topics.d r16, boolean r17) {
        /*
            r2 = r12
            r8 = r13
            if (r2 == 0) goto L57
            android.app.Activity r0 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(r12)
            if (r0 == 0) goto L12
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.extension.a.c(r0)
            r1 = 1
            if (r0 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L57
            if (r8 == 0) goto L57
            if (r15 != 0) goto L1a
            goto L57
        L1a:
            java.lang.String r0 = r15.getOtherStrOne()
            java.lang.String r1 = "H0RG"
            java.lang.String r3 = "iQe3zmgN"
            java.lang.String r1 = ea.a.p(r1, r3)
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L49
            if (r16 == 0) goto L31
            r16.d()
        L31:
            pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess r9 = new pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess
            r9.<init>(r12)
            pdf.pdfreader.viewer.editor.free.utils.j0 r10 = new pdf.pdfreader.viewer.editor.free.utils.j0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.b(r13, r10)
            goto L57
        L49:
            java.lang.String r5 = ""
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r11
            r6 = r14
            r7 = r16
            d(r0, r1, r2, r3, r4, r5, r6, r7)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.k0.f(int, android.content.Context, java.lang.String, java.lang.String, pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity, androidx.privacysandbox.ads.adservices.topics.d, boolean):void");
    }

    public static void g(Context context, String str, PdfPreviewEntity pdfPreviewEntity, String str2) {
        f(0, context, str, str2, pdfPreviewEntity, null, false);
    }

    public static void h(Context context, String str, PdfPreviewEntity pdfPreviewEntity, String str2, Runnable runnable) {
        f(1, context, str, str2, pdfPreviewEntity, new i0(runnable), true);
    }

    public static void i(Context context, String str, PdfPreviewEntity pdfPreviewEntity, String str2) {
        j(context, str, pdfPreviewEntity, false, 0, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(android.content.Context r10, java.lang.String r11, pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r12, boolean r13, int r14, java.lang.String r15) {
        /*
            if (r10 == 0) goto Ld9
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto Ld9
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            long r1 = r0.length()
            boolean r11 = r0.exists()
            r3 = -1
            r4 = 1
            r5 = 0
            if (r11 == 0) goto L91
            long r6 = r0.length()
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L25
            goto L91
        L25:
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 != 0) goto L38
            android.content.res.Resources r11 = r10.getResources()
            r12 = 2131951944(0x7f130148, float:1.9540317E38)
            java.lang.String r11 = r11.getString(r12)
            pdf.pdfreader.viewer.editor.free.utils.j1.e(r10, r11, r4, r5, r3)
            goto L91
        L38:
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity> r1 = pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.class
            r11.<init>(r10, r1)
            java.lang.String r1 = "Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJH1c="
            java.lang.String r2 = "sFkwZWjm"
            java.lang.String r1 = ea.a.p(r1, r2)
            r11.setAction(r1)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r11.setData(r0)
            java.lang.String r0 = "PGhedyZwU2Y="
            java.lang.String r1 = "Q3ZYyyEZ"
            java.lang.String r0 = ea.a.p(r0, r1)
            r11.putExtra(r0, r12)
            java.lang.String r12 = "KmRYdA=="
            java.lang.String r0 = "f2dUz1Km"
            java.lang.String r12 = ea.a.p(r12, r0)
            r11.putExtra(r12, r13)
            java.lang.String r12 = "VmQidCd5EmU="
            java.lang.String r13 = "viZv57ai"
            java.lang.String r12 = ea.a.p(r12, r13)
            r11.putExtra(r12, r14)
            java.lang.String r12 = "BWELczBvFWQ="
            java.lang.String r13 = "N7uxGgqf"
            java.lang.String r12 = ea.a.p(r12, r13)
            java.lang.String r13 = ""
            r11.putExtra(r12, r13)
            java.lang.String r12 = "KXJebQ=="
            java.lang.String r13 = "czPFYbYu"
            java.lang.String r12 = ea.a.p(r12, r13)
            r11.putExtra(r12, r15)
            r12 = 268435456(0x10000000, float:2.524355E-29)
            r11.addFlags(r12)
            goto L92
        L91:
            r11 = r5
        L92:
            pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel r12 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.k()
            r12.g(r5)
            if (r11 != 0) goto Laa
            android.content.res.Resources r11 = r10.getResources()
            r12 = 2131952531(0x7f130393, float:1.9541507E38)
            java.lang.String r11 = r11.getString(r12)
            pdf.pdfreader.viewer.editor.free.utils.j1.e(r10, r11, r4, r5, r3)
            goto Ld9
        Laa:
            dp.a r12 = dp.a.a()
            java.lang.String r13 = "AWFHaR5hQ2UPdCNsVXYBZUJFCmkxUAFm"
            java.lang.String r14 = "glEEmRjr"
            java.lang.String r13 = ea.a.p(r13, r14)
            r12.getClass()
            dp.a.b(r10, r13)
            r10.startActivity(r11)     // Catch: java.lang.Exception -> Lc0
            goto Ld9
        Lc0:
            r11 = move-exception
            r11.printStackTrace()
            java.lang.String r12 = "R2kUdzdkD3QYZGY="
            java.lang.String r13 = "Nd1qrfz2"
            java.lang.String r12 = ea.a.p(r12, r13)
            pdf.pdfreader.viewer.editor.free.utils.t1.c(r12, r11)
            dp.a r12 = dp.a.a()
            r12.getClass()
            dp.a.d(r10, r11)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.k0.j(android.content.Context, java.lang.String, pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity, boolean, int, java.lang.String):void");
    }

    public static void k(Context context, String str, String str2, String str3) {
        ReaderPdfApplication.k().g(null);
        File file = new File(str);
        long length = file.length();
        if (file.exists() && file.length() >= 0) {
            if (length == 0) {
                j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130148), true, null, -1);
                return;
            }
            Intent intent = new Intent(context, ReaderConvertPreviewActivity.class);
            intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJLVc=", "M2dbh6nj"));
            intent.setData(Uri.fromFile(file));
            intent.putExtra(ea.a.p("JnN3chZtZ2EuaA==", "3CbLW1nT"), true);
            intent.putExtra(ea.a.p("VWknZSNhFmg=", "fmx1bazB"), str);
            intent.putExtra(ea.a.p("P2FCcw5vRWQ=", "ltTTPccw"), str2);
            intent.putExtra(ea.a.p("VXIkbQ==", "UnrQR0UO"), str3);
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxwFm93", "8hpiGls0"));
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                t1.c(ea.a.p("OWlUdylEcUM1bjxlB3Q=", "GXiQGLjj"), e10);
                dp.a.a().getClass();
                dp.a.d(context, e10);
                return;
            }
        }
        j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130393), true, null, -1);
    }
}
