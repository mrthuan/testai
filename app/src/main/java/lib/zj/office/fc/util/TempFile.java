package lib.zj.office.fc.util;

import a0.a;
import java.io.File;
import java.util.Random;

/* loaded from: classes3.dex */
public final class TempFile {
    private static File dir;
    private static final Random rnd = new Random();

    public static File createTempFile(String str, String str2) {
        if (dir == null) {
            File file = new File(System.getProperty("java.io.tmpdir"), "poifiles");
            dir = file;
            file.mkdir();
            if (System.getProperty("poi.keep.tmp.files") == null) {
                dir.deleteOnExit();
            }
        }
        File file2 = dir;
        StringBuilder k10 = a.k(str);
        k10.append(rnd.nextInt());
        k10.append(str2);
        File file3 = new File(file2, k10.toString());
        if (System.getProperty("poi.keep.tmp.files") == null) {
            file3.deleteOnExit();
        }
        return file3;
    }
}
