package r3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f29465a = Charset.forName(CharEncoding.US_ASCII);

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
