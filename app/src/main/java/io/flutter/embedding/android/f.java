package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.android.gms.common.api.Api;
import io.flutter.plugin.editing.d;
import java.util.HashSet;

/* compiled from: KeyboardManager.java */
/* loaded from: classes.dex */
public final class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f18624a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<KeyEvent> f18625b = new HashSet<>();
    public final d c;

    /* compiled from: KeyboardManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18626a = 0;

        public final Character a(int i10) {
            boolean z10;
            char c = (char) i10;
            if ((Integer.MIN_VALUE & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int i12 = this.f18626a;
                if (i12 != 0) {
                    this.f18626a = KeyCharacterMap.getDeadChar(i12, i11);
                } else {
                    this.f18626a = i11;
                }
            } else {
                int i13 = this.f18626a;
                if (i13 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i13, i10);
                    if (deadChar > 0) {
                        c = (char) deadChar;
                    }
                    this.f18626a = 0;
                }
            }
            return Character.valueOf(c);
        }
    }

    /* compiled from: KeyboardManager.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f18627a;

        /* renamed from: b  reason: collision with root package name */
        public int f18628b;
        public boolean c = false;

        /* compiled from: KeyboardManager.java */
        /* loaded from: classes.dex */
        public class a implements c.a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f18630a = false;

            public a() {
            }

            public final void a(boolean z10) {
                f fVar;
                d dVar;
                if (!this.f18630a) {
                    this.f18630a = true;
                    b bVar = b.this;
                    int i10 = bVar.f18628b - 1;
                    bVar.f18628b = i10;
                    boolean z11 = z10 | bVar.c;
                    bVar.c = z11;
                    if (i10 == 0 && !z11 && (dVar = (fVar = f.this).c) != null) {
                        KeyEvent keyEvent = bVar.f18627a;
                        if (!dVar.g(keyEvent)) {
                            HashSet<KeyEvent> hashSet = fVar.f18625b;
                            hashSet.add(keyEvent);
                            dVar.e(keyEvent);
                            hashSet.remove(keyEvent);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        public b(KeyEvent keyEvent) {
            this.f18628b = f.this.f18624a.length;
            this.f18627a = keyEvent;
        }
    }

    /* compiled from: KeyboardManager.java */
    /* loaded from: classes.dex */
    public interface c {

        /* compiled from: KeyboardManager.java */
        /* loaded from: classes.dex */
        public interface a {
        }

        void a(KeyEvent keyEvent, b.a aVar);
    }

    /* compiled from: KeyboardManager.java */
    /* loaded from: classes.dex */
    public interface d {
        void e(KeyEvent keyEvent);

        boolean g(KeyEvent keyEvent);

        gf.c getBinaryMessenger();
    }

    public f(d dVar) {
        this.c = dVar;
        this.f18624a = new c[]{new e(dVar.getBinaryMessenger()), new io.flutter.embedding.android.b(new ff.c(dVar.getBinaryMessenger()))};
    }

    public final boolean a(KeyEvent keyEvent) {
        HashSet<KeyEvent> hashSet = this.f18625b;
        if (hashSet.remove(keyEvent)) {
            return false;
        }
        c[] cVarArr = this.f18624a;
        if (cVarArr.length > 0) {
            b bVar = new b(keyEvent);
            for (c cVar : cVarArr) {
                cVar.a(keyEvent, new b.a());
            }
            return true;
        }
        d dVar = this.c;
        if (dVar != null && !dVar.g(keyEvent)) {
            hashSet.add(keyEvent);
            dVar.e(keyEvent);
            hashSet.remove(keyEvent);
            return true;
        }
        return true;
    }
}
