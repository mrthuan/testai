package com.pgl.ssdk;

import android.content.Context;
import java.net.HttpURLConnection;
import java.util.Locale;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: MyBaseRequest.java */
/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    private String f15759a;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f15761d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f15762e;

    /* renamed from: b  reason: collision with root package name */
    public String f15760b = "";

    /* renamed from: f  reason: collision with root package name */
    private int f15763f = -1;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f15764g = null;

    /* renamed from: h  reason: collision with root package name */
    private int f15765h = Constants.CP_MAC_ROMAN;

    /* renamed from: i  reason: collision with root package name */
    private int f15766i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f15767j = 0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15768k = false;

    /* renamed from: l  reason: collision with root package name */
    private HttpURLConnection f15769l = null;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f15770m = new a();

    /* compiled from: MyBaseRequest.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!G.this.a() && G.this.f15767j < G.this.f15766i) {
                G.c(G.this);
                Q b10 = M.a().b();
                if (b10 != null) {
                    b10.post(this);
                }
            }
        }
    }

    public G(Context context, String str) {
        this.f15759a = (str == null || str.length() <= 0) ? "" : "";
    }

    public static /* synthetic */ int c(G g10) {
        int i10 = g10.f15767j;
        g10.f15767j = i10 + 1;
        return i10;
    }

    public abstract boolean a(int i10, byte[] bArr);

    private void a(int i10) {
        String str = i10 != 1 ? i10 != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (str.length() > 0) {
            this.f15769l.addRequestProperty("Content-Type", str);
        }
        HttpURLConnection httpURLConnection = this.f15769l;
        httpURLConnection.addRequestProperty("Cookie", "sessionid=" + this.f15759a);
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                HttpURLConnection httpURLConnection2 = this.f15769l;
                httpURLConnection2.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            HttpURLConnection httpURLConnection3 = this.f15769l;
            httpURLConnection3.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
        r1.disconnect();
        r8.f15769l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.G.a():boolean");
    }

    public void a(int i10, int i11, byte[] bArr) {
        Q b10;
        this.c = i10;
        this.f15761d = i11;
        this.f15762e = bArr;
        Runnable runnable = this.f15770m;
        if (runnable == null || (b10 = M.a().b()) == null) {
            return;
        }
        b10.post(runnable);
    }
}
