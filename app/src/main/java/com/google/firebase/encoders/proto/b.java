package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import wa.d;
import wa.e;
import za.c;
import za.f;

/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f13573f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final wa.b f13574g;

    /* renamed from: h  reason: collision with root package name */
    public static final wa.b f13575h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f13576i;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f13577a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, wa.c<?>> f13578b;
    public final Map<Class<?>, e<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final wa.c<Object> f13579d;

    /* renamed from: e  reason: collision with root package name */
    public final f f13580e = new f(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13581a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f13581a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13581a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13581a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(Protobuf.class, aVar);
        f13574g = new wa.b("key", androidx.appcompat.view.menu.d.f(hashMap));
        com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Protobuf.class, aVar2);
        f13575h = new wa.b("value", androidx.appcompat.view.menu.d.f(hashMap2));
        f13576i = new c();
    }

    public b(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, wa.c cVar) {
        this.f13577a = byteArrayOutputStream;
        this.f13578b = map;
        this.c = map2;
        this.f13579d = cVar;
    }

    public static int i(wa.b bVar) {
        Protobuf protobuf = (Protobuf) ((Annotation) bVar.f31070b.get(Protobuf.class));
        if (protobuf != null) {
            return ((com.google.firebase.encoders.proto.a) protobuf).f13572b;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // wa.d
    public final d a(wa.b bVar, boolean z10) {
        e(bVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // wa.d
    public final d b(wa.b bVar, long j10) {
        g(bVar, j10, true);
        return this;
    }

    @Override // wa.d
    public final d c(wa.b bVar, int i10) {
        e(bVar, i10, true);
        return this;
    }

    public final b d(wa.b bVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            j((i(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f13573f);
            j(bytes.length);
            this.f13577a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                d(bVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                h(f13576i, bVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                j((i(bVar) << 3) | 1);
                this.f13577a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                j((i(bVar) << 3) | 5);
                this.f13577a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            g(bVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            e(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            j((i(bVar) << 3) | 2);
            j(bArr.length);
            this.f13577a.write(bArr);
            return this;
        } else {
            wa.c<?> cVar = this.f13578b.get(obj.getClass());
            if (cVar != null) {
                h(cVar, bVar, obj, z10);
                return this;
            }
            e<?> eVar = this.c.get(obj.getClass());
            if (eVar != null) {
                f fVar = this.f13580e;
                fVar.f32329a = false;
                fVar.c = bVar;
                fVar.f32330b = z10;
                eVar.a(obj, fVar);
                return this;
            } else if (obj instanceof za.b) {
                e(bVar, ((za.b) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                e(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                h(this.f13579d, bVar, obj, z10);
                return this;
            }
        }
    }

    public final void e(wa.b bVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) bVar.f31070b.get(Protobuf.class));
        if (protobuf != null) {
            com.google.firebase.encoders.proto.a aVar = (com.google.firebase.encoders.proto.a) protobuf;
            int i11 = a.f13581a[aVar.c.ordinal()];
            int i12 = aVar.f13572b;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        j((i12 << 3) | 5);
                        this.f13577a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    return;
                }
                j(i12 << 3);
                j((i10 << 1) ^ (i10 >> 31));
                return;
            }
            j(i12 << 3);
            j(i10);
            return;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // wa.d
    public final d f(wa.b bVar, Object obj) {
        d(bVar, obj, true);
        return this;
    }

    public final void g(wa.b bVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) bVar.f31070b.get(Protobuf.class));
        if (protobuf != null) {
            com.google.firebase.encoders.proto.a aVar = (com.google.firebase.encoders.proto.a) protobuf;
            int i10 = a.f13581a[aVar.c.ordinal()];
            int i11 = aVar.f13572b;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        j((i11 << 3) | 1);
                        this.f13577a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
                        return;
                    }
                    return;
                }
                j(i11 << 3);
                k((j10 >> 63) ^ (j10 << 1));
                return;
            }
            j(i11 << 3);
            k(j10);
            return;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void h(wa.c cVar, wa.b bVar, Object obj, boolean z10) {
        za.a aVar = new za.a();
        try {
            OutputStream outputStream = this.f13577a;
            this.f13577a = aVar;
            cVar.a(obj, this);
            this.f13577a = outputStream;
            long j10 = aVar.f32325a;
            aVar.close();
            if (z10 && j10 == 0) {
                return;
            }
            j((i(bVar) << 3) | 2);
            k(j10);
            cVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void j(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f13577a.write((i10 & ShapeTypes.VERTICAL_SCROLL) | 128);
            i10 >>>= 7;
        }
        this.f13577a.write(i10 & ShapeTypes.VERTICAL_SCROLL);
    }

    public final void k(long j10) {
        while (((-128) & j10) != 0) {
            this.f13577a.write((((int) j10) & ShapeTypes.VERTICAL_SCROLL) | 128);
            j10 >>>= 7;
        }
        this.f13577a.write(((int) j10) & ShapeTypes.VERTICAL_SCROLL);
    }
}
