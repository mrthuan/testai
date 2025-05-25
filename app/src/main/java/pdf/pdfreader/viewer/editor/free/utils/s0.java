package pdf.pdfreader.viewer.editor.free.utils;

import android.graphics.BitmapFactory;
import android.util.Size;
import java.io.File;

/* compiled from: PicUtil.kt */
/* loaded from: classes3.dex */
public final class s0 {
    public static Size a(String str) {
        try {
            if (new File(str).exists()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                char c = 0;
                options.inJustDecodeBounds = false;
                Size size = new Size(options.outWidth, options.outHeight);
                int i10 = new j1.a(str).i(0, ea.a.p("AHJYZRd0VnQzb24=", "YxApZwbT"));
                if (i10 != 3) {
                    if (i10 != 5 && i10 != 6 && i10 != 7) {
                        if (i10 == 8) {
                            c = 270;
                        }
                    } else {
                        c = 'Z';
                    }
                } else {
                    c = 180;
                }
                if (c != 0 && c != 180) {
                    return new Size(size.getHeight(), size.getWidth());
                }
                return size;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return new Size(512, 512);
    }
}
