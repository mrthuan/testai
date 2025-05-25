package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.zzfv;
import i1.a;
import i1.g;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xi.a2;
import xi.b2;
import xi.c2;
import xi.e2;
import xi.f1;
import xi.g1;
import xi.h1;
import xi.i1;
import xi.j1;
import xi.k1;
import xi.l1;
import xi.m1;
import xi.n1;
import xi.o1;
import xi.p1;
import xi.q1;
import xi.r1;
import xi.s1;
import xi.t1;
import xi.u1;
import xi.v1;
import xi.w1;
import xi.x1;
import xi.y1;
import xi.z1;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class i implements t3.g, zzo, p9.c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2600a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2601b;

    public i(zzfv zzfvVar, String str) {
        this.f2601b = zzfvVar;
        this.f2600a = str;
    }

    public static i b(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException unused) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused2) {
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new i(fileChannel, fileLock);
        } catch (IOException | Error | OverlappingFileLockException unused3) {
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused4) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused5) {
                }
            }
            return null;
        }
    }

    @Override // t3.g
    public final EncodeStrategy a(t3.e eVar) {
        return ((t3.g) this.f2601b).a(eVar);
    }

    public final void c(wi.e eVar) {
        System.out.println("addTag==========");
        int i10 = eVar.f32156a;
        if (i10 != -1) {
            ((Map) this.f2600a).put(new Integer(i10), eVar);
        } else {
            this.f2601b = eVar;
        }
    }

    @Override // t3.a
    public final boolean d(Object obj, File file, t3.e eVar) {
        return ((t3.g) this.f2601b).d(new c4.c(((BitmapDrawable) ((v3.l) obj).get()).getBitmap(), (w3.c) this.f2600a), file, eVar);
    }

    public final KeyListener e(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((i1.a) this.f2601b).f18407a.getClass();
            if (!(keyListener instanceof i1.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new i1.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f2600a).getContext().obtainStyledAttributes(attributeSet, k.a.f19437j, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            i(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final InputConnection g(InputConnection inputConnection, EditorInfo editorInfo) {
        i1.a aVar = (i1.a) this.f2601b;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0247a c0247a = aVar.f18407a;
        c0247a.getClass();
        if (!(inputConnection instanceof i1.c)) {
            return new i1.c(c0247a.f18408a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void h() {
        try {
            ((FileLock) this.f2601b).release();
            ((FileChannel) this.f2600a).close();
        } catch (IOException unused) {
        }
    }

    public final void i(boolean z10) {
        i1.g gVar = ((i1.a) this.f2601b).f18407a.f18409b;
        if (gVar.f18426d != z10) {
            if (gVar.c != null) {
                androidx.emoji2.text.g a10 = androidx.emoji2.text.g.a();
                g.a aVar = gVar.c;
                a10.getClass();
                pdf.pdfreader.viewer.editor.free.utils.t0.v(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f3619a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f3620b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f18426d = z10;
            if (z10) {
                i1.g.a(gVar.f18424a, androidx.emoji2.text.g.a().b());
            }
        }
    }

    @Override // p9.c
    public final Object zza() {
        Context context = (Context) ((o9.h) ((p9.c) this.f2600a)).f22768a.f17514a;
        if (context != null) {
            return new o9.m(context, (o9.n) ((p9.c) this.f2601b).zza());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f2600a = obj;
        this.f2601b = obj2;
    }

    public i() {
        this.f2600a = new AtomicInteger();
        this.f2601b = new AtomicInteger();
    }

    public i(int i10) {
        this.f2601b = new yi.f(-1, new int[0]);
        this.f2600a = new HashMap();
        c(new xi.z0());
        c(new xi.w());
        c(new k1());
        c(new xi.b1());
        c(new m1());
        c(new h1());
        c(new f1());
        c(new xi.x(2));
        c(new b2());
        c(new xi.q0(2));
        c(new a2());
        c(new xi.x(1));
        c(new xi.y(0));
        c(new y1());
        c(new u1(1));
        c(new t1(1));
        c(new v1());
        c(new z1());
        c(new w1(1));
        c(new t1(2));
        c(new u1(2));
        c(new xi.v0(1));
        c(new xi.q0(1));
        c(new xi.v0(0));
        c(new xi.a0(1));
        c(new x1());
        c(new xi.a0(0));
        c(new xi.p0(0));
        c(new q1());
        c(new r1());
        c(new xi.a(1));
        c(new o1(0));
        c(new c2());
        c(new xi.u0());
        c(new t1(0));
        c(new xi.u(0));
        c(new xi.s());
        c(new xi.v(0));
        c(new xi.j());
        c(new xi.z());
        c(new xi.x(0));
        c(new p1());
        c(new xi.k(0));
        c(new xi.k(1));
        c(new xi.x0());
        c(new u1(0));
        c(new n1());
        c(new xi.y(1));
        c(new xi.c0());
        c(new xi.q0(0));
        c(new xi.l());
        c(new xi.d1());
        c(new o1(1));
        c(new xi.v(1));
        c(new xi.n());
        c(new xi.r(1));
        c(new xi.r(0));
        c(new xi.i0(0));
        c(new xi.p0(1));
        c(new xi.i0(1));
        c(new xi.j0());
        c(new xi.r(2));
        c(new s1());
        c(new xi.a(0));
        c(new xi.k0());
        c(new xi.f0());
        c(new xi.o());
        c(new e2());
        c(new xi.u(1));
        c(new xi.g0());
        c(new xi.h0());
        c(new xi.y0());
        c(new i1());
        c(new j1());
        c(new xi.a1());
        c(new l1());
        c(new g1());
        c(new xi.e1());
        c(new xi.c1());
        c(new xi.t());
        c(new xi.b0());
        c(new w1(0));
        c(new xi.i());
        c(new xi.m0());
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) ((zzfv) this.f2601b).f11753d.getOrDefault((String) this.f2600a, null);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }

    public i(EditText editText) {
        this.f2600a = editText;
        this.f2601b = new i1.a(editText);
    }
}
