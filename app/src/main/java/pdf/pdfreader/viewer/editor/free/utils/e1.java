package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: ShareUtils.java */
/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28647a = false;

    public static Intent a(Context context, File file) {
        Intent intent = new Intent();
        Uri u7 = v.u(context, file);
        if (u7 != null) {
            intent.addFlags(1);
        }
        intent.setAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhBFD0Q=", "ASx6qJZg"));
        intent.setType(com.google.android.play.core.assetpacks.b1.I(file));
        String string = context.getResources().getString(R.string.arg_res_0x7f13036c);
        String string2 = context.getResources().getString(R.string.arg_res_0x7f130362);
        intent.putExtra(ea.a.p("WG4NciRpJi4hbhJlWnR5ZUB0IGFnU2NCPkUyVA==", "Yx9iKB6O"), file.getName());
        intent.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrVCBYVA==", "c3TJTkil"), String.format(string2, string) + "\n" + context.getResources().getString(R.string.arg_res_0x7f130386) + com.google.android.play.core.assetpacks.b1.H());
        intent.putExtra(ea.a.p("N24gcidpBy4hbhJlWnR5ZUB0IGFnU2JSMUFN", "rEVDHcMz"), u7);
        return intent;
    }

    public static int b(Context context) {
        if (context instanceof ReaderHomeActivity) {
            return (int) ((ReaderHomeActivity) context).getResources().getDimension(R.dimen.dp_104);
        }
        return -1;
    }

    public static void c(Context context, String str, String str2) {
        try {
            Intent intent = new Intent(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjZFBUQ=", "fgr6KoTc"));
            intent.setType(ea.a.p("BmUUdFpwH2Ehbg==", "QsrlusD9"));
            String p10 = ea.a.p("WG4KcihpPS4hbhJlWnR5ZUB0IGFnVHNYVA==", "zA9nGYTo");
            intent.putExtra(p10, str2 + "\n" + context.getResources().getString(R.string.arg_res_0x7f130386) + com.google.android.play.core.assetpacks.b1.H());
            context.startActivity(Intent.createChooser(intent, str));
            AppOpenManager.c().f23907g = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            e10.toString();
        }
    }

    public static void d(Context context, File file) {
        if (!file.exists()) {
            j1.e(context, context.getString(R.string.arg_res_0x7f130393), true, null, b(context));
            return;
        }
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("QGgqchZGC2xl", "aQ8ztbns");
        a10.getClass();
        dp.a.b(context, p10);
        Intent a11 = a(context, file);
        try {
            f28647a = true;
            eo.e.r(context, eo.e.j(context) + 1);
            context.startActivity(Intent.createChooser(a11, context.getResources().getString(R.string.arg_res_0x7f1303ef)));
            AppOpenManager.c().f23907g = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            t1.c(ea.a.p("PGhQchxGXmxl", "CO8eC1RY"), e10);
        }
    }

    public static void e(Context context, PdfPreviewEntity pdfPreviewEntity) {
        if (pdfPreviewEntity.getPath() == null) {
            return;
        }
        File file = new File(pdfPreviewEntity.getPath());
        if (!file.exists()) {
            j1.e(context, context.getString(R.string.arg_res_0x7f130393), true, null, b(context));
            return;
        }
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("PGhQchxGXmxl", "3ve1odCX");
        a10.getClass();
        dp.a.b(context, p10);
        Intent a11 = a(context, file);
        try {
            eo.e.r(context, eo.e.j(context) + 1);
            context.startActivity(Intent.createChooser(a11, context.getResources().getString(R.string.arg_res_0x7f1303ef)));
            AppOpenManager.c().f23907g = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            t1.c(ea.a.p("PGhQchxGXmxl", "UBdxuIIE"), e10);
        }
    }

    public static void f(Context context, ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            if (arrayList.size() == 1) {
                e(context, (PdfPreviewEntity) arrayList.get(0));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            Intent intent = new Intent();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = new File(((PdfPreviewEntity) it.next()).getPath());
                if (!file.exists()) {
                    j1.e(context, context.getString(R.string.arg_res_0x7f130393) + ea.a.p("Xj4=", "uGsiwrHp") + file.getName(), true, null, b(context));
                } else {
                    sb2.append(file.getName());
                    sb2.append("\n");
                    Uri u7 = v.u(context, file);
                    if (u7 != null) {
                        arrayList2.add(u7);
                    }
                }
            }
            intent.addFlags(1);
            intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjZFF0QFTRlMJ0kfTEU=", "zgQDYZLs"));
            intent.setType(ea.a.p("UnA7bBpjA3Qbb1ovGWRm", "GoRuAFqS"));
            String string = context.getResources().getString(R.string.arg_res_0x7f13036c);
            String string2 = context.getResources().getString(R.string.arg_res_0x7f130362);
            intent.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrUzBCCEUmVA==", "43VnBeMx"), sb2.toString());
            intent.putExtra(ea.a.p("Um4vchxpBi4bbkBlB3R4ZTx0QGFoVAZYVA==", "kl3pWuSq"), String.format(string2, string) + "\n" + context.getResources().getString(R.string.arg_res_0x7f130386) + com.google.android.play.core.assetpacks.b1.H());
            Iterator<? extends Parcelable> it2 = arrayList2.iterator();
            int i10 = 0;
            while (it2.hasNext()) {
                i10 += ((Uri) it2.next()).toString().getBytes().length;
            }
            intent.putParcelableArrayListExtra(ea.a.p("Um4vchxpBi4bbkBlB3R4ZTx0QGFoUxdSCEFN", "Mk0OAt4f"), arrayList2);
            ea.a.p("QGgqcmU=", "QOhcR5Ji");
            ea.a.p("OnJYQgB0UlMzei86IA==", "XyDVDUP6");
            dp.a.a().getClass();
            dp.a.b(context, ea.a.p("OWgbcgdGA2wtTA9zQCA=", "9YJzbjoE") + i10);
            if (i10 < 72880) {
                eo.e.r(context, eo.e.j(context) + 1);
                try {
                    context.startActivity(Intent.createChooser(intent, context.getResources().getString(R.string.arg_res_0x7f1303ef)));
                    AppOpenManager.c().f23907g = false;
                    return;
                } catch (Exception e10) {
                    ea.a.p("QGgqcmU=", "2Zd5i0wG");
                    ea.a.p("PGhQchxGXmw_TCNzATpI6aGZhq-v", "V4d2DQiM");
                    e10.getMessage();
                    o9.d.s(ea.a.p("R2hZcmU=", "lo48LHsp"), ea.a.p("BWUCZGltEWw8aUZlTGMycExpPW46", "qWvlIdwz") + e10.getMessage());
                    e10.printStackTrace();
                    t1.c(ea.a.p("QGgqchZGC2wXTF1zdA==", "GCatVT0H"), e10);
                    return;
                }
            }
            j1.e(context, context.getResources().getString(R.string.arg_res_0x7f1303f0), true, null, b(context));
        }
    }

    public static void g(Context context, List list) {
        if (list != null && list.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            Intent intent = new Intent();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file = new File(((ImageFileInfo) it.next()).getFilePath());
                if (!file.exists()) {
                    j1.e(context, context.getString(R.string.arg_res_0x7f130393) + ea.a.p("Hj4=", "6X5RlfTc") + file.getName(), true, null, b(context));
                } else {
                    sb2.append(file.getName());
                    sb2.append("\n");
                    Uri u7 = v.u(context, file);
                    if (u7 != null) {
                        arrayList.add(u7);
                    }
                }
            }
            intent.addFlags(1);
            intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjZFC0RpTT9MbEkfTEU=", "nZPjE6j8"));
            intent.setType(ea.a.p("K3A4bD1jOHQhbwgvW2MjZUwtIXQ7ZVdt", "dUJHTYnt"));
            String string = context.getResources().getString(R.string.arg_res_0x7f13036c);
            String string2 = context.getResources().getString(R.string.arg_res_0x7f130362);
            intent.putExtra(ea.a.p("Um4vchxpBi4bbkBlB3R4ZTx0QGFoUxZCPkUuVA==", "tmEUf5WG"), sb2.toString());
            intent.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrVCBYVA==", "lpbK2Ufm"), String.format(string2, string) + "\n" + context.getResources().getString(R.string.arg_res_0x7f130386) + com.google.android.play.core.assetpacks.b1.H());
            Iterator<? extends Parcelable> it2 = arrayList.iterator();
            int i10 = 0;
            while (it2.hasNext()) {
                i10 += ((Uri) it2.next()).toString().getBytes().length;
            }
            intent.putParcelableArrayListExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrUzFSFUFN", "xwJeP1F3"), arrayList);
            ea.a.p("PGhQcmU=", "QnP4CRj4");
            ea.a.p("H3IcQi90AFMhegM6IA==", "7pjuVeZ1");
            dp.a.a().getClass();
            dp.a.b(context, ea.a.p("QGgqchZGC2wXTF1zHSA=", "Vh4sK0mE") + i10);
            if (i10 < 72880) {
                eo.e.r(context, eo.e.j(context) + 1);
                try {
                    context.startActivity(Intent.createChooser(intent, context.getResources().getString(R.string.arg_res_0x7f1303ef)));
                    AppOpenManager.c().f23907g = false;
                    return;
                } catch (Exception e10) {
                    ea.a.p("FmgJcmU=", "Hfehj1bD");
                    ea.a.p("S2gCci5GWGwtTA9zQDp36ayZuq-v", "HK8cK1iG");
                    e10.getMessage();
                    o9.d.s(ea.a.p("PGhQcmU=", "hNmdQAjf"), ea.a.p("RGUnZBFtM2w8aUZlTGMycExpPW46", "kr7I1FOf") + e10.getMessage());
                    e10.printStackTrace();
                    t1.c(ea.a.p("PGhQchxGXmw_TCNzdA==", "XlgLVERZ"), e10);
                    return;
                }
            }
            j1.e(context, context.getResources().getString(R.string.arg_res_0x7f1303f0), true, null, b(context));
        }
    }

    public static void h(Context context, String str, String str2) {
        try {
            Intent intent = new Intent(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhBFfEQ=", "2R85LR0k"));
            intent.setType(ea.a.p("R2UzdFxwDmEbbg==", "Lekkc9yS"));
            intent.putExtra(ea.a.p("Um4vchxpBi4bbkBlB3R4ZTx0QGFoVAZYVA==", "XnTa3VW8"), str2);
            context.startActivity(Intent.createChooser(intent, str));
            AppOpenManager.c().f23907g = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            e10.toString();
        }
    }
}
