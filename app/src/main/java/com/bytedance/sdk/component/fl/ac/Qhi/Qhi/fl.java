package com.bytedance.sdk.component.fl.ac.Qhi.Qhi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: Util.java */
/* loaded from: classes.dex */
final class fl {
    static final Charset Qhi = Charset.forName(CharEncoding.US_ASCII);
    static final Charset cJ = Charset.forName("UTF-8");

    public static void Qhi(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    Qhi(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
    }
}
