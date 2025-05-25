package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.inmobi.media.e6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1611e6 {
    public static final boolean a(String tag, String data, String filePath) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(data, "data");
        kotlin.jvm.internal.g.e(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final void a(String filePath) {
        kotlin.jvm.internal.g.e(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
