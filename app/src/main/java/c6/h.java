package c6;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/* compiled from: FileDownloadTask.kt */
/* loaded from: classes.dex */
public final class h extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final String f5613a;

    /* renamed from: b  reason: collision with root package name */
    public final File f5614b;
    public final a c;

    /* compiled from: FileDownloadTask.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(File file);
    }

    public h(String uriStr, File file, a aVar) {
        kotlin.jvm.internal.g.e(uriStr, "uriStr");
        this.f5613a = uriStr;
        this.f5614b = file;
        this.c = aVar;
    }

    public final Boolean a(String... args) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            if (k6.a.b(this)) {
                return null;
            }
            kotlin.jvm.internal.g.e(args, "args");
            try {
                URL url = new URL(this.f5613a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f5614b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            if (k6.a.b(this)) {
                return null;
            }
            return a(strArr);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (k6.a.b(this)) {
                return;
            }
            boolean booleanValue = bool.booleanValue();
            if (!k6.a.b(this) && !k6.a.b(this) && booleanValue) {
                this.c.a(this.f5614b);
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
