package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: DemoFileUtils.kt */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f28721a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f28722b;
    public static String c;

    static {
        ea.a.p("DWVUb25EFm0nIDZEci4nZGY=", "8fi9AsgK");
        ea.a.p("K2Vcb1ZEUm01IA5PNlhGZFpjeA==", "IdofJRsn");
        ea.a.p("V2Uib2lEMG0nIDZQYC4ncEx4", "HE3OFUAi");
        ea.a.p("V2Umb1xEB20dIGxMOlh4eChzeA==", "8nu95dCX");
        f28721a = new l();
        f28722b = new String[]{ea.a.p("V2Umb1xEB20dIGRELy4mZGY=", "Yr80hIU6"), ea.a.p("FmUXb2VEMG0nICJPd1h5ZFdjeA==", "HWrzJU4E"), ea.a.p("K2Vcb1ZEUm01IBpQIS4YcEF4", "RfX3Dbsv"), ea.a.p("V2Umb1xEB20dIGxMOlh4eChzeA==", "FHwsaoUs")};
        c = "";
    }

    public static void a(Context context, String str) {
        try {
            File b10 = b(context, str);
            if (b10 == null) {
                return;
            }
            InputStream open = context.getApplicationContext().getResources().getAssets().open(str);
            kotlin.jvm.internal.g.d(open, ea.a.p("JnQ=", "V8kWjblj"));
            ea.a.m(open, new FileOutputStream(b10), 8192);
            o9.d.l(open, null);
            if (b10.exists() && b10.length() > 0) {
                b10.getAbsolutePath();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final File b(Context context, String fileName) {
        final File file;
        String absolutePath;
        boolean z10;
        File parentFile;
        File[] listFiles;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(fileName, "fileName");
        try {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
            if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                absolutePath = context.getFilesDir().getAbsolutePath();
            }
            String str = File.separator;
            z10 = false;
            file = new File(absolutePath + str + "Demo" + str + kotlin.text.k.h0(fileName, new String[]{ea.a.p("Lw==", "B3Lh7Lv4")}, 0, 6).get(1));
            parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!file.exists()) {
            if (parentFile != null && (listFiles = parentFile.listFiles(new FilenameFilter() { // from class: pdf.pdfreader.viewer.editor.free.utils.k
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    String p10 = ea.a.p("aWYjbGU=", "o8MJHLOG");
                    File file3 = file;
                    kotlin.jvm.internal.g.e(file3, p10);
                    kotlin.jvm.internal.g.d(str2, ea.a.p("IWFcZQ==", "NBrjUgT2"));
                    return kotlin.text.j.F(str2, bg.b.A0(file3), false);
                }
            })) != null) {
                if (listFiles.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    return null;
                }
            }
            file.createNewFile();
            return file;
        }
        return file;
    }

    public static final boolean c(String filePath) {
        boolean z10;
        String absolutePath;
        kotlin.jvm.internal.g.e(filePath, "filePath");
        if (c.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Context m10 = ReaderPdfApplication.m();
            File externalFilesDir = m10.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
            if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                absolutePath = m10.getFilesDir().getAbsolutePath();
            }
            String absolutePath2 = new File(androidx.activity.f.m(absolutePath, File.separator, "Demo")).getAbsolutePath();
            kotlin.jvm.internal.g.d(absolutePath2, ea.a.p("VWknZV1hAHMdbEF0DFA3dGg=", "7Oryw90f"));
            c = absolutePath2;
        }
        return kotlin.text.j.M(filePath, c, false);
    }
}
