package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: StateSet.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f17364a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a> f17365b = new SparseArray<>();

    /* compiled from: StateSet.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f17366a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<b> f17367b = new ArrayList<>();
        public final int c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f17366a = obtainStyledAttributes.getResourceId(index, this.f17366a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                    this.c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: StateSet.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f17368a;

        /* renamed from: b  reason: collision with root package name */
        public final float f17369b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f17370d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17371e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f17368a = Float.NaN;
            this.f17369b = Float.NaN;
            this.c = Float.NaN;
            this.f17370d = Float.NaN;
            this.f17371e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.E);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f17371e);
                    this.f17371e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f17370d = obtainStyledAttributes.getDimension(index, this.f17370d);
                } else if (index == 2) {
                    this.f17369b = obtainStyledAttributes.getDimension(index, this.f17369b);
                } else if (index == 3) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.f17368a = obtainStyledAttributes.getDimension(index, this.f17368a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f17368a;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f17369b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.c;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            float f15 = this.f17370d;
            if (!Float.isNaN(f15) && f11 > f15) {
                return false;
            }
            return true;
        }
    }

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f17364a = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.B);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f17364a = obtainStyledAttributes.getResourceId(index, this.f17364a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (true) {
                boolean z10 = true;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlResourceParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        z10 = true;
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        z10 = false;
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        z10 = true;
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                default:
                                    z10 = true;
                                    break;
                            }
                            if (!z10) {
                                if (z10) {
                                    b bVar = new b(context, xmlResourceParser);
                                    if (aVar != null) {
                                        aVar.f17367b.add(bVar);
                                    }
                                }
                            } else {
                                a aVar2 = new a(context, xmlResourceParser);
                                this.f17365b.put(aVar2.f17366a, aVar2);
                                aVar = aVar2;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final int a(int i10) {
        ArrayList<b> arrayList;
        int i11;
        a aVar;
        ArrayList<b> arrayList2;
        float f10 = -1;
        SparseArray<a> sparseArray = this.f17365b;
        int i12 = 0;
        if (-1 == i10) {
            if (i10 == -1) {
                aVar = sparseArray.valueAt(0);
            } else {
                aVar = sparseArray.get(-1);
            }
            if (aVar == null) {
                return -1;
            }
            while (true) {
                arrayList2 = aVar.f17367b;
                if (i12 < arrayList2.size()) {
                    if (arrayList2.get(i12).a(f10, f10)) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (-1 == i12) {
                return -1;
            }
            if (i12 == -1) {
                i11 = aVar.c;
            } else {
                i11 = arrayList2.get(i12).f17371e;
            }
        } else {
            a aVar2 = sparseArray.get(i10);
            if (aVar2 == null) {
                return -1;
            }
            while (true) {
                arrayList = aVar2.f17367b;
                if (i12 < arrayList.size()) {
                    if (arrayList.get(i12).a(f10, f10)) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 == -1) {
                i11 = aVar2.c;
            } else {
                i11 = arrayList.get(i12).f17371e;
            }
        }
        return i11;
    }
}
