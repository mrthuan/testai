package ge;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import ge.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import lib.zj.office.fc.hpsf.Constants;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BitmapUtils.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17764a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f17765b;
    public final /* synthetic */ Activity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d.a f17766d;

    /* compiled from: BitmapUtils.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f17767a;

        public a(Bitmap bitmap) {
            this.f17767a = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.a aVar = b.this.f17766d;
            if (aVar != null) {
                aVar.a(this.f17767a);
            }
        }
    }

    /* compiled from: BitmapUtils.java */
    /* renamed from: ge.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0234b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f17769a;

        public RunnableC0234b(Bitmap bitmap) {
            this.f17769a = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.a aVar = b.this.f17766d;
            if (aVar != null) {
                aVar.a(this.f17769a);
            }
        }
    }

    public b(Activity activity, d.a aVar, String str, boolean z10) {
        this.f17764a = str;
        this.f17765b = z10;
        this.c = activity;
        this.f17766d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f17764a;
        d.a aVar = this.f17766d;
        Activity activity = this.c;
        InputStream inputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(Constants.CP_MAC_ROMAN);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            boolean z10 = this.f17765b;
            if (responseCode == 200) {
                inputStream = httpURLConnection.getInputStream();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (decodeStream != null && !decodeStream.isRecycled() && decodeStream.getWidth() != 0 && decodeStream.getHeight() != 0) {
                    if (z10) {
                        float dimension = activity.getResources().getDimension(R.dimen.ad_native_banner_icon_size) / decodeStream.getWidth();
                        Bitmap d10 = d.d(decodeStream, dimension, dimension);
                        if (d10 != null && !d10.isRecycled()) {
                            activity.runOnUiThread(new a(d10));
                        } else {
                            d.a(activity, aVar);
                        }
                    } else {
                        if (decodeStream.getHeight() / decodeStream.getWidth() > 0.8f) {
                            fe.a.a().b("Bitmap height / weight > 0.8f, do crop");
                            decodeStream = d.c(decodeStream);
                        }
                        if (decodeStream != null && !decodeStream.isRecycled()) {
                            activity.runOnUiThread(new RunnableC0234b(decodeStream));
                        } else {
                            d.a(activity, aVar);
                        }
                    }
                } else {
                    d.a(activity, aVar);
                }
            } else if (responseCode == 302) {
                String headerField = httpURLConnection.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField) && !headerField.equals(str)) {
                    d.b(activity, aVar, headerField, z10);
                } else {
                    d.a(activity, aVar);
                }
            } else {
                d.a(activity, aVar);
            }
            httpURLConnection.disconnect();
            if (inputStream == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                d.a(activity, aVar);
                if (inputStream == null) {
                    return;
                }
            } catch (Throwable th3) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th3;
            }
        }
        try {
            inputStream.close();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}
