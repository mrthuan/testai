package aa;

import com.google.firebase.abt.AbtException;
import da.a;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final db.b<da.a> f473a;

    /* renamed from: b  reason: collision with root package name */
    public final String f474b = "frc";
    public Integer c = null;

    public b(db.b bVar) {
        this.f473a = bVar;
    }

    public static boolean a(ArrayList arrayList, a aVar) {
        String str = aVar.f468a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f468a.equals(str) && aVar2.f469b.equals(aVar.f469b)) {
                return true;
            }
        }
        return false;
    }

    public final List<a.b> b() {
        return this.f473a.get().g(this.f474b);
    }

    public final void c(ArrayList arrayList) {
        String str;
        String str2;
        d();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str3 = "";
            if (it.hasNext()) {
                Map map = (Map) it.next();
                String[] strArr = a.f466g;
                ArrayList arrayList3 = new ArrayList();
                String[] strArr2 = a.f466g;
                for (int i10 = 0; i10 < 5; i10++) {
                    String str4 = strArr2[i10];
                    if (!map.containsKey(str4)) {
                        arrayList3.add(str4);
                    }
                }
                if (arrayList3.isEmpty()) {
                    try {
                        Date parse = a.f467h.parse((String) map.get("experimentStartTime"));
                        long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                        long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                        String str5 = (String) map.get("experimentId");
                        String str6 = (String) map.get("variantId");
                        if (map.containsKey("triggerEvent")) {
                            str3 = (String) map.get("triggerEvent");
                        }
                        arrayList2.add(new a(str5, str6, str3, parse, parseLong, parseLong2));
                    } catch (NumberFormatException e10) {
                        throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
                    } catch (ParseException e11) {
                        throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
                    }
                } else {
                    throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                }
            } else {
                boolean isEmpty = arrayList2.isEmpty();
                db.b<da.a> bVar = this.f473a;
                if (isEmpty) {
                    d();
                    for (a.b bVar2 : b()) {
                        bVar.get().f(bVar2.f16168b);
                    }
                    return;
                }
                d();
                List<a.b> b10 = b();
                ArrayList arrayList4 = new ArrayList();
                for (Iterator<a.b> it2 = b10.iterator(); it2.hasNext(); it2 = it2) {
                    a.b next = it2.next();
                    String[] strArr3 = a.f466g;
                    String str7 = next.f16169d;
                    if (str7 == null) {
                        str2 = "";
                    } else {
                        str2 = str7;
                    }
                    arrayList4.add(new a(next.f16168b, String.valueOf(next.c), str2, new Date(next.f16178m), next.f16170e, next.f16175j));
                    bVar = bVar;
                }
                db.b<da.a> bVar3 = bVar;
                ArrayList<a.b> arrayList5 = new ArrayList();
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    str = this.f474b;
                    if (!hasNext) {
                        break;
                    }
                    a aVar = (a) it3.next();
                    if (!a(arrayList2, aVar)) {
                        arrayList5.add(aVar.a(str));
                    }
                }
                for (a.b bVar4 : arrayList5) {
                    bVar3.get().f(bVar4.f16168b);
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    a aVar2 = (a) it4.next();
                    if (!a(arrayList4, aVar2)) {
                        arrayList6.add(aVar2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.c == null) {
                    this.c = Integer.valueOf(bVar3.get().e(str));
                }
                int intValue = this.c.intValue();
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    a aVar3 = (a) it5.next();
                    while (arrayDeque.size() >= intValue) {
                        bVar3.get().f(((a.b) arrayDeque.pollFirst()).f16168b);
                    }
                    a.b a10 = aVar3.a(str);
                    bVar3.get().b(a10);
                    arrayDeque.offer(a10);
                }
                return;
            }
        }
    }

    public final void d() {
        if (this.f473a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }
}
