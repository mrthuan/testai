package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes.dex */
public class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final a reflectionAccessors = new a();
    private final SparseArray<b> flutterIdToOrigin = new SparseArray<>();
    private final Map<b, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f18899a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f18900b;
        public final Method c;

        /* renamed from: d  reason: collision with root package name */
        public final Method f18901d;

        /* renamed from: e  reason: collision with root package name */
        public final Field f18902e;

        /* renamed from: f  reason: collision with root package name */
        public final Method f18903f;

        public a() {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Field field;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                method2 = null;
            }
            if (Build.VERSION.SDK_INT <= 26) {
                try {
                    method4 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
                } catch (NoSuchMethodException unused3) {
                    method4 = null;
                }
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                } catch (NoSuchMethodException unused4) {
                    method3 = null;
                }
            } else {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    field = declaredField;
                    method3 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                    method3 = null;
                    method4 = null;
                }
                this.f18899a = method;
                this.f18900b = method6;
                this.c = method2;
                this.f18901d = method3;
                this.f18902e = field;
                this.f18903f = method5;
            }
            field = null;
            method6 = method4;
            method5 = null;
            this.f18899a = method;
            this.f18900b = method6;
            this.c = method2;
            this.f18901d = method3;
            this.f18902e = field;
            this.f18903f = method5;
        }

        public static Long a(a aVar, AccessibilityRecord accessibilityRecord) {
            Method method = aVar.c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        }

        public static boolean b(int i10, long j10) {
            if ((j10 & (1 << i10)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f18904a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18905b;

        public b(View view, int i10) {
            this.f18904a = view;
            this.f18905b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f18905b == bVar.f18905b && this.f18904a.equals(bVar.f18904a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f18904a.hashCode() + 31) * 31) + this.f18905b;
        }
    }

    public AccessibilityViewEmbedder(View view, int i10) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo r7, android.view.View r8, android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.getChildCount()
            if (r1 >= r2) goto L7c
            io.flutter.view.AccessibilityViewEmbedder$a r2 = r6.reflectionAccessors
            java.lang.reflect.Method r3 = r2.f18903f
            java.lang.reflect.Field r4 = r2.f18902e
            java.lang.reflect.Method r2 = r2.f18901d
            if (r2 != 0) goto L17
            if (r4 == 0) goto L44
            if (r3 != 0) goto L17
            goto L44
        L17:
            r5 = 1
            if (r2 == 0) goto L29
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L44
            r3[r0] = r4     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r2.invoke(r7, r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L44
            goto L45
        L29:
            java.lang.Object r2 = r4.get(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L44
            r4[r0] = r5     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L44
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L44
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L44
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L44
            goto L45
        L44:
            r2 = 0
        L45:
            if (r2 != 0) goto L48
            goto L79
        L48:
            long r2 = r2.longValue()
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            io.flutter.view.AccessibilityViewEmbedder$b r3 = new io.flutter.view.AccessibilityViewEmbedder$b
            r3.<init>(r8, r2)
            java.util.Map<io.flutter.view.AccessibilityViewEmbedder$b, java.lang.Integer> r4 = r6.originToFlutterId
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L6a
            java.util.Map<io.flutter.view.AccessibilityViewEmbedder$b, java.lang.Integer> r2 = r6.originToFlutterId
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L74
        L6a:
            int r3 = r6.nextFlutterId
            int r4 = r3 + 1
            r6.nextFlutterId = r4
            r6.cacheVirtualIdMappings(r8, r2, r3)
            r2 = r3
        L74:
            android.view.View r3 = r6.rootAccessibilityView
            r9.addChild(r3, r2)
        L79:
            int r1 = r1 + 1
            goto L2
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void cacheVirtualIdMappings(View view, int i10, int i11) {
        b bVar = new b(view, i10);
        this.originToFlutterId.put(bVar, Integer.valueOf(i11));
        this.flutterIdToOrigin.put(i11, bVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i10, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i10);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i10);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
        int drawingOrder;
        boolean isImportantForAccessibility;
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int i10 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (i10 >= 24) {
            drawingOrder = accessibilityNodeInfo.getDrawingOrder();
            accessibilityNodeInfo2.setDrawingOrder(drawingOrder);
            isImportantForAccessibility = accessibilityNodeInfo.isImportantForAccessibility();
            accessibilityNodeInfo2.setImportantForAccessibility(isImportantForAccessibility);
        }
        if (i10 >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo r7, android.view.View r8, android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            r6 = this;
            io.flutter.view.AccessibilityViewEmbedder$a r0 = r6.reflectionAccessors
            java.lang.reflect.Method r0 = r0.f18900b
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.invoke(r7, r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L18
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L18
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L18
            goto L67
        L18:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 0
            if (r0 >= r2) goto L21
            r7 = r3
            goto L67
        L21:
            android.view.accessibility.AccessibilityNodeInfo r7 = android.view.accessibility.AccessibilityNodeInfo.obtain(r7)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.setDataPosition(r1)
            r7.writeToParcel(r0, r1)
            r0.setDataPosition(r1)
            long r4 = r0.readLong()
            boolean r7 = io.flutter.view.AccessibilityViewEmbedder.a.b(r1, r4)
            if (r7 == 0) goto L3f
            r0.readInt()
        L3f:
            r7 = 1
            boolean r7 = io.flutter.view.AccessibilityViewEmbedder.a.b(r7, r4)
            if (r7 == 0) goto L49
            r0.readLong()
        L49:
            r7 = 2
            boolean r7 = io.flutter.view.AccessibilityViewEmbedder.a.b(r7, r4)
            if (r7 == 0) goto L53
            r0.readInt()
        L53:
            r7 = 3
            boolean r7 = io.flutter.view.AccessibilityViewEmbedder.a.b(r7, r4)
            if (r7 == 0) goto L63
            long r1 = r0.readLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            goto L64
        L63:
            r7 = r3
        L64:
            r0.recycle()
        L67:
            if (r7 != 0) goto L6a
            return
        L6a:
            long r0 = r7.longValue()
            r7 = 32
            long r0 = r0 >> r7
            int r7 = (int) r0
            java.util.Map<io.flutter.view.AccessibilityViewEmbedder$b, java.lang.Integer> r0 = r6.originToFlutterId
            io.flutter.view.AccessibilityViewEmbedder$b r1 = new io.flutter.view.AccessibilityViewEmbedder$b
            r1.<init>(r8, r7)
            java.lang.Object r7 = r0.get(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L8a
            android.view.View r8 = r6.rootAccessibilityView
            int r7 = r7.intValue()
            r9.setParent(r8, r7)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        b bVar = this.flutterIdToOrigin.get(i10);
        if (bVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = bVar.f18904a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(bVar.f18905b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i10, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a10 = a.a(this.reflectionAccessors, accessibilityRecord);
        if (a10 == null) {
            return null;
        }
        return this.originToFlutterId.get(new b(view, (int) (a10.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View r5, int r6, android.graphics.Rect r7) {
        /*
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.createAccessibilityNodeInfo()
            io.flutter.view.AccessibilityViewEmbedder$a r1 = r4.reflectionAccessors
            java.lang.reflect.Method r1 = r1.f18899a
            r2 = 0
            if (r1 != 0) goto Lc
            goto L16
        Lc:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.invoke(r0, r3)     // Catch: java.lang.Throwable -> L16
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L16
            goto L17
        L16:
            r1 = r2
        L17:
            if (r1 != 0) goto L1a
            return r2
        L1a:
            java.util.Map<android.view.View, android.graphics.Rect> r2 = r4.embeddedViewToDisplayBounds
            r2.put(r5, r7)
            long r1 = r1.longValue()
            r7 = 32
            long r1 = r1 >> r7
            int r7 = (int) r1
            r4.cacheVirtualIdMappings(r5, r7, r6)
            android.view.accessibility.AccessibilityNodeInfo r5 = r4.convertToFlutterNode(r0, r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.getRootNode(android.view.View, int, android.graphics.Rect):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean onAccessibilityHoverEvent(int i10, MotionEvent motionEvent) {
        b bVar = this.flutterIdToOrigin.get(i10);
        if (bVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = bVar.f18904a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i11] = pointerProperties;
            motionEvent.getPointerProperties(i11, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i11, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i11] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        b bVar = this.flutterIdToOrigin.get(i10);
        if (bVar == null || (accessibilityNodeProvider = bVar.f18904a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(bVar.f18905b, i11, bundle);
    }

    public View platformViewOfNode(int i10) {
        b bVar = this.flutterIdToOrigin.get(i10);
        if (bVar == null) {
            return null;
        }
        return bVar.f18904a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a10 = a.a(this.reflectionAccessors, accessibilityEvent);
        if (a10 == null) {
            return false;
        }
        int longValue = (int) (a10.longValue() >> 32);
        Integer num = this.originToFlutterId.get(new b(view, longValue));
        if (num == null) {
            int i10 = this.nextFlutterId;
            this.nextFlutterId = i10 + 1;
            num = Integer.valueOf(i10);
            cacheVirtualIdMappings(view, longValue, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i11 = 0; i11 < obtain.getRecordCount(); i11++) {
            AccessibilityRecord record = obtain.getRecord(i11);
            Long a11 = a.a(this.reflectionAccessors, record);
            if (a11 == null) {
                return false;
            }
            b bVar = new b(view, (int) (a11.longValue() >> 32));
            if (!this.originToFlutterId.containsKey(bVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(bVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
