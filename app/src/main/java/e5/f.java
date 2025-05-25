package e5;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import h5.c;
import industries.deepthought.decode.Decoder;
import j5.a;
import java.io.File;
import java.io.InputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: UpdateInfoFetcher.kt */
@wf.c(c = "com.drojian.upgradelib.data.UpdateInfoFetcher$getUpdateInfoFromS3$2", f = "UpdateInfoFetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16462a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, kotlin.coroutines.c<? super f> cVar) {
        super(2, cVar);
        this.f16462a = context;
        this.f16463b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new f(this.f16462a, this.f16463b, cVar);
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((f) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String sb2;
        File file;
        File file2;
        c.a aVar;
        a.C0258a c0258a;
        long j10;
        Context context;
        String str;
        long j11;
        String str2;
        boolean z10;
        d F;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        s.u0(obj);
        if (c5.a.b().f5565d) {
            c5.a b10 = c5.a.b();
            b10.a();
            String str3 = b10.c.f5586h;
            kotlin.jvm.internal.g.d(str3, "getInstance().upgradeConfig.debugLocalS3InfoAssets");
            if (str3.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b.b bVar = b.b.f5170b;
                Context context2 = this.f16462a;
                c5.a b11 = c5.a.b();
                b11.a();
                String str4 = b11.c.f5586h;
                kotlin.jvm.internal.g.d(str4, "getInstance().upgradeConfig.debugLocalS3InfoAssets");
                synchronized (bVar) {
                    try {
                        InputStream open = context2.getAssets().open(str4);
                        kotlin.jvm.internal.g.d(open, "context.assets.open(assets)");
                        String str5 = new String(ea.a.w(open), kotlin.text.a.f19966b);
                        open.close();
                        F = b.b.F(str5);
                    } catch (Throwable th2) {
                        c5.a b12 = c5.a.b();
                        b12.a();
                        b12.c.f5583e.k("", th2);
                    }
                }
                return F;
            }
        }
        b.b bVar2 = b.b.f5170b;
        Context context3 = this.f16462a;
        String version = this.f16463b;
        kotlin.jvm.internal.g.e(context3, "context");
        kotlin.jvm.internal.g.e(version, "version");
        try {
            c5.a b13 = c5.a.b();
            b13.a();
            String str6 = b13.c.f5581b;
            kotlin.jvm.internal.g.d(str6, "getInstance().upgradeConfig.s3PerFix");
            String concat = str6.concat(version);
            StringBuilder sb3 = new StringBuilder();
            c5.a b14 = c5.a.b();
            b14.a();
            String str7 = b14.c.f5580a;
            kotlin.jvm.internal.g.d(str7, "getInstance().upgradeConfig.s3Url");
            sb3.append(str7);
            sb3.append(concat);
            sb2 = sb3.toString();
            file = new File(context3.getFilesDir(), "update");
            file2 = new File(file, concat);
            long currentTimeMillis = System.currentTimeMillis();
            aVar = h5.c.f18014h;
            h5.c a10 = aVar.a(context3);
            c0258a = j5.a.f19040b;
            j10 = currentTimeMillis - c0258a.a(a10.f18016a).f19041a.getLong("pl_lusct", 0L);
        } catch (Throwable th3) {
            c5.a b15 = c5.a.b();
            b15.a();
            b15.c.f5583e.k("", th3);
        }
        if (file2.exists() && file2.length() > 0) {
            if (c5.a.b().f5565d) {
                c5.a b16 = c5.a.b();
                b16.a();
                context = context3;
                j11 = b16.c.f5585g;
            } else {
                context = context3;
                j11 = 86400000;
            }
            if (j10 < j11) {
                String m02 = t0.m0(file2);
                if (Decoder.f18572a) {
                    str2 = Decoder.decodeStringServer(m02);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return b.b.F(str2);
                }
                return null;
            }
        } else {
            context = context3;
        }
        if (file.exists()) {
            b.b.q(file);
        } else {
            file.mkdirs();
        }
        bVar2.r(file2, sb2);
        if (file2.exists() && file2.length() > 0) {
            h5.c a11 = aVar.a(context);
            c0258a.a(a11.f18016a).f19041a.edit().putLong("pl_lusct", System.currentTimeMillis()).apply();
            String m03 = t0.m0(file2);
            if (Decoder.f18572a) {
                str = Decoder.decodeStringServer(m03);
            } else {
                str = null;
            }
            if (str != null) {
                return b.b.F(str);
            }
        }
        return null;
    }
}
