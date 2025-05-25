package io.flutter.embedding.android;

import gf.c;
import io.flutter.embedding.android.KeyData;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.embedding.android.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* compiled from: KeyEmbedderResponder.java */
/* loaded from: classes.dex */
public final class e implements f.c {

    /* renamed from: a  reason: collision with root package name */
    public final gf.c f18620a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Long, Long> f18621b = new HashMap<>();
    public final HashMap<Long, KeyboardMap.c> c;

    /* renamed from: d  reason: collision with root package name */
    public final f.a f18622d;

    /* compiled from: KeyEmbedderResponder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18623a;

        static {
            int[] iArr = new int[KeyData.Type.values().length];
            f18623a = iArr;
            try {
                iArr[KeyData.Type.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18623a[KeyData.Type.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18623a[KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(gf.c cVar) {
        HashMap<Long, KeyboardMap.c> hashMap = new HashMap<>();
        this.c = hashMap;
        this.f18622d = new f.a();
        this.f18620a = cVar;
        HashMap<Long, Long> hashMap2 = KeyboardMap.f18601a;
        hashMap.put(4294967556L, new KeyboardMap.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0317 A[LOOP:6: B:149:0x0311->B:151:0x0317, LOOP_END] */
    @Override // io.flutter.embedding.android.f.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final android.view.KeyEvent r29, io.flutter.embedding.android.f.b.a r30) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.e.a(android.view.KeyEvent, io.flutter.embedding.android.f$b$a):void");
    }

    public final void b(KeyData keyData, final f.b.a aVar) {
        c.b bVar;
        int length;
        long j10;
        byte[] bArr = null;
        if (aVar == null) {
            bVar = null;
        } else {
            bVar = new c.b() { // from class: io.flutter.embedding.android.c
                @Override // gf.c.b
                public final void a(ByteBuffer byteBuffer) {
                    boolean z10;
                    Boolean bool = Boolean.FALSE;
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        if (byteBuffer.get() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bool = Boolean.valueOf(z10);
                    }
                    ((f.b.a) aVar).a(bool.booleanValue());
                }
            };
        }
        try {
            String str = keyData.f18599f;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            if (bArr == null) {
                length = 0;
            } else {
                length = bArr.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(keyData.f18595a);
            allocateDirect.putLong(keyData.f18596b.getValue());
            allocateDirect.putLong(keyData.c);
            allocateDirect.putLong(keyData.f18597d);
            if (keyData.f18598e) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            allocateDirect.putLong(j10);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f18620a.a("flutter/keydata", allocateDirect, bVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void c(boolean z10, Long l10, Long l11, long j10) {
        KeyData.Type type;
        KeyData keyData = new KeyData();
        keyData.f18595a = j10;
        if (z10) {
            type = KeyData.Type.kDown;
        } else {
            type = KeyData.Type.kUp;
        }
        keyData.f18596b = type;
        keyData.f18597d = l10.longValue();
        keyData.c = l11.longValue();
        keyData.f18599f = null;
        keyData.f18598e = true;
        if (l11.longValue() != 0 && l10.longValue() != 0) {
            if (!z10) {
                l10 = null;
            }
            d(l11, l10);
        }
        b(keyData, null);
    }

    public final void d(Long l10, Long l11) {
        HashMap<Long, Long> hashMap = this.f18621b;
        if (l11 != null) {
            if (hashMap.put(l10, l11) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (hashMap.remove(l10) != null) {
        } else {
            throw new AssertionError("The key was empty");
        }
    }
}
