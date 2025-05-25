package r7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import r7.b;
import r7.f;
import r7.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static volatile zzag f29476e;

    /* renamed from: g  reason: collision with root package name */
    public static Context f29478g;

    /* renamed from: a  reason: collision with root package name */
    public static final b f29473a = new b(f.K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b  reason: collision with root package name */
    public static final c f29474b = new c(f.K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    public static final d c = new d(f.K("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d  reason: collision with root package name */
    public static final e f29475d = new e(f.K("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f  reason: collision with root package name */
    public static final Object f29477f = new Object();

    public static synchronized void a(Context context) {
        synchronized (j.class) {
            if (f29478g == null) {
                if (context != null) {
                    f29478g = context.getApplicationContext();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.common.zze] */
    public static l b(final String str, final f fVar, final boolean z10, boolean z11) {
        try {
            c();
            Preconditions.j(f29478g);
            try {
                if (f29476e.c0(new zzs(str, fVar, z10, z11), new ObjectWrapper(f29478g.getPackageManager()))) {
                    return l.c;
                }
                return new k(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z12;
                        String str2;
                        MessageDigest messageDigest;
                        b bVar = j.f29473a;
                        boolean z13 = z10;
                        String str3 = str;
                        f fVar2 = fVar;
                        int i10 = 0;
                        if (!z13 && j.b(str3, fVar2, true, false).f29480a) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (true != z12) {
                            str2 = "not allowed";
                        } else {
                            str2 = "debug cert rejected";
                        }
                        Object[] objArr = new Object[5];
                        objArr[0] = str2;
                        objArr[1] = str3;
                        while (true) {
                            if (i10 < 2) {
                                try {
                                    messageDigest = MessageDigest.getInstance(Constants.SHA256);
                                } catch (NoSuchAlgorithmException unused) {
                                }
                                if (messageDigest != null) {
                                    break;
                                }
                                i10++;
                            } else {
                                messageDigest = null;
                                break;
                            }
                        }
                        Preconditions.j(messageDigest);
                        objArr[2] = Hex.a(messageDigest.digest(fVar2.L0()));
                        objArr[3] = Boolean.valueOf(z13);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e10) {
                return l.c("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            return l.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    public static void c() {
        zzag zzaeVar;
        if (f29476e != null) {
            return;
        }
        Preconditions.j(f29478g);
        synchronized (f29477f) {
            if (f29476e == null) {
                IBinder b10 = DynamiteModule.c(f29478g, DynamiteModule.f11411d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                int i10 = zzaf.f11289a;
                if (b10 == null) {
                    zzaeVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof zzag) {
                        zzaeVar = (zzag) queryLocalInterface;
                    } else {
                        zzaeVar = new zzae(b10);
                    }
                }
                f29476e = zzaeVar;
            }
        }
    }
