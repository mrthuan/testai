package pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import c4.d;
import java.security.MessageDigest;
import kotlin.jvm.internal.g;
import w3.c;

/* compiled from: BlurTransformation.kt */
/* loaded from: classes3.dex */
public final class a extends d {
    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        g.e(messageDigest, "messageDigest");
        byte[] bytes = ea.a.p("LWxEciZ0RWE0cyxvB20JdFxvbg==", "XkRDZ3ol").getBytes(kotlin.text.a.f19966b);
        g.d(bytes, ea.a.p("AWggc1FhGSAiYRBhGmw2bl8uAXQ7aVhnXS4WZSVCO3QQc2FjGWEYcy10KQ==", "gMuIqjUV"));
        messageDigest.update(bytes);
    }

    @Override // c4.d
    public final Bitmap c(c pool, Bitmap toTransform, int i10, int i11) {
        g.e(pool, "pool");
        g.e(toTransform, "toTransform");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(toTransform, toTransform.getWidth() / 4, toTransform.getHeight() / 4, false);
        g.d(createScaledBitmap, ea.a.p("UHIuYQdlMWMTbFFkK2kibSVwGnQuaTAssIDEaGYvFTQfICNlGmcKdFIvFDRFIDBhKHNXKQ==", "RbF5gPED"));
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        g.d(createBitmap, ea.a.p("LHJUYQ1ldWkubStwXXMLYVllCkIsdAhhRCk=", "B8bv4ugl"));
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setMaskFilter(new BlurMaskFilter(25, BlurMaskFilter.Blur.NORMAL));
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }
}
