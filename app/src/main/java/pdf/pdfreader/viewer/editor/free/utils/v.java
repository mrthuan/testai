package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;

/* compiled from: FileUtils.java */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, File> f28781a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f28782b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f28783d;

    /* renamed from: e  reason: collision with root package name */
    public static String f28784e;

    static {
        ea.a.p("OW9ddRRl", "LGFLLmJW");
        ea.a.p("Vng_ZQFuA2w=", "If6yL0wW");
        f28782b = ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpHG8hLi1yNmUdZiJsFnAQbwRpUGVy", "hSKS4d0n");
        c = ea.a.p("cmldZSd0Xmxz", "Pq41r7pG");
        f28781a = new ConcurrentHashMap<>();
        f28783d = 20;
        new HashSet();
        f28784e = ReaderPdfApplication.m().getString(R.string.arg_res_0x7f130047);
    }

    public static String A(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ea.a.p("AkQ1", "V2TeTkYO"));
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    public static String B(Context context, String str) {
        File file = new File(l(context, null), str);
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                file.mkdirs();
            }
        }
        return file.getAbsolutePath();
    }

    public static String C(String str) {
        File file = new File(l(ReaderPdfApplication.m(), null), str);
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                file.mkdirs();
            }
        }
        return file.getAbsolutePath();
    }

    public static String D(Context context) {
        return B(context, ea.a.p("DG9fdhxydA==", "fen3I4Lw") + File.separator + ea.a.p("Y2QtMjptA2dl", "oZCW6wa0"));
    }

    public static String E() {
        return C(ea.a.p("Z2UmcA==", "TdkxH3aO"));
    }

    public static void F(Context context, Context context2, File file) {
        if (file != null && file.exists()) {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT >= 28 || !ReaderPdfApplication.f23859k) {
                try {
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                    new PdfRenderer(open).close();
                    tf.d dVar = tf.d.f30009a;
                    o9.d.l(open, null);
                    z10 = false;
                } catch (Throwable unused) {
                    if (Build.VERSION.SDK_INT < 28) {
                        ReaderPdfApplication.f23859k = true;
                    }
                    dp.a a10 = dp.a.a();
                    a10.getClass();
                    dp.a.c("Cannot print this pdf " + file.getAbsolutePath() + " length " + file.length());
                }
            }
            if (!z10) {
                try {
                    PrintManager printManager = (PrintManager) context2.getSystemService(ea.a.p("Q3IibnQ=", "Ipqv0jfv"));
                    if (printManager != null) {
                        AppOpenManager.c().f23907g = false;
                        dp.a a11 = dp.a.a();
                        String p10 = ea.a.p("Q3IibgdQBmZScEZpB3QbYSphVWVy", "g2zdS3sJ");
                        a11.getClass();
                        dp.a.b(context, p10);
                        PrintAttributes.Builder builder = new PrintAttributes.Builder();
                        builder.setColorMode(2);
                        printManager.print(ea.a.p("cmwnICNEJCAgZVVkDHJ2RCtjR20jbnQ=", "1O4ZNE1a"), new pdf.pdfreader.viewer.editor.free.ui.adapter.m(file.getAbsolutePath()), builder.build());
                        return;
                    }
                    return;
                } catch (RuntimeException e10) {
                    e10.printStackTrace();
                    j1.a(context, ea.a.p("cGElbhx0QnAAaVp0SWF2bSVsVG80bSZkdlBwRmNmDGxWLg==", "V4CeaDgC"));
                    t1.c(ea.a.p("P3JYbg1QU2Y=", "31icwkhr"), e10);
                    return;
                }
            }
        }
        new i3(context, context.getResources().getString(R.string.arg_res_0x7f130327), context.getResources().getString(R.string.arg_res_0x7f130326), "").show();
    }

    public static boolean G(String str) {
        if (str == null) {
            return false;
        }
        ea.a.p("FWkYZXcvLw==", "HbstMIFW");
        if (str.startsWith(ea.a.p("KWldZUMvLw==", "l1cgJldG"))) {
            str = str.substring(ea.a.p("VWknZUkvLw==", "qQGt59gf").length() + str.indexOf(ea.a.p("KWldZUMvLw==", "pyrArki6")));
        }
        return new File(str).exists();
    }

    public static boolean H(Context context, String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            y0 y0Var = new y0(ReaderPdfApplication.m(), str);
            z10 = y0Var.needsPassword();
            y0Var.onDestroy();
            return z10;
        } catch (Exception e10) {
            e10.printStackTrace();
            dp.a.a().getClass();
            dp.a.d(context, e10);
            return z10;
        }
    }

    public static void I(Context context, PdfPreviewEntity pdfPreviewEntity) {
        if (pdfPreviewEntity != null) {
            pdfPreviewEntity.getPath();
            bm.c.b(context).i(pdfPreviewEntity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File J(android.app.Activity r15, android.net.Uri r16, android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.v.J(android.app.Activity, android.net.Uri, android.content.Intent):java.io.File");
    }

    public static void K(jl.a aVar, Context context, String str, String str2) {
        boolean z10;
        if (TextUtils.isEmpty(str)) {
            j1.a(aVar, ea.a.p("X2khZU9uDXRoZR5pR3Qu", "sH9Mob9A"));
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            j1.a(aVar, ea.a.p("VWknZVNuDXRSZUxpGnQu", "aUn0Wmx0"));
            return;
        }
        float length = (((float) file.length()) / 1000.0f) / 1000.0f;
        if (!TextUtils.isEmpty(str2) ? f0.a() > length * 2 : f0.a() > length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            new pdf.pdfreader.viewer.editor.free.ui.dialog.x(aVar, 0).show();
        } else if (TextUtils.isEmpty(str2)) {
            F(aVar, context, file);
        } else if ((((float) file.length()) / 1024.0f) / 1024.0f > 5.1d) {
            PrintUtil.a(file, str2, new s(new pdf.pdfreader.viewer.editor.free.ui.dialog.y[1], aVar, context, new String[]{aVar.getString(R.string.arg_res_0x7f1303cd)}));
        } else {
            PrintUtil.a(file, str2, new t(aVar, context));
        }
    }

    public static Object[] L(Context context, File file, String str, int i10) {
        Object[] objArr = {null, -1};
        if (file == null) {
            return objArr;
        }
        String path = file.getPath();
        kotlin.jvm.internal.g.e(path, "<this>");
        String substring = path.substring(kotlin.text.k.Y(path, ea.a.p("Lg==", "V823F4YW"), 6) + 1);
        kotlin.jvm.internal.g.d(substring, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nRC4gdRFzHHJabiwoAHQDcgZJWmQMeCk=", "mSshVNiC"));
        File file2 = new File(file.getParent() + ea.a.p("Lw==", "1uRGemb8") + str + ea.a.p("Lg==", "Ywjteb9Q") + substring);
        String absolutePath = file.getAbsolutePath();
        dp.a a10 = dp.a.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ea.a.p("QWUlYR5lOg==", "yskbaROX"));
        sb2.append(absolutePath);
        String sb3 = sb2.toString();
        a10.getClass();
        dp.a.b(context, sb3);
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        String path2 = file2.getPath();
        kotlin.jvm.internal.g.e(path2, "path");
        synchronized (StorageFileObserver.f25907j) {
            ((HashSet) StorageFileObserver.f25906i.getValue()).add(path2);
        }
        if (file2.exists()) {
            t1.b(ea.a.p("QWUlYR5lTy1fcFV0ATo=", "mBv6G7nS") + file2.getPath());
            objArr[0] = null;
            objArr[1] = 0;
            if (context != null) {
                j1.e(context, context.getString(R.string.arg_res_0x7f13036b), false, null, i10);
            }
            StorageFileObserver.d(file2.getPath());
            return objArr;
        } else if (file.renameTo(file2)) {
            objArr[0] = file2;
            objArr[1] = 1;
            if (context != null) {
                j1.e(context, context.getString(R.string.arg_res_0x7f1303e1), false, null, i10);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(file2.getAbsolutePath());
            if (!TextUtils.isEmpty(absolutePath)) {
                arrayList.add(absolutePath);
            }
            sn.d.d().getClass();
            sn.d.h(context, arrayList);
            return objArr;
        } else {
            t1.b(ea.a.p("PWVfYRRlGmY7aSZlES1Fb1lkPmExaDo=", "yhEXZCfB") + absolutePath + ea.a.p("WmVAUBR0Dzo=", "yr47ugK3") + file2.getPath());
            try {
            } catch (Exception e10) {
                t1.b(ea.a.p("JmU0YQplWWYpaQplUC16ZTo=", "NpTZgtqT") + e10.getMessage());
            }
            if (file.renameTo(file2)) {
                objArr[0] = file2;
                objArr[1] = 1;
                if (context != null) {
                    j1.e(context, context.getString(R.string.arg_res_0x7f1303e1), false, null, i10);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(file2.getAbsolutePath());
                if (!TextUtils.isEmpty(absolutePath)) {
                    arrayList2.add(absolutePath);
                }
                sn.d.d().getClass();
                sn.d.h(context, arrayList2);
                return objArr;
            }
            t1.b(ea.a.p("PWVfYRRlGmY7aSZlES1FclBuD20gVAo6M2Ejc2U=", "dh82UOo2"));
            objArr[0] = null;
            objArr[1] = -1;
            if (context != null) {
                j1.e(context, context.getString(R.string.arg_res_0x7f1303e0), false, null, i10);
            }
            pdf.pdfreader.viewer.editor.free.observer.a aVar2 = StorageFileObserver.f25899a;
            StorageFileObserver.d(file2.getPath());
            return objArr;
        }
    }

    public static void M(jl.a aVar, Bitmap bitmap, String str) {
        if (bitmap != null) {
            try {
                File file = new File(j(aVar.getApplicationContext(), str));
                if (file.exists()) {
                    file.length();
                }
                if (file.exists()) {
                    file.deleteOnExit();
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                bitmap.recycle();
                ea.a.p("MGEaZSVpQm0pcDJvcmk7ZQs6IA==", "b7Clg6GF");
                file.getAbsolutePath();
                String str2 = n0.f28727a;
            } catch (Exception e10) {
                e10.printStackTrace();
                dp.a.a().getClass();
                dp.a.d(aVar, e10);
            }
        }
    }

    public static void N(jl.a aVar, String str) {
        y0 y0Var;
        if (!TextUtils.isEmpty(str)) {
            try {
                y0Var = new y0(aVar.getApplicationContext(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
                y0Var = null;
            }
            if (y0Var != null) {
                y0Var.countPages();
                if (!y0Var.needsPassword()) {
                    try {
                        M(aVar, y0Var.t(aVar.getResources().getDimensionPixelSize(R.dimen.dp_144), aVar.getResources().getDimensionPixelSize(R.dimen.dp_170)), str);
                    } catch (RuntimeException unused) {
                    }
                } else {
                    File file = new File(j(aVar, str));
                    if (file.exists()) {
                        file.delete();
                    }
                }
                try {
                    y0Var.onDestroy();
                } catch (Exception unused2) {
                }
            } else {
                androidx.activity.f.q("dWknZSZ0C2wBLRktRC0lYTJlfW4jVCt1L2JgaQ0gG29BZWtmEmls", "B0nxpo6r", dp.a.a());
            }
        }
    }

    public static void O(no.e eVar, List list) {
        if (list != null && list.size() > 0) {
            try {
                Collections.sort(list, new u(eVar));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        File file = new File(C(ea.a.p("cGEmZQFh", "XYaKBJtP")));
        bg.b.z0(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.isDirectory()) {
            try {
                File[] listFiles = parentFile.listFiles(new q());
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void b() {
        bg.b.z0(new File(C(ea.a.p("Z2UmcA==", "VspKtS7s"))));
    }

    public static void c(Context context, InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[102400];
        if (context != null && h1.e(context)) {
            ea.a.p("LG9BeSp0RWU7bXAgkb3m5bOFi63d6Mu-vKSH", "zKDRYCAm");
            String str = n0.f28727a;
            bArr = new byte[8192];
        }
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                dp.a.a().getClass();
                dp.a.d(context, e10);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File d(android.app.Activity r7, java.io.InputStream r8, java.lang.String r9, java.io.File r10) {
        /*
            java.lang.String r0 = "ak1U"
            java.lang.String r1 = "AjB7OEA-XD5MPgo-Vz5oPno-"
            r2 = 0
            if (r8 != 0) goto L9
            goto Lcf
        L9:
            java.lang.String r3 = "KGVFRhBsUkYobydDGm4cZVt0O3IsOkXk1o2xrfXlzaiplrbkwrYb5sywr7u6"
            java.lang.String r4 = "sMArnTmQ"
            ea.a.p(r3, r4)
            java.lang.String r3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            java.io.File r3 = new java.io.File
            r3.<init>(r10, r9)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L4b
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ""
            r4.<init>(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r10, r4)
            boolean r10 = r3.exists()
            if (r10 != 0) goto L3d
            r3.mkdirs()
        L3d:
            java.io.File r10 = new java.io.File
            r10.<init>(r3, r9)
            java.lang.String r9 = "1ojQ5ci6hJb15I-2jKTv5cKN14bf5calspbj5tqHkbu2"
            java.lang.String r3 = "TSLuTuq9"
            ea.a.p(r9, r3)
            r3 = r10
            goto L5c
        L4b:
            java.lang.String r9 = "1Jv_5v2lh4br5bGlj5bm5tKH1ru2"
            java.lang.String r10 = "0PsOTX6O"
            ea.a.p(r9, r10)
            r3.createNewFile()     // Catch: java.io.IOException -> Lcb
            java.lang.String r9 = "KGVFRhBsUkYobydDGm4cZVt0O3IsOiA="
            java.lang.String r10 = "PlMnWJMg"
            ea.a.p(r9, r10)
        L5c:
            java.lang.String r9 = "KWldZT9yWG0ZbyR0EG4cVUdpVCCjluLk6baOiM_libqpiKHl858="
            java.lang.String r10 = "kPkbRkT2"
            ea.a.p(r9, r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            c(r7, r8, r9)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> Lb1
            r9.flush()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> Lb1
            java.lang.String r7 = "KWldZT9yWG0ZbyR0EG4cVUdpVCCtv_Hl7Z6hmtLm_6-ploHlwrrRlt3k8bYg"
            java.lang.String r8 = "fBGzvFVg"
            ea.a.p(r7, r8)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> Lb1
            r3.getPath()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> Lb1
            java.lang.String r7 = "Gk1U"
            java.lang.String r8 = "qACUsRVj"
            ea.a.p(r7, r8)
            java.lang.String r7 = "jGtSovfq"
            ea.a.p(r1, r7)
            r9.flush()     // Catch: java.io.IOException -> L8b
            r9.close()     // Catch: java.io.IOException -> L8b
            goto L8f
        L8b:
            r7 = move-exception
            r7.printStackTrace()
        L8f:
            return r3
        L90:
            r7 = move-exception
            goto L96
        L92:
            r7 = move-exception
            goto Lb3
        L94:
            r7 = move-exception
            r9 = r2
        L96:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r7 = "ChRmLBSH"
            ea.a.p(r0, r7)
            java.lang.String r7 = "IM4nB0xH"
            ea.a.p(r1, r7)
            if (r9 == 0) goto Lb0
            r9.flush()     // Catch: java.io.IOException -> Lac
            r9.close()     // Catch: java.io.IOException -> Lac
            goto Lb0
        Lac:
            r7 = move-exception
            r7.printStackTrace()
        Lb0:
            return r2
        Lb1:
            r7 = move-exception
            r2 = r9
        Lb3:
            java.lang.String r8 = "klxp1D0H"
            ea.a.p(r0, r8)
            java.lang.String r8 = "aCFZBroX"
            ea.a.p(r1, r8)
            if (r2 == 0) goto Lca
            r2.flush()     // Catch: java.io.IOException -> Lc6
            r2.close()     // Catch: java.io.IOException -> Lc6
            goto Lca
        Lc6:
            r8 = move-exception
            r8.printStackTrace()
        Lca:
            throw r7
        Lcb:
            r7 = move-exception
            r7.printStackTrace()
        Lcf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.v.d(android.app.Activity, java.io.InputStream, java.lang.String, java.io.File):java.io.File");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118 A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #3 {IOException -> 0x0114, blocks: (B:51:0x0110, B:55:0x0118), top: B:102:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d A[Catch: IOException -> 0x0199, TRY_LEAVE, TryCatch #0 {IOException -> 0x0199, blocks: (B:89:0x0195, B:93:0x019d), top: B:100:0x0195 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File e(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.io.File r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.v.e(android.content.Context, android.net.Uri, java.lang.String, java.io.File):java.io.File");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5 A[Catch: IOException -> 0x00b1, TRY_LEAVE, TryCatch #4 {IOException -> 0x00b1, blocks: (B:43:0x00ad, B:47:0x00b5), top: B:58:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File f(android.content.Context r5, android.net.Uri r6, java.lang.String r7, java.io.File r8) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            java.io.File r2 = new java.io.File
            r2.<init>(r8, r7)
            boolean r7 = r2.exists()
            if (r7 == 0) goto L10
            return r2
        L10:
            r7 = 0
            r2.createNewFile()     // Catch: java.io.IOException -> Lbd
            java.lang.String r8 = "KGVFRhBsUkYobydDGm4cZVt0O3IsOiA="
            java.lang.String r3 = "TN3VRO2X"
            ea.a.p(r8, r3)
            java.lang.String r8 = "KWldZT9yWG0ZbyR0EG4cVUdpVCCjluLk_baMiPXl3bqpiKHl858="
            java.lang.String r3 = "yyBRFinf"
            ea.a.p(r8, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            z(r5, r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            android.content.ContentResolver r3 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            java.io.InputStream r6 = r3.openInputStream(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            if (r6 == 0) goto L3b
            c(r5, r6, r8)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            goto L3b
        L39:
            r5 = move-exception
            goto L89
        L3b:
            r8.flush()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            r5.<init>()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            java.lang.String r3 = "dWknZSZ0C2wBIFdvGXkFdDZlU20SbxBlCWYPaQtlBzoTYzllEnQHIBxlQyAPaTplaCBRbyhzNm0AID1pCmUVPSA="
            java.lang.String r4 = "eIg5Ocbn"
            java.lang.String r3 = ea.a.p(r3, r4)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            r5.append(r3)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            long r3 = r3 - r0
            r5.append(r3)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            java.lang.String r0 = "H3QubQNGC2wXIAkg"
            java.lang.String r1 = "p7yHfB01"
            java.lang.String r0 = ea.a.p(r0, r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            r5.append(r0)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            r5.append(r0)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r5)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La9
            r8.close()     // Catch: java.io.IOException -> L78
            if (r6 == 0) goto L7c
            r6.close()     // Catch: java.io.IOException -> L78
            goto L7c
        L78:
            r5 = move-exception
            r5.printStackTrace()
        L7c:
            return r2
        L7d:
            r5 = move-exception
            r6 = r7
            goto Laa
        L80:
            r5 = move-exception
            r6 = r7
            goto L89
        L83:
            r5 = move-exception
            r6 = r7
            goto Lab
        L86:
            r5 = move-exception
            r6 = r7
            r8 = r6
        L89:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "UGkmZStyWG0Lbwh0UW4jVUpp"
            java.lang.String r1 = "fr6Jm7p1"
            java.lang.String r0 = ea.a.p(r0, r1)     // Catch: java.lang.Throwable -> La9
            pdf.pdfreader.viewer.editor.free.utils.t1.c(r0, r5)     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L9f
            r8.close()     // Catch: java.io.IOException -> L9d
            goto L9f
        L9d:
            r5 = move-exception
            goto La5
        L9f:
            if (r6 == 0) goto La8
            r6.close()     // Catch: java.io.IOException -> L9d
            goto La8
        La5:
            r5.printStackTrace()
        La8:
            return r7
        La9:
            r5 = move-exception
        Laa:
            r7 = r8
        Lab:
            if (r7 == 0) goto Lb3
            r7.close()     // Catch: java.io.IOException -> Lb1
            goto Lb3
        Lb1:
            r6 = move-exception
            goto Lb9
        Lb3:
            if (r6 == 0) goto Lbc
            r6.close()     // Catch: java.io.IOException -> Lb1
            goto Lbc
        Lb9:
            r6.printStackTrace()
        Lbc:
            throw r5
        Lbd:
            r5 = move-exception
            r5.printStackTrace()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.v.f(android.content.Context, android.net.Uri, java.lang.String, java.io.File):java.io.File");
    }

    public static File g(HashSet hashSet, String str, long j10) {
        if (hashSet.size() > 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                if (str.equals(file.getName()) && file.length() == j10) {
                    ea.a.p("Hi1mdBtpEGRSYVJ0DHIFYyVuEmYvbCZNC3QSaFogMmFHaD0=", "jqvBiS4E");
                    file.getAbsolutePath();
                    return file;
                }
            }
            return null;
        }
        return null;
    }

    public static String h() {
        return ea.a.p("Lw==", "nNeaH9VJ") + f28784e;
    }

    public static String i(Context context) {
        File l10 = l(context, Environment.DIRECTORY_PICTURES);
        if (l10 == null) {
            l10 = context.getFilesDir();
        }
        if (l10 != null && !l10.exists()) {
            l10.mkdir();
        }
        return l10.getAbsolutePath();
    }

    public static String j(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        return i(applicationContext) + File.separator + A(str) + ea.a.p("HWMqYw==", "4Y6y0frd");
    }

    public static File k(Context context) {
        File l10 = l(context, Environment.DIRECTORY_DOCUMENTS);
        if (l10 == null) {
            l10 = context.getFilesDir();
        }
        if (l10 != null && !l10.exists()) {
            l10.mkdirs();
        }
        return l10;
    }

    public static File l(Context context, String str) {
        String str2;
        File externalFilesDir;
        if (str == null) {
            str2 = ea.a.p("BnU0bB9leQ==", "NIhXTs9C");
        } else {
            str2 = str;
        }
        ConcurrentHashMap<String, File> concurrentHashMap = f28781a;
        File file = concurrentHashMap.get(str2);
        if (file == null && context != null && (externalFilesDir = context.getExternalFilesDir(str)) != null) {
            concurrentHashMap.put(str2, externalFilesDir);
            return externalFilesDir;
        }
        return file;
    }

    public static File m(Context context, Uri uri, Intent intent, boolean z10) {
        try {
            return n(context, uri, intent, z10);
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
            t1.c(ea.a.p("VGU_RhpsB0YAb1lDBm4iZSp0Z3Jp", "TSYI3T9l"), e10);
            return null;
        } catch (SecurityException e11) {
            e11.printStackTrace();
            t1.c(ea.a.p("VGU_RhpsB0YAb1lDBm4iZSp0Z3Jp", "SAyFYQps"), e11);
            return null;
        } catch (Exception e12) {
            e12.printStackTrace();
            t1.c(ea.a.p("KGVFRhBsUkYobydDGm4cZVt0O3Jp", "IkLLflYV"), e12);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0466  */
    /* JADX WARN: Type inference failed for: r12v14, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File n(android.content.Context r20, android.net.Uri r21, android.content.Intent r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.v.n(android.content.Context, android.net.Uri, android.content.Intent, boolean):java.io.File");
    }

    public static long o(String str) {
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        String j11 = j(ReaderPdfApplication.m(), str);
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            j10 = file.length() + file.lastModified();
        }
        if (!TextUtils.isEmpty(j11)) {
            return j10 + new File(j11).lastModified();
        }
        return j10;
    }

    public static String p(String str) {
        int lastIndexOf;
        if (str != null && str.length() > 0 && (lastIndexOf = str.lastIndexOf(47)) > -1 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String q(android.content.Context r12, android.net.Uri r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.v.q(android.content.Context, android.net.Uri, android.content.Intent):java.lang.String");
    }

    public static String r(String str) {
        int lastIndexOf;
        if (str != null && str.length() > 0 && (lastIndexOf = str.lastIndexOf(46)) > -1 && lastIndexOf < str.length()) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static String s(Context context, Uri uri) {
        Cursor cursor;
        Exception e10;
        String str;
        boolean z10;
        String str2 = n1.f28731a;
        String str3 = null;
        str3 = null;
        str3 = null;
        str3 = null;
        str3 = null;
        r0 = null;
        Cursor cursor2 = null;
        str3 = null;
        if (uri != null) {
            String scheme = uri.getScheme();
            String str4 = n1.f28731a;
            if (scheme == null) {
                str3 = Uri.decode(uri.getPath());
                o9.d.s(str4, ea.a.p("VGU_UhZhDkYbbFFQCHQ-OjdjWmUrZWM9fiBbdTRsUWRSdCogTiA=", "C5XqLlqM") + str3);
            } else if (ea.a.p("KWldZQ==", "Afbx21gp").equals(scheme)) {
                o9.d.s(str4, ea.a.p("VGU_UhZhDkYbbFFQCHQ-OmRTcUgDTQZfdkk7RQ==", "0wbeWiZZ"));
                str3 = Uri.decode(uri.getPath());
            } else if (ea.a.p("KG9cdCJudA==", "9wK2GMfn").equals(scheme)) {
                o9.d.s(str4, ea.a.p("A2U9UgJhAkYhbANQVXQ_OhhTEUgMTXNfN08_VBROVA==", "b8dIgn71"));
                try {
                    try {
                        cursor = context.getContentResolver().query(uri, null, null, null, null);
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(ea.a.p("UHU5cxxyWCA=", "aY8hvh3w"));
                            if (cursor != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            sb2.append(z10);
                            o9.d.s(str4, sb2.toString());
                            if (cursor != null && cursor.moveToFirst()) {
                                int columnIndex = cursor.getColumnIndex(ea.a.p("C2QQdGE=", "FrTqemYM"));
                                ea.a.p("Jm5VZQFEVnQ7IGcg", "6QR3mbt3");
                                ea.a.p("by0g", "jtQgnZuh");
                                if (columnIndex > -1) {
                                    str3 = Uri.decode(cursor.getString(columnIndex));
                                    o9.d.s(str4, ea.a.p("CGUFRFl0LkMnbBNtWlA2dFA6cl8NQWJBVG4QbTQgOg==", "hMoq8OlD") + str3);
                                }
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (Exception e11) {
                            e10 = e11;
                            String str5 = str3;
                            cursor2 = cursor;
                            str = str5;
                            e10.printStackTrace();
                            o9.d.s(str4, e10.getMessage());
                            dp.a.a().getClass();
                            dp.a.d(context, e10);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            str3 = str;
                            if (!TextUtils.isEmpty(str3)) {
                                str3 = "";
                            }
                            t1.b(ea.a.p("dWknZSZ0C2wBZ1F0L2k6ZRRhRmgAcixtPXITOhBmIGxWUCp0aA==", "hz0I5U9B") + str3);
                            return str3;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursor2;
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    str = null;
                }
                if (!TextUtils.isEmpty(str3) && str3.startsWith(ea.a.p("UG8ldBZudA==", "B7p0wUPa"))) {
                    str3 = "";
                }
            }
        }
        t1.b(ea.a.p("dWknZSZ0C2wBZ1F0L2k6ZRRhRmgAcixtPXITOhBmIGxWUCp0aA==", "hz0I5U9B") + str3);
        return str3;
    }

    public static String t(Context context, long j10) {
        Locale locale;
        LocaleList locales;
        if (j10 <= 0) {
            return ea.a.p("MA==", "G2v1TEyA");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        double d10 = j10;
        int log10 = (int) (Math.log10(d10) / Math.log10(1024.0d));
        StringBuilder sb2 = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat(ea.a.p("bCwSI0kuIw==", "jteFbru4"), DecimalFormatSymbols.getInstance(locale));
        double pow = Math.pow(1024.0d, log10);
        Double.isNaN(d10);
        sb2.append(decimalFormat.format(d10 / pow));
        sb2.append(" ");
        sb2.append(new String[]{ea.a.p("Qg==", "7fXu9KWE"), ea.a.p("EkI=", "psYej8h7"), ea.a.p("fkI=", "cqQGpcta"), ea.a.p("CEI=", "JZrpBCzX")}[log10]);
        return sb2.toString();
    }

    public static Uri u(Context context, File file) {
        try {
            return FileProvider.getUriForFile(context, f28782b, file);
        } catch (Exception e10) {
            e10.printStackTrace();
            t1.b(ea.a.p("KGVFRhBsUlUoaXAg", "4rk418MA") + e10.getMessage());
            return null;
        }
    }

    public static File v(Activity activity, Uri uri, Intent intent) {
        try {
            return J(activity, uri, intent);
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
            dp.a.a().getClass();
            dp.a.b(activity, ea.a.p("WmwnZRRhDlMGYUBlLHg1ZTR0W28oMz0=", "Alwt00OR") + e10.getMessage());
            t1.c(ea.a.p("VGU_RhpsB0YAb1lDBm4iZSp0Z3IvMw==", "FiB53agi"), e10);
            return null;
        } catch (SecurityException e11) {
            e11.printStackTrace();
            dp.a.a().getClass();
            dp.a.b(activity, ea.a.p("PGVSdQtpQ3kfeCllBXQBb1szPQ==", "U6tGbMVA") + e11.getMessage());
            t1.c(ea.a.p("VGU_RhpsB0YAb1lDBm4iZSp0Z3IvMw==", "KRdLSgRU"), e11);
            return null;
        }
    }

    public static float w(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            f10 += (float) ((ul.b) it.next()).f30406d;
        }
        return new BigDecimal(((((((f10 / 1024.0f) / 1024.0f) * 0.85f) * 0.85f) * 100) / 100.0f) + f28783d).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    public static String[] x() {
        return new String[]{ea.a.p("UnA7bBpjA3Qbb1ovGWRm", "6c7g0FRa"), ea.a.p("UnA7bBpjA3Qbb1ovBHMhbzZk", "rmzSq8wN"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlhzQ3cqcmQ=", "wpFI2ROZ"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlpwC249bQlmFXIoYTdzaW8pZlhjHGRYYy9tL24BLh9vR2QecipjAHMJaStnLmxqZCBjRG0cbnQ=", "te4zzECD"), ea.a.p("UnA7bBpjA3Qbb1ovH24yLilzH3cpcicuUW8qdQllVnQdbSpjAW8HbhNiWGUNLmcy", "5Id85ktz"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlhzQ3cqcgEuRmVecB5hFmVhbVBjC29SbjtiJmURLlky", "fAIP23rb"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlpwC249bQlmJHIrYTtzR28pZlhjHGRYYy9tL24BLh9vR2QecipjAHM4aShnImxEdCptQWwYdGU=", "mrTOKFOj"), ea.a.p("UnA7bBpjA3Qbb1ovH24yLilzH2U-YyZs", "ghX56mDk"), ea.a.p("VXAUbABjD3QhbwgvTC0yeFtlbA==", "CC4dinj7"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlhzQ2U9YwBsXHMnZTV0Sm0uY0NvHG5WYjZlLi5EMg==", "uGKhrOPd"), ea.a.p("KHA8bDljOHQhbwgvQm4zLldwN24xbVpmG3IcYSVzb28vZiVjNWQ2Yz1tA25ALiRwSmUzZDpoU2UAbR0uImgnZXQ=", "HiILPYQk"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlpwC249bQlmA3IJYSVzTm8pZlhjHGRYYy9tL24BLhhyUHMLbjFhEWkDbglsf3ARZTxlX3QYdF5vbg==", "RAhrldQc"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlhzQ2U9YwBsRGFQZAduf20uY0NvHG5WYjZlLi5EMg==", "Tfenj4nQ"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlhzQ2U9YwBsSnQsbTJsKnQqLlxhGnJYZTRhKGwQZEYxMg==", "LPtZdIBK"), ea.a.p("UnA7bBpjA3Qbb1ovH24yLitwV24-bS9mBnIbYTZzHW9VZiJjFmQNYwdtUW4dLiVwNmVTZDVoJmUdbRouNmVdcF9hP2U=", "ivB0HTw6"), ea.a.p("UnA7bBpjA3Qbb1ovH24yLilzH3ApdyZyIG8bbnQ=", "PrR0Ts6z"), ea.a.p("G3BEbChjNnQhbwgvQm4zLldwN24xbVpmG3IcYSVzb28cZl1jJGQ4Yz1tA25ALidyXXM3bj1hQmkbbhxsf3QnbQpsVXRl", "mOz4AWP9"), ea.a.p("G3BJbB5jUnQhbwgvQm4zLlVzf3Amd1NyBG8YbiUuMnIfc1xuA2FHaSduSG1VYyVvXW4zYiVlUi5FMg==", "EKz9w3X1"), ea.a.p("LnBBbBBjVnQzbyQvA24MLlpwC249bQlmPnJVYTVzZm8pZlhjHGRYYy9tL24BLhhyUHMLbjFhEWk-blVsb3MnaStlQmgWdw==", "pQJxQ8AK"), ea.a.p("V3AhbFBjCHQhbwgvQm4zLlVzf3Amd1NyBG8YbiUuMWxfZDRzUW8eLiVhBXJbZTlhWmw3ZGcxMg==", "3i6Q9iEh"), ea.a.p("O2VJdFZjRHY=", "WtUKhcf2"), ea.a.p("O2VJdFZjWG03YWdzEHAJclR0C2RodgRsA2Vz", "UKkTvxsx")};
    }

    public static String y(File file) {
        if (file == null) {
            return "";
        }
        if (com.google.android.play.core.assetpacks.b1.N(file)) {
            return ea.a.p("Y0RG", "Bocvaj8m");
        }
        if (com.google.android.play.core.assetpacks.b1.Q(file)) {
            return ea.a.p("ZE8ZRA==", "M51EOnT7");
        }
        if (com.google.android.play.core.assetpacks.b1.M(file)) {
            return ea.a.p("ClhyRUw=", "RUizIhor");
        }
        if (!com.google.android.play.core.assetpacks.b1.O(file)) {
            return "";
        }
        return ea.a.p("H1BU", "Nk8VxbcE");
    }

    public static void z(Context context, Uri uri) {
        try {
            context.grantUriPermission(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpOm8zLhFyE2U=", "QgdsNAwv"), uri, 1);
        } catch (Throwable th2) {
            th2.printStackTrace();
            t1.b(ea.a.p("dWknZSZ0C2wBIFNyCG4iVTZpYmU0bSpzJGk8bkxwXXJeaThzGm8MIBdyRm8bIGsg", "WSl87VZh") + th2);
        }
    }
}
