package com.facebook.appevents.cloudbridge;

import androidx.activity.f;
import androidx.activity.r;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.LoggingBehavior;
import com.facebook.internal.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;

/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<Integer> f9495a = ea.a.u(200, 202);

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet<Integer> f9496b = ea.a.u(Integer.valueOf((int) PglCryptUtils.COMPRESS_FAILED), Integer.valueOf((int) PglCryptUtils.BASE64_FAILED), 429);
    public static a c;

    /* renamed from: d  reason: collision with root package name */
    public static List<Map<String, Object>> f9497d;

    /* renamed from: e  reason: collision with root package name */
    public static int f9498e;

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9499a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9500b;
        public final String c;

        public a(String str, String cloudBridgeURL, String str2) {
            g.e(cloudBridgeURL, "cloudBridgeURL");
            this.f9499a = str;
            this.f9500b = cloudBridgeURL;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (g.a(this.f9499a, aVar.f9499a) && g.a(this.f9500b, aVar.f9500b) && g.a(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + f.h(this.f9500b, this.f9499a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb2.append(this.f9499a);
            sb2.append(", cloudBridgeURL=");
            sb2.append(this.f9500b);
            sb2.append(", accessKey=");
            return r.f(sb2, this.c, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0675 A[Catch: IOException -> 0x06cc, UnknownHostException -> 0x06e1, TRY_LEAVE, TryCatch #8 {UnknownHostException -> 0x06e1, IOException -> 0x06cc, blocks: (B:237:0x05e7, B:239:0x0602, B:240:0x0608, B:242:0x060e, B:243:0x061e, B:245:0x0628, B:250:0x0638, B:252:0x0675, B:258:0x0690, B:265:0x0699, B:266:0x069c, B:267:0x069d), top: B:295:0x05e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.facebook.e r27) {
        /*
            Method dump skipped, instructions count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.cloudbridge.c.a(com.facebook.e):void");
    }

    public static final void b(String str, String url, String str2) {
        g.e(url, "url");
        j.a aVar = j.f9803d;
        j.a.b(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, url, str2);
        c = new a(str, url, str2);
        f9497d = new ArrayList();
    }

    public static List c() {
        List<Map<String, Object>> list = f9497d;
        if (list != null) {
            return list;
        }
        g.i("transformedEvents");
        throw null;
    }
}
