package lib.zj.office.fc.openxml4j.opc.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class FileHelper {
    public static void copyFile(File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = new FileOutputStream(file2).getChannel();
        channel.transferTo(0L, channel.size(), channel2);
        channel.close();
        channel2.close();
    }

    public static File getDirectory(File file) {
        if (file != null) {
            String path = file.getPath();
            int length = path.length();
            do {
                length--;
                if (length < 0) {
                    return null;
                }
            } while (path.charAt(length) != File.separatorChar);
            return new File(path.substring(0, length));
        }
        return null;
    }

    public static String getFilename(File file) {
        if (file != null) {
            String path = file.getPath();
            int length = path.length();
            int i10 = length;
            do {
                i10--;
                if (i10 < 0) {
                    return "";
                }
            } while (path.charAt(i10) != File.separatorChar);
            return path.substring(i10 + 1, length);
        }
        return "";
    }
}
