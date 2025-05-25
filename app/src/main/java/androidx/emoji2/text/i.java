package androidx.emoji2.text;

import androidx.emoji2.text.g;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
public final class i extends g.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.h f3635a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f3636b;

    public i(g.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f3635a = hVar;
        this.f3636b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.g.h
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f3636b;
        try {
            this.f3635a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.g.h
    public final void b(o oVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f3636b;
        try {
            this.f3635a.b(oVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
