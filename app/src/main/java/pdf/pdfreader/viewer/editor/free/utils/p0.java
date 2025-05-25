package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PdfParseUtil.java */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28743a = ea.a.p("MmQFUDtyCmUddA9s", "LGbcZyP7");

    static {
        String str = Environment.DIRECTORY_MUSIC;
        String str2 = Environment.DIRECTORY_PODCASTS;
        String str3 = Environment.DIRECTORY_RINGTONES;
        String str4 = Environment.DIRECTORY_ALARMS;
        String str5 = Environment.DIRECTORY_NOTIFICATIONS;
        String str6 = Environment.DIRECTORY_PICTURES;
        String str7 = Environment.DIRECTORY_MOVIES;
        String str8 = Environment.DIRECTORY_DOWNLOADS;
        String str9 = Environment.DIRECTORY_DCIM;
        String str10 = Environment.DIRECTORY_DOCUMENTS;
        ea.a.p("cnUvaRxiDW8Zcw==", "sSbme0yX");
    }

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
        sb2.append(v.C(ea.a.p("G2hEbRtuVmls", "XXW1ZmB3")));
        sb2.append(File.separator);
        sb2.append(v.A(str));
        sb2.append(ea.a.p("HWMqYw==", "wu28ajse"));
        return sb2.toString();
    }

    public static void b(Context context, String str, Bitmap bitmap, int i10) {
        if (bitmap == null) {
            return;
        }
        try {
            File file = new File(a(str + String.valueOf(i10)));
            if (file.exists() && file.length() > 0) {
                ea.a.p("QGE9ZTFpFm0TcGBvL2k6ZX4g14jm6dqki47M5qSHoLu2", "nS2DnyyH");
                file.getAbsolutePath();
                String str2 = n0.f28727a;
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            ea.a.p("QGE9ZTFpFm0TcGBvL2k6ZX4g", "qtNhjSYH");
            file.getAbsolutePath();
            String str3 = n0.f28727a;
        } catch (Exception e10) {
            e10.printStackTrace();
            dp.a.a().getClass();
            dp.a.d(context, e10);
        }
    }
}
