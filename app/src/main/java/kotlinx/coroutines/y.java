package kotlinx.coroutines;

import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.zas;
import kotlin.Result;

/* compiled from: DebugStrings.kt */
/* loaded from: classes.dex */
public final class y implements RewardItem, zas, com.google.android.play.core.assetpacks.c0, q9.l {

    /* renamed from: a  reason: collision with root package name */
    public static y f20275a;

    public y() {
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(kotlin.coroutines.c cVar) {
        String m13constructorimpl;
        if (cVar instanceof kotlinx.coroutines.internal.f) {
            return cVar.toString();
        }
        try {
            m13constructorimpl = Result.m13constructorimpl(cVar + '@' + b(cVar));
        } catch (Throwable th2) {
            m13constructorimpl = Result.m13constructorimpl(androidx.activity.s.v(th2));
        }
        if (Result.m16exceptionOrNullimpl(m13constructorimpl) != null) {
            m13constructorimpl = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) m13constructorimpl;
    }

    @Override // com.google.android.play.core.assetpacks.c0
    public final int a(int i10, String str) {
        return i10;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return "";
    }

    public /* synthetic */ y(int i10) {
    }

    @Override // q9.m
    public final /* synthetic */ Object a() {
        return new com.google.android.play.core.assetpacks.p0();
    }
}
