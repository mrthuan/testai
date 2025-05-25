package lib.zj.pdfeditor;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AllPageInk.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, ArrayList<ij.a>> f21462a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, ArrayList<ij.a>> f21463b = new ConcurrentHashMap<>();

    public static synchronized void a() {
        synchronized (a.class) {
            f21462a.clear();
        }
    }
}
