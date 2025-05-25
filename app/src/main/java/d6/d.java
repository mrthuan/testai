package d6;

import android.text.TextUtils;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16121a = new d();

    public static final File a() {
        if (k6.a.b(d.class)) {
            return null;
        }
        try {
            File file = new File(com.facebook.d.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
            return null;
        }
    }

    public final String b(String str) {
        int i10;
        boolean z10;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            g.e(str, "str");
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (g.f(str.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            String join = TextUtils.join(" ", (String[]) new Regex("\\s+").split(str.subSequence(i11, length + 1).toString(), 0).toArray(new String[0]));
            g.d(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final int[] c(String texts) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            g.e(texts, "texts");
            int[] iArr = new int[128];
            String b10 = b(texts);
            Charset forName = Charset.forName("UTF-8");
            g.d(forName, "forName(\"UTF-8\")");
            byte[] bytes = b10.getBytes(forName);
            g.d(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i10 = 0; i10 < 128; i10++) {
                if (i10 < bytes.length) {
                    iArr[i10] = bytes[i10] & 255;
                } else {
                    iArr[i10] = 0;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
