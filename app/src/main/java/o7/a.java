package o7;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class a implements CustomEventInterstitialListener {

    /* renamed from: a  reason: collision with root package name */
    public final Object f22743a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f22744b;
    public final Object c;

    public a(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f22744b = customEventAdapter;
        this.f22743a = customEventAdapter2;
        this.c = mediationInterstitialListener;
    }

    public final int a(int i10, String str) {
        if (((AtomicBoolean) this.c).get()) {
            return -100;
        }
        Object obj = this.f22744b;
        Integer num = (Integer) ((Map) obj).get(str);
        if (num == null) {
            ih.a aVar = new ih.a();
            aVar.f18491a = i10;
            aVar.f18492b = str;
            Object obj2 = this.f22743a;
            int size = ((List) obj2).size();
            ((List) obj2).add(aVar);
            ((Map) obj).put(str, Integer.valueOf(size));
            return size;
        }
        return num.intValue();
    }

    public final ih.a b(int i10) {
        if (i10 >= 0) {
            Object obj = this.f22743a;
            if (i10 < ((List) obj).size()) {
                return (ih.a) ((List) obj).get(i10);
            }
            return null;
        }
        return null;
    }

    public a() {
        this.c = new AtomicBoolean(false);
        this.f22743a = new ArrayList();
        this.f22744b = new HashMap();
    }
}
