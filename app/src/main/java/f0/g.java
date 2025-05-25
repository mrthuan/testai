package f0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends d>> f16875b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, ArrayList<d>> f16876a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        f16875b = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", h.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", f.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public g() {
    }

    public final void a(n nVar) {
        boolean z10;
        Integer valueOf = Integer.valueOf(nVar.c);
        HashMap<Integer, ArrayList<d>> hashMap = this.f16876a;
        ArrayList<d> arrayList = hashMap.get(valueOf);
        if (arrayList != null) {
            nVar.f16965w.addAll(arrayList);
        }
        ArrayList<d> arrayList2 = hashMap.get(-1);
        if (arrayList2 != null) {
            Iterator<d> it = arrayList2.iterator();
            while (it.hasNext()) {
                d next = it.next();
                String str = ((ConstraintLayout.b) nVar.f16945b.getLayoutParams()).Y;
                String str2 = next.c;
                if (str2 != null && str != null) {
                    z10 = str.matches(str2);
                } else {
                    z10 = false;
                }
                if (z10) {
                    nVar.a(next);
                }
            }
        }
    }

    public final void b(d dVar) {
        Integer valueOf = Integer.valueOf(dVar.f16837b);
        HashMap<Integer, ArrayList<d>> hashMap = this.f16876a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(dVar.f16837b), new ArrayList<>());
        }
        ArrayList<d> arrayList = hashMap.get(Integer.valueOf(dVar.f16837b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            d dVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends d>> hashMap3 = f16875b;
                    if (hashMap3.containsKey(name)) {
                        try {
                            Constructor<? extends d> constructor = hashMap3.get(name);
                            if (constructor != null) {
                                d newInstance = constructor.newInstance(new Object[0]);
                                try {
                                    newInstance.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(newInstance);
                                } catch (Exception unused) {
                                }
                                dVar = newInstance;
                                continue;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                                break;
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar != null && (hashMap2 = dVar.f16838d) != null) {
                            ConstraintAttribute.d(context, xmlResourceParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (hashMap = dVar.f16838d) != null) {
                        ConstraintAttribute.d(context, xmlResourceParser, hashMap);
                        continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
