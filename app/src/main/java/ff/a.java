package ff;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import gf.b;
import gf.j;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.AccessibilityBridge;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: AccessibilityChannel.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f17271a;

    /* renamed from: b  reason: collision with root package name */
    public b f17272b;

    /* compiled from: AccessibilityChannel.java */
    /* renamed from: ff.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0220a implements b.c<Object> {
        public C0220a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // gf.b.c
        public final void n(Object obj, gf.a aVar) {
            char c;
            Integer num;
            a aVar2 = a.this;
            if (aVar2.f17272b == null) {
                aVar.i(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            str.getClass();
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3 && (num = (Integer) hashMap.get("nodeId")) != null) {
                            AccessibilityBridge.this.g(num.intValue(), 2);
                        }
                    } else {
                        Integer num2 = (Integer) hashMap.get("nodeId");
                        if (num2 != null) {
                            AccessibilityBridge.this.g(num2.intValue(), 1);
                        }
                    }
                } else {
                    String str2 = (String) hashMap2.get(PglCryptUtils.KEY_MESSAGE);
                    if (str2 != null) {
                        AccessibilityBridge.this.f18834a.announceForAccessibility(str2);
                    }
                }
            } else {
                String str3 = (String) hashMap2.get(PglCryptUtils.KEY_MESSAGE);
                if (str3 != null) {
                    AccessibilityBridge.a aVar3 = (AccessibilityBridge.a) aVar2.f17272b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        aVar3.getClass();
                    } else {
                        AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                        AccessibilityEvent d10 = accessibilityBridge.d(0, 32);
                        d10.getText().add(str3);
                        accessibilityBridge.h(d10);
                    }
                }
            }
            aVar.i(null);
        }
    }

    /* compiled from: AccessibilityChannel.java */
    /* loaded from: classes.dex */
    public interface b extends FlutterJNI.a {
    }

    public a(we.a aVar, FlutterJNI flutterJNI) {
        new gf.b(aVar, "flutter/accessibility", j.f17801a, null).b(new C0220a());
        this.f17271a = flutterJNI;
    }

    public final void a(int i10, AccessibilityBridge.Action action) {
        this.f17271a.dispatchSemanticsAction(i10, action);
    }

    public final void b(int i10, AccessibilityBridge.Action action, Serializable serializable) {
        this.f17271a.dispatchSemanticsAction(i10, action, serializable);
    }
}
