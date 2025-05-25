package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f17327a;

    /* renamed from: b  reason: collision with root package name */
    public int f17328b = -1;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<C0226a> f17329d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.a> f17330e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: g0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0226a {

        /* renamed from: a  reason: collision with root package name */
        public final int f17331a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<b> f17332b = new ArrayList<>();
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.constraintlayout.widget.a f17333d;

        public C0226a(Context context, XmlResourceParser xmlResourceParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f17331a = obtainStyledAttributes.getResourceId(index, this.f17331a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                    this.c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f17333d = aVar;
                        aVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f17334a;

        /* renamed from: b  reason: collision with root package name */
        public final float f17335b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f17336d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17337e;

        /* renamed from: f  reason: collision with root package name */
        public final androidx.constraintlayout.widget.a f17338f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f17334a = Float.NaN;
            this.f17335b = Float.NaN;
            this.c = Float.NaN;
            this.f17336d = Float.NaN;
            this.f17337e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.E);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f17337e);
                    this.f17337e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f17338f = aVar;
                        aVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f17336d = obtainStyledAttributes.getDimension(index, this.f17336d);
                } else if (index == 2) {
                    this.f17335b = obtainStyledAttributes.getDimension(index, this.f17335b);
                } else if (index == 3) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.f17334a = obtainStyledAttributes.getDimension(index, this.f17334a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f17334a;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f17335b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.c;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            float f15 = this.f17336d;
            if (!Float.isNaN(f15) && f11 > f15) {
                return false;
            }
            return true;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f17327a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            C0226a c0226a = null;
            while (true) {
                boolean z10 = true;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        z10 = true;
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        z10 = true;
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
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        z10 = false;
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
                                if (!z10) {
                                    if (!z10) {
                                        continue;
                                    } else {
                                        a(context, xml);
                                        continue;
                                    }
                                } else {
                                    b bVar = new b(context, xml);
                                    if (c0226a != null) {
                                        c0226a.f17332b.add(bVar);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                C0226a c0226a2 = new C0226a(context, xml);
                                this.f17329d.put(c0226a2.f17331a, c0226a2);
                                c0226a = c0226a2;
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
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

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        int i10;
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && FacebookMediationAdapter.KEY_ID.equals(attributeName)) {
                if (attributeValue.contains(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), FacebookMediationAdapter.KEY_ID, context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1 && attributeValue.length() > 1) {
                    i10 = Integer.parseInt(attributeValue.substring(1));
                }
                aVar.n(context, xmlResourceParser);
                this.f17330e.put(i10, aVar);
                return;
            }
        }
    }
}
