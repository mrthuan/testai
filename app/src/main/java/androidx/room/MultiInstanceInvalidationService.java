package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.HashMap;
import w1.d;
import w1.e;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public int f4617a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Integer, String> f4618b = new HashMap<>();
    public final a c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final b f4619d = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<d> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(d dVar, Object obj) {
            MultiInstanceInvalidationService.this.f4618b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
        }

        public final void K(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.c) {
                String str = MultiInstanceInvalidationService.this.f4618b.get(Integer.valueOf(i10));
                if (str == null) {
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.c.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.c.getBroadcastCookie(i11)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f4618b.get(Integer.valueOf(intValue));
                    if (i10 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.c.getBroadcastItem(i11).o(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                MultiInstanceInvalidationService.this.c.finishBroadcast();
            }
        }

        public final int L0(d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f4617a + 1;
                multiInstanceInvalidationService.f4617a = i10;
                if (multiInstanceInvalidationService.c.register(dVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f4618b.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4617a--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f4619d;
    }
}
