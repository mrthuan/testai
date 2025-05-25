package gk;

import gk.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
/* loaded from: classes3.dex */
public final class e extends h {
    public final Method c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f17905d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f17906e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f17907f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f17908g;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f17909a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17910b;
        public String c;

        public a(ArrayList arrayList) {
            this.f17909a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) {
            boolean z10;
            kotlin.jvm.internal.g.e(proxy, "proxy");
            kotlin.jvm.internal.g.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (kotlin.jvm.internal.g.a(name, "supports") && kotlin.jvm.internal.g.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (kotlin.jvm.internal.g.a(name, "unsupported") && kotlin.jvm.internal.g.a(Void.TYPE, returnType)) {
                this.f17910b = true;
                return null;
            }
            boolean a10 = kotlin.jvm.internal.g.a(name, "protocols");
            List<String> list = this.f17909a;
            if (a10) {
                if (objArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return list;
                }
            }
            if ((kotlin.jvm.internal.g.a(name, "selectProtocol") || kotlin.jvm.internal.g.a(name, "select")) && kotlin.jvm.internal.g.a(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj != null) {
                        List list2 = (List) obj;
                        int size = list2.size();
                        if (size >= 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                Object obj2 = list2.get(i10);
                                if (obj2 != null) {
                                    String str = (String) obj2;
                                    if (list.contains(str)) {
                                        this.c = str;
                                        return str;
                                    } else if (i10 == size) {
                                        break;
                                    } else {
                                        i10 = i11;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = list.get(0);
                        this.c = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((kotlin.jvm.internal.g.a(name, "protocolSelected") || kotlin.jvm.internal.g.a(name, "selected")) && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    this.c = (String) obj3;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.f17905d = method2;
        this.f17906e = method3;
        this.f17907f = cls;
        this.f17908g = cls2;
    }

    @Override // gk.h
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f17906e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // gk.h
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f17907f, this.f17908g}, new a(h.a.a(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // gk.h
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f17905d.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z10 = aVar.f17910b;
                if (!z10 && aVar.c == null) {
                    h.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                    return null;
                } else if (z10) {
                    return null;
                } else {
                    return aVar.c;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
